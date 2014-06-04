package net.ages.workbench.templates.dsl.media;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.apache.logging.log4j.Logger;

import net.ages.workbench.utils.AlwbLogger;

public class Hymn {
	
	private Logger logger = AlwbLogger.getLogger("Hymn");
	private String id;
	
	public Map<String,Composition> compositions = new TreeMap<String,Composition>();
	
	public Hymn (String id) {
		this.id = id;
	}
	
	public void addEntry(Entry<String,String> entry) {
		try {
			String compositionKey = MediaKeyMatcher.getId(entry.getKey(), MediaKeyMatcher.COMP_ID_INDEX);
			Composition comp;
			if (compositions.containsKey(compositionKey)) {
				comp = compositions.get(compositionKey);
			} else {
				comp = new Composition(this, compositionKey);
			}
			comp.addEntry(entry);
			compositions.put(compositionKey, comp);
		} catch (Exception e) {
			logger.catching(e);
		}
	}
	
	/**
	 * Get the number of audio recordings for this hymn
	 * @return
	 */
	public int getRecordingCount() {
		Iterator <Entry<String,Composition>> it = compositions.entrySet().iterator();
		int count = 0;
		while (it.hasNext()) {
			count += it.next().getValue().getRecordings().size();
		}
		return count;
	}
	
	/**
	 * Finds all the recordings for this hymn, across all compositions
	 * @return a map of the recordings, sorted by composition ID + audio ID
	 */
	public Map<String,AudioRecording> getRecordings() {
		if (id.contains("tr.d065.trMA.Lauds1")) {
			System.out.println("");
		}
		Map<String,AudioRecording> result = new TreeMap<String,AudioRecording>();
		try {
			Iterator <Entry<String,Composition>> it = compositions.entrySet().iterator();
			while (it.hasNext()) {
				Entry<String,Composition> compEntry = it.next();
				Map<String,AudioRecording> recordings = compEntry.getValue().getRecordings();
				Iterator<Entry<String,AudioRecording>> recordingsIt = recordings.entrySet().iterator();
				while (recordingsIt.hasNext()) {
					Entry<String,AudioRecording> entry = recordingsIt.next();
					AudioRecording recording = entry.getValue();
					if (recording.hasRequiredMenuProperties()) {
						result.put(compEntry.getKey()+ entry.getKey(), entry.getValue());
					}
				}
			}
		} catch (Exception e) {
			logger.catching(e);
			result = null;
		}
		return result;
	}

	/**
	 * Finds all the Byzantine Scores for this hymn, across all compositions
	 * @return a map of the Byzantine Scores, sorted by composition ID
	 */
	public Map<String,ByzantineScore> getByzantineScores() {
		if (id.contains("tr.d065.trMA.Lauds1")) {
			System.out.println("");
		}
		Map<String,ByzantineScore> result = new TreeMap<String,ByzantineScore>();
		try {
			Iterator <Entry<String,Composition>> it = compositions.entrySet().iterator();
			while (it.hasNext()) {
				Entry<String,Composition> compEntry = it.next();
				if (compEntry.getValue().getByzScore() != null) {
					ByzantineScore score = compEntry.getValue().getByzScore();
					if (score.hasRequiredMenuProperties()) {
						result.put(compEntry.getKey(), score);
					}
				}
			}
		} catch (Exception e) {
			logger.catching(e);
			result = null;
		}
		return result;
	}
	/**
	 * Finds all the Western Scores for this hymn, across all compositions
	 * @return a map of the Western Scores, sorted by composition ID
	 */
	public Map<String,WesternScore> getWesternScores() {
		if (id.contains("tr.d065.trMA.Lauds1")) {
			System.out.println("");
		}
		Map<String,WesternScore> result = new TreeMap<String,WesternScore>();
		try {
			Iterator <Entry<String,Composition>> it = compositions.entrySet().iterator();
			while (it.hasNext()) {
				Entry<String,Composition> compEntry = it.next();
				if (compEntry.getValue().getWesternScore() != null) {
					WesternScore score = compEntry.getValue().getWesternScore();
					if (score.hasRequiredMenuProperties()) {
						result.put(compEntry.getKey(), score);
					}
				}
			}
		} catch (Exception e) {
			logger.catching(e);
			result = null;
		}
		return result;
	}
}
