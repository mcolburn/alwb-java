/**
 */
package net.ages.workbench.templates.dsl.atem.util;

import net.ages.workbench.templates.dsl.atem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage
 * @generated
 */
public class AtemAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AtemPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtemAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AtemPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtemSwitch<Adapter> modelSwitch =
    new AtemSwitch<Adapter>()
    {
      @Override
      public Adapter caseAtemModel(AtemModel object)
      {
        return createAtemModelAdapter();
      }
      @Override
      public Adapter caseHead(Head object)
      {
        return createHeadAdapter();
      }
      @Override
      public Adapter caseHeadComponent(HeadComponent object)
      {
        return createHeadComponentAdapter();
      }
      @Override
      public Adapter caseDriver(Driver object)
      {
        return createDriverAdapter();
      }
      @Override
      public Adapter caseTemplateTitle(TemplateTitle object)
      {
        return createTemplateTitleAdapter();
      }
      @Override
      public Adapter casePageKeepWithNext(PageKeepWithNext object)
      {
        return createPageKeepWithNextAdapter();
      }
      @Override
      public Adapter casePageHeaderEven(PageHeaderEven object)
      {
        return createPageHeaderEvenAdapter();
      }
      @Override
      public Adapter casePageHeaderOdd(PageHeaderOdd object)
      {
        return createPageHeaderOddAdapter();
      }
      @Override
      public Adapter casePageFooterEven(PageFooterEven object)
      {
        return createPageFooterEvenAdapter();
      }
      @Override
      public Adapter casePageFooterOdd(PageFooterOdd object)
      {
        return createPageFooterOddAdapter();
      }
      @Override
      public Adapter caseHeaderFooterColumn(HeaderFooterColumn object)
      {
        return createHeaderFooterColumnAdapter();
      }
      @Override
      public Adapter caseHeaderFooterColumnLeft(HeaderFooterColumnLeft object)
      {
        return createHeaderFooterColumnLeftAdapter();
      }
      @Override
      public Adapter caseHeaderFooterColumnCenter(HeaderFooterColumnCenter object)
      {
        return createHeaderFooterColumnCenterAdapter();
      }
      @Override
      public Adapter caseHeaderFooterColumnRight(HeaderFooterColumnRight object)
      {
        return createHeaderFooterColumnRightAdapter();
      }
      @Override
      public Adapter caseHeaderFooterFragment(HeaderFooterFragment object)
      {
        return createHeaderFooterFragmentAdapter();
      }
      @Override
      public Adapter caseHeaderFooterText(HeaderFooterText object)
      {
        return createHeaderFooterTextAdapter();
      }
      @Override
      public Adapter caseHeaderFooterDate(HeaderFooterDate object)
      {
        return createHeaderFooterDateAdapter();
      }
      @Override
      public Adapter caseHeaderFooterPageNumber(HeaderFooterPageNumber object)
      {
        return createHeaderFooterPageNumberAdapter();
      }
      @Override
      public Adapter caseHeaderFooterLookup(HeaderFooterLookup object)
      {
        return createHeaderFooterLookupAdapter();
      }
      @Override
      public Adapter caseHeaderFooterTitle(HeaderFooterTitle object)
      {
        return createHeaderFooterTitleAdapter();
      }
      @Override
      public Adapter caseHeaderFooterCommemoration(HeaderFooterCommemoration object)
      {
        return createHeaderFooterCommemorationAdapter();
      }
      @Override
      public Adapter caseCommemoration(Commemoration object)
      {
        return createCommemorationAdapter();
      }
      @Override
      public Adapter caseTemplateStatus(TemplateStatus object)
      {
        return createTemplateStatusAdapter();
      }
      @Override
      public Adapter caseAbstractComponent(AbstractComponent object)
      {
        return createAbstractComponentAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseVersionSwitch(VersionSwitch object)
      {
        return createVersionSwitchAdapter();
      }
      @Override
      public Adapter caseResourceText(ResourceText object)
      {
        return createResourceTextAdapter();
      }
      @Override
      public Adapter caseLookup(Lookup object)
      {
        return createLookupAdapter();
      }
      @Override
      public Adapter caseLDP(LDP object)
      {
        return createLDPAdapter();
      }
      @Override
      public Adapter caseTaggedText(TaggedText object)
      {
        return createTaggedTextAdapter();
      }
      @Override
      public Adapter caseInfo(Info object)
      {
        return createInfoAdapter();
      }
      @Override
      public Adapter caseInfoElementType(InfoElementType object)
      {
        return createInfoElementTypeAdapter();
      }
      @Override
      public Adapter caseDate(Date object)
      {
        return createDateAdapter();
      }
      @Override
      public Adapter caseMcDay(McDay object)
      {
        return createMcDayAdapter();
      }
      @Override
      public Adapter casePreface(Preface object)
      {
        return createPrefaceAdapter();
      }
      @Override
      public Adapter casePrefaceElementType(PrefaceElementType object)
      {
        return createPrefaceElementTypeAdapter();
      }
      @Override
      public Adapter caseSection(Section object)
      {
        return createSectionAdapter();
      }
      @Override
      public Adapter caseSectionElementType(SectionElementType object)
      {
        return createSectionElementTypeAdapter();
      }
      @Override
      public Adapter caseLdpType(LdpType object)
      {
        return createLdpTypeAdapter();
      }
      @Override
      public Adapter caseAll(All object)
      {
        return createAllAdapter();
      }
      @Override
      public Adapter caseGenDate(GenDate object)
      {
        return createGenDateAdapter();
      }
      @Override
      public Adapter caseGenYear(GenYear object)
      {
        return createGenYearAdapter();
      }
      @Override
      public Adapter caseMCD(MCD object)
      {
        return createMCDAdapter();
      }
      @Override
      public Adapter caseMOW(MOW object)
      {
        return createMOWAdapter();
      }
      @Override
      public Adapter caseNOP(NOP object)
      {
        return createNOPAdapter();
      }
      @Override
      public Adapter caseDOM(DOM object)
      {
        return createDOMAdapter();
      }
      @Override
      public Adapter caseDOP(DOP object)
      {
        return createDOPAdapter();
      }
      @Override
      public Adapter caseDOWN(DOWN object)
      {
        return createDOWNAdapter();
      }
      @Override
      public Adapter caseDOWT(DOWT object)
      {
        return createDOWTAdapter();
      }
      @Override
      public Adapter caseEOW(EOW object)
      {
        return createEOWAdapter();
      }
      @Override
      public Adapter caseSAEC(SAEC object)
      {
        return createSAECAdapter();
      }
      @Override
      public Adapter caseSOL(SOL object)
      {
        return createSOLAdapter();
      }
      @Override
      public Adapter caseDOL(DOL object)
      {
        return createDOLAdapter();
      }
      @Override
      public Adapter caseWOLC(WOLC object)
      {
        return createWOLCAdapter();
      }
      @Override
      public Adapter caseWDOLC(WDOLC object)
      {
        return createWDOLCAdapter();
      }
      @Override
      public Adapter caseSBT(SBT object)
      {
        return createSBTAdapter();
      }
      @Override
      public Adapter caseTemplateFragment(TemplateFragment object)
      {
        return createTemplateFragmentAdapter();
      }
      @Override
      public Adapter casePrefaceFragment(PrefaceFragment object)
      {
        return createPrefaceFragmentAdapter();
      }
      @Override
      public Adapter caseSectionFragment(SectionFragment object)
      {
        return createSectionFragmentAdapter();
      }
      @Override
      public Adapter caseBreak(Break object)
      {
        return createBreakAdapter();
      }
      @Override
      public Adapter casePageNumber(PageNumber object)
      {
        return createPageNumberAdapter();
      }
      @Override
      public Adapter casePassThroughHtml(PassThroughHtml object)
      {
        return createPassThroughHtmlAdapter();
      }
      @Override
      public Adapter casePassThroughPdf(PassThroughPdf object)
      {
        return createPassThroughPdfAdapter();
      }
      @Override
      public Adapter caseTitle(Title object)
      {
        return createTitleAdapter();
      }
      @Override
      public Adapter caseSubTitle(SubTitle object)
      {
        return createSubTitleAdapter();
      }
      @Override
      public Adapter caseParagraph(Paragraph object)
      {
        return createParagraphAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseHymn(Hymn object)
      {
        return createHymnAdapter();
      }
      @Override
      public Adapter caseMedia(Media object)
      {
        return createMediaAdapter();
      }
      @Override
      public Adapter caseVerse(Verse object)
      {
        return createVerseAdapter();
      }
      @Override
      public Adapter caseActor(Actor object)
      {
        return createActorAdapter();
      }
      @Override
      public Adapter caseRubric(Rubric object)
      {
        return createRubricAdapter();
      }
      @Override
      public Adapter caseDialog(Dialog object)
      {
        return createDialogAdapter();
      }
      @Override
      public Adapter caseReading(Reading object)
      {
        return createReadingAdapter();
      }
      @Override
      public Adapter caseHeading1(Heading1 object)
      {
        return createHeading1Adapter();
      }
      @Override
      public Adapter caseHeading2(Heading2 object)
      {
        return createHeading2Adapter();
      }
      @Override
      public Adapter caseHeading3(Heading3 object)
      {
        return createHeading3Adapter();
      }
      @Override
      public Adapter caseElementType(ElementType object)
      {
        return createElementTypeAdapter();
      }
      @Override
      public Adapter caseAid(Aid object)
      {
        return createAidAdapter();
      }
      @Override
      public Adapter caseVersion(Version object)
      {
        return createVersionAdapter();
      }
      @Override
      public Adapter caseLitBook(LitBook object)
      {
        return createLitBookAdapter();
      }
      @Override
      public Adapter caseSetLocale(SetLocale object)
      {
        return createSetLocaleAdapter();
      }
      @Override
      public Adapter caseRestoreLocale(RestoreLocale object)
      {
        return createRestoreLocaleAdapter();
      }
      @Override
      public Adapter caseWhenDate(WhenDate object)
      {
        return createWhenDateAdapter();
      }
      @Override
      public Adapter caseWhenDateCase(WhenDateCase object)
      {
        return createWhenDateCaseAdapter();
      }
      @Override
      public Adapter caseAbstractDateCase(AbstractDateCase object)
      {
        return createAbstractDateCaseAdapter();
      }
      @Override
      public Adapter caseDateRange(DateRange object)
      {
        return createDateRangeAdapter();
      }
      @Override
      public Adapter caseDateSet(DateSet object)
      {
        return createDateSetAdapter();
      }
      @Override
      public Adapter caseWhenDayName(WhenDayName object)
      {
        return createWhenDayNameAdapter();
      }
      @Override
      public Adapter caseWhenDayNameCase(WhenDayNameCase object)
      {
        return createWhenDayNameCaseAdapter();
      }
      @Override
      public Adapter caseAbstractDayNameCase(AbstractDayNameCase object)
      {
        return createAbstractDayNameCaseAdapter();
      }
      @Override
      public Adapter caseDayNameRange(DayNameRange object)
      {
        return createDayNameRangeAdapter();
      }
      @Override
      public Adapter caseDayNameSet(DayNameSet object)
      {
        return createDayNameSetAdapter();
      }
      @Override
      public Adapter caseWhenPentecostarionDay(WhenPentecostarionDay object)
      {
        return createWhenPentecostarionDayAdapter();
      }
      @Override
      public Adapter caseWhenTriodionDay(WhenTriodionDay object)
      {
        return createWhenTriodionDayAdapter();
      }
      @Override
      public Adapter caseWhenMovableCycleDay(WhenMovableCycleDay object)
      {
        return createWhenMovableCycleDayAdapter();
      }
      @Override
      public Adapter caseWhenSundayAfterElevationOfCrossDay(WhenSundayAfterElevationOfCrossDay object)
      {
        return createWhenSundayAfterElevationOfCrossDayAdapter();
      }
      @Override
      public Adapter caseWhenLukanCycleDay(WhenLukanCycleDay object)
      {
        return createWhenLukanCycleDayAdapter();
      }
      @Override
      public Adapter caseWhenPascha(WhenPascha object)
      {
        return createWhenPaschaAdapter();
      }
      @Override
      public Adapter caseWhenOther(WhenOther object)
      {
        return createWhenOtherAdapter();
      }
      @Override
      public Adapter caseWhenPeriodCase(WhenPeriodCase object)
      {
        return createWhenPeriodCaseAdapter();
      }
      @Override
      public Adapter caseAbstractDayCase(AbstractDayCase object)
      {
        return createAbstractDayCaseAdapter();
      }
      @Override
      public Adapter caseDayRange(DayRange object)
      {
        return createDayRangeAdapter();
      }
      @Override
      public Adapter caseDaySet(DaySet object)
      {
        return createDaySetAdapter();
      }
      @Override
      public Adapter caseWhenModeOfWeek(WhenModeOfWeek object)
      {
        return createWhenModeOfWeekAdapter();
      }
      @Override
      public Adapter caseWhenModeOfWeekCase(WhenModeOfWeekCase object)
      {
        return createWhenModeOfWeekCaseAdapter();
      }
      @Override
      public Adapter caseModeOfWeekSet(ModeOfWeekSet object)
      {
        return createModeOfWeekSetAdapter();
      }
      @Override
      public Adapter caseWhenSundaysBeforeTriodion(WhenSundaysBeforeTriodion object)
      {
        return createWhenSundaysBeforeTriodionAdapter();
      }
      @Override
      public Adapter caseSundaysBeforeTriodionCase(SundaysBeforeTriodionCase object)
      {
        return createSundaysBeforeTriodionCaseAdapter();
      }
      @Override
      public Adapter caseWhenExists(WhenExists object)
      {
        return createWhenExistsAdapter();
      }
      @Override
      public Adapter caseWhenExistsCase(WhenExistsCase object)
      {
        return createWhenExistsCaseAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.AtemModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.AtemModel
   * @generated
   */
  public Adapter createAtemModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Head <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Head
   * @generated
   */
  public Adapter createHeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.HeadComponent <em>Head Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.HeadComponent
   * @generated
   */
  public Adapter createHeadComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Driver <em>Driver</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Driver
   * @generated
   */
  public Adapter createDriverAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.TemplateTitle <em>Template Title</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.TemplateTitle
   * @generated
   */
  public Adapter createTemplateTitleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.PageKeepWithNext <em>Page Keep With Next</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.PageKeepWithNext
   * @generated
   */
  public Adapter createPageKeepWithNextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.PageHeaderEven <em>Page Header Even</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.PageHeaderEven
   * @generated
   */
  public Adapter createPageHeaderEvenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.PageHeaderOdd <em>Page Header Odd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.PageHeaderOdd
   * @generated
   */
  public Adapter createPageHeaderOddAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.PageFooterEven <em>Page Footer Even</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.PageFooterEven
   * @generated
   */
  public Adapter createPageFooterEvenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.PageFooterOdd <em>Page Footer Odd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.PageFooterOdd
   * @generated
   */
  public Adapter createPageFooterOddAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterColumn <em>Header Footer Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterColumn
   * @generated
   */
  public Adapter createHeaderFooterColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterColumnLeft <em>Header Footer Column Left</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterColumnLeft
   * @generated
   */
  public Adapter createHeaderFooterColumnLeftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterColumnCenter <em>Header Footer Column Center</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterColumnCenter
   * @generated
   */
  public Adapter createHeaderFooterColumnCenterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterColumnRight <em>Header Footer Column Right</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterColumnRight
   * @generated
   */
  public Adapter createHeaderFooterColumnRightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterFragment <em>Header Footer Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterFragment
   * @generated
   */
  public Adapter createHeaderFooterFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterText <em>Header Footer Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterText
   * @generated
   */
  public Adapter createHeaderFooterTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterDate <em>Header Footer Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterDate
   * @generated
   */
  public Adapter createHeaderFooterDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterPageNumber <em>Header Footer Page Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterPageNumber
   * @generated
   */
  public Adapter createHeaderFooterPageNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterLookup <em>Header Footer Lookup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterLookup
   * @generated
   */
  public Adapter createHeaderFooterLookupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterTitle <em>Header Footer Title</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterTitle
   * @generated
   */
  public Adapter createHeaderFooterTitleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterCommemoration <em>Header Footer Commemoration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterCommemoration
   * @generated
   */
  public Adapter createHeaderFooterCommemorationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Commemoration <em>Commemoration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Commemoration
   * @generated
   */
  public Adapter createCommemorationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.TemplateStatus <em>Template Status</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.TemplateStatus
   * @generated
   */
  public Adapter createTemplateStatusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.AbstractComponent <em>Abstract Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.AbstractComponent
   * @generated
   */
  public Adapter createAbstractComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.VersionSwitch <em>Version Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.VersionSwitch
   * @generated
   */
  public Adapter createVersionSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.ResourceText <em>Resource Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.ResourceText
   * @generated
   */
  public Adapter createResourceTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Lookup <em>Lookup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Lookup
   * @generated
   */
  public Adapter createLookupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.LDP <em>LDP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.LDP
   * @generated
   */
  public Adapter createLDPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.TaggedText <em>Tagged Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.TaggedText
   * @generated
   */
  public Adapter createTaggedTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Info <em>Info</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Info
   * @generated
   */
  public Adapter createInfoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.InfoElementType <em>Info Element Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.InfoElementType
   * @generated
   */
  public Adapter createInfoElementTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Date
   * @generated
   */
  public Adapter createDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.McDay <em>Mc Day</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.McDay
   * @generated
   */
  public Adapter createMcDayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Preface <em>Preface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Preface
   * @generated
   */
  public Adapter createPrefaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.PrefaceElementType <em>Preface Element Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.PrefaceElementType
   * @generated
   */
  public Adapter createPrefaceElementTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Section
   * @generated
   */
  public Adapter createSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.SectionElementType <em>Section Element Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.SectionElementType
   * @generated
   */
  public Adapter createSectionElementTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.LdpType <em>Ldp Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.LdpType
   * @generated
   */
  public Adapter createLdpTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.All <em>All</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.All
   * @generated
   */
  public Adapter createAllAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.GenDate <em>Gen Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.GenDate
   * @generated
   */
  public Adapter createGenDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.GenYear <em>Gen Year</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.GenYear
   * @generated
   */
  public Adapter createGenYearAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.MCD <em>MCD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.MCD
   * @generated
   */
  public Adapter createMCDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.MOW <em>MOW</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.MOW
   * @generated
   */
  public Adapter createMOWAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.NOP <em>NOP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.NOP
   * @generated
   */
  public Adapter createNOPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.DOM <em>DOM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.DOM
   * @generated
   */
  public Adapter createDOMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.DOP <em>DOP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.DOP
   * @generated
   */
  public Adapter createDOPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.DOWN <em>DOWN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.DOWN
   * @generated
   */
  public Adapter createDOWNAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.DOWT <em>DOWT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.DOWT
   * @generated
   */
  public Adapter createDOWTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.EOW <em>EOW</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.EOW
   * @generated
   */
  public Adapter createEOWAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.SAEC <em>SAEC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.SAEC
   * @generated
   */
  public Adapter createSAECAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.SOL <em>SOL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.SOL
   * @generated
   */
  public Adapter createSOLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.DOL <em>DOL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.DOL
   * @generated
   */
  public Adapter createDOLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WOLC <em>WOLC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WOLC
   * @generated
   */
  public Adapter createWOLCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WDOLC <em>WDOLC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WDOLC
   * @generated
   */
  public Adapter createWDOLCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.SBT <em>SBT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.SBT
   * @generated
   */
  public Adapter createSBTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.TemplateFragment <em>Template Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.TemplateFragment
   * @generated
   */
  public Adapter createTemplateFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.PrefaceFragment <em>Preface Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.PrefaceFragment
   * @generated
   */
  public Adapter createPrefaceFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.SectionFragment <em>Section Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.SectionFragment
   * @generated
   */
  public Adapter createSectionFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Break <em>Break</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Break
   * @generated
   */
  public Adapter createBreakAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.PageNumber <em>Page Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.PageNumber
   * @generated
   */
  public Adapter createPageNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.PassThroughHtml <em>Pass Through Html</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.PassThroughHtml
   * @generated
   */
  public Adapter createPassThroughHtmlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.PassThroughPdf <em>Pass Through Pdf</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.PassThroughPdf
   * @generated
   */
  public Adapter createPassThroughPdfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Title
   * @generated
   */
  public Adapter createTitleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.SubTitle <em>Sub Title</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.SubTitle
   * @generated
   */
  public Adapter createSubTitleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Paragraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Paragraph
   * @generated
   */
  public Adapter createParagraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Hymn <em>Hymn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Hymn
   * @generated
   */
  public Adapter createHymnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Media <em>Media</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Media
   * @generated
   */
  public Adapter createMediaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Verse <em>Verse</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Verse
   * @generated
   */
  public Adapter createVerseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Actor
   * @generated
   */
  public Adapter createActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Rubric <em>Rubric</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Rubric
   * @generated
   */
  public Adapter createRubricAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Dialog <em>Dialog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Dialog
   * @generated
   */
  public Adapter createDialogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Reading <em>Reading</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Reading
   * @generated
   */
  public Adapter createReadingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Heading1 <em>Heading1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Heading1
   * @generated
   */
  public Adapter createHeading1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Heading2 <em>Heading2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Heading2
   * @generated
   */
  public Adapter createHeading2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Heading3 <em>Heading3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Heading3
   * @generated
   */
  public Adapter createHeading3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.ElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.ElementType
   * @generated
   */
  public Adapter createElementTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Aid <em>Aid</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Aid
   * @generated
   */
  public Adapter createAidAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.Version
   * @generated
   */
  public Adapter createVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.LitBook <em>Lit Book</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.LitBook
   * @generated
   */
  public Adapter createLitBookAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.SetLocale <em>Set Locale</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.SetLocale
   * @generated
   */
  public Adapter createSetLocaleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.RestoreLocale <em>Restore Locale</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.RestoreLocale
   * @generated
   */
  public Adapter createRestoreLocaleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenDate <em>When Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenDate
   * @generated
   */
  public Adapter createWhenDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenDateCase <em>When Date Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenDateCase
   * @generated
   */
  public Adapter createWhenDateCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.AbstractDateCase <em>Abstract Date Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.AbstractDateCase
   * @generated
   */
  public Adapter createAbstractDateCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.DateRange <em>Date Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.DateRange
   * @generated
   */
  public Adapter createDateRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.DateSet <em>Date Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.DateSet
   * @generated
   */
  public Adapter createDateSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenDayName <em>When Day Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenDayName
   * @generated
   */
  public Adapter createWhenDayNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenDayNameCase <em>When Day Name Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenDayNameCase
   * @generated
   */
  public Adapter createWhenDayNameCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.AbstractDayNameCase <em>Abstract Day Name Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.AbstractDayNameCase
   * @generated
   */
  public Adapter createAbstractDayNameCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.DayNameRange <em>Day Name Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.DayNameRange
   * @generated
   */
  public Adapter createDayNameRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.DayNameSet <em>Day Name Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.DayNameSet
   * @generated
   */
  public Adapter createDayNameSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay <em>When Pentecostarion Day</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay
   * @generated
   */
  public Adapter createWhenPentecostarionDayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenTriodionDay <em>When Triodion Day</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenTriodionDay
   * @generated
   */
  public Adapter createWhenTriodionDayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenMovableCycleDay <em>When Movable Cycle Day</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenMovableCycleDay
   * @generated
   */
  public Adapter createWhenMovableCycleDayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay <em>When Sunday After Elevation Of Cross Day</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay
   * @generated
   */
  public Adapter createWhenSundayAfterElevationOfCrossDayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay <em>When Lukan Cycle Day</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay
   * @generated
   */
  public Adapter createWhenLukanCycleDayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenPascha <em>When Pascha</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenPascha
   * @generated
   */
  public Adapter createWhenPaschaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenOther <em>When Other</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenOther
   * @generated
   */
  public Adapter createWhenOtherAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenPeriodCase <em>When Period Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenPeriodCase
   * @generated
   */
  public Adapter createWhenPeriodCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.AbstractDayCase <em>Abstract Day Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.AbstractDayCase
   * @generated
   */
  public Adapter createAbstractDayCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.DayRange <em>Day Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.DayRange
   * @generated
   */
  public Adapter createDayRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.DaySet <em>Day Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.DaySet
   * @generated
   */
  public Adapter createDaySetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeek <em>When Mode Of Week</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenModeOfWeek
   * @generated
   */
  public Adapter createWhenModeOfWeekAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase <em>When Mode Of Week Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase
   * @generated
   */
  public Adapter createWhenModeOfWeekCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.ModeOfWeekSet <em>Mode Of Week Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.ModeOfWeekSet
   * @generated
   */
  public Adapter createModeOfWeekSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion <em>When Sundays Before Triodion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion
   * @generated
   */
  public Adapter createWhenSundaysBeforeTriodionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase <em>Sundays Before Triodion Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase
   * @generated
   */
  public Adapter createSundaysBeforeTriodionCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenExists <em>When Exists</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenExists
   * @generated
   */
  public Adapter createWhenExistsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ages.workbench.templates.dsl.atem.WhenExistsCase <em>When Exists Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ages.workbench.templates.dsl.atem.WhenExistsCase
   * @generated
   */
  public Adapter createWhenExistsCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AtemAdapterFactory
