package net.ages.workbench.templates.dsl.html;

import java.io.File;

import net.ages.workbench.utils.AlwbConstants;

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

public class HtmlFile implements Comparable<HtmlFile> {
	
	private File theFile;
	private String fileType = "";
	private String filename = "";
	private String description;
	private String commemoration = "";
	private String relativePath;
	private org.jsoup.nodes.Document doc;
	private String serviceLanguages = "";
	private FileNameParser parser;
	
	public HtmlFile(File file, FileNameParser parser) {
		theFile = file;
		try {
			doc = Jsoup.parse(theFile, "UTF-8", "http://example.com/");
		} catch (Exception e) {
			doc = null;
		}
		this.description = getTitle(parser.serviceType);
		this.commemoration = getCommemoration();
		this.relativePath = parser.relativePath;
		fileType = parser.fileType;
		filename = parser.dataFilename;
		this.serviceLanguages = parser.languageAcronyms;
	}
	

	/**
	 * Provide a means to compare the name of a file so they can be alphabetized
	 * @param f the file
	 * @return result of comparing the names of the files
	 */
	public int compareTo(HtmlFile f) {
		return this.theFile.getName().compareToIgnoreCase(f.theFile.getName());
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
			title = doc.select("title").text().split(":")[1];
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
	
	public String getRelativePath() {
		return relativePath;
	}
	
	/**
	 * Replaces the index.html in the relative path with the actual pdf filename
	 * if this is a pdf file.
	 * @return
	 */
	public String getJsonRelativePath() {
		if (fileType == "pdf") {
			return relativePath.replace("index.html", filename);
		} else {
			return relativePath;
		}
	}

	public String getDescription() {
		return description;
	}
	
	public String toAnchor() {
		return "<a href='" + relativePath + "'>" + description + "</a>";
	}

	public String toClassicEmatinsDcsAnchor() {
		return "[<a href='" + relativePath + "' target='_self'>" + description + "</a>]";
	}

	@Override
	public String toString() {
		return description + "\n\tRelative Path: " + relativePath + "\n\tFull Path: "+ theFile.getPath();
	}
}
