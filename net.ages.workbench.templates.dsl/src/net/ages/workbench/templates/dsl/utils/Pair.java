package net.ages.workbench.templates.dsl.utils;

import java.util.Comparator;

public class Pair {

	String key;
	String value;
	
	public Pair(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	
	public String getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
	public String wrap(String leftWrapper, String separator, String rightWrapper) {
		return leftWrapper+key+leftWrapper+separator+rightWrapper+value+rightWrapper;
	}
	
}

