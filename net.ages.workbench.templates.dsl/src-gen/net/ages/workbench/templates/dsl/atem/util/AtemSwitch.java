/**
 */
package net.ages.workbench.templates.dsl.atem.util;

import net.ages.workbench.templates.dsl.atem.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage
 * @generated
 */
public class AtemSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AtemPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtemSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AtemPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AtemPackage.ATEM_MODEL:
      {
        AtemModel atemModel = (AtemModel)theEObject;
        T result = caseAtemModel(atemModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEAD:
      {
        Head head = (Head)theEObject;
        T result = caseHead(head);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEAD_COMPONENT:
      {
        HeadComponent headComponent = (HeadComponent)theEObject;
        T result = caseHeadComponent(headComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DRIVER:
      {
        Driver driver = (Driver)theEObject;
        T result = caseDriver(driver);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.TEMPLATE_TITLE:
      {
        TemplateTitle templateTitle = (TemplateTitle)theEObject;
        T result = caseTemplateTitle(templateTitle);
        if (result == null) result = caseHeadComponent(templateTitle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.PAGE_KEEP_WITH_NEXT:
      {
        PageKeepWithNext pageKeepWithNext = (PageKeepWithNext)theEObject;
        T result = casePageKeepWithNext(pageKeepWithNext);
        if (result == null) result = caseHeadComponent(pageKeepWithNext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.PAGE_HEADER_EVEN:
      {
        PageHeaderEven pageHeaderEven = (PageHeaderEven)theEObject;
        T result = casePageHeaderEven(pageHeaderEven);
        if (result == null) result = caseHeadComponent(pageHeaderEven);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.PAGE_HEADER_ODD:
      {
        PageHeaderOdd pageHeaderOdd = (PageHeaderOdd)theEObject;
        T result = casePageHeaderOdd(pageHeaderOdd);
        if (result == null) result = caseHeadComponent(pageHeaderOdd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.PAGE_FOOTER_EVEN:
      {
        PageFooterEven pageFooterEven = (PageFooterEven)theEObject;
        T result = casePageFooterEven(pageFooterEven);
        if (result == null) result = caseHeadComponent(pageFooterEven);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.PAGE_FOOTER_ODD:
      {
        PageFooterOdd pageFooterOdd = (PageFooterOdd)theEObject;
        T result = casePageFooterOdd(pageFooterOdd);
        if (result == null) result = caseHeadComponent(pageFooterOdd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADER_FOOTER_COLUMN:
      {
        HeaderFooterColumn headerFooterColumn = (HeaderFooterColumn)theEObject;
        T result = caseHeaderFooterColumn(headerFooterColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADER_FOOTER_COLUMN_LEFT:
      {
        HeaderFooterColumnLeft headerFooterColumnLeft = (HeaderFooterColumnLeft)theEObject;
        T result = caseHeaderFooterColumnLeft(headerFooterColumnLeft);
        if (result == null) result = caseHeaderFooterColumn(headerFooterColumnLeft);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADER_FOOTER_COLUMN_CENTER:
      {
        HeaderFooterColumnCenter headerFooterColumnCenter = (HeaderFooterColumnCenter)theEObject;
        T result = caseHeaderFooterColumnCenter(headerFooterColumnCenter);
        if (result == null) result = caseHeaderFooterColumn(headerFooterColumnCenter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADER_FOOTER_COLUMN_RIGHT:
      {
        HeaderFooterColumnRight headerFooterColumnRight = (HeaderFooterColumnRight)theEObject;
        T result = caseHeaderFooterColumnRight(headerFooterColumnRight);
        if (result == null) result = caseHeaderFooterColumn(headerFooterColumnRight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADER_FOOTER_FRAGMENT:
      {
        HeaderFooterFragment headerFooterFragment = (HeaderFooterFragment)theEObject;
        T result = caseHeaderFooterFragment(headerFooterFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADER_FOOTER_TEXT:
      {
        HeaderFooterText headerFooterText = (HeaderFooterText)theEObject;
        T result = caseHeaderFooterText(headerFooterText);
        if (result == null) result = caseHeaderFooterFragment(headerFooterText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADER_FOOTER_DATE:
      {
        HeaderFooterDate headerFooterDate = (HeaderFooterDate)theEObject;
        T result = caseHeaderFooterDate(headerFooterDate);
        if (result == null) result = caseHeaderFooterFragment(headerFooterDate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADER_FOOTER_PAGE_NUMBER:
      {
        HeaderFooterPageNumber headerFooterPageNumber = (HeaderFooterPageNumber)theEObject;
        T result = caseHeaderFooterPageNumber(headerFooterPageNumber);
        if (result == null) result = caseHeaderFooterFragment(headerFooterPageNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADER_FOOTER_LOOKUP:
      {
        HeaderFooterLookup headerFooterLookup = (HeaderFooterLookup)theEObject;
        T result = caseHeaderFooterLookup(headerFooterLookup);
        if (result == null) result = caseHeaderFooterFragment(headerFooterLookup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADER_FOOTER_TITLE:
      {
        HeaderFooterTitle headerFooterTitle = (HeaderFooterTitle)theEObject;
        T result = caseHeaderFooterTitle(headerFooterTitle);
        if (result == null) result = caseHeaderFooterFragment(headerFooterTitle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADER_FOOTER_COMMEMORATION:
      {
        HeaderFooterCommemoration headerFooterCommemoration = (HeaderFooterCommemoration)theEObject;
        T result = caseHeaderFooterCommemoration(headerFooterCommemoration);
        if (result == null) result = caseHeaderFooterFragment(headerFooterCommemoration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.COMMEMORATION:
      {
        Commemoration commemoration = (Commemoration)theEObject;
        T result = caseCommemoration(commemoration);
        if (result == null) result = caseHeadComponent(commemoration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.TEMPLATE_STATUS:
      {
        TemplateStatus templateStatus = (TemplateStatus)theEObject;
        T result = caseTemplateStatus(templateStatus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.ABSTRACT_COMPONENT:
      {
        AbstractComponent abstractComponent = (AbstractComponent)theEObject;
        T result = caseAbstractComponent(abstractComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.VERSION_SWITCH:
      {
        VersionSwitch versionSwitch = (VersionSwitch)theEObject;
        T result = caseVersionSwitch(versionSwitch);
        if (result == null) result = caseAbstractComponent(versionSwitch);
        if (result == null) result = caseInfoElementType(versionSwitch);
        if (result == null) result = casePrefaceElementType(versionSwitch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.RESOURCE_TEXT:
      {
        ResourceText resourceText = (ResourceText)theEObject;
        T result = caseResourceText(resourceText);
        if (result == null) result = caseElementType(resourceText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.LOOKUP:
      {
        Lookup lookup = (Lookup)theEObject;
        T result = caseLookup(lookup);
        if (result == null) result = caseElementType(lookup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.LDP:
      {
        LDP ldp = (LDP)theEObject;
        T result = caseLDP(ldp);
        if (result == null) result = caseElementType(ldp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.TAGGED_TEXT:
      {
        TaggedText taggedText = (TaggedText)theEObject;
        T result = caseTaggedText(taggedText);
        if (result == null) result = caseElementType(taggedText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.INFO:
      {
        Info info = (Info)theEObject;
        T result = caseInfo(info);
        if (result == null) result = caseAbstractComponent(info);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.INFO_ELEMENT_TYPE:
      {
        InfoElementType infoElementType = (InfoElementType)theEObject;
        T result = caseInfoElementType(infoElementType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DATE:
      {
        Date date = (Date)theEObject;
        T result = caseDate(date);
        if (result == null) result = caseHeadComponent(date);
        if (result == null) result = caseSectionElementType(date);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.PREFACE:
      {
        Preface preface = (Preface)theEObject;
        T result = casePreface(preface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.PREFACE_ELEMENT_TYPE:
      {
        PrefaceElementType prefaceElementType = (PrefaceElementType)theEObject;
        T result = casePrefaceElementType(prefaceElementType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.SECTION:
      {
        Section section = (Section)theEObject;
        T result = caseSection(section);
        if (result == null) result = caseAbstractComponent(section);
        if (result == null) result = casePrefaceElementType(section);
        if (result == null) result = caseSectionElementType(section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.SECTION_ELEMENT_TYPE:
      {
        SectionElementType sectionElementType = (SectionElementType)theEObject;
        T result = caseSectionElementType(sectionElementType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.LDP_TYPE:
      {
        LdpType ldpType = (LdpType)theEObject;
        T result = caseLdpType(ldpType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.ALL:
      {
        All all = (All)theEObject;
        T result = caseAll(all);
        if (result == null) result = caseLdpType(all);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.GEN_DATE:
      {
        GenDate genDate = (GenDate)theEObject;
        T result = caseGenDate(genDate);
        if (result == null) result = caseLdpType(genDate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.GEN_YEAR:
      {
        GenYear genYear = (GenYear)theEObject;
        T result = caseGenYear(genYear);
        if (result == null) result = caseLdpType(genYear);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.MCD:
      {
        MCD mcd = (MCD)theEObject;
        T result = caseMCD(mcd);
        if (result == null) result = caseLdpType(mcd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.MOW:
      {
        MOW mow = (MOW)theEObject;
        T result = caseMOW(mow);
        if (result == null) result = caseLdpType(mow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.NOP:
      {
        NOP nop = (NOP)theEObject;
        T result = caseNOP(nop);
        if (result == null) result = caseLdpType(nop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DOM:
      {
        DOM dom = (DOM)theEObject;
        T result = caseDOM(dom);
        if (result == null) result = caseLdpType(dom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DOP:
      {
        DOP dop = (DOP)theEObject;
        T result = caseDOP(dop);
        if (result == null) result = caseLdpType(dop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DOWN:
      {
        DOWN down = (DOWN)theEObject;
        T result = caseDOWN(down);
        if (result == null) result = caseLdpType(down);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DOWT:
      {
        DOWT dowt = (DOWT)theEObject;
        T result = caseDOWT(dowt);
        if (result == null) result = caseLdpType(dowt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.EOW:
      {
        EOW eow = (EOW)theEObject;
        T result = caseEOW(eow);
        if (result == null) result = caseLdpType(eow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.SAEC:
      {
        SAEC saec = (SAEC)theEObject;
        T result = caseSAEC(saec);
        if (result == null) result = caseLdpType(saec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.SOL:
      {
        SOL sol = (SOL)theEObject;
        T result = caseSOL(sol);
        if (result == null) result = caseLdpType(sol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DOL:
      {
        DOL dol = (DOL)theEObject;
        T result = caseDOL(dol);
        if (result == null) result = caseLdpType(dol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WOLC:
      {
        WOLC wolc = (WOLC)theEObject;
        T result = caseWOLC(wolc);
        if (result == null) result = caseLdpType(wolc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WDOLC:
      {
        WDOLC wdolc = (WDOLC)theEObject;
        T result = caseWDOLC(wdolc);
        if (result == null) result = caseLdpType(wdolc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.SBT:
      {
        SBT sbt = (SBT)theEObject;
        T result = caseSBT(sbt);
        if (result == null) result = caseLdpType(sbt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.TEMPLATE_FRAGMENT:
      {
        TemplateFragment templateFragment = (TemplateFragment)theEObject;
        T result = caseTemplateFragment(templateFragment);
        if (result == null) result = caseAbstractComponent(templateFragment);
        if (result == null) result = casePrefaceElementType(templateFragment);
        if (result == null) result = caseSectionElementType(templateFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.PREFACE_FRAGMENT:
      {
        PrefaceFragment prefaceFragment = (PrefaceFragment)theEObject;
        T result = casePrefaceFragment(prefaceFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.SECTION_FRAGMENT:
      {
        SectionFragment sectionFragment = (SectionFragment)theEObject;
        T result = caseSectionFragment(sectionFragment);
        if (result == null) result = caseAbstractComponent(sectionFragment);
        if (result == null) result = casePrefaceElementType(sectionFragment);
        if (result == null) result = caseSectionElementType(sectionFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.BREAK:
      {
        Break break_ = (Break)theEObject;
        T result = caseBreak(break_);
        if (result == null) result = caseAbstractComponent(break_);
        if (result == null) result = caseSectionElementType(break_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.PAGE_NUMBER:
      {
        PageNumber pageNumber = (PageNumber)theEObject;
        T result = casePageNumber(pageNumber);
        if (result == null) result = caseHeadComponent(pageNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.PASS_THROUGH_HTML:
      {
        PassThroughHtml passThroughHtml = (PassThroughHtml)theEObject;
        T result = casePassThroughHtml(passThroughHtml);
        if (result == null) result = caseAbstractComponent(passThroughHtml);
        if (result == null) result = caseSectionElementType(passThroughHtml);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.PASS_THROUGH_PDF:
      {
        PassThroughPdf passThroughPdf = (PassThroughPdf)theEObject;
        T result = casePassThroughPdf(passThroughPdf);
        if (result == null) result = caseAbstractComponent(passThroughPdf);
        if (result == null) result = caseSectionElementType(passThroughPdf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.TITLE:
      {
        Title title = (Title)theEObject;
        T result = caseTitle(title);
        if (result == null) result = caseAbstractComponent(title);
        if (result == null) result = caseInfoElementType(title);
        if (result == null) result = casePrefaceElementType(title);
        if (result == null) result = caseSectionElementType(title);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.SUB_TITLE:
      {
        SubTitle subTitle = (SubTitle)theEObject;
        T result = caseSubTitle(subTitle);
        if (result == null) result = caseAbstractComponent(subTitle);
        if (result == null) result = caseInfoElementType(subTitle);
        if (result == null) result = casePrefaceElementType(subTitle);
        if (result == null) result = caseSectionElementType(subTitle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.PARAGRAPH:
      {
        Paragraph paragraph = (Paragraph)theEObject;
        T result = caseParagraph(paragraph);
        if (result == null) result = caseAbstractComponent(paragraph);
        if (result == null) result = caseInfoElementType(paragraph);
        if (result == null) result = casePrefaceElementType(paragraph);
        if (result == null) result = caseSectionElementType(paragraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseAbstractComponent(block);
        if (result == null) result = caseInfoElementType(block);
        if (result == null) result = casePrefaceElementType(block);
        if (result == null) result = caseSectionElementType(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HYMN:
      {
        Hymn hymn = (Hymn)theEObject;
        T result = caseHymn(hymn);
        if (result == null) result = caseAbstractComponent(hymn);
        if (result == null) result = caseSectionElementType(hymn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.MEDIA:
      {
        Media media = (Media)theEObject;
        T result = caseMedia(media);
        if (result == null) result = caseAbstractComponent(media);
        if (result == null) result = caseSectionElementType(media);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.VERSE:
      {
        Verse verse = (Verse)theEObject;
        T result = caseVerse(verse);
        if (result == null) result = caseAbstractComponent(verse);
        if (result == null) result = caseSectionElementType(verse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.ACTOR:
      {
        Actor actor = (Actor)theEObject;
        T result = caseActor(actor);
        if (result == null) result = caseAbstractComponent(actor);
        if (result == null) result = caseSectionElementType(actor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.RUBRIC:
      {
        Rubric rubric = (Rubric)theEObject;
        T result = caseRubric(rubric);
        if (result == null) result = caseAbstractComponent(rubric);
        if (result == null) result = caseSectionElementType(rubric);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DIALOG:
      {
        Dialog dialog = (Dialog)theEObject;
        T result = caseDialog(dialog);
        if (result == null) result = caseAbstractComponent(dialog);
        if (result == null) result = caseSectionElementType(dialog);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.READING:
      {
        Reading reading = (Reading)theEObject;
        T result = caseReading(reading);
        if (result == null) result = caseAbstractComponent(reading);
        if (result == null) result = caseSectionElementType(reading);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADING1:
      {
        Heading1 heading1 = (Heading1)theEObject;
        T result = caseHeading1(heading1);
        if (result == null) result = caseAbstractComponent(heading1);
        if (result == null) result = caseSectionElementType(heading1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADING2:
      {
        Heading2 heading2 = (Heading2)theEObject;
        T result = caseHeading2(heading2);
        if (result == null) result = caseAbstractComponent(heading2);
        if (result == null) result = caseSectionElementType(heading2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.HEADING3:
      {
        Heading3 heading3 = (Heading3)theEObject;
        T result = caseHeading3(heading3);
        if (result == null) result = caseAbstractComponent(heading3);
        if (result == null) result = caseSectionElementType(heading3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.ELEMENT_TYPE:
      {
        ElementType elementType = (ElementType)theEObject;
        T result = caseElementType(elementType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.AID:
      {
        Aid aid = (Aid)theEObject;
        T result = caseAid(aid);
        if (result == null) result = caseAbstractComponent(aid);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.VERSION:
      {
        Version version = (Version)theEObject;
        T result = caseVersion(version);
        if (result == null) result = caseAbstractComponent(version);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.LIT_BOOK:
      {
        LitBook litBook = (LitBook)theEObject;
        T result = caseLitBook(litBook);
        if (result == null) result = caseAbstractComponent(litBook);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.SET_LOCALE:
      {
        SetLocale setLocale = (SetLocale)theEObject;
        T result = caseSetLocale(setLocale);
        if (result == null) result = caseAbstractComponent(setLocale);
        if (result == null) result = caseSectionElementType(setLocale);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.RESTORE_LOCALE:
      {
        RestoreLocale restoreLocale = (RestoreLocale)theEObject;
        T result = caseRestoreLocale(restoreLocale);
        if (result == null) result = caseAbstractComponent(restoreLocale);
        if (result == null) result = caseSectionElementType(restoreLocale);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_DATE:
      {
        WhenDate whenDate = (WhenDate)theEObject;
        T result = caseWhenDate(whenDate);
        if (result == null) result = caseAbstractComponent(whenDate);
        if (result == null) result = caseSectionElementType(whenDate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_DATE_CASE:
      {
        WhenDateCase whenDateCase = (WhenDateCase)theEObject;
        T result = caseWhenDateCase(whenDateCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.ABSTRACT_DATE_CASE:
      {
        AbstractDateCase abstractDateCase = (AbstractDateCase)theEObject;
        T result = caseAbstractDateCase(abstractDateCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DATE_RANGE:
      {
        DateRange dateRange = (DateRange)theEObject;
        T result = caseDateRange(dateRange);
        if (result == null) result = caseAbstractDateCase(dateRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DATE_SET:
      {
        DateSet dateSet = (DateSet)theEObject;
        T result = caseDateSet(dateSet);
        if (result == null) result = caseAbstractDateCase(dateSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_DAY_NAME:
      {
        WhenDayName whenDayName = (WhenDayName)theEObject;
        T result = caseWhenDayName(whenDayName);
        if (result == null) result = caseAbstractComponent(whenDayName);
        if (result == null) result = caseSectionElementType(whenDayName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_DAY_NAME_CASE:
      {
        WhenDayNameCase whenDayNameCase = (WhenDayNameCase)theEObject;
        T result = caseWhenDayNameCase(whenDayNameCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.ABSTRACT_DAY_NAME_CASE:
      {
        AbstractDayNameCase abstractDayNameCase = (AbstractDayNameCase)theEObject;
        T result = caseAbstractDayNameCase(abstractDayNameCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DAY_NAME_RANGE:
      {
        DayNameRange dayNameRange = (DayNameRange)theEObject;
        T result = caseDayNameRange(dayNameRange);
        if (result == null) result = caseAbstractDayNameCase(dayNameRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DAY_NAME_SET:
      {
        DayNameSet dayNameSet = (DayNameSet)theEObject;
        T result = caseDayNameSet(dayNameSet);
        if (result == null) result = caseAbstractDayNameCase(dayNameSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_PENTECOSTARION_DAY:
      {
        WhenPentecostarionDay whenPentecostarionDay = (WhenPentecostarionDay)theEObject;
        T result = caseWhenPentecostarionDay(whenPentecostarionDay);
        if (result == null) result = caseAbstractComponent(whenPentecostarionDay);
        if (result == null) result = caseSectionElementType(whenPentecostarionDay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_TRIODION_DAY:
      {
        WhenTriodionDay whenTriodionDay = (WhenTriodionDay)theEObject;
        T result = caseWhenTriodionDay(whenTriodionDay);
        if (result == null) result = caseAbstractComponent(whenTriodionDay);
        if (result == null) result = caseSectionElementType(whenTriodionDay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_MOVABLE_CYCLE_DAY:
      {
        WhenMovableCycleDay whenMovableCycleDay = (WhenMovableCycleDay)theEObject;
        T result = caseWhenMovableCycleDay(whenMovableCycleDay);
        if (result == null) result = caseAbstractComponent(whenMovableCycleDay);
        if (result == null) result = caseSectionElementType(whenMovableCycleDay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY:
      {
        WhenSundayAfterElevationOfCrossDay whenSundayAfterElevationOfCrossDay = (WhenSundayAfterElevationOfCrossDay)theEObject;
        T result = caseWhenSundayAfterElevationOfCrossDay(whenSundayAfterElevationOfCrossDay);
        if (result == null) result = caseAbstractComponent(whenSundayAfterElevationOfCrossDay);
        if (result == null) result = caseSectionElementType(whenSundayAfterElevationOfCrossDay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_LUKAN_CYCLE_DAY:
      {
        WhenLukanCycleDay whenLukanCycleDay = (WhenLukanCycleDay)theEObject;
        T result = caseWhenLukanCycleDay(whenLukanCycleDay);
        if (result == null) result = caseAbstractComponent(whenLukanCycleDay);
        if (result == null) result = caseSectionElementType(whenLukanCycleDay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_PASCHA:
      {
        WhenPascha whenPascha = (WhenPascha)theEObject;
        T result = caseWhenPascha(whenPascha);
        if (result == null) result = caseAbstractComponent(whenPascha);
        if (result == null) result = caseSectionElementType(whenPascha);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_OTHER:
      {
        WhenOther whenOther = (WhenOther)theEObject;
        T result = caseWhenOther(whenOther);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_PERIOD_CASE:
      {
        WhenPeriodCase whenPeriodCase = (WhenPeriodCase)theEObject;
        T result = caseWhenPeriodCase(whenPeriodCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.ABSTRACT_DAY_CASE:
      {
        AbstractDayCase abstractDayCase = (AbstractDayCase)theEObject;
        T result = caseAbstractDayCase(abstractDayCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DAY_RANGE:
      {
        DayRange dayRange = (DayRange)theEObject;
        T result = caseDayRange(dayRange);
        if (result == null) result = caseAbstractDayCase(dayRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.DAY_SET:
      {
        DaySet daySet = (DaySet)theEObject;
        T result = caseDaySet(daySet);
        if (result == null) result = caseAbstractDayCase(daySet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_MODE_OF_WEEK:
      {
        WhenModeOfWeek whenModeOfWeek = (WhenModeOfWeek)theEObject;
        T result = caseWhenModeOfWeek(whenModeOfWeek);
        if (result == null) result = caseAbstractComponent(whenModeOfWeek);
        if (result == null) result = caseSectionElementType(whenModeOfWeek);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_MODE_OF_WEEK_CASE:
      {
        WhenModeOfWeekCase whenModeOfWeekCase = (WhenModeOfWeekCase)theEObject;
        T result = caseWhenModeOfWeekCase(whenModeOfWeekCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.MODE_OF_WEEK_SET:
      {
        ModeOfWeekSet modeOfWeekSet = (ModeOfWeekSet)theEObject;
        T result = caseModeOfWeekSet(modeOfWeekSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION:
      {
        WhenSundaysBeforeTriodion whenSundaysBeforeTriodion = (WhenSundaysBeforeTriodion)theEObject;
        T result = caseWhenSundaysBeforeTriodion(whenSundaysBeforeTriodion);
        if (result == null) result = caseAbstractComponent(whenSundaysBeforeTriodion);
        if (result == null) result = caseSectionElementType(whenSundaysBeforeTriodion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE:
      {
        SundaysBeforeTriodionCase sundaysBeforeTriodionCase = (SundaysBeforeTriodionCase)theEObject;
        T result = caseSundaysBeforeTriodionCase(sundaysBeforeTriodionCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_EXISTS:
      {
        WhenExists whenExists = (WhenExists)theEObject;
        T result = caseWhenExists(whenExists);
        if (result == null) result = caseAbstractComponent(whenExists);
        if (result == null) result = caseSectionElementType(whenExists);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtemPackage.WHEN_EXISTS_CASE:
      {
        WhenExistsCase whenExistsCase = (WhenExistsCase)theEObject;
        T result = caseWhenExistsCase(whenExistsCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtemModel(AtemModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Head</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Head</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHead(Head object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Head Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Head Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeadComponent(HeadComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Driver</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Driver</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDriver(Driver object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Title</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Title</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateTitle(TemplateTitle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Keep With Next</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Keep With Next</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageKeepWithNext(PageKeepWithNext object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Header Even</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Header Even</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageHeaderEven(PageHeaderEven object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Header Odd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Header Odd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageHeaderOdd(PageHeaderOdd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Footer Even</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Footer Even</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageFooterEven(PageFooterEven object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Footer Odd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Footer Odd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageFooterOdd(PageFooterOdd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Footer Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Footer Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeaderFooterColumn(HeaderFooterColumn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Footer Column Left</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Footer Column Left</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeaderFooterColumnLeft(HeaderFooterColumnLeft object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Footer Column Center</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Footer Column Center</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeaderFooterColumnCenter(HeaderFooterColumnCenter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Footer Column Right</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Footer Column Right</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeaderFooterColumnRight(HeaderFooterColumnRight object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Footer Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Footer Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeaderFooterFragment(HeaderFooterFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Footer Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Footer Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeaderFooterText(HeaderFooterText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Footer Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Footer Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeaderFooterDate(HeaderFooterDate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Footer Page Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Footer Page Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeaderFooterPageNumber(HeaderFooterPageNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Footer Lookup</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Footer Lookup</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeaderFooterLookup(HeaderFooterLookup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Footer Title</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Footer Title</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeaderFooterTitle(HeaderFooterTitle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Footer Commemoration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Footer Commemoration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeaderFooterCommemoration(HeaderFooterCommemoration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Commemoration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Commemoration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommemoration(Commemoration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Status</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Status</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateStatus(TemplateStatus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractComponent(AbstractComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Version Switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Version Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersionSwitch(VersionSwitch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceText(ResourceText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lookup</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lookup</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLookup(Lookup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LDP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LDP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLDP(LDP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tagged Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tagged Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaggedText(TaggedText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Info</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Info</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfo(Info object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Info Element Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Info Element Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfoElementType(InfoElementType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDate(Date object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreface(Preface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preface Element Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preface Element Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefaceElementType(PrefaceElementType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSection(Section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section Element Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section Element Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSectionElementType(SectionElementType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ldp Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ldp Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLdpType(LdpType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAll(All object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gen Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gen Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenDate(GenDate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gen Year</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gen Year</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenYear(GenYear object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MCD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MCD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCD(MCD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MOW</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MOW</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMOW(MOW object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NOP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NOP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNOP(NOP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DOM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DOM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDOM(DOM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DOP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DOP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDOP(DOP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DOWN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DOWN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDOWN(DOWN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DOWT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DOWT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDOWT(DOWT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EOW</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EOW</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEOW(EOW object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SAEC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SAEC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSAEC(SAEC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SOL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SOL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSOL(SOL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DOL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DOL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDOL(DOL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>WOLC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>WOLC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWOLC(WOLC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>WDOLC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>WDOLC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWDOLC(WDOLC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SBT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SBT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSBT(SBT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateFragment(TemplateFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preface Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preface Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefaceFragment(PrefaceFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSectionFragment(SectionFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Break</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Break</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBreak(Break object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageNumber(PageNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pass Through Html</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pass Through Html</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePassThroughHtml(PassThroughHtml object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pass Through Pdf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pass Through Pdf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePassThroughPdf(PassThroughPdf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Title</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Title</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTitle(Title object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Title</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Title</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubTitle(SubTitle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParagraph(Paragraph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hymn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hymn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHymn(Hymn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Media</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Media</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMedia(Media object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verse</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verse</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerse(Verse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActor(Actor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rubric</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rubric</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRubric(Rubric object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dialog</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dialog</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDialog(Dialog object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reading</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reading</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReading(Reading object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Heading1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Heading1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeading1(Heading1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Heading2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Heading2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeading2(Heading2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Heading3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Heading3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeading3(Heading3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementType(ElementType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aid</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aid</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAid(Aid object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersion(Version object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lit Book</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lit Book</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLitBook(LitBook object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Locale</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Locale</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetLocale(SetLocale object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Restore Locale</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Restore Locale</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRestoreLocale(RestoreLocale object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenDate(WhenDate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Date Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Date Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenDateCase(WhenDateCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Date Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Date Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDateCase(AbstractDateCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateRange(DateRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateSet(DateSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Day Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Day Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenDayName(WhenDayName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Day Name Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Day Name Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenDayNameCase(WhenDayNameCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Day Name Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Day Name Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDayNameCase(AbstractDayNameCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Day Name Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Day Name Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDayNameRange(DayNameRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Day Name Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Day Name Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDayNameSet(DayNameSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Pentecostarion Day</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Pentecostarion Day</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenPentecostarionDay(WhenPentecostarionDay object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Triodion Day</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Triodion Day</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenTriodionDay(WhenTriodionDay object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Movable Cycle Day</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Movable Cycle Day</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenMovableCycleDay(WhenMovableCycleDay object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Sunday After Elevation Of Cross Day</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Sunday After Elevation Of Cross Day</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenSundayAfterElevationOfCrossDay(WhenSundayAfterElevationOfCrossDay object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Lukan Cycle Day</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Lukan Cycle Day</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenLukanCycleDay(WhenLukanCycleDay object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Pascha</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Pascha</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenPascha(WhenPascha object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Other</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Other</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenOther(WhenOther object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Period Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Period Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenPeriodCase(WhenPeriodCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Day Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Day Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDayCase(AbstractDayCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Day Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Day Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDayRange(DayRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Day Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Day Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaySet(DaySet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Mode Of Week</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Mode Of Week</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenModeOfWeek(WhenModeOfWeek object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Mode Of Week Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Mode Of Week Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenModeOfWeekCase(WhenModeOfWeekCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mode Of Week Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mode Of Week Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModeOfWeekSet(ModeOfWeekSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Sundays Before Triodion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Sundays Before Triodion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenSundaysBeforeTriodion(WhenSundaysBeforeTriodion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sundays Before Triodion Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sundays Before Triodion Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSundaysBeforeTriodionCase(SundaysBeforeTriodionCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Exists</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Exists</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenExists(WhenExists object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Exists Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Exists Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenExistsCase(WhenExistsCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AtemSwitch
