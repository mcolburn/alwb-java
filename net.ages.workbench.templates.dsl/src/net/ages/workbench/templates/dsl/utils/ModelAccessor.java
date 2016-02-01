package net.ages.workbench.templates.dsl.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import net.ages.workbench.resources.dsl.ares.Definition;
import net.ages.workbench.templates.dsl.rubrics.engine.LiturgicalDayProperties;
import net.ages.workbench.utils.AlwbGeneralUtils;
import net.ages.workbench.utils.AlwbLogger;
import net.ages.workbench.utils.AlwbConstants;
import net.ages.workbench.utils.AlwbPlugInHelper;
import net.ages.workbench.templates.dsl.utils.MessageBoard;
import net.ages.workbench.templates.dsl.utils.TableManager;
import net.ages.workbench.templates.dsl.html.ServiceDayTypeVersionFormat;
import net.ages.workbench.templates.dsl.media.*;
import net.ages.workbench.templates.dsl.atem.AtemModel;
import net.ages.workbench.templates.dsl.atem.Driver;
import net.ages.workbench.templates.dsl.atem.TemplateStatuses;
import net.ages.workbench.templates.dsl.atem.Date.*;
import net.ages.workbench.templates.dsl.atem.Head;
import net.ages.workbench.templates.dsl.version.blocks.*;
import net.ages.workbench.templates.dsl.preferences.Preferences;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.MapMessage.MapFormat;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * ModelAccessor
 * 
 * Provides methods for working with an Xtext model.
 * 
 * These methods are intended to be called from within your Xtend generator when
 * a change occurs to a model file in the user's runtime workspace. In other
 * words, the methods probably won't return the correct values if you run this
 * in your development workspace. You have to launch the runtime.
 * <p>Within this module, a "language" means the combination of a language + country + domain.
 * For example, en_US_ematins means English as spoken in the US with the version built for ematins.
 * <p>There are four versions that the user can specify in the preferences:
 * <ul>
 * <li>Version 1 Preferred for Liturgical Text: the version we will try first when reading keys.</li>
 * <li>Version 1 Default for Liturgical Text: the version we will try if the preferred version lookup fails.</li>
 * <li>Version 2 Preferred for Liturgical Text: etc., but for version 2.</li>
 * <li>Version 2 Default for Liturgical Text: etc., but for version 2.</li>
 * </ul>
 * <p>In addition, there is a fifth version specification: "Source version used for template keys".
 * This is referring to the version that templates are pointing to as the official source text for translations.
 * This is the Greek, but if a customer wanted to use Slavonic as their source text, this is where it would be changed.
 * This would also require the templates to be repointed from the Greek to the Slavonic.
 * 
 * @author Michael Colburn, Fall of 2012
 * 
 */
public class ModelAccessor {

	private boolean versionCall = false;
	private boolean nonRecursive = true;
	private boolean displayVersionOfPara = false;
	private String lastFile = "";
	private String lastId = "";
	private String abbreviationFileDefault = "";
	private String abbreviationFilePreferred = "";
	private String abbreviationKeySuffixHtmlLink = ".html.link";
	private String abbreviationKeySuffixHtmlTab = ".html.tab";
	private String abbreviationKeySuffixPdfHeaderTitle = ".pdf.header.title";
	private String abbreviationResourcePrefix = "website.index.titles_";
	private Resource abbreviationResource;
	private String commemoration = "";
	private String hasComponentsButNoStatus = "No status - has components";
	private boolean copyCss = false;
	private String copyCssFrom = "";
	private boolean copyJs = false;
	private String copyJsFrom = "";
	private boolean copyRoot = false;
	private String copyRootFrom = "";
	private boolean copyMedia = false;
	private String copyMediaFrom = "";
	private int counter = 1;
	private boolean debug = false;
	private VersionManager versionManager;
	private Map<String, org.eclipse.emf.common.util.URI> filenameToUriMap = null;
	private boolean generateDelimitedFile = false;
	private boolean generateDocbookFile = false;
	private boolean generateEpubVersion1 = false;
	private boolean generateEpubVersion1And2 = false;
	private boolean generateEpubVersion2 = false;
	private boolean generateHtmlFile = false;
	private boolean generateHtmlVersion1 = false;
	private boolean generateHtmlVersion1And2 = false;
	private boolean generateHtmlVersion2 = false;
	private boolean generateJsonFile = false;
	private boolean generatePdfFile = false;
	private boolean generatePdfVersion1 = false;
	private boolean generatePdfVersion1And2 = false;
	private boolean generatePdfVersion2 = false;
	private boolean generateResources = false;
	private boolean generateIndexServices = false;
	private boolean generateIndexBooks = false;
	private boolean generateIndexCustom = false;
	
	private String hrefRow = "";
	private String htmlIndexLanguageDefault = "";
	private String htmlIndexLanguagePreferred = "";

	private String htmlSiteRoot = "";
	private String htmlServiceFolderRoot = "";
	private String htmlBookFolderRoot = "";
	private String htmlCustomFolderRoot = "";

	private boolean includeMediaAudioLinks = false;
	private boolean includeMediaDocumentLinks = false;
	private boolean includeMediaLinks = false;
	private boolean includeMediaScoreByzantineLinks = false;
	private boolean includeMediaScoreWesternLinks = false;
	private String key;
	private boolean l1Editable = false;
	private boolean l2Editable = false;
//	public BlockSetManager blockSetManager;
	private String language1Id = "gr_GR_cog"; // e.g. el_GR_cog
	private String language1File = addAresFileExtension(language1Id);
	private String language1DefaultId = "gr_GR_cog"; // e.g. el_GR_cog
	private String language1DefaultFile = addAresFileExtension(language1DefaultId);
	private String language1IdOriginal = ""; // used to restore ID after a SwitchLocale is finished
	private String language1FileOriginal = ""; // used to restore ID after a SwitchLocale is finished
	private String language1EpistleDefault = "";
	private String language1EpistleDefaultFile = addAresFileExtension(language1EpistleDefault);
	private String language1EpistlePreferred = "";
	private String language1EpistlePreferredFile = addAresFileExtension(language1EpistlePreferred);
	private String language1GospelDefault = "";
	private String language1GospelDefaultFile = addAresFileExtension(language1GospelDefault);
	private String language1GospelPreferred = "";
	private String language1GospelPreferredFile = addAresFileExtension(language1GospelPreferred);
	
	private String language1ProphetologionDefault = "";
	private String language1ProphetologionDefaultFile = addAresFileExtension(language1ProphetologionDefault);
	
	private String language1ProphetologionPreferred = "";
	private String language1ProphetologionPreferredFile = addAresFileExtension(language1ProphetologionPreferred);

	private String language1PsalterDefault = "";
	private String language1PsalterDefaultFile = addAresFileExtension(language1PsalterDefault);
	private String language1PsalterPreferred = "";
	private String language1PsalterPreferredFile = addAresFileExtension(language1PsalterPreferred);
	
	private String language2Id = "en_US_goarch"; // e.g. en_US_goarch
	private String language2File = addAresFileExtension(language2Id);
	private String language2DefaultId = "en_US_ematins"; // e.g. en_US_goarch
	private String language2DefaultFile = addAresFileExtension(language2DefaultId);
	private String language2IdOriginal = ""; // used to restore ID after a SwitchLocale is finished
	private String language2FileOriginal = ""; // used to restore ID after a SwitchLocale is finished

	private String language2EpistleDefault = "";
	private String language2EpistleDefaultFile = addAresFileExtension(language2EpistleDefault);

	private String language2EpistlePreferred = "";
	private String language2EpistlePreferredFile = addAresFileExtension(language2EpistlePreferred);
	private String language2GospelDefault = "";
	
	private String language2GospelDefaultFile = addAresFileExtension(language2GospelDefault);
	private String language2GospelPreferred = "";
	private String language2GospelPreferredFile = addAresFileExtension(language2GospelPreferred);
	
	private String language2ProkeimenaDefault = "";
	private String language2ProkeimenaDefaultFile = addAresFileExtension(language2ProkeimenaDefault);
	private String language2ProkeimenaPreferred = "";
	private String language2ProkeimenaPreferredFile = addAresFileExtension(language2ProkeimenaPreferred);
	
	private String language2ProphetologionDefault = "";
	private String language2ProphetologionDefaultFile = addAresFileExtension(language2ProphetologionDefault);
	private String language2ProphetologionPreferred = "";
	private String language2ProphetologionPreferredFile = addAresFileExtension(language2ProphetologionPreferred);

	private String language2PsalterDefault = "";
	private String language2PsalterDefaultFile = addAresFileExtension(language2PsalterDefault);
	private String language2PsalterPreferred = "";
	private String language2PsalterPreferredFile = addAresFileExtension(language2PsalterPreferred);
	
	private Map<String,String> loadOptions = new HashMap();
	private Logger logger = AlwbLogger.getLogger("ModelAccessor");
	private Media mediaL1; // preferred for L1
	private Media mediaL1d; // default for L1

	private Media mediaL2; // preferred for L2
	private Media mediaL2d; // default for L2
	
	private boolean mediaOnly = false;
	private int nbrColSpaces = 3;
	private int outputType = AlwbConstants.HTML;
	private String pathToAssetsProject = "";
	private String pathToMediaProject = "";
	private String preferenceFileId = "";
	public Preferences preferences;
	private String resourceFileExtension = "ares";
	private String templateFileExtension = "atem";
	private String [] extensions = new String[] {resourceFileExtension, templateFileExtension};
	
	private Map<String, String> resourceMap = new HashMap<String, String>();
	// investigate using XtextResourceSet instead
	private ResourceSet resourceSet;
	private long serviceDate; // date in milliseconds
	public boolean generateMessagesHtml = false;
	private boolean showSource = false;
	private boolean showDomain = false;
	private boolean showVersion = false;
	private boolean suppressMedia = false;
	private TableManager tableManagerL1;
	private String templateLanguageId = "gr_GR_cog";
	private String templateLanguageFile = addAresFileExtension(templateLanguageId);
	public LiturgicalDayProperties theDay;
	private boolean useLanguage1 = true;
	private boolean useLanguage2 = true;
	private boolean processingLanguage1 = false;
	public MessageBoard messageBoard = new MessageBoard("ModelAccessor");
	
	/*
	 * Test Case Variables to Override Computed Ones
	 */
	
	/**
	 * When ModelAccessor is instantiated, a map named filenameToUriMap 
	 * will be populated with every the EMF URI for all files of the
	 * specified extension in the entire workspace. This means it looks across projects.
	 * 
	 * @param modelExtension
	 */	
	public ModelAccessor(ResourceSet resourceset, String modelExtension) {
		logger.entry();
		AlwbLogger.setLogLevelToEclipsePreference();
		resourceFileExtension = modelExtension;
		try {			
			IWorkspaceRoot theRoot = ResourcesPlugin.getWorkspace().getRoot();
			VisitorSeekingFiles myVisitor = new VisitorSeekingFiles(extensions);
			myVisitor.setResourceSet(resourceset);
			myVisitor.setProjects(theRoot.getProjects());
			theRoot.accept(myVisitor, IResource.NONE);
			filenameToUriMap = myVisitor.getFileResourceMap();
	//		reportFilenameToUriMap();
			resourceSet = resourceset;
			loadOptions.put(XtextResource.OPTION_ENCODING, "UTF-8");
			readGenerationPreferences();
			versionManager = new VersionManager(preferences.versionPrefix, preferences.versionSuffix, preferences.versionDelimiter);
			initializeResourceMap();
			setLiturgicalDayProperties(new LiturgicalDayProperties());
			if (includeMediaLinks) {
				setMedia();
			}
			tableManagerL1 = new TableManager(language1Id,language2Id);
			
			// experimental
			//setVersionBlocks();
		} catch (CoreException e) {
			logger.catching(e);
			e.printStackTrace();
		}
		logger.exit();
	}
	 
	 /**
	  * Started to implement this to trouble shoot a problem on Windows.  But, Fr. Seraphim's 
	  * problem got resolved, so this has not been completed.  See the line on c = r...
	  */
	 public void reportFilenameToUriMap() {
		 String target = "pref";
		 StringBuffer sb = new StringBuffer();
		 sb.append("<table>");
		 
		 try {
			 Set<String> keys = filenameToUriMap.keySet();
			 messageBoard.logMessage(messageBoard.NON_FATAL, "Here are the pref files that have been loaded...");
			 int c = 0;
			 for (String key : keys) {
				 if (key.startsWith(target)) {
					 try {
						 Resource r = getResource(key);
						 c = r.getContents().size(); // this isn't working yet...
					 } catch (Exception i) {
						 
					 }
					 sb.append("<tr><td>" + key + "</td>" + "<td>" + c + "</td></tr>");
				 }
			 }
			 sb.append("</table>");
			 messageBoard.logMessage(messageBoard.NON_FATAL, sb.toString());
		 } catch (Exception e) {
			 
		 }
	 }
	 
	 /**
	private void setVersionBlocks() {
		blockSetManager = new BlockSetManager();
		BlockSet bSet = new BlockSet();
		Block block = new Block(
				this.language1Id, this.language1DefaultId,
				this.language1File, this.language1DefaultFile,
				AlwbConstants.FOR_LITURGICAL
				);
		bSet.setLiturgical(block);
		block = new Block(
				this.language1EpistlePreferred, this.language1EpistleDefault,
				this.language1EpistlePreferredFile, this.language1EpistleDefaultFile,
				AlwbConstants.FOR_EPISTLE
				);
		bSet.setEpistle(block);
		block = new Block(
				this.language1GospelPreferred, this.language1GospelDefault,
				this.language1GospelPreferredFile, this.language1GospelDefaultFile,
				AlwbConstants.FOR_GOSPEL
				);
		bSet.setGospel(block);
		block = new Block(
				this.language1PsalterPreferred, this.language1PsalterDefault,
				this.language1PsalterPreferredFile, this.language1PsalterDefaultFile,
				AlwbConstants.FOR_PSALTER
				);
		bSet.setPsalter(block);
		block = new Block(
				this.language1ProphetologionPreferred, this.language1ProphetologionDefault,
				this.language1ProphetologionPreferredFile, this.language1ProphetologionDefaultFile,
				AlwbConstants.FOR_PROPHETOLOGION
				);
		bSet.setProphetologion(block);
		blockSetManager.addSet("1", bSet);
		block = new Block(
				this.language2Id, this.language2DefaultId,
				this.language2File, this.language2DefaultFile,
				AlwbConstants.FOR_LITURGICAL
				);
		bSet.setLiturgical(block);
		block = new Block(
				this.language2EpistlePreferred, this.language2EpistleDefault,
				this.language2EpistlePreferredFile, this.language2EpistleDefaultFile,
				AlwbConstants.FOR_EPISTLE
				);
		bSet.setEpistle(block);
		block = new Block(
				this.language2GospelPreferred, this.language2GospelDefault,
				this.language2GospelPreferredFile, this.language2GospelDefaultFile,
				AlwbConstants.FOR_GOSPEL
				);
		bSet.setGospel(block);
		block = new Block(
				this.language2PsalterPreferred, this.language2PsalterDefault,
				this.language2PsalterPreferredFile, this.language2PsalterDefaultFile,
				AlwbConstants.FOR_PSALTER
				);
		bSet.setPsalter(block);
		block = new Block(
				this.language2ProphetologionPreferred, this.language2ProphetologionDefault,
				this.language2ProphetologionPreferredFile, this.language2ProphetologionDefaultFile,
				AlwbConstants.FOR_PROPHETOLOGION
				);
		bSet.setProphetologion(block);
		blockSetManager.addSet("2", bSet);
	}
**/
	public String addAresFileExtension(String version) {
		return version + "." + resourceFileExtension;
	}

	/**
	 * Drops the last part of a key based on the provided delimiter.
	 * <p>The reason for dropping the last part is that the chopped key will be used to retrieve other things, 
	 * such as audio files or musical scores.
	 * @param key, e.g. oc.m1.d1.Apolytikion.text
	 * @return key minus the past part, e.g. oc.m1.d.Apolytikion
	 */
	public String chopKey(String key, String delimiter) {
		logger.entry();
		String result = key;
		try {
			String [] theParts = key.split(delimiter);
			if (theParts.length > 1) {
				theParts = (String[]) ArrayUtils.remove(theParts, theParts.length-1);
				result = StringUtils.join(theParts, ".");
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return result;
	}

	public void clearHrefsRow() {
		hrefRow = "";
	}

	public String containingProject(URI u) {
		logger.entry();;
		String result = "";
		try {
			String p = u.toPlatformString(true);
			result = p.split("/")[1];
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return result;
	}

	/**
	 * @param from - filename to convert, e.g. properties_el_GR_cog.ares
	 * @param to - language, country, locale, e.g. en_US_goarch
	 * @return converted filename, e.g. properties_en_US_goarch.ares
	 */
	public String convertFilename(String from, String to) {
		return getRoot(from) + "_" + to + ".ares";
	}
	
	/**
	 * Checks to see if the provided filename matches the
	 * preferred version for V1 or V2, and if so, converts it
	 * to the default version.  We only do this for versions set
	 * in the preferences by the user.
	 * @param filename based on the preferred version
	 * @return the filename based on the default version
	 */
	public String convertFilenameToDefault(String filename) {
		String result = filename;
		try {
			String [] parts = filename.split("_");
			String preface = parts[0];
			String version = "";
			if (filename.startsWith(this.abbreviationResourcePrefix)) { // Abbreviations file
				version = getAbbreviationFileDefault();
			} else if (filename.startsWith("le.go.")) { // Gospel
				if (filename.endsWith(this.getLanguage1GospelPreferredFile())) { // le.go
					version = getLanguage1GospelDefaultFile();
				} else if (filename.endsWith(this.getLanguage2GospelPreferredFile())) {
					version = getLanguage2GospelDefaultFile();
				}
			} else if (filename.startsWith("le.ep.")) { // Epistle
				if (filename.endsWith(this.getLanguage1EpistlePreferredFile())) {
					version = getLanguage1EpistleDefaultFile();
				} else if (filename.endsWith(this.getLanguage2EpistlePreferredFile())) {
					version = getLanguage2EpistleDefaultFile();
				}
			} else if (filename.startsWith("le.pr.")) { // Prophetologion
				if (filename.endsWith(this.getLanguage1ProphetologionPreferredFile())) {
					version = getLanguage1ProphetologionDefaultFile();
				} else if (filename.endsWith(this.getLanguage2ProphetologionPreferredFile())) {
					version = getLanguage2ProphetologionDefaultFile();
				}
			} else if (filename.startsWith("ps")) { // Psalms
				if (filename.endsWith(this.getLanguage1PsalterPreferredFile())) {
					version = getLanguage1PsalterDefaultFile();
				} else if (filename.endsWith(this.getLanguage2PsalterPreferredFile())) {
					version = getLanguage2PsalterDefaultFile();
				}
			} else {
				if (filename.endsWith(this.getLanguage1File())) {
					version = language1DefaultFile;
				} else if (filename.endsWith(this.getLanguage2File())){
					version = language2DefaultFile;
				}
			}
			result = preface + "_" + version;
		} catch (Exception e) {
			logger.catching(e);
		}
		return result;
	}

	public String convertFormatCodes(String in) {
		logger.entry();
		String theResult = in;
		theResult = theResult.replaceAll("<sq>", "\"");
		theResult = theResult.replaceAll("<eq>", "\"");
		logger.exit();
		return theResult;
	}

	/**
	 * Converts the name of book template root into a path,
	 * where each segment of the path corresponds to a segment
	 * in the template root name.  The root name is the name minus
	 * the .atem file extension.
	 * @param fileRoot - name of the template minus the .atem extension
	 * @return the path equivalent of the fileroot
	 */
	public String convertToBookPath(String fileroot) {
		logger.entry();
		String result = fileroot;
		try {
			result = fileroot.replaceFirst("/bk\\.", "").replaceAll("\\.", "/");
		} catch (Exception e) {
			logger.catching(e);
			result = fileroot;
		}
		logger.exit();
		return result + "/";
	}

	/**
	 * Converts the name of custom template root into a path,
	 * where each segment of the path corresponds to a segment
	 * in the template root name.  The root name is the name minus
	 * the .atem file extension.
	 * @param fileRoot - name of the template minus the .atem extension
	 * @return the path equivalent of the fileroot
	 */
	public String convertToCustomPath(String fileroot) {
		logger.entry();
		String result = fileroot;
		try {
			result = fileroot.replaceFirst("/cu\\.", "").replaceAll("\\.", "/");
		} catch (Exception e) {
			logger.catching(e);
			result = fileroot;
		}
		logger.exit();
		return result + "/";
	}

	/**
	 * Converts the name of book template root into a path,
	 * where each segment of the path corresponds to a segment
	 * in the template root name.  The root name is the name minus
	 * the .atem file extension.
	 * @param fileRoot - name of the template minus the .atem extension
	 * @return the path equivalent of the fileroot
	 */
	public String convertToGenericPath(String fileroot) {
		logger.entry();
		String result = fileroot;
		try {
			result = fileroot.replaceFirst("/", "").replaceAll("\\.", "/");
		} catch (Exception e) {
			logger.catching(e);
			result = fileroot;
		}
		logger.exit();
		return result + "/";
	}

	/**
	 * Converts the name of service template root into a path,
	 * where each segment of the path corresponds to a segment
	 * in the template root name.  The root name is the name minus
	 * the .atem file extension. Prepends the service year to the path
	 * @param fileRoot - name of the template minus the .atem extension
	 * @return the path equivalent of the fileroot
	 */
	public String convertToServicePath(String service) {
		// tr.d065.ma.atem
		logger.entry();
		String result = service;
		try {
			String [] theParts = service.replaceFirst("/", "").split("\\.");
			String serviceType = theParts[theParts.length-1];
			if (theParts.length == 1) {
				result = theParts[0];
			} else {
				if (indexUsingDayBefore(serviceType)) {
					result = theDay.getTheDayBeforeAsPath(); 
				} else { // store in a folder for theDay
					result = theDay.getTheDayAsPath();
				}
			  result = result + "/" + serviceType + "/";
			} 
		} catch (Exception e) {
			logger.catching(e);
			result = service;
		}
		logger.exit();
		return result;
	}

	/*
	 * Determines whether this service should show on the
	 * previous day in the services index
	 */
	public boolean indexUsingDayBefore(String serviceType) {
		boolean result = false;
		if (serviceType.startsWith(AlwbConstants.SMALL_VESPERS) || 
				serviceType.startsWith(AlwbConstants.MIDNIGHT_OFFICE) ||
				serviceType.startsWith(AlwbConstants.PRESANCTIFIED_LITURGY) ||
				serviceType.startsWith(AlwbConstants.VESPERAL_LITURGY) ||
				serviceType.startsWith(AlwbConstants.VESPERS) ||
				serviceType.startsWith(AlwbConstants.EVENING_MATINS) ||
				serviceType.startsWith(AlwbConstants.COMPLINE)) {
			result = true;
		} else if (matinsInHolyWeek(serviceType)) {
				result = true;
		}
		return result;
	}
	
	/** Determines whether this service is Matins, and if so,
	 * whether it falls within Holy Week.
	 * @param serviceType
	 * @return true if matins and falls within holy week
	 */
	public boolean matinsInHolyWeek(String serviceType) {
		boolean result = false;
		if (serviceType.startsWith(AlwbConstants.MATINS)
				|| serviceType.startsWith(AlwbConstants.EVENING_MATINS)) {
			int dayOfSeason = theDay.getDayOfSeason();
			if (dayOfSeason >= 65 && dayOfSeason <= 70) {
				result = true;
			}
		}
		return result;
	}
	
	public boolean copyCss() {
		return copyCss;
	}

	public boolean copyJs() {
		return copyJs;
	}

	public boolean copyRoot() {
		return copyRoot;
	}

	public boolean copyMedia() {
		return copyMedia;
	}


	public String dropExtension(String filename) {
		logger.entry();
		String result = "";
		try {
		result = filename.split(resourceFileExtension)[0];
		} catch (Exception e) {
			logger.catching(e);
			result = filename;
		}
		logger.exit();
		return result;
	}
	
	public String dropDomain(String filename) {
		logger.entry();
		String result = "";
		try {
		String [] parts = filename.split("_");
		if (parts.length > 1) {
			result = parts[0];
		}
		} catch (Exception e) {
			logger.catching(e);
			result = filename;
		}
		logger.exit();
		return result;
	}

	public String getDomain(String filename) {
		logger.entry();
		String result = "";
		try {
		String [] parts = filename.split("_");
		if (parts.length > 3) {
			result = parts[1]+"_"+parts[2]+"_"+parts[3];
			if (result.endsWith("\\.")) {
				result = result.substring(0, result.length()-2);
			}
		}
		} catch (Exception e) {
			logger.catching(e);
			result = filename;
		}
		logger.exit();
		return result;
	}

	public boolean generateDelimitedFile() {
		return generateDelimitedFile;
	}

	public boolean generateDockbookFile() {
		return generateDocbookFile;
	}

	public boolean generateEpubVersion1() {
		return generateEpubVersion1;
	}

	public boolean generateEpubVersion1And2() {
		return generateEpubVersion1And2;
	}

	public boolean generateEpubVersion2() {
		return generateEpubVersion2;
	}

	public boolean generateHtmlFile() {
		return generateHtmlFile;
	}

	public boolean generateHtmlVersion1() {
		return generateHtmlVersion1;
	}

	public boolean generateHtmlVersion1And2() {
		return generateHtmlVersion1And2;
	}

	public boolean generateHtmlVersion2() {
		return generateHtmlVersion2;
	}

	public boolean generatePdfFile() {
		return generatePdfFile;
	}

	public boolean generatePdfVersion1() {
		return generatePdfVersion1;
	}

	public boolean generatePdfVersion1And2() {
		return generatePdfVersion1And2;
	}

	public boolean generatePdfVersion2() {
		return generatePdfVersion2;
	}

	public boolean generateResources() {
		return generateResources;
	}

	public String getAbbreviationFileDefault() {
		return abbreviationFileDefault;
	}

	public String getAbbreviationFilePreferred() {
		return abbreviationFilePreferred;
	}

	/**
	 * Gets the anchor tag and key to return with the text
	 * @return the key formatted as an anchor
	 */
	public String getAnchor() {
		return key;
	}

	public String getBundleName(String file) {
		logger.entry();
		String [] theParts = file.split("_");
		String result = "";
		if (theParts.length ==4) {
			result = theParts[1] + "_" + theParts[2] + "_" + theParts[3].replace(".ares", "");
		}
		logger.exit();
		return result;
	}

	public String getCopyCssFrom() {
		return copyCssFrom;
	}

	public String getCopyJsFrom() {
		return copyJsFrom;
	}

	public String getCopyRootFrom() {
		return copyRootFrom;
	}

	public String getCopyMediaFrom() {
		return copyMediaFrom;
	}

	public String getCommemoration() {
		return commemoration;
	}

	/**
	 * For the supplied acronymn, return the filename of the default version to use
	 * @param bookAcronymn, e.g. the first part of the ares filename
	 * @return the default version filename, i.e., en_US_ematins.ares
	 */
	public String getDefaultVersion1File(String bookAcronymn) {
		String result = "";
		if        (bookAcronymn.toLowerCase().startsWith("le.go")) {
			result = getLanguage1GospelDefaultFile();
		} else if (bookAcronymn.toLowerCase().startsWith("le.ep")) {
			result = getLanguage1EpistleDefaultFile();
		} else if (bookAcronymn.toLowerCase().startsWith("ps")) { 
			result = getLanguage1PsalterDefaultFile();
		} else if (bookAcronymn.toLowerCase().startsWith("le.pr")) {	
			result = getLanguage1ProphetologionDefaultFile();
		} else {
			result = getLanguage1File();
		}
		return result;
	}

	/**
	 * For the supplied acronymn, return the default version to use
	 * @param bookAcronymn, e.g. the first part of the ares filename
	 * @return the default version
	 */
	public String getDefaultVersion1Id(String bookAcronymn) {
		String result = "";
		if        (bookAcronymn.toLowerCase().startsWith("le.go")) {
			result = getLanguage1GospelDefault();
		} else if (bookAcronymn.toLowerCase().startsWith("le.ep")) {
			result = getLanguage1EpistleDefault();
		} else if (bookAcronymn.toLowerCase().startsWith("ps")) { 
			result = getLanguage1PsalterDefault();
		} else if (bookAcronymn.toLowerCase().startsWith("le.pr")) {	
			result = getLanguage1ProphetologionDefault();
		} else {
			result = language1DefaultId;
		}
		return result;
	}

	/**
	 * For the supplied acronymn, return the filename of the default version to use
	 * @param bookAcronymn, e.g. the first part of the ares filename
	 * @return the default version filename, i.e., en_US_ematins.ares
	 */
	public String getDefaultVersion2File(String bookAcronymn) {
		String result = "";
		if        (bookAcronymn.toLowerCase().startsWith("le.go")) {
			result = getLanguage2GospelDefaultFile();
		} else if (bookAcronymn.toLowerCase().startsWith("le.ep")) {
			result = getLanguage2EpistleDefaultFile();
		} else if (bookAcronymn.toLowerCase().startsWith("ps")) { 
			result = getLanguage2PsalterDefaultFile();
		} else if (bookAcronymn.toLowerCase().startsWith("le.pr")) {	
			result = getLanguage1ProphetologionDefaultFile();
		} else {
			result = getLanguage2File();
		}
		return result;
	}

	/**
	 * For the supplied acronymn, return the default version to use
	 * @param bookAcronymn, e.g. the first part of the ares filename
	 * @return the default version
	 */
	public String getDefaultVersion2Id(String bookAcronymn) {
		String result = "";
		if        (bookAcronymn.toLowerCase().startsWith("le.go")) {
			result = getLanguage2GospelDefault();
		} else if (bookAcronymn.toLowerCase().startsWith("le.ep")) {
			result = getLanguage2EpistleDefault();
		} else if (bookAcronymn.toLowerCase().startsWith("ps")) { 
			result = getLanguage2PsalterDefault();
		} else if (bookAcronymn.toLowerCase().startsWith("le.pr")) {	
			result = getLanguage2ProphetologionDefault();
		} else {
			result = language2DefaultId;
		}
		return result;
	}

	/**
	 * @param resource
	 *            - A resource that is a DefModel
	 * @param index
	 *            - the nth occurrence of dsl_Model_definitions that you want
	 * @return Definition - the Definition found at the index value
	 */
	public Definition getDefinitionByIndex(Resource resource, int index) {
		return (Definition) resource.getEObject("//@dsl_Model_definitions."
				+ index);
	}
	
	public String getDefinitionText(Definition d, String defFile) {
		logger.entry(d,defFile);

		String theOriginalKey = normalizedFilename(defFile) + "." + d.getName();
		String hrefKey = theOriginalKey;
		Definition resolvedDefinition = null;
		String theFinalKey = null; 
		String result = null;
		String lastSegment = "";
		lastFile = "";
		lastId = "";
		try {
			resolvedDefinition = getResolvedDefinition(d);
			lastSegment = resolvedDefinition.eResource().getURI().lastSegment();
			result = resolvedDefinition.getDsl_Definition_Text();
			if (result != null) {
				lastFile = lastSegment;
				lastId = resolvedDefinition.getName();
				theFinalKey = lastFile + "." + lastId;
			}
		} catch (Exception e) {
			logger.catching(e);
			if (debug) {
				result = reportIssue("getDefinitionText",
						defFile,
						d.getName(),
						e.getMessage());
			} else {
				result = "";
			}
		}		
		if (! (theFinalKey.startsWith("pref") || theFinalKey.startsWith("website"))) {

			// save key-value to generate delimited file if requested
			if (this.generateDelimitedFile && processingLanguage1 && outputType == AlwbConstants.HTML) {
				tableManagerL1.add(theFinalKey, resolvedDefinition.getDsl_Definition_Text());
			}
			
			if (includeMediaLinks && (hrefKey.endsWith("text"))) {
				setHrefsRow(hrefKey); // the stored HREFs will be used by AtemGenerator
			}
			
			/**
			 * Special processing controlled by flag set by compile(Media) in AtemGenerator
			 * It would be better to have separate methods that compile(Media) calls, but this is
			 * an easier way to get the same result.  Apologies!
			 */
			if (mediaOnly) {
				result = getHrefsRow();
			}
			
			// check to see if preference set to include keys in generated html
			// If so, the keys will show up using the data-key meta-tag.
			if (preferences.genHtmlFileIncludeKeyOriginal && preferences.genHtmlFileIncludeKeyDerived) {
				result = wrapAnchor(theOriginalKey+"~"+theFinalKey,result);
			} else if (preferences.genHtmlFileIncludeKeyOriginal) {
				result = wrapAnchor(theOriginalKey,result);
			} else if (preferences.genHtmlFileIncludeKeyDerived) {
				result = wrapAnchor(theFinalKey,result);
			}
		}
		logger.exit("Key: " + key + " Result: " + result);
		return result;
	}

	/**
	 * The following method can be implemented right in the Xtend generator:
	 * {@code
	 * 		def String getDefinitionValue(Resource resource, String id) { 
	 * 			for(e: resource.allContents.toIterable.filter(typeof(Definition))) {
	 * 				if(e.name.matches(id)) {
	 * 					return e.dsl_Definition_Text 
	 * 				}
	 * 			} return null; 
	 * 		}
	 * }
	 * The Java version below was copied from the Java file generated by Xtend.
	 */
	public String getDefinitionValue(final Resource resource, final String id) {
		logger.entry(resource,id);
		try {
			resource.load(loadOptions); // in order to ensure loaded as UTF-8
		} catch (IOException e1) {
			logger.catching(e1);
		}
		TreeIterator<EObject> _allContents = resource.getAllContents();
		Iterable<EObject> _iterable = IteratorExtensions
				.<EObject> toIterable(_allContents);
		Iterable<Definition> _filter = Iterables.<Definition> filter(_iterable, Definition.class);
		for (final Definition e : _filter) {
			String _name = e.getName();
			boolean _matches = _name.matches(id);
			if (_matches) { 
				logger.exit();
				return getDefinitionText(e,resource.getURI().lastSegment());
			}
		}
		logger.exit();
		return null;
	}

	public String getDefinitionValueById(Resource resource, String defname) {
		return getDefinitionValue(resource, defname);
	}

	public String getDefinitionValueById(String filename, String defname) {
		logger.entry(filename,defname);
		Resource resource = getResource(filename);
		String uri = resource.getURI().toString();
		String result = "";
		try {
			result = getDefinitionValue(resource,defname);
		} catch (Exception e) {
			logger.catching(e);
			if (debug) {
				result = reportIssue("getDefinitionValueById",
						filename,
						defname,
						e.getMessage());
			} else {
				result = null;
			}
		}
		logger.exit();
		return result;
	}

	/**
	 * @return the map of all models in the workspace for the file extension used
	 * when the class was instantiated. 
	 */
	public Map<String, org.eclipse.emf.common.util.URI> getFilenameToUriMap() {
		return filenameToUriMap;
	}

	/**
	 * Returns the map of all models into a string where each line is
	 * a key value pair separated by the delimiter passed in.
	 * @param delimiter
	 * @return resources as key-value pairs, where the value is the path
	 */
	public String getFileNameToUriString(String delimiter) {
		StringBuffer sb = new StringBuffer();
		try {
			Iterator<Entry<String, URI>> it = filenameToUriMap.entrySet().iterator();
			String workspacePath = Platform.getLocation().makeAbsolute().toString();
			while(it.hasNext()) {
				Entry<String, URI> entry = it.next();
				String key = entry.getKey();
				URI value = entry.getValue();
				String path = workspacePath + value.path().replace("/resource", "");
				sb.append(key + delimiter + path);
				sb.append("\n");
			}
		} catch (Exception e) {
			return e.getMessage();
		}
		return sb.toString();
	}

	/**
	 * In order to distinguish files, we need to 
	 * put them into folders that indicate the language(s)
	 * used and also include language information in the filename.
	 * @return
	 */
	public String getFolderLanguageAcronym() {
		String L1 = getLanguageAcronymn(language1Id);
		String L2 = getLanguageAcronymn(language2Id);

		if (useLanguage1 && useLanguage2) {
			return L1 + "-" + L2;
		} else {
			if (useLanguage1) {
				return L1;
			} else {
				return L2;
			}
		}

	}
	
	/**
	 * Split out the acronymn for the language
	 * @param langId the fully identifier, e.g. en_US_ematins
	 * @return the language acronym, e.g. en
	 */
	public String getLanguageAcronymn(String langId) {
		String result = "";
		try {
			result = langId.split("_")[0];
		} catch (Exception e) {
			result = "";
		}
		return result;
	}

	public boolean getGenerateIndexServices() {
		return generateIndexServices;
	}

	public boolean getGenerateIndexBooks() {
		return generateIndexServices;
	}
	public boolean getGenerateIndexCustom() {
		return generateIndexServices;
	}
	public String getHrefs(String key) {
		logger.entry(key);
		String result = null;

		try {
			String compositionNbr = "1";
			String audioNbr = "1";
			String [] theParts = key.split("_");
			String language = theParts[0] + "_" + theParts[1] +"_" + theParts[2];
			String keyRoot = chopKey(theParts[3],"\\.");

			if (language.equals(language1Id) || language.equals(language1DefaultId)) {
				// despite the language requested, first try and get the preferred version
				if (mediaL1 != null) {
					result = mediaL1.getMediaSpan(keyRoot, compositionNbr, audioNbr);
				}
				// if not found, see if the default (fallback) version has this key
				if (result == null || result.length() == 0) {
					if (mediaL1d != null) {
						result = mediaL1d.getMediaSpan(keyRoot, compositionNbr, audioNbr);
					}
				}
				if (result == null) {
					result = mediaL1.getEmptyMediaDiv();
				}
			} else if (language.equals(language2Id) || language.equals(language2DefaultId)) {
				if (mediaL2 != null) {
					// despite the language requested, first try and get the preferred version
					result = mediaL2.getMediaSpan(keyRoot, compositionNbr, audioNbr);
				}
				// if not found, see if the default (fallback) version has this key
				if (result == null || result.length() == 0) {
					if (mediaL2d != null) {
						result = mediaL2d.getMediaSpan(keyRoot, compositionNbr, audioNbr);
					}
				}
				if (result == null) {
					result = mediaL2.getEmptyMediaDiv();
				}
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
 		return result;
	}

	/*
	 * To be called by AtemGenerator after the para with text has been provided
	 */
	public String getHrefsRow() {
		return hrefRow;
	}
	
	/**
	 * Check to see if both media divs are empty
	 * @param v1 version 1 media div
	 * @param v2 version 2 media div
	 * @return true if both are empty
	 */
	public boolean notEmptyMediaDivs(CharSequence v1, CharSequence v2) {
		boolean v1Empty = v1.toString().startsWith(mediaL1.getEmptyMediaDiv());
		boolean v2Empty = v2.toString().startsWith(mediaL1.getEmptyMediaDiv());
		return ! (v1Empty && v2Empty);
	}

	public String getHtmlSiteRoot() {
		return htmlSiteRoot;
	}

	public String getHtmlServiceFolderRoot() {
		return htmlServiceFolderRoot;
	}

	public String getHtmlBookFolderRoot() {
		return htmlBookFolderRoot;
	}

	public String getHtmlCustomFolderRoot() {
		return htmlCustomFolderRoot;
	}

	public String getHtmlIndexLanguageDefault() {
		return htmlIndexLanguageDefault;
	}

	public String getHtmlIndexLanguagePreferred() {
		return htmlIndexLanguagePreferred;
	}

	public String getHtmlIndexLanguagePreferredFile() {
		return htmlIndexLanguagePreferred;
	}

	/** 
	 * Gets the Audio Tooltip set for Language 1 by the user via the media.ares file
	 * @return tooltip text
	 */
	public String getL1MediaAudioToolTip() {
		if (mediaL1 == null) {
			return "";
		} else {
			return mediaL1.getMediaToolTipAudio();
		}
	}

	/** 
	 * Gets the Byzantine Score Tooltip set for Language 1 by the user via the media.ares file
	 * @return tooltip text
	 */
	public String getL1MediaScoreByzantineToolTip() {
		if (mediaL1 == null) {
			return "";
		} else {
			return mediaL1.getMediaToolTipScoreByzantine();
		}
	}

	/** 
	 * Gets the Western Score Tooltip set for Language 1 by the user via the media.ares file
	 * @return tooltip text
	 */
	public String getL1MediaScoreWesternToolTip() {
		if (mediaL1 == null) {
			return "";
		} else {
			return mediaL1.getMediaToolTipScoreWestern();
		}
	}

	/** 
	 * Gets the Audio Tooltip set for Language 2 by the user via the media.ares file
	 * @return tooltip text
	 */
	public String getL2MediaAudioToolTip() {
		if (mediaL2 == null) {
			return "";
		} else {
			return mediaL2.getMediaToolTipAudio();
		}
	}

	/** 
	 * Gets the Byzantine Score Tooltip set for Language 2 by the user via the media.ares file
	 * @return tooltip text
	 */
	public String getL2MediaScoreByzantineToolTip() {
		if (mediaL2 == null) {
			return "";
		} else {
			return mediaL2.getMediaToolTipScoreByzantine();
		}
	}

	/** 
	 * Gets the Western Score Tooltip set for Language 2 by the user via the media.ares file
	 * @return tooltip text
	 */
	public String getL2MediaScoreWesternToolTip() {
		if (mediaL2 == null) {
			return "";
		} else {
			return mediaL2.getMediaToolTipScoreWestern();
		}
	}

	public String getLanguage1DefaultFile() {
		return language1DefaultFile;
	}

	/**
	 * The Default is used when a lookup fails for language1
	 * @return
	 */
	public String getLanguage1DefaultId() {
		return language1DefaultId;
	}

	public String getLanguage1DisplayName() {
		String displayName = getLanguageDisplayName(language1Id);
		if (displayName == null) {
			return "Language 1";
		} else {
			return displayName;
		}
	}

	public String getLanguage1EpistleDefault() {
		return language1EpistleDefault;
	}

	public String getLanguage1EpistleDefaultFile() {
		return language1EpistleDefaultFile;
	}

	public String getLanguage1EpistlePreferred() {
		return language1EpistlePreferred;
	}

	public String getLanguage1EpistlePreferredFile() {
		return language1EpistlePreferredFile;
	}

	public String getLanguage1File() {
		return language1File;
	}

	public String getLanguage1GospelDefault() {
		return language1GospelDefault;
	}

	public String getLanguage1GospelDefaultFile() {
		return language1GospelDefaultFile;
	}

	public String getLanguage1GospelPreferred() {
		return language1GospelPreferred;
	}

	public String getLanguage1GospelPreferredFile() {
		return language1GospelPreferredFile;
	}

	/**
	 * When ModelAccessor is instantiated, it reads the preference store to determine what
	 * languages the user wants when generating services.  
	 * @see getLanguage1Id()
	 * @return ID of language 1, e.g., 'el_GR_cog'
	 */
	public String getLanguage1Id() {
		return language1Id;
	}

	public String getLanguage1ProphetologionDefault() {
		return language1ProphetologionDefault;
	}

	public String getLanguage1ProphetologionDefaultFile() {
		return language1ProphetologionDefaultFile;
	}

	public String getLanguage1ProphetologionPreferred() {
		return language1ProphetologionPreferred;
	}

	public String getLanguage1ProphetologionPreferredFile() {
		return language1ProphetologionPreferredFile;
	}

	public String getLanguage1PsalterDefault() {
		return language1PsalterDefault;
	}

	public String getLanguage1PsalterDefaultFile() {
		return language1PsalterDefaultFile;
	}

	public String getLanguage1PsalterPreferred() {
		return language1PsalterPreferred;
	}

	public String getLanguage1PsalterPreferredFile() {
		return language1PsalterPreferredFile;
	}

	/**
	 * Template:
	 * x1 -> Greek
	 * x2 -> English
	 * Template -> Greek
	 * Lang1 -> Spanish
	 * Lang2 -> English
	 * if x doesn't point to template language, use X
	 * else
	 * if lang1 is template lang, use template lang
	 * else use lang1
	 * Use cases:
	 * 1. The requested version is the actual version.
	 * 2. The requested version is not the actual version.
	 * 		2.a. The actual version is also not the other requested version.  If so, use the local
	 */
	public String getLanguage1Text(Definition d) {
		logger.entry(d);
		processingLanguage1 = true;
		String theKey = d.getName();
		String theResult = null;
		String defFile = d.eResource().getURI().lastSegment();
		String lang1Id = getPreferredVersion1Id(defFile);
		String lang1File = getPreferredVersion1File(defFile);
		String lang1DefaultId = getDefaultVersion1Id(defFile);
		try {
			if (defFile.endsWith(lang1File) // actual language is the requested one
					|| (!defFile.endsWith(getTemplateLanguageFile()))) { // user set template to a non-default
				theResult = getDefinitionText(d,defFile);
			} else {
				defFile = convertFilename(d.eResource().getURI().lastSegment(),lang1Id);
				theResult =  getDefinitionValueById(defFile,
						theKey);
			}
			if (theResult == null || theResult.startsWith("null")) {
				defFile = convertFilename(d.eResource().getURI().lastSegment(),lang1DefaultId);
				theResult =  getDefinitionValueById(defFile,
						theKey);
				if (theResult == null || theResult.startsWith("null")) { // this really is NOT dead code
					theResult = "";
				}
			}
		} catch (Exception e) {
			logger.catching(e);
			if (debug) {
				theResult = reportIssue("getLanguage1Text",
						defFile,
						theKey,
						"null. " + (lang1File == null ? " Missing name of Version 1 in Preferences." : ""));
			} else {
			}
				theResult = "";
			
		}
		theResult = convertFormatCodes(theResult);
		processingLanguage1 = false;
		if (theResult != null && theResult.length() > 0) {
				theResult = theResult + source(lastFile,lastId);
		}
		logger.exit(theResult);
		return theResult;
	}

	public String getLanguage1VariableText(Definition d) {
		processingLanguage1 = true;
		String defFile = d.eResource().getURI().lastSegment();
		String lang1IdPreferred = getPreferredVersion1Id(defFile);
		String lang1IdDefault = getDefaultVersion1Id(defFile);
		String result = getLanguageVariableText(d, lang1IdPreferred);
		if (result == null || result == "") {
			result = getLanguageVariableText(d, lang1IdDefault);
		}
		if (result != null && result.length() > 0) {
				result = result + source(lastFile,lastId);
		}
		processingLanguage1 = false;
		return result;
	}

	public String getLanguage2DefaultFile() {
		return language2DefaultFile;
	}

	public String getLanguage2DefaultId() {
		return language2DefaultId;
	}

	public String getLanguage2DisplayName() {
		String displayName = getLanguageDisplayName(language2Id);
		if (displayName == null) {
			return "Language 2";
		} else {
			return displayName;
		}
	}

	public String getLanguage2EpistleDefault() {
		return language2EpistleDefault;
	}

	public String getLanguage2EpistleDefaultFile() {
		return language2EpistleDefaultFile;
	}

	public String getLanguage2EpistlePreferred() {
		return language2EpistlePreferred;
	}

	public String getLanguage2EpistlePreferredFile() {
		return language2EpistlePreferredFile;
	}

	public String getLanguage2File() {
		return language2File;
	}

	public String getLanguage2GospelDefault() {
		return language2GospelDefault;
	}

	public String getLanguage2GospelDefaultFile() {
		return language2GospelDefaultFile;
	}

	public String getLanguage2GospelPreferred() {
		return language2GospelPreferred;
	}

	public String getLanguage2GospelPreferredFile() {
		return language2GospelPreferredFile;
	}

	/**
	 * When ModelAccessor is instantiated, it reads the preference store to determine what
	 * languages the user wants when generating services.  
	 * @see getLanguage2Id()
	 * @return ID of language 2, e.g., 'en_US_goarch'
	 */
	public String getLanguage2Id() {
		return language2Id;
	}
	
	public String getLanguage2ProkeimenaDefault() {
		return language2ProkeimenaDefault;
	}
	
	public String getLanguage2ProkeimenaDefaultFile() {
		return language2ProkeimenaDefaultFile;
	}
	
	public String getLanguage2ProkeimenaPreferred() {
		return language2ProkeimenaPreferred;
	}
	
	public String getLanguage2ProkeimenaPreferredFile() {
		return language2ProkeimenaPreferredFile;
	}

	public String getLanguage2ProphetologionDefault() {
		return language2ProphetologionDefault;
	}
	
	public String getLanguage2ProphetologionDefaultFile() {
		return language2ProphetologionDefaultFile;
	}

	public String getLanguage2ProphetologionPreferred() {
		return language2ProphetologionPreferred;
	}
	
	public String getLanguage2ProphetologionPreferredFile() {
		return language2ProphetologionPreferredFile;
	}
	
	public String getLanguage2PsalterDefault() {
		return language2PsalterDefault;
	}
	public String getLanguage2PsalterDefaultFile() {
		return language2PsalterDefaultFile;
	}
	
	public String getLanguage2PsalterPreferred() {
		return language2PsalterPreferred;
	}
	
	public String getLanguage2PsalterPreferredFile() {
		return language2PsalterPreferredFile;
	}

	public String getLanguage2Text(Definition d) {
		logger.entry(d);
		processingLanguage1 = false;
		String theResult = null;
		String firstDefFile = null;
		String secondDefFile = null;
		String defFile = d.eResource().getURI().lastSegment();
		String lang2Id = getPreferredVersion2Id(defFile);
		String lang2File = getPreferredVersion2File(defFile);
		String lang2DefaultId = getDefaultVersion2Id(defFile);
		try {
			if (defFile.endsWith(lang2File) // actual language is the requested one
					|| (!defFile.endsWith(getTemplateLanguageFile()))) { // user set template to a non-default
				firstDefFile = defFile;
				theResult = getDefinitionText(d,defFile);
			} else {
				defFile = convertFilename(
						d.eResource().getURI().lastSegment(), // e.g., properties_el_GR_cog.ares
						lang2Id);
				firstDefFile = defFile;
				theResult =  getDefinitionValueById(defFile, // e.g., en_US_goarch
						d.getName()); // ID of resource, e.g. Headings.GREAT_VESPERS
			}
			if (theResult == null || theResult.startsWith("null")) {
				defFile = convertFilename(d.eResource().getURI().lastSegment(),lang2DefaultId);
				secondDefFile = defFile;
				theResult =  getDefinitionValueById(defFile,
						d.getName());
				if (theResult == null || theResult.startsWith("null")) { // this really is NOT dead code
					theResult = "";
				}
			}
		} catch (Exception e) {
			logger.exit();
			if (debug) {
				theResult = reportIssue("getLanguage2Text",
						firstDefFile + " and " + secondDefFile,
						d.getName(),
						"null. " + (lang2File == null ? " Missing name of Version 2 in Preferences." : ""));
			} else {
				theResult = "";
			}
		}
		theResult = convertFormatCodes(theResult);
		if (theResult != null && theResult.length() > 0) {
				theResult = theResult + source(lastFile,lastId);
		}
		logger.exit(theResult);
		return theResult;
	}

	public String getLanguage2VariableText(Definition d) {
		processingLanguage1 = false;
		String defFile = d.eResource().getURI().lastSegment();
		String langIdPreferred = getPreferredVersion2Id(defFile);
		String langIdDefault = getDefaultVersion2Id(defFile);
		String result = getLanguageVariableText(d, langIdPreferred);
		if (result == null || result == "" || result.contains("Could not find")) {
			result = getLanguageVariableText(d, langIdDefault);
		}
		if (result != null && result.length() > 0) {
				result = result + source(lastFile,lastId);
		}
		return result;
	}
	
	private String getLanguageDisplayName(String id) {
		try {
			String[] parts = id.split("_");
			String language = parts[0];
			if (language.equals("gr")) {
				language = "el";
			}
			Locale locale = new Locale(language, parts[1]);
			return locale.getDisplayLanguage();
		} catch (Exception e) {
			return null;
		}
	}
	
	public String getLanguageVariableText(Definition d, String language) {
		logger.entry(d,language);
		String result = null;
		String [] parts = d.eResource().getURI().lastSegment().split("\\.");
		String bookAcronymn = "";
		try {
			if (parts[0].matches("le")) { // lectionary file names have 3 parts for acronymn
				bookAcronymn = parts[0] + "." + parts[1] + "." + parts[2];
			} else {
				bookAcronymn = parts[0];
			}
		} catch (Exception e) {
			logger.catching(e);
			bookAcronymn = parts[0];
		}
		String resourceName = getVariableResourceFileName(bookAcronymn, language,resourceFileExtension);
		String error = "Could not find item " + d.getName() + " in resource file " + resourceName;
		try {
			String txt = getDefinitionValueById(resourceName, d.getName());
			if (txt != null) {
				txt = convertFormatCodes(txt);
			}
			if (txt == null || txt.equals("null")) {
				if (debug) {
					result = error;
				} else {
					result = "";
				}
			} else {
				result = txt;
			}
		} catch (Exception e) {
			logger.catching(e);
			result = (debug ? error : "");
		} 
		logger.exit(result);
		return result;
	}
	
	public LiturgicalDayProperties getLiturgicalDayProperties() {
		return theDay;
	}

	/**
	 * Gets the locale name for the given type abbreviation
	 * @param type
	 * @return locale name for the type
	 */
	public String getLocaleNameForFileType(String type) {
		return getTextForAbbreviation("file.type.", type);
	}	
	
	/**
	 * Uses the provided filename as the key to find the corresponding resource
	 * in the filenameToUriMap, and returns its URI.
	 * 
	 * @param filename
	 *            - name of the model file, e.g. properties.ppslib
	 * @return the URI for the model file.
	 */
	public org.eclipse.emf.common.util.URI getModelEmfUri(String filename) {
		org.eclipse.emf.common.util.URI uri = filenameToUriMap.get(filename);
		return uri;
	}
	
	public int getNbrColSpaces() {
		return nbrColSpaces;
	}
	
	/**
	 * @return d = Docbook, h = HTML, p = PDF
	 */
	public int getOutputType() {
		return outputType;
	}

	public String getPathToAssetsProject() {
		return pathToAssetsProject;
	}

	public String getPathToMediaProject() {
		return pathToMediaProject;
	}


	public String getPreferenceFileId() {
		return this.preferenceFileId;
	}

	
	/**
	 * For the supplied acronymn, return the filename of the preferred version to use
	 * @param bookAcronymn, e.g. the first part of the ares filename
	 * @return the preferred version filename, i.e., en_US_ematins.ares
	 */
	public String getPreferredVersion1File(String bookAcronymn) {
		String result = "";
		if (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_GOSPEL)) {
			result = getLanguage1GospelPreferredFile();
		} else if (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_EPISTLE)) {
			result = getLanguage1EpistlePreferredFile();
		} else if (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_PSALTER)) { 
			result = getLanguage1PsalterPreferredFile();
		} else if (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_PROPHETOLOGION)) {	
			result = getLanguage1ProphetologionPreferredFile();
		} else {
			result = getLanguage1File();
		}
		return result;
	}
	
	/**
	 * For the supplied acronymn, return the preferred version to use
	 * @param bookAcronymn, e.g. the first part of the ares filename
	 * @return the preferred version
	 */
	public String getPreferredVersion1Id(String bookAcronymn) {
		String result = "";
		if  (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_GOSPEL)) {
			result = getLanguage1GospelPreferred();
		} else if (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_EPISTLE)) {
			result = getLanguage1EpistlePreferred();
		} else if (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_PSALTER)) { 
			result = getLanguage1PsalterPreferred();
		} else if (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_PROPHETOLOGION)) {	
			result = getLanguage1ProphetologionPreferred();
		} else {
			result = getLanguage1Id();
		}
		return result;
	}
	
	/**
	 * For the supplied acronymn, return the filename of the preferred version to use
	 * @param bookAcronymn, e.g. the first part of the ares filename
	 * @return the preferred version filename, i.e., en_US_ematins.ares
	 */
	public String getPreferredVersion2File(String bookAcronymn) {
		String result = "";
		if        (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_GOSPEL)) {
			result = getLanguage2GospelPreferredFile();
		} else if (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_EPISTLE)) {
			result = getLanguage2EpistlePreferredFile();
		} else if (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_PSALTER)) { 
			result = getLanguage2PsalterPreferredFile();
		} else if (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_PROPHETOLOGION)) {	
			result = getLanguage2ProphetologionPreferredFile();
		} else {
			result = getLanguage2File();
		}
		return result;
	}
	
	/**
	 * For the supplied acronymn, return the preferred version to use
	 * @param bookAcronymn, e.g. the first part of the ares filename
	 * @return the preferred version
	 */
	public String getPreferredVersion2Id(String bookAcronymn) {
		String result = "";
		if  (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_GOSPEL)) {
			result = getLanguage2GospelPreferred();
		} else if (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_EPISTLE)) {
			result = getLanguage2EpistlePreferred();
		} else if (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_PSALTER)) { 
			result = getLanguage2PsalterPreferred();
		} else if (bookAcronymn.toLowerCase().startsWith(AlwbConstants.LECTIONARY_PROPHETOLOGION)) {	
			result = getLanguage2ProphetologionPreferred();
		} else {
			result = getLanguage2Id();
		}
		return result;
	}
		
	/**
	 * Follows the definition references until it finds an actual value instead of a key.
	 * @param d 
	 * @return the Definition containing the actual text
	 */
	public Definition getResolvedDefinition(Definition d) {
		if (d.getDsl_Definition_Text() != null) {
			String lastSegment = d.eContainer().eResource().getURI().lastSegment();
			if (! lastSegment.startsWith("pref")) {
				// save info require to retrieve source later on
				lastFile = lastSegment;
				lastId = d.getName();
				if (nonRecursive && showVersion) { // setVersion will result in a call back to here, so need to block it
					setVersion(lastFile);
				}
			}
			return d;
		} else {
			return getResolvedDefinition(d.getDsl_Definition_Ref());
		}
	}

	/**
	 * Load an EMF Resource from the given filename
	 * <p>If the resource is not found, tries again using
	 * the default version.
	 * @param filename
	 * @return EMF resource
	 */
	public Resource getResource(String filename) {
		logger.entry(filename);
		Resource resource = null;
		try {
			XtextResourceSet xTextResourceSet = (XtextResourceSet) this.resourceSet;	
			xTextResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			try {
				resource = xTextResourceSet.getResource(getModelEmfUri(filename), true);
			} catch (Exception i) {
				// see if we can find the default version instead
				resource = xTextResourceSet.getResource(getModelEmfUri(convertFilenameToDefault(filename)), true);
			}
		} catch (Exception e) {
			logger.catching(e);
			resource = null;
	 	}
		return resource;
	}
	
	/**
	 * Iterate the Resources and return the ones whose name matches the filter
	 * @param filter - String to compare the resource name against
	 * @return - those resources whose name matches the filter
	 */
	public List<Resource> getResourcesByFilter(Driver d) {

		String project = d.eResource().getURI().segmentsList().get(1);
		String regEx = d.getDsl_Driver_RegEx();
		String driverStatus = d.getDsl_Driver_Status().getName();
		
		logger.entry();
		List<Resource> result = new ArrayList<Resource>();
		try {
			for (Entry<String, URI> e : filenameToUriMap.entrySet()) {
				if (e.getKey().matches(regEx) && e.getValue().path().contains(project)) {
					try {
						Resource r = getResource(e.getKey());
						if (driverStatus == "NA") { // Status not set in the Generation_Driver
							if (hasComponents(r)) {
								result.add(r);
							}
						} else { // filter using the status of the template
							String status = getStatusOfTemplate(r);
							if (status != null) {
								if (driverStatus.matches(status)) {
									result.add(r);
								}
							}
						}
					} catch (Exception inner) {
						logger.catching(inner);
					}
				}
			}
		} catch (Exception e) {
			logger.catching(e);
	 	}
		return result;
	}
	
	/**
	 * Get the status of a template.
	 * For possible values, see TemplateStatuses in the Atem.xtext file
	 * @param r - the resource to check
	 * @return - the status from the resource.  If the status was undefined,
	 * returns null
	 */
	private String getStatusOfTemplate(Resource r) {
		String result = null;
		AtemModel m = (AtemModel) r.getContents().get(0);
		try {
			TemplateStatuses status = m.getDsl_Template_Status().getDsl_TemplateStatus();
			result = status.getName();
		} catch (Exception e) {
			result = null;
			logger.catching(e);
		}
		return result;
	}
	
	/**
	 * Checks to see if a template has components, i.e. is not empty
	 * @param r
	 * @return
	 */
	private boolean hasComponents(Resource r) {
		boolean result = false;
		AtemModel m = (AtemModel) r.getContents().get(0);
		try {
			if (m.getDsl_Template_components().size() > 0) {
				result = true;
			} else {
				result = false;
			}
		} catch (Exception e) {
			result = false;
			logger.catching(e);
		}
		return result;
	}
	
	private Resource getResourceByKey(Resource r, String key) {
		Resource result = null;
		String resourceName = getDefinitionValueById(r, key);
		if (! resourceName.equals("ares")) {
			 resourceName = resourceName + "." + resourceFileExtension;
		}
		result = getResource(resourceName);
		return result;
	}
	
	/**
	 * AGES Library files, i.e. those ending with .ares, have root parts separated by
	 * periods and language/country/local parts separated by underscores.  This method
	 * splits the filename using the underscore for the char to split on.
	 * @param file - name of file whose root to extract, e.g. HR.01.A_el_GR_cog.ares
	 * @return - the root, e.g. HR.01.A
	 */
	public String getRoot(String file) {
		logger.entry();
		String [] theParts = file.split("_");
		String result = null;
		if (theParts.length == 1) {
			result = theParts[0].replace(".ares", "");
		} else {
			result = theParts[0];
		}
		logger.exit();
		return result;
	}
	

	public long getServiceDate() {
		return serviceDate;
	}

	public TableManager getTableManagerL1() {
		return tableManagerL1;
	}

	/**
	 * When an href is invoked, there is a target specified, i.e. what window to open it in.
	 * This method returns the target based on the file type, e.g. html vs pdf.
	 * @param type
	 * @return
	 */
	public String getTargetForFileType(String type) {
		logger.entry();
		String result = "_self";
			try {
				switch (type.charAt(0)) {
					case 'h' : { result = preferences.indexLinkTargetHtml; break;}
					case 'p' : { result = preferences.indexLinkTargetPdf; break;}
					default: { result = "_self";}
				}
			} catch (Exception e) {
				logger.catching(e);
				result = "_self";
			}
		logger.exit();
		return result;
	}

	public String getTemplateLangId() {
		return templateLanguageId;
	}

	public String getTemplateLanguageFile() {
		return templateLanguageFile;
	}

	/**
	 * Reads the abbreviation resource file and finds the 
	 * text that corresponds to the abbreviation.
	 * @param abbreviation
	 * @return the text that corresponds to that abbreviation
	 */
	public String getTextForAbbreviation(String abbreviation, String suffix) {
		logger.entry();
		String result = "";
		try {
			result = getDefinitionValueById(
						abbreviationResource, 
						abbreviation 
						+ suffix);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return result;
	}
	
	/**
	 * Reads a book template file name and looks up the filename
	 * parts to get the text for the abbreviations used in the filename.
	 * This is used to display on an index
	 * @param parts - the parts of the filename
	 * @return concatenation of the texts for each abbreviation
	 */
	public String getTitleForBookName(List<String> parts) {
		String result = "";
		int index = 1;
		try {
			if (parts.get(index).startsWith("eu")) {
				index++;
			}
			String text;
			for (int i = index; i < parts.size(); i++) {
				text = getTextForAbbreviation(parts.get(i),".html.link");
				if (text == "" || text == null) {
					break;
				} else {
					result = result + " " + text; 
				}
			}
			result = result.trim();
		} catch (Exception e) {
			logger.catching(e);
		}
		return result;
	}

	/** Set pointer to the resource for the abbreviations
	 * 
	 * @return true if found, false if not.
	 */
	public void setAbbreviationResource() {
		try {
			abbreviationResource = getResource(
					this.abbreviationResourcePrefix 
					+ this.getAbbreviationFilePreferred());

		} catch (Exception e) {
			logger.catching(e);
			abbreviationResource = null;
		}
		if (abbreviationResource == null) {
			messageBoard.logMessage(messageBoard.FATAL, 
					"pref.website index.version pointing to non-existent file. Website titles ares file does not exist for " 
					+ this.abbreviationResourcePrefix 
					+ this.getAbbreviationFilePreferred());
		}
	}
	
	/**
	 * Does the abbreviation resource exist?  If it is not,
	 * then the likely cause is that the user set a bad value 
	 * in the index.version.preferred in pref.website
	 * @return true if exists.
	 */
	public boolean abbreviationResourceExists() {
		return abbreviationResource != null;
	}
	
	/**
	 * Wrapper class to add a time stamp to the index.  It is put here because it is easier than 
	 * doing it in the AtemGenerator.
	 * @param file
	 * @return
	 */
	public String getTimestamp(ServiceDayTypeVersionFormat file) {
		if (preferences.indexIncludeFileTimestamp) {
			return  file.getDisplayDate(preferences.indexTimestampDescPrefix, preferences.indexTimestampFormat, preferences.indexTimestampDescSuffix);
		} else {
			return "";
		}
	}
	
	public Map<String,String> getIndexDescriptions(String prefix) {
		Map<String,String> result = new TreeMap<String,String>();
		String desc = null;
		int index = 1;
		do {
			desc = getTextForAbbreviation(prefix,"description"+index);
			if (desc != null && desc.length() > 0) {
				result.put("index-desc-"+index,desc);
			}
			index++;
		} while (desc != null);
		return result;
	}

	/**
	 * Determines whether to look in the Menaion, 
	 * Triodion, or Pentecostarion to get the
	 * commemoration for the day and calculates the acronymn to use.
	 * @return the acronymn to use in the key for a lookup.
	 */
	public String getVariableCommemorationAcronymn() {
		if (theDay.isTriodion()) {
			return AlwbConstants.TRIODION;
		} else if (theDay.isPentecostarion()) {
			return AlwbConstants.PENTECOSTARION;
		} else {
			return AlwbConstants.MENAION;
		}
	}

	/**
	 * Determines whether to look in the Menaion, 
	 * Triodion, or Pentecostarion to get the
	 * commemoration for the day and calculates the filename.
	 * @return the filename of the resource to use.
	 */
	public String getVariableCommemorationResourceName() {
		StringBuilder sb = new StringBuilder();
		if (theDay.isTriodion()) {
			sb.append(AlwbConstants.TRIODION);
			sb.append(".");
			sb.append("d");
			sb.append(theDay.formattedNumber(theDay.getDaysSinceStartOfTriodion(),365));
		} else if (theDay.isPentecostarion()) {
			sb.append(AlwbConstants.PENTECOSTARION);
			sb.append(".");
			sb.append("d");
			sb.append(theDay.formattedNumber(theDay.getDaysSinceStartOfTriodion(),365));
		} else {
			sb.append(AlwbConstants.MENAION);
			sb.append(".");
			sb.append("m");
			sb.append(theDay.getNbrMonth());
			sb.append(".");
			sb.append("d");
			sb.append(theDay.getNbrDayOfMonth());
		}
		sb.append("_");
		sb.append(addAresFileExtension(getHtmlIndexLanguagePreferredFile()));
		return sb.toString();
	}

	/**
	 * Gets the commemoration text appropriate to the season.
	 * The three possibilities are based on whether we are in
	 * the Triodion, the Pentecostarion, or not.
	 * @return
	 */
	public String getVariableCommemorationTextShort() {
		String result = "";
		try {
			result = getDefinitionValueById(
					getResource(getVariableCommemorationResourceName()), 
					getVariableCommemorationAcronymn()
					+AlwbConstants.COMMEMORATION_TEXT_SHORT_KEY);
		} catch (Exception e) {
			result = "";
		}
		return result;
	}

	public String getVariableResourceFileName(String bookAcronymn, String version, String extension) {
		logger.entry(bookAcronymn,version,extension);
		StringBuilder sb = new StringBuilder();
		int eoNbr = 0;
		sb.append(bookAcronymn);
		sb.append(".");
		if (bookAcronymn.matches("eo")) {					// Eothinon - hymns
			sb.append("e");
			eoNbr = theDay.getEothinonNumber();
			sb.append(eoNbr < 10 ? "0" + eoNbr : eoNbr);
		} else if (bookAcronymn.matches("eu")) {				// Euchologion
		} else if (bookAcronymn.matches("he")) { 			// Heirmologion
		} else if (bookAcronymn.matches("ho")) {				// Horologion
		} else if (bookAcronymn.matches("ka")) {				// Katavasias
		} else if (bookAcronymn.matches("le.go.eo")) {		// Eothinon - lectionary
				sb.append("w");
				eoNbr = theDay.getEothinonNumber();
				sb.append(eoNbr < 10 ? "0" + eoNbr : eoNbr);
		} else if (bookAcronymn.matches("le.go.lu")) {		// Lectionary - Gospel - Luke - days since 1st Sunday after September 14 
			sb.append("d");
			sb.append(theDay.formattedNumber(theDay.getDaysSinceSundayAfterLastElevationOfCross(),365));
		} else if (bookAcronymn.matches("le.go.mc")) {		// Lectionary - Gospel - Movable Cycle - days since Triodion started - 3 digits
			sb.append("d");
			sb.append(theDay.formattedNumber(theDay.getDaysSinceStartOfTriodion(),365)); // values go from 71 (Pascha) thru day 120 (Pentecost)
		} else if (bookAcronymn.matches("le.go.me")) {		// Lectionary - Gospel - Menaion - append month and day of month
			sb.append("m");
			sb.append(theDay.getNbrMonth());
			sb.append(".");
			sb.append("d");
			sb.append(theDay.getNbrDayOfMonth());
		} else if (bookAcronymn.matches("le.ep.mc")) {		// Lectionary - Epistles - Movable Cycle 
			sb.append("d");
			sb.append(theDay.formattedNumber(theDay.getDaysSinceStartOfTriodion(),365)); // values go from 71 (Pascha) thru day 120 (Pentecost)
		} else if (bookAcronymn.matches("le.ep.me")) {		// Lectionary - append month and day of month
			sb.append("m");
			sb.append(theDay.getNbrMonth());
			sb.append(".");
			sb.append("d");
			sb.append(theDay.getNbrDayOfMonth());
		} else if (bookAcronymn.matches("da")) {			// Daily stuff
			sb.append("d");
			sb.append(theDay.getNbrDayOfWeek());
		} else if (bookAcronymn.matches("le.pr.tr")) {		// Lectionary - Profetalogion - Movable Cycle 
			sb.append("d");
			sb.append(theDay.formattedNumber(theDay.getDaysSinceStartOfTriodion(),365)); // values go from 71 (Pascha) thru day 120 (Pentecost)
//		} else if (bookAcronymn.matches("le.pr.me")) {		// Lectionary - Profetalogion - Movable Cycle 
//			sb.append("d");
//			sb.append(theDay.formattedNumber(theDay.getDaysSinceStartOfTriodion(),365)); // values go from 71 (Pascha) thru day 120 (Pentecost)
		} else if (bookAcronymn.matches("me")) {				// Menaion
			sb.append("m");
			sb.append(theDay.getNbrMonth());
			sb.append(".");
			sb.append("d");
			sb.append(theDay.getNbrDayOfMonth());
		} else if (bookAcronymn.matches("oc")) {				// Octoechos
			sb.append("m");
			sb.append(theDay.getModeOfWeek());
			sb.append(".");
			sb.append("d");
			sb.append(theDay.getNbrDayOfWeek());
		} else if (bookAcronymn.matches("pe")) {				// Pentecostarion
			sb.append("d");
			sb.append(theDay.formattedNumber(theDay.getDaysSinceStartOfTriodion(),365));
		} else if (bookAcronymn.matches("ps")) {				// Psalter
		} else if (bookAcronymn.matches("tr")) {				// Triodion
			sb.append("d");
			sb.append(theDay.formattedNumber(theDay.getDaysSinceStartOfTriodion(),365));
		} else if (bookAcronymn.matches("sy")) {				// Synaxarion
			sb.append("m");
			sb.append(theDay.getNbrMonth());
			sb.append(".");
			sb.append("d");
			sb.append(theDay.getNbrDayOfMonth());
		}
		logger.exit();
		return sb.toString() + "_" + version + "." + extension;
	}

	/**
	 * Reads the client's acronym resource file and gets the locale name for the given language
	 * @return the name of the language for version 2
	 */
	public String getVersionLocaleName(String acronym) {
		logger.entry();
		String result = "";
		try {
			result = getTextForAbbreviation("lang", acronym);
		} catch (Exception e) {
			logger.exit();
		}
		logger.exit();
		return result;
	}

	/**
	 * Returns the Locale name for the language(s) contained in the generated text
	 * @return locale name of language(s), e.g. gr-en becomes Greek-English
	 */
	public String getVersionLocaleNames() {
		logger.entry();
		String result = "";
		String prefix = "lang.";
		try {
			String [] parts = getFolderLanguageAcronym().split("-");
			if (parts.length == 1) { // this is a monolingual text
				result = getTextForAbbreviation(prefix, parts[0]);
			} else { // this is a bilingual text
				result = getTextForAbbreviation(prefix, parts[0]) 
						+ getTextForAbbreviation(prefix, "delimiter") 
						+ getTextForAbbreviation(prefix, parts[1]);				
			}
		} catch (Exception e) {
			logger.exit();
		}
		logger.exit();
		return result;
	}

	public boolean includeMediaAudioLinks() {
		return includeMediaAudioLinks;
	}

	public boolean includeMediaDocumentLinks() {
		return includeMediaDocumentLinks;
	}

	public boolean includeMediaLinks() {
		return includeMediaLinks;
	}

	public boolean includeMediaScoreByzantineLinks() {
		return includeMediaScoreByzantineLinks;
	}

	public void includeMediaScoreByzantineLinks(boolean include) {
		includeMediaScoreByzantineLinks = include;
		Media.includeByzantine(include);
	}

	public boolean includeMediaScoreWesternLinks() {
		return includeMediaScoreWesternLinks;
	}

	public void includeMediaScoreWesternLinks(boolean include) {
		includeMediaScoreWesternLinks = include;
		Media.includeWestern(include);
	}
	
	private void initializeResourceMap() {
		resourceMap.put("Eothinon","eo");
		resourceMap.put("Euchologion","eu");
		resourceMap.put("Heirmologion","he"); 
		resourceMap.put("Horologion","ho");
		resourceMap.put("Katavasias","ka");
		resourceMap.put("Lectionary","le"); 
		resourceMap.put("Menaion","me"); 
		resourceMap.put("Midnight Service","mi"); 
		resourceMap.put("Octoechos","oc"); 
		resourceMap.put("Pentecostarion","pe"); 
		resourceMap.put("Psalter","ps"); 
		resourceMap.put("Triodion","tr"); 
		resourceMap.put("Synaxarion","sy"); 
	}

	public boolean showSource() {
		return showSource;
	}
	
	public boolean showDomain() {
		return showDomain;
	}

	public boolean language1IsEditable() {
		return l1Editable;
	}

	public boolean language2IsEditable() {
		return l2Editable;
	}

	/**
	 * Are we to return only media Hrefs, i.e. no text as well?
	 * @return
	 */
	public boolean mediaOnly() {
		return mediaOnly;
	}

	public String normalizedFilename(String name) {
		return getBundleName(name) + "_" + getRoot(name);
	}

	public String pdfFileRoot(String root) {
		logger.entry();
		String result = root;
		String[] parts = null;
		try {
			parts = root.split("\\.");
			result = parts[0]
					+ "."
					+ theDay.getYear()
					+ "."
					+ parts[1].replaceFirst("m", "")
					+ "."
					+ parts[2].replace("d", "")
					+ "."
					+ parts[4]
					+ "."
					+ getFolderLanguageAcronym()
					;
		} catch (Exception e) {
			logger.catching(e);
			result = root;
		}
		logger.exit();
		return result;
	}

	/**
	 * Read the preference store and set the preference properties stored
	 * in this instance of ModelAccessor.  If the user did not select a 
	 * language to use for generation, it will default to el_GR_cog
	 */
	public void readGenerationPreferences() {
		
		// First read in the preferences set via Eclipse
		setShowSource(AlwbGeneralUtils.getAgesBooleanPreference(AlwbConstants.P_BOOLEAN_SHOW_SOURCE));
		setGenerateMessagesHtml(AlwbGeneralUtils.getAgesBooleanPreference(AlwbConstants.P_BOOLEAN_GEN_MESSAGES_HTML));
		setShowDomain(AlwbGeneralUtils.getAgesBooleanPreference(AlwbConstants.P_BOOLEAN_SHOW_DOMAIN));
		setDebug(AlwbGeneralUtils.getAgesBooleanPreference(AlwbConstants.P_BOOLEAN_DEBUG));
		setPreferenceFileId(AlwbGeneralUtils.getAgesStringPreference(AlwbConstants.P_STRING_PREFERENCES_MAIN));

		// Now read in the preferences set in the pref*.ares files
		initializePerferenceManager();
		
		setCopyPreferences();
		
		setPathToAssetsProject(AlwbGeneralUtils.getAgesStringPreference(AlwbConstants.P_STRING_ASSETS_ROOT_FOLDER));
		setPathToMediaProject(AlwbGeneralUtils.getAgesStringPreference(AlwbConstants.P_STRING_MEDIA_ROOT_FOLDER));
		setHtmlSiteRoot(preferences.htmlSiteRoot);
		setHtmlServiceFolderRoot(preferences.htmlServiceFolderRoot);
		setHtmlBookFolderRoot(preferences.htmlBookFolderRoot);
		setHtmlCustomFolderRoot(preferences.htmlCustomFolderRoot);
		
		setOutputTypes();
		setNbrColSpaces(preferences.nbrSpaces);
		setTemplateLanguageId(preferences.templateLanguage);
		setIncludeMediaDocumentLinks(preferences.includeMediaDocumentLinks);
		setIncludeMediaAudioLinks(preferences.includeMediaAudioLinks);
		includeMediaScoreByzantineLinks(preferences.includeMediaScoreByzantineLinks);
		includeMediaScoreWesternLinks(preferences.includeMediaScoreWesternLinks);
		setIncludeMediaLinks();
		setGenerateResources(preferences.genResources);
		setGenerateSiteIndex(preferences.genIndexServices);
		setHtmlIndexLanguageDefault(preferences.htmlIndexLanguageDefault);
		setHtmlIndexLanguagePreferred(preferences.htmlIndexLanguagePreferred);
		setAbbreviationFileDefault(getHtmlIndexLanguageDefault());
		setAbbreviationFilePreferred(getHtmlIndexLanguagePreferred());
		setLanguageUsePreferences();
		setMakeLanguage1Editable(preferences.makeL1Editable);
		setMakeLanguage2Editable(preferences.makeL2Editable);
		setLanguage1Id(preferences.language1);
		setLanguage1DefaultId(preferences.language1Default);
		setLanguage2Id(preferences.language2);
		setLanguage2DefaultId(preferences.language2Default);
		if (useLanguage1 == false && useLanguage2 == false) {
			setUseLanguage1(true);
		}
		if (getLanguage1Id() == null && getLanguage2Id() == null) {
				setLanguage1Id("gr_GR_cog");
		}

		setLanguage1EpistleDefault(preferences.language1EpistleDefault);
		setLanguage1GospelDefault(preferences.language1GospelDefault);
		setLanguage1ProphetologionDefault(preferences.language1ProphetologionDefault);
		setLanguage1PsalterDefault(preferences.language1PsalterDefault);
		
		setLanguage1EpistlePreferred(preferences.language1EpistlePreferred);
		setLanguage1GospelPreferred(preferences.language1GospelPreferred);
		setLanguage1ProphetologionPreferred(preferences.language1ProphetologionPreferred);
		setLanguage1PsalterPreferred(preferences.language1PsalterPreferred);

		setLanguage2EpistleDefault(preferences.language2EpistleDefault);
		setLanguage2GospelDefault(preferences.language2GospelDefault);
		setLanguage2ProphetologionDefault(preferences.language2ProphetologionDefault);
		setLanguage2PsalterDefault(preferences.language2PsalterDefault);
		
		setLanguage2EpistlePreferred(preferences.language2EpistlePreferred);
		setLanguage2GospelPreferred(preferences.language2GospelPreferred);
		setLanguage2ProphetologionPreferred(preferences.language2ProphetologionPreferred);
		setLanguage2PsalterPreferred(preferences.language2PsalterPreferred);
	
		setGenerateJsonFile(preferences.genTmsJsonFile);
		
		setAbbreviationResource();
		
	}

	private String reportIssue(String method, String filename, String key, String error) {
		return "While looking for " 
	           + key 
	           + " in file " 
	           + filename
	           + ", "
	           + method
	           + " returned "
	           + error;
	}

	/** 
	 * Reset the Href row to blank.
	 * <p>This is needed so that we don't have an hrefs row hanging around from a previous hymn
	 */
	public void resetHrefsRow() {
		hrefRow = "";
	}

	public String resolveKey(Definition d, String defFile) {
		logger.entry();
		String result = "";
		try {
			if (d.getDsl_Definition_Text() != null) {
				result = normalizedFilename(defFile) + "." + d.getName();
			} else {
				result = normalizedFilename(defFile) + "." + d.getDsl_Definition_Ref().getName();
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return result;
	}
	
	public void setAbbreviationFileDefault(String version) {
		this.abbreviationFileDefault = addAresFileExtension(version);
	}
	
	public void setAbbreviationFilePreferred(String version) {
		this.abbreviationFilePreferred = addAresFileExtension(version);
	}
	
	/**
	 * Sets the value of the key to use in the anchor tag when including the key with the text
	 * @param key
	 */
	private void setAnchor(String key) {
		this.key = "<emphasis role='key' data-key='" + key + "'/>";
	}
	
	public void setCopyCss(boolean copyCss) {
		this.copyCss = copyCss;
	}

	public void setCopyJs(boolean copyJs) {
		this.copyJs = copyJs;
	}

	public void setCopyRoot(boolean copyRoot) {
		this.copyRoot = copyRoot;
	}

	public void setCopyMedia(boolean copyMedia) {
		this.copyMedia = copyMedia;
	}


	public void setCopyCssFrom(String copyCssFrom) {
		this.copyCssFrom = copyCssFrom;
	}

	public void setCopyJsFrom(String copyJsFrom) {
		this.copyJsFrom = copyJsFrom;
	}

	public void setCopyRootFrom(String copyRootFrom) {
		this.copyRootFrom = copyRootFrom;
	}

	public void setCopyMediaFrom(String copyMediaFrom) {
		this.copyMediaFrom = copyMediaFrom;
	}
	
	public void setCopyPreferences() {
		setCopyCss(preferences.copyHtmlCssFiles);
		setCopyJs(preferences.copyHtmlJsFiles);
		setCopyRoot(preferences.copyHtmlMainFiles);
		setCopyMedia(preferences.copyHtmlMediaFiles);
		setCopyCssFrom(preferences.htmlCssPath);
		setCopyJsFrom(preferences.htmlJsPath);
		setCopyRootFrom(preferences.htmlMainPath);
		setCopyMediaFrom(preferences.htmlMediaPath);
	}


	public void setCommemoration(String c) {
		if (c.equals("Not found")) {
			commemoration = "";
		} else {
			commemoration = c;
		}
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}
	public void setGenerateDelimitedFile(boolean generate) {
		generateDelimitedFile = generate;
	}

	public void setGenerateDocbookFile(boolean generate) {
		generateDocbookFile = generate;
	}

	public void setGenerateEpubVersion1(boolean generateEpubVersion1) {
		this.generateEpubVersion1 = generateEpubVersion1;
	}

	public void setGenerateEpubVersion1And2(boolean generateEpubVersion1And2) {
		this.generateEpubVersion1And2 = generateEpubVersion1And2;
	}
	
	public void setGenerateEpubVersion2(boolean generateEpubVersion2) {
		this.generateEpubVersion2 = generateEpubVersion2;
	}
	
	public void setGenerateHtmlFile(boolean generate) {
		generateHtmlFile = generate;
	}
	
	public void setGenerateHtmlVersion1(boolean generateHtmlVersion1) {
		this.generateHtmlVersion1 = generateHtmlVersion1;
	}

	public void setGenerateHtmlVersion1And2(boolean generateHtmlVersion1And2) {
		this.generateHtmlVersion1And2 = generateHtmlVersion1And2;
	}
	
	public void setGenerateHtmlVersion2(boolean generateHtmlVersion2) {
		this.generateHtmlVersion2 = generateHtmlVersion2;
	}
	
	public void setGenerateJsonFile(boolean generateJsonFile) {
		this.generateJsonFile = generateJsonFile;
	}
	
	public void setGeneratePdfFile(boolean generate) {
		generatePdfFile = generate;
	}
	

	public void setGeneratePdfVersion1(boolean generatePdfVersion1) {
		this.generatePdfVersion1 = generatePdfVersion1;
	}

	public void setGeneratePdfVersion1And2(boolean generatePdfVersion1And2) {
		this.generatePdfVersion1And2 = generatePdfVersion1And2;
	}

	public void setGeneratePdfVersion2(boolean generatePdfVersion2) {
		this.generatePdfVersion2 = generatePdfVersion2;
	}

	
	public void setGenerateResources(boolean generateResources) {
		this.generateResources = generateResources;
	}

	public void setGenerateSiteIndex(boolean value) {
		generateIndexServices = value;
	}

	public void setGenerateBooksIndex(boolean value) {
		generateIndexBooks = value;
	}
	public void setGenerateCustomIndex(boolean value) {
		generateIndexCustom = value;
	}
	/**
	 * The purpose of this method is to switch language use
	 * preferences while generating multiple file types.
	 * @param to - the type to switch to, e.g. EPUB, HTML, PDF,
	 * which are constants defined as public values in this
	 * class.
	 */
	public void setGenerationLanguages(int to, boolean l1, boolean l2) {

		useLanguage1 = false; 
		useLanguage2 = false;
		
		switch (to) {
			case AlwbConstants.EPUB: {
				if (l1 && l2 && generateEpubVersion1And2) {
					useLanguage1 = true; 
					useLanguage2 = true; 
				} else {
					useLanguage1 = (l1 && generateEpubVersion1); 
					useLanguage2 = (l2 && generateEpubVersion2); 
				}
				break;
			}
			case AlwbConstants.HTML: {
				if (l1 && l2 && generateHtmlVersion1And2) {
					useLanguage1 = true; 
					useLanguage2 = true; 
				} else {
					useLanguage1 = (l1 && generateHtmlVersion1); 
					useLanguage2 = (l2 && generateHtmlVersion2); 
				}
				break;
			}
			case AlwbConstants.PDF: {
				if (l1 && l2 && generatePdfVersion1And2) {
					useLanguage1 = true; 
					useLanguage2 = true; 
				} else {
					useLanguage1 = (l1 && generatePdfVersion1); 
					useLanguage2 = (l2 && generatePdfVersion2); 
				}
				break;
			}
		}
	}

	/**
	 * Problem: we don't know the media HREFs for a given key until
	 * we have computed the key and found the text.  We want the HREFs Row 
	 * to appear before the Row containing the text.  But, the text row and <p> tag are
	 * set in the AtemGenerator.  The solution is to store the HREF Row as 
	 * as part of the processing of finding the text, then let the AtemGenerator
	 * retrieve it afterward and reorder the elements so the HREF Row comes first,
	 * then the row for the text.
	 * @param key
	 */
	public void setHrefsRow(String key) {
		logger.entry();
		if (! suppressMedia) { // flag set by AtemGenerator when it processed a specific ResourceText (sid tag) or Lookup (rid tag)
			if (mediaOnly) { // we only want the Hrefs for the language currently being processed
				hrefRow = getHrefs(key);
			} else {
				hrefRow += getHrefs(key); // we append, so we get both languages
			}
		}
		if (hrefRow == null || hrefRow.startsWith("null")) {
			logger.error("Hfref null for key " + key);
			hrefRow = "";
		}
	}
	public void setHtmlSiteRoot(String htmlSiteRoot) {
		this.htmlSiteRoot = htmlSiteRoot;
	}

	public void setHtmlServiceFolderRoot(String htmlServiceFolderRoot) {
		this.htmlServiceFolderRoot = htmlServiceFolderRoot;
	}

	public void setHtmlBookFolderRoot(String htmlBookFolderRoot) {
		this.htmlBookFolderRoot = htmlBookFolderRoot;
	}

	public void setHtmlCustomFolderRoot(String htmlCustomFolderRoot) {
		this.htmlCustomFolderRoot = htmlCustomFolderRoot;
	}

	public void setHtmlIndexLanguageDefault(String htmlIndexLanguageDefault) {
		this.htmlIndexLanguageDefault = htmlIndexLanguageDefault;
	}
	
	public void setHtmlIndexLanguagePreferred(String htmlIndexLanguagePreferred) {
		this.htmlIndexLanguagePreferred = htmlIndexLanguagePreferred;
	}

	public void setIncludeMediaAudioLinks(boolean include) {
		includeMediaAudioLinks= include;
		Media.includeAudio(include); 
	}

	public void setIncludeMediaDocumentLinks(boolean include) {
		includeMediaDocumentLinks= include;
		Media.includeDocument(include); 
	}
	
	/**
	 * If set to true, it means one or more media types are set to true
	 * @param include
	 */
	public void setIncludeMediaLinks() {
		includeMediaLinks = (
				includeMediaAudioLinks()  || 
				includeMediaScoreByzantineLinks() 
				|| includeMediaScoreWesternLinks()
				|| includeMediaDocumentLinks()
			);
	}


	public void setIncludeMediaLinks(boolean v) {
		includeMediaLinks = v;
	}
	
	public void setLanguage1DefaultFile(String lang1DefaultId) {
		this.language1DefaultFile = addAresFileExtension(lang1DefaultId);
	}
	
	private void setLanguage1DefaultId(String language1DefaultId) {
		if (language1DefaultId.matches("Not found")) {
			this.language1DefaultId = null;
			this.language1DefaultFile = null;
		} else {
			this.language1DefaultId = language1DefaultId;
			setLanguage1DefaultFile(language1DefaultId);
		}
	}
	
	public void setLanguage1EpistleDefault(String language1EpistleDefault) {
		this.language1EpistleDefault = language1EpistleDefault;
		setLanguage1EpistleDefaultFile(language1EpistleDefault);
	}
	
	public void setLanguage1EpistleDefaultFile(String language1EpistleDefaultFile) {
		this.language1EpistleDefaultFile = addAresFileExtension(language1EpistleDefaultFile);
	}

	public void setLanguage1EpistlePreferred(String language1EpistlePreferred) {
		this.language1EpistlePreferred = language1EpistlePreferred;
		setLanguage1EpistlePreferredFile(language1EpistlePreferred);
	}
	
	public void setLanguage1EpistlePreferredFile(
			String language1EpistlePreferredFile) {
		this.language1EpistlePreferredFile = addAresFileExtension(language1EpistlePreferredFile);
	}

	public void setLanguage1File(String lang1Id) {
		this.language1File = addAresFileExtension(lang1Id);
	}
	
	public void setLanguage1GospelDefault(String language1GospelDefault) {
		this.language1GospelDefault = language1GospelDefault;
		setLanguage1GospelDefaultFile(language1GospelDefault);
	}
	
	public void setLanguage1GospelDefaultFile(String language1GospelDefaultFile) {
		this.language1GospelDefaultFile = addAresFileExtension(language1GospelDefaultFile);
	}

	
	public void setLanguage1GospelPreferred(String language1GospelPreferred) {
		this.language1GospelPreferred = language1GospelPreferred;
		setLanguage1GospelPreferredFile(language1GospelPreferred);
	}
	
	public void setLanguage1GospelPreferredFile(String language1GospelPreferredFile) {
		this.language1GospelPreferredFile = addAresFileExtension(language1GospelPreferredFile);
	}
	
	/**
	 * When ModelAccessor is instantiated, it reads the preference store to determine what
	 * languages the user wants when generating services.  This method is private, because
	 * it does not set the value in the preference store, but just the cached value in this
	 * instance of ModelAccessor.
	 * @param language1Id - the ID of the first language to use, e.g. el_GR_cog
	 */	
	private void setLanguage1Id(String language1Id) {
		if (language1Id.matches("Not found")) {
			this.language1Id = null;
			this.language1File = null;
		} else {
			this.language1Id = language1Id;
			setLanguage1File(language1Id);
			language1IdOriginal = this.language1Id;
			language1FileOriginal = this.language1File;
		}
	}

	public void setLanguage1ProphetologionDefault(
			String language1ProphetologionDefault) {
		this.language1ProphetologionDefault = language1ProphetologionDefault;
		setLanguage1ProphetologionDefaultFile(language1ProphetologionDefault);
	}
	
	public void setLanguage1ProphetologionDefaultFile(
			String language1ProphetologionDefaultFile) {
		this.language1ProphetologionDefaultFile = addAresFileExtension(language1ProphetologionDefaultFile);
	}

	public void setLanguage1ProphetologionPreferred(
			String language1ProphetologionPreferred) {
		this.language1ProphetologionPreferred = language1ProphetologionPreferred;
		setLanguage1ProphetologionPreferredFile(language1ProphetologionPreferred);
	}


	public void setLanguage1ProphetologionPreferredFile(
			String language1ProphetologionPreferredFile) {
		this.language1ProphetologionPreferredFile = addAresFileExtension(language1ProphetologionPreferredFile);
	}
	
	public void setLanguage1PsalterDefault(String language1PsalterDefault) {
		this.language1PsalterDefault = language1PsalterDefault;
		setLanguage1PsalterDefaultFile(language1PsalterDefault);
	}

	public void setLanguage1PsalterDefaultFile(String language1PsalterDefaultFile) {
		this.language1PsalterDefaultFile = addAresFileExtension(language1PsalterDefaultFile);
	}

	public void setLanguage1PsalterPreferred(String language1PsalterPreferred) {
		this.language1PsalterPreferred = language1PsalterPreferred;
		setLanguage1PsalterPreferredFile(language1PsalterPreferred);
	}

	public void setLanguage1PsalterPreferredFile(
			String language1PsalterPreferredFile) {
		this.language1PsalterPreferredFile = addAresFileExtension(language1PsalterPreferredFile);
	}
	
	public void setLanguage2DefaultFile(String lang2DefaultId) {
		this.language2DefaultFile = addAresFileExtension(lang2DefaultId);
	}

	private void setLanguage2DefaultId(String language2DefaultId) {
		if (language2DefaultId.matches("Not found")) {
			this.language2DefaultId = null;
			this.language2File = null;
		} else {
			this.language2DefaultId = language2DefaultId;
			setLanguage2DefaultFile(language2DefaultId);
		}
	}

	public void setLanguage2EpistleDefault(String language2EpistleDefault) {
		this.language2EpistleDefault = language2EpistleDefault;
		setLanguage2EpistleDefaultFile(language2EpistleDefault);
	}

	public void setLanguage2EpistleDefaultFile(String language2EpistleDefaultFile) {
		this.language2EpistleDefaultFile = addAresFileExtension(language2EpistleDefaultFile);
	}


	public void setLanguage2EpistlePreferred(String language2EpistlePreferred) {
		this.language2EpistlePreferred = language2EpistlePreferred;
		setLanguage2EpistlePreferredFile(language2EpistlePreferred);
	}
	
	public void setLanguage2EpistlePreferredFile(
			String language2EpistlePreferredFile) {
		this.language2EpistlePreferredFile = addAresFileExtension(language2EpistlePreferredFile);
	}
	
	public void setLanguage2File(String lang2Id) {
		this.language2File = addAresFileExtension(lang2Id);
	}

	public void setLanguage2GospelDefault(String language2GospelDefault) {
		this.language2GospelDefault = language2GospelDefault;
		setLanguage2GospelDefaultFile(language2GospelDefault);
	}

	public void setLanguage2GospelDefaultFile(String language2GospelDefaultFile) {
		this.language2GospelDefaultFile = addAresFileExtension(language2GospelDefaultFile);
	}
	
	public void setLanguage2GospelPreferred(String language2GospelPreferred) {
		this.language2GospelPreferred = language2GospelPreferred;
		setLanguage2GospelPreferredFile(language2GospelPreferred);
	}	

	public void setLanguage2GospelPreferredFile(String language2GospelPreferredFile) {
		this.language2GospelPreferredFile = addAresFileExtension(language2GospelPreferredFile);
	}
	
	/**
	 * When ModelAccessor is instantiated, it reads the preference store to determine what
	 * languages the user wants when generating services.  This method is private, because
	 * it does not set the value in the preference store, but just the cached value in this
	 * instance of ModelAccessor.
	 * @param language2Id - the ID of the second language to use, e.g. en_US_goarch
	 **/
	private void setLanguage2Id(String language2Id) {
		if (language2Id.matches("Not found")) {
			this.language2Id = null;
			this.language2File = null;
		} else {
			this.language2Id = language2Id;
			setLanguage2File(language2Id);
			language2IdOriginal = this.language2Id;
			language2FileOriginal = this.language2File;
		}
	}
	
	public void setLanguage2ProkeimenaDefault(String language2ProkeimenaDefault) {
		this.language2ProkeimenaDefault = language2ProkeimenaDefault;
		setLanguage2ProkeimenaDefaultFile(language2ProkeimenaDefault);
	}
	
	public void setLanguage2ProkeimenaDefaultFile(
			String language2ProkeimenaDefaultFile) {
		this.language2ProkeimenaDefaultFile = addAresFileExtension(language2ProkeimenaDefaultFile);
	}

	
	public void setLanguage2ProkeimenaPreferred(String language2ProkeimenaPreferred) {
		this.language2ProkeimenaPreferred = language2ProkeimenaPreferred;
		setLanguage2ProkeimenaPreferredFile(language2ProkeimenaPreferred);
	}
	
	
	public void setLanguage2ProkeimenaPreferredFile(
			String language2ProkeimenaPreferredFile) {
		this.language2ProkeimenaPreferredFile = addAresFileExtension(language2ProkeimenaPreferredFile);
	}

	public void setLanguage2ProphetologionDefault(
			String language2ProphetologionDefault) {
		this.language2ProphetologionDefault = language2ProphetologionDefault;
		setLanguage2ProphetologionDefaultFile(language2ProphetologionDefault);
	}
	
	public void setLanguage2ProphetologionDefaultFile(
			String language2ProphetologionDefaultFile) {
		this.language2ProphetologionDefaultFile = addAresFileExtension(language2ProphetologionDefaultFile);
	}

	public void setLanguage2ProphetologionPreferred(
			String language2ProphetologionPreferred) {
		this.language2ProphetologionPreferred = language2ProphetologionPreferred;
		setLanguage2ProphetologionPreferredFile(language2ProphetologionPreferred);
	}
	 
	public void setLanguage2ProphetologionPreferredFile(
			String language2ProphetologionPreferredFile) {
		this.language2ProphetologionPreferredFile = addAresFileExtension(language2ProphetologionPreferredFile);
	}
	
	public void setLanguage2PsalterDefault(String language2PsalterDefault) {
		this.language2PsalterDefault = language2PsalterDefault;
		setLanguage2PsalterDefaultFile(language2PsalterDefault);
	}

	public void setLanguage2PsalterDefaultFile(String language2PsalterDefaultFile) {
		this.language2PsalterDefaultFile = addAresFileExtension(language2PsalterDefaultFile);
	}
	
	public void setLanguage2PsalterPreferred(String language2PsalterPreferred) {
		this.language2PsalterPreferred = language2PsalterPreferred;
		setLanguage2PsalterPreferredFile(language2PsalterPreferred);
	}
	
	public void setLanguage2PsalterPreferredFile(
			String language2PsalterPreferredFile) {
		this.language2PsalterPreferredFile = addAresFileExtension(language2PsalterPreferredFile);
	}

	private void setLanguageUsePreferences() {
		generateHtmlVersion1 = preferences.genHtmlLanguage1;
		generateHtmlVersion2 = preferences.genHtmlLanguage2;
		generateHtmlVersion1And2 = preferences.genHtmlLanguage12;
		generatePdfVersion1 = preferences.genPdfLanguage1;
		generatePdfVersion2 = preferences.genPdfLanguage2;
		generatePdfVersion1And2 = preferences.genPdfLanguage12;
		generateEpubVersion1 = preferences.genEpubLanguage1;
		generateEpubVersion2 = preferences.genEpubLanguage2;
		generateEpubVersion1And2 = preferences.genEpubLanguage12;
	}
	
	/**
	 * Sets the Liturgical date from the settings in the template. If the year was not
	 * specified, uses the current year.
	 * @param date
	 */
	public void setLiturgicalDate(net.ages.workbench.templates.dsl.atem.Date date) {
		try {
			if (date.getDsl_Date_day() > 0 && date.getDsl_Date_day() < 32 && date.getDsl_Date_month() < 13) {
				String year = "";
				try {
					year = String.valueOf(date.getDsl_Date_year());
	
					if (year.length() == 1) {
						year = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
					}
				} catch (Exception e) {
					year = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
				}
				theDay.setDateTo(year, String.valueOf(date.getDsl_Date_month()), String.valueOf(date.getDsl_Date_day()));
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		
	}
	
	/**
	 * Process request from template to override the 
	 * movable cycle to a day specified by the creator
	 * of the template
	 * @param d
	 */
	public void overrideMovableCycleDay(int d) {
		theDay.overrideMovableCycleDay(d);
	}
	
	private void setLiturgicalDayProperties(LiturgicalDayProperties theDay) {
		this.theDay = theDay;
	}

	private void setMakeLanguage1Editable(boolean editable) {
		this.l1Editable = editable;
	}
	
	private void setMakeLanguage2Editable(boolean editable) {
		this.l2Editable = editable;
	}
	

	/**
	 * Creates an instance of the Media class for each of the two languages.  
	 */
	private void setMedia() {
		logger.entry();
		String prefix = "media_";
		String suffix = "." + resourceFileExtension;
		/**
		 * 	media.v1.preferred = "gr_GR_snc"
			media.v1.fallback = "gr_GR_cog"
			media.v2.preferred = "en_US_snc"
			media.v2.fallback = "en_US_dedes" 
		 */
			try {
				mediaL1 = new Media(getResource(
								prefix + preferences.language1MediaPreferred + suffix),
								loadOptions,1,preferences);
			} catch (Exception e) {
				logger.catching(e);
				mediaL1 = null;
				logger.info("No media.ares file found for " + preferences.language1MediaPreferred + ".");
			}
			try {
				mediaL1d = new Media(getResource(
						prefix + preferences.language1MediaDefault + suffix),
						loadOptions,1,preferences);
			} catch (Exception ee) {
				logger.catching(ee);
				mediaL1d = null;
				logger.info("No media.ares file found for " + preferences.language1MediaDefault + ".");
			}
			try {
				mediaL2 = new Media(getResource(
						prefix + preferences.language2MediaPreferred + suffix), 
						loadOptions,2,preferences);
			} catch (Exception e) {
				logger.catching(e);
				mediaL2 = null;
				logger.info("No media.ares file found for " + preferences.language2MediaPreferred + ".");
			}
			try {
				mediaL2d = new Media(getResource(
						prefix + preferences.language2MediaDefault + suffix),
						loadOptions,2,preferences);
			} catch (Exception ee) {
				logger.catching(ee);
				mediaL2d = null;
				logger.info("No media.ares file found for " + preferences.language2MediaDefault + ".");
			}
		logger.exit();
	}
	
	/** 
	 * Controls whether a call for text will return only the media hrefs
	 * @param value - true = set flag for returning only media hrefs
	 */
	public void setMediaOnly(boolean value) {
		mediaOnly = value;
	}

	public void setNbrColSpaces(int nbrColSpaces) {
		this.nbrColSpaces = nbrColSpaces;
	}

	public void setOutputType(int type, boolean l1, boolean l2) {
		outputType = type;
		setGenerationLanguages(type, l1, l2);
	}

	public void setOutputTypes() {
		setGenerateDelimitedFile(preferences.genTmsJsonFile);
		setGenerateHtmlFile(preferences.genHtmlFile);
		setGeneratePdfFile(preferences.genPdfFile);
	}

	public void setPathToAssetsProject(String pathToAssetsProject) {
		this.pathToAssetsProject = pathToAssetsProject;
	}

	public void setPathToMediaProject(String pathToMediaProject) {
		this.pathToMediaProject = pathToMediaProject;
	}

	public void setPreferenceFileId(String id) {
		try {
			preferenceFileId = getFilename(id);
		} catch (Exception e) {
			logger.catching(e);
			this.preferenceFileId = id;
		}
	}
	
	public String getFilename(String path) {
		logger.entry(path);
		File f = new File(path);
		try {
			return f.getName();
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return path;
	}
	
	private void initializePerferenceManager() {
		logger.entry();
		try {
			Resource master = getResource(preferenceFileId);
			Resource main = getResourceByKey(master, AlwbConstants.PREF_STRING_PREFERENCES_SELECTED_MAIN);
			Resource resourceHtml = getResourceByKey(main, AlwbConstants.PREF_STRING_PREFERENCES_HTML);
			Resource resourcePdf = getResourceByKey(main, AlwbConstants.PREF_STRING_PREFERENCES_PDF);
			Resource resourceVersion = getResourceByKey(main, AlwbConstants.PREF_STRING_PREFERENCES_VERSION);
			Resource resourceWebsite = getResourceByKey(main, AlwbConstants.PREF_STRING_PREFERENCES_WEBSITE);
			Resource resourceGeneration =  getResourceByKey(main, AlwbConstants.PREF_STRING_PREFERENCES_GENERATION);

			preferences = new Preferences(main, loadOptions, 
						resourceHtml, resourcePdf, 
						resourceVersion, resourceWebsite, 
						resourceGeneration);
			
		} catch (Exception e) {
			logger.catching(e);
		}
	}

	/**
	 * @param serviceDate in milliseconds as read from preference page
	 * If there is an error, the serviceDate will be set to today
	 */public void setServiceDate(String serviceDate) {
		 logger.entry(serviceDate);
		 try {
		this.serviceDate =  Long.parseLong(serviceDate);
		} catch (Exception e) {
			logger.catching(e);
			this.serviceDate = Calendar.getInstance().getTimeInMillis();
		}
		logger.exit();
	}

	public void setShowDomain(boolean showDomain) {
		this.showDomain = showDomain;
	}

	public void setShowSource(boolean showSource) {
		this.showSource = showSource;
	}

	public void setShowVersion(boolean showVersion) {
		this.showVersion = showVersion;
	}

	public void setGenerateMessagesHtml(boolean value) {
		this.generateMessagesHtml = value;
	}

	public void setTemplateLanguageFile(String templateLanguageFile) {
		this.templateLanguageFile = addAresFileExtension(templateLanguageFile);
	}
	
	public void setTemplateLanguageId(String langId) {
		this.templateLanguageId = langId;
		setTemplateLanguageFile(langId);
	}
	
	private void setUseLanguage1(boolean useLanguage1) {
		this.useLanguage1 = useLanguage1;
	}

	private void setUseLanguage2(boolean useLanguage2) {
		this.useLanguage2 = useLanguage2;
	}
	
	private String getKeySpan(String file, String id) {
		return "<span class='key' data-key='" + file.replace(".ares", "") + "|"+ id + "' hidden='hidden'></span>"; 
	}
	
	/**
	 * Creates a string to be displayed in the HTML to show the source of the text.
	 * Also stores the key into a master keySet to be appended to an HTML file
	 * @param file
	 * @param id
	 * @return
	 */
	public String source(String file, String id) {
		logger.entry(file,id);
		String span = getKeySpan(file,id);
		if (span.contains("sy.m12.d20_gr_GR_cog|S04.commemoration.text")) {
			span = span;
		}
		String result = "";
		if (! file.startsWith("pref")) {
			if (showSource) {
					result = dropExtension(file) + id;
			} else if (showDomain) {
				result = AlwbGeneralUtils.getDomainFromAresFile(file) + result;
			}
		}
		logger.exit();
		if (result != "") {
			result = " (from " + result + ")";
		}
		result = result + span;
		return result;
	}	
	/**
	 * Performs a lookup to see if there is a description 
	 * of the version of the text, e.g. RSV, KJV, Dedes, COG.
	 * for version v1
	 * @param domain
	 * @return version
	 */
	
	public String getTextVersion1() {
		String result = "";
		if (preferences.displayVersionOfTextV1) {
			result = getVersions();
		}
		return result;
	}

	/**
	 * Performs a lookup to see if there is a description 
	 * of the version of the text, e.g. RSV, KJV, Dedes, COG.
	 * for version v2
	 * @param domain
	 * @return version
	 */
	
	public String getTextVersion2() {
		String result = "";
		if (preferences.displayVersionOfTextV2) {
			result = getVersions();
		}
		return result;
	}

	/**
	 * Gets the versions for a given paragraph, 
	 * Resets the versions after the call.
	 * @return the versions wrapped in the prefix and suffix set in the generation prefs.
	 */
	public String getVersions() {
		String result = versionManager.delimitedValues();
		versionManager.resetVersions();
		return result;
	}
	
	/**
	 * Set the version for a given domain.
	 * The version is retrieved from the
	 * version.designation key in the 
	 * properties_ ares file for that domain, 
	 * @param domain to use for the lookup of the version
	 */
	public void setVersion(String filename) {
		String domain = "";
		String topic = "properties_";
		String key = "version.designation";
		domain = AlwbGeneralUtils.getDomainFromAresFile(filename);
		if (versionManager.contains(domain)) {
			// do nothing
		} else {
			String version = "";
			try {
				if (nonRecursive) {
					nonRecursive = false;
					version = getDefinitionValueById(
							topic 
							+ domain
							+ ".ares", key);
				}
			} catch (Exception e) {
				version = "";
			}
			if (version != null && version.length() > 0) {
				versionManager.push(
						domain
						, version
						+  getKeySpan(topic+domain, key)
						);
			}
			nonRecursive = true;
		}
	}

	/**
	 * Indicates whether for the current processing scope the user has set a media-off flag
	 * @return true if media is to be suppressed
	 */
	public boolean suppressMedia() {
		return suppressMedia;
	}
	
	/**
	 * Controlled by AtemGenerator.  When it encounters a media-no flag when processing a hymn, it will set this true
	 * <p>This overrides the media preferences and is meant to be temporary.
	 * @param value true - to suppress generation of media
	 */
	public void suppressMedia(boolean value) {
		suppressMedia = value;
	}

	/**
	 * Indicates whether for the current processing scope the user has set a media-off flag
	 * @return true if media is to be suppressed
	 */
	public boolean showVersion() {
		return showVersion;
	}
	
	/**
	 * Controlled by AtemGenerator.  When it encounters a show version flag when processing a hymn, it will set this true
	 * @param value true - show version of text (e.g. Dedes, RSV)
	 */
	public void showVersion(boolean value) {
		showVersion = value;
		if (showVersion) {
			// reset the versions - clears previous values
			versionManager.resetVersions();
		}
	}

	/**
	 * Temporarily switch the locales (versions)
	 * @param l1 - locale to use with version 1, e.g. en_US_ematins
	 * @param l2 - locale to use with version 2
	 */
	public void setLocales(String l1, String l2) {
		language1IdOriginal = language1Id;
		language2IdOriginal = language2Id;
		language1Id = l1;
		language2Id = l2;
		setLanguage1File(l1);
		setLanguage2File(l2);
	}
	/**
	 * Set the locales back to the preference settings
	 */
	public void restoreLocales() {
		language1Id = language1IdOriginal;
		language2Id = language2IdOriginal;
		language1File = language1FileOriginal;
		language2File = language2FileOriginal;
	}

	/**
	 * When ModelAccessor is instantiated, it reads the preference store to determine what
	 * languages the user wants when generating services.  
	 * @see getLanguage1Id()
	 * @return true - use the language that is obtained via the getLanguage1Id method
	 */
	public boolean useLanguage1() {
		return useLanguage1;
	}
	
	/**
	 * When ModelAccessor is instantiated, it reads the preference store to determine what
	 * languages the user wants when generating services.  
	 * @see getLanguage2Id()
	 * @return true - use the language that is obtained via the getLanguage2Id method
	 */
	public boolean useLanguage2() {
		return useLanguage2;
	}

	/**
	 * Add an invisible span that includes the key used to retrieve the text.
	 * @param key
	 * @param text
	 * @return
	 */
	private String wrapAnchor(String key, String text) {
		return text + "<span class='key' data-key='" + key + "'</span>";
	}
}
