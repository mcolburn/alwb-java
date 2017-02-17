package net.ages.workbench.templates.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.ages.workbench.templates.dsl.atem.Actor;
import net.ages.workbench.templates.dsl.atem.Aid;
import net.ages.workbench.templates.dsl.atem.All;
import net.ages.workbench.templates.dsl.atem.AtemModel;
import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.Block;
import net.ages.workbench.templates.dsl.atem.Break;
import net.ages.workbench.templates.dsl.atem.Commemoration;
import net.ages.workbench.templates.dsl.atem.DOL;
import net.ages.workbench.templates.dsl.atem.DOM;
import net.ages.workbench.templates.dsl.atem.DOP;
import net.ages.workbench.templates.dsl.atem.DOWN;
import net.ages.workbench.templates.dsl.atem.DOWT;
import net.ages.workbench.templates.dsl.atem.Date;
import net.ages.workbench.templates.dsl.atem.DateRange;
import net.ages.workbench.templates.dsl.atem.DateSet;
import net.ages.workbench.templates.dsl.atem.DayNameRange;
import net.ages.workbench.templates.dsl.atem.DayNameSet;
import net.ages.workbench.templates.dsl.atem.DayRange;
import net.ages.workbench.templates.dsl.atem.DaySet;
import net.ages.workbench.templates.dsl.atem.Dialog;
import net.ages.workbench.templates.dsl.atem.Driver;
import net.ages.workbench.templates.dsl.atem.EOW;
import net.ages.workbench.templates.dsl.atem.GenDate;
import net.ages.workbench.templates.dsl.atem.GenYear;
import net.ages.workbench.templates.dsl.atem.Head;
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumnCenter;
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumnLeft;
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumnRight;
import net.ages.workbench.templates.dsl.atem.HeaderFooterCommemoration;
import net.ages.workbench.templates.dsl.atem.HeaderFooterDate;
import net.ages.workbench.templates.dsl.atem.HeaderFooterLookup;
import net.ages.workbench.templates.dsl.atem.HeaderFooterPageNumber;
import net.ages.workbench.templates.dsl.atem.HeaderFooterText;
import net.ages.workbench.templates.dsl.atem.HeaderFooterTitle;
import net.ages.workbench.templates.dsl.atem.Heading1;
import net.ages.workbench.templates.dsl.atem.Heading2;
import net.ages.workbench.templates.dsl.atem.Heading3;
import net.ages.workbench.templates.dsl.atem.Hymn;
import net.ages.workbench.templates.dsl.atem.Import;
import net.ages.workbench.templates.dsl.atem.Info;
import net.ages.workbench.templates.dsl.atem.LDP;
import net.ages.workbench.templates.dsl.atem.LitBook;
import net.ages.workbench.templates.dsl.atem.Lookup;
import net.ages.workbench.templates.dsl.atem.MCD;
import net.ages.workbench.templates.dsl.atem.MOW;
import net.ages.workbench.templates.dsl.atem.McDay;
import net.ages.workbench.templates.dsl.atem.Media;
import net.ages.workbench.templates.dsl.atem.ModeOfWeekSet;
import net.ages.workbench.templates.dsl.atem.NOP;
import net.ages.workbench.templates.dsl.atem.PageFooterEven;
import net.ages.workbench.templates.dsl.atem.PageFooterOdd;
import net.ages.workbench.templates.dsl.atem.PageHeaderEven;
import net.ages.workbench.templates.dsl.atem.PageHeaderOdd;
import net.ages.workbench.templates.dsl.atem.PageKeepWithNext;
import net.ages.workbench.templates.dsl.atem.PageNumber;
import net.ages.workbench.templates.dsl.atem.Paragraph;
import net.ages.workbench.templates.dsl.atem.PassThroughHtml;
import net.ages.workbench.templates.dsl.atem.PassThroughPdf;
import net.ages.workbench.templates.dsl.atem.Preface;
import net.ages.workbench.templates.dsl.atem.PrefaceFragment;
import net.ages.workbench.templates.dsl.atem.Reading;
import net.ages.workbench.templates.dsl.atem.ResourceText;
import net.ages.workbench.templates.dsl.atem.RestoreLocale;
import net.ages.workbench.templates.dsl.atem.Rubric;
import net.ages.workbench.templates.dsl.atem.SAEC;
import net.ages.workbench.templates.dsl.atem.SBT;
import net.ages.workbench.templates.dsl.atem.SOL;
import net.ages.workbench.templates.dsl.atem.Section;
import net.ages.workbench.templates.dsl.atem.SectionFragment;
import net.ages.workbench.templates.dsl.atem.SetLocale;
import net.ages.workbench.templates.dsl.atem.SubTitle;
import net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase;
import net.ages.workbench.templates.dsl.atem.TaggedText;
import net.ages.workbench.templates.dsl.atem.TemplateFragment;
import net.ages.workbench.templates.dsl.atem.TemplateStatus;
import net.ages.workbench.templates.dsl.atem.TemplateTitle;
import net.ages.workbench.templates.dsl.atem.Title;
import net.ages.workbench.templates.dsl.atem.Verse;
import net.ages.workbench.templates.dsl.atem.Version;
import net.ages.workbench.templates.dsl.atem.VersionSwitch;
import net.ages.workbench.templates.dsl.atem.WDOLC;
import net.ages.workbench.templates.dsl.atem.WOLC;
import net.ages.workbench.templates.dsl.atem.WhenDate;
import net.ages.workbench.templates.dsl.atem.WhenDateCase;
import net.ages.workbench.templates.dsl.atem.WhenDayName;
import net.ages.workbench.templates.dsl.atem.WhenDayNameCase;
import net.ages.workbench.templates.dsl.atem.WhenExists;
import net.ages.workbench.templates.dsl.atem.WhenExistsCase;
import net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay;
import net.ages.workbench.templates.dsl.atem.WhenModeOfWeek;
import net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase;
import net.ages.workbench.templates.dsl.atem.WhenMovableCycleDay;
import net.ages.workbench.templates.dsl.atem.WhenOther;
import net.ages.workbench.templates.dsl.atem.WhenPascha;
import net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay;
import net.ages.workbench.templates.dsl.atem.WhenPeriodCase;
import net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay;
import net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion;
import net.ages.workbench.templates.dsl.atem.WhenTriodionDay;
import net.ages.workbench.templates.dsl.services.AtemGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AtemSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AtemGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AtemPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AtemPackage.ACTOR:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getActorRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Actor(context, (Actor) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.AID:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getAidRule()) {
					sequence_Aid(context, (Aid) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.ALL:
				if(context == grammarAccess.getAllRule() ||
				   context == grammarAccess.getLdpTypeRule()) {
					sequence_All(context, (All) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.ATEM_MODEL:
				if(context == grammarAccess.getAtemModelRule()) {
					sequence_AtemModel(context, (AtemModel) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.BLOCK:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getInfoElementTypeRule() ||
				   context == grammarAccess.getPrefaceElementTypeRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.BREAK:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getBreakRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Break(context, (Break) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.COMMEMORATION:
				if(context == grammarAccess.getCommemorationRule() ||
				   context == grammarAccess.getHeadComponentRule()) {
					sequence_Commemoration(context, (Commemoration) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DOL:
				if(context == grammarAccess.getDOLRule() ||
				   context == grammarAccess.getLdpTypeRule()) {
					sequence_DOL(context, (DOL) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DOM:
				if(context == grammarAccess.getDOMRule() ||
				   context == grammarAccess.getLdpTypeRule()) {
					sequence_DOM(context, (DOM) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DOP:
				if(context == grammarAccess.getDOPRule() ||
				   context == grammarAccess.getLdpTypeRule()) {
					sequence_DOP(context, (DOP) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DOWN:
				if(context == grammarAccess.getDOWNRule() ||
				   context == grammarAccess.getLdpTypeRule()) {
					sequence_DOWN(context, (DOWN) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DOWT:
				if(context == grammarAccess.getDOWTRule() ||
				   context == grammarAccess.getLdpTypeRule()) {
					sequence_DOWT(context, (DOWT) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DATE:
				if(context == grammarAccess.getDateRule() ||
				   context == grammarAccess.getHeadComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Date(context, (Date) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DATE_RANGE:
				if(context == grammarAccess.getAbstractDateCaseRule() ||
				   context == grammarAccess.getDateRangeRule()) {
					sequence_DateRange(context, (DateRange) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DATE_SET:
				if(context == grammarAccess.getAbstractDateCaseRule() ||
				   context == grammarAccess.getDateSetRule()) {
					sequence_DateSet(context, (DateSet) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DAY_NAME_RANGE:
				if(context == grammarAccess.getAbstractDayNameCaseRule() ||
				   context == grammarAccess.getDayNameRangeRule()) {
					sequence_DayNameRange(context, (DayNameRange) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DAY_NAME_SET:
				if(context == grammarAccess.getAbstractDayNameCaseRule() ||
				   context == grammarAccess.getDayNameSetRule()) {
					sequence_DayNameSet(context, (DayNameSet) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DAY_RANGE:
				if(context == grammarAccess.getAbstractDayCaseRule() ||
				   context == grammarAccess.getDayRangeRule()) {
					sequence_DayRange(context, (DayRange) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DAY_SET:
				if(context == grammarAccess.getAbstractDayCaseRule() ||
				   context == grammarAccess.getDaySetRule()) {
					sequence_DaySet(context, (DaySet) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DIALOG:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getDialogRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Dialog(context, (Dialog) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.DRIVER:
				if(context == grammarAccess.getDriverRule()) {
					sequence_Driver(context, (Driver) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.EOW:
				if(context == grammarAccess.getEOWRule() ||
				   context == grammarAccess.getLdpTypeRule()) {
					sequence_EOW(context, (EOW) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.GEN_DATE:
				if(context == grammarAccess.getGenDateRule() ||
				   context == grammarAccess.getLdpTypeRule()) {
					sequence_GenDate(context, (GenDate) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.GEN_YEAR:
				if(context == grammarAccess.getGenYearRule() ||
				   context == grammarAccess.getLdpTypeRule()) {
					sequence_GenYear(context, (GenYear) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HEAD:
				if(context == grammarAccess.getHeadRule()) {
					sequence_Head(context, (Head) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HEADER_FOOTER_COLUMN_CENTER:
				if(context == grammarAccess.getHeaderFooterColumnRule() ||
				   context == grammarAccess.getHeaderFooterColumnCenterRule()) {
					sequence_HeaderFooterColumnCenter(context, (HeaderFooterColumnCenter) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HEADER_FOOTER_COLUMN_LEFT:
				if(context == grammarAccess.getHeaderFooterColumnRule() ||
				   context == grammarAccess.getHeaderFooterColumnLeftRule()) {
					sequence_HeaderFooterColumnLeft(context, (HeaderFooterColumnLeft) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HEADER_FOOTER_COLUMN_RIGHT:
				if(context == grammarAccess.getHeaderFooterColumnRule() ||
				   context == grammarAccess.getHeaderFooterColumnRightRule()) {
					sequence_HeaderFooterColumnRight(context, (HeaderFooterColumnRight) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HEADER_FOOTER_COMMEMORATION:
				if(context == grammarAccess.getHeaderFooterCommemorationRule() ||
				   context == grammarAccess.getHeaderFooterFragmentRule()) {
					sequence_HeaderFooterCommemoration(context, (HeaderFooterCommemoration) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HEADER_FOOTER_DATE:
				if(context == grammarAccess.getHeaderFooterDateRule() ||
				   context == grammarAccess.getHeaderFooterFragmentRule()) {
					sequence_HeaderFooterDate(context, (HeaderFooterDate) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HEADER_FOOTER_LOOKUP:
				if(context == grammarAccess.getHeaderFooterFragmentRule() ||
				   context == grammarAccess.getHeaderFooterLookupRule()) {
					sequence_HeaderFooterLookup(context, (HeaderFooterLookup) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HEADER_FOOTER_PAGE_NUMBER:
				if(context == grammarAccess.getHeaderFooterFragmentRule() ||
				   context == grammarAccess.getHeaderFooterPageNumberRule()) {
					sequence_HeaderFooterPageNumber(context, (HeaderFooterPageNumber) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HEADER_FOOTER_TEXT:
				if(context == grammarAccess.getHeaderFooterFragmentRule() ||
				   context == grammarAccess.getHeaderFooterTextRule()) {
					sequence_HeaderFooterText(context, (HeaderFooterText) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HEADER_FOOTER_TITLE:
				if(context == grammarAccess.getHeaderFooterFragmentRule() ||
				   context == grammarAccess.getHeaderFooterTitleRule()) {
					sequence_HeaderFooterTitle(context, (HeaderFooterTitle) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HEADING1:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getHeading1Rule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Heading1(context, (Heading1) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HEADING2:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getHeading2Rule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Heading2(context, (Heading2) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HEADING3:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getHeading3Rule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Heading3(context, (Heading3) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.HYMN:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getHymnRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Hymn(context, (Hymn) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.INFO:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getInfoRule()) {
					sequence_Info(context, (Info) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.LDP:
				if(context == grammarAccess.getElementTypeRule() ||
				   context == grammarAccess.getLDPRule()) {
					sequence_LDP(context, (LDP) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.LIT_BOOK:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getLitBookRule()) {
					sequence_LitBook(context, (LitBook) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.LOOKUP:
				if(context == grammarAccess.getElementTypeRule() ||
				   context == grammarAccess.getLookupRule()) {
					sequence_Lookup(context, (Lookup) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.MCD:
				if(context == grammarAccess.getLdpTypeRule() ||
				   context == grammarAccess.getMCDRule()) {
					sequence_MCD(context, (MCD) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.MOW:
				if(context == grammarAccess.getLdpTypeRule() ||
				   context == grammarAccess.getMOWRule()) {
					sequence_MOW(context, (MOW) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.MC_DAY:
				if(context == grammarAccess.getHeadComponentRule() ||
				   context == grammarAccess.getMcDayRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_McDay(context, (McDay) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.MEDIA:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getMediaRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Media(context, (Media) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.MODE_OF_WEEK_SET:
				if(context == grammarAccess.getModeOfWeekSetRule()) {
					sequence_ModeOfWeekSet(context, (ModeOfWeekSet) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.NOP:
				if(context == grammarAccess.getLdpTypeRule() ||
				   context == grammarAccess.getNOPRule()) {
					sequence_NOP(context, (NOP) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.PAGE_FOOTER_EVEN:
				if(context == grammarAccess.getHeadComponentRule() ||
				   context == grammarAccess.getPageFooterEvenRule()) {
					sequence_PageFooterEven(context, (PageFooterEven) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.PAGE_FOOTER_ODD:
				if(context == grammarAccess.getHeadComponentRule() ||
				   context == grammarAccess.getPageFooterOddRule()) {
					sequence_PageFooterOdd(context, (PageFooterOdd) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.PAGE_HEADER_EVEN:
				if(context == grammarAccess.getHeadComponentRule() ||
				   context == grammarAccess.getPageHeaderEvenRule()) {
					sequence_PageHeaderEven(context, (PageHeaderEven) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.PAGE_HEADER_ODD:
				if(context == grammarAccess.getHeadComponentRule() ||
				   context == grammarAccess.getPageHeaderOddRule()) {
					sequence_PageHeaderOdd(context, (PageHeaderOdd) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.PAGE_KEEP_WITH_NEXT:
				if(context == grammarAccess.getHeadComponentRule() ||
				   context == grammarAccess.getPageKeepWithNextRule()) {
					sequence_PageKeepWithNext(context, (PageKeepWithNext) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.PAGE_NUMBER:
				if(context == grammarAccess.getHeadComponentRule() ||
				   context == grammarAccess.getPageNumberRule()) {
					sequence_PageNumber(context, (PageNumber) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.PARAGRAPH:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getInfoElementTypeRule() ||
				   context == grammarAccess.getParagraphRule() ||
				   context == grammarAccess.getPrefaceElementTypeRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Paragraph(context, (Paragraph) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.PASS_THROUGH_HTML:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getPassThroughHtmlRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_PassThroughHtml(context, (PassThroughHtml) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.PASS_THROUGH_PDF:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getPassThroughPdfRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_PassThroughPdf(context, (PassThroughPdf) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.PREFACE:
				if(context == grammarAccess.getPrefaceRule()) {
					sequence_Preface(context, (Preface) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.PREFACE_FRAGMENT:
				if(context == grammarAccess.getPrefaceFragmentRule()) {
					sequence_PrefaceFragment(context, (PrefaceFragment) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.READING:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getReadingRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Reading(context, (Reading) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.RESOURCE_TEXT:
				if(context == grammarAccess.getElementTypeRule() ||
				   context == grammarAccess.getResourceTextRule()) {
					sequence_ResourceText(context, (ResourceText) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.RESTORE_LOCALE:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getRestoreLocaleRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_RestoreLocale(context, (RestoreLocale) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.RUBRIC:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getRubricRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Rubric(context, (Rubric) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.SAEC:
				if(context == grammarAccess.getLdpTypeRule() ||
				   context == grammarAccess.getSAECRule()) {
					sequence_SAEC(context, (SAEC) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.SBT:
				if(context == grammarAccess.getLdpTypeRule() ||
				   context == grammarAccess.getSBTRule()) {
					sequence_SBT(context, (SBT) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.SOL:
				if(context == grammarAccess.getLdpTypeRule() ||
				   context == grammarAccess.getSOLRule()) {
					sequence_SOL(context, (SOL) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.SECTION:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getPrefaceElementTypeRule() ||
				   context == grammarAccess.getSectionRule() ||
				   context == grammarAccess.getSectionElementTypeRule()) {
					sequence_Section(context, (Section) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.SECTION_FRAGMENT:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getPrefaceElementTypeRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getSectionFragmentRule()) {
					sequence_SectionFragment(context, (SectionFragment) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.SET_LOCALE:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getSetLocaleRule()) {
					sequence_SetLocale(context, (SetLocale) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.SUB_TITLE:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getInfoElementTypeRule() ||
				   context == grammarAccess.getPrefaceElementTypeRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getSubTitleRule()) {
					sequence_SubTitle(context, (SubTitle) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE:
				if(context == grammarAccess.getSundaysBeforeTriodionCaseRule()) {
					sequence_SundaysBeforeTriodionCase(context, (SundaysBeforeTriodionCase) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.TAGGED_TEXT:
				if(context == grammarAccess.getElementTypeRule() ||
				   context == grammarAccess.getTaggedTextRule()) {
					sequence_TaggedText(context, (TaggedText) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.TEMPLATE_FRAGMENT:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getPrefaceElementTypeRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getTemplateFragmentRule()) {
					sequence_TemplateFragment(context, (TemplateFragment) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.TEMPLATE_STATUS:
				if(context == grammarAccess.getTemplateStatusRule()) {
					sequence_TemplateStatus(context, (TemplateStatus) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.TEMPLATE_TITLE:
				if(context == grammarAccess.getHeadComponentRule() ||
				   context == grammarAccess.getTemplateTitleRule()) {
					sequence_TemplateTitle(context, (TemplateTitle) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.TITLE:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getInfoElementTypeRule() ||
				   context == grammarAccess.getPrefaceElementTypeRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getTitleRule()) {
					sequence_Title(context, (Title) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.VERSE:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getVerseRule()) {
					sequence_Verse(context, (Verse) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.VERSION:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getVersionRule()) {
					sequence_Version(context, (Version) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.VERSION_SWITCH:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getInfoElementTypeRule() ||
				   context == grammarAccess.getPrefaceElementTypeRule() ||
				   context == grammarAccess.getVersionSwitchRule()) {
					sequence_VersionSwitch(context, (VersionSwitch) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WDOLC:
				if(context == grammarAccess.getLdpTypeRule() ||
				   context == grammarAccess.getWDOLCRule()) {
					sequence_WDOLC(context, (WDOLC) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WOLC:
				if(context == grammarAccess.getLdpTypeRule() ||
				   context == grammarAccess.getWOLCRule()) {
					sequence_WOLC(context, (WOLC) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_DATE:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getWhenDateRule()) {
					sequence_WhenDate(context, (WhenDate) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_DATE_CASE:
				if(context == grammarAccess.getWhenDateCaseRule()) {
					sequence_WhenDateCase(context, (WhenDateCase) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_DAY_NAME:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getWhenDayNameRule()) {
					sequence_WhenDayName(context, (WhenDayName) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_DAY_NAME_CASE:
				if(context == grammarAccess.getWhenDayNameCaseRule()) {
					sequence_WhenDayNameCase(context, (WhenDayNameCase) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_EXISTS:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getWhenExistsRule()) {
					sequence_WhenExists(context, (WhenExists) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_EXISTS_CASE:
				if(context == grammarAccess.getWhenExistsCaseRule()) {
					sequence_WhenExistsCase(context, (WhenExistsCase) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_LUKAN_CYCLE_DAY:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getWhenLukanCycleDayRule()) {
					sequence_WhenLukanCycleDay(context, (WhenLukanCycleDay) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_MODE_OF_WEEK:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getWhenModeOfWeekRule()) {
					sequence_WhenModeOfWeek(context, (WhenModeOfWeek) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_MODE_OF_WEEK_CASE:
				if(context == grammarAccess.getWhenModeOfWeekCaseRule()) {
					sequence_WhenModeOfWeekCase(context, (WhenModeOfWeekCase) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_MOVABLE_CYCLE_DAY:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getWhenMovableCycleDayRule()) {
					sequence_WhenMovableCycleDay(context, (WhenMovableCycleDay) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_OTHER:
				if(context == grammarAccess.getWhenOtherRule()) {
					sequence_WhenOther(context, (WhenOther) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_PASCHA:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getWhenPaschaRule()) {
					sequence_WhenPascha(context, (WhenPascha) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_PENTECOSTARION_DAY:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getWhenPentecostarionDayRule()) {
					sequence_WhenPentecostarionDay(context, (WhenPentecostarionDay) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_PERIOD_CASE:
				if(context == grammarAccess.getWhenPeriodCaseRule()) {
					sequence_WhenPeriodCase(context, (WhenPeriodCase) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getWhenSundayAfterElevationOfCrossDayRule()) {
					sequence_WhenSundayAfterElevationOfCrossDay(context, (WhenSundayAfterElevationOfCrossDay) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getWhenSundaysBeforeTriodionRule()) {
					sequence_WhenSundaysBeforeTriodion(context, (WhenSundaysBeforeTriodion) semanticObject); 
					return; 
				}
				else break;
			case AtemPackage.WHEN_TRIODION_DAY:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getSectionElementTypeRule() ||
				   context == grammarAccess.getWhenTriodionDayRule()) {
					sequence_WhenTriodionDay(context, (WhenTriodionDay) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     dsl_Elements+=ElementType+
	 */
	protected void sequence_Actor(EObject context, Actor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_Aid(EObject context, Aid semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.AID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.AID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAidAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_LiturgicalDayProperties?='@All_Liturgical_Day_Properties'
	 */
	protected void sequence_All(EObject context, All semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.ALL__DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.ALL__DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAllAccess().getDsl_Display_LiturgicalDayPropertiesAll_Liturgical_Day_PropertiesKeyword_0(), semanticObject.isDsl_Display_LiturgicalDayProperties());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QualifiedName 
	 *         dsl_Template_Status=TemplateStatus? 
	 *         imports+=Import* 
	 *         dsl_Template_Driver=Driver? 
	 *         dsl_Template_head=Head? 
	 *         dsl_Template_preface=Preface? 
	 *         dsl_Template_components+=AbstractComponent*
	 *     )
	 */
	protected void sequence_AtemModel(EObject context, AtemModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_Block_Role=[Definition|QualifiedName] dsl_Elements+=ElementType*)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_break_type=BreakType
	 */
	protected void sequence_Break(EObject context, Break semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.BREAK__DSL_BREAK_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.BREAK__DSL_BREAK_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBreakAccess().getDsl_break_typeBreakTypeEnumRuleCall_1_0(), semanticObject.getDsl_break_type());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Commemoration_Elements+=HeaderFooterFragment+
	 */
	protected void sequence_Commemoration(EObject context, Commemoration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_DayLukan?='@Lukan_Cycle_Elapsed_Days'
	 */
	protected void sequence_DOL(EObject context, DOL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.DOL__DSL_DISPLAY_DAY_LUKAN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.DOL__DSL_DISPLAY_DAY_LUKAN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDOLAccess().getDsl_Display_DayLukanLukan_Cycle_Elapsed_DaysKeyword_0(), semanticObject.isDsl_Display_DayLukan());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_Mode?='@Day_of_Month'
	 */
	protected void sequence_DOM(EObject context, DOM semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.DOM__DSL_DISPLAY_MODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.DOM__DSL_DISPLAY_MODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDOMAccess().getDsl_Display_ModeDay_of_MonthKeyword_0(), semanticObject.isDsl_Display_Mode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_Mode?='@Day_of_Period'
	 */
	protected void sequence_DOP(EObject context, DOP semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.DOP__DSL_DISPLAY_MODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.DOP__DSL_DISPLAY_MODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDOPAccess().getDsl_Display_ModeDay_of_PeriodKeyword_0(), semanticObject.isDsl_Display_Mode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_Mode?='@Day_of_Week_As_Number'
	 */
	protected void sequence_DOWN(EObject context, DOWN semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.DOWN__DSL_DISPLAY_MODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.DOWN__DSL_DISPLAY_MODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDOWNAccess().getDsl_Display_ModeDay_of_Week_As_NumberKeyword_0(), semanticObject.isDsl_Display_Mode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_Mode?='@Day_of_Week_As_Text'
	 */
	protected void sequence_DOWT(EObject context, DOWT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.DOWT__DSL_DISPLAY_MODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.DOWT__DSL_DISPLAY_MODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDOWTAccess().getDsl_Display_ModeDay_of_Week_As_TextKeyword_0(), semanticObject.isDsl_Display_Mode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_DateRange_from=INT dsl_DateRange_To=INT)
	 */
	protected void sequence_DateRange(EObject context, DateRange semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.DATE_RANGE__DSL_DATE_RANGE_FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.DATE_RANGE__DSL_DATE_RANGE_FROM));
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.DATE_RANGE__DSL_DATE_RANGE_TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.DATE_RANGE__DSL_DATE_RANGE_TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDateRangeAccess().getDsl_DateRange_fromINTTerminalRuleCall_0_0(), semanticObject.getDsl_DateRange_from());
		feeder.accept(grammarAccess.getDateRangeAccess().getDsl_DateRange_ToINTTerminalRuleCall_2_0(), semanticObject.getDsl_DateRange_To());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dslDateSet_Values+=INT dslDateSet_Values+=INT*)
	 */
	protected void sequence_DateSet(EObject context, DateSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_Date_month=INT dsl_Date_day=INT dsl_Date_year=INT?)
	 */
	protected void sequence_Date(EObject context, Date semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_DayNameRange_from=DayOfWeek dsl_DayNameRange_To=DayOfWeek)
	 */
	protected void sequence_DayNameRange(EObject context, DayNameRange semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_FROM));
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDayNameRangeAccess().getDsl_DayNameRange_fromDayOfWeekEnumRuleCall_0_0(), semanticObject.getDsl_DayNameRange_from());
		feeder.accept(grammarAccess.getDayNameRangeAccess().getDsl_DayNameRange_ToDayOfWeekEnumRuleCall_2_0(), semanticObject.getDsl_DayNameRange_To());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dslDayNameSet_Values+=DayOfWeek dslDayNameSet_Values+=DayOfWeek*)
	 */
	protected void sequence_DayNameSet(EObject context, DayNameSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_DayRange_from=INT dsl_Range_To=INT)
	 */
	protected void sequence_DayRange(EObject context, DayRange semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.DAY_RANGE__DSL_DAY_RANGE_FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.DAY_RANGE__DSL_DAY_RANGE_FROM));
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.DAY_RANGE__DSL_RANGE_TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.DAY_RANGE__DSL_RANGE_TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDayRangeAccess().getDsl_DayRange_fromINTTerminalRuleCall_0_0(), semanticObject.getDsl_DayRange_from());
		feeder.accept(grammarAccess.getDayRangeAccess().getDsl_Range_ToINTTerminalRuleCall_2_0(), semanticObject.getDsl_Range_To());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dslSetValue_Days+=INT dslSetValue_Days+=INT*)
	 */
	protected void sequence_DaySet(EObject context, DaySet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Elements+=ElementType+
	 */
	protected void sequence_Dialog(EObject context, Dialog semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_Driver_RegEx=STRING dsl_Driver_Status=TemplateStatuses?)
	 */
	protected void sequence_Driver(EObject context, Driver semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_Eothinon?='@Eothinon'
	 */
	protected void sequence_EOW(EObject context, EOW semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.EOW__DSL_DISPLAY_EOTHINON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.EOW__DSL_DISPLAY_EOTHINON));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEOWAccess().getDsl_Display_EothinonEothinonKeyword_0(), semanticObject.isDsl_Display_Eothinon());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_Date?='@Service_Date'
	 */
	protected void sequence_GenDate(EObject context, GenDate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.GEN_DATE__DSL_DISPLAY_DATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.GEN_DATE__DSL_DISPLAY_DATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGenDateAccess().getDsl_Display_DateService_DateKeyword_0(), semanticObject.isDsl_Display_Date());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_Year?='@Service_Year'
	 */
	protected void sequence_GenYear(EObject context, GenYear semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.GEN_YEAR__DSL_DISPLAY_YEAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.GEN_YEAR__DSL_DISPLAY_YEAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGenYearAccess().getDsl_Display_YearService_YearKeyword_0(), semanticObject.isDsl_Display_Year());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Head_components+=HeadComponent+
	 */
	protected void sequence_Head(EObject context, Head semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_HeaderFooterColumn_fragments+=HeaderFooterFragment+
	 */
	protected void sequence_HeaderFooterColumnCenter(EObject context, HeaderFooterColumnCenter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_HeaderFooterColumn_fragments+=HeaderFooterFragment+
	 */
	protected void sequence_HeaderFooterColumnLeft(EObject context, HeaderFooterColumnLeft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_HeaderFooterColumn_fragments+=HeaderFooterFragment+
	 */
	protected void sequence_HeaderFooterColumnRight(EObject context, HeaderFooterColumnRight semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_HeaderFooterCommemoration?='@commemoration'
	 */
	protected void sequence_HeaderFooterCommemoration(EObject context, HeaderFooterCommemoration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.HEADER_FOOTER_COMMEMORATION__DSL_HEADER_FOOTER_COMMEMORATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.HEADER_FOOTER_COMMEMORATION__DSL_HEADER_FOOTER_COMMEMORATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeaderFooterCommemorationAccess().getDsl_HeaderFooterCommemorationCommemorationKeyword_0(), semanticObject.isDsl_HeaderFooterCommemoration());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_HeaderFooterDate?='@date' dsl_HeaderFooterDate_Language=Language?)
	 */
	protected void sequence_HeaderFooterDate(EObject context, HeaderFooterDate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_HeaderFooterLookup_Elements+=ElementType* dsl_HeaderFooterLookup_Language=Language)
	 */
	protected void sequence_HeaderFooterLookup(EObject context, HeaderFooterLookup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_HeaderFooterPageNumber?='@pageNbr'
	 */
	protected void sequence_HeaderFooterPageNumber(EObject context, HeaderFooterPageNumber semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.HEADER_FOOTER_PAGE_NUMBER__DSL_HEADER_FOOTER_PAGE_NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.HEADER_FOOTER_PAGE_NUMBER__DSL_HEADER_FOOTER_PAGE_NUMBER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeaderFooterPageNumberAccess().getDsl_HeaderFooterPageNumberPageNbrKeyword_0(), semanticObject.isDsl_HeaderFooterPageNumber());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_HeaderFooterText=STRING
	 */
	protected void sequence_HeaderFooterText(EObject context, HeaderFooterText semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.HEADER_FOOTER_TEXT__DSL_HEADER_FOOTER_TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.HEADER_FOOTER_TEXT__DSL_HEADER_FOOTER_TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeaderFooterTextAccess().getDsl_HeaderFooterTextSTRINGTerminalRuleCall_1_0(), semanticObject.getDsl_HeaderFooterText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_HeaderFooterTitle?='@title'
	 */
	protected void sequence_HeaderFooterTitle(EObject context, HeaderFooterTitle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.HEADER_FOOTER_TITLE__DSL_HEADER_FOOTER_TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.HEADER_FOOTER_TITLE__DSL_HEADER_FOOTER_TITLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeaderFooterTitleAccess().getDsl_HeaderFooterTitleTitleKeyword_0(), semanticObject.isDsl_HeaderFooterTitle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Elements+=ElementType+
	 */
	protected void sequence_Heading1(EObject context, Heading1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Elements+=ElementType+
	 */
	protected void sequence_Heading2(EObject context, Heading2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Elements+=ElementType+
	 */
	protected void sequence_Heading3(EObject context, Heading3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Elements+=ElementType+
	 */
	protected void sequence_Hymn(EObject context, Hymn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildCard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dsl_Info_Elements+=InfoElementType*)
	 */
	protected void sequence_Info(EObject context, Info semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_LDP+=LdpType*
	 */
	protected void sequence_LDP(EObject context, LDP semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_LitBook(EObject context, LitBook semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.LIT_BOOK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.LIT_BOOK__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLitBookAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         dsl_ResourceTextRef=[Definition|QualifiedName] 
	 *         dsl_Lookup_Version?='@ver'? 
	 *         dsl_Lookup_Media_Off?='media-off'? 
	 *         (dsl_Lookup_Override_Mode_Set?='@mode' dsl_Lookup_OverrideMode=ModeTypes)? 
	 *         (dsl_Lookup_Override__Day_Set?='@day' dsl_Lookup_OverrideDay=DowTypes)?
	 *     )
	 */
	protected void sequence_Lookup(EObject context, Lookup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_MCD_value?='@Day_of_Movable_Cycle'
	 */
	protected void sequence_MCD(EObject context, MCD semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.MCD__DSL_MCD_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.MCD__DSL_MCD_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMCDAccess().getDsl_MCD_valueDay_of_Movable_CycleKeyword_0(), semanticObject.isDsl_MCD_value());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_Mode?='@Mode_of_Week'
	 */
	protected void sequence_MOW(EObject context, MOW semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.MOW__DSL_DISPLAY_MODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.MOW__DSL_DISPLAY_MODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMOWAccess().getDsl_Display_ModeMode_of_WeekKeyword_0(), semanticObject.isDsl_Display_Mode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_McDay_val=INT
	 */
	protected void sequence_McDay(EObject context, McDay semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.MC_DAY__DSL_MC_DAY_VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.MC_DAY__DSL_MC_DAY_VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMcDayAccess().getDsl_McDay_valINTTerminalRuleCall_2_0(), semanticObject.getDsl_McDay_val());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Elements+=ElementType+
	 */
	protected void sequence_Media(EObject context, Media semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_ModeOfWeekSet_MOWs+=ModeTypes dsl_ModeOfWeekSet_MOWs+=ModeTypes*)
	 */
	protected void sequence_ModeOfWeekSet(EObject context, ModeOfWeekSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_Mode?='@Name_of_Period'
	 */
	protected void sequence_NOP(EObject context, NOP semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.NOP__DSL_DISPLAY_MODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.NOP__DSL_DISPLAY_MODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNOPAccess().getDsl_Display_ModeName_of_PeriodKeyword_0(), semanticObject.isDsl_Display_Mode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_PageHeader_columns+=HeaderFooterColumn+
	 */
	protected void sequence_PageFooterEven(EObject context, PageFooterEven semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_PageHeader_columns+=HeaderFooterColumn+
	 */
	protected void sequence_PageFooterOdd(EObject context, PageFooterOdd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_PageHeader_columns+=HeaderFooterColumn+
	 */
	protected void sequence_PageHeaderEven(EObject context, PageHeaderEven semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_PageHeader_columns+=HeaderFooterColumn+
	 */
	protected void sequence_PageHeaderOdd(EObject context, PageHeaderOdd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_PageKeepWithNext_value=STRING
	 */
	protected void sequence_PageKeepWithNext(EObject context, PageKeepWithNext semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.PAGE_KEEP_WITH_NEXT__DSL_PAGE_KEEP_WITH_NEXT_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.PAGE_KEEP_WITH_NEXT__DSL_PAGE_KEEP_WITH_NEXT_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPageKeepWithNextAccess().getDsl_PageKeepWithNext_valueSTRINGTerminalRuleCall_1_0(), semanticObject.getDsl_PageKeepWithNext_value());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_PageNumber_value=INT
	 */
	protected void sequence_PageNumber(EObject context, PageNumber semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.PAGE_NUMBER__DSL_PAGE_NUMBER_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.PAGE_NUMBER__DSL_PAGE_NUMBER_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPageNumberAccess().getDsl_PageNumber_valueINTTerminalRuleCall_1_0(), semanticObject.getDsl_PageNumber_value());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_Para_Role=[Definition|QualifiedName]? dsl_Elements+=ElementType*)
	 */
	protected void sequence_Paragraph(EObject context, Paragraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Passthrough_html_text=STRING
	 */
	protected void sequence_PassThroughHtml(EObject context, PassThroughHtml semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.PASS_THROUGH_HTML__DSL_PASSTHROUGH_HTML_TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.PASS_THROUGH_HTML__DSL_PASSTHROUGH_HTML_TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPassThroughHtmlAccess().getDsl_Passthrough_html_textSTRINGTerminalRuleCall_1_0(), semanticObject.getDsl_Passthrough_html_text());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Passthrough_pdf_text=STRING
	 */
	protected void sequence_PassThroughPdf(EObject context, PassThroughPdf semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.PASS_THROUGH_PDF__DSL_PASSTHROUGH_PDF_TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.PASS_THROUGH_PDF__DSL_PASSTHROUGH_PDF_TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPassThroughPdfAccess().getDsl_Passthrough_pdf_textSTRINGTerminalRuleCall_1_0(), semanticObject.getDsl_Passthrough_pdf_text());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=[Preface|QualifiedName]
	 */
	protected void sequence_PrefaceFragment(EObject context, PrefaceFragment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.PREFACE_FRAGMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.PREFACE_FRAGMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefaceFragmentAccess().getNamePrefaceQualifiedNameParserRuleCall_1_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dsl_Preface_Elements+=PrefaceElementType*)
	 */
	protected void sequence_Preface(EObject context, Preface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Elements+=ElementType+
	 */
	protected void sequence_Reading(EObject context, Reading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_ResourceTextRef=[Definition|QualifiedName] dsl_ResourceText_Version?='@ver'? dsl_ResourceText_Media_Off?='media-off'?)
	 */
	protected void sequence_ResourceText(EObject context, ResourceText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_RestoreLocale?='@restoreLocale'
	 */
	protected void sequence_RestoreLocale(EObject context, RestoreLocale semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.RESTORE_LOCALE__DSL_RESTORE_LOCALE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.RESTORE_LOCALE__DSL_RESTORE_LOCALE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRestoreLocaleAccess().getDsl_RestoreLocaleRestoreLocaleKeyword_0(), semanticObject.isDsl_RestoreLocale());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Elements+=ElementType+
	 */
	protected void sequence_Rubric(EObject context, Rubric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_SundayAfterElevationCross?='@Sunday_After_Elevation_Cross_Date'
	 */
	protected void sequence_SAEC(EObject context, SAEC semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.SAEC__DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.SAEC__DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSAECAccess().getDsl_Display_SundayAfterElevationCrossSunday_After_Elevation_Cross_DateKeyword_0(), semanticObject.isDsl_Display_SundayAfterElevationCross());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_SundaysBeforeTriodion?='@Sundays_Before_Triodion'
	 */
	protected void sequence_SBT(EObject context, SBT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.SBT__DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.SBT__DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSBTAccess().getDsl_Display_SundaysBeforeTriodionSundays_Before_TriodionKeyword_0(), semanticObject.isDsl_Display_SundaysBeforeTriodion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_StartLukan?='@Lukan_Cycle_Start_Date'
	 */
	protected void sequence_SOL(EObject context, SOL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.SOL__DSL_DISPLAY_START_LUKAN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.SOL__DSL_DISPLAY_START_LUKAN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSOLAccess().getDsl_Display_StartLukanLukan_Cycle_Start_DateKeyword_0(), semanticObject.isDsl_Display_StartLukan());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=[Section|QualifiedName]
	 */
	protected void sequence_SectionFragment(EObject context, SectionFragment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.SECTION_FRAGMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.SECTION_FRAGMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSectionFragmentAccess().getNameSectionQualifiedNameParserRuleCall_1_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dsl_Section_Role=[Definition|QualifiedName]? dsl_Section_Elements+=SectionElementType*)
	 */
	protected void sequence_Section(EObject context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_SetLocale_V1=STRING dsl_SetLocale_V2=STRING)
	 */
	protected void sequence_SetLocale(EObject context, SetLocale semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.SET_LOCALE__DSL_SET_LOCALE_V1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.SET_LOCALE__DSL_SET_LOCALE_V1));
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.SET_LOCALE__DSL_SET_LOCALE_V2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.SET_LOCALE__DSL_SET_LOCALE_V2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSetLocaleAccess().getDsl_SetLocale_V1STRINGTerminalRuleCall_2_0(), semanticObject.getDsl_SetLocale_V1());
		feeder.accept(grammarAccess.getSetLocaleAccess().getDsl_SetLocale_V2STRINGTerminalRuleCall_4_0(), semanticObject.getDsl_SetLocale_V2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_SubTitle_Role=[Definition|QualifiedName]? dsl_Elements+=ElementType*)
	 */
	protected void sequence_SubTitle(EObject context, SubTitle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_SundaysBeforeTriodionCase_Days=INT dsl_SundaysBeforeTriodionCase_True_actions+=AbstractComponent*)
	 */
	protected void sequence_SundaysBeforeTriodionCase(EObject context, SundaysBeforeTriodionCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_TaggedText_tag=[Definition|QualifiedName] dsl_TaggedText+=ElementType*)
	 */
	protected void sequence_TaggedText(EObject context, TaggedText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=[AtemModel|QualifiedName]
	 */
	protected void sequence_TemplateFragment(EObject context, TemplateFragment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.TEMPLATE_FRAGMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.TEMPLATE_FRAGMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTemplateFragmentAccess().getNameAtemModelQualifiedNameParserRuleCall_1_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_TemplateStatus=TemplateStatuses
	 */
	protected void sequence_TemplateStatus(EObject context, TemplateStatus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.TEMPLATE_STATUS__DSL_TEMPLATE_STATUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.TEMPLATE_STATUS__DSL_TEMPLATE_STATUS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTemplateStatusAccess().getDsl_TemplateStatusTemplateStatusesEnumRuleCall_1_0(), semanticObject.getDsl_TemplateStatus());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_TemplateTitle_Elements+=HeaderFooterFragment+
	 */
	protected void sequence_TemplateTitle(EObject context, TemplateTitle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_Title_Role=[Definition|QualifiedName]? dsl_Elements+=ElementType*)
	 */
	protected void sequence_Title(EObject context, Title semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Elements+=ElementType+
	 */
	protected void sequence_Verse(EObject context, Verse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_VersionSwitch_flag=VersionSwitchType
	 */
	protected void sequence_VersionSwitch(EObject context, VersionSwitch semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.VERSION_SWITCH__DSL_VERSION_SWITCH_FLAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.VERSION_SWITCH__DSL_VERSION_SWITCH_FLAG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVersionSwitchAccess().getDsl_VersionSwitch_flagVersionSwitchTypeEnumRuleCall_1_0(), semanticObject.getDsl_VersionSwitch_flag());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_Version(EObject context, Version semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.VERSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.VERSION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVersionAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_DayLukan?='@Lukan_Cycle_Week_Day'
	 */
	protected void sequence_WDOLC(EObject context, WDOLC semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.WDOLC__DSL_DISPLAY_DAY_LUKAN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.WDOLC__DSL_DISPLAY_DAY_LUKAN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWDOLCAccess().getDsl_Display_DayLukanLukan_Cycle_Week_DayKeyword_0(), semanticObject.isDsl_Display_DayLukan());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dsl_Display_DayLukan?='@Lukan_Cycle_Week'
	 */
	protected void sequence_WOLC(EObject context, WOLC semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AtemPackage.Literals.WOLC__DSL_DISPLAY_DAY_LUKAN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtemPackage.Literals.WOLC__DSL_DISPLAY_DAY_LUKAN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWOLCAccess().getDsl_Display_DayLukanLukan_Cycle_WeekKeyword_0(), semanticObject.isDsl_Display_DayLukan());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenDate_Case_Month=MonthName dsl_WhenDateCase_Days=AbstractDateCase dsl_WhenDateCase_True_actions+=AbstractComponent*)
	 */
	protected void sequence_WhenDateCase(EObject context, WhenDateCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenDate_Cases+=WhenDateCase+ dsl_WhenDate_Other=WhenOther?)
	 */
	protected void sequence_WhenDate(EObject context, WhenDate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenDayNameCase_Days=AbstractDayNameCase dsl_WhenDayNameCase_True_actions+=AbstractComponent*)
	 */
	protected void sequence_WhenDayNameCase(EObject context, WhenDayNameCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenDayName_Cases+=WhenDayNameCase+ dsl_WhenDayName_Other=WhenOther?)
	 */
	protected void sequence_WhenDayName(EObject context, WhenDayName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenExistsCase_Ref=[Definition|QualifiedName] dsl_WhenExistsCase_True_actions+=AbstractComponent*)
	 */
	protected void sequence_WhenExistsCase(EObject context, WhenExistsCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenExists_Cases+=WhenExistsCase+ dsl_WhenExists_Other=WhenOther?)
	 */
	protected void sequence_WhenExists(EObject context, WhenExists semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenLukanCycleDay_Cases+=WhenPeriodCase+ dsl_WhenLukanCycleDay_Other=WhenOther?)
	 */
	protected void sequence_WhenLukanCycleDay(EObject context, WhenLukanCycleDay semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenModeOfWeekCase_Days=ModeOfWeekSet dsl_WhenModeOfWeekCase_True_actions+=AbstractComponent*)
	 */
	protected void sequence_WhenModeOfWeekCase(EObject context, WhenModeOfWeekCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenModeOfWeek_Cases+=WhenModeOfWeekCase+ dsl_WhenModeOfWeek_Other=WhenOther?)
	 */
	protected void sequence_WhenModeOfWeek(EObject context, WhenModeOfWeek semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenMovableCycleDay_Cases+=WhenPeriodCase+ dsl_WhenMovableCycleDay_Other=WhenOther?)
	 */
	protected void sequence_WhenMovableCycleDay(EObject context, WhenMovableCycleDay semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dsl_WhenCase_Other_actions+=AbstractComponent*
	 */
	protected void sequence_WhenOther(EObject context, WhenOther semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenPascha_true_actions+=AbstractComponent* dsl_WhenPascha_Other_actions+=AbstractComponent*)
	 */
	protected void sequence_WhenPascha(EObject context, WhenPascha semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenPentecostarionDay_Cases+=WhenPeriodCase+ dsl_WhenPentecostarionDay_Other=WhenOther?)
	 */
	protected void sequence_WhenPentecostarionDay(EObject context, WhenPentecostarionDay semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenPeriodCase_Days=AbstractDayCase dsl_WhenPeriodCase_True_actions+=AbstractComponent*)
	 */
	protected void sequence_WhenPeriodCase(EObject context, WhenPeriodCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenSundayAfterElevationOfCrossDay_Cases+=WhenDateCase+ dsl_WhenSundayAfterElevationOfCrossDay_Other=WhenOther?)
	 */
	protected void sequence_WhenSundayAfterElevationOfCrossDay(EObject context, WhenSundayAfterElevationOfCrossDay semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenSundaysBeforeTriodion_Cases+=SundaysBeforeTriodionCase+ dsl_SundaysBeforeTriodion_Other=WhenOther?)
	 */
	protected void sequence_WhenSundaysBeforeTriodion(EObject context, WhenSundaysBeforeTriodion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dsl_WhenTriodionDay_Cases+=WhenPeriodCase+ dsl_WhenTriodionDay_Other=WhenOther?)
	 */
	protected void sequence_WhenTriodionDay(EObject context, WhenTriodionDay semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
