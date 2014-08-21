package net.ages.workbench.templates.dsl.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import net.ages.workbench.templates.dsl.preferences.Preferences;
import net.ages.workbench.utils.AlwbGeneralUtils;

/**
 * The purpose of this class is to hold the metadata for a processed template, so that it can be used
 * to generate a json version of the template.
 * @author mac002
 *
 */
public class TableManager {
	private TreeMap<String,List<String>> aresKeys = new TreeMap<String,List<String>>();
	private LinkedHashMap<String,TableRow> atemKeys = new LinkedHashMap<String,TableRow>();
	private List<String> aresTopicList = new ArrayList<String>(); // contains a unique set of topics of the ares files used in this template 

	private String lang1Id;
	private String lang2Id;
	private String delimiter = "~";
	private String htmlTagClassForNextAdd;
	private String htmlTagForNextAdd;
	private int count;
	private String q = "\"";
	private String t1 = "\t";
	private String t2 = "\t\t";
	private String t3 = "\t\t\t";
	private String t4 = "\t\t\t\t";

	
	/**
	 * Metadata
	 * Filename of template
	 * Display name of template
	 * Description of template
	 * Date generated
	 */
	
	public TableManager(String lang1Id, String lang2Id) {
		this.lang1Id = lang1Id;
		this.lang2Id = lang2Id;
		count = 1;
	}
	
	public void setHtmlClassForNextAdd(String htmlTagClass) {
//		if (htmlTagClass.contains("italics")) {
//			System.out.println("");
//		}
		htmlTagClassForNextAdd = htmlTagClass;
	}
	
	public void setHtmlTagForNextAdd(String htmlTag) {
		if (htmlTag.contains("unknown")) {
			System.out.print("");
		}
			
		htmlTagForNextAdd = htmlTag;
	}

	/**
	 * Add a new "row" to the table
	 * @param key
	 * @param value
	 */
	public void add(String key, String value) {
		String filename = key.split("_")[0];
		String theKey = key.split("ares\\.")[1];
		String rowId = String.format("%04d", count);
		atemKeys.put(
					rowId,
					new TableRow(
						filename,
						rowId,
						theKey,
						value,
						htmlTagForNextAdd,
						htmlTagClassForNextAdd)
					);
		String hashKey = "\"_id\": \"" + filename + "__" + theKey + "\"";
		if (Preferences.tmsJsonFileKeySetIncludeText) {
			hashKey = hashKey + ", \"value\": " + "\"" + value + "\"";
		}
		
		// add row index to the list for this ares key
		String zeroBasedRowIndex = AlwbGeneralUtils.wrapQuotes(String.valueOf(count-1));
		List<String> rows = null;				// get the variable ready
		if (aresKeys.containsKey(hashKey)) {
			rows = aresKeys.get(hashKey); 		// set it to the existing key's list if found
		} else {
			rows = new ArrayList<String>(); 		// otherwise just create a new list
		}
		rows.add(zeroBasedRowIndex); // this is for a zero based index, so decrease by one
		aresKeys.put(hashKey, rows);
		
		// add the topic
		String quotedTopic = AlwbGeneralUtils.wrapQuotes(filename);
		if (! aresTopicList.contains(quotedTopic)) {
			aresTopicList.add(quotedTopic);
		}

		count++;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Filename" + delimiter + "Key" + delimiter + lang1Id + delimiter + lang2Id); 
		sb.append("\n");
		Set<String> keys = atemKeys.keySet();
		for (String key : keys) {
			sb.append(atemKeys.get(key).toDelimitedString(delimiter));
			sb.append("\n");
		}
		return sb.toString();		
	}
	public String toLines() {
		StringBuffer sb = new StringBuffer();
		Set<String> keys = atemKeys.keySet();
		for (String key : keys) {
			sb.append(atemKeys.get(key).getLang1DelimitedString(delimiter));
			sb.append("\n");
			sb.append(atemKeys.get(key).getLang2DelimitedString(delimiter));
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
		Set<String> keys = atemKeys.keySet();
		for (String key : keys) {
			sb.append(atemKeys.get(key).getLang1AsProperty());
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
		Set<String> keys = atemKeys.keySet();
		for (String key : keys) {
			sb.append(atemKeys.get(key).getLang2AsProperty());
			sb.append("\n");
		}
		return sb.toString();		
	}

	/**
	 * Returns language values as Json
	 * @return
	 */
	public String valuesAsJson(int lang, String templateName) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String logname = "unknown";
		try {
			logname = System.getenv("LOGNAME");
		} catch (Exception e) {
			logname = "unknown";
		}
		Date date = new Date();
		StringBuffer sb = new StringBuffer();
		Set<String> keys = atemKeys.keySet();
		Iterator<String> it = keys.iterator();
		String compression = "0%";
		// avoid divide by zero
		if (atemKeys.size() > 0) {
			compression = String.valueOf(((atemKeys.size() - aresKeys.size())*100)/atemKeys.size())+"%";
		}
		sb.append("{");
		
		// Create a description of the file
		sb.append(openJsonValueAsObject("about"));
		sb.append(jsonWrapKeyValue(t2, "template",templateName,false));
		sb.append(jsonWrapKeyValue(t2, "dateGenerated",dateFormat.format(date),true));
		sb.append(jsonWrapKeyValue(t2, "logname",logname,true));
		sb.append(jsonWrapKeyValue(t2, "templateKeyCount",String.valueOf(keys.size()),true));
		sb.append(jsonWrapKeyValue(t2, "libraryKeyCount",String.valueOf(aresKeys.size()),true));
		sb.append(jsonWrapKeyValue(t2, "redundantKeyCount",String.valueOf(atemKeys.size() - aresKeys.size()),true));
		sb.append(jsonWrapKeyValue(t2, "compression",compression,true));
		sb.append(closeJsonObject(false));
		
		// Create the list of text keys in the order in which
		// they appear in the template. There are duplicate keys -- naturally
		sb.append(openJsonValueAsArray("templateKeys"));
		while (it.hasNext()) {
			if (lang == 1) {
				sb.append(t2 + atemKeys.get(it.next()).getLang1AsJson());
			} else {
				sb.append(t2 + atemKeys.get(it.next()).getLang2AsJson());
			}
			if (it.hasNext()) {
				sb.append(",");
			}
			sb.append("\n");
		}

		sb.append(closeJsonArray(false));
		
		// Create the unique set of keys for the template - no duplicates 
		keys = aresKeys.keySet();
		it = keys.iterator();
		String key = "";
		
		sb.append(openJsonValueAsArray("libraryKeys"));

		List<String> indexedRows = null;
		
		while (it.hasNext()) {
			key = it.next();
			indexedRows = aresKeys.get(key);
			String theCount = String.valueOf(indexedRows.size());
			sb.append(t2 + "{ " 
					+ key 
					+ ", "
					+ "\"ids\": " + indexedRows.toString()
					+ (Preferences.tmsJsonFileKeySetIncludeFrequencies ? countToJson(theCount) : "") 
					+ " }");

			if (it.hasNext()) {
				sb.append(",");
			}
			sb.append("\n");
		}

		Collections.sort(aresTopicList);
		sb.append(closeJsonArray(false));
		sb.append("\n");
		sb.append(t1 + "\"topics\": " + aresTopicList).toString();
		sb.append("\n}");
		
		return sb.toString();		
	}
	
	/**
	 * Creates the opening part of a Json array of Objects
	 * @param name of the key for the array
	 * @return
	 */
	private String openJsonValueAsArray(String key) {
		return "\n" + t1 + quote(key) + ": [\n";
	}

	/**
	 * Create the beginning of a key-value pair, where the value
	 * is an object.
	 * @param key
	 * @return
	 */
	private String openJsonValueAsObject(String key) {
		return "\n" + t1 + quote(key) + ": {\n";
	}

	/**
	 * Provides the closing part of a Json array of Objects
	 * @return
	 */
	private String closeJsonArray(boolean last) {
		return t1 + "]" + (last ? "" : ", ");
	}
	
	/**
	 * Provides the closing part of a Json Object
	 * @return
	 */
	private String closeJsonObject(boolean last) {
		return "\n" + t1 + "}" + (last ? "" : ", ");
	}

	private String quote(String value) {
		return q + value + q;
	}
		
	private String jsonWrapKeyValue(String indent, String key, String value, boolean addComma) {
		return (addComma ? ",\n" : "" ) + indent + "\"" + key + "\": " + "\"" + value + "\"";
	}
	
	private String incrementCounter(String count) {
		int theCount = 0;
		
		if (count != null) {
			theCount = Integer.parseInt(count);
		}
		theCount++;
		return Integer.toString(theCount);
	}
	
	private String countToJson(String count) {
		return ", " + "\"count\": " + "\"" + count + "\"";
	}

}
