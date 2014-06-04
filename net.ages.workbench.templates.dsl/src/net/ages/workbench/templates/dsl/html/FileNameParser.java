package net.ages.workbench.templates.dsl.html;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;

import net.ages.workbench.templates.dsl.utils.ModelAccessor;
import net.ages.workbench.utils.AlwbConstants;
import net.ages.workbench.utils.AlwbGeneralUtils;
import net.ages.workbench.utils.AlwbLogger;

public class FileNameParser {
	private Logger logger = AlwbLogger.getLogger("FileNameParser");
	public String fullPath;
	public String relativePath;
	public String dataFilename;
	public String fileType;
	public String year = "0";
	public String month = "0";
	public String day = "0";
	public String serviceType = "n/a";
	public boolean isService = true;
	public boolean isBook = false;
	public boolean isCustom = false;
	public boolean isIndexable = false;
	private String templateAcronymn = "";
	private String htmlTabTitle = "";
	private String htmlLinkTitle = "";
	private String htmlExtension = AlwbConstants.HTML_EXTENSION;
	private String htmlSiteRoot = "";
	private String htmlServiceFolderRoot = "";
	private String htmlBookFolderRoot = "";
	private String htmlCustomFolderRoot = "";
	private String htmlWebSite = "";
	private String htmlServiceFolderRootPath = "";
	private String htmlBookFolderRootPath = "";
	public String languageAcronyms = "";
	private String languageLocaleNames = "";
	public String key = "";
	public String commemoration = "";
	public String combinedPdfHref = "";
	private org.jsoup.nodes.Document doc;
	
	public FileNameParser(File file, ModelAccessor a) {
		logger.entry();
		String filePath = file.getPath();
		htmlSiteRoot = a.getHtmlSiteRoot();
		htmlServiceFolderRoot = a.getHtmlServiceFolderRoot();
		htmlBookFolderRoot = a.getHtmlBookFolderRoot();
		htmlCustomFolderRoot = a.getHtmlCustomFolderRoot();
		htmlWebSite = AlwbConstants.HTML_WEBSITE + "/" + htmlSiteRoot + "/";
		htmlServiceFolderRootPath = htmlServiceFolderRoot + "/";
		htmlBookFolderRootPath = htmlBookFolderRoot + "/";
		 try {
			 fullPath = filePath;
			 try {
				 fullPath = filePath.replaceAll("\\\\", "/"); // in case this is Windows :-)
			 } catch (Exception e) {
				 fullPath = filePath;
			 }
			 String [] parts = fullPath.split(htmlWebSite);
			 relativePath = parts[1];
			 isService = 
					 (parts[1].startsWith("h/"+htmlServiceFolderRoot) // html
							 || parts[1].startsWith("p/"+htmlServiceFolderRoot)  // pdf
							 || parts[1].startsWith("e/"+htmlServiceFolderRoot)  // epub
					); 
			 isBook = 
					 (parts[1].startsWith("h/"+htmlBookFolderRoot) // html
							 || parts[1].startsWith("p/"+htmlBookFolderRoot)  // pdf
							 || parts[1].startsWith("e/"+htmlBookFolderRoot)  // epub
					); 
			 isCustom = 
					 (parts[1].startsWith("h/"+htmlCustomFolderRoot) // html
							 || parts[1].startsWith("p/"+htmlCustomFolderRoot)  // pdf
							 || parts[1].startsWith("e/"+htmlCustomFolderRoot)  // epub
					); 
			 
			 
				try {
					doc = Jsoup.parse(file, "UTF-8", "http://example.com/");
					commemoration = getCommemoration();
					dataFilename = getFilename();
					combinedPdfHref = getCombinedPdfHref();
					setLanguageLocaleNames(getLocaleLanguages());
					fileType = getDataType();
				} catch (Exception e) {
					doc = null;
				}

			 parts = parts[1].split("/");
			 if (isService) {
				 year = parts[2];
				 month = parts[3];
				 day = parts[4];
				 serviceType = parts[5];
				 languageAcronyms = parts[6];
				 htmlTabTitle = a.getTextForAbbreviation(serviceType, AlwbConstants.TEMPLATE_TITLE_SUFFIX_HTML_TAB);
				 htmlLinkTitle = a.getTextForAbbreviation(serviceType, AlwbConstants.TEMPLATE_TITLE_SUFFIX_HTML_LINK);
			 } else if (isBook) {
				 htmlLinkTitle = getTitleForBookName(a,Arrays.asList(parts));
				 if (htmlLinkTitle == "") {
					 htmlLinkTitle = file.getName();
				 }
				 htmlTabTitle = htmlLinkTitle;
				 languageAcronyms = parts[parts.length-2];
			 } else if (isCustom) {
				 htmlLinkTitle = getTitle(file.getName());
			 } else {  
				 year ="0";
				 month = "0";
				 day = "0";
				 serviceType = "n/a";
			 }
		 } catch (Exception e) {
			 logger.catching(e);
		 }
		 setIsIndexable();
		 if (isService) {
			 key = "se" + "_" + year + "_" + month + "_" + day + "_" + serviceType + "_" + languageAcronyms + "_" + a.getLocaleNameForFileType(fileType);
		 } else if (isBook){
			 key = "bk" + "_" + htmlLinkTitle + "_"  + languageAcronyms.replace("-", "") + "_" + a.getLocaleNameForFileType(fileType) + "_" + filePath;
		 } else if (isCustom) {
			 key = "cu" + "_" + htmlLinkTitle + "_"  + languageAcronyms.replace("-", "") + "_" + a.getLocaleNameForFileType(fileType) + "_" + filePath;
		 }
		 logger.exit();
	}
	
	/**
	 * Reads path parts to get the text for the abbreviations.
	 * @param parts - the parts of the path
	 * @return concatenation of the texts for each abbreviation
	 */
	public String getTitleForBookName(ModelAccessor a, List<String> parts) {
		String result = "";
		int index = 1;
		try {
			if (parts.get(2).startsWith("eu")) {
				index = 3;
			}
			String text;
			for (int i = index; i < parts.size(); i++) {
				text = a.getTextForAbbreviation(parts.get(i),".html.link");
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

	
	public String getKey() {
		return key;
	}
	
	public void setLanguageLocaleNames(String names) {
		languageLocaleNames = names;
	}
	
	public String languageLocalNames() {
		return languageLocaleNames;
	}
	
	public void setIsIndexable() {
		logger.entry();
		try {
			String [] parts = relativePath.split("/");
			if (parts.length == 1) {
				isIndexable = false;
			} else {
				isIndexable = parts[1].startsWith(htmlServiceFolderRoot) 
						|| parts[1].startsWith(htmlBookFolderRoot)
						|| parts[1].startsWith(htmlCustomFolderRoot);
			}
		} catch (Exception e) {
			logger.catching(e);
			isIndexable = false;
		}
if (isIndexable) {
	System.out.println("");
}
		logger.exit();
	}
	public String getHtmlTabTitle() {
		return htmlTabTitle;
	}
	public void setHtmlTabTitle(String htmlTabTitle) {
		this.htmlTabTitle = htmlTabTitle;
	}
	public String getHtmlLinkTitle() {
		return htmlLinkTitle;
	}
	public void setHtmlLinkTitle(String htmlLinkTitle) {
		this.htmlLinkTitle = htmlLinkTitle;
	}

	/**
	 * Gets the title from the HTML file. If not found, returns
	 * the passed in description instead.
	 * @param description
	 * @return the title to use for the index
	 */
	public String getTitle(String description) {
		String title = description;
		try {
			title = doc.select("title").text();
//			title = doc.select("title").text().split(":")[1];
		} catch (Exception e) {
			title = description;
		}
		return title;
	}

	public String getCombinedPdfHref() {
		String result = "";
		try {
			result = doc.select("title").attr("data-combo-pdf-href");
			if (result == null || result.contains("Not found")) {
				result = "";
			}
		} catch (Exception e) {
			result = "";
		}
		return result;
	}

	public String getDataType() {
		String result = "";
		try {
			result = doc.select("title").attr("data-type");
			if (result == null || result.contains("Not found")) {
				result = "";
			}
		} catch (Exception e) {
			result = "";
		}
		return result;
	}

	public String getCommemoration() {
		String result = "";
		try {
			result = doc.select("title").attr("data-commemoration");
			if (result == null || result.contains("Not found")) {
				result = "";
			}
		} catch (Exception e) {
			result = "";
		}
		return result;
	}
	
	public String getFilename() {
		String result = "";
		try {
			result = doc.select("title").attr("data-filename");
			if (result == null || result.contains("Not found") || result.equals("")) {
				result = getTitle("What is the name of this file??");
			}
		} catch (Exception e) {
			result = "";
		}
		return result;
	}

	public String getLocaleLanguages() {
		String result = "";
		try {
			result = doc.select("title").attr("data-language");
			if (result == null || result.contains("Not found")) {
				result = "";
			}
		} catch (Exception e) {
			result = "";
		}
		return result;
	}


	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n");
		sb.append(fullPath);
		if (isService) {
			sb.append(": ");
			sb.append("\tYear: ");
			sb.append(year);
			sb.append(" Month: ");
			sb.append(month);
			sb.append(" Service Type: ");
			sb.append(serviceType);
		}
		return sb.toString();
	}

}
