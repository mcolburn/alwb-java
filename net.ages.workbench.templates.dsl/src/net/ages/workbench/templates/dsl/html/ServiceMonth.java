package net.ages.workbench.templates.dsl.html;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ServiceMonth {
	private String theKey;
	private String year;
	private String month;
	private String monthName = null;
	private SortedMap<String,ServiceDay> servicesForTheMonth = new TreeMap<String,ServiceDay>();

	public ServiceMonth(String year, String month) {
		this.year = year;
		this.month = month;
		theKey = year + month;
	}
	
	public String getMonthName() {
		return monthName;
	}
	
	public String getYear() {
		return year;
	}
	
	public String getKey() {
		return theKey;
	}
	
	public void add(File f, FileNameParser parser) {
		 ServiceDay value = new ServiceDay(parser);
		 String key = value.getKey();
		 if (monthName == null) {
			 monthName = value.getLiturgicalDayProperties().getNameOfMonth();
		 }
		 if (servicesForTheMonth.containsKey(key)) {
			 value = servicesForTheMonth.get(key);
			 value.addFile(f, parser);
			 servicesForTheMonth.put(key, value);
		 } else {
			 value.addFile(f, parser);
			 servicesForTheMonth.put(key, value);				 
		 }
	}

	public Map<String,ServiceDay> getServicesForMonth() {
		return servicesForTheMonth;
	}
}
