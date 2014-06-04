package net.ages.workbench.templates.dsl.html;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

import net.ages.workbench.utils.AlwbConstants;
import net.ages.workbench.utils.AlwbGeneralUtils;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;

import net.ages.workbench.utils.AlwbLogger;

import org.apache.logging.log4j.Logger;

import net.ages.workbench.templates.dsl.html.FileNameParser;
import net.ages.workbench.templates.dsl.utils.ModelAccessor;

/**
 * The Website Class is the root of a hierarchical organization of generated files.  
 * <br>The Website instance, together with all its child instances contains the information needed to generate an index of the website.
 * <p>The services that have been generated are hierarchically categorized by year, month, day, version (the language(s), and filetype (HTML, ePub, PDF).
 * <p>Note that in the case of PDF, there is an index.html file that represents the PDF.  It contains metadata about the PDF and is a means to retrieve the PDF and return it to the requesting browser.
 * <p>The hierarchy is as follows:
 * <ol>
 * <li>Website - contains the collection of ServiceYear instances for that website.</li>
 * <li>ServiceYear - contains the collection of ServiceMonth instances for that year.</li>
 * <li>ServiceMonth - contains the collection of ServiceDay instances for that month</li>
 * <li>ServiceDay - contains the collection of ServiceDayType instances for that day.</li>
 * <li>ServiceDayType - contains the collection of ServiceDayTypeVersion instances for that service type on a specific day.</li>
 * <li>ServiceDayTypeVersion - contains the collection of ServiceDayTypeVersionFormat instances for that instance of ServiceDateTypeVersion.</li>
 * <li>ServiceDayTypeVersionFormat - contains the metadata for the html file it represents.  These are html files that represent or contain a specific format, e.g. html, ePub, PDF.</li>
 * </ol>
 * @author mac002
 *
 */
public class Website {
	private Logger logger = AlwbLogger.getLogger("Website");
	private String projectId;
	private String relativeSitePath;
	private IWorkspaceRoot theRoot;
	private IProject project;
	private IPath projectIpath;
	private String osPathToHtmlFolder;
	private SortedMap<String,ServiceYear> servicesForYears = new TreeMap<String,ServiceYear>();
	private TreeSet<ServiceDayTypeVersionFormat> bookFiles = new TreeSet<ServiceDayTypeVersionFormat>();
	private TreeSet<ServiceDayTypeVersionFormat> customFiles = new TreeSet<ServiceDayTypeVersionFormat>();
	
	
	private TreeMap<String,HtmlFile> serviceTreeMapOfFiles = new TreeMap<String,HtmlFile>();
	

	
	/**
	  * html
	  *   services
	  *     2013
	  *       11-03-sun-li.html
	  *       11-03-sun-ma.html
	  *       11-24-sun.li.html
	  *       
	  *       Should it be 2013/11/03/li/index.html ?
	  *       
	  *       www.ematins.org/dcs/2013/11/03/li
	  *       
	  *       Create HtmlFile class to represent the file itself
	  *          date
	  *          description (the text to be displayed)
	  *          path to file
	  *          toHtml()
	  *          toJson()
	  *          
	  *       Have a map where the key is a specific date and the value is a list containing HtmlFile instances
	  *       
	  *      Need something that maps service types to a display name
	  */
	 
	 /**
	  * 
	  * @param projectId - the Id for the Eclipse project containing the generated website
	  * @param relativeSitePath - the path to the site, relative to the overall project path 
	  * @param htmlFoldername - the name used for the html folder in the site
	  */
	 public Website(String projectId, String relativeSitePath, String htmlFoldername, ModelAccessor a) {
		 logger.entry();
		 try {
			 this.projectId = projectId;
			 this.relativeSitePath = relativeSitePath;
				theRoot = ResourcesPlugin.getWorkspace().getRoot();
				project = theRoot.getProject(projectId);
				projectIpath = project.getLocation();
				osPathToHtmlFolder = projectIpath.append(relativeSitePath).toOSString();
				categorizeHtmlFiles(getHtmlFiles(), a);
		 } catch (Exception e) {
			 logger.catching(e);
		 }
		 logger.exit();
	 }
	 
	 public SortedMap<String,ServiceYear> getServices() {
		 return servicesForYears;
	 }
	 
	 public TreeSet<ServiceDayTypeVersionFormat> getBookFiles() {
		 return bookFiles;
	 }
	 
	 public TreeSet<ServiceDayTypeVersionFormat> getCustomFiles() {
		 return customFiles;
	 }

	 /**
	  * Find all HTML files existing in the generated website
	  * @return 
	  */
	 public List<File> getHtmlFiles() {		 
			List<File> htmlFiles = AlwbGeneralUtils.getFilesInDirectory(osPathToHtmlFolder,AlwbConstants.HTML_EXTENSION);
		 return htmlFiles;
	 }

	 /**
	  * Iterates the list of files, and for each one determines
	  * whether it is date specific, and puts it into the appropriate
	  * list (i.e. service specific vs generic)
	  * @param files
	  */
	 public void categorizeHtmlFiles(List<File> files, ModelAccessor a) {
		 FileNameParser parser;
		 int genericCount = 0;
		 for (File f : files) {
			 try {
				parser = new FileNameParser(f,a);
				if (parser.isService) {
					String key = parser.year;
					ServiceYear sy = null;
					if (servicesForYears.containsKey(key)) {
						sy = servicesForYears.get(key);
						sy.add(f, parser);
						servicesForYears.put(key, sy);
					} else {
						sy = new ServiceYear(parser.year);
						sy.add(f, parser);
						servicesForYears.put(key, sy);				 
					}
				} else if (parser.isBook){
					if (parser.isIndexable) {
						bookFiles.add(new ServiceDayTypeVersionFormat(f,parser));
					}
				} else if (parser.isCustom) {
					if (parser.isIndexable) {
						customFiles.add(new ServiceDayTypeVersionFormat(f,parser));
					}
				}
			 } catch (Exception e) {
				 logger.catching(e);
			 }
		 }
		 logger.exit();
	 }
	 
		/**
		public String toHtmlAccordion() {
			StringBuffer sb = new StringBuffer();
			sb.append("<div class='ages-service-accordion' ng-controller='ServiceAccordionCtrl'>\n");
			sb.append("\t<accordion close-others='true'>");
			Set<Entry<String, ServiceDate>> s = servicesForYears.entrySet();
			Iterator<Map.Entry<String, ServiceDate>> it = s.iterator();
			while(it.hasNext()) {
				Map.Entry<String,ServiceDate> entry = it.next();
				String key = entry.getKey();
				ServiceDate value = entry.getValue();
				sb.append(value.toAccordionGroup());
			}
			sb.append("\n\t</accordion>");
			sb.append("\n</div>");
			
			return sb.toString();
		}
	  */
		
		public String toClassicEmatinsDcs() {
			StringBuffer sb = new StringBuffer();
			return sb.toString();
		}

		public String mapToString() {
			StringBuffer sb = new StringBuffer();
			Set<Entry<String, HtmlFile>> s = serviceTreeMapOfFiles.entrySet();
			Iterator<Entry<String, HtmlFile>> it = s.iterator();
			while(it.hasNext()) {
				Entry<String, HtmlFile> entry = it.next();
				String key = entry.getKey();
				HtmlFile value = entry.getValue();
				sb.append("\n");
//				sb.append("\tKey: "+ key + " Value: \n" + value.toString());
				sb.append("\tKey: "+ key);
			}
			return sb.toString();
		}

		/**
		@Override
		public String toString() {
			StringBuffer sb = new StringBuffer();
			Set<Entry<String, ServiceYear>> s = servicesForYears.entrySet();
			Iterator<Entry<String, ServiceYear>> it = s.iterator();
			while(it.hasNext()) {
				Entry<String, ServiceYear> entry = it.next();
				String key = entry.getKey();
				ServiceYear value = entry.getValue();
				sb.append("\n");
				sb.append("\tKey: "+ key + " Value: \n" + value.toString());
			}
			sb.append("\nBooks:");
			for (HtmlFile file : genericFiles) {
				sb.append("\n"+file.toString());
			}
			return sb.toString();
		}
**/
}
