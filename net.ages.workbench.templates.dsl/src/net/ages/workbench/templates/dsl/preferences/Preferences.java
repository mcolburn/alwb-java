package net.ages.workbench.templates.dsl.preferences;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.ages.workbench.resources.dsl.ares.Definition;
import net.ages.workbench.utils.AlwbConstants;
import net.ages.workbench.utils.AlwbLogger;

import org.apache.logging.log4j.Logger;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

import com.google.common.collect.Iterables;

public class Preferences {

	private Map<String,String> map = new HashMap<String,String>();
	private Resource prefMain;
	private Resource prefGeneration;
	private Resource prefHtml;
	private Resource prefPdf;
	private Resource prefVersion;
	private Resource prefWebsite;
	private Logger logger = AlwbLogger.getLogger("Preferences");
	private Map<String,String> loadOptions;
	
	public String preferencesHtml = "uninitialized";
	public String preferencesPdf = "uninitialized";
	public String preferencesVersion = "uninitialized";
	public String preferencesWebsite = "uninitialized";
	public String preferencesGeneration = "uninitialized";
	public boolean genHtmlFile = false;
	public boolean genHtmlLanguage1 = false;
	public boolean genHtmlLanguage2 = false;
	public boolean genHtmlLanguage12 = false;
	public boolean genHtmlFileIncludeKeyOriginal = false;
	public boolean genHtmlFileIncludeKeyDerived = false;
	public boolean genPdfFile = false;
	public boolean genPdfLanguage1 = false;
	public boolean genPdfLanguage2 = false;
	public boolean genPdfLanguage12 = false;
	public boolean genEpubFile = false;
	public boolean genEpubLanguage1 = false;
	public boolean genEpubLanguage2 = false;
	public boolean genEpubLanguage12 = false;
	public boolean genResources = false;
	public boolean genTmsJsonFile = false;
	public boolean displayVersionOfHymn = false;
	public boolean displayVersionOfVerse = false;
	public boolean displayVersionOfReading = false;
	public boolean displayVersionOfParaPrayer = false;
	public boolean displayVersionOfParaChant = false;
	public boolean displayVersionOfParaHeirmos = false;
	public boolean displayVersionOfParaHymnLastLine = false;

	public static boolean tmsJsonFileFormatSetIncludeKey = false;
	public static boolean tmsJsonFileFormatSetIncludeTag = false;
	public static boolean tmsJsonFileFormatSetIncludeClass = false;
	public static boolean tmsJsonFileFormatSetIncludeText = false;
	public static boolean tmsJsonFileKeySetIncludeText = false;
	public static boolean tmsJsonFileKeySetIncludeFrequencies = false;
	public boolean makeL1Editable = false;
	public boolean makeL2Editable = false;
	public boolean includeMediaDocumentLinks = false;
	public boolean includeMediaAudioLinks = false;
	public boolean includeMediaScoreByzantineLinks = false;
	public boolean includeMediaScoreWesternLinks = false;
	public boolean putSingleMediaOccurrenceInDropdown = false;
	public String language1MediaPreferred = "uninitialized";
	public String language1MediaDefault = "uninitialized";
	public String language2MediaPreferred = "uninitialized";
	public String language2MediaDefault = "uninitialized";
	public String dateLocaleLanguageV1 = "uninitialized";
	public String dateLocaleLanguageV2 = "uninitialized";
	public String dateLocaleCountryV1 = "uninitialized";
	public String dateLocaleCountryV2 = "uninitialized";
	public String dateFormatV1 = "uninitialized";
	public String dateFormatV2 = "uninitialized";
	public String dateFormatLdp = "uninitialized";
	public String language1GospelPreferred = "uninitialized";
	public String language1GospelDefault = "uninitialized";
	public String language2GospelPreferred = "uninitialized";
	public String language2GospelDefault = "uninitialized";
	public String language1EpistlePreferred = "uninitialized";
	public String language1EpistleDefault = "uninitialized";
	public String language2EpistlePreferred = "uninitialized";
	public String language2EpistleDefault = "uninitialized";
	public String language1ProphetologionPreferred = "uninitialized";
	public String language1ProphetologionDefault = "uninitialized";
	public String language2ProphetologionPreferred = "uninitialized";
	public String language2ProphetologionDefault = "uninitialized";
	public String language1 = "uninitialized";
	public String language1Default = "uninitialized";
	public String language2 = "uninitialized";
	public String language2Default = "uninitialized";
	public String language1PsalterPreferred = "uninitialized";
	public String language1PsalterDefault = "uninitialized";
	public String language2PsalterPreferred = "uninitialized";
	public String language2PsalterDefault = "uninitialized";
	public String templateLanguage = "uninitialized";
	public boolean genIndexServices = false;
	public boolean genIndexBooks = false;
	public boolean genIndexCustom = false;
	public String htmlIndexLanguagePreferred = "uninitialized";
	public String htmlIndexLanguageDefault = "uninitialized";
	public String indexLinkTargetHtml = "unitialized";
	public String indexLinkTargetPdf	= "unititialized";
	public boolean indexIncludeFileTimestamp = false;	
	public String indexTimestampFormat	= "unititialized";
	public String indexTimestampDescPrefix	= "unititialized";
	public String indexTimestampDescSuffix	= "unititialized";
	public String htmlLinkDelimiter = "uninitialized";
	public String htmlSiteRoot = "uninitialized";
	public String htmlServiceFolderRoot = "uninitialized";
	public String htmlBookFolderRoot = "uninitialized";
	public String htmlCustomFolderRoot = "uninitialized";
	public boolean copyHtmlCssFiles = false;
	public String htmlCssPath = "uninitialized";
	public boolean copyHtmlJsFiles = false;
	public String htmlJsPath = "uninitialized";
	public boolean copyHtmlMediaFiles = false;
	public String htmlMediaPath = "uninitialized";
	public boolean copyHtmlMainFiles = false;
	public String htmlMainPath = "uninitialized";
	public boolean includeMergedPdfHref = false;
	public int nbrSpaces = 0;
	public String pdfStylesheetVersion = "uninitialized";
	public String pdfStylesheetPrefix = "uninitialized";
	public String pdfOutputPath = "uninitialized";
	public int pdfBodyNbrColumns = 0;
	public String pdfBodyColumnGap = "uninitialized";
	public String pdfBodyPageEvenHeight = "uninitialized";
	public String pdfBodyPageEvenWidth = "uninitialized";
	public String pdfBodyPageEvenMarginTop = "uninitialized";
	public String pdfBodyPageEvenMarginBottom = "uninitialized";
	public String pdfBodyPageEvenMarginLeft = "uninitialized";
	public String pdfBodyPageEvenMarginRight = "uninitialized";
	
	public String pdfBodyPageEvenRegionBodyMarginTop = "uninitialized";
	public String pdfBodyPageEvenRegionBodyMarginBottom = "uninitialized";
	public String pdfBodyPageEvenRegionBeforeExtent = "uninitiatized";
	public String pdfBodyPageEvenRegionAfterExtent = "uninitiatilized";
	
	public String pdfBodyPageOddHeight = "uninitialized";
	public String pdfBodyPageOddWidth = "uninitialized";
	public String pdfBodyPageOddMarginTop = "uninitialized";
	public String pdfBodyPageOddMarginBottom = "uninitialized";
	public String pdfBodyPageOddMarginLeft = "uninitialized";
	public String pdfBodyPageOddMarginRight = "uninitialized";

	public String pdfBodyPageOddRegionBodyMarginTop = "uninitialized";
	public String pdfBodyPageOddRegionBodyMarginBottom = "uninitialized";
	public String pdfBodyPageOddRegionBeforeExtent = "uninitiatized";
	public String pdfBodyPageOddRegionAfterExtent = "uninitiatilized";

	public String pdfBodyFooterOddLeftWidth = "uninitialized";
	public String pdfBodyFooterOddLeftAlignment = "uninitialized";
	public String pdfBodyFooterOddCenterWidth = "uninitialized";
	public String pdfBodyFooterOddCenterAlignment = "uninitialized";
	public String pdfBodyFooterOddRightWidth = "uninitialized";
	public String pdfBodyFooterOddRightAlignment = "uninitialized";
	public String pdfBodyFooterEvenLeftWidth = "uninitialized";
	public String pdfBodyFooterEvenLeftAlignment = "uninitialized";
	public String pdfBodyFooterEvenCenterWidth = "uninitialized";
	public String pdfBodyFooterEvenCenterAlignment = "uninitialized";
	public String pdfBodyFooterEvenRightWidth = "uninitialized";
	public String pdfBodyFooterEvenRightAlignment = "uninitialized";
	public String pdfBodyHeaderOddLeftWidth = "uninitialized";
	public String pdfBodyHeaderOddLeftAlignment = "uninitialized";
	public String pdfBodyHeaderOddCenterWidth = "uninitialized";
	public String pdfBodyHeaderOddCenterAlignment = "uninitialized";
	public String pdfBodyHeaderOddRightWidth = "uninitialized";
	public String pdfBodyHeaderOddRightAlignment = "uninitialized";
	public String pdfBodyHeaderEvenLeftWidth = "uninitialized";
	public String pdfBodyHeaderEvenLeftAlignment = "uninitialized";
	public String pdfBodyHeaderEvenCenterWidth = "uninitialized";
	public String pdfBodyHeaderEvenCenterAlignment = "uninitialized";
	public String pdfBodyHeaderEvenRightWidth = "uninitialized";
	public String pdfBodyHeaderEvenRightAlignment = "uninitialized";
	
	/**
	 * Initializes an instance of media for the media key-value pairs for a given domain, e.g. media.en_US_ematins.ares
	 * @param resource - The EMF resource for the given media file
	 * @param loadOptions - see ModelAccessor - used to support UTF-8
	 * @param languageColumn - 1 = 1st column, i.e. L1, 2 = 2nd column, e.g. L2
	 *  - used for processing specific to the left or right columns of bilingual text
	 */
	public Preferences(Resource resourceMain, Map<String,String> loadOptions,
			Resource resourceHtml,
			Resource resourcePdf,
			Resource resourceVersion,
			Resource resourceWebsite,
			Resource resourceGeneration) {
		
		logger.entry(resourceMain.getURI().toString());
		try {

			prefMain = resourceMain;
			this.loadOptions = loadOptions;
			prefGeneration = resourceGeneration;
			prefHtml = resourceHtml;
			prefPdf = resourcePdf;
			prefVersion = resourceVersion;
			prefWebsite = resourceWebsite;

			loadKeys(prefGeneration);
			loadKeys(prefHtml);
			loadKeys(prefPdf);
			loadKeys(prefVersion);
			loadKeys(prefWebsite);
			
			setValues();
			
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
	}
	
	/**
	 * Iterates the resource for which the instance was created, and loads each composition into a composition map.
	 * The map key is the ID of the composition and the value is a Composition instance.
	 */
	private void loadKeys(Resource r) {
		logger.entry();
		try {
			r.load(loadOptions); // in order to ensure loaded as UTF-8
			TreeIterator<EObject> _allContents = r.getAllContents();
			Iterable<EObject> _iterable = IteratorExtensions
					.<EObject> toIterable(_allContents);
			Iterable<Definition> _filter = Iterables.<Definition> filter(_iterable, Definition.class);
			for (final Definition e : _filter) {
				String key = e.getName();
				String value = "uninitialized";
				// Get the text for this key.  If it is null, check to see if instead
				// of a text it was a pointer to another key (aka a ref).
				if (e.getDsl_Definition_Text() != null) {
					value = e.getDsl_Definition_Text();
				} else if (e.getDsl_Definition_Ref() != null) {
					value = e.getDsl_Definition_Ref().getDsl_Definition_Text();
				}
				map.put(key, value);
			}
		} catch (IOException e1) {
			logger.catching(e1);
		}
		logger.exit();
	}
	
	private String getValue(String key) {
		String result = "";
		try {
			result = map.get(key);
		} catch (Exception e) {
			result = "";
		}
		return result;
	}

	
	/**
	 * Gets the boolean value for the specified key stored in the AGES Workbench preference ares files
	 * @see getAgesStringPreference(String key)
	 * @see getAgesIntPreference(String key)
	 * @param key - see net.ages.workbench.templates.dsl.ui.preferences.PreferenceConstants for key values
	 * @return the boolean value associated with the store
	 */
	public boolean getAgesBooleanPreference(String key) {
			boolean result = false;
			try {
				String value = getValue(key).toLowerCase();
				if (value == null) {
					logger.error("Could not find preference for " + key);
				}
				result = (value.contains("yes") || value.contains("true"));
			} catch (Exception e) {
				logger.error("Bad value for " + key);
				logger.catching(e);
				result = false;
			}
			return result;
	}
	/**
	 * Gets the int value for the specified key stored in the AGES Workbench preference ares files
	 * @see getAgesStringPreference(String key)
	 * @see getAgesBooleanPreference(String key)
	 * @param key - see net.ages.workbench.templates.dsl.ui.preferences.PreferenceConstants for key values
	 * @return the boolean value associated with the store
	 */
	public int getAgesIntPreference(String key) {
		int result = 0;
		try {
			String value = getValue(key).toLowerCase();
			if (value == null) {
				logger.error("Could not find preference for " + key);
			}
			result = Integer.parseInt(value);
		} catch (Exception e) {
			logger.error("Bad value for " + key);
			logger.catching(e);
			result = 0;
		}
		return result;
	}
		
	/**
	 * Gets the String value for the specified key stored in the AGES Workbench preference ares files
	 * @see getAgesBooleanPreference(String key)
	 * @param key - see net.ages.workbench.templates.dsl.ui.preferences.PreferenceConstants for key values
	 * @return the String value associated with the store
	 */
	public String getAgesStringPreference(String key) {
		logger.entry();
		String value = getValue(key);
		if (value == null) {
			logger.error("Could not find preference for " + key);
		}
		logger.exit();
		return value;
	}
	
	private void setValues() {
		preferencesHtml = getAgesStringPreference(AlwbConstants.PREF_STRING_PREFERENCES_HTML);
		preferencesPdf = getAgesStringPreference(AlwbConstants.PREF_STRING_PREFERENCES_PDF);
		preferencesVersion = getAgesStringPreference(AlwbConstants.PREF_STRING_PREFERENCES_VERSION);
		preferencesWebsite = getAgesStringPreference(AlwbConstants.PREF_STRING_PREFERENCES_WEBSITE);
		preferencesGeneration = getAgesStringPreference(AlwbConstants.PREF_STRING_PREFERENCES_GENERATION);
		genHtmlFile = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_HTML_FILE);
		genHtmlLanguage1 = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_HTML_LANGUAGE_1);
		genHtmlLanguage2 = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_HTML_LANGUAGE_2);
		genHtmlLanguage12 = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_HTML_LANGUAGE_1_2);
		genHtmlFileIncludeKeyOriginal = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_HTML_FILE_INCLUDE_KEY_ORIGINAL);
		genHtmlFileIncludeKeyDerived = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_HTML_FILE_INCLUDE_KEY_DERIVED);
		genPdfFile = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_PDF_FILE);
		genPdfLanguage1 = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_PDF_LANGUAGE_1);
		genPdfLanguage2 = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_PDF_LANGUAGE_2);
		genPdfLanguage12 = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_PDF_LANGUAGE_1_2);
		genEpubFile = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_EPUB_FILE);
		genEpubLanguage1 = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_EPUB_LANGUAGE_1);
		genEpubLanguage2 = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_EPUB_LANGUAGE_2);
		genEpubLanguage12 = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_EPUB_LANGUAGE_1_2);
		genResources = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_RESOURCES);
		genTmsJsonFile = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_JSON_FILE);
		tmsJsonFileFormatSetIncludeKey = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_TMS_JSON_FORMAT_SET_INCLUDE_KEY);
		tmsJsonFileFormatSetIncludeTag = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_TMS_JSON_FORMAT_SET_INCLUDE_TAG);
		tmsJsonFileFormatSetIncludeClass = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_TMS_JSON_FORMAT_SET_INCLUDE_CLASS);
		tmsJsonFileFormatSetIncludeText = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_TMS_JSON_FORMAT_SET_INCLUDE_TEXT);
		tmsJsonFileKeySetIncludeText = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_TMS_JSON_KEY_SET_INCLUDE_TEXT);
		tmsJsonFileKeySetIncludeFrequencies = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_TMS_JSON_KEY_SET_INCLUDE_FREQUENCIES);
		displayVersionOfHymn = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_DISPLAY_VERSION_OF_HYMN);
		displayVersionOfVerse = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_DISPLAY_VERSION_OF_VERSE);
		displayVersionOfReading = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_DISPLAY_VERSION_OF_READING);
		displayVersionOfParaPrayer = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_DISPLAY_VERSION_OF_PARA_PRAYER);
		displayVersionOfParaChant = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_DISPLAY_VERSION_OF_PARA_CHANT);
		displayVersionOfParaHeirmos = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_DISPLAY_VERSION_OF_PARA_HEIRMOS);
		displayVersionOfParaHymnLastLine = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_DISPLAY_VERSION_OF_PARA_HYMN_LAST_LINE);
		makeL1Editable = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_MAKE_L1_EDITABLE);
		makeL2Editable = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_MAKE_L2_EDITABLE);
		includeMediaDocumentLinks = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_INCLUDE_MEDIA_DOCUMENT_LINKS);
		includeMediaAudioLinks = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_INCLUDE_MEDIA_AUDIO_LINKS);
		includeMediaScoreByzantineLinks = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_INCLUDE_MEDIA_SCORE_BYZANTINE_LINKS);
		includeMediaScoreWesternLinks = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_INCLUDE_MEDIA_SCORE_WESTERN_LINKS);
		putSingleMediaOccurrenceInDropdown = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_PUT_SINGLE_MEDIA_OCCURRENCE_IN_DROPDOWN);
		language1MediaPreferred = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_1_MEDIA_PREFERRED);
		language1MediaDefault = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_1_MEDIA_DEFAULT);
		language2MediaPreferred = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_2_MEDIA_PREFERRED);
		language2MediaDefault = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_2_MEDIA_DEFAULT);
		dateLocaleLanguageV1 = getAgesStringPreference(AlwbConstants.PREF_STRING_DATE_LOCALE_LANGUAGE_V1);
		dateLocaleLanguageV2 = getAgesStringPreference(AlwbConstants.PREF_STRING_DATE_LOCALE_LANGUAGE_V2);
		dateLocaleCountryV1 = getAgesStringPreference(AlwbConstants.PREF_STRING_DATE_LOCALE_COUNTRY_V1);
		dateLocaleCountryV2 = getAgesStringPreference(AlwbConstants.PREF_STRING_DATE_LOCALE_COUNTRY_V2);
		dateFormatV1 = getAgesStringPreference(AlwbConstants.PREF_STRING_DATE_FORMAT_V1);
		dateFormatV2 = getAgesStringPreference(AlwbConstants.PREF_STRING_DATE_FORMAT_V2);
		dateFormatLdp = getAgesStringPreference(AlwbConstants.PREF_STRING_DATE_FORMAT_LDP);
		includeMergedPdfHref = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_INCLUDE_MERGED_PDF_IN_SITE_INDEX);
		language1GospelPreferred = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_1_GOSPEL_PREFERRED);
		language1GospelDefault = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_1_GOSPEL_DEFAULT);
		language2GospelPreferred = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_2_GOSPEL_PREFERRED);
		language2GospelDefault = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_2_GOSPEL_DEFAULT);
		language1EpistlePreferred = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_1_EPISTLE_PREFERRED);
		language1EpistleDefault = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_1_EPISTLE_DEFAULT);
		language2EpistlePreferred = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_2_EPISTLE_PREFERRED);
		language2EpistleDefault = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_2_EPISTLE_DEFAULT);
		language1ProphetologionPreferred = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_1_PROPHETOLOGION_PREFERRED);
		language1ProphetologionDefault = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_1_PROPHETOLOGION_DEFAULT);
		language2ProphetologionPreferred = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_2_PROPHETOLOGION_PREFERRED);
		language2ProphetologionDefault = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_2_PROPHETOLOGION_DEFAULT);
		language1 = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_1);
		language1Default = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_1_DEFAULT);
		language2 = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_2);
		language2Default = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_2_DEFAULT);
		language1PsalterPreferred = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_1_PSALTER_PREFERRED);
		language1PsalterDefault = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_1_PSALTER_DEFAULT);
		language2PsalterPreferred = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_2_PSALTER_PREFERRED);
		language2PsalterDefault = getAgesStringPreference(AlwbConstants.PREF_STRING_LANGUAGE_2_PSALTER_DEFAULT);
		templateLanguage = getAgesStringPreference(AlwbConstants.PREF_STRING_TEMPLATE_LANGUAGE);
		genIndexServices = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_INDEX_SERVICES);
		genIndexBooks = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_INDEX_BOOKS);
		genIndexCustom = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_GEN_INDEX_CUSTOM);
		indexIncludeFileTimestamp = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_INDEX_INCLUDE_FILE_TIMESTAMP);	
		indexTimestampFormat	= getAgesStringPreference(AlwbConstants.PREF_STRING_INDEX_TIMESTAMP_FORMAT);
		indexTimestampDescPrefix	= getAgesStringPreference(AlwbConstants.PREF_STRING_INDEX_TIMESTAMP_DESC_PREFIX);
		indexTimestampDescSuffix	= getAgesStringPreference(AlwbConstants.PREF_STRING_INDEX_TIMESTAMP_DESC_SUFFIX);
		htmlIndexLanguagePreferred = getAgesStringPreference(AlwbConstants.PREF_STRING_HTML_INDEX_LANGUAGE_PREFERRED);
		htmlIndexLanguageDefault = getAgesStringPreference(AlwbConstants.PREF_STRING_HTML_INDEX_LANGUAGE_DEFAULT);
		indexLinkTargetHtml = getAgesStringPreference(AlwbConstants.PREF_STRING_INDEX_LINK_TARGET_HTML);
		indexLinkTargetPdf = getAgesStringPreference(AlwbConstants.PREF_STRING_INDEX_LINK_TARGET_PDF);
		htmlLinkDelimiter = getAgesStringPreference(AlwbConstants.PREF_STRING_INDEX_LINK_DELIMITER);
		htmlSiteRoot = getAgesStringPreference(AlwbConstants.PREF_STRING_HTML_SITE_ROOT);
		htmlServiceFolderRoot = getAgesStringPreference(AlwbConstants.PREF_STRING_HTML_SERVICE_FOLDER_ROOT);
		htmlBookFolderRoot = getAgesStringPreference(AlwbConstants.PREF_STRING_HTML_BOOK_FOLDER_ROOT);
		htmlCustomFolderRoot = getAgesStringPreference(AlwbConstants.PREF_STRING_HTML_CUSTOM_FOLDER_ROOT);
		copyHtmlCssFiles = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_COPY_HTML_CSS_FILES);
		htmlCssPath = getAgesStringPreference(AlwbConstants.PREF_STRING_HTML_CSS_PATH);
		copyHtmlJsFiles = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_COPY_HTML_JS_FILES);
		htmlJsPath = getAgesStringPreference(AlwbConstants.PREF_STRING_HTML_JS_PATH);
		copyHtmlMediaFiles = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_COPY_HTML_MEDIA_FILES);
		htmlMediaPath = getAgesStringPreference(AlwbConstants.PREF_STRING_HTML_MEDIA_PATH);
		copyHtmlMainFiles = getAgesBooleanPreference(AlwbConstants.PREF_BOOLEAN_COPY_HTML_MAIN_FILES);
		htmlMainPath = getAgesStringPreference(AlwbConstants.PREF_STRING_HTML_MAIN_PATH);
		nbrSpaces = getAgesIntPreference(AlwbConstants.PREF_INT_NBR_SPACES);
		pdfStylesheetVersion = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_STYLESHEET_VERSION);
		pdfStylesheetPrefix = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_STYLESHEET_PREFIX);
		pdfOutputPath = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_OUTPUT_PATH);
		pdfBodyNbrColumns = getAgesIntPreference(AlwbConstants.PREF_INT_PDF_BODY_NBR_COLUMNS);
		pdfBodyColumnGap = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_COLUMN_GAP);
		pdfBodyPageEvenHeight = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_EVEN_HEIGHT);
		pdfBodyPageEvenWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_EVEN_WIDTH);
		pdfBodyPageEvenMarginTop = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_EVEN_MARGIN_TOP);
		pdfBodyPageEvenMarginBottom = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_EVEN_MARGIN_BOTTOM);
		pdfBodyPageEvenMarginLeft = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_EVEN_MARGIN_LEFT);
		pdfBodyPageEvenMarginRight = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_EVEN_MARGIN_RIGHT);

		pdfBodyPageEvenRegionBodyMarginTop = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_EVEN_REGION_BODY_MARGIN_TOP);
		pdfBodyPageEvenRegionBodyMarginBottom = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_EVEN_REGION_BODY_MARGIN_BOTTOM);
		pdfBodyPageEvenRegionBeforeExtent = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_EVEN_REGION_BEFORE_EXTENT);
		pdfBodyPageEvenRegionAfterExtent = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_EVEN_REGION_AFTER_EXTENT);

		pdfBodyPageOddHeight = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_ODD_HEIGHT);
		pdfBodyPageOddWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_ODD_WIDTH);
		pdfBodyPageOddMarginTop = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_ODD_MARGIN_TOP);
		pdfBodyPageOddMarginBottom = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_ODD_MARGIN_BOTTOM);
		pdfBodyPageOddMarginLeft = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_ODD_MARGIN_LEFT);
		pdfBodyPageOddMarginRight = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_ODD_MARGIN_RIGHT);

		pdfBodyPageOddRegionBodyMarginTop = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_ODD_REGION_BODY_MARGIN_TOP);
		pdfBodyPageOddRegionBodyMarginBottom = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_ODD_REGION_BODY_MARGIN_BOTTOM);
		pdfBodyPageOddRegionBeforeExtent = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_ODD_REGION_BEFORE_EXTENT);
		pdfBodyPageOddRegionAfterExtent = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_PAGE_ODD_REGION_AFTER_EXTENT);
		
		pdfBodyFooterOddLeftWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_FOOTER_ODD_LEFT_WIDTH);
		pdfBodyFooterOddLeftAlignment = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_FOOTER_ODD_LEFT_ALIGNMENT);
		pdfBodyFooterOddCenterWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_FOOTER_ODD_CENTER_WIDTH);
		pdfBodyFooterOddCenterAlignment = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_FOOTER_ODD_CENTER_ALIGNMENT);
		pdfBodyFooterOddRightWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_FOOTER_ODD_RIGHT_WIDTH);
		pdfBodyFooterOddRightAlignment = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_FOOTER_ODD_RIGHT_ALIGNMENT);
		pdfBodyFooterEvenLeftWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_FOOTER_EVEN_LEFT_WIDTH);
		pdfBodyFooterEvenLeftAlignment = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_FOOTER_EVEN_LEFT_ALIGNMENT);
		pdfBodyFooterEvenCenterWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_FOOTER_EVEN_CENTER_WIDTH);
		pdfBodyFooterEvenCenterAlignment = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_FOOTER_EVEN_CENTER_ALIGNMENT);
		pdfBodyFooterEvenRightWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_FOOTER_EVEN_RIGHT_WIDTH);
		pdfBodyFooterEvenRightAlignment = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_FOOTER_EVEN_RIGHT_ALIGNMENT);
		pdfBodyHeaderOddLeftWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_HEADER_ODD_LEFT_WIDTH);
		pdfBodyHeaderOddLeftAlignment = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_HEADER_ODD_LEFT_ALIGNMENT);
		pdfBodyHeaderOddCenterWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_HEADER_ODD_CENTER_WIDTH);
		pdfBodyHeaderOddCenterAlignment = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_HEADER_ODD_CENTER_ALIGNMENT);
		pdfBodyHeaderOddRightWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_HEADER_ODD_RIGHT_WIDTH);
		pdfBodyHeaderOddRightAlignment = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_HEADER_ODD_RIGHT_ALIGNMENT);
		pdfBodyHeaderEvenLeftWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_HEADER_EVEN_LEFT_WIDTH);
		pdfBodyHeaderEvenLeftAlignment = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_HEADER_EVEN_LEFT_ALIGNMENT);
		pdfBodyHeaderEvenCenterWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_HEADER_EVEN_CENTER_WIDTH);
		pdfBodyHeaderEvenCenterAlignment = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_HEADER_EVEN_CENTER_ALIGNMENT);
		pdfBodyHeaderEvenRightWidth = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_HEADER_EVEN_RIGHT_WIDTH);
		pdfBodyHeaderEvenRightAlignment = getAgesStringPreference(AlwbConstants.PREF_STRING_PDF_BODY_HEADER_EVEN_RIGHT_ALIGNMENT);

	}

}
