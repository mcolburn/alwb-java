/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.resources.dsl.ares.AresPackage;

import net.ages.workbench.templates.dsl.atem.AbstractComponent;
import net.ages.workbench.templates.dsl.atem.AbstractDateCase;
import net.ages.workbench.templates.dsl.atem.AbstractDayCase;
import net.ages.workbench.templates.dsl.atem.AbstractDayNameCase;
import net.ages.workbench.templates.dsl.atem.Actor;
import net.ages.workbench.templates.dsl.atem.Aid;
import net.ages.workbench.templates.dsl.atem.All;
import net.ages.workbench.templates.dsl.atem.AtemFactory;
import net.ages.workbench.templates.dsl.atem.AtemModel;
import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.Block;
import net.ages.workbench.templates.dsl.atem.BookTypes;
import net.ages.workbench.templates.dsl.atem.Break;
import net.ages.workbench.templates.dsl.atem.BreakType;
import net.ages.workbench.templates.dsl.atem.Commemoration;
import net.ages.workbench.templates.dsl.atem.Date;
import net.ages.workbench.templates.dsl.atem.DateRange;
import net.ages.workbench.templates.dsl.atem.DateSet;
import net.ages.workbench.templates.dsl.atem.DayNameRange;
import net.ages.workbench.templates.dsl.atem.DayNameSet;
import net.ages.workbench.templates.dsl.atem.DayOfMonthTypes;
import net.ages.workbench.templates.dsl.atem.DayOfWeek;
import net.ages.workbench.templates.dsl.atem.DayRange;
import net.ages.workbench.templates.dsl.atem.DaySet;
import net.ages.workbench.templates.dsl.atem.Dialog;
import net.ages.workbench.templates.dsl.atem.DowTypes;
import net.ages.workbench.templates.dsl.atem.Driver;
import net.ages.workbench.templates.dsl.atem.ElementType;
import net.ages.workbench.templates.dsl.atem.GenDate;
import net.ages.workbench.templates.dsl.atem.GenYear;
import net.ages.workbench.templates.dsl.atem.Head;
import net.ages.workbench.templates.dsl.atem.HeadComponent;
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumn;
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumnCenter;
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumnLeft;
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumnRight;
import net.ages.workbench.templates.dsl.atem.HeaderFooterCommemoration;
import net.ages.workbench.templates.dsl.atem.HeaderFooterDate;
import net.ages.workbench.templates.dsl.atem.HeaderFooterFragment;
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
import net.ages.workbench.templates.dsl.atem.InfoElementType;
import net.ages.workbench.templates.dsl.atem.Language;
import net.ages.workbench.templates.dsl.atem.LdpType;
import net.ages.workbench.templates.dsl.atem.LitBook;
import net.ages.workbench.templates.dsl.atem.Lookup;
import net.ages.workbench.templates.dsl.atem.Media;
import net.ages.workbench.templates.dsl.atem.ModeOfWeekSet;
import net.ages.workbench.templates.dsl.atem.ModeTypes;
import net.ages.workbench.templates.dsl.atem.MonthName;
import net.ages.workbench.templates.dsl.atem.Null;
import net.ages.workbench.templates.dsl.atem.PageFooterEven;
import net.ages.workbench.templates.dsl.atem.PageFooterOdd;
import net.ages.workbench.templates.dsl.atem.PageHeaderEven;
import net.ages.workbench.templates.dsl.atem.PageHeaderOdd;
import net.ages.workbench.templates.dsl.atem.PageKeepWithNext;
import net.ages.workbench.templates.dsl.atem.PageNumber;
import net.ages.workbench.templates.dsl.atem.Paragraph;
import net.ages.workbench.templates.dsl.atem.PassThroughHtml;
import net.ages.workbench.templates.dsl.atem.PassThroughPdf;
import net.ages.workbench.templates.dsl.atem.PeriodType;
import net.ages.workbench.templates.dsl.atem.Preface;
import net.ages.workbench.templates.dsl.atem.PrefaceElementType;
import net.ages.workbench.templates.dsl.atem.PrefaceFragment;
import net.ages.workbench.templates.dsl.atem.Reading;
import net.ages.workbench.templates.dsl.atem.ResourceText;
import net.ages.workbench.templates.dsl.atem.RestoreLocale;
import net.ages.workbench.templates.dsl.atem.Rubric;
import net.ages.workbench.templates.dsl.atem.Seasons;
import net.ages.workbench.templates.dsl.atem.Section;
import net.ages.workbench.templates.dsl.atem.SectionElementType;
import net.ages.workbench.templates.dsl.atem.SectionFragment;
import net.ages.workbench.templates.dsl.atem.SetLocale;
import net.ages.workbench.templates.dsl.atem.SubTitle;
import net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase;
import net.ages.workbench.templates.dsl.atem.TaggedText;
import net.ages.workbench.templates.dsl.atem.TemplateFragment;
import net.ages.workbench.templates.dsl.atem.TemplateStatus;
import net.ages.workbench.templates.dsl.atem.TemplateStatuses;
import net.ages.workbench.templates.dsl.atem.TemplateTitle;
import net.ages.workbench.templates.dsl.atem.Title;
import net.ages.workbench.templates.dsl.atem.Verse;
import net.ages.workbench.templates.dsl.atem.Version;
import net.ages.workbench.templates.dsl.atem.VersionSwitch;
import net.ages.workbench.templates.dsl.atem.VersionSwitchType;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtemPackageImpl extends EPackageImpl implements AtemPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atemModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass driverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateTitleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageKeepWithNextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageHeaderEvenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageHeaderOddEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageFooterEvenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageFooterOddEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerFooterColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerFooterColumnLeftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerFooterColumnCenterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerFooterColumnRightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerFooterFragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerFooterTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerFooterDateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerFooterPageNumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerFooterLookupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerFooterTitleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerFooterCommemorationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commemorationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateStatusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionSwitchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taggedTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infoElementTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefaceElementTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionElementTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldpTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass allEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genDateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genYearEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass downEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dowtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass saecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass solEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wolcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wdolcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sbtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateFragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefaceFragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionFragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass breakEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageNumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass passThroughHtmlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass passThroughPdfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass titleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subTitleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paragraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hymnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mediaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rubricEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dialogEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass heading1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass heading2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass heading3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aidEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass litBookEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setLocaleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restoreLocaleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenDateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenDateCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractDateCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenDayNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenDayNameCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractDayNameCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dayNameRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dayNameSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenPentecostarionDayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenTriodionDayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenMovableCycleDayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenSundayAfterElevationOfCrossDayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenLukanCycleDayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenPaschaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenOtherEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenPeriodCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractDayCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dayRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass daySetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenModeOfWeekEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenModeOfWeekCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modeOfWeekSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenSundaysBeforeTriodionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sundaysBeforeTriodionCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenExistsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenExistsCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum versionSwitchTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum languageEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum breakTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum templateStatusesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum nullEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum modeTypesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dowTypesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum bookTypesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum seasonsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dayOfMonthTypesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum periodTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dayOfWeekEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum monthNameEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AtemPackageImpl()
  {
    super(eNS_URI, AtemFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AtemPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AtemPackage init()
  {
    if (isInited) return (AtemPackage)EPackage.Registry.INSTANCE.getEPackage(AtemPackage.eNS_URI);

    // Obtain or create and register package
    AtemPackageImpl theAtemPackage = (AtemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AtemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AtemPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    AresPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theAtemPackage.createPackageContents();

    // Initialize created meta-data
    theAtemPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAtemPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AtemPackage.eNS_URI, theAtemPackage);
    return theAtemPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtemModel()
  {
    return atemModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtemModel_Name()
  {
    return (EAttribute)atemModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtemModel_Dsl_Template_Status()
  {
    return (EReference)atemModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtemModel_Imports()
  {
    return (EReference)atemModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtemModel_Dsl_Template_Driver()
  {
    return (EReference)atemModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtemModel_Dsl_Template_head()
  {
    return (EReference)atemModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtemModel_Dsl_Template_preface()
  {
    return (EReference)atemModelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtemModel_Dsl_Template_components()
  {
    return (EReference)atemModelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHead()
  {
    return headEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHead_Dsl_Head_components()
  {
    return (EReference)headEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeadComponent()
  {
    return headComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDriver()
  {
    return driverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDriver_Dsl_Driver_RegEx()
  {
    return (EAttribute)driverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDriver_Dsl_Driver_Status()
  {
    return (EAttribute)driverEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateTitle()
  {
    return templateTitleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateTitle_Dsl_TemplateTitle_Elements()
  {
    return (EReference)templateTitleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPageKeepWithNext()
  {
    return pageKeepWithNextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPageKeepWithNext_Dsl_PageKeepWithNext_value()
  {
    return (EAttribute)pageKeepWithNextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPageHeaderEven()
  {
    return pageHeaderEvenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageHeaderEven_Dsl_PageHeader_columns()
  {
    return (EReference)pageHeaderEvenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPageHeaderOdd()
  {
    return pageHeaderOddEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageHeaderOdd_Dsl_PageHeader_columns()
  {
    return (EReference)pageHeaderOddEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPageFooterEven()
  {
    return pageFooterEvenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageFooterEven_Dsl_PageHeader_columns()
  {
    return (EReference)pageFooterEvenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPageFooterOdd()
  {
    return pageFooterOddEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageFooterOdd_Dsl_PageHeader_columns()
  {
    return (EReference)pageFooterOddEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderFooterColumn()
  {
    return headerFooterColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHeaderFooterColumn_Dsl_HeaderFooterColumn_fragments()
  {
    return (EReference)headerFooterColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderFooterColumnLeft()
  {
    return headerFooterColumnLeftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderFooterColumnCenter()
  {
    return headerFooterColumnCenterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderFooterColumnRight()
  {
    return headerFooterColumnRightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderFooterFragment()
  {
    return headerFooterFragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderFooterText()
  {
    return headerFooterTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeaderFooterText_Dsl_HeaderFooterText()
  {
    return (EAttribute)headerFooterTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderFooterDate()
  {
    return headerFooterDateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeaderFooterDate_Dsl_HeaderFooterDate()
  {
    return (EAttribute)headerFooterDateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeaderFooterDate_Dsl_HeaderFooterDate_Language()
  {
    return (EAttribute)headerFooterDateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderFooterPageNumber()
  {
    return headerFooterPageNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeaderFooterPageNumber_Dsl_HeaderFooterPageNumber()
  {
    return (EAttribute)headerFooterPageNumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderFooterLookup()
  {
    return headerFooterLookupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHeaderFooterLookup_Dsl_HeaderFooterLookup_Elements()
  {
    return (EReference)headerFooterLookupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeaderFooterLookup_Dsl_HeaderFooterLookup_Language()
  {
    return (EAttribute)headerFooterLookupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderFooterTitle()
  {
    return headerFooterTitleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeaderFooterTitle_Dsl_HeaderFooterTitle()
  {
    return (EAttribute)headerFooterTitleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderFooterCommemoration()
  {
    return headerFooterCommemorationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeaderFooterCommemoration_Dsl_HeaderFooterCommemoration()
  {
    return (EAttribute)headerFooterCommemorationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommemoration()
  {
    return commemorationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommemoration_Dsl_Commemoration_Elements()
  {
    return (EReference)commemorationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateStatus()
  {
    return templateStatusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTemplateStatus_Dsl_TemplateStatus()
  {
    return (EAttribute)templateStatusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractComponent()
  {
    return abstractComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersionSwitch()
  {
    return versionSwitchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersionSwitch_Dsl_VersionSwitch_flag()
  {
    return (EAttribute)versionSwitchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceText()
  {
    return resourceTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceText_Dsl_ResourceTextRef()
  {
    return (EReference)resourceTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceText_Dsl_ResourceText_Media_Off()
  {
    return (EAttribute)resourceTextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLookup()
  {
    return lookupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLookup_Dsl_ResourceTextRef()
  {
    return (EReference)lookupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLookup_Dsl_Lookup_Media_Off()
  {
    return (EAttribute)lookupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLookup_Dsl_Lookup_Override_Mode_Set()
  {
    return (EAttribute)lookupEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLookup_Dsl_Lookup_OverrideMode()
  {
    return (EAttribute)lookupEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLookup_Dsl_Lookup_Override__Day_Set()
  {
    return (EAttribute)lookupEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLookup_Dsl_Lookup_OverrideDay()
  {
    return (EAttribute)lookupEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDP()
  {
    return ldpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDP_Dsl_LDP()
  {
    return (EReference)ldpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaggedText()
  {
    return taggedTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaggedText_Dsl_TaggedText_tag()
  {
    return (EReference)taggedTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaggedText_Dsl_TaggedText()
  {
    return (EReference)taggedTextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfo()
  {
    return infoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfo_Name()
  {
    return (EAttribute)infoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfo_Dsl_Info_Elements()
  {
    return (EReference)infoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfoElementType()
  {
    return infoElementTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDate()
  {
    return dateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDate_Dsl_Date_month()
  {
    return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDate_Dsl_Date_day()
  {
    return (EAttribute)dateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDate_Dsl_Date_year()
  {
    return (EAttribute)dateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreface()
  {
    return prefaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreface_Name()
  {
    return (EAttribute)prefaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreface_Dsl_Preface_Elements()
  {
    return (EReference)prefaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefaceElementType()
  {
    return prefaceElementTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSection()
  {
    return sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSection_Name()
  {
    return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSection_Dsl_Section_Role()
  {
    return (EReference)sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSection_Dsl_Section_Elements()
  {
    return (EReference)sectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSectionElementType()
  {
    return sectionElementTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLdpType()
  {
    return ldpTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAll()
  {
    return allEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAll_Dsl_Display_LiturgicalDayProperties()
  {
    return (EAttribute)allEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenDate()
  {
    return genDateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenDate_Dsl_Display_Date()
  {
    return (EAttribute)genDateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenYear()
  {
    return genYearEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenYear_Dsl_Display_Year()
  {
    return (EAttribute)genYearEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMCD()
  {
    return mcdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMCD_Dsl_MCD_value()
  {
    return (EAttribute)mcdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMOW()
  {
    return mowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMOW_Dsl_Display_Mode()
  {
    return (EAttribute)mowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNOP()
  {
    return nopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNOP_Dsl_Display_Mode()
  {
    return (EAttribute)nopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDOM()
  {
    return domEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDOM_Dsl_Display_Mode()
  {
    return (EAttribute)domEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDOP()
  {
    return dopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDOP_Dsl_Display_Mode()
  {
    return (EAttribute)dopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDOWN()
  {
    return downEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDOWN_Dsl_Display_Mode()
  {
    return (EAttribute)downEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDOWT()
  {
    return dowtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDOWT_Dsl_Display_Mode()
  {
    return (EAttribute)dowtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEOW()
  {
    return eowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEOW_Dsl_Display_Eothinon()
  {
    return (EAttribute)eowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSAEC()
  {
    return saecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSAEC_Dsl_Display_SundayAfterElevationCross()
  {
    return (EAttribute)saecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSOL()
  {
    return solEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSOL_Dsl_Display_StartLukan()
  {
    return (EAttribute)solEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDOL()
  {
    return dolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDOL_Dsl_Display_DayLukan()
  {
    return (EAttribute)dolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWOLC()
  {
    return wolcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWOLC_Dsl_Display_DayLukan()
  {
    return (EAttribute)wolcEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWDOLC()
  {
    return wdolcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWDOLC_Dsl_Display_DayLukan()
  {
    return (EAttribute)wdolcEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSBT()
  {
    return sbtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSBT_Dsl_Display_SundaysBeforeTriodion()
  {
    return (EAttribute)sbtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateFragment()
  {
    return templateFragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateFragment_Name()
  {
    return (EReference)templateFragmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefaceFragment()
  {
    return prefaceFragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrefaceFragment_Name()
  {
    return (EReference)prefaceFragmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSectionFragment()
  {
    return sectionFragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSectionFragment_Name()
  {
    return (EReference)sectionFragmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBreak()
  {
    return breakEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBreak_Dsl_break_type()
  {
    return (EAttribute)breakEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPageNumber()
  {
    return pageNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPageNumber_Dsl_PageNumber_value()
  {
    return (EAttribute)pageNumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPassThroughHtml()
  {
    return passThroughHtmlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPassThroughHtml_Dsl_Passthrough_html_text()
  {
    return (EAttribute)passThroughHtmlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPassThroughPdf()
  {
    return passThroughPdfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPassThroughPdf_Dsl_Passthrough_pdf_text()
  {
    return (EAttribute)passThroughPdfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTitle()
  {
    return titleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTitle_Dsl_Title_Role()
  {
    return (EReference)titleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTitle_Dsl_Elements()
  {
    return (EReference)titleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubTitle()
  {
    return subTitleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubTitle_Dsl_SubTitle_Role()
  {
    return (EReference)subTitleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubTitle_Dsl_Elements()
  {
    return (EReference)subTitleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParagraph()
  {
    return paragraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParagraph_Dsl_Para_Role()
  {
    return (EReference)paragraphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParagraph_Dsl_Elements()
  {
    return (EReference)paragraphEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Dsl_Block_Role()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Dsl_Elements()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHymn()
  {
    return hymnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHymn_Dsl_Elements()
  {
    return (EReference)hymnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMedia()
  {
    return mediaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMedia_Dsl_Elements()
  {
    return (EReference)mediaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerse()
  {
    return verseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerse_Dsl_Elements()
  {
    return (EReference)verseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActor()
  {
    return actorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActor_Dsl_Elements()
  {
    return (EReference)actorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRubric()
  {
    return rubricEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRubric_Dsl_Elements()
  {
    return (EReference)rubricEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDialog()
  {
    return dialogEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDialog_Dsl_Elements()
  {
    return (EReference)dialogEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReading()
  {
    return readingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReading_Dsl_Elements()
  {
    return (EReference)readingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeading1()
  {
    return heading1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHeading1_Dsl_Elements()
  {
    return (EReference)heading1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeading2()
  {
    return heading2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHeading2_Dsl_Elements()
  {
    return (EReference)heading2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeading3()
  {
    return heading3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHeading3_Dsl_Elements()
  {
    return (EReference)heading3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementType()
  {
    return elementTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAid()
  {
    return aidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAid_Name()
  {
    return (EAttribute)aidEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersion()
  {
    return versionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_Name()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLitBook()
  {
    return litBookEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLitBook_Name()
  {
    return (EAttribute)litBookEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetLocale()
  {
    return setLocaleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetLocale_Dsl_SetLocale_V1()
  {
    return (EAttribute)setLocaleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetLocale_Dsl_SetLocale_V2()
  {
    return (EAttribute)setLocaleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRestoreLocale()
  {
    return restoreLocaleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRestoreLocale_Dsl_RestoreLocale()
  {
    return (EAttribute)restoreLocaleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenDate()
  {
    return whenDateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenDate_Dsl_WhenDate_Cases()
  {
    return (EReference)whenDateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenDate_Dsl_WhenDate_Other()
  {
    return (EReference)whenDateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenDateCase()
  {
    return whenDateCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhenDateCase_Dsl_WhenDate_Case_Month()
  {
    return (EAttribute)whenDateCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenDateCase_Dsl_WhenDateCase_Days()
  {
    return (EReference)whenDateCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenDateCase_Dsl_WhenDateCase_True_actions()
  {
    return (EReference)whenDateCaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractDateCase()
  {
    return abstractDateCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateRange()
  {
    return dateRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateRange_Dsl_DateRange_from()
  {
    return (EAttribute)dateRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateRange_Dsl_DateRange_To()
  {
    return (EAttribute)dateRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateSet()
  {
    return dateSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateSet_DslDateSet_Values()
  {
    return (EAttribute)dateSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenDayName()
  {
    return whenDayNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenDayName_Dsl_WhenDayName_Cases()
  {
    return (EReference)whenDayNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenDayName_Dsl_WhenDayName_Other()
  {
    return (EReference)whenDayNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenDayNameCase()
  {
    return whenDayNameCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenDayNameCase_Dsl_WhenDayNameCase_Days()
  {
    return (EReference)whenDayNameCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenDayNameCase_Dsl_WhenDayNameCase_True_actions()
  {
    return (EReference)whenDayNameCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractDayNameCase()
  {
    return abstractDayNameCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDayNameRange()
  {
    return dayNameRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDayNameRange_Dsl_DayNameRange_from()
  {
    return (EAttribute)dayNameRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDayNameRange_Dsl_DayNameRange_To()
  {
    return (EAttribute)dayNameRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDayNameSet()
  {
    return dayNameSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDayNameSet_DslDayNameSet_Values()
  {
    return (EAttribute)dayNameSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenPentecostarionDay()
  {
    return whenPentecostarionDayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenPentecostarionDay_Dsl_WhenPentecostarionDay_Cases()
  {
    return (EReference)whenPentecostarionDayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenPentecostarionDay_Dsl_WhenPentecostarionDay_Other()
  {
    return (EReference)whenPentecostarionDayEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenTriodionDay()
  {
    return whenTriodionDayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenTriodionDay_Dsl_WhenTriodionDay_Cases()
  {
    return (EReference)whenTriodionDayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenTriodionDay_Dsl_WhenTriodionDay_Other()
  {
    return (EReference)whenTriodionDayEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenMovableCycleDay()
  {
    return whenMovableCycleDayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenMovableCycleDay_Dsl_WhenMovableCycleDay_Cases()
  {
    return (EReference)whenMovableCycleDayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenMovableCycleDay_Dsl_WhenMovableCycleDay_Other()
  {
    return (EReference)whenMovableCycleDayEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenSundayAfterElevationOfCrossDay()
  {
    return whenSundayAfterElevationOfCrossDayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenSundayAfterElevationOfCrossDay_Dsl_WhenSundayAfterElevationOfCrossDay_Cases()
  {
    return (EReference)whenSundayAfterElevationOfCrossDayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenSundayAfterElevationOfCrossDay_Dsl_WhenSundayAfterElevationOfCrossDay_Other()
  {
    return (EReference)whenSundayAfterElevationOfCrossDayEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenLukanCycleDay()
  {
    return whenLukanCycleDayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenLukanCycleDay_Dsl_WhenLukanCycleDay_Cases()
  {
    return (EReference)whenLukanCycleDayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenLukanCycleDay_Dsl_WhenLukanCycleDay_Other()
  {
    return (EReference)whenLukanCycleDayEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenPascha()
  {
    return whenPaschaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenPascha_Dsl_WhenPascha_true_actions()
  {
    return (EReference)whenPaschaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenPascha_Dsl_WhenPascha_Other_actions()
  {
    return (EReference)whenPaschaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenOther()
  {
    return whenOtherEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenOther_Dsl_WhenCase_Other_actions()
  {
    return (EReference)whenOtherEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenPeriodCase()
  {
    return whenPeriodCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenPeriodCase_Dsl_WhenPeriodCase_Days()
  {
    return (EReference)whenPeriodCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenPeriodCase_Dsl_WhenPeriodCase_True_actions()
  {
    return (EReference)whenPeriodCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractDayCase()
  {
    return abstractDayCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDayRange()
  {
    return dayRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDayRange_Dsl_DayRange_from()
  {
    return (EAttribute)dayRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDayRange_Dsl_Range_To()
  {
    return (EAttribute)dayRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDaySet()
  {
    return daySetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDaySet_DslSetValue_Days()
  {
    return (EAttribute)daySetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenModeOfWeek()
  {
    return whenModeOfWeekEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenModeOfWeek_Dsl_WhenModeOfWeek_Cases()
  {
    return (EReference)whenModeOfWeekEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenModeOfWeek_Dsl_WhenModeOfWeek_Other()
  {
    return (EReference)whenModeOfWeekEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenModeOfWeekCase()
  {
    return whenModeOfWeekCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenModeOfWeekCase_Dsl_WhenModeOfWeekCase_Days()
  {
    return (EReference)whenModeOfWeekCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenModeOfWeekCase_Dsl_WhenModeOfWeekCase_True_actions()
  {
    return (EReference)whenModeOfWeekCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModeOfWeekSet()
  {
    return modeOfWeekSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModeOfWeekSet_Dsl_ModeOfWeekSet_MOWs()
  {
    return (EAttribute)modeOfWeekSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenSundaysBeforeTriodion()
  {
    return whenSundaysBeforeTriodionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenSundaysBeforeTriodion_Dsl_WhenSundaysBeforeTriodion_Cases()
  {
    return (EReference)whenSundaysBeforeTriodionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenSundaysBeforeTriodion_Dsl_SundaysBeforeTriodion_Other()
  {
    return (EReference)whenSundaysBeforeTriodionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSundaysBeforeTriodionCase()
  {
    return sundaysBeforeTriodionCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSundaysBeforeTriodionCase_Dsl_SundaysBeforeTriodionCase_Days()
  {
    return (EAttribute)sundaysBeforeTriodionCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSundaysBeforeTriodionCase_Dsl_SundaysBeforeTriodionCase_True_actions()
  {
    return (EReference)sundaysBeforeTriodionCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenExists()
  {
    return whenExistsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenExists_Dsl_WhenExists_Cases()
  {
    return (EReference)whenExistsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenExists_Dsl_WhenExists_Other()
  {
    return (EReference)whenExistsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenExistsCase()
  {
    return whenExistsCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenExistsCase_Dsl_WhenExistsCase_Ref()
  {
    return (EReference)whenExistsCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenExistsCase_Dsl_WhenExistsCase_True_actions()
  {
    return (EReference)whenExistsCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVersionSwitchType()
  {
    return versionSwitchTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLanguage()
  {
    return languageEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBreakType()
  {
    return breakTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTemplateStatuses()
  {
    return templateStatusesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNull()
  {
    return nullEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getModeTypes()
  {
    return modeTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDowTypes()
  {
    return dowTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBookTypes()
  {
    return bookTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSeasons()
  {
    return seasonsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDayOfMonthTypes()
  {
    return dayOfMonthTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPeriodType()
  {
    return periodTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDayOfWeek()
  {
    return dayOfWeekEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMonthName()
  {
    return monthNameEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtemFactory getAtemFactory()
  {
    return (AtemFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    atemModelEClass = createEClass(ATEM_MODEL);
    createEAttribute(atemModelEClass, ATEM_MODEL__NAME);
    createEReference(atemModelEClass, ATEM_MODEL__DSL_TEMPLATE_STATUS);
    createEReference(atemModelEClass, ATEM_MODEL__IMPORTS);
    createEReference(atemModelEClass, ATEM_MODEL__DSL_TEMPLATE_DRIVER);
    createEReference(atemModelEClass, ATEM_MODEL__DSL_TEMPLATE_HEAD);
    createEReference(atemModelEClass, ATEM_MODEL__DSL_TEMPLATE_PREFACE);
    createEReference(atemModelEClass, ATEM_MODEL__DSL_TEMPLATE_COMPONENTS);

    headEClass = createEClass(HEAD);
    createEReference(headEClass, HEAD__DSL_HEAD_COMPONENTS);

    headComponentEClass = createEClass(HEAD_COMPONENT);

    driverEClass = createEClass(DRIVER);
    createEAttribute(driverEClass, DRIVER__DSL_DRIVER_REG_EX);
    createEAttribute(driverEClass, DRIVER__DSL_DRIVER_STATUS);

    templateTitleEClass = createEClass(TEMPLATE_TITLE);
    createEReference(templateTitleEClass, TEMPLATE_TITLE__DSL_TEMPLATE_TITLE_ELEMENTS);

    pageKeepWithNextEClass = createEClass(PAGE_KEEP_WITH_NEXT);
    createEAttribute(pageKeepWithNextEClass, PAGE_KEEP_WITH_NEXT__DSL_PAGE_KEEP_WITH_NEXT_VALUE);

    pageHeaderEvenEClass = createEClass(PAGE_HEADER_EVEN);
    createEReference(pageHeaderEvenEClass, PAGE_HEADER_EVEN__DSL_PAGE_HEADER_COLUMNS);

    pageHeaderOddEClass = createEClass(PAGE_HEADER_ODD);
    createEReference(pageHeaderOddEClass, PAGE_HEADER_ODD__DSL_PAGE_HEADER_COLUMNS);

    pageFooterEvenEClass = createEClass(PAGE_FOOTER_EVEN);
    createEReference(pageFooterEvenEClass, PAGE_FOOTER_EVEN__DSL_PAGE_HEADER_COLUMNS);

    pageFooterOddEClass = createEClass(PAGE_FOOTER_ODD);
    createEReference(pageFooterOddEClass, PAGE_FOOTER_ODD__DSL_PAGE_HEADER_COLUMNS);

    headerFooterColumnEClass = createEClass(HEADER_FOOTER_COLUMN);
    createEReference(headerFooterColumnEClass, HEADER_FOOTER_COLUMN__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS);

    headerFooterColumnLeftEClass = createEClass(HEADER_FOOTER_COLUMN_LEFT);

    headerFooterColumnCenterEClass = createEClass(HEADER_FOOTER_COLUMN_CENTER);

    headerFooterColumnRightEClass = createEClass(HEADER_FOOTER_COLUMN_RIGHT);

    headerFooterFragmentEClass = createEClass(HEADER_FOOTER_FRAGMENT);

    headerFooterTextEClass = createEClass(HEADER_FOOTER_TEXT);
    createEAttribute(headerFooterTextEClass, HEADER_FOOTER_TEXT__DSL_HEADER_FOOTER_TEXT);

    headerFooterDateEClass = createEClass(HEADER_FOOTER_DATE);
    createEAttribute(headerFooterDateEClass, HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE);
    createEAttribute(headerFooterDateEClass, HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE_LANGUAGE);

    headerFooterPageNumberEClass = createEClass(HEADER_FOOTER_PAGE_NUMBER);
    createEAttribute(headerFooterPageNumberEClass, HEADER_FOOTER_PAGE_NUMBER__DSL_HEADER_FOOTER_PAGE_NUMBER);

    headerFooterLookupEClass = createEClass(HEADER_FOOTER_LOOKUP);
    createEReference(headerFooterLookupEClass, HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_ELEMENTS);
    createEAttribute(headerFooterLookupEClass, HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_LANGUAGE);

    headerFooterTitleEClass = createEClass(HEADER_FOOTER_TITLE);
    createEAttribute(headerFooterTitleEClass, HEADER_FOOTER_TITLE__DSL_HEADER_FOOTER_TITLE);

    headerFooterCommemorationEClass = createEClass(HEADER_FOOTER_COMMEMORATION);
    createEAttribute(headerFooterCommemorationEClass, HEADER_FOOTER_COMMEMORATION__DSL_HEADER_FOOTER_COMMEMORATION);

    commemorationEClass = createEClass(COMMEMORATION);
    createEReference(commemorationEClass, COMMEMORATION__DSL_COMMEMORATION_ELEMENTS);

    templateStatusEClass = createEClass(TEMPLATE_STATUS);
    createEAttribute(templateStatusEClass, TEMPLATE_STATUS__DSL_TEMPLATE_STATUS);

    abstractComponentEClass = createEClass(ABSTRACT_COMPONENT);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    versionSwitchEClass = createEClass(VERSION_SWITCH);
    createEAttribute(versionSwitchEClass, VERSION_SWITCH__DSL_VERSION_SWITCH_FLAG);

    resourceTextEClass = createEClass(RESOURCE_TEXT);
    createEReference(resourceTextEClass, RESOURCE_TEXT__DSL_RESOURCE_TEXT_REF);
    createEAttribute(resourceTextEClass, RESOURCE_TEXT__DSL_RESOURCE_TEXT_MEDIA_OFF);

    lookupEClass = createEClass(LOOKUP);
    createEReference(lookupEClass, LOOKUP__DSL_RESOURCE_TEXT_REF);
    createEAttribute(lookupEClass, LOOKUP__DSL_LOOKUP_MEDIA_OFF);
    createEAttribute(lookupEClass, LOOKUP__DSL_LOOKUP_OVERRIDE_MODE_SET);
    createEAttribute(lookupEClass, LOOKUP__DSL_LOOKUP_OVERRIDE_MODE);
    createEAttribute(lookupEClass, LOOKUP__DSL_LOOKUP_OVERRIDE_DAY_SET);
    createEAttribute(lookupEClass, LOOKUP__DSL_LOOKUP_OVERRIDE_DAY);

    ldpEClass = createEClass(LDP);
    createEReference(ldpEClass, LDP__DSL_LDP);

    taggedTextEClass = createEClass(TAGGED_TEXT);
    createEReference(taggedTextEClass, TAGGED_TEXT__DSL_TAGGED_TEXT_TAG);
    createEReference(taggedTextEClass, TAGGED_TEXT__DSL_TAGGED_TEXT);

    infoEClass = createEClass(INFO);
    createEAttribute(infoEClass, INFO__NAME);
    createEReference(infoEClass, INFO__DSL_INFO_ELEMENTS);

    infoElementTypeEClass = createEClass(INFO_ELEMENT_TYPE);

    dateEClass = createEClass(DATE);
    createEAttribute(dateEClass, DATE__DSL_DATE_MONTH);
    createEAttribute(dateEClass, DATE__DSL_DATE_DAY);
    createEAttribute(dateEClass, DATE__DSL_DATE_YEAR);

    prefaceEClass = createEClass(PREFACE);
    createEAttribute(prefaceEClass, PREFACE__NAME);
    createEReference(prefaceEClass, PREFACE__DSL_PREFACE_ELEMENTS);

    prefaceElementTypeEClass = createEClass(PREFACE_ELEMENT_TYPE);

    sectionEClass = createEClass(SECTION);
    createEAttribute(sectionEClass, SECTION__NAME);
    createEReference(sectionEClass, SECTION__DSL_SECTION_ROLE);
    createEReference(sectionEClass, SECTION__DSL_SECTION_ELEMENTS);

    sectionElementTypeEClass = createEClass(SECTION_ELEMENT_TYPE);

    ldpTypeEClass = createEClass(LDP_TYPE);

    allEClass = createEClass(ALL);
    createEAttribute(allEClass, ALL__DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES);

    genDateEClass = createEClass(GEN_DATE);
    createEAttribute(genDateEClass, GEN_DATE__DSL_DISPLAY_DATE);

    genYearEClass = createEClass(GEN_YEAR);
    createEAttribute(genYearEClass, GEN_YEAR__DSL_DISPLAY_YEAR);

    mcdEClass = createEClass(MCD);
    createEAttribute(mcdEClass, MCD__DSL_MCD_VALUE);

    mowEClass = createEClass(MOW);
    createEAttribute(mowEClass, MOW__DSL_DISPLAY_MODE);

    nopEClass = createEClass(NOP);
    createEAttribute(nopEClass, NOP__DSL_DISPLAY_MODE);

    domEClass = createEClass(DOM);
    createEAttribute(domEClass, DOM__DSL_DISPLAY_MODE);

    dopEClass = createEClass(DOP);
    createEAttribute(dopEClass, DOP__DSL_DISPLAY_MODE);

    downEClass = createEClass(DOWN);
    createEAttribute(downEClass, DOWN__DSL_DISPLAY_MODE);

    dowtEClass = createEClass(DOWT);
    createEAttribute(dowtEClass, DOWT__DSL_DISPLAY_MODE);

    eowEClass = createEClass(EOW);
    createEAttribute(eowEClass, EOW__DSL_DISPLAY_EOTHINON);

    saecEClass = createEClass(SAEC);
    createEAttribute(saecEClass, SAEC__DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS);

    solEClass = createEClass(SOL);
    createEAttribute(solEClass, SOL__DSL_DISPLAY_START_LUKAN);

    dolEClass = createEClass(DOL);
    createEAttribute(dolEClass, DOL__DSL_DISPLAY_DAY_LUKAN);

    wolcEClass = createEClass(WOLC);
    createEAttribute(wolcEClass, WOLC__DSL_DISPLAY_DAY_LUKAN);

    wdolcEClass = createEClass(WDOLC);
    createEAttribute(wdolcEClass, WDOLC__DSL_DISPLAY_DAY_LUKAN);

    sbtEClass = createEClass(SBT);
    createEAttribute(sbtEClass, SBT__DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION);

    templateFragmentEClass = createEClass(TEMPLATE_FRAGMENT);
    createEReference(templateFragmentEClass, TEMPLATE_FRAGMENT__NAME);

    prefaceFragmentEClass = createEClass(PREFACE_FRAGMENT);
    createEReference(prefaceFragmentEClass, PREFACE_FRAGMENT__NAME);

    sectionFragmentEClass = createEClass(SECTION_FRAGMENT);
    createEReference(sectionFragmentEClass, SECTION_FRAGMENT__NAME);

    breakEClass = createEClass(BREAK);
    createEAttribute(breakEClass, BREAK__DSL_BREAK_TYPE);

    pageNumberEClass = createEClass(PAGE_NUMBER);
    createEAttribute(pageNumberEClass, PAGE_NUMBER__DSL_PAGE_NUMBER_VALUE);

    passThroughHtmlEClass = createEClass(PASS_THROUGH_HTML);
    createEAttribute(passThroughHtmlEClass, PASS_THROUGH_HTML__DSL_PASSTHROUGH_HTML_TEXT);

    passThroughPdfEClass = createEClass(PASS_THROUGH_PDF);
    createEAttribute(passThroughPdfEClass, PASS_THROUGH_PDF__DSL_PASSTHROUGH_PDF_TEXT);

    titleEClass = createEClass(TITLE);
    createEReference(titleEClass, TITLE__DSL_TITLE_ROLE);
    createEReference(titleEClass, TITLE__DSL_ELEMENTS);

    subTitleEClass = createEClass(SUB_TITLE);
    createEReference(subTitleEClass, SUB_TITLE__DSL_SUB_TITLE_ROLE);
    createEReference(subTitleEClass, SUB_TITLE__DSL_ELEMENTS);

    paragraphEClass = createEClass(PARAGRAPH);
    createEReference(paragraphEClass, PARAGRAPH__DSL_PARA_ROLE);
    createEReference(paragraphEClass, PARAGRAPH__DSL_ELEMENTS);

    blockEClass = createEClass(BLOCK);
    createEReference(blockEClass, BLOCK__DSL_BLOCK_ROLE);
    createEReference(blockEClass, BLOCK__DSL_ELEMENTS);

    hymnEClass = createEClass(HYMN);
    createEReference(hymnEClass, HYMN__DSL_ELEMENTS);

    mediaEClass = createEClass(MEDIA);
    createEReference(mediaEClass, MEDIA__DSL_ELEMENTS);

    verseEClass = createEClass(VERSE);
    createEReference(verseEClass, VERSE__DSL_ELEMENTS);

    actorEClass = createEClass(ACTOR);
    createEReference(actorEClass, ACTOR__DSL_ELEMENTS);

    rubricEClass = createEClass(RUBRIC);
    createEReference(rubricEClass, RUBRIC__DSL_ELEMENTS);

    dialogEClass = createEClass(DIALOG);
    createEReference(dialogEClass, DIALOG__DSL_ELEMENTS);

    readingEClass = createEClass(READING);
    createEReference(readingEClass, READING__DSL_ELEMENTS);

    heading1EClass = createEClass(HEADING1);
    createEReference(heading1EClass, HEADING1__DSL_ELEMENTS);

    heading2EClass = createEClass(HEADING2);
    createEReference(heading2EClass, HEADING2__DSL_ELEMENTS);

    heading3EClass = createEClass(HEADING3);
    createEReference(heading3EClass, HEADING3__DSL_ELEMENTS);

    elementTypeEClass = createEClass(ELEMENT_TYPE);

    aidEClass = createEClass(AID);
    createEAttribute(aidEClass, AID__NAME);

    versionEClass = createEClass(VERSION);
    createEAttribute(versionEClass, VERSION__NAME);

    litBookEClass = createEClass(LIT_BOOK);
    createEAttribute(litBookEClass, LIT_BOOK__NAME);

    setLocaleEClass = createEClass(SET_LOCALE);
    createEAttribute(setLocaleEClass, SET_LOCALE__DSL_SET_LOCALE_V1);
    createEAttribute(setLocaleEClass, SET_LOCALE__DSL_SET_LOCALE_V2);

    restoreLocaleEClass = createEClass(RESTORE_LOCALE);
    createEAttribute(restoreLocaleEClass, RESTORE_LOCALE__DSL_RESTORE_LOCALE);

    whenDateEClass = createEClass(WHEN_DATE);
    createEReference(whenDateEClass, WHEN_DATE__DSL_WHEN_DATE_CASES);
    createEReference(whenDateEClass, WHEN_DATE__DSL_WHEN_DATE_OTHER);

    whenDateCaseEClass = createEClass(WHEN_DATE_CASE);
    createEAttribute(whenDateCaseEClass, WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_MONTH);
    createEReference(whenDateCaseEClass, WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_DAYS);
    createEReference(whenDateCaseEClass, WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_TRUE_ACTIONS);

    abstractDateCaseEClass = createEClass(ABSTRACT_DATE_CASE);

    dateRangeEClass = createEClass(DATE_RANGE);
    createEAttribute(dateRangeEClass, DATE_RANGE__DSL_DATE_RANGE_FROM);
    createEAttribute(dateRangeEClass, DATE_RANGE__DSL_DATE_RANGE_TO);

    dateSetEClass = createEClass(DATE_SET);
    createEAttribute(dateSetEClass, DATE_SET__DSL_DATE_SET_VALUES);

    whenDayNameEClass = createEClass(WHEN_DAY_NAME);
    createEReference(whenDayNameEClass, WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_CASES);
    createEReference(whenDayNameEClass, WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_OTHER);

    whenDayNameCaseEClass = createEClass(WHEN_DAY_NAME_CASE);
    createEReference(whenDayNameCaseEClass, WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_DAYS);
    createEReference(whenDayNameCaseEClass, WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_TRUE_ACTIONS);

    abstractDayNameCaseEClass = createEClass(ABSTRACT_DAY_NAME_CASE);

    dayNameRangeEClass = createEClass(DAY_NAME_RANGE);
    createEAttribute(dayNameRangeEClass, DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_FROM);
    createEAttribute(dayNameRangeEClass, DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_TO);

    dayNameSetEClass = createEClass(DAY_NAME_SET);
    createEAttribute(dayNameSetEClass, DAY_NAME_SET__DSL_DAY_NAME_SET_VALUES);

    whenPentecostarionDayEClass = createEClass(WHEN_PENTECOSTARION_DAY);
    createEReference(whenPentecostarionDayEClass, WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_CASES);
    createEReference(whenPentecostarionDayEClass, WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_OTHER);

    whenTriodionDayEClass = createEClass(WHEN_TRIODION_DAY);
    createEReference(whenTriodionDayEClass, WHEN_TRIODION_DAY__DSL_WHEN_TRIODION_DAY_CASES);
    createEReference(whenTriodionDayEClass, WHEN_TRIODION_DAY__DSL_WHEN_TRIODION_DAY_OTHER);

    whenMovableCycleDayEClass = createEClass(WHEN_MOVABLE_CYCLE_DAY);
    createEReference(whenMovableCycleDayEClass, WHEN_MOVABLE_CYCLE_DAY__DSL_WHEN_MOVABLE_CYCLE_DAY_CASES);
    createEReference(whenMovableCycleDayEClass, WHEN_MOVABLE_CYCLE_DAY__DSL_WHEN_MOVABLE_CYCLE_DAY_OTHER);

    whenSundayAfterElevationOfCrossDayEClass = createEClass(WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY);
    createEReference(whenSundayAfterElevationOfCrossDayEClass, WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_CASES);
    createEReference(whenSundayAfterElevationOfCrossDayEClass, WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_OTHER);

    whenLukanCycleDayEClass = createEClass(WHEN_LUKAN_CYCLE_DAY);
    createEReference(whenLukanCycleDayEClass, WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_CASES);
    createEReference(whenLukanCycleDayEClass, WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_OTHER);

    whenPaschaEClass = createEClass(WHEN_PASCHA);
    createEReference(whenPaschaEClass, WHEN_PASCHA__DSL_WHEN_PASCHA_TRUE_ACTIONS);
    createEReference(whenPaschaEClass, WHEN_PASCHA__DSL_WHEN_PASCHA_OTHER_ACTIONS);

    whenOtherEClass = createEClass(WHEN_OTHER);
    createEReference(whenOtherEClass, WHEN_OTHER__DSL_WHEN_CASE_OTHER_ACTIONS);

    whenPeriodCaseEClass = createEClass(WHEN_PERIOD_CASE);
    createEReference(whenPeriodCaseEClass, WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_DAYS);
    createEReference(whenPeriodCaseEClass, WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_TRUE_ACTIONS);

    abstractDayCaseEClass = createEClass(ABSTRACT_DAY_CASE);

    dayRangeEClass = createEClass(DAY_RANGE);
    createEAttribute(dayRangeEClass, DAY_RANGE__DSL_DAY_RANGE_FROM);
    createEAttribute(dayRangeEClass, DAY_RANGE__DSL_RANGE_TO);

    daySetEClass = createEClass(DAY_SET);
    createEAttribute(daySetEClass, DAY_SET__DSL_SET_VALUE_DAYS);

    whenModeOfWeekEClass = createEClass(WHEN_MODE_OF_WEEK);
    createEReference(whenModeOfWeekEClass, WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_CASES);
    createEReference(whenModeOfWeekEClass, WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_OTHER);

    whenModeOfWeekCaseEClass = createEClass(WHEN_MODE_OF_WEEK_CASE);
    createEReference(whenModeOfWeekCaseEClass, WHEN_MODE_OF_WEEK_CASE__DSL_WHEN_MODE_OF_WEEK_CASE_DAYS);
    createEReference(whenModeOfWeekCaseEClass, WHEN_MODE_OF_WEEK_CASE__DSL_WHEN_MODE_OF_WEEK_CASE_TRUE_ACTIONS);

    modeOfWeekSetEClass = createEClass(MODE_OF_WEEK_SET);
    createEAttribute(modeOfWeekSetEClass, MODE_OF_WEEK_SET__DSL_MODE_OF_WEEK_SET_MO_WS);

    whenSundaysBeforeTriodionEClass = createEClass(WHEN_SUNDAYS_BEFORE_TRIODION);
    createEReference(whenSundaysBeforeTriodionEClass, WHEN_SUNDAYS_BEFORE_TRIODION__DSL_WHEN_SUNDAYS_BEFORE_TRIODION_CASES);
    createEReference(whenSundaysBeforeTriodionEClass, WHEN_SUNDAYS_BEFORE_TRIODION__DSL_SUNDAYS_BEFORE_TRIODION_OTHER);

    sundaysBeforeTriodionCaseEClass = createEClass(SUNDAYS_BEFORE_TRIODION_CASE);
    createEAttribute(sundaysBeforeTriodionCaseEClass, SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_DAYS);
    createEReference(sundaysBeforeTriodionCaseEClass, SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_TRUE_ACTIONS);

    whenExistsEClass = createEClass(WHEN_EXISTS);
    createEReference(whenExistsEClass, WHEN_EXISTS__DSL_WHEN_EXISTS_CASES);
    createEReference(whenExistsEClass, WHEN_EXISTS__DSL_WHEN_EXISTS_OTHER);

    whenExistsCaseEClass = createEClass(WHEN_EXISTS_CASE);
    createEReference(whenExistsCaseEClass, WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_REF);
    createEReference(whenExistsCaseEClass, WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_TRUE_ACTIONS);

    // Create enums
    versionSwitchTypeEEnum = createEEnum(VERSION_SWITCH_TYPE);
    languageEEnum = createEEnum(LANGUAGE);
    breakTypeEEnum = createEEnum(BREAK_TYPE);
    templateStatusesEEnum = createEEnum(TEMPLATE_STATUSES);
    nullEEnum = createEEnum(NULL);
    modeTypesEEnum = createEEnum(MODE_TYPES);
    dowTypesEEnum = createEEnum(DOW_TYPES);
    bookTypesEEnum = createEEnum(BOOK_TYPES);
    seasonsEEnum = createEEnum(SEASONS);
    dayOfMonthTypesEEnum = createEEnum(DAY_OF_MONTH_TYPES);
    periodTypeEEnum = createEEnum(PERIOD_TYPE);
    dayOfWeekEEnum = createEEnum(DAY_OF_WEEK);
    monthNameEEnum = createEEnum(MONTH_NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    AresPackage theAresPackage = (AresPackage)EPackage.Registry.INSTANCE.getEPackage(AresPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    templateTitleEClass.getESuperTypes().add(this.getHeadComponent());
    pageKeepWithNextEClass.getESuperTypes().add(this.getHeadComponent());
    pageHeaderEvenEClass.getESuperTypes().add(this.getHeadComponent());
    pageHeaderOddEClass.getESuperTypes().add(this.getHeadComponent());
    pageFooterEvenEClass.getESuperTypes().add(this.getHeadComponent());
    pageFooterOddEClass.getESuperTypes().add(this.getHeadComponent());
    headerFooterColumnLeftEClass.getESuperTypes().add(this.getHeaderFooterColumn());
    headerFooterColumnCenterEClass.getESuperTypes().add(this.getHeaderFooterColumn());
    headerFooterColumnRightEClass.getESuperTypes().add(this.getHeaderFooterColumn());
    headerFooterTextEClass.getESuperTypes().add(this.getHeaderFooterFragment());
    headerFooterDateEClass.getESuperTypes().add(this.getHeaderFooterFragment());
    headerFooterPageNumberEClass.getESuperTypes().add(this.getHeaderFooterFragment());
    headerFooterLookupEClass.getESuperTypes().add(this.getHeaderFooterFragment());
    headerFooterTitleEClass.getESuperTypes().add(this.getHeaderFooterFragment());
    headerFooterCommemorationEClass.getESuperTypes().add(this.getHeaderFooterFragment());
    commemorationEClass.getESuperTypes().add(this.getHeadComponent());
    versionSwitchEClass.getESuperTypes().add(this.getAbstractComponent());
    versionSwitchEClass.getESuperTypes().add(this.getInfoElementType());
    versionSwitchEClass.getESuperTypes().add(this.getPrefaceElementType());
    resourceTextEClass.getESuperTypes().add(this.getElementType());
    lookupEClass.getESuperTypes().add(this.getElementType());
    ldpEClass.getESuperTypes().add(this.getElementType());
    taggedTextEClass.getESuperTypes().add(this.getElementType());
    infoEClass.getESuperTypes().add(this.getAbstractComponent());
    dateEClass.getESuperTypes().add(this.getHeadComponent());
    dateEClass.getESuperTypes().add(this.getSectionElementType());
    sectionEClass.getESuperTypes().add(this.getAbstractComponent());
    sectionEClass.getESuperTypes().add(this.getPrefaceElementType());
    sectionEClass.getESuperTypes().add(this.getSectionElementType());
    allEClass.getESuperTypes().add(this.getLdpType());
    genDateEClass.getESuperTypes().add(this.getLdpType());
    genYearEClass.getESuperTypes().add(this.getLdpType());
    mcdEClass.getESuperTypes().add(this.getLdpType());
    mowEClass.getESuperTypes().add(this.getLdpType());
    nopEClass.getESuperTypes().add(this.getLdpType());
    domEClass.getESuperTypes().add(this.getLdpType());
    dopEClass.getESuperTypes().add(this.getLdpType());
    downEClass.getESuperTypes().add(this.getLdpType());
    dowtEClass.getESuperTypes().add(this.getLdpType());
    eowEClass.getESuperTypes().add(this.getLdpType());
    saecEClass.getESuperTypes().add(this.getLdpType());
    solEClass.getESuperTypes().add(this.getLdpType());
    dolEClass.getESuperTypes().add(this.getLdpType());
    wolcEClass.getESuperTypes().add(this.getLdpType());
    wdolcEClass.getESuperTypes().add(this.getLdpType());
    sbtEClass.getESuperTypes().add(this.getLdpType());
    templateFragmentEClass.getESuperTypes().add(this.getAbstractComponent());
    templateFragmentEClass.getESuperTypes().add(this.getPrefaceElementType());
    templateFragmentEClass.getESuperTypes().add(this.getSectionElementType());
    sectionFragmentEClass.getESuperTypes().add(this.getAbstractComponent());
    sectionFragmentEClass.getESuperTypes().add(this.getPrefaceElementType());
    sectionFragmentEClass.getESuperTypes().add(this.getSectionElementType());
    breakEClass.getESuperTypes().add(this.getAbstractComponent());
    breakEClass.getESuperTypes().add(this.getSectionElementType());
    pageNumberEClass.getESuperTypes().add(this.getHeadComponent());
    passThroughHtmlEClass.getESuperTypes().add(this.getAbstractComponent());
    passThroughHtmlEClass.getESuperTypes().add(this.getSectionElementType());
    passThroughPdfEClass.getESuperTypes().add(this.getAbstractComponent());
    passThroughPdfEClass.getESuperTypes().add(this.getSectionElementType());
    titleEClass.getESuperTypes().add(this.getAbstractComponent());
    titleEClass.getESuperTypes().add(this.getInfoElementType());
    titleEClass.getESuperTypes().add(this.getPrefaceElementType());
    titleEClass.getESuperTypes().add(this.getSectionElementType());
    subTitleEClass.getESuperTypes().add(this.getAbstractComponent());
    subTitleEClass.getESuperTypes().add(this.getInfoElementType());
    subTitleEClass.getESuperTypes().add(this.getPrefaceElementType());
    subTitleEClass.getESuperTypes().add(this.getSectionElementType());
    paragraphEClass.getESuperTypes().add(this.getAbstractComponent());
    paragraphEClass.getESuperTypes().add(this.getInfoElementType());
    paragraphEClass.getESuperTypes().add(this.getPrefaceElementType());
    paragraphEClass.getESuperTypes().add(this.getSectionElementType());
    blockEClass.getESuperTypes().add(this.getAbstractComponent());
    blockEClass.getESuperTypes().add(this.getInfoElementType());
    blockEClass.getESuperTypes().add(this.getPrefaceElementType());
    blockEClass.getESuperTypes().add(this.getSectionElementType());
    hymnEClass.getESuperTypes().add(this.getAbstractComponent());
    hymnEClass.getESuperTypes().add(this.getSectionElementType());
    mediaEClass.getESuperTypes().add(this.getAbstractComponent());
    mediaEClass.getESuperTypes().add(this.getSectionElementType());
    verseEClass.getESuperTypes().add(this.getAbstractComponent());
    verseEClass.getESuperTypes().add(this.getSectionElementType());
    actorEClass.getESuperTypes().add(this.getAbstractComponent());
    actorEClass.getESuperTypes().add(this.getSectionElementType());
    rubricEClass.getESuperTypes().add(this.getAbstractComponent());
    rubricEClass.getESuperTypes().add(this.getSectionElementType());
    dialogEClass.getESuperTypes().add(this.getAbstractComponent());
    dialogEClass.getESuperTypes().add(this.getSectionElementType());
    readingEClass.getESuperTypes().add(this.getAbstractComponent());
    readingEClass.getESuperTypes().add(this.getSectionElementType());
    heading1EClass.getESuperTypes().add(this.getAbstractComponent());
    heading1EClass.getESuperTypes().add(this.getSectionElementType());
    heading2EClass.getESuperTypes().add(this.getAbstractComponent());
    heading2EClass.getESuperTypes().add(this.getSectionElementType());
    heading3EClass.getESuperTypes().add(this.getAbstractComponent());
    heading3EClass.getESuperTypes().add(this.getSectionElementType());
    aidEClass.getESuperTypes().add(this.getAbstractComponent());
    versionEClass.getESuperTypes().add(this.getAbstractComponent());
    litBookEClass.getESuperTypes().add(this.getAbstractComponent());
    setLocaleEClass.getESuperTypes().add(this.getAbstractComponent());
    setLocaleEClass.getESuperTypes().add(this.getSectionElementType());
    restoreLocaleEClass.getESuperTypes().add(this.getAbstractComponent());
    restoreLocaleEClass.getESuperTypes().add(this.getSectionElementType());
    whenDateEClass.getESuperTypes().add(this.getAbstractComponent());
    whenDateEClass.getESuperTypes().add(this.getSectionElementType());
    dateRangeEClass.getESuperTypes().add(this.getAbstractDateCase());
    dateSetEClass.getESuperTypes().add(this.getAbstractDateCase());
    whenDayNameEClass.getESuperTypes().add(this.getAbstractComponent());
    whenDayNameEClass.getESuperTypes().add(this.getSectionElementType());
    dayNameRangeEClass.getESuperTypes().add(this.getAbstractDayNameCase());
    dayNameSetEClass.getESuperTypes().add(this.getAbstractDayNameCase());
    whenPentecostarionDayEClass.getESuperTypes().add(this.getAbstractComponent());
    whenPentecostarionDayEClass.getESuperTypes().add(this.getSectionElementType());
    whenTriodionDayEClass.getESuperTypes().add(this.getAbstractComponent());
    whenTriodionDayEClass.getESuperTypes().add(this.getSectionElementType());
    whenMovableCycleDayEClass.getESuperTypes().add(this.getAbstractComponent());
    whenMovableCycleDayEClass.getESuperTypes().add(this.getSectionElementType());
    whenSundayAfterElevationOfCrossDayEClass.getESuperTypes().add(this.getAbstractComponent());
    whenSundayAfterElevationOfCrossDayEClass.getESuperTypes().add(this.getSectionElementType());
    whenLukanCycleDayEClass.getESuperTypes().add(this.getAbstractComponent());
    whenLukanCycleDayEClass.getESuperTypes().add(this.getSectionElementType());
    whenPaschaEClass.getESuperTypes().add(this.getAbstractComponent());
    whenPaschaEClass.getESuperTypes().add(this.getSectionElementType());
    dayRangeEClass.getESuperTypes().add(this.getAbstractDayCase());
    daySetEClass.getESuperTypes().add(this.getAbstractDayCase());
    whenModeOfWeekEClass.getESuperTypes().add(this.getAbstractComponent());
    whenModeOfWeekEClass.getESuperTypes().add(this.getSectionElementType());
    whenSundaysBeforeTriodionEClass.getESuperTypes().add(this.getAbstractComponent());
    whenSundaysBeforeTriodionEClass.getESuperTypes().add(this.getSectionElementType());
    whenExistsEClass.getESuperTypes().add(this.getAbstractComponent());
    whenExistsEClass.getESuperTypes().add(this.getSectionElementType());

    // Initialize classes and features; add operations and parameters
    initEClass(atemModelEClass, AtemModel.class, "AtemModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtemModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, AtemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtemModel_Dsl_Template_Status(), this.getTemplateStatus(), null, "dsl_Template_Status", null, 0, 1, AtemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtemModel_Imports(), this.getImport(), null, "imports", null, 0, -1, AtemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtemModel_Dsl_Template_Driver(), this.getDriver(), null, "dsl_Template_Driver", null, 0, 1, AtemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtemModel_Dsl_Template_head(), this.getHead(), null, "dsl_Template_head", null, 0, 1, AtemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtemModel_Dsl_Template_preface(), this.getPreface(), null, "dsl_Template_preface", null, 0, 1, AtemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtemModel_Dsl_Template_components(), this.getAbstractComponent(), null, "dsl_Template_components", null, 0, -1, AtemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headEClass, Head.class, "Head", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHead_Dsl_Head_components(), this.getHeadComponent(), null, "dsl_Head_components", null, 0, -1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headComponentEClass, HeadComponent.class, "HeadComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(driverEClass, Driver.class, "Driver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDriver_Dsl_Driver_RegEx(), ecorePackage.getEString(), "dsl_Driver_RegEx", null, 0, 1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDriver_Dsl_Driver_Status(), this.getTemplateStatuses(), "dsl_Driver_Status", null, 0, 1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateTitleEClass, TemplateTitle.class, "TemplateTitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateTitle_Dsl_TemplateTitle_Elements(), this.getHeaderFooterFragment(), null, "dsl_TemplateTitle_Elements", null, 0, -1, TemplateTitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageKeepWithNextEClass, PageKeepWithNext.class, "PageKeepWithNext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPageKeepWithNext_Dsl_PageKeepWithNext_value(), ecorePackage.getEString(), "dsl_PageKeepWithNext_value", null, 0, 1, PageKeepWithNext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageHeaderEvenEClass, PageHeaderEven.class, "PageHeaderEven", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPageHeaderEven_Dsl_PageHeader_columns(), this.getHeaderFooterColumn(), null, "dsl_PageHeader_columns", null, 0, -1, PageHeaderEven.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageHeaderOddEClass, PageHeaderOdd.class, "PageHeaderOdd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPageHeaderOdd_Dsl_PageHeader_columns(), this.getHeaderFooterColumn(), null, "dsl_PageHeader_columns", null, 0, -1, PageHeaderOdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageFooterEvenEClass, PageFooterEven.class, "PageFooterEven", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPageFooterEven_Dsl_PageHeader_columns(), this.getHeaderFooterColumn(), null, "dsl_PageHeader_columns", null, 0, -1, PageFooterEven.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageFooterOddEClass, PageFooterOdd.class, "PageFooterOdd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPageFooterOdd_Dsl_PageHeader_columns(), this.getHeaderFooterColumn(), null, "dsl_PageHeader_columns", null, 0, -1, PageFooterOdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerFooterColumnEClass, HeaderFooterColumn.class, "HeaderFooterColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeaderFooterColumn_Dsl_HeaderFooterColumn_fragments(), this.getHeaderFooterFragment(), null, "dsl_HeaderFooterColumn_fragments", null, 0, -1, HeaderFooterColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerFooterColumnLeftEClass, HeaderFooterColumnLeft.class, "HeaderFooterColumnLeft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(headerFooterColumnCenterEClass, HeaderFooterColumnCenter.class, "HeaderFooterColumnCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(headerFooterColumnRightEClass, HeaderFooterColumnRight.class, "HeaderFooterColumnRight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(headerFooterFragmentEClass, HeaderFooterFragment.class, "HeaderFooterFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(headerFooterTextEClass, HeaderFooterText.class, "HeaderFooterText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeaderFooterText_Dsl_HeaderFooterText(), ecorePackage.getEString(), "dsl_HeaderFooterText", null, 0, 1, HeaderFooterText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerFooterDateEClass, HeaderFooterDate.class, "HeaderFooterDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeaderFooterDate_Dsl_HeaderFooterDate(), ecorePackage.getEBoolean(), "dsl_HeaderFooterDate", null, 0, 1, HeaderFooterDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHeaderFooterDate_Dsl_HeaderFooterDate_Language(), this.getLanguage(), "dsl_HeaderFooterDate_Language", null, 0, 1, HeaderFooterDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerFooterPageNumberEClass, HeaderFooterPageNumber.class, "HeaderFooterPageNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeaderFooterPageNumber_Dsl_HeaderFooterPageNumber(), ecorePackage.getEBoolean(), "dsl_HeaderFooterPageNumber", null, 0, 1, HeaderFooterPageNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerFooterLookupEClass, HeaderFooterLookup.class, "HeaderFooterLookup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeaderFooterLookup_Dsl_HeaderFooterLookup_Elements(), this.getElementType(), null, "dsl_HeaderFooterLookup_Elements", null, 0, -1, HeaderFooterLookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHeaderFooterLookup_Dsl_HeaderFooterLookup_Language(), this.getLanguage(), "dsl_HeaderFooterLookup_Language", null, 0, 1, HeaderFooterLookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerFooterTitleEClass, HeaderFooterTitle.class, "HeaderFooterTitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeaderFooterTitle_Dsl_HeaderFooterTitle(), ecorePackage.getEBoolean(), "dsl_HeaderFooterTitle", null, 0, 1, HeaderFooterTitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerFooterCommemorationEClass, HeaderFooterCommemoration.class, "HeaderFooterCommemoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeaderFooterCommemoration_Dsl_HeaderFooterCommemoration(), ecorePackage.getEBoolean(), "dsl_HeaderFooterCommemoration", null, 0, 1, HeaderFooterCommemoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commemorationEClass, Commemoration.class, "Commemoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCommemoration_Dsl_Commemoration_Elements(), this.getHeaderFooterFragment(), null, "dsl_Commemoration_Elements", null, 0, -1, Commemoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateStatusEClass, TemplateStatus.class, "TemplateStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTemplateStatus_Dsl_TemplateStatus(), this.getTemplateStatuses(), "dsl_TemplateStatus", null, 0, 1, TemplateStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractComponentEClass, AbstractComponent.class, "AbstractComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(versionSwitchEClass, VersionSwitch.class, "VersionSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVersionSwitch_Dsl_VersionSwitch_flag(), this.getVersionSwitchType(), "dsl_VersionSwitch_flag", null, 0, 1, VersionSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceTextEClass, ResourceText.class, "ResourceText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResourceText_Dsl_ResourceTextRef(), theAresPackage.getDefinition(), null, "dsl_ResourceTextRef", null, 0, 1, ResourceText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceText_Dsl_ResourceText_Media_Off(), ecorePackage.getEBoolean(), "dsl_ResourceText_Media_Off", null, 0, 1, ResourceText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lookupEClass, Lookup.class, "Lookup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLookup_Dsl_ResourceTextRef(), theAresPackage.getDefinition(), null, "dsl_ResourceTextRef", null, 0, 1, Lookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLookup_Dsl_Lookup_Media_Off(), ecorePackage.getEBoolean(), "dsl_Lookup_Media_Off", null, 0, 1, Lookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLookup_Dsl_Lookup_Override_Mode_Set(), ecorePackage.getEBoolean(), "dsl_Lookup_Override_Mode_Set", null, 0, 1, Lookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLookup_Dsl_Lookup_OverrideMode(), this.getModeTypes(), "dsl_Lookup_OverrideMode", null, 0, 1, Lookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLookup_Dsl_Lookup_Override__Day_Set(), ecorePackage.getEBoolean(), "dsl_Lookup_Override__Day_Set", null, 0, 1, Lookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLookup_Dsl_Lookup_OverrideDay(), this.getDowTypes(), "dsl_Lookup_OverrideDay", null, 0, 1, Lookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ldpEClass, net.ages.workbench.templates.dsl.atem.LDP.class, "LDP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLDP_Dsl_LDP(), this.getLdpType(), null, "dsl_LDP", null, 0, -1, net.ages.workbench.templates.dsl.atem.LDP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taggedTextEClass, TaggedText.class, "TaggedText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTaggedText_Dsl_TaggedText_tag(), theAresPackage.getDefinition(), null, "dsl_TaggedText_tag", null, 0, 1, TaggedText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTaggedText_Dsl_TaggedText(), this.getElementType(), null, "dsl_TaggedText", null, 0, -1, TaggedText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(infoEClass, Info.class, "Info", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInfo_Name(), ecorePackage.getEString(), "name", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfo_Dsl_Info_Elements(), this.getInfoElementType(), null, "dsl_Info_Elements", null, 0, -1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(infoElementTypeEClass, InfoElementType.class, "InfoElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDate_Dsl_Date_month(), ecorePackage.getEInt(), "dsl_Date_month", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDate_Dsl_Date_day(), ecorePackage.getEInt(), "dsl_Date_day", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDate_Dsl_Date_year(), ecorePackage.getEInt(), "dsl_Date_year", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prefaceEClass, Preface.class, "Preface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPreface_Name(), ecorePackage.getEString(), "name", null, 0, 1, Preface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPreface_Dsl_Preface_Elements(), this.getPrefaceElementType(), null, "dsl_Preface_Elements", null, 0, -1, Preface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prefaceElementTypeEClass, PrefaceElementType.class, "PrefaceElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSection_Dsl_Section_Role(), theAresPackage.getDefinition(), null, "dsl_Section_Role", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSection_Dsl_Section_Elements(), this.getSectionElementType(), null, "dsl_Section_Elements", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionElementTypeEClass, SectionElementType.class, "SectionElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ldpTypeEClass, LdpType.class, "LdpType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(allEClass, All.class, "All", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAll_Dsl_Display_LiturgicalDayProperties(), ecorePackage.getEBoolean(), "dsl_Display_LiturgicalDayProperties", null, 0, 1, All.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genDateEClass, GenDate.class, "GenDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGenDate_Dsl_Display_Date(), ecorePackage.getEBoolean(), "dsl_Display_Date", null, 0, 1, GenDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genYearEClass, GenYear.class, "GenYear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGenYear_Dsl_Display_Year(), ecorePackage.getEBoolean(), "dsl_Display_Year", null, 0, 1, GenYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcdEClass, net.ages.workbench.templates.dsl.atem.MCD.class, "MCD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMCD_Dsl_MCD_value(), ecorePackage.getEBoolean(), "dsl_MCD_value", null, 0, 1, net.ages.workbench.templates.dsl.atem.MCD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mowEClass, net.ages.workbench.templates.dsl.atem.MOW.class, "MOW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMOW_Dsl_Display_Mode(), ecorePackage.getEBoolean(), "dsl_Display_Mode", null, 0, 1, net.ages.workbench.templates.dsl.atem.MOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nopEClass, net.ages.workbench.templates.dsl.atem.NOP.class, "NOP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNOP_Dsl_Display_Mode(), ecorePackage.getEBoolean(), "dsl_Display_Mode", null, 0, 1, net.ages.workbench.templates.dsl.atem.NOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domEClass, net.ages.workbench.templates.dsl.atem.DOM.class, "DOM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDOM_Dsl_Display_Mode(), ecorePackage.getEBoolean(), "dsl_Display_Mode", null, 0, 1, net.ages.workbench.templates.dsl.atem.DOM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dopEClass, net.ages.workbench.templates.dsl.atem.DOP.class, "DOP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDOP_Dsl_Display_Mode(), ecorePackage.getEBoolean(), "dsl_Display_Mode", null, 0, 1, net.ages.workbench.templates.dsl.atem.DOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(downEClass, net.ages.workbench.templates.dsl.atem.DOWN.class, "DOWN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDOWN_Dsl_Display_Mode(), ecorePackage.getEBoolean(), "dsl_Display_Mode", null, 0, 1, net.ages.workbench.templates.dsl.atem.DOWN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dowtEClass, net.ages.workbench.templates.dsl.atem.DOWT.class, "DOWT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDOWT_Dsl_Display_Mode(), ecorePackage.getEBoolean(), "dsl_Display_Mode", null, 0, 1, net.ages.workbench.templates.dsl.atem.DOWT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eowEClass, net.ages.workbench.templates.dsl.atem.EOW.class, "EOW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEOW_Dsl_Display_Eothinon(), ecorePackage.getEBoolean(), "dsl_Display_Eothinon", null, 0, 1, net.ages.workbench.templates.dsl.atem.EOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(saecEClass, net.ages.workbench.templates.dsl.atem.SAEC.class, "SAEC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSAEC_Dsl_Display_SundayAfterElevationCross(), ecorePackage.getEBoolean(), "dsl_Display_SundayAfterElevationCross", null, 0, 1, net.ages.workbench.templates.dsl.atem.SAEC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(solEClass, net.ages.workbench.templates.dsl.atem.SOL.class, "SOL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSOL_Dsl_Display_StartLukan(), ecorePackage.getEBoolean(), "dsl_Display_StartLukan", null, 0, 1, net.ages.workbench.templates.dsl.atem.SOL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dolEClass, net.ages.workbench.templates.dsl.atem.DOL.class, "DOL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDOL_Dsl_Display_DayLukan(), ecorePackage.getEBoolean(), "dsl_Display_DayLukan", null, 0, 1, net.ages.workbench.templates.dsl.atem.DOL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wolcEClass, net.ages.workbench.templates.dsl.atem.WOLC.class, "WOLC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWOLC_Dsl_Display_DayLukan(), ecorePackage.getEBoolean(), "dsl_Display_DayLukan", null, 0, 1, net.ages.workbench.templates.dsl.atem.WOLC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wdolcEClass, net.ages.workbench.templates.dsl.atem.WDOLC.class, "WDOLC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWDOLC_Dsl_Display_DayLukan(), ecorePackage.getEBoolean(), "dsl_Display_DayLukan", null, 0, 1, net.ages.workbench.templates.dsl.atem.WDOLC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sbtEClass, net.ages.workbench.templates.dsl.atem.SBT.class, "SBT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSBT_Dsl_Display_SundaysBeforeTriodion(), ecorePackage.getEBoolean(), "dsl_Display_SundaysBeforeTriodion", null, 0, 1, net.ages.workbench.templates.dsl.atem.SBT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateFragmentEClass, TemplateFragment.class, "TemplateFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateFragment_Name(), this.getAtemModel(), null, "name", null, 0, 1, TemplateFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prefaceFragmentEClass, PrefaceFragment.class, "PrefaceFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrefaceFragment_Name(), this.getPreface(), null, "name", null, 0, 1, PrefaceFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionFragmentEClass, SectionFragment.class, "SectionFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSectionFragment_Name(), this.getSection(), null, "name", null, 0, 1, SectionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(breakEClass, Break.class, "Break", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBreak_Dsl_break_type(), this.getBreakType(), "dsl_break_type", null, 0, 1, Break.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageNumberEClass, PageNumber.class, "PageNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPageNumber_Dsl_PageNumber_value(), ecorePackage.getEInt(), "dsl_PageNumber_value", null, 0, 1, PageNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(passThroughHtmlEClass, PassThroughHtml.class, "PassThroughHtml", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPassThroughHtml_Dsl_Passthrough_html_text(), ecorePackage.getEString(), "dsl_Passthrough_html_text", null, 0, 1, PassThroughHtml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(passThroughPdfEClass, PassThroughPdf.class, "PassThroughPdf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPassThroughPdf_Dsl_Passthrough_pdf_text(), ecorePackage.getEString(), "dsl_Passthrough_pdf_text", null, 0, 1, PassThroughPdf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(titleEClass, Title.class, "Title", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTitle_Dsl_Title_Role(), theAresPackage.getDefinition(), null, "dsl_Title_Role", null, 0, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTitle_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subTitleEClass, SubTitle.class, "SubTitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubTitle_Dsl_SubTitle_Role(), theAresPackage.getDefinition(), null, "dsl_SubTitle_Role", null, 0, 1, SubTitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubTitle_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, SubTitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParagraph_Dsl_Para_Role(), theAresPackage.getDefinition(), null, "dsl_Para_Role", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParagraph_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlock_Dsl_Block_Role(), theAresPackage.getDefinition(), null, "dsl_Block_Role", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBlock_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hymnEClass, Hymn.class, "Hymn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHymn_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, Hymn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mediaEClass, Media.class, "Media", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMedia_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verseEClass, Verse.class, "Verse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVerse_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, Verse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActor_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rubricEClass, Rubric.class, "Rubric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRubric_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, Rubric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dialogEClass, Dialog.class, "Dialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDialog_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(readingEClass, Reading.class, "Reading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReading_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, Reading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(heading1EClass, Heading1.class, "Heading1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeading1_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, Heading1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(heading2EClass, Heading2.class, "Heading2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeading2_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, Heading2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(heading3EClass, Heading3.class, "Heading3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeading3_Dsl_Elements(), this.getElementType(), null, "dsl_Elements", null, 0, -1, Heading3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementTypeEClass, ElementType.class, "ElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(aidEClass, Aid.class, "Aid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAid_Name(), ecorePackage.getEString(), "name", null, 0, 1, Aid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVersion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(litBookEClass, LitBook.class, "LitBook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLitBook_Name(), ecorePackage.getEString(), "name", null, 0, 1, LitBook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setLocaleEClass, SetLocale.class, "SetLocale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetLocale_Dsl_SetLocale_V1(), ecorePackage.getEString(), "dsl_SetLocale_V1", null, 0, 1, SetLocale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetLocale_Dsl_SetLocale_V2(), ecorePackage.getEString(), "dsl_SetLocale_V2", null, 0, 1, SetLocale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(restoreLocaleEClass, RestoreLocale.class, "RestoreLocale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRestoreLocale_Dsl_RestoreLocale(), ecorePackage.getEBoolean(), "dsl_RestoreLocale", null, 0, 1, RestoreLocale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenDateEClass, WhenDate.class, "WhenDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenDate_Dsl_WhenDate_Cases(), this.getWhenDateCase(), null, "dsl_WhenDate_Cases", null, 0, -1, WhenDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenDate_Dsl_WhenDate_Other(), this.getWhenOther(), null, "dsl_WhenDate_Other", null, 0, 1, WhenDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenDateCaseEClass, WhenDateCase.class, "WhenDateCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWhenDateCase_Dsl_WhenDate_Case_Month(), this.getMonthName(), "dsl_WhenDate_Case_Month", null, 0, 1, WhenDateCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenDateCase_Dsl_WhenDateCase_Days(), this.getAbstractDateCase(), null, "dsl_WhenDateCase_Days", null, 0, 1, WhenDateCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenDateCase_Dsl_WhenDateCase_True_actions(), this.getAbstractComponent(), null, "dsl_WhenDateCase_True_actions", null, 0, -1, WhenDateCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDateCaseEClass, AbstractDateCase.class, "AbstractDateCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dateRangeEClass, DateRange.class, "DateRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDateRange_Dsl_DateRange_from(), ecorePackage.getEInt(), "dsl_DateRange_from", null, 0, 1, DateRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDateRange_Dsl_DateRange_To(), ecorePackage.getEInt(), "dsl_DateRange_To", null, 0, 1, DateRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateSetEClass, DateSet.class, "DateSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDateSet_DslDateSet_Values(), ecorePackage.getEInt(), "dslDateSet_Values", null, 0, -1, DateSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenDayNameEClass, WhenDayName.class, "WhenDayName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenDayName_Dsl_WhenDayName_Cases(), this.getWhenDayNameCase(), null, "dsl_WhenDayName_Cases", null, 0, -1, WhenDayName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenDayName_Dsl_WhenDayName_Other(), this.getWhenOther(), null, "dsl_WhenDayName_Other", null, 0, 1, WhenDayName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenDayNameCaseEClass, WhenDayNameCase.class, "WhenDayNameCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenDayNameCase_Dsl_WhenDayNameCase_Days(), this.getAbstractDayNameCase(), null, "dsl_WhenDayNameCase_Days", null, 0, 1, WhenDayNameCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenDayNameCase_Dsl_WhenDayNameCase_True_actions(), this.getAbstractComponent(), null, "dsl_WhenDayNameCase_True_actions", null, 0, -1, WhenDayNameCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDayNameCaseEClass, AbstractDayNameCase.class, "AbstractDayNameCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dayNameRangeEClass, DayNameRange.class, "DayNameRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDayNameRange_Dsl_DayNameRange_from(), this.getDayOfWeek(), "dsl_DayNameRange_from", null, 0, 1, DayNameRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDayNameRange_Dsl_DayNameRange_To(), this.getDayOfWeek(), "dsl_DayNameRange_To", null, 0, 1, DayNameRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dayNameSetEClass, DayNameSet.class, "DayNameSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDayNameSet_DslDayNameSet_Values(), this.getDayOfWeek(), "dslDayNameSet_Values", null, 0, -1, DayNameSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenPentecostarionDayEClass, WhenPentecostarionDay.class, "WhenPentecostarionDay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenPentecostarionDay_Dsl_WhenPentecostarionDay_Cases(), this.getWhenPeriodCase(), null, "dsl_WhenPentecostarionDay_Cases", null, 0, -1, WhenPentecostarionDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenPentecostarionDay_Dsl_WhenPentecostarionDay_Other(), this.getWhenOther(), null, "dsl_WhenPentecostarionDay_Other", null, 0, 1, WhenPentecostarionDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenTriodionDayEClass, WhenTriodionDay.class, "WhenTriodionDay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenTriodionDay_Dsl_WhenTriodionDay_Cases(), this.getWhenPeriodCase(), null, "dsl_WhenTriodionDay_Cases", null, 0, -1, WhenTriodionDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenTriodionDay_Dsl_WhenTriodionDay_Other(), this.getWhenOther(), null, "dsl_WhenTriodionDay_Other", null, 0, 1, WhenTriodionDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenMovableCycleDayEClass, WhenMovableCycleDay.class, "WhenMovableCycleDay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenMovableCycleDay_Dsl_WhenMovableCycleDay_Cases(), this.getWhenPeriodCase(), null, "dsl_WhenMovableCycleDay_Cases", null, 0, -1, WhenMovableCycleDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenMovableCycleDay_Dsl_WhenMovableCycleDay_Other(), this.getWhenOther(), null, "dsl_WhenMovableCycleDay_Other", null, 0, 1, WhenMovableCycleDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenSundayAfterElevationOfCrossDayEClass, WhenSundayAfterElevationOfCrossDay.class, "WhenSundayAfterElevationOfCrossDay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenSundayAfterElevationOfCrossDay_Dsl_WhenSundayAfterElevationOfCrossDay_Cases(), this.getWhenDateCase(), null, "dsl_WhenSundayAfterElevationOfCrossDay_Cases", null, 0, -1, WhenSundayAfterElevationOfCrossDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenSundayAfterElevationOfCrossDay_Dsl_WhenSundayAfterElevationOfCrossDay_Other(), this.getWhenOther(), null, "dsl_WhenSundayAfterElevationOfCrossDay_Other", null, 0, 1, WhenSundayAfterElevationOfCrossDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenLukanCycleDayEClass, WhenLukanCycleDay.class, "WhenLukanCycleDay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenLukanCycleDay_Dsl_WhenLukanCycleDay_Cases(), this.getWhenPeriodCase(), null, "dsl_WhenLukanCycleDay_Cases", null, 0, -1, WhenLukanCycleDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenLukanCycleDay_Dsl_WhenLukanCycleDay_Other(), this.getWhenOther(), null, "dsl_WhenLukanCycleDay_Other", null, 0, 1, WhenLukanCycleDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenPaschaEClass, WhenPascha.class, "WhenPascha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenPascha_Dsl_WhenPascha_true_actions(), this.getAbstractComponent(), null, "dsl_WhenPascha_true_actions", null, 0, -1, WhenPascha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenPascha_Dsl_WhenPascha_Other_actions(), this.getAbstractComponent(), null, "dsl_WhenPascha_Other_actions", null, 0, -1, WhenPascha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenOtherEClass, WhenOther.class, "WhenOther", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenOther_Dsl_WhenCase_Other_actions(), this.getAbstractComponent(), null, "dsl_WhenCase_Other_actions", null, 0, -1, WhenOther.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenPeriodCaseEClass, WhenPeriodCase.class, "WhenPeriodCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenPeriodCase_Dsl_WhenPeriodCase_Days(), this.getAbstractDayCase(), null, "dsl_WhenPeriodCase_Days", null, 0, 1, WhenPeriodCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenPeriodCase_Dsl_WhenPeriodCase_True_actions(), this.getAbstractComponent(), null, "dsl_WhenPeriodCase_True_actions", null, 0, -1, WhenPeriodCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDayCaseEClass, AbstractDayCase.class, "AbstractDayCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dayRangeEClass, DayRange.class, "DayRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDayRange_Dsl_DayRange_from(), ecorePackage.getEInt(), "dsl_DayRange_from", null, 0, 1, DayRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDayRange_Dsl_Range_To(), ecorePackage.getEInt(), "dsl_Range_To", null, 0, 1, DayRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(daySetEClass, DaySet.class, "DaySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDaySet_DslSetValue_Days(), ecorePackage.getEInt(), "dslSetValue_Days", null, 0, -1, DaySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenModeOfWeekEClass, WhenModeOfWeek.class, "WhenModeOfWeek", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenModeOfWeek_Dsl_WhenModeOfWeek_Cases(), this.getWhenModeOfWeekCase(), null, "dsl_WhenModeOfWeek_Cases", null, 0, -1, WhenModeOfWeek.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenModeOfWeek_Dsl_WhenModeOfWeek_Other(), this.getWhenOther(), null, "dsl_WhenModeOfWeek_Other", null, 0, 1, WhenModeOfWeek.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenModeOfWeekCaseEClass, WhenModeOfWeekCase.class, "WhenModeOfWeekCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenModeOfWeekCase_Dsl_WhenModeOfWeekCase_Days(), this.getModeOfWeekSet(), null, "dsl_WhenModeOfWeekCase_Days", null, 0, 1, WhenModeOfWeekCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenModeOfWeekCase_Dsl_WhenModeOfWeekCase_True_actions(), this.getAbstractComponent(), null, "dsl_WhenModeOfWeekCase_True_actions", null, 0, -1, WhenModeOfWeekCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modeOfWeekSetEClass, ModeOfWeekSet.class, "ModeOfWeekSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModeOfWeekSet_Dsl_ModeOfWeekSet_MOWs(), this.getModeTypes(), "dsl_ModeOfWeekSet_MOWs", null, 0, -1, ModeOfWeekSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenSundaysBeforeTriodionEClass, WhenSundaysBeforeTriodion.class, "WhenSundaysBeforeTriodion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenSundaysBeforeTriodion_Dsl_WhenSundaysBeforeTriodion_Cases(), this.getSundaysBeforeTriodionCase(), null, "dsl_WhenSundaysBeforeTriodion_Cases", null, 0, -1, WhenSundaysBeforeTriodion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenSundaysBeforeTriodion_Dsl_SundaysBeforeTriodion_Other(), this.getWhenOther(), null, "dsl_SundaysBeforeTriodion_Other", null, 0, 1, WhenSundaysBeforeTriodion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sundaysBeforeTriodionCaseEClass, SundaysBeforeTriodionCase.class, "SundaysBeforeTriodionCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSundaysBeforeTriodionCase_Dsl_SundaysBeforeTriodionCase_Days(), ecorePackage.getEInt(), "dsl_SundaysBeforeTriodionCase_Days", null, 0, 1, SundaysBeforeTriodionCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSundaysBeforeTriodionCase_Dsl_SundaysBeforeTriodionCase_True_actions(), this.getAbstractComponent(), null, "dsl_SundaysBeforeTriodionCase_True_actions", null, 0, -1, SundaysBeforeTriodionCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenExistsEClass, WhenExists.class, "WhenExists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenExists_Dsl_WhenExists_Cases(), this.getWhenExistsCase(), null, "dsl_WhenExists_Cases", null, 0, -1, WhenExists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenExists_Dsl_WhenExists_Other(), this.getWhenOther(), null, "dsl_WhenExists_Other", null, 0, 1, WhenExists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenExistsCaseEClass, WhenExistsCase.class, "WhenExistsCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenExistsCase_Dsl_WhenExistsCase_Ref(), theAresPackage.getDefinition(), null, "dsl_WhenExistsCase_Ref", null, 0, 1, WhenExistsCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenExistsCase_Dsl_WhenExistsCase_True_actions(), this.getAbstractComponent(), null, "dsl_WhenExistsCase_True_actions", null, 0, -1, WhenExistsCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(versionSwitchTypeEEnum, VersionSwitchType.class, "VersionSwitchType");
    addEEnumLiteral(versionSwitchTypeEEnum, VersionSwitchType.L1);
    addEEnumLiteral(versionSwitchTypeEEnum, VersionSwitchType.L2);
    addEEnumLiteral(versionSwitchTypeEEnum, VersionSwitchType.BOTH);

    initEEnum(languageEEnum, Language.class, "Language");
    addEEnumLiteral(languageEEnum, Language.L1);
    addEEnumLiteral(languageEEnum, Language.L2);

    initEEnum(breakTypeEEnum, BreakType.class, "BreakType");
    addEEnumLiteral(breakTypeEEnum, BreakType.LINE);
    addEEnumLiteral(breakTypeEEnum, BreakType.PAGE);

    initEEnum(templateStatusesEEnum, TemplateStatuses.class, "TemplateStatuses");
    addEEnumLiteral(templateStatusesEEnum, TemplateStatuses.NA);
    addEEnumLiteral(templateStatusesEEnum, TemplateStatuses.DRAFT);
    addEEnumLiteral(templateStatusesEEnum, TemplateStatuses.REVIEW);
    addEEnumLiteral(templateStatusesEEnum, TemplateStatuses.FINAL);

    initEEnum(nullEEnum, Null.class, "Null");
    addEEnumLiteral(nullEEnum, Null.NULL);

    initEEnum(modeTypesEEnum, ModeTypes.class, "ModeTypes");
    addEEnumLiteral(modeTypesEEnum, ModeTypes.M1);
    addEEnumLiteral(modeTypesEEnum, ModeTypes.M2);
    addEEnumLiteral(modeTypesEEnum, ModeTypes.M3);
    addEEnumLiteral(modeTypesEEnum, ModeTypes.M4);
    addEEnumLiteral(modeTypesEEnum, ModeTypes.M5);
    addEEnumLiteral(modeTypesEEnum, ModeTypes.M6);
    addEEnumLiteral(modeTypesEEnum, ModeTypes.M7);
    addEEnumLiteral(modeTypesEEnum, ModeTypes.M8);

    initEEnum(dowTypesEEnum, DowTypes.class, "DowTypes");
    addEEnumLiteral(dowTypesEEnum, DowTypes.D1);
    addEEnumLiteral(dowTypesEEnum, DowTypes.D2);
    addEEnumLiteral(dowTypesEEnum, DowTypes.D3);
    addEEnumLiteral(dowTypesEEnum, DowTypes.D4);
    addEEnumLiteral(dowTypesEEnum, DowTypes.D5);
    addEEnumLiteral(dowTypesEEnum, DowTypes.D6);
    addEEnumLiteral(dowTypesEEnum, DowTypes.D7);

    initEEnum(bookTypesEEnum, BookTypes.class, "BookTypes");
    addEEnumLiteral(bookTypesEEnum, BookTypes.OCTOCHECHOS);
    addEEnumLiteral(bookTypesEEnum, BookTypes.MENAION);
    addEEnumLiteral(bookTypesEEnum, BookTypes.EUCHOLOGION);
    addEEnumLiteral(bookTypesEEnum, BookTypes.PENTECOSTARION);
    addEEnumLiteral(bookTypesEEnum, BookTypes.TRIODION);
    addEEnumLiteral(bookTypesEEnum, BookTypes.HOROLOGION);
    addEEnumLiteral(bookTypesEEnum, BookTypes.EOTHINA);
    addEEnumLiteral(bookTypesEEnum, BookTypes.HEIRMOLOGION);
    addEEnumLiteral(bookTypesEEnum, BookTypes.KATAVASIAS);
    addEEnumLiteral(bookTypesEEnum, BookTypes.PSALTER);
    addEEnumLiteral(bookTypesEEnum, BookTypes.LECTIONARY);
    addEEnumLiteral(bookTypesEEnum, BookTypes.OTHER);

    initEEnum(seasonsEEnum, Seasons.class, "Seasons");
    addEEnumLiteral(seasonsEEnum, Seasons.TRIODION);
    addEEnumLiteral(seasonsEEnum, Seasons.PENTECOSTARION);
    addEEnumLiteral(seasonsEEnum, Seasons.NATIVITY_FAST);
    addEEnumLiteral(seasonsEEnum, Seasons.APOSTLES_FAST);
    addEEnumLiteral(seasonsEEnum, Seasons.DORMITION_FAST);

    initEEnum(dayOfMonthTypesEEnum, DayOfMonthTypes.class, "DayOfMonthTypes");
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D01);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D02);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D03);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D04);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D05);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D06);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D07);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D08);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D09);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D10);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D11);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D12);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D13);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D14);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D15);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D16);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D17);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D18);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D19);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D20);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D21);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D22);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D23);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D24);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D25);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D26);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D27);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D28);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D29);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D30);
    addEEnumLiteral(dayOfMonthTypesEEnum, DayOfMonthTypes.D31);

    initEEnum(periodTypeEEnum, PeriodType.class, "PeriodType");
    addEEnumLiteral(periodTypeEEnum, PeriodType.PASCHA);
    addEEnumLiteral(periodTypeEEnum, PeriodType.PENTECOSTARION);
    addEEnumLiteral(periodTypeEEnum, PeriodType.TRIODION);

    initEEnum(dayOfWeekEEnum, DayOfWeek.class, "DayOfWeek");
    addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.SUNDAY);
    addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.MONDAY);
    addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.TUESDAY);
    addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.WEDNESDAY);
    addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.THURSDAY);
    addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.FRIDAY);
    addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.SATURDAY);

    initEEnum(monthNameEEnum, MonthName.class, "MonthName");
    addEEnumLiteral(monthNameEEnum, MonthName.JAN);
    addEEnumLiteral(monthNameEEnum, MonthName.FEB);
    addEEnumLiteral(monthNameEEnum, MonthName.MAR);
    addEEnumLiteral(monthNameEEnum, MonthName.APR);
    addEEnumLiteral(monthNameEEnum, MonthName.MAY);
    addEEnumLiteral(monthNameEEnum, MonthName.JUN);
    addEEnumLiteral(monthNameEEnum, MonthName.JUL);
    addEEnumLiteral(monthNameEEnum, MonthName.AUG);
    addEEnumLiteral(monthNameEEnum, MonthName.SEP);
    addEEnumLiteral(monthNameEEnum, MonthName.OCT);
    addEEnumLiteral(monthNameEEnum, MonthName.NOV);
    addEEnumLiteral(monthNameEEnum, MonthName.DEC);

    // Create resource
    createResource(eNS_URI);
  }

} //AtemPackageImpl
