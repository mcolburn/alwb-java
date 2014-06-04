package net.ages.workbench.templates.dsl.html;

import net.ages.workbench.templates.dsl.rubrics.engine.LiturgicalDayProperties;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import net.ages.workbench.utils.AlwbLogger;

import org.apache.logging.log4j.Logger;

import net.ages.workbench.templates.dsl.html.ServiceDayTypeVersion;
import net.ages.workbench.utils.AlwbConstants;

/**
 * Contains all the versions available for a specific type of service on a specific day
 * @author mac002
 *
 */
public class ServiceDayTypeVersion {
	
	private String theKey = "";
	private Logger logger = AlwbLogger.getLogger("ServiceDayTypeVersion");
	private SortedMap<String,ServiceDayTypeVersionFormat> theMap = new TreeMap<String,ServiceDayTypeVersionFormat>();
	private String languages;
	
	public ServiceDayTypeVersion(FileNameParser parser) {
		theKey = parser.getKey();
	}
	
	public String getKey() {
		return theKey;
	}
	
	public String getLanguages() {
		return languages;
	}

	public SortedMap<String,ServiceDayTypeVersionFormat> getServicesForDate() {
		return theMap;
	}
	
	public void addFile(File file, FileNameParser parser) {
		String filename = file.getName();
		String path = file.getPath();
		String language = parser.languageLocalNames();
		logger.entry();
		languages = parser.languageLocalNames();
		try {
			 ServiceDayTypeVersionFormat value = new ServiceDayTypeVersionFormat(file,parser);
			 String key = value.getKey();
			 theMap.put(key, value);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
	}
	
}
