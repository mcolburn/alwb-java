package net.ages.workbench.templates.dsl.html;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import org.jsoup.Jsoup;

/*
*       Create HtmlFile class to represent the file itself
*          date
*          description (the text to be displayed)
*          path to file
*          toHtml()
*          toJson()
* 
*/

public class ServiceDayTypeVersionFormat implements Comparable<ServiceDayTypeVersionFormat> {
	
	private File theFile;
	private String fileType = "";
	public String fileTitle = "";
	private String fileName = "";
	private String description;
	private String commemoration = "";
	private String relativePath;
	private String fullPath;
	private String combinedPdfHref = "";
	private org.jsoup.nodes.Document doc;
	private String serviceLanguages = "";
	private String theKey = "";

	
	public ServiceDayTypeVersionFormat(File file, FileNameParser parser) {
		theFile = file;
		fullPath = theFile.getPath();
		try {
			doc = Jsoup.parse(theFile, "UTF-8", "http://example.com/");
		} catch (Exception e) {
			doc = null;
		}
		this.description = getTitle(parser.serviceType);
		this.commemoration = parser.getCommemoration();
		fileType = parser.fileType;
		if (fileType == null) {
			fileType = "unknown";
		}
		fileTitle = parser.getHtmlLinkTitle();
		fileName = parser.getFilename();
		this.relativePath = parser.relativePath;
		combinedPdfHref = parser.getCombinedPdfHref();
		this.serviceLanguages = parser.languageLocalNames();
		if (parser.year.startsWith("0")) {
			theKey = parser.getKey();
		} else {
			theKey = parser.year + parser.month + parser.day 
					+ parser.serviceType + parser.languageAcronyms + parser.fileType;
		}
	}
	
	public String getServiceLanguages() {
		return serviceLanguages;
	}
	
	public String getPath() {
		return fullPath;
	}
	
	public String getKey() {
		return theKey;
	}
	
	public String getFileType() {
		return fileType;
	}

	/**
	 * Provide a means to compare the name of a file so they can be alphabetized
	 * @param f the file
	 * @return result of comparing the names of the files
	 */
	public int compareTo(ServiceDayTypeVersionFormat f) {
//		return f.getPath().compareToIgnoreCase(this.getPath());
		return this.getKey().compareToIgnoreCase(f.getKey());
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
			if (title.contains(":")) {
				title = title.split(":")[1];
			}
		} catch (Exception e) {
			title = description;
		}
		return title;
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
	
	public String getCombinedPdfHref() {
		return combinedPdfHref;
	}
	
	public boolean hasCombinedPdfHref() {
		return combinedPdfHref != "";
	}

	public String getRelativePath() {
		return relativePath;
	}
	
	/**
	 * Replaces the index.html in the relative path with the actual pdf filename
	 * if this is a pdf file.
	 * @return
	 */
	public String getJsonRelativePath() {
		String result = relativePath;
		if (fileType.startsWith("p") && fileName != null) {
			result = relativePath.replace("index.html", fileName);
		}
		return result;
	}

	public String getDescription() {
		return description;
	}
	
	public String getDisplayDate(String prefix, String format, String suffix) {
	    	try {
	    		SimpleDateFormat simpleDateFormat =
	    		        new SimpleDateFormat(format);
			GregorianCalendar theDay = new GregorianCalendar();
			theDay.setTime(new Date(theFile.lastModified()));
	    		return "<span class='index-file-timestamp'>" + prefix + simpleDateFormat.format(theDay.getTime()) + suffix + "</span>";
	    	} catch (Exception e) {
				e.printStackTrace();
				return "";
		}    
	}

	
	public String toAnchor() {
		return "<a href='" + relativePath + "'>" + description + "</a>";
	}

	public String toClassicEmatinsDcsAnchor() {
		return "[<a href='" + relativePath + "' target='_self'>" + description + "</a>]";
	}

	public String toJson() {
		return "\"file\": {  \"href\": \"" 
				+ relativePath 
				+ "\", \"commemoration\": \"" 
				+ getCommemoration() + "\" }";
	}

	@Override
	public String toString() {
		return description + "\n\tRelative Path: " + relativePath + "\n\tFull Path: "+ theFile.getPath();
	}
}
