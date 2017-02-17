package net.ages.workbench.templates.dsl.html;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import net.ages.workbench.utils.AlwbLogger;

import org.apache.logging.log4j.Logger;

/**
 * Each instance holds a collection of types of services available for a specific day
 * @author mac002
 *
 */
public class ServiceDayType {

	private String serviceType;
	private String theKey;
	private String title;
	private String commemoration;
	
	private Logger logger = AlwbLogger.getLogger("ServiceDayType");

	private SortedMap<String,ServiceDayTypeVersion> theMap = new TreeMap<String,ServiceDayTypeVersion>();
	
	public ServiceDayType(FileNameParser p) {
		this.serviceType = p.serviceType;
		theKey = p.year + p.month + p.day + p.serviceType;
		title = p.getHtmlLinkTitle();
		commemoration = p.getCommemoration();
	}
	
	public String getKey() {
		return theKey;
	}
	
	public String getServiceType() {
		return serviceType;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCommemoration() {
		return commemoration;
	}

	public Map<String,ServiceDayTypeVersion> getServicesTypesForDate() {
		return theMap;
	}
	
	public void addFile(File file, FileNameParser parser) {
		logger.entry();
		try {
			 ServiceDayTypeVersion value = new ServiceDayTypeVersion(parser);
			 String key = value.getKey();
			 if (theMap.containsKey(key)) {
				 value = theMap.get(key);
				 value.addFile(file, parser);
				 theMap.put(key, value);
			 } else {
				 value.addFile(file, parser);
				 theMap.put(key, value);				 
			 }
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
	}
	
}
