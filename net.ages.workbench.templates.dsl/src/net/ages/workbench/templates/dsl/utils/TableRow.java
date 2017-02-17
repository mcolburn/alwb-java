package net.ages.workbench.templates.dsl.utils;

import java.util.ArrayList;
import net.ages.workbench.templates.dsl.preferences.Preferences;

public class TableRow {
	private String filename;
	private String rowId;
	private String key;
	private String lang1Value;
	private String lang2Value;
	private String htmlTag;
	private String htmlTagClass;
	private String q = "\"";
	private String rowIdPrefix = "T";
	private static final ArrayList<String> inlineTags = new ArrayList<String>() {{
		add("b");
		add("big");
		add("i");
		add("small");
		add("tt");
		add("abbr");
		add("acronym");
		add("cite");
		add("code");
		add("dfn");
		add("em");
		add("kbd");
		add("strong");
		add("samp");
		add("var");
		add("a");
		add("bdo");
		add("br");
		add("img");
		add("map");
		add("object");
		add("q");
		add("script");
		add("span");
		add("sub");
		add("sup");
		add("button");
		add("input");
		add("label");
		add("select");
		add("textarea");
	}};
	
	public TableRow(String filename, String rowNumber, String key, String value, 
			String htmlTag,
			String htmlTagClass) {
		this.filename = filename;
		this.rowId = rowIdPrefix + rowNumber;
		this.key = key;
		
		lang1Value = value;
		this.htmlTagClass = htmlTagClass;
		this.htmlTag = htmlTag;
	}
	
	public void putLang2Value(String value) {
		lang2Value = value;
	}
	
	public String toDelimitedString(String delimiter) {
		return filename + delimiter + key + delimiter + lang1Value + delimiter + lang2Value;
	}
	
	public String getLang1Value() {
		return lang1Value;
	}
	
	public String getLang2Value() {
		return lang2Value;
	}
	
	public String getFilenameAndKey(String delimiter) {
		return filename+delimiter+key;
	}
	
	public void setHtmlTagClass(String tagClass) {
		htmlTagClass = tagClass;
	}
	
	public String getHtmlTagClass() {
		return htmlTagClass;
	}
	
	public String getHtmlTag() {
		return htmlTag;
	}
	
	public boolean isBlock(String tag) {
		return inlineTags.contains(tag);
	}
	
	public String getLang1DelimitedString(String delimiter) {
		return getFilenameAndKey(delimiter) + delimiter + lang1Value;
	}
	public String getLang2DelimitedString(String delimiter) {
		return getFilenameAndKey(delimiter) + delimiter + lang2Value;
	}
	
	public String getLang1AsProperty() {
		return filename + "_" + key + "=" + lang1Value;
	}
	public String getLang2AsProperty() {
		return filename + "_" + key + "=" + lang2Value;
	}
	public String getLang1AsJson() {
		return getLangAsJason(lang1Value);
	}
	public String getLang2AsJson() {
		return getLangAsJason(lang2Value);
	}
	
	public String getLangAsJason(String value) {
		return wrapJson(
				getRowNumberAsJson()
				+ (Preferences.tmsJsonFileFormatSetIncludeTag ? getHtmlTagAsJson() : "") 
				+ (Preferences.tmsJsonFileFormatSetIncludeClass ? getHtmlTagClassAsJson() : "")
				+ (Preferences.tmsJsonFileFormatSetIncludeKey ? getKeyAsJson() : "") 
				+ (Preferences.tmsJsonFileFormatSetIncludeText ? jsonValue(value) : "") 
				);
	}
	
	public String getHtmlTagClassAsJson() {
		return ", " + q +"class"+q +": " + q + htmlTagClass + q;
	}

	public String getHtmlTagAsJson() {
		return ", " + q+"tag"+q +": " + q + htmlTag + q;
	}

	public String getRowNumberAsJson() {
		return q + "_id" + q + ": " + q + rowId + q;
	}

	/**
	 * 
	 * @return Javascript friendly json formatted key
	 */
	public String jsonKey() {
		return filename + "__" + key; // .replaceAll("\\.", "_");
	}
	
	/**
	 * 
	 * @param q quote character
	 * @return
	 */
	public String getKeyAsJson() {
		return ", " + q+"key"+q+": " + "\"" + jsonKey() + "\"";
	}

	/**
	 * Javascript friendly json value with quotes
	 * @param value
	 * @return e.g. "I am a \"value\""
	 */
	public String jsonValue(String value) {
		return ", " + q + "value" + q +": " + "\""  + value.replaceAll("\"", "\\\\\"") + q;
	}


	public String jsonKeyValue(String value) {
		return jsonKey() + ": " + jsonValue(value);
	}
	public String wrapJson(String key_value) {
		return "{" + key_value + "}";
	}
	

}
