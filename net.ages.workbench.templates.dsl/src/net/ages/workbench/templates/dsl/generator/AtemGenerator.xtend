/*
 * This is the main generator for ATEM files
 */
package net.ages.workbench.templates.dsl.generator

import java.util.List
import net.ages.workbench.resources.dsl.ares.AresModel
import net.ages.workbench.resources.dsl.ares.Definition
import net.ages.workbench.templates.dsl.atem.AbstractComponent
import net.ages.workbench.templates.dsl.atem.AbstractDateCase
import net.ages.workbench.templates.dsl.atem.AbstractDayCase
import net.ages.workbench.templates.dsl.atem.AbstractDayNameCase
import net.ages.workbench.templates.dsl.atem.Actor
import net.ages.workbench.templates.dsl.atem.All
import net.ages.workbench.templates.dsl.atem.AtemModel
import net.ages.workbench.templates.dsl.atem.Block
import net.ages.workbench.templates.dsl.atem.Break
import net.ages.workbench.templates.dsl.atem.BreakType
import net.ages.workbench.templates.dsl.atem.Commemoration
import net.ages.workbench.templates.dsl.atem.DOM
import net.ages.workbench.templates.dsl.atem.DOP
import net.ages.workbench.templates.dsl.atem.DOWN
import net.ages.workbench.templates.dsl.atem.DOWT
import net.ages.workbench.templates.dsl.atem.DateRange
import net.ages.workbench.templates.dsl.atem.Date
import net.ages.workbench.templates.dsl.atem.DateSet
import net.ages.workbench.templates.dsl.atem.DayNameRange
import net.ages.workbench.templates.dsl.atem.DayNameSet
import net.ages.workbench.templates.dsl.atem.DayOfWeek
import net.ages.workbench.templates.dsl.atem.DayRange
import net.ages.workbench.templates.dsl.atem.DaySet
import net.ages.workbench.templates.dsl.atem.Dialog
import net.ages.workbench.templates.dsl.atem.DOL
import net.ages.workbench.templates.dsl.atem.Driver
import net.ages.workbench.templates.dsl.atem.EOW
import net.ages.workbench.templates.dsl.atem.ElementType
import net.ages.workbench.templates.dsl.atem.GenDate
import net.ages.workbench.templates.dsl.atem.GenYear
import net.ages.workbench.templates.dsl.atem.Head
import net.ages.workbench.templates.dsl.atem.Heading1
import net.ages.workbench.templates.dsl.atem.Heading2
import net.ages.workbench.templates.dsl.atem.Heading3
import net.ages.workbench.templates.dsl.atem.Hymn
import net.ages.workbench.templates.dsl.atem.Info
import net.ages.workbench.templates.dsl.atem.LDP
import net.ages.workbench.templates.dsl.atem.LdpType
import net.ages.workbench.templates.dsl.atem.Lookup
import net.ages.workbench.templates.dsl.atem.Media
import net.ages.workbench.templates.dsl.atem.MCD
import net.ages.workbench.templates.dsl.atem.MOW
import net.ages.workbench.templates.dsl.atem.ModeOfWeekSet
import net.ages.workbench.templates.dsl.atem.NOP
import net.ages.workbench.templates.dsl.atem.PageHeaderEven
import net.ages.workbench.templates.dsl.atem.PageHeaderOdd
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumn
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumnLeft
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumnCenter
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumnRight
import net.ages.workbench.templates.dsl.atem.HeaderFooterFragment
import net.ages.workbench.templates.dsl.atem.HeaderFooterLookup
import net.ages.workbench.templates.dsl.atem.PageFooterEven
import net.ages.workbench.templates.dsl.atem.PageFooterOdd
import net.ages.workbench.templates.dsl.atem.PageNumber
import net.ages.workbench.templates.dsl.atem.PageKeepWithNext
import net.ages.workbench.templates.dsl.atem.Paragraph
import net.ages.workbench.templates.dsl.atem.PassThroughHtml
import net.ages.workbench.templates.dsl.atem.Preface
import net.ages.workbench.templates.dsl.atem.PrefaceFragment
import net.ages.workbench.templates.dsl.atem.Reading
import net.ages.workbench.templates.dsl.atem.RestoreLocale
import net.ages.workbench.templates.dsl.atem.ResourceText
import net.ages.workbench.templates.dsl.atem.Rubric
import net.ages.workbench.templates.dsl.atem.Section
import net.ages.workbench.templates.dsl.atem.SectionFragment
import net.ages.workbench.templates.dsl.atem.SBT
import net.ages.workbench.templates.dsl.atem.SOL
import net.ages.workbench.templates.dsl.atem.SAEC
import net.ages.workbench.templates.dsl.atem.SubTitle
import net.ages.workbench.templates.dsl.atem.SetLocale
import net.ages.workbench.templates.dsl.atem.TaggedText
import net.ages.workbench.templates.dsl.atem.TemplateFragment
import net.ages.workbench.templates.dsl.atem.TemplateTitle
import net.ages.workbench.templates.dsl.atem.Title
import net.ages.workbench.templates.dsl.atem.Verse
import net.ages.workbench.templates.dsl.atem.VersionSwitch
import net.ages.workbench.templates.dsl.atem.WhenDate
import net.ages.workbench.templates.dsl.atem.WhenDateCase
import net.ages.workbench.templates.dsl.atem.WhenDayName
import net.ages.workbench.templates.dsl.atem.WhenDayNameCase
import net.ages.workbench.templates.dsl.atem.WhenExists
import net.ages.workbench.templates.dsl.atem.WhenExistsCase
import net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay
import net.ages.workbench.templates.dsl.atem.WhenModeOfWeek
import net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase
import net.ages.workbench.templates.dsl.atem.WhenMovableCycleDay
import net.ages.workbench.templates.dsl.atem.WhenOther
import net.ages.workbench.templates.dsl.atem.WhenPascha
import net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay
import net.ages.workbench.templates.dsl.atem.WhenPeriodCase
import net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay
import net.ages.workbench.templates.dsl.atem.WhenTriodionDay
import net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion
import net.ages.workbench.templates.dsl.atem.WOLC
import net.ages.workbench.templates.dsl.atem.WDOLC
import net.ages.workbench.templates.dsl.rubrics.engine.LiturgicalDayProperties
import net.ages.workbench.templates.dsl.rubrics.engine.RuleProcessor
import net.ages.workbench.templates.dsl.utils.ModelAccessor
import net.ages.workbench.utils.AlwbLogger
import net.ages.workbench.templates.dsl.html.Website
import net.ages.workbench.templates.dsl.html.ServiceYear
import net.ages.workbench.templates.dsl.html.ServiceMonth
import net.ages.workbench.templates.dsl.html.ServiceDay
import net.ages.workbench.templates.dsl.html.ServiceDayType
import net.ages.workbench.templates.dsl.html.ServiceDayTypeVersion
import net.ages.workbench.templates.dsl.html.ServiceDayTypeVersionFormat

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.common.util.URI
import java.io.File
import net.ages.workbench.templates.dsl.utils.TableManager
import net.ages.workbench.templates.dsl.xml.fo.XmlFoFormatManager
import net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase
import net.ages.workbench.templates.dsl.atem.PassThroughPdf
import net.ages.workbench.templates.dsl.atem.HeaderFooterText
import net.ages.workbench.templates.dsl.atem.HeaderFooterDate
import net.ages.workbench.templates.dsl.atem.HeaderFooterPageNumber
import net.ages.workbench.utils.AlwbConstants
import net.ages.workbench.templates.dsl.atem.HeaderFooterTitle
import net.ages.workbench.templates.dsl.atem.HeaderFooterCommemoration
import net.ages.workbench.templates.dsl.html.ServiceDayTypeVersionFormat
import net.ages.workbench.templates.dsl.html.ServiceDay
import java.util.ArrayList
import net.ages.workbench.utils.AlwbGeneralUtils

class AtemGenerator implements IGenerator {
	val debugDummyPrint = false
	val trace = false
	var logger = AlwbLogger.getLogger(this.class.name)
	var URI resourceUri
	var String theRelativePath
	var ModelAccessor aresAccessor
	var Website webSite
	var LiturgicalDayProperties theDay
	var int targetDayOfWeek
	var int targetDayOfSeason
	var int targetMonth
	var int targetDay
	var int targetMode
	var int targetSundaysBeforeStartOfTriodion
	var boolean targetTriodion
	var boolean targetPentecostarion
	var boolean targetPascha
	var RuleProcessor ruleProcessor
	
	var combinedPdfHref = ""

	var docBookExtension = AlwbConstants.DOCBOOK_EXTENSION
	var docBookFolder = AlwbConstants.DOCBOOK_FOLDER + "/"

	var docBookCssPrefix = "<?xml-stylesheet href='"
	var docBookCss = "css/docbook-css-0.4/driver.css"
	var docBookCssSuffix =  "' type='text/css'?>"

	var foExtension = AlwbConstants.FO_EXTENSION
	var foFolder = AlwbConstants.FO_FOLDER + "/"
	var pdfExtension = AlwbConstants.PDF_EXTENSION

	var delimitedTextExtension = ".json"
	var txtFolderRoot = "json"
	
	var htmlExtension = AlwbConstants.HTML_EXTENSION
	var htmlSiteRoot = ""
	var htmlServiceFolderRoot = ""
	var htmlBookFolderRoot = ""
	var htmlCustomFolderRoot = ""
	var htmlWebSite = AlwbConstants.HTML_WEBSITE + "/" + htmlSiteRoot
	var htmlWebSiteFileTypeHtml = "h/"
	var htmlWebSiteFileTypePdf = "p/"
	var htmlWebSiteFileTypeEpub = "e/"
	var indexHtml = "index.html"
		
	var htmlCssPrefix = "<link rel='stylesheet' type='text/css' href='"
	var htmlCss = ""
	var htmlCssSuffix = "'>"

	var htmlJsPrefix = "<script src='"
	var htmlJs = ""
	var htmlJsSuffix = "'></script>"
	
	var linkDelimiter = ""
	
	var templateTitle = ""
	var localeLanguageName = ""
	
// PDF Variables

	var pdfHeaderEvenLeft = ""
	var pdfHeaderOddLeft = ""
	var pdfFooterEvenLeft = ""
	var pdfFooterOddLeft = ""
	
	var pdfHeaderEvenCenter = ""
	var pdfHeaderOddCenter = ""
	var pdfFooterEvenCenter = ""
	var pdfFooterOddCenter = ""

	var pdfHeaderEvenRight = ""
	var pdfHeaderOddRight = ""
	var pdfFooterEvenRight = ""
	var pdfFooterOddRight = ""

	var PDF_BODY_COLUMN_COUNT = 1
	var PDF_BODY_COLUMN_GAP = ""
	
	var pdfPageNbr = 1
	var pdfDateDefaultFormat = "EEEE, MMMM d, yyyy"

 	var PDF_BODY_PAGE_EVEN_HEIGHT = ""
	var PDF_BODY_PAGE_EVEN_WIDTH = ""
	var PDF_BODY_PAGE_EVEN_MARGIN_TOP = ""
	var PDF_BODY_PAGE_EVEN_MARGIN_BOTTOM = ""
	var PDF_BODY_PAGE_EVEN_MARGIN_LEFT = ""
	var PDF_BODY_PAGE_EVEN_MARGIN_RIGHT = ""

	var PDF_BODY_PAGE_ODD_HEIGHT = ""
	var PDF_BODY_PAGE_ODD_WIDTH = ""
	var PDF_BODY_PAGE_ODD_MARGIN_TOP = ""
	var PDF_BODY_PAGE_ODD_MARGIN_BOTTOM = ""
	var PDF_BODY_PAGE_ODD_MARGIN_LEFT = ""
	var PDF_BODY_PAGE_ODD_MARGIN_RIGHT = ""

	var PDF_BODY_FOOTER_ODD_LEFT_WIDTH = ""
	var PDF_BODY_FOOTER_ODD_LEFT_ALIGNMENT = ""
	var PDF_BODY_FOOTER_ODD_CENTER_WIDTH = ""
	var PDF_BODY_FOOTER_ODD_CENTER_ALIGNMENT = ""
	var PDF_BODY_FOOTER_ODD_RIGHT_WIDTH = ""
	var PDF_BODY_FOOTER_ODD_RIGHT_ALIGNMENT = ""
	
	var PDF_BODY_FOOTER_EVEN_LEFT_WIDTH = ""
	var PDF_BODY_FOOTER_EVEN_LEFT_ALIGNMENT = ""
	var PDF_BODY_FOOTER_EVEN_CENTER_WIDTH = ""
	var PDF_BODY_FOOTER_EVEN_CENTER_ALIGNMENT = ""
	var PDF_BODY_FOOTER_EVEN_RIGHT_WIDTH = ""
	var PDF_BODY_FOOTER_EVEN_RIGHT_ALIGNMENT = ""

	var PDF_BODY_HEADER_ODD_LEFT_WIDTH = ""
	var PDF_BODY_HEADER_ODD_LEFT_ALIGNMENT = ""
	var PDF_BODY_HEADER_ODD_CENTER_WIDTH = ""
	var PDF_BODY_HEADER_ODD_CENTER_ALIGNMENT = ""
	var PDF_BODY_HEADER_ODD_RIGHT_WIDTH = ""
	var PDF_BODY_HEADER_ODD_RIGHT_ALIGNMENT = ""
	
	var PDF_BODY_HEADER_EVEN_LEFT_WIDTH = ""
	var PDF_BODY_HEADER_EVEN_LEFT_ALIGNMENT = ""
	var PDF_BODY_HEADER_EVEN_CENTER_WIDTH = ""
	var PDF_BODY_HEADER_EVEN_CENTER_ALIGNMENT = ""
	var PDF_BODY_HEADER_EVEN_RIGHT_WIDTH = ""
	var PDF_BODY_HEADER_EVEN_RIGHT_ALIGNMENT = ""
 	
 	var PDF_STYLESHEET = "";
 
	
	var List<String> outputSegments
	var List<String> fileParts
	var String outputPath
	var String filename = "" 
	var String foFilename = "" 
	var String pdfFilename = "" 
	var String fileroot = ""
	var outputType = 0;
	var v1 = false;
	var v2 = false;
	boolean l1_On = false
	boolean l2_On = false
	boolean inTable = false
	boolean inRoot = true
	boolean displayMode = true
	boolean displayOde = true
	boolean displayMelody = true
	boolean displayText = true
	boolean displayAll = true
	
	boolean generatingDocBook = false
	boolean generatingHtml = false
	boolean generatingFo = false
	boolean generatingEpub = false
			
	var inputFilename = ""
	var outputFilename = ""
	var outlet = "src-gen/"


	/** Role Names */

	val roleLeftCell = "leftCell"
	val roleRightCell = "rightCell"
	val roleVerse = "verse"
	val roleActor = "actor"
	val roleReading = "reading"
	val roleRubric = "rubric"
	val roleHymn = "hymn"
	val roleDialog = "dialog"
	val roleMedia = "media"
	val roleMixed = "mixed"
	
	/** Tag Names */
	val tagTable = "table"
	val tagTableRow = "tr"
	val tagTableCellMono = "tdMono"
	val tagTableCellL1 = "tdL1"
	val tagTableCellL2 = "tdL2"

	/* XML FO Format Variables */
	val foFormatBoldRed = " font-family='Palatino Linotype Bold' font-weight='bold' color='red'"
	val foFormatAlignCenter = " text-align='center'"
	var genMsgSb = new StringBuffer()
	

	/* Output Specific Tags */
/**
 * p - tagName
 * < - lb
 * > - rb
 * <p> - tag
 * </p> tagClose
 * <p class= rbTagRole
 */

	val docLb = "<"
	val htmlLb = "<"
	val foLb = "<fo:"

	var docTaggedTextOpenTagLb = docLb
	var htmlTaggedTextOpenTagLb = htmlLb
	var foTaggedTextOpenTagLb = foLb
		
	val docRb = ">"
	val htmlRb = ">"
	val foRb = ">"

	val docTaggedTextOpenTagRb = docRb
	val htmlTaggedTextOpenTagRb = htmlRb
	val foTaggedTextOpenTagRb = ""
	
	val docClose = "/"
	val htmlClose = "/"
	val foClose = "/"

	val docLbClose = docLb + docClose
	val htmlLbClose = htmlLb + htmlClose
	val foLbClose = "</fo:"
	
	var docTaggedTextCloseTagLb = docLbClose
	var htmlTaggedTextCloseTagLb = htmlLbClose
	var foTaggedTextCloseTagLb = foLbClose

	val docTaggedTextCloseTagRb = docRb
	val htmlTaggedTextCloseTagRb = htmlRb
	val foTaggedTextCloseTagRb = foRb
		
	val docRoleOpen = " role='"
	val htmlRoleOpen = " class='"
	val htmlEditableRoleOpen = " class='editable "
	val foRoleOpen = ""
	
	val docRoleClose = "'>"
	val htmlRoleClose = "'>"
	val foRoleClose = ">"
	
	val docParaTagName = "para"
	val htmlParaTagName = "p"
	val epubParaTagName = "h1"
	val foParaTagName = "block"
	val foParaKeepWithNext = " keep-with-next.within-page='"

	val docParaClose = docLbClose + docParaTagName + docRb
	val htmlParaClose = htmlLbClose + htmlParaTagName + htmlRb
	val foParaClose = foLbClose + foParaTagName + foRb
	val ePubTitleClose = htmlLbClose + epubParaTagName + htmlRb

	val docParaRoleOpen = docLb + docParaTagName + docRoleOpen     // <para role='
	val htmlParaRoleOpen = htmlLb + htmlParaTagName + htmlRoleOpen // <p class='
	val htmlParaEditableRoleOpen = htmlLb + htmlParaTagName + htmlEditableRoleOpen // <p class='
	val ePubParaRoleOpen = htmlLb + epubParaTagName + htmlRoleOpen 
	val foParaRoleOpen = foLb + foParaTagName + foRoleOpen     //
	var foParaRoleOpenKeepWithNext = "" 
	
	val docMediaTagName = "para"
	val htmlMediaTagName = "div"
	val foMediaTagName = "fo:block"

	val docMediaRoleOpen = docLb + docMediaTagName + docRoleOpen     // <para role='
	val htmlMediaRoleOpen = htmlLb + htmlMediaTagName + htmlRoleOpen // <p class='
	val foMediaRoleOpen = foLb + foMediaTagName + foRoleOpen // <p class='

	val docEmphasis = "emphasis"
	val htmlEmphasis = "span"
	val foEmphasis = "inline"
	
	val docEmphasisTypeClose = "'"
	val htmlEmphasisTypeClose = "'"
	val foEmphasisTypeClose = ">"
	
	val docSubTitleTagName = "subtitle"
	val htmlSubTitleTagName = "p"

	val docTitleTagName = "title"
	val htmlTitleTagName = "p"

	val docEntryTagName = "entry"
	val htmlEntryTagName = "td"
	val foEntryTagName = "table-cell"
	
	val docEntryLeftOpen = docLb + docEntryTagName + docRoleOpen + roleLeftCell + docRoleClose
	val htmlEntryLeftOpen = htmlLb + htmlEntryTagName + htmlRoleOpen + roleLeftCell + htmlRoleClose
	var foEntryLeftOpen = "";
	
	val docEntryRightOpen = docLb + docEntryTagName + docRoleOpen + roleRightCell + docRoleClose
	val htmlEntryRightOpen = htmlLb + htmlEntryTagName + htmlRoleOpen + roleRightCell + htmlRoleClose
	var foEntryRightOpen = "";
	
	var foEntryMonoOpen = "";

	// «docEntryClose»
	var docNbsp = "<para role='no-break-space'>&#xA0;&#xA0;&#xA0;</p>" // overridden by setColSpaces
	var htmlLineBreak = "<p class='break'>&#xA0;&#xA0;&#xA0;</p>" 
	var foNonBreakingSpace = "&#xA0;&#xA0;&#xA0;"
	var foLineBreak = "<fo:block linefeed-treatment='preserve' white-space-collapse='false' white-space-treatment='preserve'> </fo:block>"
	var foPageBreak = "<fo:block break-after='page'/>"
	var foPageNumberTag = "<fo:page-number/>"
	
	val docArticleOpen = "<article>"
	val htmlArticleOpen = "<body>"
	val docArticleClose = "</article>"
	val htmlArticleClose = "</body>\n</html>"
	val foArticleClose = "\t\t</fo:flow>\n\t</fo:page-sequence>\n</fo:root>"

	val docTableSetup = ""
	val htmlTableSetup = ""
	val foTableSetup = ""
	
	val docBookTableTagName = "informaltable"
	val htmlTableTagName = "table"
	val htmlTableId = " id='biTable'"
	val foTableTagName = "table"
	
	val htmlDivContent = "<div class='content'>";
	val docTableOpen = docLb + docBookTableTagName + " frame='none' cellpadding='5%'>"
	val htmlTableOpen = htmlLb + htmlTableTagName + htmlTableId + htmlRb
	var foTableOpen = "";

	val docTableClose = docLbClose + docBookTableTagName + docRb
	val htmlTableClose = htmlLbClose + htmlTableTagName + htmlRb
	val foTableClose = foLbClose + foTableTagName + foRb
	
	val docTgroupOpen = "<tgroup cols='2' colsep='1' rowsep='1'>"
	val htmlTgroupOpen = ""
	val foTgroupOpen = ""

	val docColspec1 = "<colspec colname='c1'  colwidth='1*'/>"
	val htmlColspec1 = "<colspec colname='c1'  colwidth='1*'/>"
	val foColspec1 = "<fo:table-column border-right-width='thin' border-right-style='solid'/>"
	
	val docColspec2 = "<colspec colname='c2'  colwidth='1.25*'/>"
	val htmlColspec2 = "<colspec colname='c2'  colwidth='1.25*'/>"
	val foColspec2 = "<fo:table-column />"

	var htmlCommemoration = ""
	
	val docSpanspec = "<spanspec spanname='allcols' namest='c1' nameend='c2'/>"
	val htmlSpanspec = "<spanspec spanname='allcols' namest='c1' nameend='c2'/>"
	val foSpanspec = ""
	
	val docTheadTagName = "thead"
	val htmlTheadTagName = "thead"
	val foTheadTagName = "fo:table-header"
	
	val docTheadOpen = "<thead>"
	val htmlTheadOpen = "<thead>"
	val foTheadOpen = "<fo:table-header>"

	val docTheadEnd = "</thead>"
	val htmlTheadEnd = "</thead>"
	val foTheadEnd = "</fo:table-header>"

	val docTbodyOpen = "<tbody>"
	val htmlTbodyOpen = "<tbody>"
	val foTbodyOpen = "<fo:table-body>"

	val docTbodyEnd = "</tbody>"
	val htmlTbodyEnd = "</tbody>"
	val foTbodyEnd = "</fo:table-body>"

	val docTgroupEnd = "</tgroup>"
	val htmlTgroupEnd = ""
	val foTgroupEnd = ""

	val docTableEnd = "</informaltable>"
	val htmlTableEnd = "</table>"
	val foTableEnd = "</fo:table>"

	val docSectionOpen = "<section role='"
	val htmlSectionOpen = "<div class='"
	val foSectionOpen = "<fo:block"

	val docTagClose = "'>"
	val htmlTagClose = "'>"
	val foTagClose = ""

	val docSectionEnd = "</section>"
	val htmlSectionEnd = "</div>"
	val foSectionEnd = "</fo:block>"

	val docRowTagName = "row"
	val htmlRowTagName = "tr"
	val htmlRowClick = ""
//	val htmlRowClick = " onclick='swapLang(this)'"
	val foRowTagName = "table-row"
	var foKeepRowTogether = " keep-together.within-page='always' "
	
	var foHeaderTextLeft = ""
	var foHeaderTextCenter = ""
	var foHeaderTextRight = ""
	
	var foFooterTextLeft = ""
	var foFooterTextCenter = ""
	var foFooterTextRight = ""

	val docRowOpen = docLb + docRowTagName + docRb
	val htmlRowOpenNoClick = htmlLb + htmlRowTagName + htmlRb
	val htmlRowOpen = htmlLb + htmlRowTagName + htmlRowClick + htmlRb
	val foRowOpen = foLb + foRowTagName + foRb
	var foRowOpenKeepTogether = ""
	
	val docRowClose = docLbClose + docRowTagName + docRb
	val htmlRowClose = htmlLbClose + htmlRowTagName + htmlRb
	val foRowClose = foLbClose + foRowTagName + foRb

	val docEntryClose = docLbClose + docEntryTagName + docRb
	val htmlEntryClose = htmlLbClose + htmlEntryTagName + htmlRb
	val foEntryClose = foLbClose + foEntryTagName + foRb
	
	val docParaRoleActor = docParaRoleOpen + roleActor + docRoleClose
	val htmlParaRoleActor = htmlParaRoleOpen + roleActor + htmlRoleClose
	val foParaRoleActor = foParaRoleOpen + foRoleClose

	val docParaRoleDialog = docParaRoleOpen + roleDialog + docRoleClose
	val htmlParaRoleDialog = htmlParaRoleOpen + roleDialog + htmlRoleClose
	val foParaRoleDialog = foParaRoleOpen + foRoleClose

	val docParaRoleMedia = docMediaRoleOpen + roleMedia + docRoleClose
	val htmlParaRoleMedia = htmlMediaRoleOpen + roleMedia + htmlRoleClose
	val foParaRoleMedia = foMediaRoleOpen + foRoleClose

	val docParaRoleHymn = docParaRoleOpen + roleHymn + docRoleClose
	val htmlParaRoleHymn = htmlParaRoleOpen + roleHymn + htmlRoleClose
	val foParaRoleHymn = foParaRoleOpen + foRoleClose

	val docParaRoleReading = docParaRoleOpen + roleReading + docRoleClose
	val htmlParaRoleReading = htmlParaRoleOpen + roleReading + htmlRoleClose
	val foParaRoleReading = foParaRoleOpen + foRoleClose

	val docParaRoleRubric = docParaRoleOpen + roleRubric + docRoleClose
	val htmlParaRoleRubric = htmlParaRoleOpen + roleRubric + htmlRoleClose
	val foParaRoleRubric = foParaRoleOpen + foRoleClose

	val docParaRoleVerse = docParaRoleOpen + roleVerse + docRoleClose
	val htmlParaRoleVerse = htmlParaRoleOpen + roleVerse + htmlRoleClose
	val foParaRoleVerse = foParaRoleOpen + foRoleClose

	val docSubTitleRoleOpen =  docRoleOpen + docSubTitleTagName + docRoleClose
	val htmlSubTitleRoleOpen = htmlRoleOpen + htmlSubTitleTagName + htmlRoleClose
	val foSubTitleRoleOpen =  foRoleOpen + foRoleClose

	val docSubTitleClose =   docLbClose + docSubTitleTagName + docRb
	val htmlSubTitleClose = htmlLbClose + htmlSubTitleTagName + htmlRb
	val foSubTitleClose =   foLbClose + foRb


	
	/**
	 * Generic Tag variables.  These get set depending on the type of output
	 */

	var taggedTextOpenTagLb = ''
	var taggedTextOpenTagRb = ''
	var taggedTextCloseTagLb = ''
	var taggedTextCloseTagRb = ''
	var blockOpenTagLb = ''
	var blockOpenTagRb = ''
	var blockCloseTagLb = ''
	var blockCloseTagRb = ''
	var CharSequence preface = ''
	var documentOpen = ""
	var documentClose = ""
	var prefaceOpen = ""
	var prefaceClose = ""
	var cssPrefix = ""
	var css = ""
	var cssSuffix = ""
	var emphasis = ""
	var emphasisTypeClose = ""
	var tableOpen = ""
	var tableClose = ""
	var theadOpen = ""
	var theadClose = ""
	var tbodyOpen = ""
	var tbodyClose = ""
	var tgroupOpen = ""
	var colspec1 = ""
	var colspec2 = ""
	var spanspec = ""
	var tgroupClose = ""
	var sectionOpen = ""
	var close = ""
	var sectionClose = ""
	var rowOpen = ""
	var rowClose = ""
	var entryLeftOpen = ""
	var entryRightOpen = ""
	var entryClose = ""
	var roleOpen = ""
	var roleClose = ""
	var paraEntryClose = ""
	var paraRoleOpen = ""
	var paraRoleActor = ""
	var paraRoleDialog = ""
	var paraRoleMedia = ""
	var paraRoleHymn = ""
	var paraRoleReading = ""
	var paraRoleRubric = ""
	var paraRoleVerse = ""
	var paraClose = ""
	var subTitleOpen = ""
	var subTitleClose = ""
	var CharSequence openTableData = ""
	var CharSequence closeTableData = ""
	boolean containsRelativeLookups = false
	boolean isService = false // template name starts with se or has a rid
	boolean isBook = false // template name starts with bk
	boolean isCustom = false // template name starts with cu
	boolean firstRowPrinted = false
	
	var serviceType = ""
	var AtemModel model
	var Driver driver
	
	var titleLinkCount = 0
	
	var generateMessagesHtml = false;
	
	var CharSequence mediaDivV1 = "";
	var CharSequence mediaDivV2 = "";
	
	override void doGenerate(Resource r, IFileSystemAccess fsa) {
		/**
		 * Jan 17, 2014
		 * This class gets held in memory between
		 * calls and the variables above this point are not reinitialized.
		 * If you see strange persistence of values, you might need to reinitialized
		 * them within this method.
		 */
		AlwbLogger.initialize
		AlwbLogger.setLogLevelToEclipsePreference
		logger.entry
		try {
			genMsgSb = new StringBuffer()
			generateMessagesHtml = AlwbGeneralUtils.getMessagesHtmlFlag
			logState(fsa,"Instantiating aresAccessor")

			aresAccessor = new ModelAccessor(r.resourceSet, "ares")
			logState(fsa,"Finished instantiating aresAccessor")
			
			if (! aresAccessor.messageBoard.hasFatalErrors) {
			 /**
			 * Check to see if we are generating from a driver template,
			 * that is, one that has a Generation_Driver object in the template.
			 * If so, find all the templates that match the regular expression
			 * specified in the driver.
			 * 
			 * If we are not generating from a Generation_Driver template,
			 * i.e. we are generating directly from a regular template, we will
			 * add the template resource to our list of resources and just process
			 * the one resource.
			 */
			 var List<Resource> resources = new ArrayList<Resource>() 
			 if (r.allContents.toIterable.filter(typeof(Driver)).length > 0) {
				 try {
					 driver = r.allContents.filter(typeof(Driver)).next
						 resources = aresAccessor.getResourcesByFilter(driver);
				 } catch (Exception e) {
					 resources.add(r)
				 }
			 } else {
				resources.add(r)		 	
			 }

			if (! AlwbGeneralUtils.websiteOnly) {
				
				// At this point we have an array of template resources.  Process each one.
				for (Resource resource : resources) {
					try {

						logState(fsa,"Processing " + resource.URI.toString())

						containsRelativeLookups = (resource.allContents.toIterable.filter(typeof(Lookup)).length > 0)
						resourceUri = resource.URI
						model = resource.allContents.filter(typeof(AtemModel)).next
									 
			
						// Check to see if a date has been set within the template itself.
						// If so, set the Liturgical Date to this rather than using the date
						// found in the user preference.  We do this at this point so the date
						// will appear in the title.
						var Date serviceDate
						try {
							serviceDate = resource.allContents.filter(typeof(Date)).next
							if (serviceDate != null) {
								aresAccessor.setLiturgicalDate(serviceDate)
							}
						} catch (Exception e) {
							// ignore
						}
						theDay = aresAccessor.theDay			
						setTargetsUsingLdp
						ruleProcessor = new RuleProcessor(theDay)
						outputType = aresAccessor.outputType
						outputSegments = resource.URI.segmentsList
						outputPath = outputSegments.subList(3, outputSegments.size - 1).join("/") + "/"
						fileParts = outputSegments.get(outputSegments.size - 1).split("\\.")
						filename = ""
						inTable = false
						firstRowPrinted = false
						
						AlwbGeneralUtils.resultPathsToFiles
			
						for (p : fileParts) {
							if (p.matches(fileParts.last)) {
								filename = "/" + filename.substring(0,filename.length - 1)
							} else {
								filename = filename + p + "."
							}
						}
						
						isService = (filename.startsWith("/se.") && (serviceDate != null)) 
						isBook = filename.startsWith("/bk.") 
						isCustom = filename.startsWith("/cu.") 
						
						setColSpaces
						setAllGenTypesFalse
						readTemplateHead
						
						/**
						 * Determine the Title of the Template.
						 * This is used when creating an HTML index page and
						 * in the title of the HTML file. 
						 */
						 
						if (isService) {
							serviceType = fileParts.get(fileParts.length-2)
							if (aresAccessor.matinsInHolyWeek(serviceType)) {
								if (serviceType == AlwbConstants.MATINS) {
									serviceType = AlwbConstants.EVENING_MATINS
									filename = filename.replaceFirst("\\."+AlwbConstants.MATINS,"\\."+AlwbConstants.EVENING_MATINS)
								}
							}
							if (filename.startsWith("/se.tr")) {
								filename = convertTriodionToServiceName(serviceType)
							}
							templateTitle = aresAccessor.getTextForAbbreviation(
								serviceType,AlwbConstants.TEMPLATE_TITLE_SUFFIX_HTML_TAB)
						} else if (isBook) {
							templateTitle = aresAccessor.getTitleForBookName(fileParts)
						} else if (isCustom) {
							// templateTitle was already set by call to readTemplateHead
						} else {
							templateTitle = aresAccessor.getTextForAbbreviation(
								fileParts.get(0),AlwbConstants.TEMPLATE_TITLE_SUFFIX_HTML_TAB)
						}

						fileroot = filename
						
						if (templateTitle == "" || templateTitle == null) {
							templateTitle = fileroot.replace("/","")
						}
						
						htmlCommemoration = aresAccessor.getVariableCommemorationTextShort						
						localeLanguageName = aresAccessor.versionLocaleNames
			
						// Generate XML FO
						if (aresAccessor.generatePdfFile) {
							logState(fsa,"Generating XML FO - for pdf")
							if (aresAccessor.generatePdfVersion1) {
								aresAccessor.setOutputType(AlwbConstants.PDF, true, false)
								generateFo(resource, fsa)
							}
							if (aresAccessor.generatePdfVersion2) {
								aresAccessor.setOutputType(AlwbConstants.PDF, false, true)
								generateFo(resource, fsa)
							}
							if (aresAccessor.generatePdfVersion1And2) {
								aresAccessor.setOutputType(AlwbConstants.PDF, true, true)
								generateFo(resource, fsa)
							}
						}			
			
						// Generate Html for this template.  Note that in order
						// to generate a delimited file, we must first generate
						// an html file.  
						if (aresAccessor.generateHtmlFile) {
							logState(fsa,"Generating HTML file")			
							if (aresAccessor.generateHtmlVersion1) {
								aresAccessor.setOutputType(AlwbConstants.HTML, true, false)
								generateHtml(resource, fsa)
							}
							if (aresAccessor.generateHtmlVersion2) {
								aresAccessor.setOutputType(AlwbConstants.HTML, false, true)
								generateHtml(resource, fsa)
							}
							if (aresAccessor.generateHtmlVersion1And2) {
								aresAccessor.setOutputType(AlwbConstants.HTML, true, true)
								generateHtml(resource, fsa)
							}
											
						}

						// Generate XHTML (for ePub) for this template
						if (aresAccessor.preferences.genEpubFile) {
							logState(fsa,"Generating ePub file")			
							if (aresAccessor.generateEpubVersion1) {
								aresAccessor.setOutputType(AlwbConstants.HTML, true, false)
								generateXhtml(resource, fsa)
							}
							if (aresAccessor.generateEpubVersion2) {
								aresAccessor.setOutputType(AlwbConstants.HTML, false, true)
								generateXhtml(resource, fsa)
							}
							if (aresAccessor.generateEpubVersion1And2) {
								aresAccessor.setOutputType(AlwbConstants.HTML, true, true)
								generateXhtml(resource, fsa)
							}
											
						}


						// generate a delimited file if user asked for it
						if (aresAccessor.generateDelimitedFile) {
							logState(fsa,"Generating Delimited File")
							fileroot = fileroot.replaceAll("_",".")
							
							var delimitedFile = txtFolderRoot + fileroot + "_" + aresAccessor.language1Id + delimitedTextExtension
							// delimited file 1
//							fsa.generateFile(delimitedFile,aresAccessor.tableManager.lang1ValuesAsPropertyLines)
							fsa.generateFile(delimitedFile,aresAccessor.tableManager.valuesAsJson(1))
							delimitedFile = txtFolderRoot + fileroot + "_" + aresAccessor.language2Id + delimitedTextExtension
							// delimited file 2
							fsa.generateFile(delimitedFile,aresAccessor.tableManager.valuesAsJson(2))
//							fsa.generateFile(delimitedFile,aresAccessor.tableManager.lang2ValuesAsPropertyLines)
							delimitedFile = txtFolderRoot + "resourceMap" + delimitedTextExtension
							// file name map
							fsa.generateFile(delimitedFile,aresAccessor.getFileNameToUriString("~"))
						}
			
					} catch (Exception e) {
						logger.catching(e)
					}
					
				}
				logState(fsa,"Finished Generating...")
			}
			if (resources.size > 0) {
				logState(fsa,"Creating website files")
				generateWebsite(r, fsa)
				logState(fsa,"Finished Creating website files")
			}
				
			} else {
					fsa.generateFile("error.html", preferenceFileError("<p>"+ aresAccessor.messageBoard.getMessages +"</p>"))
					AlwbGeneralUtils.mainHtmlFileToOpen = "error.html"
			}

		} catch (Exception e) {
					// if we get here, it is likely that the preference file was
					// not found
					logger.catching(e)
					fsa.generateFile("error.html", preferenceFileError("<p>"+e.message +"</p><p>" + e.stackTrace.toString()+"</p>"))
					AlwbGeneralUtils.mainHtmlFileToOpen = "error.html"
		}
		logger.exit
	}
	
	/**
	 * logState is used as a type of logger / debugger.  Users can report the contents.
	 * They switch it on and off via pref.generation*.ares, generate.messages.html
	 */
	def void logState(IFileSystemAccess fsa, String message) {
		if (generateMessagesHtml) {
			genMsgSb.append("<p>"+message+"</p>")
			fsa.generateFile("generationMessages.html", preferenceFileError(genMsgSb.toString()))
		}
	}

	def void generateWebsite(Resource resource, IFileSystemAccess fsa) {
		
		if (AlwbGeneralUtils.websiteOnly) {
			setTagsToHtml
			resourceUri = resource.URI
			aresAccessor.setOutputType(AlwbConstants.HTML, false, true)
		}
		// copy the CSS, JS, media files
		var assetsProjectPath = aresAccessor.pathToAssetsProject + "/"
		var mediaProjectPath = aresAccessor.pathToMediaProject + "/"
		var targetDirectory = aresAccessor.containingProject(resourceUri) + "/" + "src-gen"  + "/" + htmlWebSite

		if (AlwbGeneralUtils.copyAssets) {
			if (aresAccessor.copyCss) {
				AlwbGeneralUtils.copyCss(assetsProjectPath + aresAccessor.copyCssFrom,targetDirectory)
			}
			if (aresAccessor.copyJs) {
				AlwbGeneralUtils.copyJs(assetsProjectPath + aresAccessor.copyJsFrom,targetDirectory)
			}
			if (aresAccessor.copyRoot) {
				AlwbGeneralUtils.copyRoot(assetsProjectPath + aresAccessor.copyRootFrom,targetDirectory)
			}
			if (aresAccessor.copyMedia) {
				AlwbGeneralUtils.copyMedia(mediaProjectPath + aresAccessor.copyMediaFrom,targetDirectory)
			}
		}
		
		webSite = new Website(
			resource.URI.segment(1), 
			"src-gen/" + htmlWebSite, AlwbConstants.HTML_FOLDER,
			aresAccessor
		)

		// Compile year/month/day index for the site
		var indexFile = htmlWebSite + "servicesindex.html"
		if (aresAccessor.preferences.genIndexServices) {
			try {
				fsa.generateFile(indexFile, webSite.compileServicesIndex)
			} catch (Exception e) {
				logger.catching(e)
			}
			
			// Compile individual day indexes
			for (year : webSite.services.values) {
				for (month : year.servicesForTheYear.values) {
					for (day : month.servicesForMonth.values) {
						indexFile = htmlWebSite + "indexes/" + day.key + ".html"
						try {
							fsa.generateFile(indexFile, day.compileServiceDayIndex)
						} catch (Exception e) {
							logger.catching(e)
						}
					}
				}
			}
		}
		// Compile json master services index  for the site
		indexFile = htmlWebSite + "servicesindex.json"
		try {
			fsa.generateFile(indexFile, webSite.compileJsonServicesIndex)
		} catch (Exception e) {
			logger.catching(e)
		}

		// Compile booksindex.html for the site
		if (aresAccessor.preferences.genIndexBooks) {
			indexFile = htmlWebSite
				+"booksindex.html"
			fsa.generateFile(indexFile, webSite.compileBooksFileIndex)
		}

		// Compile customindex.html for the site
		if (aresAccessor.preferences.genIndexCustom) {
			indexFile = htmlWebSite
				+"customindex.html"
			fsa.generateFile(indexFile, webSite.compileCustomFileIndex)
		}			
					
		AlwbGeneralUtils.mainHtmlFileToOpen = htmlWebSite + indexHtml
	}	
	
	def convertTriodionToServiceName(String filetype) {
		var result = "se" + theDay.dayAsFilename + "." + filetype
		return result
	}
	
	def setLanguageVariables() {
		aresAccessor.restoreLocales
		v1 = aresAccessor.useLanguage1
		v2 = aresAccessor.useLanguage2
		l1_On = v1
		l2_On = v2
		localeLanguageName = aresAccessor.versionLocaleNames
	}
	
	def generateFo(Resource resource, IFileSystemAccess fsa) {
		setLanguageVariables
		inTable = false
		readTemplateHead
		setTagsToFo
											
		if (serviceType != "") {
			serviceType = "/" + serviceType
		}
		aresAccessor.setIncludeMediaLinks(false)
			
	    var subFolderRoot = ""

	    	var pdfFileRoot = aresAccessor.pdfFileRoot(fileroot.replace("/",""))

		if (isService) {
			subFolderRoot = htmlServiceFolderRoot
			outputPath = aresAccessor.convertToServicePath(fileroot)
		} else if (isBook) {
				subFolderRoot = htmlBookFolderRoot
				outputPath = 
					aresAccessor.convertToBookPath(fileroot)
	 	} else if (isCustom) {
			subFolderRoot = htmlCustomFolderRoot
			outputPath = 
				aresAccessor.convertToCustomPath(fileroot)
		} else if (containsRelativeLookups) {
			subFolderRoot = htmlServiceFolderRoot
			outputPath = outputSegments.subList(4, outputSegments.size - 1).join("/")
		} else {
			subFolderRoot = htmlCustomFolderRoot
			outputPath = aresAccessor.convertToCustomPath(fileroot)
		}
	    var foFileNamePrefix = htmlWebSite 
			+  htmlWebSiteFileTypePdf
			+ subFolderRoot 
			+ outputPath 
			+ aresAccessor.folderLanguageAcronym
			+"/"
	    	    
		foFilename = foFileNamePrefix + pdfFileRoot + "." + foExtension
		foFilename = foFilename.toLowerCase // normalize all html folders and filenames to be lowercase
			
		theRelativePath = relativePath(htmlWebSite,foFilename)
		setFoComponents
		AlwbGeneralUtils.pdfFileToOpen = foFilename;
		for (e : resource.allContents.toIterable.filter(typeof(AtemModel))) {
			fsa.generateFile(foFilename, e.compile(true, false))
		}
		// generate the index.html that will return the pdf file if the user browses to the directory
		pdfFilename = foFileNamePrefix + indexHtml
		pdfFilename = pdfFilename.toLowerCase // normalize all html folders and filenames to be lowercase

		fsa.generateFile(pdfFilename,pdfIndexHtmlContents(pdfFileRoot + "." + pdfExtension))
		aresAccessor.setIncludeMediaLinks()

	}
	
	def readTemplateHead() {
		// Read template global properties such as titles, headers, footers			
		resetHeaders
		if (model.dsl_Template_head != null) {
			model.dsl_Template_head.compile
		}
	}
	
	def preferenceFileError(String messages)'''
	<html>
	<body>
	<h1>Generation Messages</h1>
	<p>«messages»</p>
	</body>
	</html>
	'''

	def generateHtml(Resource resource, IFileSystemAccess fsa) {
			
			setLanguageVariables
			setTagsToHtml
			inTable = false
						
		    var subFolderRoot = htmlBookFolderRoot
		    		
			if (isService) {
				subFolderRoot = htmlServiceFolderRoot
				outputPath = 
					aresAccessor.convertToServicePath(fileroot) 
					+ aresAccessor.folderLanguageAcronym
		 	} else if (isBook) {
				subFolderRoot = htmlBookFolderRoot
				outputPath = 
					aresAccessor.convertToBookPath(fileroot)
					+ aresAccessor.folderLanguageAcronym
		 	} else if (isCustom) {
				subFolderRoot = htmlCustomFolderRoot
				outputPath = 
					aresAccessor.convertToCustomPath(fileroot)
					+ aresAccessor.folderLanguageAcronym
			} else if (containsRelativeLookups) {
				subFolderRoot = htmlServiceFolderRoot
				outputPath = 
					outputSegments.subList(4, outputSegments.size - 1).join("/") 
					+ "/"
					+ aresAccessor.folderLanguageAcronym
			} else {
				outputPath = 
					aresAccessor.convertToCustomPath(fileroot)
					+ aresAccessor.folderLanguageAcronym
			}

			filename = 
				htmlWebSite 
				+ htmlWebSiteFileTypeHtml 
				+ subFolderRoot 
				+ outputPath 
				+ "/"
				+ indexHtml

			filename = filename.toLowerCase // normalize all html folders and filenames to be lowercase
			theRelativePath = relativePath(htmlWebSite,filename)
			
			combinedPdfHref = "m/s/" 
			    + outputPath 
			    + "/"
				+ outputPath.replaceAll("/",".")
				+ ".combined.pdf" 				
			
			AlwbGeneralUtils.htmlFileToOpen = filename;
			setHtmlComponents
			
			// generate the HTML file
			for (e : resource.allContents.toIterable.filter(typeof(AtemModel))) {
				fsa.generateFile(filename, e.compile(true, false))
			}
	
	}
	
	def generateXhtml(Resource resource, IFileSystemAccess fsa) {
			
			setLanguageVariables
			setTagsToXhtml
			inTable = false
						
		    var subFolderRoot = htmlBookFolderRoot
		    		
			if (isService) {
				subFolderRoot = htmlServiceFolderRoot
				outputPath = 
					aresAccessor.convertToServicePath(fileroot) 
					+ aresAccessor.folderLanguageAcronym
			} else if (containsRelativeLookups) {
				subFolderRoot = htmlServiceFolderRoot
				outputPath = 
					outputSegments.subList(4, outputSegments.size - 1).join("/") 
					+ "/"
					+ aresAccessor.folderLanguageAcronym
			} else {
				outputPath = 
					aresAccessor.convertToBookPath(fileroot)
					+ aresAccessor.folderLanguageAcronym
			}

			filename = 
				htmlWebSite 
				+ htmlWebSiteFileTypeEpub 
				+ subFolderRoot 
				+ outputPath 
				+ "/"
				+ indexHtml

			filename = filename.toLowerCase // normalize all html folders and filenames to be lowercase
			theRelativePath = relativePath(htmlWebSite,filename)
			
			combinedPdfHref = "m/s/" 
			    + outputPath 
			    + "/"
				+ outputPath.replaceAll("/",".")
				+ ".combined.pdf" 				
			
			AlwbGeneralUtils.htmlFileToOpen = filename;
			setXhtmlComponents
			
			// generate the HTML file
			for (e : resource.allContents.toIterable.filter(typeof(AtemModel))) {
				fsa.generateFile(filename, e.compile(true, false))
			}
	
	}

	/**
	 * Generate the index.html for the website
	 */
	def indexHtmlPage(String contents) '''
	«setPrefaceForHtml(false,false)»
	«documentOpen»
		«contents»
	«documentClose»
	'''

	/**
	 * Contains the meta declarations, CSS imports (links), and Javascripts
	 * for the HTML head tag
	 * 
	 * Note: it seems to work best NOT to specify an initial-scale and not to
	 * set user-scalable properties.  By default it will be user scalable.
	 * If you deliberately set it, the result is not optimal for a phone.
	 */
	def htmlMetaLinksScripts() 
	'''
		<!-- Meta Declarations -->
		<meta charset="utf-8"/> 
		<meta name="viewport" content="width=device-width"/>		
		<!-- Stylesheets -->
        <link href="css/font-awesome/css/font-awesome.css" rel="stylesheet"/>
		<link rel='stylesheet' type='text/css' href='js/lib/bootstrap/css/bootstrap.css'/>
		<link type="text/css" rel="stylesheet" href="css/jquery.dropdown.css" />
		<link rel='stylesheet' type='text/css' href='css/alwb.css'/>

		<!-- Scripts -->
		<script data-main="js/app" src="js/lib/require.js"></script>
		
		<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
			<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
			<!--[if lt IE 9]>
				<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
			    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
			<![endif]-->
	'''

	/**
	 * Compile a site booksindex.html file, that lists all files generated from
	 * a template that starts with bk.
	 */
	def compileBooksFileIndex(Website site)'''
	<!DOCTYPE html>
	<html>
		<head>
		«htmlMetaLinksScripts»
		</head>
		<body>
			«navBar(false,false,false)»
			<div class='index-content'>
			<h1 class='index-title'>«aresAccessor.getTextForAbbreviation('index.books.','title')»</h1>
			«FOR d : aresAccessor.getIndexDescriptions("index.books.").entrySet»
			<p class='«d.key»'>«d.value»</p>
			«ENDFOR»
				<table class="books-index-table">
					<tbody>
						«FOR f : site.getBookFiles»
						<tr>
							«f.compileBooks»
						</tr>
						«ENDFOR»
					</tbody>
				</table>
			</div>
</body>
</html>
	'''

	/**
	 * Compile a site booksindex.html file, that lists all files generated from
	 * a template that starts with cu.  Cu means custom or customer
	 */
	def compileCustomFileIndex(Website site)'''
	<!DOCTYPE html>
	<html>
		<head>
		«htmlMetaLinksScripts»
		</head>
		<body>
			«navBar(false,false,false)»
			<div class='index-content'>
			<h1 class='index-title'>«aresAccessor.getTextForAbbreviation('index.custom.','title')»</h1>
			«FOR d : aresAccessor.getIndexDescriptions("index.custom.").entrySet»
			<p class='«d.key»'>«d.value»</p>
			«ENDFOR»
				<table class="custom-index-table">
					<tbody>
						«FOR f : site.getCustomFiles»
						<tr>
							«f.compileCustom»
						</tr>
						«ENDFOR»
					</tbody>
				</table>
			</div>
</body>
</html>
	'''
			
	def compile(ServiceDayType s) '''
	<div class="panel-group" id="accordion-«s.key»">
	«FOR d : s.servicesTypesForDate.entrySet»
	<div class="panel panel-default">
		<div class="panel-heading">
			<h4 class="panel-title">
				<a data-toggle="collapse" data-parent="#accordion-«s.key»-months" href="#collapse-«d.value.key»">
					«d.value.languages»
				</a>
			</h4>
		</div>
	</div>
	<div class="panel-collapse collapse in" id="collapse-«d.value.key»" >
		<div class="panel-body">
			«d.value.compile»
		</div>
	</div>
	«ENDFOR»
	</div> 
	'''
	
	def compile(ServiceDayTypeVersion s)'''
				<div class="btn-group-vertical">«FOR d : s.servicesForDate.entrySet»«d.value.compile»«IF d.value.hasCombinedPdfHref»«d.value.compileCombinedPdfHref»«ENDIF»«ENDFOR»</div> 
	'''
	
	
	def compileServicesIndex(Website site)
	'''
	<!DOCTYPE html>
	<html>
		<head>
		«htmlMetaLinksScripts»
		</head>
		<body>
			«navBar(false, false,false)»
			<div class='index-content'>
			<h1 class='index-title'>«aresAccessor.getTextForAbbreviation('index.','title')»</h1>
			«FOR d : aresAccessor.getIndexDescriptions("index.").entrySet»
			<p class='«d.key»'>«d.value»</p>
			«ENDFOR»
			<table class="services-index-table">
				«FOR y : site.services.entrySet»
					«y.value.compile»
				«ENDFOR»
			</table>
			</div>
		</body>
	</html>
	'''

	def compile(ServiceYear year)'''«FOR m : year.servicesForTheYear.entrySet»«m.value.compile»«ENDFOR»'''
	
	def compile(ServiceMonth month)'''
	<tr class='index-month-tr'><td class='index-month-td'><span class='index-month'>«month.monthName» «month.year»</span></td></tr>
	«FOR d : month.servicesForMonth.entrySet»«d.value.compile»«ENDFOR» 
	'''
	
	def compile(ServiceDay day)'''
	<tr class='index-day-tr'><td class='index-day-td'><a class='index-day-link' href='indexes/«day.key».html'>«day.formattedDayNoYear»</a></td></tr>
	'''

	def compileServiceDayIndex(ServiceDay day)
	'''
	<!DOCTYPE html>
	<html>
		<head>
		<base href='../'/>
		«htmlMetaLinksScripts»
		</head>
		<body>
			«navBar(false, false,false)»
			<div class='index-content'>
			<h1 class='index-title'>«aresAccessor.getTextForAbbreviation('index.','day.title')»</h1>
			<h1 class='index-title-date'>«aresAccessor.getTextForAbbreviation('index.','day.title2.date.prefix')»«day.liturgicalDayProperties.getDisplayDate(aresAccessor.getTextForAbbreviation('index.','day.date.format'))»«aresAccessor.getTextForAbbreviation('index.','day.title2.date.suffix')»</h1>
			«FOR d : aresAccessor.getIndexDescriptions("index.day.").entrySet»
			<p class='«d.key»'>«d.value»</p>
			«ENDFOR»
			<table>
				«FOR service : day.servicesOrdered»
					«service.compileServiceDayTypeIndex»
				«ENDFOR»
			</table>
			</div>
		</body>
	</html>
	'''
	def compileServiceDayTypeIndex(ServiceDayType s) '''
		<tr class='index-service-day-tr'><td colspan='3' class='index-service-day-td'><span class='index-service-day'>«s.title»</span>«IF (s.commemoration.length > 0)»<span class='index-delimiter'>«aresAccessor.preferences.htmlLinkDelimiter»</span><span class='index-commemoration'>«s.commemoration»</span>«ENDIF»</td></tr>
		«FOR d : s.servicesTypesForDate.entrySet»«d.value.compileServiceDayTypeVersionIndex»«ENDFOR»
	'''
	
	def compileServiceDayTypeVersionIndex(ServiceDayTypeVersion s)'''
		«FOR d : s.servicesForDate.entrySet»
			<tr class='index-service-language-tr'><td class='index-service-language-td'><span class='index-language'>«s.languages»</span></td>«d.value.compileServiceDayIndexFileAnchor»</tr>
			«IF d.value.hasCombinedPdfHref»<tr class='index-service-tr'><td class='index-service-td'><span class='index-language'>«s.languages»</span></td>«d.value.compileServiceDayCombinedPdfAnchor»</tr>«ENDIF»«ENDFOR» 
	'''

	def compileServiceDayIndexFileAnchor(ServiceDayTypeVersionFormat file) '''<td class='index-file-link-td'><a class='index-file-link' href="«file.getRelativePath»" target="«aresAccessor.getTargetForFileType(file.fileType)»">«aresAccessor.getLocaleNameForFileType(file.fileType)»</a></td><td class='index-file-timestamp-td'>«aresAccessor.getTimestamp(file)»</td>'''
	
	def compileServiceDayCombinedPdfAnchor(ServiceDayTypeVersionFormat file) '''<td class='index-file-link-td'><a class='index-file-link' href="«file.combinedPdfHref»" target="«aresAccessor.getTargetForFileType("p")»">«aresAccessor.getLocaleNameForFileType("c")»</a></td><td class='index-file-timestamp-td'>«aresAccessor.getTimestamp(file)»</td>'''
	
	def void compile(SetLocale s) {
		aresAccessor.setLocales(s.dsl_SetLocale_V1, s.dsl_SetLocale_V2)
	}
	
	def void compile(RestoreLocale r) {
		aresAccessor.restoreLocales	
	}
	
	def compile(Date d){
		aresAccessor.setLiturgicalDate(d)
	}
	
	def void resetHeaders() {

		pdfHeaderOddLeft = foNonBreakingSpace
		pdfHeaderOddCenter = foNonBreakingSpace
		pdfHeaderOddRight = foNonBreakingSpace

		pdfFooterOddLeft = foNonBreakingSpace
		pdfFooterOddCenter = foNonBreakingSpace
		pdfFooterOddRight = foNonBreakingSpace

		pdfHeaderEvenLeft = foNonBreakingSpace
		pdfHeaderEvenCenter = foNonBreakingSpace
		pdfHeaderEvenRight = foNonBreakingSpace

		pdfFooterEvenLeft = foNonBreakingSpace		
		pdfFooterEvenCenter = foNonBreakingSpace
		pdfFooterEvenRight = foNonBreakingSpace

		pdfPageNbr = 1
		pdfDateDefaultFormat = "EEEE, MMMM d, yyyy"
		htmlCommemoration = aresAccessor.getVariableCommemorationTextShort
		
		foParaRoleOpenKeepWithNext = 
			foLb 
			+ foParaTagName 
			+ foRoleOpen 
			+ foParaKeepWithNext
			+  "always'"
		
	}
	
	def void compile(Head h) {

		
		for (c: h.dsl_Head_components) {
			switch c {
				Commemoration: {
					htmlCommemoration = c.dsl_Commemoration_Elements.compileHeaderFooterFragments
				}
				Date: {
					c.compile
				}
				PageHeaderEven: {
					c.dsl_PageHeader_columns.compileHeaderColumnsEven
				}
				PageHeaderOdd: {
					c.dsl_PageHeader_columns.compileHeaderColumnsOdd
				}
				PageFooterEven: {
					c.dsl_PageHeader_columns.compileFooterColumnsEven
				}
				PageFooterOdd: {
					c.dsl_PageHeader_columns.compileFooterColumnsOdd
				}
				PageKeepWithNext: {
					foParaRoleOpenKeepWithNext =     
						foLb 
						+ foParaTagName 
						+ foRoleOpen 
						+ foParaKeepWithNext
						+  c.dsl_PageKeepWithNext_value
						+ "'"
				}
				PageNumber: {
					pdfPageNbr = c.dsl_PageNumber_value
				}
				TemplateTitle: {
					templateTitle = c.dsl_TemplateTitle_Elements.compileHeaderFooterFragments
				}
			}
		}
	}
	
	def compileHeaderColumnsEven(EList<HeaderFooterColumn> l) {
		
		for (c:l) {
			switch c {
				HeaderFooterColumnLeft: {
					pdfHeaderEvenLeft = c.dsl_HeaderFooterColumn_fragments.compileHeaderFooterFragments
				}
				HeaderFooterColumnCenter: {
					pdfHeaderEvenCenter = c.dsl_HeaderFooterColumn_fragments.compileHeaderFooterFragments
				}
				HeaderFooterColumnRight: {
					pdfHeaderEvenRight = c.dsl_HeaderFooterColumn_fragments.compileHeaderFooterFragments
				}
			}
		}
	}
	
	def compileHeaderColumnsOdd(EList<HeaderFooterColumn> l) {
		
		for (c:l) {
			switch c {
				HeaderFooterColumnLeft: {
					pdfHeaderOddLeft = c.dsl_HeaderFooterColumn_fragments.compileHeaderFooterFragments
				}
				HeaderFooterColumnCenter: {
					pdfHeaderOddCenter = c.dsl_HeaderFooterColumn_fragments.compileHeaderFooterFragments
				}
				HeaderFooterColumnRight: {
					pdfHeaderOddRight = c.dsl_HeaderFooterColumn_fragments.compileHeaderFooterFragments
				}
			}
		}
	}


	def compileFooterColumnsEven(EList<HeaderFooterColumn> l) {

		for (c:l) {
			switch c {
				HeaderFooterColumnLeft: {
					pdfFooterEvenLeft = c.dsl_HeaderFooterColumn_fragments.compileHeaderFooterFragments
				}
				HeaderFooterColumnCenter: {
					pdfFooterEvenCenter = c.dsl_HeaderFooterColumn_fragments.compileHeaderFooterFragments
				}
				HeaderFooterColumnRight: {
					pdfFooterEvenRight = c.dsl_HeaderFooterColumn_fragments.compileHeaderFooterFragments
				}
			}
		}
	}
	
	def compileFooterColumnsOdd(EList<HeaderFooterColumn> l) {
		for (c:l) {
			switch c {
				HeaderFooterColumnLeft: {
					pdfFooterOddLeft = c.dsl_HeaderFooterColumn_fragments.compileHeaderFooterFragments
				}
				HeaderFooterColumnCenter: {
					pdfFooterOddCenter = c.dsl_HeaderFooterColumn_fragments.compileHeaderFooterFragments
				}
				HeaderFooterColumnRight: {
					pdfFooterOddRight = c.dsl_HeaderFooterColumn_fragments.compileHeaderFooterFragments
				}
			}
		}
	}


	def compileHeaderFooterFragments (EList<HeaderFooterFragment> l) {
		var result = ""
		var pdfDateFormat = pdfDateDefaultFormat
		for (f:l) {
			try {
			switch f {
				HeaderFooterText: {
					result = result + f.dsl_HeaderFooterText
				}
				HeaderFooterTitle: {
					result = result + templateTitle
				}
				HeaderFooterCommemoration: {
					result = result + aresAccessor.getVariableCommemorationTextShort
				}
				HeaderFooterDate: {
					if (aresAccessor.useLanguage1 && aresAccessor.useLanguage2) {
						if (f.dsl_HeaderFooterDate_Language != null) {
							if (f.dsl_HeaderFooterDate_Language.value == 0) {
								result = result + theDay.getDisplayDateForLocale(
									aresAccessor.preferences.dateLocaleLanguageV1,
									aresAccessor.preferences.dateLocaleCountryV1,
									aresAccessor.preferences.dateFormatV1
								)
							} else {
								result = result + theDay.getDisplayDateForLocale(
									aresAccessor.preferences.dateLocaleLanguageV2,
									aresAccessor.preferences.dateLocaleCountryV2,
									aresAccessor.preferences.dateFormatV2
								)
							}
						} else {
							result = result + theDay.getDisplayDate("EEEE, MMMM d, yyyy")
						}
					} else if (aresAccessor.useLanguage1) {
						result = result + theDay.getDisplayDateForLocale(
							aresAccessor.preferences.dateLocaleLanguageV1,
							aresAccessor.preferences.dateLocaleCountryV1,
							aresAccessor.preferences.dateFormatV1
							)
					} else {
						result = result + theDay.getDisplayDateForLocale(
							aresAccessor.preferences.dateLocaleLanguageV2,
							aresAccessor.preferences.dateLocaleCountryV2,
							aresAccessor.preferences.dateFormatV2
							)
					}
				}
				HeaderFooterPageNumber: {
					result = result + foPageNumberTag
				}
				HeaderFooterLookup: {
					if (aresAccessor.useLanguage1 && aresAccessor.useLanguage2) {
						if (f.dsl_HeaderFooterLookup_Language.value == 0) {
							result = result + f.dsl_HeaderFooterLookup_Elements.compile.toString
						} else {
							result = result + f.dsl_HeaderFooterLookup_Elements.compileV2.toString
						}
					} else if (aresAccessor.useLanguage1) {
						result = result + f.dsl_HeaderFooterLookup_Elements.compile.toString
					} else {
						result = result + f.dsl_HeaderFooterLookup_Elements.compileV2.toString
					}
				}
			}
				
			} catch (Exception e) {
				logger.catching(e)
			}
		}
		(result)
	}

	/**
	 * Compile ServiceDayTypeVersionFormat for a Book index
	 */
	def compileBooks(ServiceDayTypeVersionFormat file) 
	'''
		<td class='index-books-language-td'>
			<span class='index-books-language'>«file.serviceLanguages»</span>
		</td>
		<td class='index-books-file-link-td'>
			<a class='index-books-file-link' href="«file.getRelativePath»" target="«aresAccessor.getTargetForFileType(file.fileType)»">«file.getTitle(file.fileTitle)»</a>
		</td>
		<td class='index-books-file-type-td'>
			«aresAccessor.getLocaleNameForFileType(file.fileType)»
		</td>
		<td class='index-books-file-timestamp-td'>
			«aresAccessor.getTimestamp(file)»
		</td>
	'''

	/**
	 * Compile ServiceDayTypeVersionFormat for a Custom index
	 */
	def compileCustom(ServiceDayTypeVersionFormat file) 
	'''
		<td class='index-custom-language-td'>
			<span class='index-custom-language'>«file.serviceLanguages»</span>
		</td>
		<td class='index-custom-file-link-td'>
			<a class='index-custom-file-link' href="«file.getRelativePath»" target="«aresAccessor.getTargetForFileType(file.fileType)»">«file.fileTitle»</a>
		</td>
		<td class='index-custom-file-type-td'>
			«aresAccessor.getLocaleNameForFileType(file.fileType)»
		</td>
		<td class='index-custom-file-timestamp-td'>
			«aresAccessor.getTimestamp(file)»
		</td>
	'''

	def compile(ServiceDayTypeVersionFormat file) '''<a class='IndexLink btn btn-default' href="«file.getRelativePath»" target="«aresAccessor.getTargetForFileType(file.fileType)»">«aresAccessor.getLocaleNameForFileType(file.fileType)» «aresAccessor.getTimestamp(file)»</a>'''
	
	def compileCombinedPdfHref(ServiceDayTypeVersionFormat file) '''<a class='IndexLink btn btn-default' href="«file.combinedPdfHref»" target="«aresAccessor.getTargetForFileType("p")»">«aresAccessor.getLocaleNameForFileType("c")» «aresAccessor.getTimestamp(file)»</a>'''


	/**
	 * Compile a site index.json file, that lists all available services
	 */
	def compileJsonServicesIndex(Website site)
	'''
	{ 
		"index-title": "«aresAccessor.getTextForAbbreviation('index.','title')»",
		"index-descriptors":
			[
				«FOR d : aresAccessor.getIndexDescriptions("index.").entrySet»
				{ 
					"«d.key»": "«d.value»"
				}«IF (! aresAccessor.getIndexDescriptions("index.").entrySet.last.key.matches(d.key))»,«ENDIF»
				«ENDFOR»
			],
		"years":
			[
				«FOR y : site.services.entrySet»
						{
							"«y.key»": 
								[
									«y.value.compileJsonIndex»
								]
						}«IF (! site.services.entrySet.last.key.matches(y.key))»,«ENDIF»
				«ENDFOR»
			]
	}
	'''
	def compileJsonIndex(ServiceYear year)
	'''
					«FOR m : year.servicesForTheYear.entrySet»
					{
					"«m.value.monthName»":
						[
							«m.value.compileJsonIndex»
						] 
					}«IF (! year.servicesForTheYear.entrySet.last.key.matches(m.key))»,«ENDIF»
					«ENDFOR»
	'''
	
	def compileJsonIndex(ServiceMonth month)'''
					«FOR d : month.servicesForMonth.entrySet»
						{
						"«d.value.formattedDayNoYear»":
							[
									«d.value.compileJsonIndex»
							]
						}«IF (! month.servicesForMonth.entrySet.last.key.matches(d.key))»,«ENDIF»
					«ENDFOR»
	'''
	
	def compileJsonIndex(ServiceDay day)'''
							«FOR s : day.servicesOrdered»
								{
								"«s.title»«IF (s.commemoration.length > 0)»«aresAccessor.preferences.htmlLinkDelimiter»«s.commemoration»«ENDIF»":
									[
										«s.compileJsonIndex»
									]
								}«IF (day.servicesOrdered.last.key != s.key)»,«ENDIF»
							«ENDFOR»
	'''
	
	def compileJsonIndex(ServiceDayType s) '''
			«FOR d : s.servicesTypesForDate.entrySet»
				{
				"«d.value.languages»":
					[ 
						«d.value.compileJsonIndex»
					]
				}«IF (s.servicesTypesForDate.entrySet.last.key != d.key)»,«ENDIF»
			«ENDFOR»
	'''
	def compileJsonIndex(ServiceDayTypeVersion s)'''
						«FOR d : s.servicesForDate.entrySet»
							{
							«d.value.compileJsonIndex»
							}«IF (s.servicesForDate.entrySet.last.key != d.key)»,«ENDIF»
							«IF d.value.hasCombinedPdfHref»
							{
								«d.value.compileJsonIndexCombinedPdfHref»
							}«IF (s.servicesForDate.entrySet.last.key != d.key)»,«ENDIF»
							«ENDIF»
						«ENDFOR» 
	'''

	def compileJsonIndex(ServiceDayTypeVersionFormat file) '''
			"href": "«file.getJsonRelativePath»", 
			"type": "«aresAccessor.getLocaleNameForFileType(file.fileType)»"
 	'''

	def compileJsonIndexCombinedPdfHref(ServiceDayTypeVersionFormat file) '''
			"href": "«file.combinedPdfHref»",
			"type": "«aresAccessor.getLocaleNameForFileType("c")»"
  '''




	def void setTargetsUsingLdp() {
		targetDayOfWeek = theDay.getIntDayOfWeek
		targetMonth = theDay.getIntMonth - 1 // so we can use with enum ordinals, which start at 0
		targetDay = theDay.getIntDayOfMonth
		targetMode = theDay.getModeOfWeek
		targetTriodion = theDay.triodion
		targetPentecostarion = theDay.pentecostarion
		targetPascha = theDay.pascha
		targetSundaysBeforeStartOfTriodion = theDay.numberOfSundaysBeforeStartOfTriodion
	}
	
	def compile(PassThroughHtml text) '''
	«IF aresAccessor.outputType != AlwbConstants.PDF»
	«text.dsl_Passthrough_html_text»
	«ENDIF»
	'''

	def compile(PassThroughPdf text) '''
	«IF aresAccessor.outputType == AlwbConstants.PDF»
	«text.dsl_Passthrough_pdf_text»
	«ENDIF»
	'''


	def setColSpaces() {
		docNbsp = paraRoleOpen + "col-space" + roleClose;
		var i = aresAccessor.nbrColSpaces
		while (i > 0) {
			docNbsp = docNbsp + "&#xA0;"
			i = i - 1;
		}
		docNbsp = docNbsp + "«paraClose»"
	}
	
	def compile(AtemModel m, boolean root, boolean intable) '''
		«switchRoot(root)»
		«IF inRoot»
				«preface»
				«m.dsl_Template_preface?.compile»
				«documentOpen»
				«IF (generatingHtml && (!generatingEpub))»
				«navBar(true,true,true)»
				«htmlDivContent»
				«ENDIF»
		«ENDIF»
		«openTable»
		«compileComponents(m.dsl_Template_components)»
		«IF (inRoot)»
		«closeTable»
		«ENDIF»
		«IF inRoot»
			«IF (generatingHtml && (!generatingEpub))»
				</div>
			«ENDIF»
			«documentClose»
			«toggleTable(true)»
		«ENDIF»
	'''
	
 
 	/**
 	 * Note: the dropdown menus use jquery.dropdown.js and jquery.dropdown.css.
 	 * This comes from http://labs.abeautifulsite.net/jquery-dropdown/
 	 * The source uses class names that say "dropdown".  I have renamed them to
 	 * "jqm-dropdown" because the names conflict with Bootstrap and it breaks the 
 	 * jquery.menu.  So, if the jquery-dropdown files are ever updated, it will be
 	 * necessary to edit the js and css to use jqm-dropdown as the names.
 	 */
	def navBar(boolean includeFontMenu, boolean includeBilingualMenu, boolean includeDayNight) 
	'''
	<div class='agesMenu'>
		<!-- Menu Bar Icons-->
		<a href="#" data-jqm-dropdown="#jqm-dropdown-pages" title="Go to..."><i class="fa fa-bars ages-menu-link"></i></a>
		«IF (includeFontMenu)»
        <a href="#" class="increaseFont"><i class="fa fa-plus-square increaseFont ages-menu-link ages-font-resizer"></i></a>
        <a href="#" class="decreaseFont"><i class="fa fa-minus-square decreaseFont ages-menu-link ages-font-resizer"></i></a>
		«ENDIF»
		«IF (v1 && l1_On && v2 && l2_On && includeBilingualMenu)»
		<a href="javascript:(hideAllRight());"><i class="fa fa-caret-square-o-left ages-menu-link ages-col-picker"></i></a>
		<a href="javascript:(showAll());"><i class="fa fa-columns ages-menu-link ages-col-picker"></i></a>
		<a href="javascript:(hideAllLeft());"><i class="fa fa-caret-square-o-right ages-menu-link ages-col-picker"></i></a>
		«ENDIF»
		«IF (includeDayNight)»
        <a href="#" class="dayMode"><i class="fa fa-sun-o dayMode ages-menu-link"></i></a>
        <a href="#" class="nightMode"><i class="fa fa-moon-o nightMode ages-menu-link"></i></a>
		<span id="clockbox" class="clockbox"></span>
		«ENDIF»
		
		<!-- Dropdown Menu Contents -->
		<div id="jqm-dropdown-pages" class="jqm-dropdown jqm-dropdown-tip">
		    <ul class="jqm-dropdown-menu jqm-dropdown-relative">
				<li><a href="servicesindex.html"><i class="fa fa-calendar">&nbsp;Services</i></a></li>
			    <li><a href="booksindex.html"><i class="fa fa-arrows">&nbsp;Sacraments</i></a></li>
			    <li><a href="customindex.html"><i class="fa fa-list-alt">&nbsp;Additional</i></a></li>
				<li class="jqm-dropdown-divider"></li>
			    <li><a href="about.html"><i class="fa fa-info-circle">&nbsp;About</i></a></li>
			    <li><a href="contact.html"><i class="fa fa-envelope">&nbsp;Contact</i></a></li>
			    <li><a href="donate.html"><i class="fa fa-money">&nbsp;Donate</i></a></li>
				<li class="jqm-dropdown-divider"></li>
			    <li><a href="javascript:(showInfo())"><i class="fa fa-laptop">&nbsp;Browser Information</i></a></li>
				<li class="jqm-dropdown-divider"></li>
			    <li><a href="help.html"><i class="fa fa-question-circle">&nbsp;Help</i></a></li>
		 	</ul>
		</div>
	</div>
	'''

	def compileComponents(EList<AbstractComponent> list) '''
		«FOR c : list»
			«switch c {
				Actor: {
					(c as Actor).compile
				}
				Block: {
					(c as Block).compile(true)
				}
				Break: {
					(c as Break).compile()
				}
				VersionSwitch: {
					(c as VersionSwitch).compile;
				}
				Dialog: {
					(c as Dialog).compile
				}
				Heading1: {
					(c as Heading1).compile
				}
				Heading2: {
					(c as Heading2).compile
				}
				Heading3: {
					(c as Heading3).compile
				}
				Hymn: {
					(c as Hymn).compile
				}
				Media: {
					(c as Media).compile
				}
				Paragraph: {
					(c as Paragraph).compile(true)
				}
				PassThroughHtml: {
					(c as PassThroughHtml).compile
				}
				PassThroughPdf: {
					(c as PassThroughPdf).compile
				}
				Reading: {
					(c as Reading).compile
				}
				RestoreLocale: {
					(c as RestoreLocale).compile
				}
				Rubric: {
					(c as Rubric).compile
				}
				Section: {
					(c as Section).compile
				}
				SectionFragment: {
					(c as SectionFragment).compile
				}
				SetLocale: {
					(c as SetLocale).compile
					}
				SubTitle: {
					(c as SubTitle).compile
				}
				TemplateFragment: {
					(c as TemplateFragment).compile
				}
				Title: {
					(c as Title).compile
				}
				Verse: {
					(c as Verse).compile
				}
				WhenDate: {
					(c as WhenDate).compile
				}
				WhenDayName: {
					(c as WhenDayName).compile
				}
				WhenExists: {
					(c as WhenExists).compile
				}
				WhenLukanCycleDay: {
					(c as WhenLukanCycleDay).compile
				}
				WhenModeOfWeek: {
					(c as WhenModeOfWeek).compile
				}
				WhenMovableCycleDay: {
					(c as WhenMovableCycleDay).compile
				}
				WhenPascha: {
					(c as WhenPascha).compile
				}
				WhenPentecostarionDay: {
					(c as WhenPentecostarionDay).compile
				}
				WhenSundayAfterElevationOfCrossDay: {
					(c as WhenSundayAfterElevationOfCrossDay).compile
				}
				WhenSundaysBeforeTriodion: {
					(c as WhenSundaysBeforeTriodion).compile
				}
				WhenTriodionDay: {
					(c as WhenTriodionDay).compile
				}
			}»
			   «ENDFOR»
	'''

	def void switchRoot(boolean root) {
		inRoot = root
	}

/** 
	def compile(VersionSwitch s)
	'''
	«switchVersionFlags(s)»
	'''
**/	

 def compile(VersionSwitch s)
	'''
	«IF l1_On && l2_On»
	«IF (trace)»switch is closing table«ENDIF»
	«closeTable»
	«ENDIF»
	«switchVersionFlags(s)»
	«IF l1_On && l2_On»
	«IF (trace)»switch is opening table«ENDIF»
	«openTable»
	«ENDIF»
	'''
 
 	def void setRowPrintFlag(boolean value) {
 		firstRowPrinted = value
 	}
	def void switchVersionFlags(VersionSwitch s) {
		var List<String> list = new ArrayList<String>()
		l1_On = false
		l2_On = false
		if (s.dsl_VersionSwitch_flag.literal == "Both") {
			l1_On = true
			l2_On = true
			list.add("1")
			list.add("2")
		} else {
			if (s.dsl_VersionSwitch_flag.literal == "L1") {
				l1_On = true
				list.add("1")
			} else if (s.dsl_VersionSwitch_flag.literal == "L2") {
				l2_On = true
				list.add("2")
			}
		}
		//aresAccessor.blockSetManager.activate(list);
	}
/** 
	def compileDummyRow()'''
		«rowOpen»
		«entryRightOpen»«paraRoleOpen»«roleClose»I am the dummy row!«paraClose»«entryClose»
		«rowClose»
	'''
	*/

	def compileDummyRow(String source)'''
		«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»
		«IF (v1 && l1_On)»«IF inTable»«entryLeftOpen»«ENDIF»«paraRoleOpen»«roleClose»«IF debugDummyPrint»«source»«ENDIF»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»«paraRoleOpen»«roleClose»«IF debugDummyPrint»«source»«ENDIF»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF inTable»«rowClose»«ENDIF»
	'''

	def openTable()
	'''
	«IF ! inTable»
	«toggleTable(true)»
	«openTableData»
	«setRowPrintFlag(false)»
	«ENDIF»
	'''
	
	def closeTable()
	'''
	«IF inTable»
		«IF ! firstRowPrinted»
			«setRowPrintFlag(false)»
			«compileDummyRow("closeTable")»
		«ENDIF»
		«toggleTable(false)»
		«closeTableData»
	«ENDIF»
	'''
	
	def openDocTable() '''
	<informaltable frame='none' cellpadding="5%">		
		<tgroup cols='2' colsep='1' rowsep='1'>
			<colspec colname='c1'  colwidth="1*"/>
			<colspec colname='c2'  colwidth="1.25*"/>
			<spanspec spanname="allcols" namest="c1" nameend="c2"/>
			<tbody>
	'''

	def closeDocTable() '''
				</tbody>
			</tgroup>
	</informaltable>
	'''

	def openHtmlTable() 
	'''
	«htmlTableOpen»
		«htmlTbodyOpen»
	'''

	def closeHtmlTable() 
	'''
	«htmlTbodyEnd»
	«htmlTableClose»
	'''

	def openFoTable() 
	'''
	«foTableOpen»		
	«foTbodyOpen»
	'''

	def closeFoTable() 
	'''
		«foTbodyEnd»
	«foTableClose»
	'''

	def void toggleTable(boolean value) {
		inTable = value
	}

	/**  
	* Because inserting a template into a template results in 
	* a recursive compile, it is necessary to pass in a flag
	* (root = false) so it doesn't result in the DocBook and table headers
	* being generated again.
	* 
	*/
	def compile(TemplateFragment frag) '''
		«frag.name.dsl_Template_components.compileComponents»
	'''

	/*	
	def compile(IfStatement s)'''
	«IF ruleProcessor.conditionsMet(s.dsl_IF_Condition)»
		«s.dsl_IF_True_Actions.compileComponents»
    «ELSE»
    		«s.dsl_IF_False_Actions?.compileComponents»
    	«ENDIF»'''
*/
	def compile(Info info) '''
		«FOR e : info.dsl_Info_Elements»
			«switch e {
			Block: {
				(e as Block).compile(true)
			}
			Paragraph: {
				(e as Paragraph).compile(true)
			}
			SubTitle: {
				(e as SubTitle).compile
			}
			Title: {
				(e as Title).compile
			}
			VersionSwitch: {
				(e as VersionSwitch).compile
			}
		}»
		 		«ENDFOR»
	'''

	def compile(Preface preface) '''
		«IF aresAccessor.outputType == AlwbConstants.PDF»
		«prefaceOpen»
		«FOR e : preface.dsl_Preface_Elements»
			«switch e {
			Block: {
				(e as Block).compile(true)
			}
			Paragraph: {
				(e as Paragraph).compile(true)
			}
			Section: {
				(e as Section).compile
			}
			SectionFragment: {
				(e as SectionFragment).compile
			}
			SubTitle: {
				(e as SubTitle).compile
			}
			TemplateFragment: {
				(e as TemplateFragment).compile
			}
			Title: {
				(e as Title).compile
			}
			VersionSwitch: {
				(e as VersionSwitch).compile;
			}
		}»
	«ENDFOR»
	«closeTable»
	«prefaceClose»
	«ENDIF»
	'''

	def compile(Section section) '''
		«IF !inTable && aresAccessor.outputType == AlwbConstants.DOCBOOK»<section «roleOpen»«compileRole(section.dsl_Section_Role?.dsl_Definition_Text)»«roleClose»«ENDIF»
			«FOR e : section.dsl_Section_Elements»
				«switch e {
			Actor: {
				(e as Actor).compile
			}
			Block: {
				(e as Block).compile(true)
			}
			Break: {
				(e as Break).compile()
			}
			Date: {
				(e as Date).compile
			}
			Dialog: {
				(e as Dialog).compile
			}
			Heading1: {
				(e as Heading1).compile
			}
			Heading2: {
				(e as Heading2).compile
			}
			Heading3: {
				(e as Heading3).compile
			}
			Hymn: {
				(e as Hymn).compile
			}
			Media: {
				(e as Media).compile
			}
			//				IfStatement: {(e as IfStatement).compile} 
			Paragraph: {
				(e as Paragraph).compile(true)
			}
			PassThroughHtml: {
			    (e as PassThroughHtml).compile
			}
			Reading: {
				(e as Reading).compile
			}
			RestoreLocale:
				(e as RestoreLocale).compile
			Rubric: {
				(e as Rubric).compile
			}
			Section: {
				(e as Section).compile
			}
			SectionFragment: {
				(e as SectionFragment).compile
			}
			SetLocale:
				(e as SetLocale).compile
			SubTitle: {
				(e as SubTitle).compile
			}
			Title: {
				(e as Title).compile
			}
			Verse: {
				(e as Verse).compile
			}
			VersionSwitch: {
				(e as VersionSwitch).compile;
			}
			WhenDate: {
				(e as WhenDate).compile
			}
			WhenDayName: {
				(e as WhenDayName).compile
			}
			WhenExists: {
				(e as WhenExists).compile
			}
			WhenLukanCycleDay: {
				(e as WhenLukanCycleDay).compile
			}
			WhenModeOfWeek: {
				(e as WhenModeOfWeek).compile
			}
			WhenMovableCycleDay: {
				(e as WhenMovableCycleDay).compile
			}
			WhenPascha: {
				(e as WhenPascha).compile
			}
			WhenPentecostarionDay: {
				(e as WhenPentecostarionDay).compile
			}
			WhenSundayAfterElevationOfCrossDay: {
				(e as WhenSundayAfterElevationOfCrossDay).compile
			}
			WhenSundaysBeforeTriodion: {
				(e as WhenSundaysBeforeTriodion).compile
			} 
			WhenTriodionDay: {
				(e as WhenTriodionDay).compile
			} 
		}»
			«ENDFOR»
		«IF ! inTable && aresAccessor.outputType == AlwbConstants.DOCBOOK»</section>«ENDIF»
	'''

	def compile(SectionFragment sf) '''
		«sf.name.compile»
	'''

	def compile(PrefaceFragment pf) '''
		'''

	def compile(Actor actor) '''
		«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»
		«IF (v1 && l1_On)»«IF inTable»«entryLeftOpen»«ENDIF»«compileParaRoleActor»«actor.dsl_Elements.compile»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»«compileParaRoleActor»«actor.dsl_Elements.compileV2»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF inTable»«rowClose»«ENDIF»
		«resetClassForDelimitedFileRow»
	'''
	
	def compileParaRoleActor() {
		setClassForDelimitedFileRow(paraRoleActor)
		if (aresAccessor.outputType == AlwbConstants.PDF) {
			return foParaRoleOpenKeepWithNext  + XmlFoFormatManager.getStyleFor(roleActor) + foRoleClose
		} else {
			return paraRoleActor
		}
	}

	def compile(GenDate d) '''«theDay.getDisplayDate(aresAccessor.preferences.dateFormatLdp)»'''

	def compile(GenYear d) '''«theDay.getYear»'''

	def compile(Dialog dialog) '''
		«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»
		«IF (v1 && l1_On)»«IF inTable»«entryLeftOpen»«ENDIF»«compileParaRoleDialog»«dialog.dsl_Elements.compile»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»«compileParaRoleDialog»«dialog.dsl_Elements.compileV2»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF inTable»«rowClose»«ENDIF»
	'''

	def compileParaRoleDialog() {
		setClassForDelimitedFileRow(paraRoleDialog)
		if (aresAccessor.outputType == AlwbConstants.PDF) {
			return foParaRoleOpen  + XmlFoFormatManager.getStyleFor(roleDialog) + foRoleClose
		} else {
			return paraRoleDialog
		}
	}
	
	def void setClassForDelimitedFileRow(String htmlTagClass) {
		if (aresAccessor.generateDelimitedFile) {
			aresAccessor.tableManager.setHtmlClassForNextAdd(htmlTagClass)
		}
	}

	def void resetClassForDelimitedFileRow() {
		if (aresAccessor.generateDelimitedFile) {
			aresAccessor.tableManager.setHtmlClassForNextAdd("")
		}
	}

	/**
	 * The Heading tags are used for table of contents in ePub docs
	 */
	def compile(Heading1 heading) '''
		«IF (aresAccessor.outputType == AlwbConstants.EPUB)»
			«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»
			«IF (v1 && l1_On)»«IF inTable»«entryLeftOpen»«ENDIF»<h1>«heading.dsl_Elements.compile»</h1>«IF inTable»«entryClose»«ENDIF»«ENDIF»
			«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»<1>«heading.dsl_Elements.compileV2»</h1>«IF inTable»«entryClose»«ENDIF»«ENDIF»
			«IF inTable»«rowClose»«ENDIF»
		«ENDIF»
	'''

	/**
	 * The Heading tags are used for table of contents in ePub docs
	 */
	def compile(Heading2 heading) '''
		«IF (aresAccessor.outputType == AlwbConstants.EPUB)»
			«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»
			«IF (v1 && l1_On)»«IF inTable»«entryLeftOpen»«ENDIF»<h2>«heading.dsl_Elements.compile»</h1>«IF inTable»«entryClose»«ENDIF»«ENDIF»
			«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»<2>«heading.dsl_Elements.compileV2»</h1>«IF inTable»«entryClose»«ENDIF»«ENDIF»
			«IF inTable»«rowClose»«ENDIF»
		«ENDIF»
	'''

	/**
	 * The Heading tags are used for table of contents in ePub docs
	 */
	def compile(Heading3 heading) '''
		«IF (aresAccessor.outputType == AlwbConstants.EPUB)»
			«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»
			«IF (v1 && l1_On)»«IF inTable»«entryLeftOpen»«ENDIF»<h3>«heading.dsl_Elements.compile»</h1>«IF inTable»«entryClose»«ENDIF»«ENDIF»
			«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»<3>«heading.dsl_Elements.compileV2»</h1>«IF inTable»«entryClose»«ENDIF»«ENDIF»
			«IF inTable»«rowClose»«ENDIF»
		«ENDIF»
	'''


	/**
	 * The inclusion of Media hrefs is accomplished during the processing
	 * of a hymn.  The sole purpose of the media tag is allow media 
	 * hrefs to occur separate from the hymn to which they belong.
	 * It is used in conjunction with the media-off flag so that the
	 * hrefs do not appear twice (i.e. once via the Media tag and 
	 * secondly by processing the hymn.
	 */
	def compile(Media media) '''
		«IF aresAccessor.outputType == AlwbConstants.HTML»
		«aresAccessor.setMediaOnly(true)»
		«IF (displayMediaDivs(media))»
			«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»
			«IF (v1 && l1_On)»«IF inTable»«entryLeftOpen»«ENDIF»«mediaDivV1»«IF inTable»«entryClose»«ENDIF»«ENDIF»
			«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»«mediaDivV2»«IF inTable»«entryClose»«ENDIF»«ENDIF»
			«IF inTable»«rowClose»«ENDIF»
		«ENDIF»
		«aresAccessor.setMediaOnly(false)»
		«ENDIF»
	'''
	
	/**
	 * Sets the values of the Media Divs and evaluates them.
	 * If both divs are empty, returns false, otherwise returns true 
	 */
	def boolean displayMediaDivs(Media media) {
		mediaDivV1 = ""
		mediaDivV2 = ""
		mediaDivV1 = media.dsl_Elements.compile
		mediaDivV2 = media.dsl_Elements.compileV2
		return aresAccessor.notEmptyMediaDivs(mediaDivV1,mediaDivV2)
	}
	
	def getTitleLink()'''<h1 id='«getNextId»'>'''
	
	def roleIsDesignation(Title title) {
		var role = compileTitleRole(title)
		role.matches("designation")
	}
	def getNextId() {
		titleLinkCount = titleLinkCount + 1
	}

	def compile(Title title) 
		'''
			«IF inTable»
				«rowOpen»«setRowPrintFlag(true)»
			«ENDIF»
			«IF (v1 && l1_On)»
				«IF inTable»
					«entryLeftOpen»
				«ENDIF»
				«IF (generatingEpub && roleIsDesignation(title))»«getTitleLink»«ELSE»«compileTitleRoleOpen(title)»«compileTitleRole(title)»«roleClose»«ENDIF»«title.dsl_Elements.compile»«IF (generatingEpub)»«ePubTitleClose»«ELSE»«paraClose»«ENDIF»
				«resetClassForDelimitedFileRow»
				«IF inTable»
					«entryClose»
				«ENDIF»
			«ENDIF»
			«IF (v2 && l2_On)»
				«IF inTable»
					«entryRightOpen»
				«ENDIF»
				«IF (generatingEpub)»«getTitleLink»«ELSE»«compileTitleRoleOpen(title)»«compileTitleRole(title)»«roleClose»«ENDIF»«title.dsl_Elements.compileV2»«IF (generatingEpub)»«ePubTitleClose»«ELSE»«paraClose»«ENDIF»
				«resetClassForDelimitedFileRow»
				«IF inTable»
					«entryClose»
				«ENDIF»
			«ENDIF»
			«IF inTable»
				«rowClose»
			«ENDIF»
	'''

	def compileTitleRoleOpen(Title title) {
		var type = aresAccessor.outputType
		if (aresAccessor.outputType == AlwbConstants.PDF) {
			return foParaRoleOpenKeepWithNext
		} else {
			return paraRoleOpen
		}
	}


	def compileRole(String r) {
		var result = ""
		if (aresAccessor.outputType == AlwbConstants.PDF) {
			if (r!= null) {
				if (r.contains("fo:block")) {
					result = r
				} else if (r.contains("break")) {
					result = "fo:block"
				} else if (r.contains("inline")) {
					result = r
				} else if (r.contains("rubric")) {
					result = XmlFoFormatManager.getStyleFor("inline"+r)
				} else {
					result = XmlFoFormatManager.getStyleFor(r)
				}
			}
		} else {
			result = r
		}
		setClassForDelimitedFileRow(r)
		return result
	}
	
	def compileTitleRole(Title title) {
		if (title.dsl_Title_Role == null) {
			return compileRole(roleMixed)
		} else {
			return compileRole(title.dsl_Title_Role.dsl_Definition_Text)
		}
	}
	
	/**
	 * Problem: if we are generating HTML, and if we are including media links,
	 * the links need to become a division placed before the paragraph containing the
	 * verse.  So, we need to call compileWithHref.
	 */
	def compile(Hymn hymn) '''
		«IF aresAccessor.includeMediaLinks»
		«compileWithHref(hymn)»
		«ELSE»
		«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»
		«IF (v1 && l1_On)»«IF inTable»«entryLeftOpen»«ENDIF»«aresAccessor.includeKey(true)»«compileParaRoleHymn»«hymn.dsl_Elements.compile»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»«aresAccessor.includeKey(true)»«compileParaRoleHymn»«hymn.dsl_Elements.compileV2»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF inTable»«rowClose»«ENDIF»
		«ENDIF»
		«resetClassForDelimitedFileRow»
		«aresAccessor.includeKey(false)»
	'''

	def compileParaRoleHymn() {
		setClassForDelimitedFileRow(paraRoleHymn)
		if (aresAccessor.outputType == AlwbConstants.PDF) {
			return foParaRoleOpen  + XmlFoFormatManager.getStyleFor(roleHymn) + foRoleClose
		} else {
			return paraRoleHymn
		}
	}
	
/**
 * this version separates the Media HREF Row from the Text Row.
 *
 */  	
	def compileWithHref(Hymn hymn) {
		aresAccessor.resetHrefsRow
		var localRowOpen = '''«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»'''
		var localRowClose = '''«IF inTable»«rowClose»«ENDIF»'''		
		var hrefRowOpen = '''«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»'''
		var l1TdOpen = '''«IF (v1 && l1_On)»«IF inTable»«entryLeftOpen»«ENDIF»«ENDIF»'''
		var l1TdClose = '''«IF (v1 && l1_On)»«IF inTable»«entryClose»«ENDIF»«ENDIF»'''
		var l1Para = '''«IF (v1 && l1_On)»«aresAccessor.includeKey(true)»«paraRoleHymn»«hymn.dsl_Elements.compile»«paraClose»«ENDIF»'''
		var l1MediaHrefs = aresAccessor.hrefsRow
		aresAccessor.resetHrefsRow();
		
		var l2TdOpen = '''«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»«ENDIF»'''
		var l2TdClose = '''«IF (v2 && l2_On)»«IF inTable»«entryClose»«ENDIF»«ENDIF»'''
		var l2Para = '''«IF (v2 && l2_On)»«aresAccessor.includeKey(true)»«paraRoleHymn»«hymn.dsl_Elements.compileV2»«paraClose»«ENDIF»'''
		var l2MediaHrefs = aresAccessor.hrefsRow
		var textRow = 
			'''
			«localRowOpen»
			«IF (v1 && l1_On)»
				«l1TdOpen»
					«l1Para»
				«l1TdClose»
			«ENDIF»
			«IF (v2 && l2_On)»
				«l2TdOpen»
					«l2Para»
				«l2TdClose»
			«ENDIF»
			«localRowClose»
			'''
		aresAccessor.resetHrefsRow();
		if (bothMediaRowsEmpty(l1MediaHrefs,l2MediaHrefs)) {
			return textRow
		} else {
			return 
			'''
			«hrefRowOpen»
			«IF (v1 && l1_On)»
				«l1TdOpen»
					«l1MediaHrefs»
				«l1TdClose»
			«ENDIF»
			«IF (v2 && l2_On)»
				«l2TdOpen»
					«l2MediaHrefs»
				«l2TdClose»
			«ENDIF»
			«localRowClose»
			«textRow»
			''' 
		}
	}
	
	/**
	 * Check to see if both media Rows are empty
	 */
	def boolean bothMediaRowsEmpty(String left, String right) {
		var leftEmpty = ! (left.toLowerCase.contains("href"))
		var rightEmpty = ! (right.toLowerCase.contains("href"))
		return (leftEmpty && rightEmpty)
	}
 
	def docBookEntry(String docTag, CharSequence s1, CharSequence s2, boolean asTable) '''
		«IF asTable»«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»«ENDIF»
		«IF (v1 && l1_On)»«IF asTable»«IF inTable»«entryLeftOpen»«ENDIF»«ENDIF»<«docTag»>«s1»</«docTag»>«IF asTable»«IF inTable»«entryClose»«ENDIF»«ENDIF»«ENDIF»
		«IF asTable»
			«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»<«docTag»>«s2»</«docTag»>«IF inTable»«entryClose»«ENDIF»«ENDIF»
			«IF inTable»«rowClose»«ENDIF»
		«ENDIF»
	'''

	def void resetDisplayOptions() {
		displayAll = false
		displayMode = false
		displayMelody = false
		displayOde = false
		displayText = false
	}

	def compile(MOW m) ''' «theDay.modeOfWeek»'''

	def compile(MCD m) ''' «theDay.daysSinceStartOfTriodion»'''

	def compileMOW(MOW m) '''Mode «theDay.modeOfWeek»'''

	def compile(EOW e) ''' «theDay.eothinonNumber»'''

 	def compile(Paragraph paragraph, boolean asTable) '''
		«IF asTable»«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»«ENDIF»
		«IF (v1 && l1_On)»«IF asTable»«IF inTable»«entryLeftOpen»«ENDIF»«ENDIF»«paraRoleOpen»«compileRole(paragraph.dsl_Para_Role?.
			dsl_Definition_Text)»«roleClose»«paragraph.dsl_Elements.compile»«paraClose»«IF asTable»«IF inTable»«entryClose»«ENDIF»«ENDIF»«ENDIF»
			«resetClassForDelimitedFileRow»
		«IF asTable»
			«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»«paraRoleOpen»«compileRole(paragraph.dsl_Para_Role?.dsl_Definition_Text)»«roleClose»«paragraph.
			dsl_Elements.compileV2»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
			«resetClassForDelimitedFileRow»
			«IF inTable»«rowClose»«ENDIF»
		«ENDIF»
	'''

	def compile(Block block, boolean asTable) '''
		«IF asTable»«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»«ENDIF»
		«IF (v1 && l1_On)»«IF asTable»«IF inTable»«entryLeftOpen»«ENDIF»«ENDIF»«IF aresAccessor.outputType == AlwbConstants.PDF»«foLineBreak»«ELSE»<«startTag(
			compileRole(block.dsl_Block_Role.dsl_Definition_Text))»>«block.dsl_Elements.compile»</«endTag(
			compileRole(block.dsl_Block_Role.dsl_Definition_Text))»>«ENDIF»«IF asTable»«IF inTable»«entryClose»«ENDIF»«ENDIF»«ENDIF»
		«IF asTable»
			«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»«IF aresAccessor.outputType == AlwbConstants.PDF»«foLineBreak»«ELSE»<«startTag(compileRole(block.dsl_Block_Role.dsl_Definition_Text))»>«block.
			dsl_Elements.compileV2»</«endTag(compileRole(block.dsl_Block_Role.dsl_Definition_Text))»>«ENDIF»«IF inTable»«entryClose»«ENDIF»«ENDIF»
			«IF inTable»«rowClose»«ENDIF»
		«ENDIF»
		«resetClassForDelimitedFileRow»
	'''
	
	def compile(Break b)'''
	«IF aresAccessor.outputType == AlwbConstants.PDF»
		«IF b.dsl_break_type.literal == "line"»
			«rowOpen»
			«entryLeftOpen»
			«foLineBreak»
			«entryClose»
			«rowClose»
		«ELSE» 
			«closeTable»
			«foPageBreak»
			«openTable»
		«ENDIF»
	«ELSE»
		«IF b.dsl_break_type.literal == "line"»
			«IF inTable»
				«rowOpen»
			«ENDIF»
			«IF (v1 && l1_On)»
				«IF inTable»
					«entryLeftOpen»
				«ENDIF»
				«htmlLineBreak»
				«IF inTable»
					«entryClose»
				«ENDIF»
			«ENDIF»
			«IF (v2 && l2_On)»
				«IF inTable»
					«entryRightOpen»
				«ENDIF»
				«htmlLineBreak»
				«IF inTable»
					«entryClose»
				«ENDIF»
			«ENDIF»
			«IF inTable»
				«rowClose»
			«ENDIF»
		«ENDIF»
	«ENDIF»
	'''

	def compile(Reading reading) '''
		«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»
		«IF (v1 && l1_On)»«IF inTable»«entryLeftOpen»«ENDIF»«compileParaRoleReading»«reading.dsl_Elements.compile»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»«compileParaRoleReading»«reading.dsl_Elements.compileV2»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF inTable»«rowClose»«ENDIF»
	'''

	def compileParaRoleReading() {
		if (aresAccessor.outputType == AlwbConstants.PDF) {
			return foParaRoleOpen  + XmlFoFormatManager.getStyleFor(roleReading) + foRoleClose
		} else {
			return paraRoleReading
		}
	}
	
	def compile(Rubric rubric) '''
		«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»
		«IF (v1 && l1_On)»«IF inTable»«entryLeftOpen»«ENDIF»«compileParaRoleRubric»«rubric.dsl_Elements.compile»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»«compileParaRoleRubric»«rubric.dsl_Elements.compileV2»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF inTable»«rowClose»«ENDIF»
	'''

	def compileParaRoleRubric() {
		if (aresAccessor.outputType == AlwbConstants.PDF) {
			return foParaRoleOpen  + XmlFoFormatManager.getStyleFor(roleRubric) + foRoleClose
		} else {
			return paraRoleRubric
		}
	}
	def compile(Verse verse) '''
		«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»
		«IF (v1 && l1_On)»«IF inTable»«entryLeftOpen»«ENDIF»«aresAccessor.includeKey(true)»«compileParaRoleVerse»«verse.
			dsl_Elements.compile»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»«aresAccessor.includeKey(true)»«compileParaRoleVerse»«verse.
			dsl_Elements.compileV2»«paraClose»«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«IF inTable»«rowClose»«ENDIF»
		«aresAccessor.includeKey(false)»
	'''

	def compileParaRoleVerse() {
		if (aresAccessor.outputType == AlwbConstants.PDF) {
			return foParaRoleOpen  + XmlFoFormatManager.getStyleFor(roleVerse) + foRoleClose
		} else {
			return paraRoleVerse
		}
	}

	def compile(SubTitle title) '''
	«IF inTable»«rowOpen»«setRowPrintFlag(true)»«ENDIF»
	«IF (v1 && l1_On)»«IF inTable»«entryLeftOpen»«ENDIF»<subtitle «roleOpen»«compileRole(title.dsl_SubTitle_Role?.dsl_Definition_Text)»«roleClose»«title.
		dsl_Elements.compile»</subtitle>«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«resetClassForDelimitedFileRow»
	«IF (v2 && l2_On)»«IF inTable»«entryRightOpen»«ENDIF»<subtitle «roleOpen»«compileRole(title.dsl_SubTitle_Role?.dsl_Definition_Text)»«roleClose»«title.
		dsl_Elements.compileV2»</subtitle>«IF inTable»«entryClose»«ENDIF»«ENDIF»
		«resetClassForDelimitedFileRow»
	«IF inTable»«rowClose»«ENDIF»'''

	def compile(LDP p) '''«FOR t : p.dsl_LDP»«t.compile»«ENDFOR»'''

	def compile(LdpType p) {
		switch p {
			All: {
				(p as All).compile
			}
			DOL: {
				(p as DOL).compile
			}
			DOM: {
				(p as DOM).compile
			}
			DOWN: {
				(p as DOWN).compile
			}
			DOWT: {
				(p as DOWT).compile
			}
			EOW: {
				(p as EOW).compile
			}
			GenDate: {
				(p as GenDate).compile
			}
			GenYear: {
				(p as GenYear).compile
			}
			MCD: {
				(p as MCD).compile
			}
			MOW: {
				(p as MOW).compile
			}
			NOP: {
				(p as NOP).compile
			}
			DOP: {
				(p as DOP).compile
			}
			SAEC: {
				(p as SAEC).compile
			}
			SBT: {
				(p as SBT).compile
			}
			SOL: {
				(p as SOL).compile
			}
			WOLC: {
				(p as WOLC).compile
			}
			WDOLC: {
				(p as WDOLC).compile
			}
		}
	}

	def compile(All a) ''' ldp @All is not implemented.'''

	def compile(SAEC d) ''' «theDay.getFormattedSundayAfterElevationOfCross»'''

	def compile(SBT d) ''' «theDay.numberOfSundaysBeforeStartOfTriodion»'''

	def compile(SOL d) ''' «theDay.startOfLukanCycle»'''

	def compile(DOL d) ''' «theDay.daysSinceStartLukanCycleLast»'''

	def compile(WOLC d) ''' «theDay.weekOfLukanCycle»'''

	def compile(WDOLC d) ''' «theDay.getWeekAndDayOfLukanCycle»'''

	def compile(DOM d) ''' «theDay.getNbrDayOfMonth()»'''

	def compile(DOWN d) ''' «theDay.getNbrDayOfWeek()»'''

	def compile(DOWT d) ''' «theDay.nameOfDay»'''

	def compile(NOP n) ''' «theDay.getNameOfPeriod»'''

	def compile(DOP d) ''' «theDay.dayOfSeason»'''

	def compileDayNameCases(EList<WhenDayNameCase> l) '''
		'''

	def compile(WhenPascha w) '''
		«IF theDay.isPascha»«w.dsl_WhenPascha_true_actions.compileComponents»«ELSE»«w.dsl_WhenPascha_Other_actions.
			compileComponents»«ENDIF»
	'''

	def compile(WhenOther o) '''
		«o.dsl_WhenCase_Other_actions.compileComponents»
	'''

	def compile(EList<ElementType> elements) '''
	«FOR e : elements»«switch e {
		LDP: {
			(e as LDP).compile
		}
		Lookup: {
			(e as Lookup).compile
		}
		ResourceText: {
			(e as ResourceText).compile
		}
		TaggedText: {
			(e as TaggedText).compile
		}
	}»
	«ENDFOR»'''

	def compileV2(EList<ElementType> elements) '''«FOR e : elements»«switch e {
		LDP: {
			(e as LDP).compile
		}
		Lookup: {
			(e as Lookup).compileV2
		}
		ResourceText: {
			(e as ResourceText).compileV2
		}
		TaggedText: {
			(e as TaggedText).compileV2
		}
	}»«ENDFOR»'''

	def compile(TaggedText text) '''«taggedTextOpenTagLb»«startTag(text.dsl_TaggedText_tag.dsl_Definition_Text)»«taggedTextOpenTagRb»«text.dsl_TaggedText.
		compile»«taggedTextCloseTagLb»«endTag(text.dsl_TaggedText_tag.dsl_Definition_Text)»«taggedTextCloseTagRb» '''

	def compileV2(TaggedText text) '''«taggedTextOpenTagLb»«startTag(text.dsl_TaggedText_tag.dsl_Definition_Text)»«taggedTextOpenTagRb»«text.dsl_TaggedText.
		compileV2»«taggedTextCloseTagLb»«endTag(text.dsl_TaggedText_tag.dsl_Definition_Text)»«taggedTextCloseTagRb» '''

	def compile(ResourceText text) '''«setResourceOverrides(text)»«aresAccessor.getLanguage1Text(text.dsl_ResourceTextRef)» «resetResourceOverrides()»'''

	def compileV2(ResourceText text) '''«setResourceOverrides(text)»«aresAccessor.getLanguage2Text(text.dsl_ResourceTextRef)» «resetResourceOverrides()»'''

	def compile(Lookup l) '''«setLookupOverrides(l)»«aresAccessor.getLanguage1VariableText(l.dsl_ResourceTextRef)» «resetLookupOverrides»'''

	def compileV2(Lookup l) '''«setLookupOverrides(l)»«aresAccessor.getLanguage2VariableText(l.dsl_ResourceTextRef)» «resetLookupOverrides»'''

	
	
	def cascadingStyleSheet(String name) '''«cssPrefix»«theRelativePath»«name»«cssSuffix»'''
	

	def dtd(String name) {
		'''		<!DOCTYPE article PUBLIC "-//OASIS//DTD DocBook XML V4.5//EN" "«name»" >'''
	}

	/**
    * @return the relative path based on the value of numberOfDirectoryLevels
    */
	def relativePath(String rootFolder, String filename) {
		var path = ""
		try {
			var numberOfDirectoryLevels = 0
			val rootLevel = rootFolder.split("/").length + 1
			numberOfDirectoryLevels = filename.split("/").size - rootLevel
			var count = numberOfDirectoryLevels
			while (count > 0) {
				count = count - 1
				path = path + "../"
			}
		} catch (Exception e) {
			logger.catching(e)
			path = "path error"
		}
		path
	}

	// used for debugging
	def runWorkspaceUtilsExamples() {
		println("Map count: " + aresAccessor.filenameToUriMap.size)
		var s1 = aresAccessor.getDefinitionValueById("properties_es_MX.ares", "Actors.Deacon");
		println(s1)
		s1 = aresAccessor.getDefinitionValueById(aresAccessor.convertFilename("properties_es_MX.ares", "el_GR_cog"),
			"Actors.Deacon")
		println(s1)
	}

	// used for debugging
	def listResources(ResourceSet rs, IFileSystemAccess fsa, String file) {
		fsa.generateFile(file, rs.compile)
	}

	// used for debugging
	def compile(ResourceSet rs) '''
		«FOR r : rs.allContents.toIterable.filter(typeof(AresModel))»
			File     String: «r.eResource.URI.toFileString»
			Platform String: «r.eResource.URI.toPlatformString(true)»
		«ENDFOR»
	'''

	def startTag(String itag) '''«IF itag.contains(",")»«compileRole(itag.split(",").get(0).replaceFirst(docEmphasis,emphasis))»«roleOpen»«compileRole(itag.split(",").get(1))»«emphasisTypeClose»«ELSE»«itag»«ENDIF»'''

	def endTag(String itag) '''«IF itag.contains(",")»«compileRole(itag.split(",").get(0).replaceFirst(docEmphasis,emphasis))»«ELSE»«compileRole(itag)»«resetClassForDelimitedFileRow»«ENDIF»'''

	/**
	 * Lookups (rid) compute a resource name based on the
	 * LiturgicalDayProperties.  
	 * 
	 * Sometimes the mode of the week or day of the week
	 * in a lookup needs to be overridden.
	 */
	def void setLookupOverrides(Lookup l) {
		if (l.dsl_Lookup_Override__Day_Set) {
			theDay.setNbrDayOfWeekOverride(l.dsl_Lookup_OverrideDay.getName())
		} else {
			theDay.setNbrDayOfWeekOverride("")
		}
		if (l.dsl_Lookup_Override_Mode_Set) {
			theDay.setModeOfTheWeekOverride(l.dsl_Lookup_OverrideMode.getName());
		} else {
			theDay.setModeOfTheWeekOverride("00");
		}
		aresAccessor.suppressMedia(l.dsl_Lookup_Media_Off);			
	}

	def void resetLookupOverrides() {
		theDay.setNbrDayOfWeekOverride("")
		theDay.setModeOfTheWeekOverride("00");
		aresAccessor.suppressMedia(false);
	}
	
	def void setResourceOverrides(ResourceText r) {
		aresAccessor.suppressMedia(r.dsl_ResourceText_Media_Off);
	}
	
	def void resetResourceOverrides() {
		aresAccessor.suppressMedia(false);
	}

	// WhenDayNameCases		
	def compile(WhenDayName w) '''
		«IF w.dsl_WhenDayName_Cases.dayMatches»
			«w.dsl_WhenDayName_Cases.compileWhenDayNameCases»
		«ELSE»
			«IF w.dsl_WhenDayName_Other != null»«w.dsl_WhenDayName_Other.compile»«ENDIF»
		«ENDIF»
	'''

	def dayMatches(EList<WhenDayNameCase> l) {
		for (c : l) {
			if(c.dsl_WhenDayNameCase_Days.matchesDay) return true
		}
		false
	}

	def compileWhenDayNameCases(EList<WhenDayNameCase> l) '''
		«FOR c : l»«c.compile»«ENDFOR»
	'''

	def compile(WhenDayNameCase c) '''
		«IF c.dsl_WhenDayNameCase_Days.matchesDay»«c.dsl_WhenDayNameCase_True_actions.compileComponents»«ENDIF»
	'''

	def matchesDay(AbstractDayNameCase c) {
		switch c {
			DayNameRange: {
				c.matchesDay
			}
			DayNameSet: {
				c.matchesDay
			}
			default:
				false
		}
	}

	def matchesDay(DayNameRange r) {
		dayInRange(r.dsl_DayNameRange_from, r.dsl_DayNameRange_To)
	}

	def matchesDay(DayNameSet s) {
		for (DOW : s.dslDayNameSet_Values) {
			if(targetDayOfWeek == (DOW.ordinal + 1)) return true
		}
		false
	}

	def dayInRange(DayOfWeek from, DayOfWeek to) {
		((targetDayOfWeek >= (from.ordinal + 1)) && (targetDayOfWeek <= (to.ordinal + 1)))
	}


	def compile(WhenMovableCycleDay w) '''
		«setTargetForMovableCycle»
		«IF w.dsl_WhenMovableCycleDay_Cases.periodDayMatches»
			«w.dsl_WhenMovableCycleDay_Cases.compileWhenPeriodCases»
		«ELSE»
			«IF w.dsl_WhenMovableCycleDay_Other != null»«w.dsl_WhenMovableCycleDay_Other.compile»«ENDIF»
		«ENDIF»
	'''

	def void setTargetForMovableCycle() {
		targetDayOfSeason = theDay.daysSinceStartOfTriodion
	}

	def compile(WhenLukanCycleDay w) '''
		«setTargetForLukanCycleDay»
		«IF w.dsl_WhenLukanCycleDay_Cases.periodDayMatches»
			«w.dsl_WhenLukanCycleDay_Cases.compileWhenPeriodCases»
		«ELSE»
			«IF w.dsl_WhenLukanCycleDay_Other != null»«w.dsl_WhenLukanCycleDay_Other.compile»«ENDIF»
		«ENDIF»
	'''

	def void setTargetForLukanCycleDay() {
		targetDayOfSeason = theDay.getDaysSinceStartLukanCycleLast
	}

	// When Triodion or Pentecostarion Day
	def compile(WhenTriodionDay w) '''
		«setTargetForTriodion»
		«IF w.dsl_WhenTriodionDay_Cases.periodDayMatches»
			«w.dsl_WhenTriodionDay_Cases.compileWhenPeriodCases»
		«ELSE»
			«IF w.dsl_WhenTriodionDay_Other != null»«w.dsl_WhenTriodionDay_Other.compile»«ENDIF»
		«ENDIF»
	'''

	def void setTargetForTriodion() {
		targetDayOfSeason = theDay.triodionDayToMovableDay
	}
	
	def compile(WhenPentecostarionDay w) '''
		«setTargetForPentecostarion»
		«IF w.dsl_WhenPentecostarionDay_Cases.periodDayMatches»
			«w.dsl_WhenPentecostarionDay_Cases.compileWhenPeriodCases»
		«ELSE»
			«IF w.dsl_WhenPentecostarionDay_Other != null»«w.dsl_WhenPentecostarionDay_Other.compile»«ENDIF»
		«ENDIF»
	'''

	def void setTargetForPentecostarion() {
		targetDayOfSeason = theDay.pentecostarionDayToMovableDay
	}
	def periodDayMatches(EList<WhenPeriodCase> l) {
		for (c : l) {
			if(c.dsl_WhenPeriodCase_Days.matchesDay) return true
		}
		false
	}

	def compileWhenPeriodCases(EList<WhenPeriodCase> l) '''
		«FOR c : l»«c.compile»«ENDFOR»
	'''

	def compile(WhenPeriodCase c) '''
		«IF c.dsl_WhenPeriodCase_Days.matchesDay»«c.dsl_WhenPeriodCase_True_actions.compileComponents»«ENDIF»
	'''

	def matchesDay(AbstractDayCase c) {
		switch c {
			DayRange: {
				c.matchesDay
			}
			DaySet: {
				c.matchesDay
			}
			default:
				false
		}
	}

	def matchesDay(DaySet s) {
		for (DOP : s.dslSetValue_Days) {
			if (targetDayOfSeason == (DOP))
				return true
		}
		false
	}

	def matchesDay(DayRange r) {
		dayInPeriodRange(r.dsl_DayRange_from, r.dsl_Range_To)
	}

	def boolean dayInPeriodRange(int from, int to) {
		if (targetDayOfSeason >= (from) && (targetDayOfSeason <= (to))) {
			return true
		} else
			return false
	}

	/*
 	 *  When date (month, day)
    */
	def compile(WhenDate w) '''
		«setTargetMonthAndDayToLiturgicalDay»
		«IF w.dsl_WhenDate_Cases.dateMatches»
			«w.dsl_WhenDate_Cases.compileWhenDateCases»
		«ELSE»
			«IF w.dsl_WhenDate_Other != null»«w.dsl_WhenDate_Other.compile»«ENDIF»
		«ENDIF»
	'''

	def compile(WhenSundaysBeforeTriodion w)'''
		«IF w.dsl_WhenSundaysBeforeTriodion_Cases.numberOfSundaysMatches»
			«w.dsl_WhenSundaysBeforeTriodion_Cases.compileSundaysBeforeTriodionCases»
		«ELSE»
			«IF w.dsl_SundaysBeforeTriodion_Other != null»«w.dsl_SundaysBeforeTriodion_Other.compile»«ENDIF»
		«ENDIF»
	'''
	
	def compileSundaysBeforeTriodionCases(EList<SundaysBeforeTriodionCase> l) '''
		«FOR c : l»«c.compile»«ENDFOR»
	'''

	def compile(SundaysBeforeTriodionCase c) '''
		«IF (c.dsl_SundaysBeforeTriodionCase_Days == targetSundaysBeforeStartOfTriodion)»«c.dsl_SundaysBeforeTriodionCase_True_actions.compileComponents»«ENDIF»
	'''

	def numberOfSundaysMatches(EList<SundaysBeforeTriodionCase> l) {
	for (c : l) {
		if (c.dsl_SundaysBeforeTriodionCase_Days == targetSundaysBeforeStartOfTriodion) return true
	}
	false
	}
	

	def compile(WhenSundayAfterElevationOfCrossDay w) '''
		«setTargetForSundayAfterElevationOfCross»
		«IF w.dsl_WhenSundayAfterElevationOfCrossDay_Cases.dateMatches»
			«w.dsl_WhenSundayAfterElevationOfCrossDay_Cases.compileWhenDateCases»
		«ELSE»
			«IF w.dsl_WhenSundayAfterElevationOfCrossDay_Other != null»«w.dsl_WhenSundayAfterElevationOfCrossDay_Other.compile»«ENDIF»
		«ENDIF»
	'''

	def void setTargetForSundayAfterElevationOfCross() {
		targetMonth = theDay.getMonthOfSundayAfterElevationOfCross
		targetDay = theDay.getDayOfSundayAfterElevationOfCross
	}
	
	def void setTargetMonthAndDayToLiturgicalDay() {
		targetMonth = theDay.getIntMonth - 1 // so we can use with enum ordinals, which start at 0
		targetDay = theDay.getIntDayOfMonth
	}


	def dateMatches(EList<WhenDateCase> l) {
		for (c : l) {
			if(c.dsl_WhenDate_Case_Month.ordinal == targetMonth && c.dsl_WhenDateCase_Days.matchesDay) return true
		}
		false
	}

	def compileWhenDateCases(EList<WhenDateCase> l) '''
		«FOR c : l»«c.compile»«ENDFOR»
	'''

	def compile(WhenDateCase c) '''
		«IF (c.dsl_WhenDate_Case_Month.ordinal == targetMonth && c.dsl_WhenDateCase_Days.matchesDay)»«c.
			dsl_WhenDateCase_True_actions.compileComponents»«ENDIF»
	'''

	def matchesDay(AbstractDateCase c) {
		switch c {
			DateRange: {
				c.matchesDay
			}
			DateSet: {
				c.matchesDay
			}
			default:
				false
		}
	}

	def matchesDay(DateSet s) {
		for (d : s.dslDateSet_Values) {
			if (targetDay == d)
				return true
		}
		false
	}

	def matchesDay(DateRange r) {
		dayInDateRange(r.dsl_DateRange_from, r.dsl_DateRange_To)
	}

	def boolean dayInDateRange(int from, int to) {
		if (targetDay >= (from) && (targetDay <= to)) {
			return true
		} else
			return false
	}

	// When Exists		
	def compile(WhenExists w) '''
		«IF w.dsl_WhenExists_Cases.aRefExists»
			«w.dsl_WhenExists_Cases.compileWhenExistsCases»
		«ELSE»
			«IF w.dsl_WhenExists_Other != null»«w.dsl_WhenExists_Other.compile»«ENDIF»
		«ENDIF»
	'''

	def compileWhenExistsCases(EList<WhenExistsCase> l) '''
		«FOR c : l»«c.compile»«ENDFOR»
	'''

	def compile(WhenExistsCase c) '''
		«IF c.dsl_WhenExistsCase_Ref.refExists»«c.dsl_WhenExistsCase_True_actions.compileComponents»«ENDIF»
	'''

	def boolean aRefExists(EList<WhenExistsCase> l) {
		for (c : l) {
			if(c.dsl_WhenExistsCase_Ref.refExists) return true
		}
		false
	}

	def boolean refExists(Definition d) {
		val x = aresAccessor.getLanguage1VariableText(d)
		if (x.empty || x.contains("Could not find") || x.contains("While looking for")) {
			return false
		} else {
			return true
		}
	}

	// When Mode Of Week		
	def compile(WhenModeOfWeek w) '''
		«IF w.dsl_WhenModeOfWeek_Cases.mowMatches»
			«w.dsl_WhenModeOfWeek_Cases.compileWhenModeOfWeekCases»
		«ELSE»
			«IF w.dsl_WhenModeOfWeek_Other != null»«w.dsl_WhenModeOfWeek_Other.compile»«ENDIF»
		«ENDIF»
	'''

	def mowMatches(EList<WhenModeOfWeekCase> l) {
		for (c : l) {
			if(c.dsl_WhenModeOfWeekCase_Days.matchesMow) return true
		}
		false
	}

	def compileWhenModeOfWeekCases(EList<WhenModeOfWeekCase> l) '''
		«FOR c : l»«c.compile»«ENDFOR»
	'''

	def compile(WhenModeOfWeekCase c) '''
		«IF c.dsl_WhenModeOfWeekCase_Days.matchesMow»«c.dsl_WhenModeOfWeekCase_True_actions.compileComponents»«ENDIF»
	'''

	def matchesMow(ModeOfWeekSet s) {
		for (MOW : s.dsl_ModeOfWeekSet_MOWs) {
			if(targetMode == (MOW.ordinal + 1)) return true
		}
		false
	}

	def void setAllGenTypesFalse() {
		generatingDocBook = false
		generatingHtml = false
		generatingEpub = false
	}
	
	def void setTagsToDocBook() {
		generatingDocBook = true
		taggedTextOpenTagLb = docTaggedTextOpenTagLb
		taggedTextOpenTagRb = docTaggedTextOpenTagRb
		taggedTextCloseTagLb = docTaggedTextCloseTagLb
		taggedTextCloseTagRb = docTaggedTextCloseTagRb
		documentOpen = docArticleOpen
		documentClose = docArticleClose
		cssPrefix = docBookCssPrefix
		cssSuffix = docBookCssSuffix
		emphasis = docEmphasis
		emphasisTypeClose = docEmphasisTypeClose
 		tableOpen = docTableOpen
		tgroupOpen = docTgroupOpen
		colspec1 = docColspec1
		colspec2 = docColspec2
		spanspec = docSpanspec
		tbodyOpen = docTbodyOpen
		tbodyClose = docTbodyEnd
		tgroupClose = docTgroupEnd
		tableClose = docTableEnd
		sectionOpen = docSectionOpen
		close = docTagClose
		sectionClose = docSectionEnd
		rowOpen = docRowOpen
		rowClose = docRowClose
		entryLeftOpen = docEntryLeftOpen
		entryRightOpen = docEntryRightOpen
		entryClose = docEntryClose
		roleOpen = docRoleOpen
		roleClose = docRoleClose
		paraRoleOpen = docParaRoleOpen
		paraRoleActor = docParaRoleActor
		paraRoleDialog = docParaRoleDialog
		paraRoleHymn = docParaRoleHymn
		paraRoleMedia = docParaRoleMedia
		paraRoleReading = docParaRoleReading
		paraRoleRubric = docParaRoleRubric
		paraRoleVerse = docParaRoleVerse
		paraClose = docParaClose
		subTitleOpen = docSubTitleRoleOpen
		subTitleClose = docSubTitleClose
		// keep the following at end of method
		openTableData = openDocTable      
		closeTableData = closeDocTable
		preface = setPrefaceForDocBook 
	}
	
	def setPrefaceForDocBook() '''
	<?xml version="1.0" encoding="UTF-8" standalone="no"?>
	«cascadingStyleSheet(docBookCss)»
	«dtd("../lib/docbook-xml-4.5/docbookx.dtd")»
	'''

	def viewport()'''<meta name="viewport"/>'''	

//			<link rel='stylesheet' type='text/css' href='css/jpm.css'>

	def setPrefaceForHtml(boolean includeBaseRef, boolean includeToolTips) '''
	<!DOCTYPE html>
	<html>
		<head>
			<title data-commemoration='«htmlCommemoration»' data-language='«localeLanguageName»' data-type='html' data-filename='index.html'«IF (aresAccessor.preferences.includeMergedPdfHref)» data-combo-pdf-href='«combinedPdfHref»'«ENDIF»>«templateTitle»</title>
			«IF (includeBaseRef)»«baseRef»«ENDIF»
			<meta charset="utf-8"/> 
   			«viewport»
			<meta name="keywords" content="«htmlCommemoration»"/>
			«htmlMetaLinksScripts»
    			«IF (includeToolTips)»«toolTips»«ENDIF»
	    	</head>
	'''

	def setPrefaceForXhtml() '''
	<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
	<html xmlns="http://www.w3.org/1999/xhtml">
		<head>
			<title >«templateTitle»</title>
			<meta charset="utf-8"/> 
			<link rel='stylesheet' type='text/css' href='alwb.css'/>    	
	    	</head>
	'''

	def setPrefaceforFo()'''
<?xml version="1.0" encoding="UTF-8"?>
<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format" font-family="'Palatino Linotype', 'Palatino Linotype Italic', 'Palatino Linotype Bold', 'Palatino Linotype Bold Italic'" font-size="10pt" text-align="justify" line-height="normal" font-selection-strategy="character-by-character" line-height-shift-adjustment="disregard-shifts" writing-mode="lr-tb" language="en">
   <fo:layout-master-set>
    <fo:simple-page-master master-name="preface-master"
      page-height="«PDF_BODY_PAGE_EVEN_HEIGHT»" page-width="«PDF_BODY_PAGE_EVEN_WIDTH»"
      margin-top="«PDF_BODY_PAGE_EVEN_MARGIN_TOP»" margin-bottom="«PDF_BODY_PAGE_EVEN_MARGIN_BOTTOM»"
      margin-left="«PDF_BODY_PAGE_EVEN_MARGIN_LEFT»" margin-right="«PDF_BODY_PAGE_EVEN_MARGIN_RIGHT»">
      <fo:region-body margin-top="«aresAccessor.preferences.pdfBodyPageEvenRegionBodyMarginTop»" margin-bottom="«aresAccessor.preferences.pdfBodyPageEvenRegionBodyMarginBottom»"/>
    </fo:simple-page-master>
    <fo:simple-page-master master-name="even"
      page-height="«PDF_BODY_PAGE_EVEN_HEIGHT»" page-width="«PDF_BODY_PAGE_EVEN_WIDTH»"
      margin-top="«PDF_BODY_PAGE_EVEN_MARGIN_TOP»" margin-bottom="«PDF_BODY_PAGE_EVEN_MARGIN_BOTTOM»"
      margin-left="«PDF_BODY_PAGE_EVEN_MARGIN_LEFT»" margin-right="«PDF_BODY_PAGE_EVEN_MARGIN_RIGHT»">
      <fo:region-body margin-top="«aresAccessor.preferences.pdfBodyPageEvenRegionBodyMarginTop»" margin-bottom="«aresAccessor.preferences.pdfBodyPageEvenRegionBodyMarginBottom»" «IF (PDF_BODY_COLUMN_COUNT > 1)»column-count="«PDF_BODY_COLUMN_COUNT»" column-gap="«PDF_BODY_COLUMN_GAP»"«ENDIF»/>
      <fo:region-before region-name="header-even" extent="«aresAccessor.preferences.pdfBodyPageEvenRegionBeforeExtent»"/>
      <fo:region-after region-name="footer-even" extent="«aresAccessor.preferences.pdfBodyPageEvenRegionAfterExtent»"/>
    </fo:simple-page-master>
    <fo:simple-page-master master-name="odd"
      page-height="«PDF_BODY_PAGE_ODD_HEIGHT»" page-width="«PDF_BODY_PAGE_ODD_WIDTH»"
      margin-top="«PDF_BODY_PAGE_ODD_MARGIN_TOP»" margin-bottom="«PDF_BODY_PAGE_ODD_MARGIN_BOTTOM»"
      margin-left="«PDF_BODY_PAGE_ODD_MARGIN_LEFT»" margin-right="«PDF_BODY_PAGE_ODD_MARGIN_RIGHT»">
      <fo:region-body margin-top="«aresAccessor.preferences.pdfBodyPageEvenRegionBodyMarginTop»" margin-bottom="«aresAccessor.preferences.pdfBodyPageEvenRegionBodyMarginBottom»" «IF (PDF_BODY_COLUMN_COUNT > 1)»column-count="«PDF_BODY_COLUMN_COUNT»" column-gap="«PDF_BODY_COLUMN_GAP»"«ENDIF»/>
      <fo:region-before region-name="header-odd" extent="«aresAccessor.preferences.pdfBodyPageOddRegionBeforeExtent»"/>
      <fo:region-after region-name="footer-odd" extent="«aresAccessor.preferences.pdfBodyPageOddRegionAfterExtent»"/>
    </fo:simple-page-master>
    <fo:page-sequence-master master-name="document">
      <fo:repeatable-page-master-alternatives>
        <fo:conditional-page-master-reference odd-or-even="even"
          master-reference="even"/>
        <fo:conditional-page-master-reference odd-or-even="odd"
          master-reference="odd"/>
      </fo:repeatable-page-master-alternatives>
    </fo:page-sequence-master>
  </fo:layout-master-set> 
	'''


	def pdfIndexHtmlContents(String pdfFilename) '''
	<!DOCTYPE html>
	<html>
		<head>
			<title data-commemoration='«htmlCommemoration»' data-language='«localeLanguageName»' data-type='pdf' data-filename='«pdfFilename»'>«templateTitle»</title>
			<meta charset="utf-8"/> 
			<meta name="keywords" content="«htmlCommemoration»"/>
			<script>
				window.location="«pdfFilename»"
			</script>
	    	</head>
		<body>
		</body>
	'''

	def baseRef() 
	'''
		<base href='«theRelativePath»'/>
		<!--[if IE]><script type="text/javascript">
		    // Fix for IE ignoring relative base tags.
		    (function() {
		        var baseTag = document.getElementsByTagName('base')[0];
		        baseTag.href = baseTag.href;
		    })();
		</script><![endif]-->
	'''
	
	def toolTips() '''
	        <script type="text/javascript">
	        		var alwbTooltips = {
	        			l1: {
	        				Audio: "«aresAccessor.l1MediaAudioToolTip»", 
	        				Byzantine: "«aresAccessor.l1MediaScoreByzantineToolTip»",
	        				Western: "«aresAccessor.l1MediaScoreWesternToolTip»"
	        				},
	        			l2: {
	        				Audio: "«aresAccessor.l2MediaAudioToolTip»", 
	        				Byzantine: "«aresAccessor.l2MediaScoreByzantineToolTip»",
	        				Western: "«aresAccessor.l2MediaScoreWesternToolTip»"
	        				}
	        		};
	        </script>
	'''
 
     def void setTagsToHtml() {
		generatingHtml = true
		prefaceOpen = "<div class='preface'>"
		prefaceClose = "</div>"
		taggedTextOpenTagLb = htmlTaggedTextOpenTagLb
		taggedTextOpenTagRb = htmlTaggedTextOpenTagRb
		taggedTextCloseTagLb = htmlTaggedTextCloseTagLb
		taggedTextCloseTagRb = htmlTaggedTextCloseTagRb
		documentOpen = htmlArticleOpen
		documentClose = htmlArticleClose
 		cssPrefix = htmlCssPrefix
		cssSuffix = htmlCssSuffix
 		css = cssPrefix + htmlCss + cssSuffix
 		emphasis = htmlEmphasis
		emphasisTypeClose = htmlEmphasisTypeClose
  		tableOpen = htmlTableOpen
 		tableClose = htmlTableClose
		tgroupOpen = htmlTgroupOpen
		colspec1 = htmlColspec1
		colspec2 = htmlColspec2
		spanspec = htmlSpanspec
		theadOpen = htmlTheadOpen
		theadClose = htmlTheadEnd
		tbodyOpen = htmlTbodyOpen
		tbodyClose = htmlTbodyEnd
		tgroupClose = htmlTgroupEnd
		tableClose = htmlTableEnd
		sectionOpen = htmlSectionOpen
		close = htmlTagClose
		sectionClose = htmlSectionEnd
		rowOpen = htmlRowOpen
		rowClose = htmlRowClose
		entryLeftOpen = htmlEntryLeftOpen
		entryRightOpen = htmlEntryRightOpen
		entryClose = htmlEntryClose
		roleOpen = htmlRoleOpen
		roleClose = htmlRoleClose
		if (aresAccessor.language1IsEditable) {
			paraRoleOpen = htmlParaEditableRoleOpen
		} else {
			paraRoleOpen = htmlParaRoleOpen			
		}
		paraRoleActor = htmlParaRoleActor
		paraRoleDialog = htmlParaRoleDialog
		paraRoleHymn = htmlParaRoleHymn
		paraRoleMedia = htmlParaRoleMedia
		paraRoleReading = htmlParaRoleReading
		paraRoleRubric = htmlParaRoleRubric
		paraRoleVerse = htmlParaRoleVerse
		paraClose = htmlParaClose
		subTitleOpen = htmlSubTitleRoleOpen
		subTitleClose = htmlSubTitleClose
		setHtmlSiteVariables
				
     }
     
     // for ePub
     def void setTagsToXhtml() {
		generatingEpub = true
		generatingHtml = true
		prefaceOpen = "<div class='preface'>"
		prefaceClose = "</div>"
		taggedTextOpenTagLb = htmlTaggedTextOpenTagLb
		taggedTextOpenTagRb = htmlTaggedTextOpenTagRb
		taggedTextCloseTagLb = htmlTaggedTextCloseTagLb
		taggedTextCloseTagRb = htmlTaggedTextCloseTagRb
		documentOpen = htmlArticleOpen
		documentClose = htmlArticleClose
 		cssPrefix = htmlCssPrefix
		cssSuffix = htmlCssSuffix
 		css = cssPrefix + htmlCss + cssSuffix
 		emphasis = htmlEmphasis
		emphasisTypeClose = htmlEmphasisTypeClose
  		tableOpen = htmlTableOpen
 		tableClose = htmlTableClose
		tgroupOpen = htmlTgroupOpen
		colspec1 = htmlColspec1
		colspec2 = htmlColspec2
		spanspec = htmlSpanspec
		theadOpen = htmlTheadOpen
		theadClose = htmlTheadEnd
		tbodyOpen = htmlTbodyOpen
		tbodyClose = htmlTbodyEnd
		tgroupClose = htmlTgroupEnd
		tableClose = htmlTableEnd
		sectionOpen = htmlSectionOpen
		close = htmlTagClose
		sectionClose = htmlSectionEnd
		rowOpen = htmlRowOpen
		rowClose = htmlRowClose
		entryLeftOpen = htmlEntryLeftOpen
		entryRightOpen = htmlEntryRightOpen
		entryClose = htmlEntryClose
		roleOpen = htmlRoleOpen
		roleClose = htmlRoleClose
		if (aresAccessor.language1IsEditable) {
			paraRoleOpen = htmlParaEditableRoleOpen
		} else {
			paraRoleOpen = htmlParaRoleOpen			
		}
		paraRoleActor = htmlParaRoleActor
		paraRoleDialog = htmlParaRoleDialog
		paraRoleHymn = htmlParaRoleHymn
		paraRoleMedia = htmlParaRoleMedia
		paraRoleReading = htmlParaRoleReading
		paraRoleRubric = htmlParaRoleRubric
		paraRoleVerse = htmlParaRoleVerse
		paraClose = htmlParaClose
		subTitleOpen = htmlSubTitleRoleOpen
		subTitleClose = htmlSubTitleClose
		setHtmlSiteVariables
				
     }
     def void setHtmlComponents() {
		openTableData = openHtmlTable      
		closeTableData = closeHtmlTable
		preface = setPrefaceForHtml(true,true) 
     }

     def void setXhtmlComponents() {
		openTableData = openHtmlTable      
		closeTableData = closeHtmlTable
		preface = setPrefaceForXhtml 
     }

	def void setHtmlSiteVariables() {
		htmlSiteRoot = aresAccessor.preferences.htmlSiteRoot + "/"
		htmlServiceFolderRoot = aresAccessor.preferences.htmlServiceFolderRoot + "/"
		htmlBookFolderRoot = aresAccessor.preferences.htmlBookFolderRoot + "/"
		htmlCustomFolderRoot = aresAccessor.preferences.htmlCustomFolderRoot + "/"
		htmlWebSite = AlwbConstants.HTML_WEBSITE 
			+ "/"
			+ htmlSiteRoot 
		linkDelimiter = aresAccessor.preferences.htmlLinkDelimiter
	}

     def void setTagsToFo() {

		generatingFo = true
		setPdfPreferences

		taggedTextOpenTagLb = foTaggedTextOpenTagLb
		taggedTextOpenTagRb = foTaggedTextOpenTagRb
		taggedTextCloseTagLb = foTaggedTextCloseTagLb
		taggedTextCloseTagRb = foTaggedTextCloseTagRb

		prefaceOpen = 
		'''
		<fo:page-sequence master-reference='preface-master'>
		    <fo:flow flow-name='xsl-region-body' text-align='left'>	
		'''

		prefaceClose = 
		'''
		    </fo:flow>	
		</fo:page-sequence>
		'''

		documentOpen = 
		'''
		<fo:page-sequence master-reference='document' initial-page-number='«pdfPageNbr»'>
		«IF headerEvenHasContent»
		    <fo:static-content flow-name="header-even">
				<fo:table table-layout="fixed">
					<fo:table-column column-number="1" column-width='«PDF_BODY_HEADER_EVEN_LEFT_WIDTH»' text-align="«PDF_BODY_HEADER_EVEN_LEFT_ALIGNMENT»"/>
					<fo:table-column column-number="2" column-width="«PDF_BODY_HEADER_EVEN_CENTER_WIDTH»" text-align="«PDF_BODY_HEADER_EVEN_CENTER_ALIGNMENT»"/>
					<fo:table-column column-number="3" column-width="«PDF_BODY_HEADER_EVEN_RIGHT_WIDTH»" text-align="«PDF_BODY_HEADER_EVEN_RIGHT_ALIGNMENT»"/>
					<fo:table-body>
						<fo:table-cell>
				      		<fo:block «XmlFoFormatManager.getStyleFor("headerEvenLeft")»><fo:inline «XmlFoFormatManager.getStyleFor("headerEvenLeftColor")»>«pdfHeaderEvenLeft»</fo:inline></fo:block>
						</fo:table-cell>
						<fo:table-cell>
				      		<fo:block «XmlFoFormatManager.getStyleFor("headerEvenCenter")»><fo:inline «XmlFoFormatManager.getStyleFor("headerEvenCenterColor")»>«pdfHeaderEvenCenter»</fo:inline></fo:block>
						</fo:table-cell>
						<fo:table-cell>
				      		<fo:block «XmlFoFormatManager.getStyleFor("headerEvenRight")»><fo:inline «XmlFoFormatManager.getStyleFor("headerEvenRightColor")»>«pdfHeaderEvenRight»</fo:inline></fo:block>
						</fo:table-cell>
					</fo:table-body>
				</fo:table>
		    </fo:static-content>
		«ENDIF»
		«IF headerOddHasContent»
		    <fo:static-content flow-name="header-odd">
				<fo:table table-layout="fixed">
					<fo:table-column column-number="1" column-width='«PDF_BODY_HEADER_ODD_LEFT_WIDTH»' text-align="«PDF_BODY_HEADER_ODD_LEFT_ALIGNMENT»"/>
					<fo:table-column column-number="2" column-width="«PDF_BODY_HEADER_ODD_CENTER_WIDTH»" text-align="«PDF_BODY_HEADER_ODD_CENTER_ALIGNMENT»"/>
					<fo:table-column column-number="3" column-width="«PDF_BODY_HEADER_ODD_RIGHT_WIDTH»" text-align="«PDF_BODY_HEADER_ODD_RIGHT_ALIGNMENT»"/>
					<fo:table-body>
						<fo:table-cell>
				      		<fo:block «XmlFoFormatManager.getStyleFor("headerOddLeft")»><fo:inline «XmlFoFormatManager.getStyleFor("headerOddLeftColor")»>«pdfHeaderOddLeft»</fo:inline></fo:block>
						</fo:table-cell>
						<fo:table-cell>
				      		<fo:block «XmlFoFormatManager.getStyleFor("headerOddCenter")»><fo:inline «XmlFoFormatManager.getStyleFor("headerOddCenterColor")»>«pdfHeaderOddCenter»</fo:inline></fo:block>
						</fo:table-cell>
						<fo:table-cell>
				      		<fo:block «XmlFoFormatManager.getStyleFor("headerOddRight")»><fo:inline «XmlFoFormatManager.getStyleFor("headerOddRightColor")»>«pdfHeaderOddRight»</fo:inline></fo:block>
						</fo:table-cell>
					</fo:table-body>
				</fo:table>
		    </fo:static-content>	
		«ENDIF»
		«IF footerEvenHasContent»
		    <fo:static-content flow-name="footer-even">
				<fo:table table-layout="fixed">
					<fo:table-column column-number="1" column-width='«PDF_BODY_FOOTER_EVEN_LEFT_WIDTH»' text-align="«PDF_BODY_FOOTER_EVEN_LEFT_ALIGNMENT»"/>
					<fo:table-column column-number="2" column-width="«PDF_BODY_FOOTER_EVEN_CENTER_WIDTH»" text-align="«PDF_BODY_FOOTER_EVEN_CENTER_ALIGNMENT»"/>
					<fo:table-column column-number="3" column-width="«PDF_BODY_FOOTER_EVEN_RIGHT_WIDTH»" text-align="«PDF_BODY_FOOTER_EVEN_RIGHT_ALIGNMENT»"/>
					<fo:table-body>
						<fo:table-cell>
				      		<fo:block «XmlFoFormatManager.getStyleFor("footerEvenLeft")»><fo:inline «XmlFoFormatManager.getStyleFor("footerEvenLeftColor")»>«pdfFooterEvenLeft»</fo:inline></fo:block>
						</fo:table-cell>
						<fo:table-cell>
				      		<fo:block «XmlFoFormatManager.getStyleFor("footerEvenCenter")»><fo:inline «XmlFoFormatManager.getStyleFor("footerEvenCenterColor")»>«pdfFooterEvenCenter»</fo:inline></fo:block>
						</fo:table-cell>
						<fo:table-cell>
				      		<fo:block «XmlFoFormatManager.getStyleFor("footerEvenRight")»><fo:inline «XmlFoFormatManager.getStyleFor("footerEvenRightColor")»>«pdfFooterEvenRight»</fo:inline></fo:block>
						</fo:table-cell>
					</fo:table-body>
				</fo:table>
		    </fo:static-content>
		«ENDIF»
		«IF footerOddHasContent»
			<fo:static-content flow-name="footer-odd">
				<fo:table table-layout="fixed">
					<fo:table-column column-number="1" column-width='«PDF_BODY_FOOTER_ODD_LEFT_WIDTH»' text-align="«PDF_BODY_FOOTER_ODD_LEFT_ALIGNMENT»"/>
					<fo:table-column column-number="2" column-width="«PDF_BODY_FOOTER_ODD_CENTER_WIDTH»" text-align="«PDF_BODY_FOOTER_ODD_CENTER_ALIGNMENT»"/>
					<fo:table-column column-number="3" column-width="«PDF_BODY_FOOTER_ODD_RIGHT_WIDTH»" text-align="«PDF_BODY_FOOTER_ODD_RIGHT_ALIGNMENT»"/>
					<fo:table-body>
						<fo:table-cell>
				      		<fo:block «XmlFoFormatManager.getStyleFor("footerOddLeft")»><fo:inline «XmlFoFormatManager.getStyleFor("footerOddLeftColor")»>«pdfFooterOddLeft»</fo:inline></fo:block>
						</fo:table-cell>
						<fo:table-cell>
				      		<fo:block «XmlFoFormatManager.getStyleFor("footerOddCenter")»><fo:inline «XmlFoFormatManager.getStyleFor("footerOddCenterColor")»>«pdfFooterOddCenter»</fo:inline></fo:block>
						</fo:table-cell>
						<fo:table-cell>
				      		<fo:block «XmlFoFormatManager.getStyleFor("footerOddRight")»><fo:inline «XmlFoFormatManager.getStyleFor("footerOddRightColor")»>«pdfFooterOddRight»</fo:inline></fo:block>
						</fo:table-cell>
					</fo:table-body>
				</fo:table>
			</fo:static-content>	
		«ENDIF»
		    <fo:flow flow-name='xsl-region-body' text-align='left'>	
		'''


		documentClose = foArticleClose
 		cssPrefix = ""
		cssSuffix = ""
 		css = cssPrefix + "" + cssSuffix
 		emphasis = foEmphasis
 		emphasisTypeClose = foEmphasisTypeClose
 		tableOpen = foTableOpen
 		tableClose = foTableClose
		tgroupOpen = foTgroupOpen
		colspec1 = foColspec1
		colspec2 = foColspec2
		spanspec = foSpanspec
		theadOpen = foTheadOpen
		theadClose = foTheadEnd
		tbodyOpen = foTbodyOpen
		tbodyClose = foTbodyEnd
		tgroupClose = foTgroupEnd
		tableClose = foTableEnd
		sectionOpen = foSectionOpen
		close = foTagClose
		sectionClose = foSectionEnd
		rowOpen = foRowOpen
		rowClose = foRowClose
		if (l1_On && l2_On) {
			entryLeftOpen = foEntryLeftOpen
			entryRightOpen = foEntryRightOpen			
		} else {
			entryLeftOpen = foEntryMonoOpen
			entryRightOpen = foEntryMonoOpen			
		}
		entryClose = foEntryClose
		roleOpen = foRoleOpen
		roleClose = foRoleClose
		paraRoleOpen = foParaRoleOpen			
		paraRoleActor = foParaRoleActor
		paraRoleDialog = foParaRoleDialog
		paraRoleHymn = foParaRoleHymn
		paraRoleMedia = foParaRoleMedia
		paraRoleReading = foParaRoleReading
		paraRoleRubric = foParaRoleRubric
		paraRoleVerse = foParaRoleVerse
		paraClose = foParaClose
		subTitleOpen = foSubTitleRoleOpen
		subTitleClose = foSubTitleClose
		
		setHtmlSiteVariables // we put PDFs into the website
		
     }
     
     def void setFoComponents() {
		openTableData = openFoTable      
		closeTableData = closeFoTable
		preface = setPrefaceforFo
     }
     
     def void setPdfPreferences() {

		PDF_STYLESHEET = aresAccessor.preferences.pdfStylesheetPrefix 
			+ "_" + aresAccessor.preferences.pdfStylesheetVersion 
			+ ".ares"
	
		try {
			 XmlFoFormatManager.loadFromCss(aresAccessor.getResource(PDF_STYLESHEET))
		} catch (Exception e) {
			logger.catching(e)		
		}
	
		foTableOpen = foLb + foTableTagName + XmlFoFormatManager.getStyleFor(tagTable) + foRb

		foRowOpenKeepTogether = foLb + foRowTagName + foKeepRowTogether + XmlFoFormatManager.getStyleFor(tagTableRow) + foRb

		foEntryLeftOpen = foLb + foEntryTagName  + XmlFoFormatManager.getStyleFor(tagTableCellL1)  + foRoleClose
	
		foEntryRightOpen = foLb + foEntryTagName  + XmlFoFormatManager.getStyleFor(tagTableCellL2)  + foRoleClose
	
		foEntryMonoOpen = foLb + foEntryTagName  + XmlFoFormatManager.getStyleFor(tagTableCellMono)  + foRoleClose

		PDF_BODY_COLUMN_COUNT = aresAccessor.preferences.pdfBodyNbrColumns
		PDF_BODY_COLUMN_GAP = aresAccessor.preferences.pdfBodyColumnGap
	 
	    PDF_BODY_PAGE_EVEN_HEIGHT = aresAccessor.preferences.pdfBodyPageEvenHeight
		PDF_BODY_PAGE_EVEN_WIDTH = aresAccessor.preferences.pdfBodyPageEvenWidth
		PDF_BODY_PAGE_EVEN_MARGIN_TOP = aresAccessor.preferences.pdfBodyPageEvenMarginTop
		PDF_BODY_PAGE_EVEN_MARGIN_BOTTOM = aresAccessor.preferences.pdfBodyPageEvenMarginBottom
		PDF_BODY_PAGE_EVEN_MARGIN_LEFT = aresAccessor.preferences.pdfBodyPageEvenMarginLeft
		PDF_BODY_PAGE_EVEN_MARGIN_RIGHT = aresAccessor.preferences.pdfBodyPageEvenMarginRight
		
	
		PDF_BODY_PAGE_ODD_HEIGHT = aresAccessor.preferences.pdfBodyPageOddHeight
		PDF_BODY_PAGE_ODD_WIDTH = aresAccessor.preferences.pdfBodyPageOddWidth
		PDF_BODY_PAGE_ODD_MARGIN_TOP = aresAccessor.preferences.pdfBodyPageOddMarginTop
		PDF_BODY_PAGE_ODD_MARGIN_BOTTOM = aresAccessor.preferences.pdfBodyPageOddMarginBottom
		PDF_BODY_PAGE_ODD_MARGIN_LEFT = aresAccessor.preferences.pdfBodyPageOddMarginLeft
		PDF_BODY_PAGE_ODD_MARGIN_RIGHT = aresAccessor.preferences.pdfBodyPageOddMarginRight
		
	
		PDF_BODY_FOOTER_ODD_LEFT_WIDTH = aresAccessor.preferences.pdfBodyFooterOddLeftWidth
		PDF_BODY_FOOTER_ODD_LEFT_ALIGNMENT = aresAccessor.preferences.pdfBodyFooterOddLeftAlignment
		PDF_BODY_FOOTER_ODD_CENTER_WIDTH = aresAccessor.preferences.pdfBodyFooterOddCenterWidth
		PDF_BODY_FOOTER_ODD_CENTER_ALIGNMENT = aresAccessor.preferences.pdfBodyFooterOddCenterAlignment
		PDF_BODY_FOOTER_ODD_RIGHT_WIDTH = aresAccessor.preferences.pdfBodyFooterOddRightWidth
		PDF_BODY_FOOTER_ODD_RIGHT_ALIGNMENT = aresAccessor.preferences.pdfBodyFooterOddRightAlignment
		
		PDF_BODY_FOOTER_EVEN_LEFT_WIDTH = aresAccessor.preferences.pdfBodyFooterEvenLeftWidth
		PDF_BODY_FOOTER_EVEN_LEFT_ALIGNMENT = aresAccessor.preferences.pdfBodyFooterEvenLeftAlignment
		PDF_BODY_FOOTER_EVEN_CENTER_WIDTH = aresAccessor.preferences.pdfBodyFooterEvenCenterWidth
		PDF_BODY_FOOTER_EVEN_CENTER_ALIGNMENT = aresAccessor.preferences.pdfBodyFooterEvenCenterAlignment
		PDF_BODY_FOOTER_EVEN_RIGHT_WIDTH = aresAccessor.preferences.pdfBodyFooterEvenRightWidth
		PDF_BODY_FOOTER_EVEN_RIGHT_ALIGNMENT = aresAccessor.preferences.pdfBodyFooterEvenRightAlignment
	
		PDF_BODY_HEADER_ODD_LEFT_WIDTH = aresAccessor.preferences.pdfBodyHeaderOddLeftWidth
		PDF_BODY_HEADER_ODD_LEFT_ALIGNMENT = aresAccessor.preferences.pdfBodyHeaderOddLeftAlignment
		PDF_BODY_HEADER_ODD_CENTER_WIDTH = aresAccessor.preferences.pdfBodyHeaderOddCenterWidth
		PDF_BODY_HEADER_ODD_CENTER_ALIGNMENT = aresAccessor.preferences.pdfBodyHeaderOddCenterAlignment
		PDF_BODY_HEADER_ODD_RIGHT_WIDTH = aresAccessor.preferences.pdfBodyHeaderOddRightWidth
		PDF_BODY_HEADER_ODD_RIGHT_ALIGNMENT = aresAccessor.preferences.pdfBodyHeaderOddRightAlignment
		
		PDF_BODY_HEADER_EVEN_LEFT_WIDTH = aresAccessor.preferences.pdfBodyHeaderEvenLeftWidth
		PDF_BODY_HEADER_EVEN_LEFT_ALIGNMENT = aresAccessor.preferences.pdfBodyHeaderEvenLeftAlignment
		PDF_BODY_HEADER_EVEN_CENTER_WIDTH = aresAccessor.preferences.pdfBodyHeaderEvenCenterWidth
		PDF_BODY_HEADER_EVEN_CENTER_ALIGNMENT = aresAccessor.preferences.pdfBodyHeaderEvenCenterAlignment
		PDF_BODY_HEADER_EVEN_RIGHT_WIDTH = aresAccessor.preferences.pdfBodyHeaderEvenRightWidth
		PDF_BODY_HEADER_EVEN_RIGHT_ALIGNMENT = aresAccessor.preferences.pdfBodyHeaderEvenRightAlignment

    }
     
     /**
      * The following four methods are used to determine whether to add static footer / header statements when generating XML FO
      */
     def boolean headerOddHasContent() {
     	(pdfHeaderOddLeft != foNonBreakingSpace || pdfHeaderOddCenter != foNonBreakingSpace || pdfHeaderOddRight != foNonBreakingSpace)
     }
     def boolean headerEvenHasContent() {
     	(pdfHeaderEvenLeft != foNonBreakingSpace || pdfHeaderEvenCenter != foNonBreakingSpace || pdfHeaderEvenRight != foNonBreakingSpace)
     }
     def boolean footerOddHasContent() {
     	(pdfFooterOddLeft != foNonBreakingSpace || pdfFooterOddCenter != foNonBreakingSpace || pdfFooterOddRight != foNonBreakingSpace)
     }
     def boolean footerEvenHasContent() {
     	(pdfFooterEvenLeft != foNonBreakingSpace || pdfFooterEvenCenter != foNonBreakingSpace || pdfFooterEvenRight != foNonBreakingSpace)
     }
}
