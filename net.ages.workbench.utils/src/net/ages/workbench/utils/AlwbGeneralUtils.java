package net.ages.workbench.utils;


import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;

import net.ages.workbench.utils.AlwbConstants;
import net.ages.workbench.utils.AlwbLogger;

import org.apache.logging.log4j.Logger;


/**
 * Miscellaneous Utilities to share across projects
 * 
 * @author mac002
 *
 */
public class AlwbGeneralUtils {
	private static Logger logger = AlwbLogger.getLogger("AlwbGeneralUtils");
	private static String agesPreferenceNode = "net.ages.workbench.templates.dsl.ui";
	public static String htmlFileToOpen = "";
	public static String pdfFileToOpen = "";
	public static String mainHtmlFileToOpen = "";
	public static String absolutePathToSrcGen = "";
	public static boolean websiteOnly = false;
	public static boolean copyAssets = false;
	
	public static String getBundleName(String file) {
		logger.entry();
		String [] theParts = file.split("_");
		String result = "";
		if (theParts.length ==4) {
			result = theParts[1] + "_" + theParts[2] + "_" + theParts[3].replace(".ares", "");
		}
		logger.exit();
		return result;
	}

	/**
	 * For a given ares filename, return the prefix and domain parts
	 * @param file - ares filename
	 * @return array with prefix in [0] and domain in [1]
	 */
	public static String[] getAresFileParts(String file) {
		String [] theParts;
		String [] result;
		try {
			theParts = file.split("_");
			result = new String[2];
			if (theParts.length ==4) {
				result[0] = theParts[0];
				result[1] = theParts[1] + "_" + theParts[2] + "_" + theParts[3].replace(".ares", "");
			} else {
				result = null;
			}
		} catch (Exception e) {
			result = null;
		}
		return result;
	}

	public static void resultPathsToFiles() {
		htmlFileToOpen = "";
		pdfFileToOpen = "";
		mainHtmlFileToOpen = "";
	}
	
	public static String getFileToOpen() {
		String result = "";
		int preference = Integer.valueOf(getAgesStringPreference(AlwbConstants.P_CHOICE_OUTPUT_TYPE));
		switch (preference) {
			case (AlwbConstants.HTML): {
				result = htmlFileToOpen;
				break;
			}
			case (AlwbConstants.MAIN_HTML): {
				result = mainHtmlFileToOpen;
				break;
			}
			case (AlwbConstants.PDF): {
				result = pdfFileToOpen;
				break;
			}
			default: {
				result = "";
			}
		}
		return result;
	}
	
	
	// these need to match net.ages.workbench.templates.dsl.ui.preferences.PreferenceConstants.java
	// my preference would be to point to it, but I don't know how to avoid templates.dsl having
	// a dependency on dsl.ui if I do this.
	/**
	 * 
	 * @param node, the node whose preferences you want, e.g. net.ages.workbench.templates.dsl.ui
	 * @param key 
	 * @return
	 */
	public static String getAgesStringPreference(String node, String key) {
		try {
			return Platform.getPreferencesService().getString(agesPreferenceNode, key, "Not found", null);
		} catch (Exception e) {
			return "Not Found";
		}
	}

	public static boolean getMessagesHtmlFlag() {
		return getAgesBooleanPreference(AlwbConstants.P_BOOLEAN_GEN_MESSAGES_HTML);
	}

	/**
	 * Gets the boolean value for the specified key stored from the AGES Workbench preference page
	 * @see getAgesStringPreference(String key)
	 * @see getAgesIntPreference(String key)
	 * @param key - see net.ages.workbench.templates.dsl.ui.preferences.PreferenceConstants for key values
	 * @return the boolean value associated with the store
	 */
	public static boolean getAgesBooleanPreference(String key) {
			return Platform.getPreferencesService().getBoolean(agesPreferenceNode, key, false, null);
	}
	/**
	 * Gets the int value for the specified key stored from the AGES Workbench preference page
	 * @see getAgesStringPreference(String key)
	 * @see getAgesBooleanPreference(String key)
	 * @param key - see net.ages.workbench.templates.dsl.ui.preferences.PreferenceConstants for key values
	 * @return the boolean value associated with the store
	 */
	public static int getAgesIntPreference(String key) {
			return Platform.getPreferencesService().getInt(agesPreferenceNode, key, 0, null);
	}
		
	/**
	 * Gets the String value for the specified key stored from the AGES Workbench preference page
	 * @see getAgesBooleanPreference(String key)
	 * @param key - see net.ages.workbench.templates.dsl.ui.preferences.PreferenceConstants for key values
	 * @return the String value associated with the store
	 */
	public static String getAgesStringPreference(String key) {
		String result = Platform.getPreferencesService().getString(agesPreferenceNode, key, "Not found", null);
		return result;
	}

	public static int getOutputPreference() {
		try {
			return Integer.parseInt(getAgesStringPreference(AlwbConstants.P_CHOICE_OUTPUT_TYPE));
		} catch (Exception e) {
			return AlwbConstants.MAIN_HTML;
		}
	}

	/**
	 * Get the Log4j preference set by the user
	 * @return Log4J level
	 */
	public static String getLog4jLevel() {
		String result = "";
		
		switch(getAgesStringPreference(AlwbConstants.P_CHOICE_LOG4J).charAt(0)) {

			case ('a'): {
				result = AlwbLogger.LogLevel.ALL.toString();
				break;
			}
			case ('o'): {
				result = AlwbLogger.LogLevel.OFF.toString();
				break;
			}
			case ('e'): {
				result = AlwbLogger.LogLevel.ERROR.toString();
				break;
			}
			case ('w'): {
				result = AlwbLogger.LogLevel.WARN.toString();
				break;
			}
			case ('i'): {
				result = AlwbLogger.LogLevel.INFO.toString();
				break;
			}
			case ('d'): {
				result = AlwbLogger.LogLevel.DEBUG.toString();
				break;
			}
			case ('t'): {
				result = AlwbLogger.LogLevel.TRACE.toString();
				break;
			}
		}
		return result;
	}
	
	/**
	 * Recursively read contents of directory and return all files found
	 * @param directory
	 * @param extension period + file extension, e.g. .html
	 * @return List containing all files found
	 */
	public static List<File> getFilesInDirectory(String directory, final String extension) {
		logger.entry();
		File dir = new File(directory);
		String [] extensions = {extension};
		List<File> files = null;
		try {
			files = (List<File>) FileUtils.listFiles(dir, extensions, true);
		} catch (Exception e) {
			logger.catching(e);
			files = null;
		}
		logger.exit();
		return files;
	}
	
	/**
	 * Copies a directory, subdirectories and all files to the target
	 * @param from - path to source directory
	 * @param to - path to target directory
	 */
	public static void copyDirectory(String from, String to) {
		logger.entry();
		try {
			File srcDir = new File(from);
			File destDir = new File(from.split("net.ages")[0]+to);
			FileUtils.copyDirectory(srcDir, destDir);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
	}
	
	/**
	 * Copies CSS folder and files from the specified directory into the CSS folder of the generated website
	 * @param to path to folder from which to copy
	 */
	public static void copyCss(String from, String to ) {
			copyDirectory(from,to + "css");
	}

	/**
	 * Copies Javascript folder and files from the specified directory into the JS folder of the generated website
	 * @param to path to folder from which to copy
	 */
	public static void copyJs(String from, String to ) {
			copyDirectory(from,to + "js");
	}

	/**
	 * Copies the HTML files from the specified directory into the root folder of the generated website
	 * @param to path to folder from which to copy
	 */

	public static void copyRoot(String from, String to ) {
			copyDirectory(from,to);
	}
	/**
	 * Copies Media folder and files from the specified directory into the MEDIA folder of the generated website
	 * @param to path to folder from which to copy
	 */
	public static void copyMedia(String from, String to ) {
			copyDirectory(from,to + "m");
	}
	
}
