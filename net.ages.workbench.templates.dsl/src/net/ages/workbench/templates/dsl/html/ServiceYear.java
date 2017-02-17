package net.ages.workbench.templates.dsl.html;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ServiceYear {
	private SortedMap<String,ServiceMonth> servicesForTheYear = new TreeMap<String,ServiceMonth>();
	private String year;
	private String theKey;
	
	public ServiceYear(String year) {
		this.year = year;
		theKey = year;
	}
	
	public String getYear() {
		return year;
	}
	
	public String getKey() {
		return theKey;
	}
	
	public Map<String,ServiceMonth> getServicesForTheYear() {
		return servicesForTheYear;
	}
	public void add(File f, FileNameParser parser) {
		 String key = parser.month;
		 ServiceMonth value = null;
		 if (servicesForTheYear.containsKey(key)) {
			 value = servicesForTheYear.get(key);
			 value.add(f, parser);
			 servicesForTheYear.put(key, value);
		 } else {
			 value = new ServiceMonth(parser.year,parser.month);
			 value.add(f, parser);
			 servicesForTheYear.put(key, value);				 
		 }

	}
}
