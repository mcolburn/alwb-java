package net.ages.workbench.resources.utils;

public class AlwbResourceUtils {
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
				result[1] = (theParts[1] + "." + theParts[2] + "." + theParts[3].replace(".ares", "")).toLowerCase();
			} else {
				result = null;
			}
		} catch (Exception e) {
			result = null;
		}
		return result;
	}
}
