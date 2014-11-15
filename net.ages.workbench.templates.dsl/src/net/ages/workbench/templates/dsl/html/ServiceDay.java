package net.ages.workbench.templates.dsl.html;

import net.ages.workbench.templates.dsl.rubrics.engine.LiturgicalDayProperties;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.ages.workbench.utils.AlwbLogger;

import org.apache.logging.log4j.Logger;

import net.ages.workbench.templates.dsl.html.ServiceDayTypeVersionFormat;
import net.ages.workbench.utils.AlwbConstants;

public class ServiceDay {
	
	private String theKey;
	private String commemoration = "";
	private Logger logger = AlwbLogger.getLogger("Website");
	private LiturgicalDayProperties theDay;
	private Map<String,ServiceDayType> servicesForTheDay = new HashMap<String,ServiceDayType>();
	private 	List<ServiceDayType> services;
	
	public ServiceDay(FileNameParser parser) {
		theDay = new LiturgicalDayProperties(parser.year, parser.month, parser.day);
		theKey = parser.year + parser.month + parser.day;
		commemoration = parser.commemoration;
	}
	
	public String getKey() {
		return theKey;
	}
	
	public Map<String,ServiceDayType> getServicesForDate() {
		return servicesForTheDay;
	}
	
	public String formattedDayNoYear() {
		return String.format("%02d",theDay.getIntDayOfMonth()) + "-" + theDay.getNameOfDay();
	}
	
	public LiturgicalDayProperties getLiturgicalDayProperties() {
		return theDay;
	}
	
	public String getCommemoration() {
		return commemoration;
	}
	
	public void addFile(File file, FileNameParser parser) {
		logger.entry();
		try {
			 ServiceDayType value = new ServiceDayType(parser);
			 String key = value.getKey();
			 if (servicesForTheDay.containsKey(key)) {
				 value = servicesForTheDay.get(key);
				 value.addFile(file, parser);
				 servicesForTheDay.put(key, value);
			 } else {
				 value.addFile(file, parser);
				 servicesForTheDay.put(key, value);				 
			 }
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(theDay.getFormattedDate());
		Set s = servicesForTheDay.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Map.Entry<String,ServiceDayTypeVersionFormat> entry = (Map.Entry<String, ServiceDayTypeVersionFormat>) it.next();
			String key = entry.getKey();
			ServiceDayTypeVersionFormat value = entry.getValue();
			sb.append("\n");
			sb.append("\tService Type: "+ key + " File: " + value);
		}
		return sb.toString();
	}
	
	/**
	 * Provides an iterator that preserves the service order of
	 * Vespers, then Matins, then Liturgy.
	 * @return an iterator of services
	 */
	public List<ServiceDayType> getServicesOrdered() {
		services = new ArrayList<ServiceDayType>();

		// the order of the constants below is critical.  It governs the order in which 
		// services will appear on the index pages in the website
		addEntriesForService(theKey, AlwbConstants.MIDNIGHT_OFFICE);
		addEntriesForService(theKey, AlwbConstants.MATINS);
		addEntriesForService(theKey, AlwbConstants.HOURS_1);
		addEntriesForService(theKey, AlwbConstants.HOURS_3);
		addEntriesForService(theKey, AlwbConstants.HOURS_6);
		addEntriesForService(theKey, AlwbConstants.LITURGY);
		// liturgy, hours 9 and great hours are mutually exclusive.  
		// Only one will occur on a particular day.
		addEntriesForService(theKey, AlwbConstants.HOURS_9);
		addEntriesForService(theKey, AlwbConstants.GREAT_HOURS);
		addEntriesForService(theKey, AlwbConstants.SMALL_VESPERS);
		addEntriesForService(theKey, AlwbConstants.VESPERS);
		addEntriesForService(theKey, AlwbConstants.PRESANCTIFIED_LITURGY);
		addEntriesForService(theKey, AlwbConstants.VESPERAL_LITURGY);
		addEntriesForService(theKey, AlwbConstants.COMPLINE);
		addEntriesForService(theKey, AlwbConstants.EVENING_MATINS);
		return services;
	}
	
	/**
	 * Iterates from 1 through 9 adding the number to the service
	 * constant in order to determine whether there is a match.
	 * For example, ma1, ma2, ma3, ma4, etc. up to ma9.  This 
	 * allows the user to define alternate titles for services,
	 * and to have multiple occurrences of each type of service
	 * on the same day. 
	 * @param service
	 * @param key
	 * @param constant
	 */
	private void addEntriesForService(String key, String constant) {
		
		// first check for the normal service type (e.g. ma without a number)
		try {
			ServiceDayType service = servicesForTheDay.get(key+constant);
			if (service != null) {
				services.add(service);
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		// now iterate and append 1 through 9 after the service type, e.g. ma1, ma2, etc. to ma9.
		for (int i=1; i < 10; i++) {
			try {
				ServiceDayType service = servicesForTheDay.get(key+constant+Integer.valueOf(i));
				if (service != null) {
					services.add(service);
				}
			} catch (Exception e) {
				logger.catching(e);
			}
		}
	}
	
	private void updateCommemoration(String c) {
		if (c != "") {
			commemoration = c;
		}
	}
	
	/**
	 * In case only one of the services has the commemoration, we will
	 * read all services.
	 */
	public void setCommemoration() {
		ServiceDayTypeVersionFormat compline = null;
		ServiceDayTypeVersionFormat vespers = null;
		ServiceDayTypeVersionFormat hours = null;
		ServiceDayTypeVersionFormat matins = null;
		ServiceDayTypeVersionFormat liturgy = null;
/**
		try {
			compline = theFiles.get(AlwbConstants.COMPLINE);
			if (compline != null) {
				updateCommemoration(compline.getCommemoration());
			}
		} catch (Exception e) {
		}
		try {
			vespers = theFiles.get(AlwbConstants.VESPERS);
			if (vespers != null) {
				updateCommemoration(vespers.getCommemoration());
			}
		} catch (Exception e) {
		}
		try {
			hours = theFiles.get(AlwbConstants.HOURS_1);
			if (hours != null) {
				updateCommemoration(hours.getCommemoration());
			}
		} catch (Exception e) {
		}
		try {
			matins = theFiles.get(AlwbConstants.MATINS);
			if (matins != null) {
				updateCommemoration(matins.getCommemoration());
			}
		} catch (Exception e) {
		}
		try {
			liturgy = theFiles.get(AlwbConstants.LITURGY);
			if (liturgy != null) {
				updateCommemoration(liturgy.getCommemoration());
			}
		} catch (Exception e) {
		}
**/
	}
}
