/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtemFactoryImpl extends EFactoryImpl implements AtemFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AtemFactory init()
  {
    try
    {
      AtemFactory theAtemFactory = (AtemFactory)EPackage.Registry.INSTANCE.getEFactory(AtemPackage.eNS_URI);
      if (theAtemFactory != null)
      {
        return theAtemFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AtemFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtemFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AtemPackage.ATEM_MODEL: return createAtemModel();
      case AtemPackage.HEAD: return createHead();
      case AtemPackage.HEAD_COMPONENT: return createHeadComponent();
      case AtemPackage.DRIVER: return createDriver();
      case AtemPackage.TEMPLATE_TITLE: return createTemplateTitle();
      case AtemPackage.PAGE_KEEP_WITH_NEXT: return createPageKeepWithNext();
      case AtemPackage.PAGE_HEADER_EVEN: return createPageHeaderEven();
      case AtemPackage.PAGE_HEADER_ODD: return createPageHeaderOdd();
      case AtemPackage.PAGE_FOOTER_EVEN: return createPageFooterEven();
      case AtemPackage.PAGE_FOOTER_ODD: return createPageFooterOdd();
      case AtemPackage.HEADER_FOOTER_COLUMN: return createHeaderFooterColumn();
      case AtemPackage.HEADER_FOOTER_COLUMN_LEFT: return createHeaderFooterColumnLeft();
      case AtemPackage.HEADER_FOOTER_COLUMN_CENTER: return createHeaderFooterColumnCenter();
      case AtemPackage.HEADER_FOOTER_COLUMN_RIGHT: return createHeaderFooterColumnRight();
      case AtemPackage.HEADER_FOOTER_FRAGMENT: return createHeaderFooterFragment();
      case AtemPackage.HEADER_FOOTER_TEXT: return createHeaderFooterText();
      case AtemPackage.HEADER_FOOTER_DATE: return createHeaderFooterDate();
      case AtemPackage.HEADER_FOOTER_PAGE_NUMBER: return createHeaderFooterPageNumber();
      case AtemPackage.HEADER_FOOTER_LOOKUP: return createHeaderFooterLookup();
      case AtemPackage.HEADER_FOOTER_TITLE: return createHeaderFooterTitle();
      case AtemPackage.HEADER_FOOTER_COMMEMORATION: return createHeaderFooterCommemoration();
      case AtemPackage.COMMEMORATION: return createCommemoration();
      case AtemPackage.TEMPLATE_STATUS: return createTemplateStatus();
      case AtemPackage.ABSTRACT_COMPONENT: return createAbstractComponent();
      case AtemPackage.IMPORT: return createImport();
      case AtemPackage.VERSION_SWITCH: return createVersionSwitch();
      case AtemPackage.RESOURCE_TEXT: return createResourceText();
      case AtemPackage.LOOKUP: return createLookup();
      case AtemPackage.LDP: return createLDP();
      case AtemPackage.TAGGED_TEXT: return createTaggedText();
      case AtemPackage.INFO: return createInfo();
      case AtemPackage.INFO_ELEMENT_TYPE: return createInfoElementType();
      case AtemPackage.DATE: return createDate();
      case AtemPackage.PREFACE: return createPreface();
      case AtemPackage.PREFACE_ELEMENT_TYPE: return createPrefaceElementType();
      case AtemPackage.SECTION: return createSection();
      case AtemPackage.SECTION_ELEMENT_TYPE: return createSectionElementType();
      case AtemPackage.LDP_TYPE: return createLdpType();
      case AtemPackage.ALL: return createAll();
      case AtemPackage.GEN_DATE: return createGenDate();
      case AtemPackage.GEN_YEAR: return createGenYear();
      case AtemPackage.MCD: return createMCD();
      case AtemPackage.MOW: return createMOW();
      case AtemPackage.NOP: return createNOP();
      case AtemPackage.DOM: return createDOM();
      case AtemPackage.DOP: return createDOP();
      case AtemPackage.DOWN: return createDOWN();
      case AtemPackage.DOWT: return createDOWT();
      case AtemPackage.EOW: return createEOW();
      case AtemPackage.SAEC: return createSAEC();
      case AtemPackage.SOL: return createSOL();
      case AtemPackage.DOL: return createDOL();
      case AtemPackage.WOLC: return createWOLC();
      case AtemPackage.WDOLC: return createWDOLC();
      case AtemPackage.SBT: return createSBT();
      case AtemPackage.TEMPLATE_FRAGMENT: return createTemplateFragment();
      case AtemPackage.PREFACE_FRAGMENT: return createPrefaceFragment();
      case AtemPackage.SECTION_FRAGMENT: return createSectionFragment();
      case AtemPackage.BREAK: return createBreak();
      case AtemPackage.PAGE_NUMBER: return createPageNumber();
      case AtemPackage.PASS_THROUGH_HTML: return createPassThroughHtml();
      case AtemPackage.PASS_THROUGH_PDF: return createPassThroughPdf();
      case AtemPackage.TITLE: return createTitle();
      case AtemPackage.SUB_TITLE: return createSubTitle();
      case AtemPackage.PARAGRAPH: return createParagraph();
      case AtemPackage.BLOCK: return createBlock();
      case AtemPackage.HYMN: return createHymn();
      case AtemPackage.MEDIA: return createMedia();
      case AtemPackage.VERSE: return createVerse();
      case AtemPackage.ACTOR: return createActor();
      case AtemPackage.RUBRIC: return createRubric();
      case AtemPackage.DIALOG: return createDialog();
      case AtemPackage.READING: return createReading();
      case AtemPackage.HEADING1: return createHeading1();
      case AtemPackage.HEADING2: return createHeading2();
      case AtemPackage.HEADING3: return createHeading3();
      case AtemPackage.ELEMENT_TYPE: return createElementType();
      case AtemPackage.AID: return createAid();
      case AtemPackage.VERSION: return createVersion();
      case AtemPackage.LIT_BOOK: return createLitBook();
      case AtemPackage.SET_LOCALE: return createSetLocale();
      case AtemPackage.RESTORE_LOCALE: return createRestoreLocale();
      case AtemPackage.WHEN_DATE: return createWhenDate();
      case AtemPackage.WHEN_DATE_CASE: return createWhenDateCase();
      case AtemPackage.ABSTRACT_DATE_CASE: return createAbstractDateCase();
      case AtemPackage.DATE_RANGE: return createDateRange();
      case AtemPackage.DATE_SET: return createDateSet();
      case AtemPackage.WHEN_DAY_NAME: return createWhenDayName();
      case AtemPackage.WHEN_DAY_NAME_CASE: return createWhenDayNameCase();
      case AtemPackage.ABSTRACT_DAY_NAME_CASE: return createAbstractDayNameCase();
      case AtemPackage.DAY_NAME_RANGE: return createDayNameRange();
      case AtemPackage.DAY_NAME_SET: return createDayNameSet();
      case AtemPackage.WHEN_PENTECOSTARION_DAY: return createWhenPentecostarionDay();
      case AtemPackage.WHEN_TRIODION_DAY: return createWhenTriodionDay();
      case AtemPackage.WHEN_MOVABLE_CYCLE_DAY: return createWhenMovableCycleDay();
      case AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY: return createWhenSundayAfterElevationOfCrossDay();
      case AtemPackage.WHEN_LUKAN_CYCLE_DAY: return createWhenLukanCycleDay();
      case AtemPackage.WHEN_PASCHA: return createWhenPascha();
      case AtemPackage.WHEN_OTHER: return createWhenOther();
      case AtemPackage.WHEN_PERIOD_CASE: return createWhenPeriodCase();
      case AtemPackage.ABSTRACT_DAY_CASE: return createAbstractDayCase();
      case AtemPackage.DAY_RANGE: return createDayRange();
      case AtemPackage.DAY_SET: return createDaySet();
      case AtemPackage.WHEN_MODE_OF_WEEK: return createWhenModeOfWeek();
      case AtemPackage.WHEN_MODE_OF_WEEK_CASE: return createWhenModeOfWeekCase();
      case AtemPackage.MODE_OF_WEEK_SET: return createModeOfWeekSet();
      case AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION: return createWhenSundaysBeforeTriodion();
      case AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE: return createSundaysBeforeTriodionCase();
      case AtemPackage.WHEN_EXISTS: return createWhenExists();
      case AtemPackage.WHEN_EXISTS_CASE: return createWhenExistsCase();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AtemPackage.VERSION_SWITCH_TYPE:
        return createVersionSwitchTypeFromString(eDataType, initialValue);
      case AtemPackage.LANGUAGE:
        return createLanguageFromString(eDataType, initialValue);
      case AtemPackage.BREAK_TYPE:
        return createBreakTypeFromString(eDataType, initialValue);
      case AtemPackage.TEMPLATE_STATUSES:
        return createTemplateStatusesFromString(eDataType, initialValue);
      case AtemPackage.NULL:
        return createNullFromString(eDataType, initialValue);
      case AtemPackage.MODE_TYPES:
        return createModeTypesFromString(eDataType, initialValue);
      case AtemPackage.DOW_TYPES:
        return createDowTypesFromString(eDataType, initialValue);
      case AtemPackage.BOOK_TYPES:
        return createBookTypesFromString(eDataType, initialValue);
      case AtemPackage.SEASONS:
        return createSeasonsFromString(eDataType, initialValue);
      case AtemPackage.DAY_OF_MONTH_TYPES:
        return createDayOfMonthTypesFromString(eDataType, initialValue);
      case AtemPackage.PERIOD_TYPE:
        return createPeriodTypeFromString(eDataType, initialValue);
      case AtemPackage.DAY_OF_WEEK:
        return createDayOfWeekFromString(eDataType, initialValue);
      case AtemPackage.MONTH_NAME:
        return createMonthNameFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AtemPackage.VERSION_SWITCH_TYPE:
        return convertVersionSwitchTypeToString(eDataType, instanceValue);
      case AtemPackage.LANGUAGE:
        return convertLanguageToString(eDataType, instanceValue);
      case AtemPackage.BREAK_TYPE:
        return convertBreakTypeToString(eDataType, instanceValue);
      case AtemPackage.TEMPLATE_STATUSES:
        return convertTemplateStatusesToString(eDataType, instanceValue);
      case AtemPackage.NULL:
        return convertNullToString(eDataType, instanceValue);
      case AtemPackage.MODE_TYPES:
        return convertModeTypesToString(eDataType, instanceValue);
      case AtemPackage.DOW_TYPES:
        return convertDowTypesToString(eDataType, instanceValue);
      case AtemPackage.BOOK_TYPES:
        return convertBookTypesToString(eDataType, instanceValue);
      case AtemPackage.SEASONS:
        return convertSeasonsToString(eDataType, instanceValue);
      case AtemPackage.DAY_OF_MONTH_TYPES:
        return convertDayOfMonthTypesToString(eDataType, instanceValue);
      case AtemPackage.PERIOD_TYPE:
        return convertPeriodTypeToString(eDataType, instanceValue);
      case AtemPackage.DAY_OF_WEEK:
        return convertDayOfWeekToString(eDataType, instanceValue);
      case AtemPackage.MONTH_NAME:
        return convertMonthNameToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtemModel createAtemModel()
  {
    AtemModelImpl atemModel = new AtemModelImpl();
    return atemModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Head createHead()
  {
    HeadImpl head = new HeadImpl();
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeadComponent createHeadComponent()
  {
    HeadComponentImpl headComponent = new HeadComponentImpl();
    return headComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Driver createDriver()
  {
    DriverImpl driver = new DriverImpl();
    return driver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateTitle createTemplateTitle()
  {
    TemplateTitleImpl templateTitle = new TemplateTitleImpl();
    return templateTitle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageKeepWithNext createPageKeepWithNext()
  {
    PageKeepWithNextImpl pageKeepWithNext = new PageKeepWithNextImpl();
    return pageKeepWithNext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageHeaderEven createPageHeaderEven()
  {
    PageHeaderEvenImpl pageHeaderEven = new PageHeaderEvenImpl();
    return pageHeaderEven;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageHeaderOdd createPageHeaderOdd()
  {
    PageHeaderOddImpl pageHeaderOdd = new PageHeaderOddImpl();
    return pageHeaderOdd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageFooterEven createPageFooterEven()
  {
    PageFooterEvenImpl pageFooterEven = new PageFooterEvenImpl();
    return pageFooterEven;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageFooterOdd createPageFooterOdd()
  {
    PageFooterOddImpl pageFooterOdd = new PageFooterOddImpl();
    return pageFooterOdd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderFooterColumn createHeaderFooterColumn()
  {
    HeaderFooterColumnImpl headerFooterColumn = new HeaderFooterColumnImpl();
    return headerFooterColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderFooterColumnLeft createHeaderFooterColumnLeft()
  {
    HeaderFooterColumnLeftImpl headerFooterColumnLeft = new HeaderFooterColumnLeftImpl();
    return headerFooterColumnLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderFooterColumnCenter createHeaderFooterColumnCenter()
  {
    HeaderFooterColumnCenterImpl headerFooterColumnCenter = new HeaderFooterColumnCenterImpl();
    return headerFooterColumnCenter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderFooterColumnRight createHeaderFooterColumnRight()
  {
    HeaderFooterColumnRightImpl headerFooterColumnRight = new HeaderFooterColumnRightImpl();
    return headerFooterColumnRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderFooterFragment createHeaderFooterFragment()
  {
    HeaderFooterFragmentImpl headerFooterFragment = new HeaderFooterFragmentImpl();
    return headerFooterFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderFooterText createHeaderFooterText()
  {
    HeaderFooterTextImpl headerFooterText = new HeaderFooterTextImpl();
    return headerFooterText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderFooterDate createHeaderFooterDate()
  {
    HeaderFooterDateImpl headerFooterDate = new HeaderFooterDateImpl();
    return headerFooterDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderFooterPageNumber createHeaderFooterPageNumber()
  {
    HeaderFooterPageNumberImpl headerFooterPageNumber = new HeaderFooterPageNumberImpl();
    return headerFooterPageNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderFooterLookup createHeaderFooterLookup()
  {
    HeaderFooterLookupImpl headerFooterLookup = new HeaderFooterLookupImpl();
    return headerFooterLookup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderFooterTitle createHeaderFooterTitle()
  {
    HeaderFooterTitleImpl headerFooterTitle = new HeaderFooterTitleImpl();
    return headerFooterTitle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderFooterCommemoration createHeaderFooterCommemoration()
  {
    HeaderFooterCommemorationImpl headerFooterCommemoration = new HeaderFooterCommemorationImpl();
    return headerFooterCommemoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commemoration createCommemoration()
  {
    CommemorationImpl commemoration = new CommemorationImpl();
    return commemoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateStatus createTemplateStatus()
  {
    TemplateStatusImpl templateStatus = new TemplateStatusImpl();
    return templateStatus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractComponent createAbstractComponent()
  {
    AbstractComponentImpl abstractComponent = new AbstractComponentImpl();
    return abstractComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersionSwitch createVersionSwitch()
  {
    VersionSwitchImpl versionSwitch = new VersionSwitchImpl();
    return versionSwitch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceText createResourceText()
  {
    ResourceTextImpl resourceText = new ResourceTextImpl();
    return resourceText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lookup createLookup()
  {
    LookupImpl lookup = new LookupImpl();
    return lookup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDP createLDP()
  {
    LDPImpl ldp = new LDPImpl();
    return ldp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaggedText createTaggedText()
  {
    TaggedTextImpl taggedText = new TaggedTextImpl();
    return taggedText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Info createInfo()
  {
    InfoImpl info = new InfoImpl();
    return info;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfoElementType createInfoElementType()
  {
    InfoElementTypeImpl infoElementType = new InfoElementTypeImpl();
    return infoElementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date createDate()
  {
    DateImpl date = new DateImpl();
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preface createPreface()
  {
    PrefaceImpl preface = new PrefaceImpl();
    return preface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefaceElementType createPrefaceElementType()
  {
    PrefaceElementTypeImpl prefaceElementType = new PrefaceElementTypeImpl();
    return prefaceElementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionElementType createSectionElementType()
  {
    SectionElementTypeImpl sectionElementType = new SectionElementTypeImpl();
    return sectionElementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LdpType createLdpType()
  {
    LdpTypeImpl ldpType = new LdpTypeImpl();
    return ldpType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public All createAll()
  {
    AllImpl all = new AllImpl();
    return all;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenDate createGenDate()
  {
    GenDateImpl genDate = new GenDateImpl();
    return genDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenYear createGenYear()
  {
    GenYearImpl genYear = new GenYearImpl();
    return genYear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCD createMCD()
  {
    MCDImpl mcd = new MCDImpl();
    return mcd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MOW createMOW()
  {
    MOWImpl mow = new MOWImpl();
    return mow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NOP createNOP()
  {
    NOPImpl nop = new NOPImpl();
    return nop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DOM createDOM()
  {
    DOMImpl dom = new DOMImpl();
    return dom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DOP createDOP()
  {
    DOPImpl dop = new DOPImpl();
    return dop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DOWN createDOWN()
  {
    DOWNImpl down = new DOWNImpl();
    return down;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DOWT createDOWT()
  {
    DOWTImpl dowt = new DOWTImpl();
    return dowt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOW createEOW()
  {
    EOWImpl eow = new EOWImpl();
    return eow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SAEC createSAEC()
  {
    SAECImpl saec = new SAECImpl();
    return saec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SOL createSOL()
  {
    SOLImpl sol = new SOLImpl();
    return sol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DOL createDOL()
  {
    DOLImpl dol = new DOLImpl();
    return dol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WOLC createWOLC()
  {
    WOLCImpl wolc = new WOLCImpl();
    return wolc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WDOLC createWDOLC()
  {
    WDOLCImpl wdolc = new WDOLCImpl();
    return wdolc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SBT createSBT()
  {
    SBTImpl sbt = new SBTImpl();
    return sbt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateFragment createTemplateFragment()
  {
    TemplateFragmentImpl templateFragment = new TemplateFragmentImpl();
    return templateFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefaceFragment createPrefaceFragment()
  {
    PrefaceFragmentImpl prefaceFragment = new PrefaceFragmentImpl();
    return prefaceFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionFragment createSectionFragment()
  {
    SectionFragmentImpl sectionFragment = new SectionFragmentImpl();
    return sectionFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Break createBreak()
  {
    BreakImpl break_ = new BreakImpl();
    return break_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageNumber createPageNumber()
  {
    PageNumberImpl pageNumber = new PageNumberImpl();
    return pageNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PassThroughHtml createPassThroughHtml()
  {
    PassThroughHtmlImpl passThroughHtml = new PassThroughHtmlImpl();
    return passThroughHtml;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PassThroughPdf createPassThroughPdf()
  {
    PassThroughPdfImpl passThroughPdf = new PassThroughPdfImpl();
    return passThroughPdf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Title createTitle()
  {
    TitleImpl title = new TitleImpl();
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubTitle createSubTitle()
  {
    SubTitleImpl subTitle = new SubTitleImpl();
    return subTitle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paragraph createParagraph()
  {
    ParagraphImpl paragraph = new ParagraphImpl();
    return paragraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hymn createHymn()
  {
    HymnImpl hymn = new HymnImpl();
    return hymn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Media createMedia()
  {
    MediaImpl media = new MediaImpl();
    return media;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Verse createVerse()
  {
    VerseImpl verse = new VerseImpl();
    return verse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor createActor()
  {
    ActorImpl actor = new ActorImpl();
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rubric createRubric()
  {
    RubricImpl rubric = new RubricImpl();
    return rubric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dialog createDialog()
  {
    DialogImpl dialog = new DialogImpl();
    return dialog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reading createReading()
  {
    ReadingImpl reading = new ReadingImpl();
    return reading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Heading1 createHeading1()
  {
    Heading1Impl heading1 = new Heading1Impl();
    return heading1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Heading2 createHeading2()
  {
    Heading2Impl heading2 = new Heading2Impl();
    return heading2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Heading3 createHeading3()
  {
    Heading3Impl heading3 = new Heading3Impl();
    return heading3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementType createElementType()
  {
    ElementTypeImpl elementType = new ElementTypeImpl();
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aid createAid()
  {
    AidImpl aid = new AidImpl();
    return aid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version createVersion()
  {
    VersionImpl version = new VersionImpl();
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LitBook createLitBook()
  {
    LitBookImpl litBook = new LitBookImpl();
    return litBook;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetLocale createSetLocale()
  {
    SetLocaleImpl setLocale = new SetLocaleImpl();
    return setLocale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestoreLocale createRestoreLocale()
  {
    RestoreLocaleImpl restoreLocale = new RestoreLocaleImpl();
    return restoreLocale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenDate createWhenDate()
  {
    WhenDateImpl whenDate = new WhenDateImpl();
    return whenDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenDateCase createWhenDateCase()
  {
    WhenDateCaseImpl whenDateCase = new WhenDateCaseImpl();
    return whenDateCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDateCase createAbstractDateCase()
  {
    AbstractDateCaseImpl abstractDateCase = new AbstractDateCaseImpl();
    return abstractDateCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateRange createDateRange()
  {
    DateRangeImpl dateRange = new DateRangeImpl();
    return dateRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateSet createDateSet()
  {
    DateSetImpl dateSet = new DateSetImpl();
    return dateSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenDayName createWhenDayName()
  {
    WhenDayNameImpl whenDayName = new WhenDayNameImpl();
    return whenDayName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenDayNameCase createWhenDayNameCase()
  {
    WhenDayNameCaseImpl whenDayNameCase = new WhenDayNameCaseImpl();
    return whenDayNameCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDayNameCase createAbstractDayNameCase()
  {
    AbstractDayNameCaseImpl abstractDayNameCase = new AbstractDayNameCaseImpl();
    return abstractDayNameCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DayNameRange createDayNameRange()
  {
    DayNameRangeImpl dayNameRange = new DayNameRangeImpl();
    return dayNameRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DayNameSet createDayNameSet()
  {
    DayNameSetImpl dayNameSet = new DayNameSetImpl();
    return dayNameSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenPentecostarionDay createWhenPentecostarionDay()
  {
    WhenPentecostarionDayImpl whenPentecostarionDay = new WhenPentecostarionDayImpl();
    return whenPentecostarionDay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenTriodionDay createWhenTriodionDay()
  {
    WhenTriodionDayImpl whenTriodionDay = new WhenTriodionDayImpl();
    return whenTriodionDay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenMovableCycleDay createWhenMovableCycleDay()
  {
    WhenMovableCycleDayImpl whenMovableCycleDay = new WhenMovableCycleDayImpl();
    return whenMovableCycleDay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenSundayAfterElevationOfCrossDay createWhenSundayAfterElevationOfCrossDay()
  {
    WhenSundayAfterElevationOfCrossDayImpl whenSundayAfterElevationOfCrossDay = new WhenSundayAfterElevationOfCrossDayImpl();
    return whenSundayAfterElevationOfCrossDay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenLukanCycleDay createWhenLukanCycleDay()
  {
    WhenLukanCycleDayImpl whenLukanCycleDay = new WhenLukanCycleDayImpl();
    return whenLukanCycleDay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenPascha createWhenPascha()
  {
    WhenPaschaImpl whenPascha = new WhenPaschaImpl();
    return whenPascha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenOther createWhenOther()
  {
    WhenOtherImpl whenOther = new WhenOtherImpl();
    return whenOther;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenPeriodCase createWhenPeriodCase()
  {
    WhenPeriodCaseImpl whenPeriodCase = new WhenPeriodCaseImpl();
    return whenPeriodCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDayCase createAbstractDayCase()
  {
    AbstractDayCaseImpl abstractDayCase = new AbstractDayCaseImpl();
    return abstractDayCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DayRange createDayRange()
  {
    DayRangeImpl dayRange = new DayRangeImpl();
    return dayRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaySet createDaySet()
  {
    DaySetImpl daySet = new DaySetImpl();
    return daySet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenModeOfWeek createWhenModeOfWeek()
  {
    WhenModeOfWeekImpl whenModeOfWeek = new WhenModeOfWeekImpl();
    return whenModeOfWeek;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenModeOfWeekCase createWhenModeOfWeekCase()
  {
    WhenModeOfWeekCaseImpl whenModeOfWeekCase = new WhenModeOfWeekCaseImpl();
    return whenModeOfWeekCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModeOfWeekSet createModeOfWeekSet()
  {
    ModeOfWeekSetImpl modeOfWeekSet = new ModeOfWeekSetImpl();
    return modeOfWeekSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenSundaysBeforeTriodion createWhenSundaysBeforeTriodion()
  {
    WhenSundaysBeforeTriodionImpl whenSundaysBeforeTriodion = new WhenSundaysBeforeTriodionImpl();
    return whenSundaysBeforeTriodion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SundaysBeforeTriodionCase createSundaysBeforeTriodionCase()
  {
    SundaysBeforeTriodionCaseImpl sundaysBeforeTriodionCase = new SundaysBeforeTriodionCaseImpl();
    return sundaysBeforeTriodionCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenExists createWhenExists()
  {
    WhenExistsImpl whenExists = new WhenExistsImpl();
    return whenExists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenExistsCase createWhenExistsCase()
  {
    WhenExistsCaseImpl whenExistsCase = new WhenExistsCaseImpl();
    return whenExistsCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersionSwitchType createVersionSwitchTypeFromString(EDataType eDataType, String initialValue)
  {
    VersionSwitchType result = VersionSwitchType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVersionSwitchTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Language createLanguageFromString(EDataType eDataType, String initialValue)
  {
    Language result = Language.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLanguageToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakType createBreakTypeFromString(EDataType eDataType, String initialValue)
  {
    BreakType result = BreakType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBreakTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateStatuses createTemplateStatusesFromString(EDataType eDataType, String initialValue)
  {
    TemplateStatuses result = TemplateStatuses.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTemplateStatusesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Null createNullFromString(EDataType eDataType, String initialValue)
  {
    Null result = Null.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNullToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModeTypes createModeTypesFromString(EDataType eDataType, String initialValue)
  {
    ModeTypes result = ModeTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertModeTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DowTypes createDowTypesFromString(EDataType eDataType, String initialValue)
  {
    DowTypes result = DowTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDowTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BookTypes createBookTypesFromString(EDataType eDataType, String initialValue)
  {
    BookTypes result = BookTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBookTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Seasons createSeasonsFromString(EDataType eDataType, String initialValue)
  {
    Seasons result = Seasons.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSeasonsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DayOfMonthTypes createDayOfMonthTypesFromString(EDataType eDataType, String initialValue)
  {
    DayOfMonthTypes result = DayOfMonthTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDayOfMonthTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PeriodType createPeriodTypeFromString(EDataType eDataType, String initialValue)
  {
    PeriodType result = PeriodType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPeriodTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DayOfWeek createDayOfWeekFromString(EDataType eDataType, String initialValue)
  {
    DayOfWeek result = DayOfWeek.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDayOfWeekToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonthName createMonthNameFromString(EDataType eDataType, String initialValue)
  {
    MonthName result = MonthName.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMonthNameToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtemPackage getAtemPackage()
  {
    return (AtemPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AtemPackage getPackage()
  {
    return AtemPackage.eINSTANCE;
  }

} //AtemFactoryImpl
