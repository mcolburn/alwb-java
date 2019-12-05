package net.ages.workbench.templates.dsl.media;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.TreeMap;

import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

import com.google.common.collect.Iterables;

import net.ages.workbench.utils.AlwbLogger;
import net.ages.workbench.resources.dsl.ares.Definition;
import net.ages.workbench.templates.dsl.media.Composition;
import net.ages.workbench.templates.dsl.media.AudioRecording;
import net.ages.workbench.templates.dsl.media.ByzantineScore;
import net.ages.workbench.templates.dsl.media.WesternScore;
import net.ages.workbench.templates.dsl.media.MediaKeyMatcher;
import net.ages.workbench.templates.dsl.preferences.Preferences;
/**
 * Media Class
 * @author mac002
 *<p>This class loads information about media available for a given domain (i.e. en_US_ematins).  
 * It assumes that an ares file exists that has the name 'media' + the domain + '.ares', e.g. media.en_US_ematins.ares
 * This file contains key-value pairs.  The first part of the key is supposed to be the key from a hymn or verse.
 * The media class also relies on a set of 'model' key-value pairs.  The model describes the naming convention the 
 * media file author has used to indicate the value of various types of fields that are expected.
 * Below are the contents of a sample media file:
 * <p>
 * A_Resource_Whose_Name = media_en_US_ematins
 * 
 * key.model.composition = "c"
 * key.model.audio = "a"
 * key.model.singer = "singer"
 * key.model.arranger = "arranger"
 * key.model.composer = "composer"
 * key.model.url.base = "url.base"
 * key.model.url.path = "url.path"
 * key.model.year = "year"
 * key.model.score.western = "score.w"
 * key.model.score.byzantine = "score.b"
 * 
 * oc.m4.d1.ocMA.GodIsTheLord.c1.a1.singer            = people.dedes
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
 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.w.year       = "2013"

 * people.dedes    = "Seraphim Dedes"
 * people.kabarnos = "Nikodemos Kabarnos"

 * url.base.dcs = "http://agesinitiatives.com/dcs/"

 */
public class Media {
	private Preferences preferences;
	private Map<String,String> map = new TreeMap<String,String>();
	private Map<String,Hymn> hymns = new TreeMap<String,Hymn>();
	private Resource media_resource;
	private Logger logger = AlwbLogger.getLogger("Media");
	private Map<String,String> loadOptions;

	private String KEY_COMPOSITION = "";
	private String KEY_AUDIO = "";
	private String KEY_COMPOSER = "";
	private String KEY_DOCUMENT = "";
	private String KEY_ARRANGER = "";
	private String KEY_SINGER = "";
	private String KEY_YEAR = "";
	private String KEY_URL_BASE = "";
	private String KEY_URL_PATH = "";
	private String KEY_SCORE_WESTERN = "";
	private String KEY_SCORE_BYZANTINE = "";
	private String KEY_HREF_OPEN_AUDIO_TARGET = "";
	private String KEY_HREF_OPEN_DOCUMENT_TARGET = "";
	private String KEY_HREF_OPEN_BYZANTINE_TARGET = "";
	private String KEY_HREF_OPEN_WESTERN_TARGET = "";
	private String KEY_HTML_MEDIA_TOOLTIP_SCORE_BYZANTINE = "";
	private String KEY_HTML_MEDIA_TOOLTIP_SCORE_WESTERN = "";
	private String KEY_HTML_MEDIA_TOOLTIP_AUDIO = "";
	private String KEY_HTML_MEDIA_TOOLTIP_DOCUMENT = "";

	private static final String KEY_MODEL = "key.model";
	private static final String KEY_MODEL_COMPOSITION = KEY_MODEL + ".composition";
	private static final String KEY_MODEL_AUDIO = KEY_MODEL + ".audio";
	private static final String KEY_MODEL_COMPOSER = KEY_MODEL + ".composer";
	private static final String KEY_MODEL_DOCUMENT = KEY_MODEL + ".text";
	private static final String KEY_MODEL_ARRANGER = KEY_MODEL + ".arranger";
	private static final String KEY_MODEL_SINGER = KEY_MODEL + ".singer";
	private static final String KEY_MODEL_YEAR = KEY_MODEL + ".year";
	private static final String KEY_MODEL_URL_BASE = KEY_MODEL + ".url.base";
	private static final String KEY_MODEL_URL_PATH = KEY_MODEL + ".url.path";
	private static final String KEY_MODEL_SCORE_WESTERN = KEY_MODEL + ".score.western";
	private static final String KEY_MODEL_SCORE_BYZANTINE = KEY_MODEL + ".score.byzantine";
	private static final String KEY_HTML_ICON_AUDIO = "html.icon.audio";
	private static final String KEY_HTML_ICON_DOCUMENT = "html.icon.text";
	private static final String KEY_HTML_ICON_BYZANTINE = "html.icon.byzantine";
	private static final String KEY_HTML_ICON_WESTERN = "html.icon.western";
	private static final String KEY_MODEL_HTML_AUDIO_TARGET = KEY_MODEL + ".html.media.target.audio";
	private static final String KEY_MODEL_HTML_DOCUMENT_TARGET = KEY_MODEL + ".html.media.target.text";
	private static final String KEY_MODEL_HTML_BYZANTINE_TARGET = KEY_MODEL + ".html.media.target.score.byzantine";
	private static final String KEY_MODEL_HTML_WESTERN_TARGET = KEY_MODEL + ".html.media.target.score.western";
	private static final String KEY_MODEL_HTML_MEDIA_TOOLTIP_AUDIO = KEY_MODEL + ".html.media.tooltip.audio";
	private static final String KEY_MODEL_HTML_MEDIA_TOOLTIP_DOCUMENT = KEY_MODEL + ".html.media.tooltip.text";
	private static final String KEY_MODEL_HTML_MEDIA_TOOLTIP_SCORE_BYZANTINE = KEY_MODEL + ".html.media.tooltip.score.byzantine";
	private static final String KEY_MODEL_HTML_MEDIA_TOOLTIP_SCORE_WESTERN = KEY_MODEL + ".html.media.tooltip.score.western";

	private static final String TIP = "tip-";
	private static final String TIP_AUDIO = TIP + "audio";
	private static final String TIP_DOCUMENT = TIP + "doc";
	private static final String TIP_WESTERN = TIP + "western";
	private static final String TIP_BYZANTINE = TIP + "byzantine";
	private static final String HREF_ANCHOR_OPEN = "<a ";
	private static final String HREF_ANCHOR_MEDIA_CLASS_OPEN = "class='media-icon "; // typically overriden by value set by user in media.ares file
	private static final String HREF_ANCHOR_MEDIA_CLASS_MENU_ITEM_OPEN = "class='media-menu-item ";
	private static final String HREF_ANCHOR_MEDIA_CLASS_CLOSE_AUDIO_COL1 = TIP_AUDIO + "1' ";
	private static final String HREF_ANCHOR_MEDIA_CLASS_CLOSE_DOCUMENT_COL1 = TIP_DOCUMENT + "1' ";
	private static final String HREF_ANCHOR_MEDIA_CLASS_CLOSE_WESTERN_COL1 = TIP_WESTERN + "1' ";
	private static final String HREF_ANCHOR_MEDIA_CLASS_CLOSE_BYZANTINE_COL1 = TIP_BYZANTINE + "1' ";
	private static final String HREF_ANCHOR_MEDIA_CLASS_CLOSE_DOCUMENT_COL2 = TIP_DOCUMENT + "2' ";
	private static final String HREF_ANCHOR_MEDIA_CLASS_CLOSE_AUDIO_COL2 = TIP_AUDIO + "2' ";
	private static final String HREF_ANCHOR_MEDIA_CLASS_CLOSE_WESTERN_COL2 = TIP_WESTERN + "2' ";
	private static final String HREF_ANCHOR_MEDIA_CLASS_CLOSE_BYZANTINE_COL2 = TIP_BYZANTINE + "2' ";
	private static final String HREF_ANCHOR_MEDIA_CLASS_DOCUMENT_COL1 = 
			HREF_ANCHOR_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_OPEN
			+ HREF_ANCHOR_MEDIA_CLASS_CLOSE_DOCUMENT_COL1;
	private static final String HREF_ANCHOR_MEDIA_CLASS_DOCUMENT_COL2 = 
			HREF_ANCHOR_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_OPEN
			+ HREF_ANCHOR_MEDIA_CLASS_CLOSE_DOCUMENT_COL2;
	private static final String HREF_ANCHOR_MEDIA_CLASS_AUDIO_COL1 = 
			HREF_ANCHOR_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_OPEN
			+ HREF_ANCHOR_MEDIA_CLASS_CLOSE_AUDIO_COL1;
	private static final String HREF_ANCHOR_MEDIA_CLASS_AUDIO_COL2 = 
			HREF_ANCHOR_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_OPEN
			+ HREF_ANCHOR_MEDIA_CLASS_CLOSE_AUDIO_COL2;
	private static final String HREF_ANCHOR_MEDIA_CLASS_AUDIO_MENU_ITEM = 
			HREF_ANCHOR_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_MENU_ITEM_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_CLOSE_AUDIO_COL1;
	private static final String HREF_ANCHOR_MEDIA_CLASS_BYZANTINE_COL1 = 
			HREF_ANCHOR_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_CLOSE_BYZANTINE_COL1;
	private static final String HREF_ANCHOR_MEDIA_CLASS_BYZANTINE_COL2 = 
			HREF_ANCHOR_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_CLOSE_BYZANTINE_COL2;
	private static final String HREF_ANCHOR_MEDIA_CLASS_WESTERN_COL1 = 
			HREF_ANCHOR_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_CLOSE_WESTERN_COL1;
	private static final String HREF_ANCHOR_MEDIA_CLASS_WESTERN_COL2 = 
			HREF_ANCHOR_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_OPEN 
			+ HREF_ANCHOR_MEDIA_CLASS_CLOSE_WESTERN_COL2;
	private static final String HREF_ANCHOR_CLOSE = ">";
	private static final String HREF_OPEN = " href='";
	private static String hrefOpenTarget = " target='";
	private static String hrefOpenByzantineTarget = "";
	private static String hrefOpenWesternTarget = "";
	private static String hrefOpenAudioTarget = "";
	private static String hrefOpenDocumentTarget = "";
	private static final String HREF_SUFFIX = "</a>";
	private static final String HREF_BLOCK = "div";
	private static final String MEDIA_CLASS = " class='media-group'>";
	private static final String MEDIA_CLASS_EMPTY = " class='media-group-empty'>";
	private static final String HTML_MEDIA_MENU_OPEN = "<ul class='dropdown-menu' role='menu'>";
	private static final String HTML_MEDIA_MENU_CLOSE = "</ul>";
	private static final String HTML_MEDIA_MENU_LINE_ITEM_OPEN = "<li>";
	private static final String HTML_MEDIA_MENU_LINE_ITEM_CLOSE = "</li>";

	private static boolean includeDocument = false;
	private static boolean includeAudio = false;
	private static boolean includeWestern = false;
	private static boolean includeByzantine = false;
	
	private int languageColumn;
	private static int dropDownMenuId = 0;
	
	private String regExHymnKey = "(.*)\\.c\\d+\\..*";
	Pattern patternHymnKey = Pattern.compile(regExHymnKey);
	
	/**
	 * Initializes an instance of media for the media key-value pairs for a given domain, e.g. media.en_US_ematins.ares
	 * @param resource - The EMF resource for the given media file
	 * @param loadOptions - see ModelAccessor - used to support UTF-8
	 * @param languageColumn - 1 = 1st column, i.e. L1, 2 = 2nd column, e.g. L2
	 *  - used for processing specific to the left or right columns of bilingual text
	 */
	public Media(Resource resource, Map<String,String> loadOptions, int languageColumn, Preferences preferences) {
		logger.entry(resource.getURI().toString());
		try {
			this.preferences = preferences;
			this.languageColumn = languageColumn;  
			media_resource = resource;
			this.loadOptions = loadOptions;
			loadKeys();
			loadModels();
			loadCompositions();
			setHrefTargets();
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
	}
	
	/**
	 * If returns true, the user asked that audio links be included in the generated HTML
	 * @return whether or not to include
	 */
	public static boolean includeAudio() {
		return includeAudio;
	}
	
	/**
	 * If returns true, the user asked that document links be included in the generated HTML
	 * @return whether or not to include
	 */
	public static boolean includeDocument() {
		return includeDocument;
	}

	/**
	 * Sets a flag to indicate whether the user wants audio links included in the generated HTML
	 * @param includeAudio - true to include, false to not
	 */
	public static void includeAudio(boolean includeAudio) {
		Media.includeAudio = includeAudio;
	}


	/**
	 * Sets a flag to indicate whether the user wants audio links included in the generated HTML
	 * @param includeAudio - true to include, false to not
	 */
	public static void includeDocument(boolean include) {
		Media.includeDocument = include;
	}
	
	/**
	 * If returns true, the user asked that Western score links be included in the generated HTML
	 * @return whether or not to include
	 */
	public static boolean includeWestern() {
		return includeWestern;
	}


	/**
	 * Sets a flag to indicate whether the user wants Western score links included in the generated HTML
	 * @param includeWestern - true to include, false to not
	 */
	public static void includeWestern(boolean includeWestern) {
		Media.includeWestern = includeWestern;
	}

	/**
	 * If returns true, the user asked that Byzantine score links be included in the generated HTML
	 * @return whether or not to include
	 */
	public static boolean includeByzantine() {
		return includeByzantine;
	}

	/**
	 * Sets a flag to indicate whether the user wants Byzantine score links included in the generated HTML
	 * @param includeByzantine - true to include, false to not
	 */
	public static void includeByzantine(boolean includeByzantine) {
		Media.includeByzantine = includeByzantine;
	}
	
	/**
	 * Iterates the resource for which the instance was created, and loads each composition into a composition map.
	 * The map key is the ID of the composition and the value is a Composition instance.
	 */
	private void loadKeys() {
		logger.entry();
		try {
			media_resource.load(loadOptions); // in order to ensure loaded as UTF-8
			TreeIterator<EObject> _allContents = media_resource.getAllContents();
			Iterable<EObject> _iterable = IteratorExtensions
					.<EObject> toIterable(_allContents);
			Iterable<Definition> _filter = Iterables.<Definition> filter(_iterable, Definition.class);
			String key = "";
			String value = "";
			for (final Definition e : _filter) {
				// Get the text for this key.  If it is null, check to see if instead
				// of a text it was a pointer to another key (aka a ref).
				if (e.getDsl_Definition_Text() != null) {
					value = e.getDsl_Definition_Text();
				} else if (e.getDsl_Definition_Ref() != null) {
					value = e.getDsl_Definition_Ref().getDsl_Definition_Text();
				} 
				if (propertyNotNull(value)) {
					key = e.getName();
					map.put(key, value);

					if (key.endsWith(".arranger") && value.contains("/")) {
						try {
							String compKey = key.replace(".arranger", ".url.base");
							 map.put(compKey, "../../");
							 compKey = key.replace(".arranger", ".year");
							 map.put(compKey, "2013");
						} catch (Exception er) {
							logger.catching(er);
						}
					}
					if (key.endsWith(".singer") && value.contains("/")) {
						try {
							String compKey = key.replace(".singer", ".url.base");
							 map.put(compKey, "../../");
							 compKey = key.replace(".singer", ".year");
							 map.put(compKey, "2013");
						} catch (Exception er) {
							logger.catching(er);
						}
					}
					if ((key.contains(".arranger") && (!key.contains("key.model.arranger")))
							|| (key.contains(".composer") && (!key.contains("key.model.composer")))
							) {
						try {
							String hymnkey = MediaKeyMatcher.getId(key, MediaKeyMatcher.HYMN_ID_INDEX);
							if (! hymns.containsKey(hymnkey)) {
								hymns.put(hymnkey, new Hymn(hymnkey));
							}
						} catch (Exception e0) {
							logger.catching(e0);
						}
					}
				}
				key = "";
				value = "";
			}
		} catch (IOException e1) {
			logger.catching(e1);
		}
		logger.exit();
	}
	
	public boolean propertyNotNull(String property) {
		return (property != null && (property != "null") && (property != ""));
	}

	
	public void loadCompositions() {
		Iterator<Entry<String,String>> it = map.entrySet().iterator();
		Entry<String,String> entry;
		Hymn hymn;
		String hymnKey;
		while (it.hasNext()) {
			entry = it.next();
			if (!entry.getKey().contains("key.model")) {
				try {
					hymnKey = MediaKeyMatcher.getId(entry.getKey(), MediaKeyMatcher.HYMN_ID_INDEX);
					hymn = hymns.get(hymnKey);
					if (hymn != null) {
						hymn.addEntry(entry);
						hymns.put(hymnKey, hymn);
					}
				} catch (Exception e0) {
					logger.catching(e0);
				}
			}

		}
	}
	
	
	/**
	 * Media files are expected to have key-values that represent the 'model' for
	 * each type of key.  
	 * <p>This allows the user to define the values they want for each model.
	 * <p>oc.m4.d1.ocMA.GodIsTheLord.c1.a1.singer requires key.model.singer to be set to 'singer'.
	 * <p>oc.m4.d1.ocMA.GodIsTheLord.c1.a1.s requires key.model.singer to be set to 's' 
	 * <p>This method reads in the models and sets the global KEYs to the models.
	 */
	private void loadModels() {
		logger.entry();
		try {
			 KEY_COMPOSITION = "." + map.get(KEY_MODEL_COMPOSITION);
		} catch (Exception e) {
			logger.error("Can't find media key model " + KEY_MODEL_COMPOSITION);
			logger.catching(e);
		}
		try {
			KEY_AUDIO = "." + map.get(KEY_MODEL_AUDIO);
		} catch (Exception e) {
			logger.error("Can't find media key model " + KEY_MODEL_AUDIO);
			logger.catching(e);
		}
		try {
			 KEY_DOCUMENT = "." + map.get(KEY_MODEL_DOCUMENT); // aka text
		} catch (Exception e) {
			logger.error("Can't find media key model " + KEY_MODEL_DOCUMENT);
			logger.catching(e);
		}
		try {
			 KEY_SINGER = "." + map.get(KEY_MODEL_SINGER);
		} catch (Exception e) {
			logger.error("Can't find media key model " + KEY_MODEL_SINGER);
			logger.catching(e);
		}
		try {
			KEY_ARRANGER = "." + map.get(KEY_MODEL_ARRANGER);
		} catch (Exception e) {
			logger.error("Can't find media key model " + KEY_MODEL_ARRANGER);
			logger.catching(e);
		}
		try {
			KEY_COMPOSER = "." + map.get(KEY_MODEL_COMPOSER);
		} catch (Exception e) {
			logger.error("Can't find media key model " + KEY_MODEL_COMPOSER);
			logger.catching(e);
		}
//		try {
//			 KEY_YEAR = "." + map.get(KEY_MODEL_YEAR);
//		} catch (Exception e) {
//			logger.error("Can't find media key model " + KEY_MODEL_YEAR);
//			logger.catching(e);
//		}
//		try {
//			KEY_URL_BASE = "." + map.get(KEY_MODEL_URL_BASE);
//		} catch (Exception e) {
//			logger.error("Can't find media key model " + KEY_MODEL_URL_BASE);
//			logger.catching(e);
//		}
		try {
			KEY_URL_PATH = "." + map.get(KEY_MODEL_URL_PATH);
		} catch (Exception e) {
			logger.error("Can't find media key model " + KEY_MODEL_URL_PATH);
			logger.catching(e);
		}
		try {
			 KEY_HTML_MEDIA_TOOLTIP_SCORE_WESTERN = map.get(KEY_MODEL_HTML_MEDIA_TOOLTIP_SCORE_WESTERN);
		} catch (Exception e) {
			logger.error("Can't find media key model " + KEY_MODEL_HTML_MEDIA_TOOLTIP_SCORE_WESTERN);
			logger.catching(e);
		}
		try {
			 KEY_HTML_MEDIA_TOOLTIP_SCORE_BYZANTINE = map.get(KEY_MODEL_HTML_MEDIA_TOOLTIP_SCORE_BYZANTINE);
		} catch (Exception e) {
			logger.error("Can't find media key model " + KEY_MODEL_HTML_MEDIA_TOOLTIP_SCORE_BYZANTINE);
			logger.catching(e);
		}
		try {
			 KEY_HTML_MEDIA_TOOLTIP_AUDIO = map.get(KEY_MODEL_HTML_MEDIA_TOOLTIP_AUDIO);
		} catch (Exception e) {
			logger.error("Can't find media key model " + KEY_MODEL_HTML_MEDIA_TOOLTIP_AUDIO);
			logger.catching(e);
		}
		try {
			 KEY_HTML_MEDIA_TOOLTIP_DOCUMENT = map.get(KEY_MODEL_HTML_MEDIA_TOOLTIP_DOCUMENT);
		} catch (Exception e) {
			logger.error("Can't find media key model " + KEY_MODEL_HTML_MEDIA_TOOLTIP_DOCUMENT);
			logger.catching(e);
		}
		try {
			 KEY_SCORE_WESTERN = "." + map.get(KEY_MODEL_SCORE_WESTERN);
		} catch (Exception e) {
			logger.error("Can't find media key model " + KEY_MODEL_SCORE_WESTERN);
			logger.catching(e);
		}
		try {
			 KEY_SCORE_BYZANTINE = "." + map.get(KEY_MODEL_SCORE_BYZANTINE);
		} catch (Exception e) {
			logger.error("Can't find media key model " + KEY_MODEL_SCORE_BYZANTINE);
			logger.catching(e);
		}
		try {
			 KEY_HREF_OPEN_AUDIO_TARGET = map.get(KEY_MODEL_HTML_AUDIO_TARGET);
		} catch (Exception e) {
			logger.error("Can't find media target " + KEY_MODEL_HTML_AUDIO_TARGET);
			logger.catching(e);
		}
		try {
			 KEY_HREF_OPEN_DOCUMENT_TARGET = map.get(KEY_MODEL_HTML_DOCUMENT_TARGET);
		} catch (Exception e) {
			logger.error("Can't find media target " + KEY_MODEL_HTML_DOCUMENT_TARGET);
			logger.catching(e);
		}
		try {
			 KEY_HREF_OPEN_BYZANTINE_TARGET = map.get(KEY_MODEL_HTML_BYZANTINE_TARGET);
		} catch (Exception e) {
			logger.error("Can't find media target " + KEY_MODEL_HTML_BYZANTINE_TARGET);
			logger.catching(e);
		}
		try {
			 KEY_HREF_OPEN_WESTERN_TARGET = map.get(KEY_MODEL_HTML_WESTERN_TARGET);
		} catch (Exception e) {
			logger.error("Can't find media target " + KEY_MODEL_HTML_WESTERN_TARGET);
			logger.catching(e);
		}
		logger.exit();
	}

	/**
	 * Retrieve the targets specified in the media.ares file and 
	 * set up the href targets to point to them.
	 */
	private void setHrefTargets() {
		logger.entry();
		try {
			String target = map.get(KEY_HREF_OPEN_AUDIO_TARGET);
			if (target == null) {
				hrefOpenAudioTarget = "";
			} else {
				hrefOpenAudioTarget = hrefOpenTarget + target + "'";
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		try {
			String target = map.get(KEY_HREF_OPEN_DOCUMENT_TARGET);
			if (target == null) {
				hrefOpenDocumentTarget = "";
			} else {
				hrefOpenDocumentTarget = hrefOpenTarget + target + "'";
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		try {
			String target = map.get(KEY_HREF_OPEN_BYZANTINE_TARGET);
			if (target == null) {
				hrefOpenByzantineTarget = "";
			} else {
				hrefOpenByzantineTarget = hrefOpenTarget + target + "'";
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		try {
			String target = map.get(KEY_HREF_OPEN_WESTERN_TARGET);
			if (target == null) {
				hrefOpenWesternTarget = "";
			} else {
				hrefOpenWesternTarget = hrefOpenTarget + target + "'";
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
	}
	
	/**
	 * Get the user set tooltip
	 * @return the user's tip if found, otherwise a default text
	 */
	public String getMediaToolTipScoreByzantine() {
		logger.entry();
		String tip = "";
		String defaultText = "Click to view score in Byzantine notation.";
		try {
			tip = map.get(KEY_HTML_MEDIA_TOOLTIP_SCORE_BYZANTINE);
			if (tip == null) {
				tip = defaultText;
				logger.info("Failed to find tooltip for Byzantine score in the language's media.ares file.  Using default text instead.");
			}
		} catch (Exception e) {
			logger.catching(e);
			tip = defaultText;
			logger.info("Failed to find tooltip for Byzantine score in the language's media.ares file.  Using default text instead.");
		}
		return tip;
	}

	/**
	 * Get the user set tooltip
	 * @return the user's tip if found, otherwise a default text
	 */
	public String getMediaToolTipScoreWestern() {
		logger.entry();
		String tip = "";
		String defaultText = "Click to view score in Western notation.";
		try {
			tip = map.get(KEY_HTML_MEDIA_TOOLTIP_SCORE_WESTERN);
			if (tip == null) {
				tip = defaultText;
				logger.info("Failed to find tooltip for Western score in the language's media.ares file.  Using default text instead.");
			}
		} catch (Exception e) {
			logger.catching(e);
			tip = defaultText;
			logger.info("Failed to find tooltip for Western score in the language's media.ares file.  Using default text instead.");
		}
		return tip;
	}

	/**
	 * Get the user set tooltip
	 * @return the user's tip if found, otherwise a default text
	 */
	public String getMediaToolTipAudio() {
		logger.entry();
		String tip = "";
		String defaultText = "Click to hear an audio recording.";
		try {
			tip = map.get(KEY_HTML_MEDIA_TOOLTIP_AUDIO);
			if (tip == null) {
				logger.info("Failed to find tooltip for audio in the language's media.ares file.  Using default text instead.");
				tip = defaultText;
			}
		} catch (Exception e) {
			logger.catching(e);
			tip = defaultText;
			logger.info("Failed to find tooltip for audio in the language's media.ares file.  Using default text instead.");
		}
		return tip;
	}
	
	
	/**
	 * Get the Byzantine HTML Icon as specified in the media.ares file
	 * @return the icon HTML if found, otherwise, the letter 'B'
	 */
	public String getHtmlIconByzantine() {
		logger.entry();
		String i = "";
		try {
			i = map.get(KEY_HTML_ICON_BYZANTINE);
			if (i == null) {
				i = "B";
			}
		} catch (Exception e) {
			logger.catching(e);
			i = "B";
		}
		return i;
	}
	
	/**
	 * Get the Western HTML Icon as specified in the media.ares file
	 * @return the icon HTML if found, otherwise, the letter 'W'
	 */
	public String getHtmlIconWestern() {
		logger.entry();
		String i = "";
		try {
			i = map.get(KEY_HTML_ICON_WESTERN);
			if (i == null) {
				i = "W";
			}
		} catch (Exception e) {
			logger.catching(e);
			i = "W";
		}
		return i;
	}

	/**
	 * Get the Audio HTML Icon as specified in the media.ares file
	 * @return the icon HTML if found, otherwise, the letter 'A'
	 */
	public String getHtmlIconAudio() {
		logger.entry();
		String i = "";
		try {
			i = map.get(KEY_HTML_ICON_AUDIO);
			if (i == null) {
				i = "A";
			}
		} catch (Exception e) {
			logger.catching(e);
			i = "A";
		}
		return i;
	}

	public String getHtmlIconDocument() {
		logger.entry();
		String i = "";
		try {
			i = map.get(KEY_HTML_ICON_DOCUMENT);
			if (i == null) {
				i = "A";
			}
		} catch (Exception e) {
			logger.catching(e);
			i = "A";
		}
		return i;
	}

	/**
	 * Takes the hymn key and composition number and forms a key to get the composer.
	 * @param hymnkey, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr, e.g. 2.
	 * @return the composer
	 */
	public String getComposer(String hymnkey, String compositionNbr) {
		logger.entry(hymnkey);
		String value = "";
		try {
			value = map.get(hymnkey + KEY_COMPOSITION + compositionNbr + KEY_COMPOSER);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}
	
	/**
	 * Gets the Singer for the requested audio recording of a given composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @param audioNbr - e.g. 2, meaning the second audio recording for the composition
	 * @return
	 */
	public String getAudioSinger(String hymnkey, String compositionNbr, String audioNbr) {
		logger.entry(hymnkey, compositionNbr, audioNbr);
		String value = "";
		try {
			value = map.get(hymnkey + KEY_COMPOSITION + compositionNbr + KEY_AUDIO + audioNbr + KEY_SINGER);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}
	
	/**
	 * Gets the Year for the requested audio recording of a given composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @param audioNbr - e.g. 2, meaning the second audio recording for the composition
	 * @return the year the recording was made
	 */
	public String getAudioYear(String hymnkey, String compositionNbr, String audioNbr) {
		logger.entry(hymnkey, compositionNbr, audioNbr);
		String value = "";
		try {
			value = map.get(hymnkey + KEY_COMPOSITION + compositionNbr + KEY_AUDIO + audioNbr + KEY_YEAR);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}

	/**
	 * Gets the URL base for the requested audio recording of a given composition for a given hymn
	 * <p>The base is something like "http://ematins.org/"
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @param audioNbr - e.g. 2, meaning the second audio recording for the composition
	 * @return the URL base for the recording
	 */
	private String getAudioUrlBase(String hymnkey, String compositionNbr, String audioNbr) {
		logger.entry(hymnkey, compositionNbr, audioNbr);
		String value = "";
		try {
			value = map.get(hymnkey + KEY_COMPOSITION + compositionNbr + KEY_AUDIO + audioNbr + KEY_URL_BASE);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}
	
	/**
	 * Gets the URL path for the requested audio recording of a given composition for a given hymn
	 * <p>The base is something like "mp3s/xyz.mp3"
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @param audioNbr - e.g. 2, meaning the second audio recording for the composition
	 * @return the URL path for the recording
	 */
	private String getAudioUrlPath(String hymnkey, String compositionNbr, String audioNbr) {
		logger.entry(hymnkey, compositionNbr, audioNbr);
		String value = "";
		try {
			value = map.get(hymnkey + KEY_COMPOSITION + compositionNbr + KEY_AUDIO + audioNbr + KEY_URL_PATH);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}

	/**
	 * Gets the combination of the URL base and URL path for the requested audio recording of a given composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @param audioNbr - e.g. 2, meaning the second audio recording for the composition
	 * @return the combination of the URL base and path, e.g. "http://www.ematins.org/DCS/mp3s/xyz.mp3"
	 **/
	public String getAudioUrl(String hymnkey, String compositionNbr, String audioNbr) {
		logger.entry(hymnkey, compositionNbr, audioNbr);
		String value = "";
		try {
			String path = getAudioUrlPath(hymnkey,compositionNbr,audioNbr);
			if (path == null || path.length() == 0) {
				value = "";
			} else {
				String base = getAudioUrlBase(hymnkey,compositionNbr,audioNbr);
				if (base == null) {
					value = path;
				} else {
					value = base + path;
				}
			}
		} catch (Exception e) {
			logger.catching(e);
			value = "";
		}
		logger.exit();
		return value;
	}
	

	/**
	 * Gets the HREF for the requested audio recording of a given composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @param audioNbr - e.g. 2, meaning the second audio recording for the composition
	 * @return the HREF with the appropriate icon as the text if only one recording was found,
	 * or else a menu with each recording as a menu item.
	 **/
	public String getAudioHref(String hymnkey, String compositionNbr, String audioNbr) {
		logger.entry(hymnkey, compositionNbr, audioNbr);
		String value = "";
		try {
			value = getAudioUrl(hymnkey,compositionNbr,audioNbr);
			if (value.length() > 0) {
				
				value = getHrefAnchorMediaClassAudio()
						+ HREF_OPEN 
						+ value 
						+ "'" 
						+ hrefOpenAudioTarget 
						+  HREF_ANCHOR_CLOSE 
						+ getHtmlIconAudio() 
						+ HREF_SUFFIX;
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}
	
	/**
	 * Gets the HREF for the audio recordings of a given composition for a given hymn.
	 * If there is one score, clicking the icon will open score.
	 * If there is more than one score, clicking the icon will open a dropdown list.
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @return the HREF with the appropriate icon as the text
	 **/
	public String getAudioHref(String hymnkey) {
		logger.entry(hymnkey);
		StringBuffer result = new StringBuffer();
		if (hymns.containsKey(hymnkey)) {
			Set<Entry<String,AudioRecording>> recordingSet = hymns.get(hymnkey).getRecordings().entrySet();
			Iterator<Entry<String,AudioRecording>> it = recordingSet.iterator();

			try {

				if (recordingSet.size() > 0) {
					
					if (recordingSet.size() == 1 
								&& (!preferences.putSingleMediaOccurrenceInDropdown)) {

						Entry<String,AudioRecording> entry = it.next();

						// create an icon that when clicked opens score
						result.append(getHrefAnchorMediaClassAudio() 
								+ HREF_OPEN 
								+ entry.getValue().getBasePath() 
								+ "'" 
								+ hrefOpenAudioTarget 
								+ HREF_ANCHOR_CLOSE 
								+ getHtmlIconAudio() 
								+ HREF_SUFFIX);
					} else {
						Entry<String,AudioRecording> entry;

						// create an icon that when clicked results in a dropdown menu
						result.append(getDropdownMenuOpeningHtml(getMediaToolTipAudio(),getHtmlIconAudio()));

						while (it.hasNext()) {
							entry = it.next();
							result.append(
								getDropdownMenuItem(
									entry.getValue().getBasePath(),
									hrefOpenAudioTarget,
									entry.getValue().getMenuDisplayText()
								)
							);
						}
						result.append(getDropDownMenuClosingHtml());
					}
				}
			} catch (Exception e) {
				logger.catching(e);
			}
		}
		logger.exit();
		return result.toString();
	}

	
	public String getDocumentHref(String hymnkey) {
		logger.entry(hymnkey);
		String value = "";
		try {
			value = getDocumentUrl(hymnkey);
			if (value.length() > 0) {
				
				value = getHrefAnchorMediaClassDocument()
						+ HREF_OPEN 
						+ value 
						+ "'" 
						+ hrefOpenDocumentTarget 
						+  HREF_ANCHOR_CLOSE 
						+ getHtmlIconDocument() 
						+ HREF_SUFFIX;
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}

	private String getHrefAnchorMediaClassAudio() {
		String result = "";
		switch (languageColumn) {
		case 1:
			result = HREF_ANCHOR_MEDIA_CLASS_AUDIO_COL1;
			break;
		case 2:
			result = HREF_ANCHOR_MEDIA_CLASS_AUDIO_COL2;
			break;
		}
		return result;
	}

	
	private String getHrefAnchorMediaClassDocument() {
		String result = "";
		switch (languageColumn) {
		case 1:
			result = HREF_ANCHOR_MEDIA_CLASS_DOCUMENT_COL1;
			break;
		case 2:
			result = HREF_ANCHOR_MEDIA_CLASS_DOCUMENT_COL2;
			break;
		}
		return result;
	}
	
	/*
	public String getAudioHref(String hymnkey, String compositionNbr, String audioNbr) {
		logger.entry(hymnkey, compositionNbr, audioNbr);
		List<AudioRecording> values = new ArrayList<AudioRecording>();
		AudioRecording recording;
		StringBuffer result = new StringBuffer();
		String url = "";
		String singer = "";
		String year = "";
		int nbr = 0;
		String theNumber = "";
		try {
			do {
				nbr++;
				theNumber = String.valueOf(nbr);
				url = getAudioUrl(hymnkey,compositionNbr,theNumber);
				if (url.length() > 0) {
					singer = getAudioSinger(hymnkey, compositionNbr, theNumber);
					year = getAudioYear(hymnkey, compositionNbr, theNumber);
					recording = new AudioRecording();
					recording.setUrl(
							HREF_OPEN 
							+ url + "'"  
							+ hrefOpenAudioTarget 
							+ HREF_ANCHOR_CLOSE 
							);
					recording.setSinger(singer);
					recording.setYear(year);
					values.add(recording);
				}
			} while (url.length() > 0);
		} catch (Exception e) {
			logger.catching(e);
		}
		if (values.size() > 1) {
			java.util.Iterator <AudioRecording> it = values.iterator();
			result.append(getButton(TIP_AUDIO, getHtmlIconAudio()));
			result.append(HTML_MEDIA_MENU_OPEN);
			while (it.hasNext()) {
				recording = it.next();
				result.append(
						HTML_MEDIA_MENU_LINE_ITEM_OPEN 
						+ HREF_ANCHOR_MEDIA_CLASS_AUDIO_MENU_ITEM 
						+ recording.getUrl()
						+ "Composition "
						+ compositionNbr
						+ " "
						+ recording.getSinger()
						+ " ("
						+ recording.getYear()
						+ ")"
						+ HREF_SUFFIX
						+ HTML_MEDIA_MENU_LINE_ITEM_CLOSE
						);
			}
			result.append(HTML_MEDIA_MENU_CLOSE);
		} else {
			if (values.size() == 1) {
				result.append(
						HREF_ANCHOR_MEDIA_CLASS_AUDIO 
						+ values.get(0).getUrl()
						+ getHtmlIconAudio() 
						+ HREF_SUFFIX
						);
			} else {
				return "";
			}
		}
		logger.exit();
		return wrapButtonGroupDiv(result.toString());
	}
*/
	public String getButton(String tipClass, String icon) {
		return 
		"<button type='button' class='btn dropdown-toggle "
		 + tipClass
		 + "' data-toggle='dropdown'>" 
		 + icon 
		 + "<span class='caret'></span></button>";
	}
	
	
	/**
	 * 
	 * @return the anchor media class appropriate to the language for which this Media was instantiated
	 */
	private String getHrefAnchorMediaClassByzantine() {
		String result = "";
		switch (languageColumn) {
		case 1:
			result = HREF_ANCHOR_MEDIA_CLASS_BYZANTINE_COL1;
			break;
		case 2:
			result = HREF_ANCHOR_MEDIA_CLASS_BYZANTINE_COL2;
			break;
		}
		return result;
	}
	
	public String wrapButtonGroupDiv(String text) {
		return "<" + HREF_BLOCK + MEDIA_CLASS + text + "</" + HREF_BLOCK + ">";
	}
	
	public String wrapMediaMenuList(String text) {
		return "<ul class='dropdown-menu' role='menu'>" + text + "</ul>";
	}

	public String getEmptyMediaDiv() {
		return "<" + HREF_BLOCK + MEDIA_CLASS_EMPTY + "</" + HREF_BLOCK + ">";
	}
	
	public String getMediaSpan(String hymnkey, String compositionNbr, String audioNbr) {
		logger.entry(hymnkey, compositionNbr, audioNbr);
		String value = null;
		String hrefs = "";
		try {
			hrefs = getHrefs(hymnkey,compositionNbr,audioNbr);
			if (hrefs.length() > 0) {
				value = hrefs;
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}
	
	public String createHrefKey(String hymnkey, String compositionNbr, String audioNbr) {
		return hymnkey + ".c" + compositionNbr; 
	}
	
	
	/**
	 * Get the URLs (hrefs) for the given hymn, composition, and audio.
	 * This method (shame!) has a side-effect.  If it finds the hrefs and
	 * they do not yet exist in the map, it adds them to the map.
	 * @param hymnkey
	 * @param compositionNbr
	 * @param audioNbr
	 * @return the Hrefs for audio and the two scores (byzantine and western)
	 */
	public String getHrefs(String hymnkey, String compositionNbr, String audioNbr) {

		logger.entry(hymnkey,compositionNbr);

		// see if we have already loaded the Href. 
		String hrefKey = createHrefKey(hymnkey,compositionNbr,audioNbr);
		String hrefs = map.get(hrefKey);
	
		try {
			if (hrefs == null) { // we haven't loaded it yet, so do it now.
				String audio = "";
				String byzantine = "";
				String western = "";
				String document = "";
				document = includeDocument() ? getDocumentHref(hymnkey) : "";
				audio = includeAudio() ? getAudioHref(hymnkey) : "";
				byzantine = includeByzantine() ? getByzantineScoreHref(hymnkey) : "";
				western = includeWestern() ? getWesternScoreHref(hymnkey) : "";
				if (audio.length() > 0 || byzantine.length() > 0 || western.length() > 0 || document.length() > 0) {
					hrefs = byzantine+western+audio+document;
				} else {
					hrefs = "";
				}
			}
		} catch (Exception e) {
			logger.catching(e);
			hrefs = "";
		}
		logger.exit();
		if (hrefs.length() > 0) {
			return wrapButtonGroupDiv(hrefs);
		} else {
			return "";
		}
	}

	/**
	 * Gets the HREF for the Western Score of a given composition for a given hymn.
	 * If there is a single score, clicking the icon open the score.
	 * If there are multiple scores, clicking the icon will display a dropdown menu.
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @return the HREF with the appropriate icon as the text
	 **/
	public String getWesternScoreHref(String hymnkey) {
		logger.entry(hymnkey);
		StringBuffer result = new StringBuffer();
		WesternScore score;
		Composition comp;
		try {
			if (hymns.containsKey(hymnkey)) {
				Set<Entry<String,WesternScore>> set = hymns.get(hymnkey).getWesternScores().entrySet();
				Iterator<Entry<String,WesternScore>> it = set.iterator();
				
				if (set.size() > 0) {
					if (set.size() == 1
							&& (!preferences.putSingleMediaOccurrenceInDropdown)) {
						score = it.next().getValue();
							// create an icon that when clicked opens score
							result.append(getHrefAnchorMediaClassWestern() 
									+ HREF_OPEN 
									+ score.getBasePath() + "'" 
									+ hrefOpenWesternTarget 
									+ HREF_ANCHOR_CLOSE 
									+ getHtmlIconWestern() 
									+ HREF_SUFFIX);
					} else {

						// create an icon that when clicked results in a dropdown menu

						result.append(getDropdownMenuOpeningHtml(getMediaToolTipScoreWestern(),getHtmlIconWestern()));

						while (it.hasNext()) {
							score = it.next().getValue();
							if (score != null) {
								result.append(
										getDropdownMenuItem(
												score.getBasePath(),
												hrefOpenWesternTarget,
												score.getMenuDisplayText()
												)
										);
							}
						}
						result.append(getDropDownMenuClosingHtml());
					}
				}
			}	
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return result.toString();
	}
	
	/**
	 * 
	 * @return the anchor media class appropriate to the language for which this Media was instantiated
	 */
	private String getHrefAnchorMediaClassWestern() {
		String result = "";
		switch (languageColumn) {
		case 1:
			result = HREF_ANCHOR_MEDIA_CLASS_WESTERN_COL1;
			break;
		case 2:
			result = HREF_ANCHOR_MEDIA_CLASS_WESTERN_COL2;
			break;
		}
		return result;
	}


	/**
	 * Gets the Arranger for the requested composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @param scoreModel - either KEY_SCORE_BYZANTINE or KEY_SCORE_WESTERN
	 * @return the name of the arranger
	 */
	private String getScoreArranger(String hymnkey, String compositionNbr, String scoreModel) {
		logger.entry(hymnkey, compositionNbr, scoreModel);
		String value = "";
		try {
			value = map.get(hymnkey + KEY_COMPOSITION + compositionNbr + scoreModel + KEY_ARRANGER);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}

	/**
	 * Gets the Arranger for the Western score for the requested composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @return the name of the arranger
	 */
	public String getWesternScoreArranger(String hymnkey, String compositionNbr) {
		return getScoreArranger(hymnkey,compositionNbr,this.KEY_SCORE_WESTERN);
	}
	
	/**
	 * Gets the Arranger for the Byzantine score for the requested composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @return the name of the arranger
	 */
	public String getByzantineScoreArranger(String hymnkey, String compositionNbr) {
		return getScoreArranger(hymnkey,compositionNbr,this.KEY_SCORE_BYZANTINE);
	}

	/**
	 * Gets the Year for the requested score for a given composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @param scoreModel - either KEY_SCORE_BYZANTINE or KEY_SCORE_WESTERN
	 * @return the year the score was arranged
	 */
	private String getScoreYear(String hymnkey, String compositionNbr, String scoreModel) {
		logger.entry(hymnkey, compositionNbr, scoreModel);
		String value = "";
		try {
			value = map.get(hymnkey + KEY_COMPOSITION + compositionNbr + scoreModel + KEY_YEAR);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}

	/**
	 * Gets the Year for the Western score for a given composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @return the year the score was arranged
	 */
	public String getWesternScoreYear(String hymnkey, String compositionNbr) {
		return getScoreYear(hymnkey,compositionNbr,this.KEY_SCORE_WESTERN);
	}
	
	/**
	 * Gets the Year for the Byzantine score for a given composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @return the year the score was arranged
	 */
	public String getByzantineScoreYear(String hymnkey, String compositionNbr) {
		return getScoreYear(hymnkey,compositionNbr,this.KEY_SCORE_BYZANTINE);
	}

	
	/**
	 * Gets the Base URL for the requested score for a given composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @param scoreModel - either KEY_SCORE_BYZANTINE or KEY_SCORE_WESTERN
	 * @return the Base URL, e.g. "http://www.ematins.org/DCS/"
	 */
	private String getScoreUrlBase(String hymnkey, String compositionNbr, String scoreModel) {
		logger.entry(hymnkey, compositionNbr, scoreModel);
		String value = "";
		try {
			value = map.get(hymnkey + KEY_COMPOSITION + compositionNbr + scoreModel + KEY_URL_BASE);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}

	private String getDocumentUrlBase(String hymnkey) {
		logger.entry(hymnkey);
		String value = "";
		try {
			value = map.get(hymnkey  + KEY_DOCUMENT + KEY_URL_BASE);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}

	private String getDocumentUrlPath(String hymnkey) {
		logger.entry(hymnkey);

		String value = "";
		try {
			String key = hymnkey + KEY_DOCUMENT + KEY_URL_PATH;
			value = map.get(key);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}

	private String getDocumentUrl(String hymnkey) {
		logger.entry(hymnkey);
		String value = "";
		try {
			String path = getDocumentUrlPath(hymnkey);
			if (path == null || path.length() == 0) {
				value = "";
			} else {
				String base = getDocumentUrlBase(hymnkey);
				if (base == null) {
					value = path;
				} else {
					value = base + path;
				}
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}

	/**
	 * Gets the URL Path for the requested score for a given composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @param scoreModel - either KEY_SCORE_BYZANTINE or KEY_SCORE_WESTERN
	 * @return the URL Path, e.g. "mp3s/xyz.mp3"
	 */
	private String getScoreUrlPath(String hymnkey, String compositionNbr, String scoreModel) {
		logger.entry(hymnkey, compositionNbr, scoreModel);
		String value = "";
		try {
			value = map.get(hymnkey + KEY_COMPOSITION + compositionNbr + scoreModel + KEY_URL_PATH);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}
	
	/**
	 * Gets the URL for the requested score for a given composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @param scoreModel - either KEY_SCORE_BYZANTINE or KEY_SCORE_WESTERN
	 * @return the URL, e.g. "http://www.ematins.org/DCS/mp3s/xyz.mp3"
	 */
	private String getScoreUrl(String hymnkey, String compositionNbr, String scoreModel) {
		logger.entry(hymnkey, compositionNbr, scoreModel);
		String value = "";
		try {
			String path = getScoreUrlPath(hymnkey,compositionNbr,scoreModel);
			if (path == null || path.length() == 0) {
				value = "";
			} else {
				String base = getScoreUrlBase(hymnkey,compositionNbr,scoreModel);
				if (base == null) {
					value = path;
				} else {
					value = base + path;
				}
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return value;
	}

	/**
	 * Gets the URL for the Western score for a given composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @return the URL, e.g. "http://www.ematins.org/DCS/mp3s/xyz.mp3".  If not found, returns empty string
	 */
	public String getWesternScoreUrl(String hymnkey, String compositionNbr) {
		logger.entry();
		String result = "";
		try {
			result = getScoreUrl(hymnkey,compositionNbr,this.KEY_SCORE_WESTERN);
			if (result == null) {
				result = "";
			}
		} catch (Exception e) {
			logger.catching(e);
			result = "";
		}
		
		return result;
	}
	
	/**
	 * Gets the URL for the Byzantine score for a given composition for a given hymn
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compositionNbr - e.g. 1, meaning composition number 1
	 * @return the URL, e.g. "http://www.ematins.org/DCS/mp3s/xyz.mp3" or, if not found, returns an empty string
	 */
	public String getByzantineScoreUrl(String hymnkey, String compositionNbr) {
		logger.entry();
		String result = "";
		try {
			result = getScoreUrl(hymnkey,compositionNbr,this.KEY_SCORE_BYZANTINE);
			if (result == null) {
				result = "";
			}
		} catch (Exception e) {
			logger.catching(e);
			result = "";
		}
		
		return result;
	}
	
	/** 
	 * Get the number of occurrences of Byzantine scores for this hymn
	 * @param hymnkey
	 * @return number of occurrences
	 */
	public int getCountByzantineScore(String hymnkey) {
		int compNbr = 1;
		int count = 0;
		boolean hasMore = true;
		String value = "";
		do {
			value = getByzantineScoreUrl(hymnkey,String.valueOf(compNbr));
			if (value.length() > 0) {
				count++;
			} else {
				hasMore = false;
			}
			compNbr++;
		} while (hasMore);
		return count;
	}
	
	/** 
	 * Get the number of occurrences of Western scores for this hymn
	 * @param hymnkey
	 * @return number of occurrences
	 */
	public int getCountWesternScore(String hymnkey) {
		int compNbr = 1;
		int count = 0;
		boolean hasMore = true;
		String value = "";
		do {
			value = getWesternScoreUrl(hymnkey,String.valueOf(compNbr));
			if (value.length() > 0) {
				count++;
			} else {
				hasMore = false;
			}
			compNbr++;
		} while (hasMore);
		return count;
	}

	/** 
	 * Get the number of occurrences of Audio recordings for this hymn
	 * @param hymnkey
	 * @return number of occurrences
	 */
	public int getCountAudioRecordings(String hymnkey) {
		int compNbr = 1;
		int count = 0;
		boolean hasMore = true;
		String value = "";
		do {
			int temp =  getCountAudioRecordings(hymnkey,String.valueOf(compNbr));
			if (temp > 0) {
				count += temp;
			} else {
				hasMore = false;
			}
			compNbr++;
		} while (hasMore);
		return count;
	}
	
	/** 
	 * Get the number of occurrences of Audio recordings for this composition of this hymn
	 * @param hymnkey
	 * @param composition number
	 * @return number of occurrences
	 */
	public int getCountAudioRecordings(String hymnkey, String composition) {
		int compNbr = 1;
		int count = 0;
		boolean hasMore = true;
		String value = "";
		do {
			value = getAudioUrl(hymnkey,composition,String.valueOf(compNbr));
			if (value.length() > 0) {
				count++;
			} else {
				hasMore = false;
			}
			compNbr++;
		} while (hasMore);
		return count;
	}
	

	
	public Map<String,String> getAudioRecordingHrefs(String hymnkey) {
		Map<String,String> hrefs = new TreeMap<String,String>();
		String compNbr = "1";
		String audioNbr = "1";
		int intCompNbr = 1;
		int intAudioNbr = 1;
		boolean hasMoreComps = true;
		boolean hasMoreAudio = true;
		String key = "";
		String value = "";
		try {
			do {
				value = getAudioUrl(hymnkey,compNbr,audioNbr);
				if (value.length() > 0) {
					do {
						value = getAudioUrl(hymnkey,compNbr,audioNbr);
						if (value.length() > 0) {
							key = 
								  "c" + compNbr
								+ "a" + audioNbr
								+ " - "
								+ getComposer(hymnkey,compNbr)
								+ " / "
								+ getAudioSinger(hymnkey,compNbr,audioNbr)
								;
							hrefs.put(key, value);
							intAudioNbr++;
							audioNbr = Integer.toString(intAudioNbr);
						} else {
							hasMoreAudio = false;
						}
					} while (hasMoreAudio);
					audioNbr = "1";
					intAudioNbr = 1;
					intCompNbr++;
					compNbr = Integer.toString(intCompNbr);
				} else {
					hasMoreComps = false;
				}
			} while (hasMoreComps);
		} catch (Exception e) {
			logger.catching(e);
		}
		return hrefs;
	}
	
	/*
	 * Maintains a unique ID for each dropdown menu.
	 * This is needed in order to have the dropdown display
	 * in alignment with its icon.
	 */
	public String getUniqueId() {
		dropDownMenuId = dropDownMenuId + 1;
		return "jqm-dropdown-" + String.valueOf(dropDownMenuId);
	}
	
	/**
	 * Get the HTML to open a Dropdown Menu
	 * @return the tags, with a unique ID
	 */
	public String getDropdownMenuOpeningHtml(String title, String icon) {
		StringBuffer result = new StringBuffer();
		String id = getUniqueId();
		result.append("<a href='#' data-jqm-dropdown='#" + id + "' title='" + title + "'>" + icon + "</a>");
		result.append("<div id='" + id + "' class='jqm-dropdown jqm-dropdown-tip alwb-media-dropdown-div'>");
		result.append("<ul class='jqm-dropdown-menu jqm-dropdown-relative alwb-media-dropdown-menu'>");
		return result.toString();
	}
	
	public String getDropdownMenuItem(String href, String target, String description) {
		return 	"\n\t\t\t<li>\n\t\t\t\t<a " + HREF_OPEN 
				+ href + "'" 
				+ target 
				+ HREF_ANCHOR_CLOSE 
				+ description
				+ HREF_SUFFIX
				+ "\n\t\t\t</li>";
	}

	/**
	 * Get the HTML to close a Dropdown Menu
	 * @return the tags
	 */
	public String getDropDownMenuClosingHtml() {
		return 	"\n\t\t</ul>\n\t</div>";
	}
	
	/**
	 * Gets the HREF for the Byzantine Score of a given composition for a given hymn.
	 * If there is one score, clicking the icon will open score.
	 * If there is more than one score, clicking the icon will open a dropdown list.
	 * @param hymnkey - key for the hymn or verse, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @return the HREF with the appropriate icon as the text
	 **/
	public String getByzantineScoreHref(String hymnkey) {
		logger.entry(hymnkey);
		StringBuffer result = new StringBuffer();
		ByzantineScore score;
		Composition comp;
		try {
			if (hymns.containsKey(hymnkey)) {
				Set<Entry<String,ByzantineScore>> set = hymns.get(hymnkey).getByzantineScores().entrySet();
				Iterator<Entry<String,ByzantineScore>> it = set.iterator();
				
				if (set.size() > 0) {
					if (set.size() == 1
							&& (!preferences.putSingleMediaOccurrenceInDropdown)) {
						score = it.next().getValue();
							// create an icon that when clicked opens score
							result.append(getHrefAnchorMediaClassByzantine() 
									+ HREF_OPEN 
									+ score.getBasePath() + "'" 
									+ hrefOpenByzantineTarget 
									+ HREF_ANCHOR_CLOSE 
									+ getHtmlIconByzantine() 
									+ HREF_SUFFIX);
					} else {

						// create an icon that when clicked results in a dropdown menu

						result.append(getDropdownMenuOpeningHtml(getMediaToolTipScoreByzantine(),getHtmlIconByzantine()));

						while (it.hasNext()) {
							score = it.next().getValue();
							if (score != null) {
								result.append(
										getDropdownMenuItem(
												score.getBasePath(),
												hrefOpenByzantineTarget,
												score.getMenuDisplayText()
												)
										);
							}
						}
						result.append(getDropDownMenuClosingHtml());
					}
				}
			}	
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return result.toString();
	}
	
	public static String getHrefOpenByzantineTarget() {
		return hrefOpenByzantineTarget;
	}

	public static String getHrefOpenAudioTarget() {
		return hrefOpenAudioTarget;
	}

	public static String getHrefOpenDocumentTarget() {
		return hrefOpenDocumentTarget;
	}

	public static void setHrefOpenByzantineTarget(String hrefOpenByzantineTarget) {
		Media.hrefOpenByzantineTarget = hrefOpenByzantineTarget;
	}

	public static void setHrefOpenAudioTarget(String hrefOpenAudioTarget) {
		Media.hrefOpenAudioTarget = hrefOpenAudioTarget;
	}

	public static void setHrefOpenDocumentTarget(String hrefOpenDocumentTarget) {
		Media.hrefOpenDocumentTarget = hrefOpenDocumentTarget;
	}

	/**
	 * For test purposes, returns all available information about the requested audio recording
	 * @param hymnkey, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compNbr, e.g. 1 for the 1st composition
	 * @param audioNbr, e.g. 1 for the first audio recording
	 * @param showKey, true - show the hymnkey, compNbr, and audioNbr.  
	 * @return information about the audio recording of the composition
	 */
	public String audioToString(String hymnkey, String compNbr, String audioNbr, boolean showKey) {
		StringBuffer sb = new StringBuffer();
		if (showKey) {
			sb.append("Hymn Key=" + hymnkey + ", Composition Nbr=" + compNbr + ", Audio Nbr=" + audioNbr + "\n");
		}
		sb.append("\tSinger=" + getAudioSinger(hymnkey, compNbr, audioNbr) + "\n");
		sb.append("\tYear=" + getAudioYear(hymnkey, compNbr, audioNbr) + "\n");
		sb.append("\tUrl=" + getAudioUrl(hymnkey, compNbr, audioNbr) + "\n");
		return sb.toString();
	}
	
	/**
	 * For test purposes, displays the full information about the requested Byzantine score
	 * @param hymnkey, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compNbr, e.g. 1 for the 1st composition
	 * @param showKey - true: show hymnkey and composition number
	 * @return information about the Byzantine score of the composition
	 */
	public String byzantineScoreToString(String hymnkey, String compositionNbr, boolean showKey) {
		StringBuffer sb = new StringBuffer();
		if (showKey) {
			sb.append("Hymn Key=" + hymnkey + ", Composition Nbr=" + compositionNbr + "\n");
		}
		sb.append("\tArranger=" + getByzantineScoreArranger(hymnkey, compositionNbr) + "\n");
		sb.append("\tYear=" + getByzantineScoreYear(hymnkey, compositionNbr) + "\n");
		sb.append("\tUrl=" + getByzantineScoreUrl(hymnkey, compositionNbr) + "\n");
		return sb.toString();
	}

	/**
	 * For test purposes, displays the full information about the requested Western score
	 * @param hymnkey, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compNbr, e.g. 1 for the 1st composition
	 * @param showKey - true: show hymnkey and composition number
	 * @return information about the Western Score of the composition
	 */
	public String westernScoreToString(String hymnkey, String compositionNbr, boolean showKey) {
		StringBuffer sb = new StringBuffer();
		if (showKey) {
			sb.append("Hymn Key=" + hymnkey + ", Composition Nbr=" + compositionNbr + "\n");
		}
		sb.append("\tArranger=" + getWesternScoreArranger(hymnkey, compositionNbr) + "\n");
		sb.append("\tYear=" + getWesternScoreYear(hymnkey, compositionNbr) + "\n");
		sb.append("\tUrl=" + getWesternScoreUrl(hymnkey, compositionNbr) + "\n");
		return sb.toString();
	}
	
	/**
	 * For test purposes, displays the full information about the requested Composition
	 * @param hymnkey, e.g. oc.m4.d1.ocMA.GodIsTheLord
	 * @param compNbr, e.g. 1 for the 1st composition
	 * @param showKey - true: show hymnkey and composition number
	 * @return information about the composition, i.e. its composer, scores, and audio recordings
	 */
	public String compositionToString(String hymnkey, String compositionNbr, boolean showKey) {
		StringBuffer sb = new StringBuffer();
		if (showKey) {
			sb.append("Hymn Key=" + hymnkey + ", Composition Nbr=" + compositionNbr + "\n");
		}
		sb.append("\tComposer=" + getComposer(hymnkey, compositionNbr) + "\n");
		sb.append(westernScoreToString(hymnkey,compositionNbr,false));
		sb.append(byzantineScoreToString(hymnkey,compositionNbr,false));
		sb.append(audioToString(hymnkey,compositionNbr, "1", false));
		return sb.toString();
	}
	

}
