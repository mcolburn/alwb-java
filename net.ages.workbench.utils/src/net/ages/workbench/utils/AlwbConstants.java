package net.ages.workbench.utils;


/**
 * This contains many of the constant values used in ALWB.
 * The VERSION should be updated each time jars are created.
 * 
 * @author mac002
 *
 */
public class AlwbConstants {
	
	// version
	public static final String VERSION = "2018-09-13-01";
	
	// template categories
	public static final String TEMPLATE_SERVICE = "se";
	public static final String TEMPLATE_BOOK = "bk";
	public static final String TEMPLATE_CUSTOM = "cu"; // cu can also mean 'customer'

	// output types
	public  static final int DOCBOOK = 1;
	public  static final int HTML = 2;
	public  static final int PDF = 3;
	public  static final int EPUB = 4;
	public  static final int TXT = 5;
	public  static final int XML_FO = 6;
	public  static final int JSON = 7;
	public  static final int MAIN_HTML = 8;
	
	// version types
	public static final int FOR_LITURGICAL = 1;
	public static final int FOR_GOSPEL = 2;
	public static final int FOR_EPISTLE = 3;
	public static final int FOR_PROPHETOLOGION = 4;
	public static final int FOR_PSALTER = 5;


// The following are for the Eclipse preferences set by the user	
	public static final String P_STRING_PREFERENCES_MAIN = "stringMainPreference";
	public static final String P_BOOLEAN_DEBUG = "booleanDebugPreference";
	public static final String P_CHOICE_LOG4J = "stringLog4jTracePreference";
	public static final String P_STRING_LOG4J_PATH = "stringLog4jPathPreference";
	public static final String P_STRING_LOG4J_FILE = "stringLog4jFilePreference";
	public static final String P_BOOLEAN_SHOW_SOURCE = "booleanShowSourcePreference";
	public static final String P_BOOLEAN_SHOW_DOMAIN = "booleanShowDomainPreference";
	public static final String P_CHOICE_OUTPUT_TYPE = "choicePreference";
	public static final String P_STRING_ASSETS_ROOT_FOLDER = "stringAssetsRootFolder";
	public static final String P_STRING_MEDIA_ROOT_FOLDER = "stringMediaRootFolder";
	public static final String P_BOOLEAN_GEN_MESSAGES_HTML = "generateMessagesHtml";
	
// The following match the keys in the preference ares files
	
// pref.master
	public static final String PREF_STRING_PREFERENCES_SELECTED_MAIN = "selected.pref.main";
// pref.main*.ares
	public static final String PREF_STRING_PREFERENCES_HTML = "prefs.html";
	public static final String PREF_STRING_PREFERENCES_PDF = "prefs.pdf";
	public static final String PREF_STRING_PREFERENCES_VERSION = "prefs.version";
	public static final String PREF_STRING_PREFERENCES_WEBSITE = "prefs.website";
	public static final String PREF_STRING_PREFERENCES_GENERATION = "prefs.generation";
	
// pref.generation*.ares
	public static final String PREF_BOOLEAN_GEN_HTML_FILE = "generate.file.html";
	public static final String PREF_BOOLEAN_GEN_HTML_LANGUAGE_1 = "generate.file.html.version.v1";
	public static final String PREF_BOOLEAN_GEN_HTML_LANGUAGE_2 = "generate.file.html.version.v2";
	public static final String PREF_BOOLEAN_GEN_HTML_LANGUAGE_1_2 = "generate.file.html.version.v1v2";
	public static final String PREF_BOOLEAN_GEN_HTML_FILE_INCLUDE_KEY_ORIGINAL = "generate.file.html.include.key.original";
	public static final String PREF_BOOLEAN_GEN_HTML_FILE_INCLUDE_KEY_DERIVED = "generate.file.html.include.key.derived";
	public static final String PREF_BOOLEAN_GEN_PDF_FILE = "generate.file.pdf";
	public static final String PREF_BOOLEAN_GEN_PDF_LANGUAGE_1 = "generate.file.pdf.version.v1";
	public static final String PREF_BOOLEAN_GEN_PDF_LANGUAGE_2 = "generate.file.pdf.version.v2";
	public static final String PREF_BOOLEAN_GEN_PDF_LANGUAGE_1_2 = "generate.file.pdf.version.v1v2";
	public static final String PREF_BOOLEAN_GEN_EPUB_FILE = "generate.file.epub";
	public static final String PREF_BOOLEAN_GEN_EPUB_LANGUAGE_1 = "generate.file.epub.version.v1";
	public static final String PREF_BOOLEAN_GEN_EPUB_LANGUAGE_2 = "generate.file.epub.version.v2";
	public static final String PREF_BOOLEAN_GEN_EPUB_LANGUAGE_1_2 = "generate.file.epub.version.v1v2";
	public static final String PREF_BOOLEAN_GEN_RESOURCES = "generate.file.resources";
	public static final String PREF_BOOLEAN_GEN_JSON_FILE = "generate.tms.json";
	public static final String PREF_BOOLEAN_TMS_JSON_FORMAT_SET_INCLUDE_KEY = "tms.json.format.set.include.key";
	public static final String PREF_BOOLEAN_TMS_JSON_FORMAT_SET_INCLUDE_TAG = "tms.json.format.set.include.tag";
	public static final String PREF_BOOLEAN_TMS_JSON_FORMAT_SET_INCLUDE_CLASS = "tms.json.format.set.include.class";
	public static final String PREF_BOOLEAN_TMS_JSON_FORMAT_SET_INCLUDE_TEXT = "tms.json.format.set.include.text";
	public static final String PREF_BOOLEAN_TMS_JSON_KEY_SET_INCLUDE_TEXT = "tms.json.key.set.include.text";
	public static final String PREF_BOOLEAN_TMS_JSON_KEY_SET_INCLUDE_FREQUENCIES = "tms.json.key.set.include.frequencies";
	public static final String PREF_BOOLEAN_MAKE_L1_EDITABLE = "make.editable.html.v1";
	public static final String PREF_BOOLEAN_MAKE_L2_EDITABLE = "make.editable.html.v2";
	public static final String PREF_BOOLEAN_DISPLAY_VERSION_OF_TEXT_V1 = "display.version.text.v1";
	public static final String PREF_BOOLEAN_DISPLAY_VERSION_OF_TEXT_V2 = "display.version.text.v2";
	public static final String PREF_STRING_VERSION_PREFIX = "version.prefix";
	public static final String PREF_STRING_VERSION_SUFFIX = "version.suffix";
	public static final String PREF_STRING_VERSION_DELIMITER = "version.delimiter";
	
// pref.html*.ares
	public static final String PREF_BOOLEAN_INCLUDE_MEDIA_DOCUMENT_LINKS = "include.media.links.text";
	public static final String PREF_BOOLEAN_INCLUDE_MEDIA_AUDIO_LINKS = "include.media.links.audio";
	public static final String PREF_BOOLEAN_INCLUDE_MEDIA_SCORE_BYZANTINE_LINKS = "include.media.links.score.byzantine";
	public static final String PREF_BOOLEAN_INCLUDE_MEDIA_SCORE_WESTERN_LINKS = "include.media.links.score.western";
	public static final String PREF_BOOLEAN_PUT_SINGLE_MEDIA_OCCURRENCE_IN_DROPDOWN = "put.single.media.occurrence.in.dropdown";
	public static final String PREF_STRING_LANGUAGE_1_MEDIA_PREFERRED = "media.v1.preferred";
	public static final String PREF_STRING_LANGUAGE_1_MEDIA_DEFAULT = "media.v1.fallback";
	public static final String PREF_STRING_LANGUAGE_2_MEDIA_PREFERRED = "media.v2.preferred";
	public static final String PREF_STRING_LANGUAGE_2_MEDIA_DEFAULT = "media.v2.fallback";
	
// versions*.ares

	// Date Locales
	public static final String PREF_STRING_DATE_LOCALE_LANGUAGE_V1 = "date.locale.language.v1";
	public static final String PREF_STRING_DATE_LOCALE_LANGUAGE_V2 = "date.locale.language.v2";
	public static final String PREF_STRING_DATE_LOCALE_COUNTRY_V1 = "date.locale.country.v1";
	public static final String PREF_STRING_DATE_LOCALE_COUNTRY_V2 = "date.locale.country.v2";
	
	// Date Formats
	public static final String PREF_STRING_DATE_FORMAT_V1 = "date.format.v1";
	public static final String PREF_STRING_DATE_FORMAT_V2 = "date.format.v2";
	public static final String PREF_STRING_DATE_FORMAT_LDP = "date.format.ldp";

	// Gospel Preferences
	public static final String PREF_STRING_LANGUAGE_1_GOSPEL_PREFERRED = "lectionary.text.gospel.v1.preferred";
	public static final String PREF_STRING_LANGUAGE_1_GOSPEL_DEFAULT = "lectionary.text.gospel.v1.fallback";
	public static final String PREF_STRING_LANGUAGE_2_GOSPEL_PREFERRED = "lectionary.text.gospel.v2.preferred";
	public static final String PREF_STRING_LANGUAGE_2_GOSPEL_DEFAULT = "lectionary.text.gospel.v2.fallback";

	// Epistle Preferences	
	public static final String PREF_STRING_LANGUAGE_1_EPISTLE_PREFERRED = "lectionary.text.epistle.v1.preferred";
	public static final String PREF_STRING_LANGUAGE_1_EPISTLE_DEFAULT = "lectionary.text.epistle.v1.fallback";
	public static final String PREF_STRING_LANGUAGE_2_EPISTLE_PREFERRED = "lectionary.text.epistle.v2.preferred";
	public static final String PREF_STRING_LANGUAGE_2_EPISTLE_DEFAULT = "lectionary.text.epistle.v2.fallback";

	// Prophetologion Preferences	
	public static final String PREF_STRING_LANGUAGE_1_PROPHETOLOGION_PREFERRED = "lectionary.text.prophetologion.v1.preferred";
	public static final String PREF_STRING_LANGUAGE_1_PROPHETOLOGION_DEFAULT = "lectionary.text.prophetologion.v1.fallback";
	public static final String PREF_STRING_LANGUAGE_2_PROPHETOLOGION_PREFERRED = "lectionary.text.prophetologion.v2.preferred";
	public static final String PREF_STRING_LANGUAGE_2_PROPHETOLOGION_DEFAULT = "lectionary.text.prophetologion.v2.fallback";

	// Liturgical 
	public static final String PREF_STRING_LANGUAGE_1 = "liturgical.text.v1.preferred"; // preferred
	public static final String PREF_STRING_LANGUAGE_1_DEFAULT = "liturgical.text.v1.fallback"; // default
	public static final String PREF_STRING_LANGUAGE_2 = "liturgical.text.v2.preferred";
	public static final String PREF_STRING_LANGUAGE_2_DEFAULT = "liturgical.text.v2.fallback"; // default

	// Psalter Preferences
	public static final String PREF_STRING_LANGUAGE_1_PSALTER_PREFERRED = "psalter.text.v1.preferred";
	public static final String PREF_STRING_LANGUAGE_1_PSALTER_DEFAULT = "psalter.text.v1.fallback";
	public static final String PREF_STRING_LANGUAGE_2_PSALTER_PREFERRED = "psalter.text.v2.preferred";
	public static final String PREF_STRING_LANGUAGE_2_PSALTER_DEFAULT = "psalter.text.v2.fallback";
	
	public static final String PREF_STRING_TEMPLATE_LANGUAGE = "template.keys";
	
	// website
	public static final String PREF_BOOLEAN_GEN_INDEX_SERVICES = "generate.services.index";	
	public static final String PREF_BOOLEAN_GEN_INDEX_BOOKS = "generate.books.index";	
	public static final String PREF_BOOLEAN_GEN_INDEX_CUSTOM = "generate.custom.index";	
	public static final String PREF_BOOLEAN_INCLUDE_MERGED_PDF_IN_SITE_INDEX = "include.merged.pdf.in.site.index";
	public static final String PREF_STRING_INDEX_LINK_DELIMITER = "index.link.delimiter";
	public static final String PREF_STRING_HTML_INDEX_LANGUAGE_PREFERRED = "index.version.preferred";
	public static final String PREF_STRING_HTML_INDEX_LANGUAGE_DEFAULT = "index.version.fallback";
	public static final String PREF_STRING_INDEX_LINK_TARGET_HTML = "index.link.target.html";
	public static final String PREF_STRING_INDEX_LINK_TARGET_PDF = "index.link.target.pdf";
	public static final String PREF_BOOLEAN_INDEX_INCLUDE_FILE_TIMESTAMP = "index.include.file.timestamp";
	public static final String PREF_STRING_INDEX_TIMESTAMP_FORMAT = "index.timestamp.format";
	public static final String PREF_STRING_INDEX_TIMESTAMP_DESC_PREFIX = "index.timestamp.description.prefix";
	public static final String PREF_STRING_INDEX_TIMESTAMP_DESC_SUFFIX = "index.timestamp.description.suffix";
	public static final String PREF_STRING_HTML_SITE_ROOT = "generated.website.folder.root";
	public static final String PREF_STRING_HTML_SERVICE_FOLDER_ROOT = "generated.website.folder.services";
	public static final String PREF_STRING_HTML_BOOK_FOLDER_ROOT = "generated.website.folder.books";
	public static final String PREF_STRING_HTML_CUSTOM_FOLDER_ROOT = "generated.website.folder.custom";
	public static final String PREF_BOOLEAN_COPY_HTML_CSS_FILES = "assets.copy.css";
	public static final String PREF_STRING_HTML_CSS_PATH = "assets.copy.css.from.folder";
	public static final String PREF_BOOLEAN_COPY_HTML_JS_FILES = "assets.copy.javascript";
	public static final String PREF_STRING_HTML_JS_PATH = "assets.copy.javascript.from.folder";
	public static final String PREF_BOOLEAN_COPY_HTML_MEDIA_FILES = "media.copy";
	public static final String PREF_STRING_HTML_MEDIA_PATH = "media.copy.from.folder";
	public static final String PREF_BOOLEAN_COPY_HTML_MAIN_FILES = "assets.copy.root.files";
	public static final String PREF_STRING_HTML_MAIN_PATH = "assets.copy.root.files.from.folder";
	
	// pdf*.ares
		
	public static final String PREF_INT_NBR_SPACES = "intNbrSpacesPreference";
	
	public static final String PREF_STRING_PDF_STYLESHEET_VERSION = "stylesheet.version";
	public static final String PREF_STRING_PDF_STYLESHEET_PREFIX = "stylesheet.prefix";
	public static final String PREF_STRING_PDF_OUTPUT_PATH = "output.path";

	public static final String PREF_INT_PDF_BODY_NBR_COLUMNS = "body.page.columns.quantity";
	public static final String PREF_STRING_PDF_BODY_COLUMN_GAP = "body.page.columns.gap";

	public static final String PREF_STRING_PDF_BODY_PAGE_EVEN_HEIGHT = "body.page.even.height";
	public static final String PREF_STRING_PDF_BODY_PAGE_EVEN_WIDTH = "body.page.even.width";
	public static final String PREF_STRING_PDF_BODY_PAGE_EVEN_MARGIN_TOP = "body.page.even.margin.top";
	public static final String PREF_STRING_PDF_BODY_PAGE_EVEN_MARGIN_BOTTOM = "body.page.even.margin.bottom";
	public static final String PREF_STRING_PDF_BODY_PAGE_EVEN_MARGIN_LEFT = "body.page.even.margin.left";
	public static final String PREF_STRING_PDF_BODY_PAGE_EVEN_MARGIN_RIGHT = "body.page.even.margin.right";
	public static final String PREF_STRING_PDF_BODY_PAGE_EVEN_REGION_BODY_MARGIN_TOP = "body.page.even.region.body.margin.top";
	public static final String PREF_STRING_PDF_BODY_PAGE_EVEN_REGION_BODY_MARGIN_BOTTOM = "body.page.even.region.body.margin.bottom";
	public static final String PREF_STRING_PDF_BODY_PAGE_EVEN_REGION_BEFORE_EXTENT = "body.page.even.region.before.extent";
	public static final String PREF_STRING_PDF_BODY_PAGE_EVEN_REGION_AFTER_EXTENT = "body.page.even.region.after.extent";

	public static final String PREF_STRING_PDF_BODY_PAGE_ODD_HEIGHT = "body.page.odd.height";
	public static final String PREF_STRING_PDF_BODY_PAGE_ODD_WIDTH = "body.page.odd.width";
	public static final String PREF_STRING_PDF_BODY_PAGE_ODD_MARGIN_TOP = "body.page.odd.margin.top";
	public static final String PREF_STRING_PDF_BODY_PAGE_ODD_MARGIN_BOTTOM = "body.page.odd.margin.bottom";
	public static final String PREF_STRING_PDF_BODY_PAGE_ODD_MARGIN_LEFT = "body.page.odd.margin.left";
	public static final String PREF_STRING_PDF_BODY_PAGE_ODD_MARGIN_RIGHT = "body.page.odd.margin.right";
	public static final String PREF_STRING_PDF_BODY_PAGE_ODD_REGION_BODY_MARGIN_TOP = "body.page.odd.region.body.margin.top";
	public static final String PREF_STRING_PDF_BODY_PAGE_ODD_REGION_BODY_MARGIN_BOTTOM = "body.page.odd.region.body.margin.bottom";
	public static final String PREF_STRING_PDF_BODY_PAGE_ODD_REGION_BEFORE_EXTENT = "body.page.odd.region.before.extent";
	public static final String PREF_STRING_PDF_BODY_PAGE_ODD_REGION_AFTER_EXTENT = "body.page.odd.region.after.extent";

	
	public static final String PREF_STRING_PDF_BODY_FOOTER_ODD_LEFT_WIDTH = "body.footer.odd.left.width";
	public static final String PREF_STRING_PDF_BODY_FOOTER_ODD_LEFT_ALIGNMENT = "body.footer.odd.left.alignment";
	public static final String PREF_STRING_PDF_BODY_FOOTER_ODD_CENTER_WIDTH = "body.footer.odd.center.width";
	public static final String PREF_STRING_PDF_BODY_FOOTER_ODD_CENTER_ALIGNMENT = "body.footer.odd.center.alignment";
	public static final String PREF_STRING_PDF_BODY_FOOTER_ODD_RIGHT_WIDTH = "body.footer.odd.right.width";
	public static final String PREF_STRING_PDF_BODY_FOOTER_ODD_RIGHT_ALIGNMENT = "body.footer.odd.right.alignment";
	
	public static final String PREF_STRING_PDF_BODY_FOOTER_EVEN_LEFT_WIDTH = "body.footer.even.left.width";
	public static final String PREF_STRING_PDF_BODY_FOOTER_EVEN_LEFT_ALIGNMENT = "body.footer.even.left.alignment";
	public static final String PREF_STRING_PDF_BODY_FOOTER_EVEN_CENTER_WIDTH = "body.footer.even.center.width";
	public static final String PREF_STRING_PDF_BODY_FOOTER_EVEN_CENTER_ALIGNMENT = "body.footer.even.center.alignment";
	public static final String PREF_STRING_PDF_BODY_FOOTER_EVEN_RIGHT_WIDTH = "body.footer.even.right.width";
	public static final String PREF_STRING_PDF_BODY_FOOTER_EVEN_RIGHT_ALIGNMENT = "body.footer.even.right.alignment";

	public static final String PREF_STRING_PDF_BODY_HEADER_ODD_LEFT_WIDTH = "body.header.odd.left.width";
	public static final String PREF_STRING_PDF_BODY_HEADER_ODD_LEFT_ALIGNMENT = "body.header.odd.left.alignment";
	public static final String PREF_STRING_PDF_BODY_HEADER_ODD_CENTER_WIDTH = "body.header.odd.center.width";
	public static final String PREF_STRING_PDF_BODY_HEADER_ODD_CENTER_ALIGNMENT = "body.header.odd.center.alignment";
	public static final String PREF_STRING_PDF_BODY_HEADER_ODD_RIGHT_WIDTH = "body.header.odd.right.width";
	public static final String PREF_STRING_PDF_BODY_HEADER_ODD_RIGHT_ALIGNMENT = "body.header.odd.right.alignment";
	
	public static final String PREF_STRING_PDF_BODY_HEADER_EVEN_LEFT_WIDTH = "body.header.even.left.width";
	public static final String PREF_STRING_PDF_BODY_HEADER_EVEN_LEFT_ALIGNMENT = "body.header.even.left.alignment";
	public static final String PREF_STRING_PDF_BODY_HEADER_EVEN_CENTER_WIDTH = "body.header.even.center.width";
	public static final String PREF_STRING_PDF_BODY_HEADER_EVEN_CENTER_ALIGNMENT = "body.header.even.center.alignment";
	public static final String PREF_STRING_PDF_BODY_HEADER_EVEN_RIGHT_WIDTH = "body.header.even.right.width";
	public static final String PREF_STRING_PDF_BODY_HEADER_EVEN_RIGHT_ALIGNMENT = "body.header.even.right.alignment";

	
	public static final String DOCBOOK_EXTENSION = "xml";
	public static final String DOCBOOK_FOLDER = "docbook";
	public static final String EPUB_EXTENSION = "epub";
	public static final String EPUB_FOLDER = "epub";
	public static final String HTML_WEBSITE = "website";
	public static final String HTML_EXTENSION = "html";
	public static final String HTML_FOLDER = "html";
	public static final String PDF_EXTENSION = "pdf";
	public static final String PDF_FOLDER = "pdf";
	public static final String TEXT_EXTENSION = "txt";
	public static final String TEXT_FOLDER = "text";
	public static final String JSON_EXTENSION = "json";
	public static final String JSON_FOLDER = "json";
	public static final String FO_EXTENSION = "fo";
	public static final String FO_FOLDER = "xml-fo";

	public static final String SMALL_VESPERS = "sv";
	public static final String PRESANCTIFIED_LITURGY = "pl";
	public static final String VESPERAL_LITURGY = "vl";
	public static final String VESPERS = "ve";
	public static final String COMPLINE = "co";
	public static final String MIDNIGHT_OFFICE = "mo";
	public static final String MATINS = "ma";
	public static final String EVENING_MATINS = "em";
	public static final String HOURS_1 = "h1";
	public static final String HOURS_3 = "h3";
	public static final String HOURS_6 = "h6";
	public static final String LITURGY = "li";
	public static final String HOURS_9 = "h9";
	public static final String GREAT_HOURS = "gh";
	public static final String TRIODION = "tr";
	public static final String MENAION = "me";
	public static final String PENTECOSTARION = "pe";
	public static final String LECTIONARY_EPISTLE = "le.ep";
	public static final String LECTIONARY_GOSPEL = "le.go";
	public static final String LECTIONARY_PROPHETOLOGION = "le.pr";
	public static final String LECTIONARY_PSALTER = "ps";
	
	// Sacraments
	public static final String SACRAMENT_BAPTISM = "unc";
	public static final String SACRAMENT_CHRISMATION = "chr";
	public static final String SACRAMENT_MARRIAGE = "wed";
	public static final String SACRAMENT_FUNERAL = "fun";
	public static final String SACRAMENT_MEMORIAL = "mem";
	public static final String SACRAMENT_UNCTION = "unc";

	public static final String TEMPLATE_TITLE_SUFFIX_HTML_TAB = ".html.tab";
	public static final String TEMPLATE_TITLE_SUFFIX_HTML_LINK = ".html.link";
	public static final String TEMPLATE_TITLE_SUFFIX_HEADER_TITLE = ".pdf.header.title";
	public static final String COMMEMORATION_TEXT_LONG_KEY = "Commemoration.text";
	public static final String COMMEMORATION_TEXT_SHORT_KEY = "ShortCommemoration1.text";
}
