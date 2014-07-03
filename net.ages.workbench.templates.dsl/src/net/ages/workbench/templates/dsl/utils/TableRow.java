package net.ages.workbench.templates.dsl.utils;

public class TableRow {
	private String filename;
	private String key;
	private String lang1Value;
	private String lang2Value;
	private String htmlTagClass;
	private String q = "\"";
	
	public TableRow(String filename, String key, String value, String htmlTagClass) {
		this.filename = filename;
		this.key = key;
		
		lang1Value = value;
		this.htmlTagClass = htmlTagClass;
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
		return wrapJson(jsonKey(q) + jsonValue(q,lang1Value) + getHtmlTagClassAsJson(q));
	}
	public String getLang2AsJson() {
		return wrapJson(jsonKey(q) + jsonValue(q,lang2Value) + getHtmlTagClassAsJson(q));
	}
	
	public String getHtmlTagClassAsJson(String q) {
		return ", " + q+"class"+q +": " + q + htmlTagClass + q;
	}

	/**
	 * 
	 * @return Javascript friendly json formatted key
	 */
	public String jsonKey() {
		return filename + "__" + key.replaceAll("\\.", "_");
	}
	
	/**
	 * 
	 * @param q quote character
	 * @return
	 */
	public String jsonKey(String q) {
		return q+"_id"+q+": " + "\"" + jsonKey() + "\", ";
	}

	/**
	 * Javascript friendly json value with quotes
	 * @param value
	 * @return e.g. "I am a \"value\""
	 */
	public String jsonValue(String value) {
		return q + value.replaceAll("\"", "\\\\\"") + q;
	}
	
	/**
	 * 
	 * @param q quote character
	 * @param value of text
	 * @return
	 */
	public String jsonValue(String q, String value) {
		return q+"text"+q +": " + "\"" + value.replaceAll("\"", "\\\\\"") + "\"";
	}

	public String jsonKeyValue(String value) {
		return jsonKey() + ": " + jsonValue(value);
	}
	public String wrapJson(String key_value) {
		return "{" + key_value + "}";
	}
	

}
