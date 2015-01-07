package net.ages.workbench.templates.dsl.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * For a given paragraph of text, handles the versions of the sids and rids.
 * This class keeps a list of domains and a list of versions.
 * The reason it keeps a list of domains is so the user can avoid a lookup
 * for a given domain if it has already been done.
 * @author mac002
 *
 */
public class VersionManager {
	LinkedList<String> versions = null;
	Map<String,String> domains = null;
	String prefix;
	String suffix;
	String delimiter;
	
	public VersionManager(String prefix, String suffix, String delimiter) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.delimiter = delimiter;
		resetVersions();
	}
	
	/**
	 * Call this after calling the toHtmlSpan() if you
	 * don't plan on using the same set of versions.
	 */
	public void resetVersions() {
		domains = new HashMap<String,String>();
		versions = new LinkedList<String>();
	}

	/**
	 * Checks to see if the given domain exists
	 * in the versions Map.  This should be called so that
	 * unnecessary version lookups are not made.
	 * @param domain
	 * @return true if the domain exists
	 */
	public boolean contains(String domain) {
		return domains.containsKey(domain);
	}
	
	/**
	 * Add the supplied domain and version
	 * @param domain
	 * @param version
	 */
	public void push(String domain, String version) {
		// Note that a version can occur in multiple domains.
		// But, we want a unique list of versions.
		if (! domains.containsKey(domain)) {
			domains.put(domain, version);
			if (! versions.contains(version)) {
				versions.add(version);
			}
		}
	}
	
	/**
	 * Convert the values of the Version Map to an HTML span
	 * It is recommended that you call resetVersions() after
	 * calling this method, unless you want the values to 
	 * persist, which is unlikely.
	 * @return the HTML tags and values
	 */
	public String toHtmlSpan() {
		if (domains.isEmpty()) {
			return "";
		} else {
			StringBuffer sb = new StringBuffer();
			sb.append("<span class='versiondesignation'>");
			sb.append(delimitedValues());
			sb.append("</span>");
			return sb.toString();
		}
	}
	
	/**
	 * Converts the values of the Version map to a delimited string
	 * @param delimiter to use
	 * @return string of values separated by the delimiter
	 */
	public String delimitedValues() {
		StringBuffer sb = new StringBuffer();
		Iterator<String> it = versions.iterator();
		sb.append(prefix);
		while (it.hasNext()) {
			sb.append(it.next());
			if (it.hasNext()) {
				sb.append(delimiter + " ");
			}
		}
		sb.append(suffix);
		return sb.toString();
	}
	
}
