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
		List<ServiceDayType> services = new ArrayList<ServiceDayType>();

		ServiceDayType midnightOffice = null;
		ServiceDayType matins = null;
		ServiceDayType hours1 = null;
		ServiceDayType hours3 = null;
		ServiceDayType hours6 = null;
		ServiceDayType liturgy = null;
		ServiceDayType hours9 = null;
		ServiceDayType greatHours = null;
		ServiceDayType smallVespers = null;
		ServiceDayType vespers = null;
		ServiceDayType presanctifiedLiturgy = null;
		ServiceDayType vesperalLiturgy = null;
		ServiceDayType compline = null;
		ServiceDayType eveningMatins = null;
		// liturgy, hours 9 and great hours are mutually exclusive.  
		// Only one will occur on a particular day.

		try {
			midnightOffice = servicesForTheDay.get(theKey+AlwbConstants.MIDNIGHT_OFFICE);
			if (midnightOffice != null) {
				services.add(midnightOffice);
			}
		} catch (Exception e) {
		}
		try {
			matins = servicesForTheDay.get(theKey+AlwbConstants.MATINS);
			if (matins != null) {
				services.add(matins);
			}
		} catch (Exception e) {
		}
		try {
			hours1 = servicesForTheDay.get(theKey+AlwbConstants.HOURS_1);
			if (hours1 != null) {
				services.add(hours1);
			}
		} catch (Exception e) {
		}
		try {
			hours3 = servicesForTheDay.get(theKey+AlwbConstants.HOURS_3);
			if (hours3 != null) {
				services.add(hours3);
			}
		} catch (Exception e) {
		}
		try {
			hours6 = servicesForTheDay.get(theKey+AlwbConstants.HOURS_6);
			if (hours6 != null) {
				services.add(hours6);
			}
		} catch (Exception e) {
		}
		try {
			liturgy = servicesForTheDay.get(theKey+AlwbConstants.LITURGY);
			if (liturgy != null) {
				services.add(liturgy);
			}
		} catch (Exception e) {
		}
		try {
			hours9 = servicesForTheDay.get(theKey+AlwbConstants.HOURS_9);
			if (hours9 != null) {
				services.add(hours9);
			}
		} catch (Exception e) {
		}
		try {
			greatHours = servicesForTheDay.get(theKey+AlwbConstants.GREAT_HOURS);
			if (greatHours != null) {
				services.add(greatHours);
			}
		} catch (Exception e) {
		}
		try {
			smallVespers = servicesForTheDay.get(theKey+AlwbConstants.SMALL_VESPERS);
			if (smallVespers != null) {
				services.add(smallVespers);
			}
		} catch (Exception e) {
		}
		try {
			vespers = servicesForTheDay.get(theKey+AlwbConstants.VESPERS);
			if (vespers != null) {
				services.add(vespers);
			}
		} catch (Exception e) {
		}
		try {
			presanctifiedLiturgy = servicesForTheDay.get(theKey+AlwbConstants.PRESANCTIFIED_LITURGY);
			if (presanctifiedLiturgy != null) {
				services.add(presanctifiedLiturgy);
			}
		} catch (Exception e) {
		}
		try {
			vesperalLiturgy = servicesForTheDay.get(theKey+AlwbConstants.VESPERAL_LITURGY);
			if (vesperalLiturgy != null) {
				services.add(vesperalLiturgy);
			}
		} catch (Exception e) {
		}
		try {
			compline = servicesForTheDay.get(theKey+AlwbConstants.COMPLINE);
			if (compline != null) {
				services.add(compline);
			}
		} catch (Exception e) {
		}
		try {
			eveningMatins = servicesForTheDay.get(theKey+AlwbConstants.EVENING_MATINS);
			if (eveningMatins != null) {
				services.add(eveningMatins);
			}
		} catch (Exception e) {
		}
		return services;
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
