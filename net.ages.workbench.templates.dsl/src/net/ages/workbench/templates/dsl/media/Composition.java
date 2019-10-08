package net.ages.workbench.templates.dsl.media;
/**
 * * oc.m4.d1.ocMA.GodIsTheLord.c1.a1.singer            = people.dedes
 * oc.m4.d1.ocMA.GodIsTheLord.c1.a1.url.base          = url.base.dcs
 * oc.m4.d1.ocMA.GodIsTheLord.c1.a1.url.path          = "MW/WMatins3/a/SM3-00.mp3"
 * oc.m4.d1.ocMA.GodIsTheLord.c1.a1.year              = "2013"
 * oc.m4.d1.ocMA.GodIsTheLord.c1.a2.singer            = people.kabarnos
 * oc.m4.d1.ocMA.GodIsTheLord.c1.a2.url.base          = url.base.dcs
 * oc.m4.d1.ocMA.GodIsTheLord.c1.a2.url.path          = "MW/WMatins3/a/SM3-02.mp3"
 * oc.m4.d1.ocMA.GodIsTheLord.c1.a2.year              = "2013"
 * oc.m4.d1.ocMA.GodIsTheLord.c1.composer                 = people.dedes
 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.b.arranger = people.dedes
 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.b.url.base = url.base.dcs
 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.b.url.path = "oc.m4.d1.ocMA.GodIsTheLord.sb.pdf"
 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.b.year     = "2013"
 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.w.arranger   = people.dedes
 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.w.url.base   = url.base.dcs
 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.w.url.path   = "MW/WMatins4/00-01.pdf"
 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.w.year       
 */

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.apache.logging.log4j.Logger;

import net.ages.workbench.utils.AlwbLogger;

public class Composition {
	private Logger logger = AlwbLogger.getLogger("Composition");
	private Hymn parent;
	private String id = "";
	private String composer = "";
	private ByzantineScore byzScore = null;
	private WesternScore westernScore = null;
	private Map<String,AudioRecording> recordings = new TreeMap<String,AudioRecording>();
	
	public Composition(Hymn parent, String id) {
		this.parent = parent;
		this.id = id;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getId() {
		return id;
	}

	public ByzantineScore getByzScore() {
		return byzScore;
	}

	public WesternScore getWesternScore() {
		return westernScore;
	}

	public Map<String, AudioRecording> getRecordings() {
		return recordings;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setByzScore(ByzantineScore byzScore) {
		this.byzScore = byzScore;
	}

	public void setWesternScore(WesternScore westernScore) {
		this.westernScore = westernScore;
	}

	public void setRecordings(Map<String, AudioRecording> recordings) {
		this.recordings = recordings;
	}
	
	public void addEntry(Entry<String,String> entry) {
		try {
			String key = entry.getKey();
			if (key.contains("score.b")) {
				addByzantineScoreEntry(entry);
			} else if (key.contains("score.w")) {
				addWesternScoreEntry(entry);
			} else  if (key.contains("composer")){
				this.setComposer(entry.getValue());
			} else { // assume audio
				addAudioEntry(entry);
			}
		} catch (Exception e) {
			logger.catching(e);
		}
	}
	
	/**
	 * Parse the audio entry and add it to the appropriate instance of audio.
	 * Audio entries look like this:
	 * 
	 * 	oc.m4.d1.ocMA.GodIsTheLord.c1.a1.singer            = people.dedes
	 * 	oc.m4.d1.ocMA.GodIsTheLord.c1.a1.url.base          = url.base.dcs
	 * 	oc.m4.d1.ocMA.GodIsTheLord.c1.a1.url.path          = "MW/WMatins3/a/SM3-00.mp3"
	 * 	oc.m4.d1.ocMA.GodIsTheLord.c1.a1.year              = "2013"
	 * 
	 * @param entry
	 */
	private void addAudioEntry(Entry<String,String> entry) {
		try {
			if (propertyNotNull(entry.getValue())) {

				String key = entry.getKey();
				String audioId = MediaKeyMatcher.getId(key, MediaKeyMatcher.AUDIO_ID_INDEX);
				AudioRecording r;
	
				if (recordings.containsKey(audioId)) {
					r = recordings.get(audioId);
				} else {
					r = new AudioRecording(this,audioId);
				}
	
				if (key.endsWith("singer")) {
					r.setSinger(entry.getValue());
				} else if (key.endsWith("base")) {
					r.setBase(entry.getValue());
				} else if (key.endsWith("path")) {
					r.setPath(entry.getValue());
				} else if (key.equals("year")) {
					r.setYear(entry.getValue());
				}
	
				recordings.put(audioId, r);
			}
		} catch (Exception e) {
			logger.catching(e);
		}
	}

	/**
	 * Parse the entry and set the appropriate score property
	 * @param entry
	 */
	private void addByzantineScoreEntry(Entry<String,String> entry) {
		try {
			if (propertyNotNull(entry.getValue())) {

				if (byzScore == null) {
					byzScore = new ByzantineScore(this,id);
				}
				String key = entry.getKey();
	
				if (key.endsWith("arranger")) {
					byzScore.setArranger(entry.getValue());
				} else if (key.endsWith("base")) {
					byzScore.setBase(entry.getValue());
				} else if (key.endsWith("path")) {
					byzScore.setPath(entry.getValue());
				} else if (key.equals("year")) {
					byzScore.setYear(entry.getValue());
				}
			}
		} catch (Exception e) {
			logger.catching(e);
		}
	}

	/**
	 * Parse the entry and set the appropriate score property
	 * @param entry
	 */
	private void addWesternScoreEntry(Entry<String,String> entry) {
		try {
			if (propertyNotNull(entry.getValue())) {
				if (westernScore == null) {
					westernScore = new WesternScore(this,id);
				}
				String key = entry.getKey();

				if (key.endsWith("arranger")) {
					westernScore.setArranger(entry.getValue());
				} else if (key.endsWith("base")) {
					westernScore.setBase(entry.getValue());
				} else if (key.endsWith("path")) {
					westernScore.setPath(entry.getValue());
				} else if (key.equals("year")) {
					westernScore.setYear(entry.getValue());
				}
			}
		} catch (Exception e) {
			logger.catching(e);
		}
	}	

	public boolean propertyNotNull(String property) {
		return (property != null && (property != "null") && (property != ""));
	}
}
