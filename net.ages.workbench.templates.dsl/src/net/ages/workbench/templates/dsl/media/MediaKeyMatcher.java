package net.ages.workbench.templates.dsl.media;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.Logger;
import net.ages.workbench.utils.AlwbLogger;


public class MediaKeyMatcher {
	
	private static Logger logger = AlwbLogger.getLogger("MediaKeyMatcher");
	public final static int HYMN_ID_INDEX = 1;
	public final static int COMP_ID_INDEX = 2;
	public final static int AUDIO_ID_INDEX = 3;
	private static String regExIdsInAudioEntry = "(.*)\\.(c\\d+)\\.(a\\d+)\\..*";
	private static Pattern patternIdsInAudioEntry = Pattern.compile(regExIdsInAudioEntry);
	private static String regExIdsInCompositionEntry = "(.*)\\.(c\\d+)\\..*";
	private static Pattern patternIdsInCompositionEntry = Pattern.compile(regExIdsInCompositionEntry);

	/**
	 * Applies the patternIdsInEntry to the key and if matches, 
	 * returns the Matcher group indexed by the index parameter.
	 * @param key - the media file key
	 * @param index - the index of the group number of the matcher to return
	 * @return the value returned by the matcher for that index
	 */
	public static String getId(String key, int index) {
		String result = "";
		try {
			// First apply matcher for Audio entries.
			Matcher matcher = patternIdsInAudioEntry.matcher(key);
			if (matcher.matches()) {
				result = matcher.group(index);
			} else { // This must be a non-audio entry
				matcher = patternIdsInCompositionEntry.matcher(key);
				if (matcher.matches()) {
					result = matcher.group(index);
				}
			}
		} catch (Exception e) {
			logger.catching(e);
			result = key;
		}
		return result;
	}
}
