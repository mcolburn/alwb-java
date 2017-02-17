package net.ages.workbench.templates.dsl.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.ages.workbench.utils.AlwbLogger;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.URI;

public class ModelFormatter {
	private static Logger logger = AlwbLogger.getLogger("ModelFormatter");
			
	/**
	 * Return the names of the file in the specified directory
	 * @param pathToDirectory
	 * @return
	 */
	public static List<String> filenamesFromDirectory(String pathToDirectory) {
		logger.entry();
		List<String> results = new ArrayList<String>();
		try {
			File[] files = new File(pathToDirectory).listFiles();

			for (File file : files) {
			    if (file.isFile()) {
			        results.add(file.getName());
			    }
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return results;
		}
	
	public static String cssLinks(URI uri, String prefix, String path, String suffix) {
		logger.entry();
		StringBuffer sb = new StringBuffer();
		try {
			List<String> files = filenamesFromDirectory(path);
			for (String f : files) {
				sb.append(prefix);
				sb.append(f);
				sb.append(suffix);
			}
		} catch (Exception e) {
			logger.catching(e);
			sb.append(prefix + "directory not found" + suffix);
		}
		logger.exit();
		return sb.toString();
	}
	
	private static String resolve(URI uri) {
		String result = "";
		return result;
	}
}
