package net.ages.workbench.templates.dsl.utils;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TableManager {
	private LinkedHashMap<String,TableRow> tableRows = new LinkedHashMap<String,TableRow>();
	private String lang1Id;
	private String lang2Id;
	private String delimiter = "~";
	
	public TableManager(String lang1Id, String lang2Id) {
		this.lang1Id = lang1Id;
		this.lang2Id = lang2Id;
	}
	
	public void add(String key, String value) {
		String filename = key.split("_")[0];
		String theKey = key.split("ares\\.")[1];
		String hashKey = filename + "_" + theKey;
		if (! tableRows.containsKey(hashKey)) {
			tableRows.put(hashKey,new TableRow(filename,theKey,value));
		} else {
			TableRow row = tableRows.get(hashKey);
			row.putLang2Value(value);
			tableRows.put(hashKey, row);
		}			
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Filename" + delimiter + "Key" + delimiter + lang1Id + delimiter + lang2Id); 
		sb.append("\n");
		Set<String> keys = tableRows.keySet();
		for (String key : keys) {
			sb.append(tableRows.get(key).toDelimitedString(delimiter));
			sb.append("\n");
		}
		return sb.toString();		
	}
	public String toLines() {
		StringBuffer sb = new StringBuffer();
		Set<String> keys = tableRows.keySet();
		for (String key : keys) {
			sb.append(tableRows.get(key).getLang1DelimitedString(delimiter));
			sb.append("\n");
			sb.append(tableRows.get(key).getLang2DelimitedString(delimiter));
			sb.append("\n");
		}
		return sb.toString();		
	}

	/**
	 * Returns language 1 values as property lines, 
	 * that is, key = value
	 * @return
	 */
	public String lang1ValuesAsPropertyLines() {
		StringBuffer sb = new StringBuffer();
		Set<String> keys = tableRows.keySet();
		for (String key : keys) {
			sb.append(tableRows.get(key).getLang1AsProperty());
			sb.append("\n");
		}
		return sb.toString();		
	}

	/**
	 * Returns language 2 values as property lines, 
	 * that is, key = value
	 * @return
	 */
	public String lang2ValuesAsPropertyLines() {
		StringBuffer sb = new StringBuffer();
		Set<String> keys = tableRows.keySet();
		for (String key : keys) {
			sb.append(tableRows.get(key).getLang2AsProperty());
			sb.append("\n");
		}
		return sb.toString();		
	}

	/**
	 * Returns language values as Json
	 * @return
	 */
	public String valuesAsJson(int lang) {
		StringBuffer sb = new StringBuffer();
		Set<String> keys = tableRows.keySet();
		Iterator<String> it = keys.iterator();
		String id = (lang == 1 ? lang1Id : lang2Id);
		sb.append("var " + id + " = {};\n");
		sb.append(id + ".textblocks = [\n");
		while (it.hasNext()) {
			if (lang == 1) {
				sb.append("\t"+ tableRows.get(it.next()).getLang1AsJson());
			} else {
				sb.append("\t"+ tableRows.get(it.next()).getLang2AsJson());
			}
			if (it.hasNext()) {
				sb.append(",");
			}
			sb.append("\n");
		}
		sb.append("];");
		return sb.toString();		
	}

}
