/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.ages.workbench.templates.dsl.atem.AtemFactory
 * @model kind="package"
 * @generated
 */
public interface AtemPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "atem";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ages.net/workbench/templates/dsl/Atem";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "atem";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AtemPackage eINSTANCE = net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl.init();

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.AtemModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemModelImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAtemModel()
   * @generated
   */
  int ATEM_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATEM_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Dsl Template Status</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATEM_MODEL__DSL_TEMPLATE_STATUS = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATEM_MODEL__IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Dsl Template Driver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATEM_MODEL__DSL_TEMPLATE_DRIVER = 3;

  /**
   * The feature id for the '<em><b>Dsl Template head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATEM_MODEL__DSL_TEMPLATE_HEAD = 4;

  /**
   * The feature id for the '<em><b>Dsl Template preface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATEM_MODEL__DSL_TEMPLATE_PREFACE = 5;

  /**
   * The feature id for the '<em><b>Dsl Template components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATEM_MODEL__DSL_TEMPLATE_COMPONENTS = 6;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATEM_MODEL_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeadImpl <em>Head</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HeadImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHead()
   * @generated
   */
  int HEAD = 1;

  /**
   * The feature id for the '<em><b>Dsl Head components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD__DSL_HEAD_COMPONENTS = 0;

  /**
   * The number of structural features of the '<em>Head</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeadComponentImpl <em>Head Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HeadComponentImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeadComponent()
   * @generated
   */
  int HEAD_COMPONENT = 2;

  /**
   * The number of structural features of the '<em>Head Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD_COMPONENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DriverImpl <em>Driver</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DriverImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDriver()
   * @generated
   */
  int DRIVER = 3;

  /**
   * The feature id for the '<em><b>Dsl Driver Reg Ex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVER__DSL_DRIVER_REG_EX = 0;

  /**
   * The feature id for the '<em><b>Dsl Driver Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVER__DSL_DRIVER_STATUS = 1;

  /**
   * The number of structural features of the '<em>Driver</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.TemplateTitleImpl <em>Template Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.TemplateTitleImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getTemplateTitle()
   * @generated
   */
  int TEMPLATE_TITLE = 4;

  /**
   * The feature id for the '<em><b>Dsl Template Title Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_TITLE__DSL_TEMPLATE_TITLE_ELEMENTS = HEAD_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Template Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_TITLE_FEATURE_COUNT = HEAD_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.PageKeepWithNextImpl <em>Page Keep With Next</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.PageKeepWithNextImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPageKeepWithNext()
   * @generated
   */
  int PAGE_KEEP_WITH_NEXT = 5;

  /**
   * The feature id for the '<em><b>Dsl Page Keep With Next value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_KEEP_WITH_NEXT__DSL_PAGE_KEEP_WITH_NEXT_VALUE = HEAD_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Page Keep With Next</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_KEEP_WITH_NEXT_FEATURE_COUNT = HEAD_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.PageHeaderEvenImpl <em>Page Header Even</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.PageHeaderEvenImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPageHeaderEven()
   * @generated
   */
  int PAGE_HEADER_EVEN = 6;

  /**
   * The feature id for the '<em><b>Dsl Page Header columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_HEADER_EVEN__DSL_PAGE_HEADER_COLUMNS = HEAD_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Page Header Even</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_HEADER_EVEN_FEATURE_COUNT = HEAD_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.PageHeaderOddImpl <em>Page Header Odd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.PageHeaderOddImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPageHeaderOdd()
   * @generated
   */
  int PAGE_HEADER_ODD = 7;

  /**
   * The feature id for the '<em><b>Dsl Page Header columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_HEADER_ODD__DSL_PAGE_HEADER_COLUMNS = HEAD_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Page Header Odd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_HEADER_ODD_FEATURE_COUNT = HEAD_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.PageFooterEvenImpl <em>Page Footer Even</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.PageFooterEvenImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPageFooterEven()
   * @generated
   */
  int PAGE_FOOTER_EVEN = 8;

  /**
   * The feature id for the '<em><b>Dsl Page Header columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FOOTER_EVEN__DSL_PAGE_HEADER_COLUMNS = HEAD_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Page Footer Even</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FOOTER_EVEN_FEATURE_COUNT = HEAD_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.PageFooterOddImpl <em>Page Footer Odd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.PageFooterOddImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPageFooterOdd()
   * @generated
   */
  int PAGE_FOOTER_ODD = 9;

  /**
   * The feature id for the '<em><b>Dsl Page Header columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FOOTER_ODD__DSL_PAGE_HEADER_COLUMNS = HEAD_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Page Footer Odd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FOOTER_ODD_FEATURE_COUNT = HEAD_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnImpl <em>Header Footer Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterColumn()
   * @generated
   */
  int HEADER_FOOTER_COLUMN = 10;

  /**
   * The feature id for the '<em><b>Dsl Header Footer Column fragments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_COLUMN__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS = 0;

  /**
   * The number of structural features of the '<em>Header Footer Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_COLUMN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnLeftImpl <em>Header Footer Column Left</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnLeftImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterColumnLeft()
   * @generated
   */
  int HEADER_FOOTER_COLUMN_LEFT = 11;

  /**
   * The feature id for the '<em><b>Dsl Header Footer Column fragments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_COLUMN_LEFT__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS = HEADER_FOOTER_COLUMN__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS;

  /**
   * The number of structural features of the '<em>Header Footer Column Left</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_COLUMN_LEFT_FEATURE_COUNT = HEADER_FOOTER_COLUMN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnCenterImpl <em>Header Footer Column Center</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnCenterImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterColumnCenter()
   * @generated
   */
  int HEADER_FOOTER_COLUMN_CENTER = 12;

  /**
   * The feature id for the '<em><b>Dsl Header Footer Column fragments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_COLUMN_CENTER__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS = HEADER_FOOTER_COLUMN__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS;

  /**
   * The number of structural features of the '<em>Header Footer Column Center</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_COLUMN_CENTER_FEATURE_COUNT = HEADER_FOOTER_COLUMN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnRightImpl <em>Header Footer Column Right</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnRightImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterColumnRight()
   * @generated
   */
  int HEADER_FOOTER_COLUMN_RIGHT = 13;

  /**
   * The feature id for the '<em><b>Dsl Header Footer Column fragments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_COLUMN_RIGHT__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS = HEADER_FOOTER_COLUMN__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS;

  /**
   * The number of structural features of the '<em>Header Footer Column Right</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_COLUMN_RIGHT_FEATURE_COUNT = HEADER_FOOTER_COLUMN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterFragmentImpl <em>Header Footer Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterFragmentImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterFragment()
   * @generated
   */
  int HEADER_FOOTER_FRAGMENT = 14;

  /**
   * The number of structural features of the '<em>Header Footer Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_FRAGMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterTextImpl <em>Header Footer Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterTextImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterText()
   * @generated
   */
  int HEADER_FOOTER_TEXT = 15;

  /**
   * The feature id for the '<em><b>Dsl Header Footer Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_TEXT__DSL_HEADER_FOOTER_TEXT = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Header Footer Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_TEXT_FEATURE_COUNT = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterDateImpl <em>Header Footer Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterDateImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterDate()
   * @generated
   */
  int HEADER_FOOTER_DATE = 16;

  /**
   * The feature id for the '<em><b>Dsl Header Footer Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Header Footer Date Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE_LANGUAGE = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Header Footer Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_DATE_FEATURE_COUNT = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterPageNumberImpl <em>Header Footer Page Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterPageNumberImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterPageNumber()
   * @generated
   */
  int HEADER_FOOTER_PAGE_NUMBER = 17;

  /**
   * The feature id for the '<em><b>Dsl Header Footer Page Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_PAGE_NUMBER__DSL_HEADER_FOOTER_PAGE_NUMBER = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Header Footer Page Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_PAGE_NUMBER_FEATURE_COUNT = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterLookupImpl <em>Header Footer Lookup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterLookupImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterLookup()
   * @generated
   */
  int HEADER_FOOTER_LOOKUP = 18;

  /**
   * The feature id for the '<em><b>Dsl Header Footer Lookup Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_ELEMENTS = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Header Footer Lookup Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_LANGUAGE = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Header Footer Lookup</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_LOOKUP_FEATURE_COUNT = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterTitleImpl <em>Header Footer Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterTitleImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterTitle()
   * @generated
   */
  int HEADER_FOOTER_TITLE = 19;

  /**
   * The feature id for the '<em><b>Dsl Header Footer Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_TITLE__DSL_HEADER_FOOTER_TITLE = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Header Footer Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_TITLE_FEATURE_COUNT = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterCommemorationImpl <em>Header Footer Commemoration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterCommemorationImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterCommemoration()
   * @generated
   */
  int HEADER_FOOTER_COMMEMORATION = 20;

  /**
   * The feature id for the '<em><b>Dsl Header Footer Commemoration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_COMMEMORATION__DSL_HEADER_FOOTER_COMMEMORATION = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Header Footer Commemoration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FOOTER_COMMEMORATION_FEATURE_COUNT = HEADER_FOOTER_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.CommemorationImpl <em>Commemoration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.CommemorationImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getCommemoration()
   * @generated
   */
  int COMMEMORATION = 21;

  /**
   * The feature id for the '<em><b>Dsl Commemoration Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMEMORATION__DSL_COMMEMORATION_ELEMENTS = HEAD_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Commemoration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMEMORATION_FEATURE_COUNT = HEAD_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.TemplateStatusImpl <em>Template Status</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.TemplateStatusImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getTemplateStatus()
   * @generated
   */
  int TEMPLATE_STATUS = 22;

  /**
   * The feature id for the '<em><b>Dsl Template Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_STATUS__DSL_TEMPLATE_STATUS = 0;

  /**
   * The number of structural features of the '<em>Template Status</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_STATUS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.AbstractComponentImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAbstractComponent()
   * @generated
   */
  int ABSTRACT_COMPONENT = 23;

  /**
   * The number of structural features of the '<em>Abstract Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_COMPONENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.ImportImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 24;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.VersionSwitchImpl <em>Version Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.VersionSwitchImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getVersionSwitch()
   * @generated
   */
  int VERSION_SWITCH = 25;

  /**
   * The feature id for the '<em><b>Dsl Version Switch flag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_SWITCH__DSL_VERSION_SWITCH_FLAG = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Version Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_SWITCH_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.ElementTypeImpl <em>Element Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.ElementTypeImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getElementType()
   * @generated
   */
  int ELEMENT_TYPE = 76;

  /**
   * The number of structural features of the '<em>Element Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.ResourceTextImpl <em>Resource Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.ResourceTextImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getResourceText()
   * @generated
   */
  int RESOURCE_TEXT = 26;

  /**
   * The feature id for the '<em><b>Dsl Resource Text Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_TEXT__DSL_RESOURCE_TEXT_REF = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Resource Text Media Off</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_TEXT__DSL_RESOURCE_TEXT_MEDIA_OFF = ELEMENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Resource Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_TEXT_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.LookupImpl <em>Lookup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.LookupImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getLookup()
   * @generated
   */
  int LOOKUP = 27;

  /**
   * The feature id for the '<em><b>Dsl Resource Text Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP__DSL_RESOURCE_TEXT_REF = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Lookup Media Off</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP__DSL_LOOKUP_MEDIA_OFF = ELEMENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dsl Lookup Override Mode Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP__DSL_LOOKUP_OVERRIDE_MODE_SET = ELEMENT_TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Dsl Lookup Override Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP__DSL_LOOKUP_OVERRIDE_MODE = ELEMENT_TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Dsl Lookup Override Day Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP__DSL_LOOKUP_OVERRIDE_DAY_SET = ELEMENT_TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Dsl Lookup Override Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP__DSL_LOOKUP_OVERRIDE_DAY = ELEMENT_TYPE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Lookup</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.LDPImpl <em>LDP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.LDPImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getLDP()
   * @generated
   */
  int LDP = 28;

  /**
   * The feature id for the '<em><b>Dsl LDP</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDP__DSL_LDP = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LDP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDP_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.TaggedTextImpl <em>Tagged Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.TaggedTextImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getTaggedText()
   * @generated
   */
  int TAGGED_TEXT = 29;

  /**
   * The feature id for the '<em><b>Dsl Tagged Text tag</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_TEXT__DSL_TAGGED_TEXT_TAG = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Tagged Text</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_TEXT__DSL_TAGGED_TEXT = ELEMENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Tagged Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_TEXT_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.InfoImpl <em>Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.InfoImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getInfo()
   * @generated
   */
  int INFO = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO__NAME = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Info Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO__DSL_INFO_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.InfoElementTypeImpl <em>Info Element Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.InfoElementTypeImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getInfoElementType()
   * @generated
   */
  int INFO_ELEMENT_TYPE = 31;

  /**
   * The number of structural features of the '<em>Info Element Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_ELEMENT_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DateImpl <em>Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DateImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDate()
   * @generated
   */
  int DATE = 32;

  /**
   * The feature id for the '<em><b>Dsl Date month</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__DSL_DATE_MONTH = HEAD_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Date day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__DSL_DATE_DAY = HEAD_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dsl Date year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__DSL_DATE_YEAR = HEAD_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_FEATURE_COUNT = HEAD_COMPONENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.PrefaceImpl <em>Preface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.PrefaceImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPreface()
   * @generated
   */
  int PREFACE = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Dsl Preface Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFACE__DSL_PREFACE_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Preface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.PrefaceElementTypeImpl <em>Preface Element Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.PrefaceElementTypeImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPrefaceElementType()
   * @generated
   */
  int PREFACE_ELEMENT_TYPE = 34;

  /**
   * The number of structural features of the '<em>Preface Element Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFACE_ELEMENT_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.SectionImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSection()
   * @generated
   */
  int SECTION = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__NAME = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Section Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__DSL_SECTION_ROLE = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dsl Section Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__DSL_SECTION_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.SectionElementTypeImpl <em>Section Element Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.SectionElementTypeImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSectionElementType()
   * @generated
   */
  int SECTION_ELEMENT_TYPE = 36;

  /**
   * The number of structural features of the '<em>Section Element Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_ELEMENT_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.LdpTypeImpl <em>Ldp Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.LdpTypeImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getLdpType()
   * @generated
   */
  int LDP_TYPE = 37;

  /**
   * The number of structural features of the '<em>Ldp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDP_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.AllImpl <em>All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.AllImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAll()
   * @generated
   */
  int ALL = 38;

  /**
   * The feature id for the '<em><b>Dsl Display Liturgical Day Properties</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALL__DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALL_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.GenDateImpl <em>Gen Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.GenDateImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getGenDate()
   * @generated
   */
  int GEN_DATE = 39;

  /**
   * The feature id for the '<em><b>Dsl Display Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_DATE__DSL_DISPLAY_DATE = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Gen Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_DATE_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.GenYearImpl <em>Gen Year</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.GenYearImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getGenYear()
   * @generated
   */
  int GEN_YEAR = 40;

  /**
   * The feature id for the '<em><b>Dsl Display Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_YEAR__DSL_DISPLAY_YEAR = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Gen Year</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_YEAR_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.MCDImpl <em>MCD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.MCDImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getMCD()
   * @generated
   */
  int MCD = 41;

  /**
   * The feature id for the '<em><b>Dsl MCD value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCD__DSL_MCD_VALUE = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MCD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCD_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.MOWImpl <em>MOW</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.MOWImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getMOW()
   * @generated
   */
  int MOW = 42;

  /**
   * The feature id for the '<em><b>Dsl Display Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOW__DSL_DISPLAY_MODE = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MOW</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOW_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.NOPImpl <em>NOP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.NOPImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getNOP()
   * @generated
   */
  int NOP = 43;

  /**
   * The feature id for the '<em><b>Dsl Display Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOP__DSL_DISPLAY_MODE = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>NOP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOP_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DOMImpl <em>DOM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DOMImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDOM()
   * @generated
   */
  int DOM = 44;

  /**
   * The feature id for the '<em><b>Dsl Display Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM__DSL_DISPLAY_MODE = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DOM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DOPImpl <em>DOP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DOPImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDOP()
   * @generated
   */
  int DOP = 45;

  /**
   * The feature id for the '<em><b>Dsl Display Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOP__DSL_DISPLAY_MODE = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DOP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOP_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DOWNImpl <em>DOWN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DOWNImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDOWN()
   * @generated
   */
  int DOWN = 46;

  /**
   * The feature id for the '<em><b>Dsl Display Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWN__DSL_DISPLAY_MODE = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DOWN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWN_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DOWTImpl <em>DOWT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DOWTImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDOWT()
   * @generated
   */
  int DOWT = 47;

  /**
   * The feature id for the '<em><b>Dsl Display Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWT__DSL_DISPLAY_MODE = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DOWT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWT_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.EOWImpl <em>EOW</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.EOWImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getEOW()
   * @generated
   */
  int EOW = 48;

  /**
   * The feature id for the '<em><b>Dsl Display Eothinon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOW__DSL_DISPLAY_EOTHINON = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>EOW</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOW_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.SAECImpl <em>SAEC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.SAECImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSAEC()
   * @generated
   */
  int SAEC = 49;

  /**
   * The feature id for the '<em><b>Dsl Display Sunday After Elevation Cross</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAEC__DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SAEC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAEC_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.SOLImpl <em>SOL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.SOLImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSOL()
   * @generated
   */
  int SOL = 50;

  /**
   * The feature id for the '<em><b>Dsl Display Start Lukan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOL__DSL_DISPLAY_START_LUKAN = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SOL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOL_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DOLImpl <em>DOL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DOLImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDOL()
   * @generated
   */
  int DOL = 51;

  /**
   * The feature id for the '<em><b>Dsl Display Day Lukan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOL__DSL_DISPLAY_DAY_LUKAN = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DOL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOL_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WOLCImpl <em>WOLC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WOLCImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWOLC()
   * @generated
   */
  int WOLC = 52;

  /**
   * The feature id for the '<em><b>Dsl Display Day Lukan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WOLC__DSL_DISPLAY_DAY_LUKAN = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>WOLC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WOLC_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WDOLCImpl <em>WDOLC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WDOLCImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWDOLC()
   * @generated
   */
  int WDOLC = 53;

  /**
   * The feature id for the '<em><b>Dsl Display Day Lukan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WDOLC__DSL_DISPLAY_DAY_LUKAN = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>WDOLC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WDOLC_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.SBTImpl <em>SBT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.SBTImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSBT()
   * @generated
   */
  int SBT = 54;

  /**
   * The feature id for the '<em><b>Dsl Display Sundays Before Triodion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBT__DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION = LDP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SBT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBT_FEATURE_COUNT = LDP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.TemplateFragmentImpl <em>Template Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.TemplateFragmentImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getTemplateFragment()
   * @generated
   */
  int TEMPLATE_FRAGMENT = 55;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FRAGMENT__NAME = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Template Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FRAGMENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.PrefaceFragmentImpl <em>Preface Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.PrefaceFragmentImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPrefaceFragment()
   * @generated
   */
  int PREFACE_FRAGMENT = 56;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFACE_FRAGMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Preface Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFACE_FRAGMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.SectionFragmentImpl <em>Section Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.SectionFragmentImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSectionFragment()
   * @generated
   */
  int SECTION_FRAGMENT = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FRAGMENT__NAME = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Section Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FRAGMENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.BreakImpl <em>Break</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.BreakImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getBreak()
   * @generated
   */
  int BREAK = 58;

  /**
   * The feature id for the '<em><b>Dsl break type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK__DSL_BREAK_TYPE = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Break</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.PageNumberImpl <em>Page Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.PageNumberImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPageNumber()
   * @generated
   */
  int PAGE_NUMBER = 59;

  /**
   * The feature id for the '<em><b>Dsl Page Number value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_NUMBER__DSL_PAGE_NUMBER_VALUE = HEAD_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Page Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_NUMBER_FEATURE_COUNT = HEAD_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.PassThroughHtmlImpl <em>Pass Through Html</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.PassThroughHtmlImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPassThroughHtml()
   * @generated
   */
  int PASS_THROUGH_HTML = 60;

  /**
   * The feature id for the '<em><b>Dsl Passthrough html text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASS_THROUGH_HTML__DSL_PASSTHROUGH_HTML_TEXT = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pass Through Html</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASS_THROUGH_HTML_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.PassThroughPdfImpl <em>Pass Through Pdf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.PassThroughPdfImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPassThroughPdf()
   * @generated
   */
  int PASS_THROUGH_PDF = 61;

  /**
   * The feature id for the '<em><b>Dsl Passthrough pdf text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASS_THROUGH_PDF__DSL_PASSTHROUGH_PDF_TEXT = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pass Through Pdf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASS_THROUGH_PDF_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.TitleImpl <em>Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.TitleImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getTitle()
   * @generated
   */
  int TITLE = 62;

  /**
   * The feature id for the '<em><b>Dsl Title Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__DSL_TITLE_ROLE = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.SubTitleImpl <em>Sub Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.SubTitleImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSubTitle()
   * @generated
   */
  int SUB_TITLE = 63;

  /**
   * The feature id for the '<em><b>Dsl Sub Title Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_TITLE__DSL_SUB_TITLE_ROLE = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_TITLE__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_TITLE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.ParagraphImpl <em>Paragraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.ParagraphImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getParagraph()
   * @generated
   */
  int PARAGRAPH = 64;

  /**
   * The feature id for the '<em><b>Dsl Para Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH__DSL_PARA_ROLE = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Paragraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.BlockImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 65;

  /**
   * The feature id for the '<em><b>Dsl Block Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__DSL_BLOCK_ROLE = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.HymnImpl <em>Hymn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.HymnImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHymn()
   * @generated
   */
  int HYMN = 66;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYMN__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hymn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYMN_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.MediaImpl <em>Media</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.MediaImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getMedia()
   * @generated
   */
  int MEDIA = 67;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Media</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.VerseImpl <em>Verse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.VerseImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getVerse()
   * @generated
   */
  int VERSE = 68;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSE__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Verse</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.ActorImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getActor()
   * @generated
   */
  int ACTOR = 69;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.RubricImpl <em>Rubric</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.RubricImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getRubric()
   * @generated
   */
  int RUBRIC = 70;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUBRIC__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rubric</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUBRIC_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DialogImpl <em>Dialog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DialogImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDialog()
   * @generated
   */
  int DIALOG = 71;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dialog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.ReadingImpl <em>Reading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.ReadingImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getReading()
   * @generated
   */
  int READING = 72;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READING__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reading</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READING_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.Heading1Impl <em>Heading1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.Heading1Impl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeading1()
   * @generated
   */
  int HEADING1 = 73;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING1__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Heading1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING1_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.Heading2Impl <em>Heading2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.Heading2Impl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeading2()
   * @generated
   */
  int HEADING2 = 74;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING2__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Heading2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING2_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.Heading3Impl <em>Heading3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.Heading3Impl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeading3()
   * @generated
   */
  int HEADING3 = 75;

  /**
   * The feature id for the '<em><b>Dsl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING3__DSL_ELEMENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Heading3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING3_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.AidImpl <em>Aid</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.AidImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAid()
   * @generated
   */
  int AID = 77;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AID__NAME = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Aid</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AID_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.VersionImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 78;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__NAME = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.LitBookImpl <em>Lit Book</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.LitBookImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getLitBook()
   * @generated
   */
  int LIT_BOOK = 79;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIT_BOOK__NAME = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lit Book</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIT_BOOK_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.SetLocaleImpl <em>Set Locale</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.SetLocaleImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSetLocale()
   * @generated
   */
  int SET_LOCALE = 80;

  /**
   * The feature id for the '<em><b>Dsl Set Locale V1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_LOCALE__DSL_SET_LOCALE_V1 = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Set Locale V2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_LOCALE__DSL_SET_LOCALE_V2 = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Set Locale</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_LOCALE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.RestoreLocaleImpl <em>Restore Locale</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.RestoreLocaleImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getRestoreLocale()
   * @generated
   */
  int RESTORE_LOCALE = 81;

  /**
   * The feature id for the '<em><b>Dsl Restore Locale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTORE_LOCALE__DSL_RESTORE_LOCALE = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Restore Locale</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTORE_LOCALE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenDateImpl <em>When Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenDateImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenDate()
   * @generated
   */
  int WHEN_DATE = 82;

  /**
   * The feature id for the '<em><b>Dsl When Date Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_DATE__DSL_WHEN_DATE_CASES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl When Date Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_DATE__DSL_WHEN_DATE_OTHER = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_DATE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenDateCaseImpl <em>When Date Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenDateCaseImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenDateCase()
   * @generated
   */
  int WHEN_DATE_CASE = 83;

  /**
   * The feature id for the '<em><b>Dsl When Date Case Month</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_MONTH = 0;

  /**
   * The feature id for the '<em><b>Dsl When Date Case Days</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_DAYS = 1;

  /**
   * The feature id for the '<em><b>Dsl When Date Case True actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_TRUE_ACTIONS = 2;

  /**
   * The number of structural features of the '<em>When Date Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_DATE_CASE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.AbstractDateCaseImpl <em>Abstract Date Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.AbstractDateCaseImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAbstractDateCase()
   * @generated
   */
  int ABSTRACT_DATE_CASE = 84;

  /**
   * The number of structural features of the '<em>Abstract Date Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DATE_CASE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DateRangeImpl <em>Date Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DateRangeImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDateRange()
   * @generated
   */
  int DATE_RANGE = 85;

  /**
   * The feature id for the '<em><b>Dsl Date Range from</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_RANGE__DSL_DATE_RANGE_FROM = ABSTRACT_DATE_CASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Date Range To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_RANGE__DSL_DATE_RANGE_TO = ABSTRACT_DATE_CASE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Date Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_RANGE_FEATURE_COUNT = ABSTRACT_DATE_CASE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DateSetImpl <em>Date Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DateSetImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDateSet()
   * @generated
   */
  int DATE_SET = 86;

  /**
   * The feature id for the '<em><b>Dsl Date Set Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_SET__DSL_DATE_SET_VALUES = ABSTRACT_DATE_CASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Date Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_SET_FEATURE_COUNT = ABSTRACT_DATE_CASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenDayNameImpl <em>When Day Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenDayNameImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenDayName()
   * @generated
   */
  int WHEN_DAY_NAME = 87;

  /**
   * The feature id for the '<em><b>Dsl When Day Name Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_CASES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl When Day Name Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_OTHER = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Day Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_DAY_NAME_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenDayNameCaseImpl <em>When Day Name Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenDayNameCaseImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenDayNameCase()
   * @generated
   */
  int WHEN_DAY_NAME_CASE = 88;

  /**
   * The feature id for the '<em><b>Dsl When Day Name Case Days</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_DAYS = 0;

  /**
   * The feature id for the '<em><b>Dsl When Day Name Case True actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_TRUE_ACTIONS = 1;

  /**
   * The number of structural features of the '<em>When Day Name Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_DAY_NAME_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.AbstractDayNameCaseImpl <em>Abstract Day Name Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.AbstractDayNameCaseImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAbstractDayNameCase()
   * @generated
   */
  int ABSTRACT_DAY_NAME_CASE = 89;

  /**
   * The number of structural features of the '<em>Abstract Day Name Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DAY_NAME_CASE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DayNameRangeImpl <em>Day Name Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DayNameRangeImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDayNameRange()
   * @generated
   */
  int DAY_NAME_RANGE = 90;

  /**
   * The feature id for the '<em><b>Dsl Day Name Range from</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_FROM = ABSTRACT_DAY_NAME_CASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Day Name Range To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_TO = ABSTRACT_DAY_NAME_CASE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Day Name Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY_NAME_RANGE_FEATURE_COUNT = ABSTRACT_DAY_NAME_CASE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DayNameSetImpl <em>Day Name Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DayNameSetImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDayNameSet()
   * @generated
   */
  int DAY_NAME_SET = 91;

  /**
   * The feature id for the '<em><b>Dsl Day Name Set Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY_NAME_SET__DSL_DAY_NAME_SET_VALUES = ABSTRACT_DAY_NAME_CASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Day Name Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY_NAME_SET_FEATURE_COUNT = ABSTRACT_DAY_NAME_CASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenPentecostarionDayImpl <em>When Pentecostarion Day</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenPentecostarionDayImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenPentecostarionDay()
   * @generated
   */
  int WHEN_PENTECOSTARION_DAY = 92;

  /**
   * The feature id for the '<em><b>Dsl When Pentecostarion Day Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_CASES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl When Pentecostarion Day Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_OTHER = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Pentecostarion Day</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_PENTECOSTARION_DAY_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenTriodionDayImpl <em>When Triodion Day</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenTriodionDayImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenTriodionDay()
   * @generated
   */
  int WHEN_TRIODION_DAY = 93;

  /**
   * The feature id for the '<em><b>Dsl When Triodion Day Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_TRIODION_DAY__DSL_WHEN_TRIODION_DAY_CASES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl When Triodion Day Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_TRIODION_DAY__DSL_WHEN_TRIODION_DAY_OTHER = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Triodion Day</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_TRIODION_DAY_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenMovableCycleDayImpl <em>When Movable Cycle Day</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenMovableCycleDayImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenMovableCycleDay()
   * @generated
   */
  int WHEN_MOVABLE_CYCLE_DAY = 94;

  /**
   * The feature id for the '<em><b>Dsl When Movable Cycle Day Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_MOVABLE_CYCLE_DAY__DSL_WHEN_MOVABLE_CYCLE_DAY_CASES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl When Movable Cycle Day Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_MOVABLE_CYCLE_DAY__DSL_WHEN_MOVABLE_CYCLE_DAY_OTHER = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Movable Cycle Day</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_MOVABLE_CYCLE_DAY_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenSundayAfterElevationOfCrossDayImpl <em>When Sunday After Elevation Of Cross Day</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenSundayAfterElevationOfCrossDayImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenSundayAfterElevationOfCrossDay()
   * @generated
   */
  int WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY = 95;

  /**
   * The feature id for the '<em><b>Dsl When Sunday After Elevation Of Cross Day Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_CASES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl When Sunday After Elevation Of Cross Day Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_OTHER = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Sunday After Elevation Of Cross Day</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenLukanCycleDayImpl <em>When Lukan Cycle Day</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenLukanCycleDayImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenLukanCycleDay()
   * @generated
   */
  int WHEN_LUKAN_CYCLE_DAY = 96;

  /**
   * The feature id for the '<em><b>Dsl When Lukan Cycle Day Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_CASES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl When Lukan Cycle Day Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_OTHER = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Lukan Cycle Day</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_LUKAN_CYCLE_DAY_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenPaschaImpl <em>When Pascha</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenPaschaImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenPascha()
   * @generated
   */
  int WHEN_PASCHA = 97;

  /**
   * The feature id for the '<em><b>Dsl When Pascha true actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_PASCHA__DSL_WHEN_PASCHA_TRUE_ACTIONS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl When Pascha Other actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_PASCHA__DSL_WHEN_PASCHA_OTHER_ACTIONS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Pascha</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_PASCHA_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenOtherImpl <em>When Other</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenOtherImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenOther()
   * @generated
   */
  int WHEN_OTHER = 98;

  /**
   * The feature id for the '<em><b>Dsl When Case Other actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_OTHER__DSL_WHEN_CASE_OTHER_ACTIONS = 0;

  /**
   * The number of structural features of the '<em>When Other</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_OTHER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenPeriodCaseImpl <em>When Period Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenPeriodCaseImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenPeriodCase()
   * @generated
   */
  int WHEN_PERIOD_CASE = 99;

  /**
   * The feature id for the '<em><b>Dsl When Period Case Days</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_DAYS = 0;

  /**
   * The feature id for the '<em><b>Dsl When Period Case True actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_TRUE_ACTIONS = 1;

  /**
   * The number of structural features of the '<em>When Period Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_PERIOD_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.AbstractDayCaseImpl <em>Abstract Day Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.AbstractDayCaseImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAbstractDayCase()
   * @generated
   */
  int ABSTRACT_DAY_CASE = 100;

  /**
   * The number of structural features of the '<em>Abstract Day Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DAY_CASE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DayRangeImpl <em>Day Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DayRangeImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDayRange()
   * @generated
   */
  int DAY_RANGE = 101;

  /**
   * The feature id for the '<em><b>Dsl Day Range from</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY_RANGE__DSL_DAY_RANGE_FROM = ABSTRACT_DAY_CASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Range To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY_RANGE__DSL_RANGE_TO = ABSTRACT_DAY_CASE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Day Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY_RANGE_FEATURE_COUNT = ABSTRACT_DAY_CASE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.DaySetImpl <em>Day Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.DaySetImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDaySet()
   * @generated
   */
  int DAY_SET = 102;

  /**
   * The feature id for the '<em><b>Dsl Set Value Days</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY_SET__DSL_SET_VALUE_DAYS = ABSTRACT_DAY_CASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Day Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY_SET_FEATURE_COUNT = ABSTRACT_DAY_CASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenModeOfWeekImpl <em>When Mode Of Week</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenModeOfWeekImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenModeOfWeek()
   * @generated
   */
  int WHEN_MODE_OF_WEEK = 103;

  /**
   * The feature id for the '<em><b>Dsl When Mode Of Week Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_CASES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl When Mode Of Week Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_OTHER = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Mode Of Week</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_MODE_OF_WEEK_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenModeOfWeekCaseImpl <em>When Mode Of Week Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenModeOfWeekCaseImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenModeOfWeekCase()
   * @generated
   */
  int WHEN_MODE_OF_WEEK_CASE = 104;

  /**
   * The feature id for the '<em><b>Dsl When Mode Of Week Case Days</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_MODE_OF_WEEK_CASE__DSL_WHEN_MODE_OF_WEEK_CASE_DAYS = 0;

  /**
   * The feature id for the '<em><b>Dsl When Mode Of Week Case True actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_MODE_OF_WEEK_CASE__DSL_WHEN_MODE_OF_WEEK_CASE_TRUE_ACTIONS = 1;

  /**
   * The number of structural features of the '<em>When Mode Of Week Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_MODE_OF_WEEK_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.ModeOfWeekSetImpl <em>Mode Of Week Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.ModeOfWeekSetImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getModeOfWeekSet()
   * @generated
   */
  int MODE_OF_WEEK_SET = 105;

  /**
   * The feature id for the '<em><b>Dsl Mode Of Week Set MO Ws</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_OF_WEEK_SET__DSL_MODE_OF_WEEK_SET_MO_WS = 0;

  /**
   * The number of structural features of the '<em>Mode Of Week Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_OF_WEEK_SET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenSundaysBeforeTriodionImpl <em>When Sundays Before Triodion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenSundaysBeforeTriodionImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenSundaysBeforeTriodion()
   * @generated
   */
  int WHEN_SUNDAYS_BEFORE_TRIODION = 106;

  /**
   * The feature id for the '<em><b>Dsl When Sundays Before Triodion Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_SUNDAYS_BEFORE_TRIODION__DSL_WHEN_SUNDAYS_BEFORE_TRIODION_CASES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl Sundays Before Triodion Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_SUNDAYS_BEFORE_TRIODION__DSL_SUNDAYS_BEFORE_TRIODION_OTHER = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Sundays Before Triodion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_SUNDAYS_BEFORE_TRIODION_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.SundaysBeforeTriodionCaseImpl <em>Sundays Before Triodion Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.SundaysBeforeTriodionCaseImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSundaysBeforeTriodionCase()
   * @generated
   */
  int SUNDAYS_BEFORE_TRIODION_CASE = 107;

  /**
   * The feature id for the '<em><b>Dsl Sundays Before Triodion Case Days</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_DAYS = 0;

  /**
   * The feature id for the '<em><b>Dsl Sundays Before Triodion Case True actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_TRUE_ACTIONS = 1;

  /**
   * The number of structural features of the '<em>Sundays Before Triodion Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUNDAYS_BEFORE_TRIODION_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenExistsImpl <em>When Exists</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenExistsImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenExists()
   * @generated
   */
  int WHEN_EXISTS = 108;

  /**
   * The feature id for the '<em><b>Dsl When Exists Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_EXISTS__DSL_WHEN_EXISTS_CASES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dsl When Exists Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_EXISTS__DSL_WHEN_EXISTS_OTHER = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Exists</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_EXISTS_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenExistsCaseImpl <em>When Exists Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.impl.WhenExistsCaseImpl
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenExistsCase()
   * @generated
   */
  int WHEN_EXISTS_CASE = 109;

  /**
   * The feature id for the '<em><b>Dsl When Exists Case Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_REF = 0;

  /**
   * The feature id for the '<em><b>Dsl When Exists Case True actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_TRUE_ACTIONS = 1;

  /**
   * The number of structural features of the '<em>When Exists Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_EXISTS_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.VersionSwitchType <em>Version Switch Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.VersionSwitchType
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getVersionSwitchType()
   * @generated
   */
  int VERSION_SWITCH_TYPE = 110;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.Language <em>Language</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.Language
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getLanguage()
   * @generated
   */
  int LANGUAGE = 111;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.BreakType <em>Break Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.BreakType
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getBreakType()
   * @generated
   */
  int BREAK_TYPE = 112;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.TemplateStatuses <em>Template Statuses</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.TemplateStatuses
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getTemplateStatuses()
   * @generated
   */
  int TEMPLATE_STATUSES = 113;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.Null <em>Null</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.Null
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getNull()
   * @generated
   */
  int NULL = 114;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.ModeTypes <em>Mode Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.ModeTypes
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getModeTypes()
   * @generated
   */
  int MODE_TYPES = 115;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.DowTypes <em>Dow Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.DowTypes
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDowTypes()
   * @generated
   */
  int DOW_TYPES = 116;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.BookTypes <em>Book Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.BookTypes
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getBookTypes()
   * @generated
   */
  int BOOK_TYPES = 117;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.Seasons <em>Seasons</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.Seasons
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSeasons()
   * @generated
   */
  int SEASONS = 118;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.DayOfMonthTypes <em>Day Of Month Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.DayOfMonthTypes
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDayOfMonthTypes()
   * @generated
   */
  int DAY_OF_MONTH_TYPES = 119;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.PeriodType <em>Period Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.PeriodType
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPeriodType()
   * @generated
   */
  int PERIOD_TYPE = 120;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.DayOfWeek <em>Day Of Week</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.DayOfWeek
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDayOfWeek()
   * @generated
   */
  int DAY_OF_WEEK = 121;

  /**
   * The meta object id for the '{@link net.ages.workbench.templates.dsl.atem.MonthName <em>Month Name</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.templates.dsl.atem.MonthName
   * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getMonthName()
   * @generated
   */
  int MONTH_NAME = 122;


  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.AtemModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see net.ages.workbench.templates.dsl.atem.AtemModel
   * @generated
   */
  EClass getAtemModel();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.AtemModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.ages.workbench.templates.dsl.atem.AtemModel#getName()
   * @see #getAtemModel()
   * @generated
   */
  EAttribute getAtemModel_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_Status <em>Dsl Template Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl Template Status</em>'.
   * @see net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_Status()
   * @see #getAtemModel()
   * @generated
   */
  EReference getAtemModel_Dsl_Template_Status();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.AtemModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see net.ages.workbench.templates.dsl.atem.AtemModel#getImports()
   * @see #getAtemModel()
   * @generated
   */
  EReference getAtemModel_Imports();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_Driver <em>Dsl Template Driver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl Template Driver</em>'.
   * @see net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_Driver()
   * @see #getAtemModel()
   * @generated
   */
  EReference getAtemModel_Dsl_Template_Driver();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_head <em>Dsl Template head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl Template head</em>'.
   * @see net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_head()
   * @see #getAtemModel()
   * @generated
   */
  EReference getAtemModel_Dsl_Template_head();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_preface <em>Dsl Template preface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl Template preface</em>'.
   * @see net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_preface()
   * @see #getAtemModel()
   * @generated
   */
  EReference getAtemModel_Dsl_Template_preface();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_components <em>Dsl Template components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Template components</em>'.
   * @see net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_components()
   * @see #getAtemModel()
   * @generated
   */
  EReference getAtemModel_Dsl_Template_components();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Head <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Head</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Head
   * @generated
   */
  EClass getHead();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Head#getDsl_Head_components <em>Dsl Head components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Head components</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Head#getDsl_Head_components()
   * @see #getHead()
   * @generated
   */
  EReference getHead_Dsl_Head_components();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.HeadComponent <em>Head Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Head Component</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeadComponent
   * @generated
   */
  EClass getHeadComponent();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Driver <em>Driver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Driver</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Driver
   * @generated
   */
  EClass getDriver();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Driver#getDsl_Driver_RegEx <em>Dsl Driver Reg Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Driver Reg Ex</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Driver#getDsl_Driver_RegEx()
   * @see #getDriver()
   * @generated
   */
  EAttribute getDriver_Dsl_Driver_RegEx();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Driver#getDsl_Driver_Status <em>Dsl Driver Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Driver Status</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Driver#getDsl_Driver_Status()
   * @see #getDriver()
   * @generated
   */
  EAttribute getDriver_Dsl_Driver_Status();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.TemplateTitle <em>Template Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Title</em>'.
   * @see net.ages.workbench.templates.dsl.atem.TemplateTitle
   * @generated
   */
  EClass getTemplateTitle();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.TemplateTitle#getDsl_TemplateTitle_Elements <em>Dsl Template Title Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Template Title Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.TemplateTitle#getDsl_TemplateTitle_Elements()
   * @see #getTemplateTitle()
   * @generated
   */
  EReference getTemplateTitle_Dsl_TemplateTitle_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.PageKeepWithNext <em>Page Keep With Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Keep With Next</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PageKeepWithNext
   * @generated
   */
  EClass getPageKeepWithNext();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.PageKeepWithNext#getDsl_PageKeepWithNext_value <em>Dsl Page Keep With Next value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Page Keep With Next value</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PageKeepWithNext#getDsl_PageKeepWithNext_value()
   * @see #getPageKeepWithNext()
   * @generated
   */
  EAttribute getPageKeepWithNext_Dsl_PageKeepWithNext_value();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.PageHeaderEven <em>Page Header Even</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Header Even</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PageHeaderEven
   * @generated
   */
  EClass getPageHeaderEven();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.PageHeaderEven#getDsl_PageHeader_columns <em>Dsl Page Header columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Page Header columns</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PageHeaderEven#getDsl_PageHeader_columns()
   * @see #getPageHeaderEven()
   * @generated
   */
  EReference getPageHeaderEven_Dsl_PageHeader_columns();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.PageHeaderOdd <em>Page Header Odd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Header Odd</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PageHeaderOdd
   * @generated
   */
  EClass getPageHeaderOdd();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.PageHeaderOdd#getDsl_PageHeader_columns <em>Dsl Page Header columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Page Header columns</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PageHeaderOdd#getDsl_PageHeader_columns()
   * @see #getPageHeaderOdd()
   * @generated
   */
  EReference getPageHeaderOdd_Dsl_PageHeader_columns();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.PageFooterEven <em>Page Footer Even</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Footer Even</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PageFooterEven
   * @generated
   */
  EClass getPageFooterEven();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.PageFooterEven#getDsl_PageHeader_columns <em>Dsl Page Header columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Page Header columns</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PageFooterEven#getDsl_PageHeader_columns()
   * @see #getPageFooterEven()
   * @generated
   */
  EReference getPageFooterEven_Dsl_PageHeader_columns();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.PageFooterOdd <em>Page Footer Odd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Footer Odd</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PageFooterOdd
   * @generated
   */
  EClass getPageFooterOdd();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.PageFooterOdd#getDsl_PageHeader_columns <em>Dsl Page Header columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Page Header columns</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PageFooterOdd#getDsl_PageHeader_columns()
   * @see #getPageFooterOdd()
   * @generated
   */
  EReference getPageFooterOdd_Dsl_PageHeader_columns();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterColumn <em>Header Footer Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Footer Column</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterColumn
   * @generated
   */
  EClass getHeaderFooterColumn();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterColumn#getDsl_HeaderFooterColumn_fragments <em>Dsl Header Footer Column fragments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Header Footer Column fragments</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterColumn#getDsl_HeaderFooterColumn_fragments()
   * @see #getHeaderFooterColumn()
   * @generated
   */
  EReference getHeaderFooterColumn_Dsl_HeaderFooterColumn_fragments();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterColumnLeft <em>Header Footer Column Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Footer Column Left</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterColumnLeft
   * @generated
   */
  EClass getHeaderFooterColumnLeft();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterColumnCenter <em>Header Footer Column Center</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Footer Column Center</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterColumnCenter
   * @generated
   */
  EClass getHeaderFooterColumnCenter();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterColumnRight <em>Header Footer Column Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Footer Column Right</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterColumnRight
   * @generated
   */
  EClass getHeaderFooterColumnRight();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterFragment <em>Header Footer Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Footer Fragment</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterFragment
   * @generated
   */
  EClass getHeaderFooterFragment();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterText <em>Header Footer Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Footer Text</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterText
   * @generated
   */
  EClass getHeaderFooterText();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterText#getDsl_HeaderFooterText <em>Dsl Header Footer Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Header Footer Text</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterText#getDsl_HeaderFooterText()
   * @see #getHeaderFooterText()
   * @generated
   */
  EAttribute getHeaderFooterText_Dsl_HeaderFooterText();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterDate <em>Header Footer Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Footer Date</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterDate
   * @generated
   */
  EClass getHeaderFooterDate();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterDate#isDsl_HeaderFooterDate <em>Dsl Header Footer Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Header Footer Date</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterDate#isDsl_HeaderFooterDate()
   * @see #getHeaderFooterDate()
   * @generated
   */
  EAttribute getHeaderFooterDate_Dsl_HeaderFooterDate();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterDate#getDsl_HeaderFooterDate_Language <em>Dsl Header Footer Date Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Header Footer Date Language</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterDate#getDsl_HeaderFooterDate_Language()
   * @see #getHeaderFooterDate()
   * @generated
   */
  EAttribute getHeaderFooterDate_Dsl_HeaderFooterDate_Language();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterPageNumber <em>Header Footer Page Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Footer Page Number</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterPageNumber
   * @generated
   */
  EClass getHeaderFooterPageNumber();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterPageNumber#isDsl_HeaderFooterPageNumber <em>Dsl Header Footer Page Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Header Footer Page Number</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterPageNumber#isDsl_HeaderFooterPageNumber()
   * @see #getHeaderFooterPageNumber()
   * @generated
   */
  EAttribute getHeaderFooterPageNumber_Dsl_HeaderFooterPageNumber();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterLookup <em>Header Footer Lookup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Footer Lookup</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterLookup
   * @generated
   */
  EClass getHeaderFooterLookup();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterLookup#getDsl_HeaderFooterLookup_Elements <em>Dsl Header Footer Lookup Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Header Footer Lookup Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterLookup#getDsl_HeaderFooterLookup_Elements()
   * @see #getHeaderFooterLookup()
   * @generated
   */
  EReference getHeaderFooterLookup_Dsl_HeaderFooterLookup_Elements();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterLookup#getDsl_HeaderFooterLookup_Language <em>Dsl Header Footer Lookup Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Header Footer Lookup Language</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterLookup#getDsl_HeaderFooterLookup_Language()
   * @see #getHeaderFooterLookup()
   * @generated
   */
  EAttribute getHeaderFooterLookup_Dsl_HeaderFooterLookup_Language();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterTitle <em>Header Footer Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Footer Title</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterTitle
   * @generated
   */
  EClass getHeaderFooterTitle();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterTitle#isDsl_HeaderFooterTitle <em>Dsl Header Footer Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Header Footer Title</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterTitle#isDsl_HeaderFooterTitle()
   * @see #getHeaderFooterTitle()
   * @generated
   */
  EAttribute getHeaderFooterTitle_Dsl_HeaderFooterTitle();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterCommemoration <em>Header Footer Commemoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Footer Commemoration</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterCommemoration
   * @generated
   */
  EClass getHeaderFooterCommemoration();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterCommemoration#isDsl_HeaderFooterCommemoration <em>Dsl Header Footer Commemoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Header Footer Commemoration</em>'.
   * @see net.ages.workbench.templates.dsl.atem.HeaderFooterCommemoration#isDsl_HeaderFooterCommemoration()
   * @see #getHeaderFooterCommemoration()
   * @generated
   */
  EAttribute getHeaderFooterCommemoration_Dsl_HeaderFooterCommemoration();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Commemoration <em>Commemoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commemoration</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Commemoration
   * @generated
   */
  EClass getCommemoration();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Commemoration#getDsl_Commemoration_Elements <em>Dsl Commemoration Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Commemoration Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Commemoration#getDsl_Commemoration_Elements()
   * @see #getCommemoration()
   * @generated
   */
  EReference getCommemoration_Dsl_Commemoration_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.TemplateStatus <em>Template Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Status</em>'.
   * @see net.ages.workbench.templates.dsl.atem.TemplateStatus
   * @generated
   */
  EClass getTemplateStatus();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.TemplateStatus#getDsl_TemplateStatus <em>Dsl Template Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Template Status</em>'.
   * @see net.ages.workbench.templates.dsl.atem.TemplateStatus#getDsl_TemplateStatus()
   * @see #getTemplateStatus()
   * @generated
   */
  EAttribute getTemplateStatus_Dsl_TemplateStatus();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.AbstractComponent <em>Abstract Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Component</em>'.
   * @see net.ages.workbench.templates.dsl.atem.AbstractComponent
   * @generated
   */
  EClass getAbstractComponent();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.VersionSwitch <em>Version Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version Switch</em>'.
   * @see net.ages.workbench.templates.dsl.atem.VersionSwitch
   * @generated
   */
  EClass getVersionSwitch();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.VersionSwitch#getDsl_VersionSwitch_flag <em>Dsl Version Switch flag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Version Switch flag</em>'.
   * @see net.ages.workbench.templates.dsl.atem.VersionSwitch#getDsl_VersionSwitch_flag()
   * @see #getVersionSwitch()
   * @generated
   */
  EAttribute getVersionSwitch_Dsl_VersionSwitch_flag();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.ResourceText <em>Resource Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Text</em>'.
   * @see net.ages.workbench.templates.dsl.atem.ResourceText
   * @generated
   */
  EClass getResourceText();

  /**
   * Returns the meta object for the reference '{@link net.ages.workbench.templates.dsl.atem.ResourceText#getDsl_ResourceTextRef <em>Dsl Resource Text Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl Resource Text Ref</em>'.
   * @see net.ages.workbench.templates.dsl.atem.ResourceText#getDsl_ResourceTextRef()
   * @see #getResourceText()
   * @generated
   */
  EReference getResourceText_Dsl_ResourceTextRef();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.ResourceText#isDsl_ResourceText_Media_Off <em>Dsl Resource Text Media Off</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Resource Text Media Off</em>'.
   * @see net.ages.workbench.templates.dsl.atem.ResourceText#isDsl_ResourceText_Media_Off()
   * @see #getResourceText()
   * @generated
   */
  EAttribute getResourceText_Dsl_ResourceText_Media_Off();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Lookup <em>Lookup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lookup</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Lookup
   * @generated
   */
  EClass getLookup();

  /**
   * Returns the meta object for the reference '{@link net.ages.workbench.templates.dsl.atem.Lookup#getDsl_ResourceTextRef <em>Dsl Resource Text Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl Resource Text Ref</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Lookup#getDsl_ResourceTextRef()
   * @see #getLookup()
   * @generated
   */
  EReference getLookup_Dsl_ResourceTextRef();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Media_Off <em>Dsl Lookup Media Off</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Lookup Media Off</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Media_Off()
   * @see #getLookup()
   * @generated
   */
  EAttribute getLookup_Dsl_Lookup_Media_Off();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Override_Mode_Set <em>Dsl Lookup Override Mode Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Lookup Override Mode Set</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Override_Mode_Set()
   * @see #getLookup()
   * @generated
   */
  EAttribute getLookup_Dsl_Lookup_Override_Mode_Set();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Lookup#getDsl_Lookup_OverrideMode <em>Dsl Lookup Override Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Lookup Override Mode</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Lookup#getDsl_Lookup_OverrideMode()
   * @see #getLookup()
   * @generated
   */
  EAttribute getLookup_Dsl_Lookup_OverrideMode();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Override__Day_Set <em>Dsl Lookup Override Day Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Lookup Override Day Set</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Override__Day_Set()
   * @see #getLookup()
   * @generated
   */
  EAttribute getLookup_Dsl_Lookup_Override__Day_Set();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Lookup#getDsl_Lookup_OverrideDay <em>Dsl Lookup Override Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Lookup Override Day</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Lookup#getDsl_Lookup_OverrideDay()
   * @see #getLookup()
   * @generated
   */
  EAttribute getLookup_Dsl_Lookup_OverrideDay();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.LDP <em>LDP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LDP</em>'.
   * @see net.ages.workbench.templates.dsl.atem.LDP
   * @generated
   */
  EClass getLDP();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.LDP#getDsl_LDP <em>Dsl LDP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl LDP</em>'.
   * @see net.ages.workbench.templates.dsl.atem.LDP#getDsl_LDP()
   * @see #getLDP()
   * @generated
   */
  EReference getLDP_Dsl_LDP();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.TaggedText <em>Tagged Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tagged Text</em>'.
   * @see net.ages.workbench.templates.dsl.atem.TaggedText
   * @generated
   */
  EClass getTaggedText();

  /**
   * Returns the meta object for the reference '{@link net.ages.workbench.templates.dsl.atem.TaggedText#getDsl_TaggedText_tag <em>Dsl Tagged Text tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl Tagged Text tag</em>'.
   * @see net.ages.workbench.templates.dsl.atem.TaggedText#getDsl_TaggedText_tag()
   * @see #getTaggedText()
   * @generated
   */
  EReference getTaggedText_Dsl_TaggedText_tag();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.TaggedText#getDsl_TaggedText <em>Dsl Tagged Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Tagged Text</em>'.
   * @see net.ages.workbench.templates.dsl.atem.TaggedText#getDsl_TaggedText()
   * @see #getTaggedText()
   * @generated
   */
  EReference getTaggedText_Dsl_TaggedText();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Info <em>Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Info</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Info
   * @generated
   */
  EClass getInfo();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Info#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Info#getName()
   * @see #getInfo()
   * @generated
   */
  EAttribute getInfo_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Info#getDsl_Info_Elements <em>Dsl Info Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Info Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Info#getDsl_Info_Elements()
   * @see #getInfo()
   * @generated
   */
  EReference getInfo_Dsl_Info_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.InfoElementType <em>Info Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Info Element Type</em>'.
   * @see net.ages.workbench.templates.dsl.atem.InfoElementType
   * @generated
   */
  EClass getInfoElementType();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Date
   * @generated
   */
  EClass getDate();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Date#getDsl_Date_month <em>Dsl Date month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Date month</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Date#getDsl_Date_month()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Dsl_Date_month();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Date#getDsl_Date_day <em>Dsl Date day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Date day</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Date#getDsl_Date_day()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Dsl_Date_day();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Date#getDsl_Date_year <em>Dsl Date year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Date year</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Date#getDsl_Date_year()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Dsl_Date_year();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Preface <em>Preface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preface</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Preface
   * @generated
   */
  EClass getPreface();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Preface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Preface#getName()
   * @see #getPreface()
   * @generated
   */
  EAttribute getPreface_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Preface#getDsl_Preface_Elements <em>Dsl Preface Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Preface Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Preface#getDsl_Preface_Elements()
   * @see #getPreface()
   * @generated
   */
  EReference getPreface_Dsl_Preface_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.PrefaceElementType <em>Preface Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preface Element Type</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PrefaceElementType
   * @generated
   */
  EClass getPrefaceElementType();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Section#getName()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Name();

  /**
   * Returns the meta object for the reference '{@link net.ages.workbench.templates.dsl.atem.Section#getDsl_Section_Role <em>Dsl Section Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl Section Role</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Section#getDsl_Section_Role()
   * @see #getSection()
   * @generated
   */
  EReference getSection_Dsl_Section_Role();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Section#getDsl_Section_Elements <em>Dsl Section Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Section Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Section#getDsl_Section_Elements()
   * @see #getSection()
   * @generated
   */
  EReference getSection_Dsl_Section_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.SectionElementType <em>Section Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section Element Type</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SectionElementType
   * @generated
   */
  EClass getSectionElementType();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.LdpType <em>Ldp Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ldp Type</em>'.
   * @see net.ages.workbench.templates.dsl.atem.LdpType
   * @generated
   */
  EClass getLdpType();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.All <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>All</em>'.
   * @see net.ages.workbench.templates.dsl.atem.All
   * @generated
   */
  EClass getAll();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.All#isDsl_Display_LiturgicalDayProperties <em>Dsl Display Liturgical Day Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Liturgical Day Properties</em>'.
   * @see net.ages.workbench.templates.dsl.atem.All#isDsl_Display_LiturgicalDayProperties()
   * @see #getAll()
   * @generated
   */
  EAttribute getAll_Dsl_Display_LiturgicalDayProperties();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.GenDate <em>Gen Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gen Date</em>'.
   * @see net.ages.workbench.templates.dsl.atem.GenDate
   * @generated
   */
  EClass getGenDate();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.GenDate#isDsl_Display_Date <em>Dsl Display Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Date</em>'.
   * @see net.ages.workbench.templates.dsl.atem.GenDate#isDsl_Display_Date()
   * @see #getGenDate()
   * @generated
   */
  EAttribute getGenDate_Dsl_Display_Date();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.GenYear <em>Gen Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gen Year</em>'.
   * @see net.ages.workbench.templates.dsl.atem.GenYear
   * @generated
   */
  EClass getGenYear();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.GenYear#isDsl_Display_Year <em>Dsl Display Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Year</em>'.
   * @see net.ages.workbench.templates.dsl.atem.GenYear#isDsl_Display_Year()
   * @see #getGenYear()
   * @generated
   */
  EAttribute getGenYear_Dsl_Display_Year();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.MCD <em>MCD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MCD</em>'.
   * @see net.ages.workbench.templates.dsl.atem.MCD
   * @generated
   */
  EClass getMCD();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.MCD#isDsl_MCD_value <em>Dsl MCD value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl MCD value</em>'.
   * @see net.ages.workbench.templates.dsl.atem.MCD#isDsl_MCD_value()
   * @see #getMCD()
   * @generated
   */
  EAttribute getMCD_Dsl_MCD_value();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.MOW <em>MOW</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MOW</em>'.
   * @see net.ages.workbench.templates.dsl.atem.MOW
   * @generated
   */
  EClass getMOW();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.MOW#isDsl_Display_Mode <em>Dsl Display Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Mode</em>'.
   * @see net.ages.workbench.templates.dsl.atem.MOW#isDsl_Display_Mode()
   * @see #getMOW()
   * @generated
   */
  EAttribute getMOW_Dsl_Display_Mode();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.NOP <em>NOP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NOP</em>'.
   * @see net.ages.workbench.templates.dsl.atem.NOP
   * @generated
   */
  EClass getNOP();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.NOP#isDsl_Display_Mode <em>Dsl Display Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Mode</em>'.
   * @see net.ages.workbench.templates.dsl.atem.NOP#isDsl_Display_Mode()
   * @see #getNOP()
   * @generated
   */
  EAttribute getNOP_Dsl_Display_Mode();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.DOM <em>DOM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DOM</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DOM
   * @generated
   */
  EClass getDOM();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.DOM#isDsl_Display_Mode <em>Dsl Display Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Mode</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DOM#isDsl_Display_Mode()
   * @see #getDOM()
   * @generated
   */
  EAttribute getDOM_Dsl_Display_Mode();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.DOP <em>DOP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DOP</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DOP
   * @generated
   */
  EClass getDOP();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.DOP#isDsl_Display_Mode <em>Dsl Display Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Mode</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DOP#isDsl_Display_Mode()
   * @see #getDOP()
   * @generated
   */
  EAttribute getDOP_Dsl_Display_Mode();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.DOWN <em>DOWN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DOWN</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DOWN
   * @generated
   */
  EClass getDOWN();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.DOWN#isDsl_Display_Mode <em>Dsl Display Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Mode</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DOWN#isDsl_Display_Mode()
   * @see #getDOWN()
   * @generated
   */
  EAttribute getDOWN_Dsl_Display_Mode();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.DOWT <em>DOWT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DOWT</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DOWT
   * @generated
   */
  EClass getDOWT();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.DOWT#isDsl_Display_Mode <em>Dsl Display Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Mode</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DOWT#isDsl_Display_Mode()
   * @see #getDOWT()
   * @generated
   */
  EAttribute getDOWT_Dsl_Display_Mode();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.EOW <em>EOW</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EOW</em>'.
   * @see net.ages.workbench.templates.dsl.atem.EOW
   * @generated
   */
  EClass getEOW();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.EOW#isDsl_Display_Eothinon <em>Dsl Display Eothinon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Eothinon</em>'.
   * @see net.ages.workbench.templates.dsl.atem.EOW#isDsl_Display_Eothinon()
   * @see #getEOW()
   * @generated
   */
  EAttribute getEOW_Dsl_Display_Eothinon();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.SAEC <em>SAEC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SAEC</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SAEC
   * @generated
   */
  EClass getSAEC();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.SAEC#isDsl_Display_SundayAfterElevationCross <em>Dsl Display Sunday After Elevation Cross</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Sunday After Elevation Cross</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SAEC#isDsl_Display_SundayAfterElevationCross()
   * @see #getSAEC()
   * @generated
   */
  EAttribute getSAEC_Dsl_Display_SundayAfterElevationCross();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.SOL <em>SOL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SOL</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SOL
   * @generated
   */
  EClass getSOL();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.SOL#isDsl_Display_StartLukan <em>Dsl Display Start Lukan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Start Lukan</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SOL#isDsl_Display_StartLukan()
   * @see #getSOL()
   * @generated
   */
  EAttribute getSOL_Dsl_Display_StartLukan();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.DOL <em>DOL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DOL</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DOL
   * @generated
   */
  EClass getDOL();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.DOL#isDsl_Display_DayLukan <em>Dsl Display Day Lukan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Day Lukan</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DOL#isDsl_Display_DayLukan()
   * @see #getDOL()
   * @generated
   */
  EAttribute getDOL_Dsl_Display_DayLukan();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WOLC <em>WOLC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WOLC</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WOLC
   * @generated
   */
  EClass getWOLC();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.WOLC#isDsl_Display_DayLukan <em>Dsl Display Day Lukan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Day Lukan</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WOLC#isDsl_Display_DayLukan()
   * @see #getWOLC()
   * @generated
   */
  EAttribute getWOLC_Dsl_Display_DayLukan();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WDOLC <em>WDOLC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WDOLC</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WDOLC
   * @generated
   */
  EClass getWDOLC();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.WDOLC#isDsl_Display_DayLukan <em>Dsl Display Day Lukan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Day Lukan</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WDOLC#isDsl_Display_DayLukan()
   * @see #getWDOLC()
   * @generated
   */
  EAttribute getWDOLC_Dsl_Display_DayLukan();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.SBT <em>SBT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SBT</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SBT
   * @generated
   */
  EClass getSBT();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.SBT#isDsl_Display_SundaysBeforeTriodion <em>Dsl Display Sundays Before Triodion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Display Sundays Before Triodion</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SBT#isDsl_Display_SundaysBeforeTriodion()
   * @see #getSBT()
   * @generated
   */
  EAttribute getSBT_Dsl_Display_SundaysBeforeTriodion();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.TemplateFragment <em>Template Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Fragment</em>'.
   * @see net.ages.workbench.templates.dsl.atem.TemplateFragment
   * @generated
   */
  EClass getTemplateFragment();

  /**
   * Returns the meta object for the reference '{@link net.ages.workbench.templates.dsl.atem.TemplateFragment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see net.ages.workbench.templates.dsl.atem.TemplateFragment#getName()
   * @see #getTemplateFragment()
   * @generated
   */
  EReference getTemplateFragment_Name();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.PrefaceFragment <em>Preface Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preface Fragment</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PrefaceFragment
   * @generated
   */
  EClass getPrefaceFragment();

  /**
   * Returns the meta object for the reference '{@link net.ages.workbench.templates.dsl.atem.PrefaceFragment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PrefaceFragment#getName()
   * @see #getPrefaceFragment()
   * @generated
   */
  EReference getPrefaceFragment_Name();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.SectionFragment <em>Section Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section Fragment</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SectionFragment
   * @generated
   */
  EClass getSectionFragment();

  /**
   * Returns the meta object for the reference '{@link net.ages.workbench.templates.dsl.atem.SectionFragment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SectionFragment#getName()
   * @see #getSectionFragment()
   * @generated
   */
  EReference getSectionFragment_Name();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Break <em>Break</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Break</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Break
   * @generated
   */
  EClass getBreak();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Break#getDsl_break_type <em>Dsl break type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl break type</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Break#getDsl_break_type()
   * @see #getBreak()
   * @generated
   */
  EAttribute getBreak_Dsl_break_type();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.PageNumber <em>Page Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Number</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PageNumber
   * @generated
   */
  EClass getPageNumber();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.PageNumber#getDsl_PageNumber_value <em>Dsl Page Number value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Page Number value</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PageNumber#getDsl_PageNumber_value()
   * @see #getPageNumber()
   * @generated
   */
  EAttribute getPageNumber_Dsl_PageNumber_value();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.PassThroughHtml <em>Pass Through Html</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pass Through Html</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PassThroughHtml
   * @generated
   */
  EClass getPassThroughHtml();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.PassThroughHtml#getDsl_Passthrough_html_text <em>Dsl Passthrough html text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Passthrough html text</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PassThroughHtml#getDsl_Passthrough_html_text()
   * @see #getPassThroughHtml()
   * @generated
   */
  EAttribute getPassThroughHtml_Dsl_Passthrough_html_text();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.PassThroughPdf <em>Pass Through Pdf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pass Through Pdf</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PassThroughPdf
   * @generated
   */
  EClass getPassThroughPdf();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.PassThroughPdf#getDsl_Passthrough_pdf_text <em>Dsl Passthrough pdf text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Passthrough pdf text</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PassThroughPdf#getDsl_Passthrough_pdf_text()
   * @see #getPassThroughPdf()
   * @generated
   */
  EAttribute getPassThroughPdf_Dsl_Passthrough_pdf_text();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Title</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Title
   * @generated
   */
  EClass getTitle();

  /**
   * Returns the meta object for the reference '{@link net.ages.workbench.templates.dsl.atem.Title#getDsl_Title_Role <em>Dsl Title Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl Title Role</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Title#getDsl_Title_Role()
   * @see #getTitle()
   * @generated
   */
  EReference getTitle_Dsl_Title_Role();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Title#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Title#getDsl_Elements()
   * @see #getTitle()
   * @generated
   */
  EReference getTitle_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.SubTitle <em>Sub Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Title</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SubTitle
   * @generated
   */
  EClass getSubTitle();

  /**
   * Returns the meta object for the reference '{@link net.ages.workbench.templates.dsl.atem.SubTitle#getDsl_SubTitle_Role <em>Dsl Sub Title Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl Sub Title Role</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SubTitle#getDsl_SubTitle_Role()
   * @see #getSubTitle()
   * @generated
   */
  EReference getSubTitle_Dsl_SubTitle_Role();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.SubTitle#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SubTitle#getDsl_Elements()
   * @see #getSubTitle()
   * @generated
   */
  EReference getSubTitle_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Paragraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paragraph</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Paragraph
   * @generated
   */
  EClass getParagraph();

  /**
   * Returns the meta object for the reference '{@link net.ages.workbench.templates.dsl.atem.Paragraph#getDsl_Para_Role <em>Dsl Para Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl Para Role</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Paragraph#getDsl_Para_Role()
   * @see #getParagraph()
   * @generated
   */
  EReference getParagraph_Dsl_Para_Role();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Paragraph#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Paragraph#getDsl_Elements()
   * @see #getParagraph()
   * @generated
   */
  EReference getParagraph_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the reference '{@link net.ages.workbench.templates.dsl.atem.Block#getDsl_Block_Role <em>Dsl Block Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl Block Role</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Block#getDsl_Block_Role()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Dsl_Block_Role();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Block#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Block#getDsl_Elements()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Hymn <em>Hymn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hymn</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Hymn
   * @generated
   */
  EClass getHymn();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Hymn#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Hymn#getDsl_Elements()
   * @see #getHymn()
   * @generated
   */
  EReference getHymn_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Media <em>Media</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Media</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Media
   * @generated
   */
  EClass getMedia();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Media#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Media#getDsl_Elements()
   * @see #getMedia()
   * @generated
   */
  EReference getMedia_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Verse <em>Verse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verse</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Verse
   * @generated
   */
  EClass getVerse();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Verse#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Verse#getDsl_Elements()
   * @see #getVerse()
   * @generated
   */
  EReference getVerse_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Actor
   * @generated
   */
  EClass getActor();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Actor#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Actor#getDsl_Elements()
   * @see #getActor()
   * @generated
   */
  EReference getActor_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Rubric <em>Rubric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rubric</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Rubric
   * @generated
   */
  EClass getRubric();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Rubric#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Rubric#getDsl_Elements()
   * @see #getRubric()
   * @generated
   */
  EReference getRubric_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Dialog <em>Dialog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dialog</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Dialog
   * @generated
   */
  EClass getDialog();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Dialog#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Dialog#getDsl_Elements()
   * @see #getDialog()
   * @generated
   */
  EReference getDialog_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Reading <em>Reading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reading</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Reading
   * @generated
   */
  EClass getReading();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Reading#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Reading#getDsl_Elements()
   * @see #getReading()
   * @generated
   */
  EReference getReading_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Heading1 <em>Heading1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading1</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Heading1
   * @generated
   */
  EClass getHeading1();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Heading1#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Heading1#getDsl_Elements()
   * @see #getHeading1()
   * @generated
   */
  EReference getHeading1_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Heading2 <em>Heading2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading2</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Heading2
   * @generated
   */
  EClass getHeading2();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Heading2#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Heading2#getDsl_Elements()
   * @see #getHeading2()
   * @generated
   */
  EReference getHeading2_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Heading3 <em>Heading3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading3</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Heading3
   * @generated
   */
  EClass getHeading3();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.Heading3#getDsl_Elements <em>Dsl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Elements</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Heading3#getDsl_Elements()
   * @see #getHeading3()
   * @generated
   */
  EReference getHeading3_Dsl_Elements();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.ElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Type</em>'.
   * @see net.ages.workbench.templates.dsl.atem.ElementType
   * @generated
   */
  EClass getElementType();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Aid <em>Aid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aid</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Aid
   * @generated
   */
  EClass getAid();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Aid#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Aid#getName()
   * @see #getAid()
   * @generated
   */
  EAttribute getAid_Name();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Version
   * @generated
   */
  EClass getVersion();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.Version#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Version#getName()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Name();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.LitBook <em>Lit Book</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lit Book</em>'.
   * @see net.ages.workbench.templates.dsl.atem.LitBook
   * @generated
   */
  EClass getLitBook();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.LitBook#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.ages.workbench.templates.dsl.atem.LitBook#getName()
   * @see #getLitBook()
   * @generated
   */
  EAttribute getLitBook_Name();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.SetLocale <em>Set Locale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Locale</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SetLocale
   * @generated
   */
  EClass getSetLocale();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.SetLocale#getDsl_SetLocale_V1 <em>Dsl Set Locale V1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Set Locale V1</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SetLocale#getDsl_SetLocale_V1()
   * @see #getSetLocale()
   * @generated
   */
  EAttribute getSetLocale_Dsl_SetLocale_V1();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.SetLocale#getDsl_SetLocale_V2 <em>Dsl Set Locale V2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Set Locale V2</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SetLocale#getDsl_SetLocale_V2()
   * @see #getSetLocale()
   * @generated
   */
  EAttribute getSetLocale_Dsl_SetLocale_V2();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.RestoreLocale <em>Restore Locale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restore Locale</em>'.
   * @see net.ages.workbench.templates.dsl.atem.RestoreLocale
   * @generated
   */
  EClass getRestoreLocale();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.RestoreLocale#isDsl_RestoreLocale <em>Dsl Restore Locale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Restore Locale</em>'.
   * @see net.ages.workbench.templates.dsl.atem.RestoreLocale#isDsl_RestoreLocale()
   * @see #getRestoreLocale()
   * @generated
   */
  EAttribute getRestoreLocale_Dsl_RestoreLocale();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenDate <em>When Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Date</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenDate
   * @generated
   */
  EClass getWhenDate();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenDate#getDsl_WhenDate_Cases <em>Dsl When Date Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Date Cases</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenDate#getDsl_WhenDate_Cases()
   * @see #getWhenDate()
   * @generated
   */
  EReference getWhenDate_Dsl_WhenDate_Cases();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenDate#getDsl_WhenDate_Other <em>Dsl When Date Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl When Date Other</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenDate#getDsl_WhenDate_Other()
   * @see #getWhenDate()
   * @generated
   */
  EReference getWhenDate_Dsl_WhenDate_Other();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenDateCase <em>When Date Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Date Case</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenDateCase
   * @generated
   */
  EClass getWhenDateCase();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.WhenDateCase#getDsl_WhenDate_Case_Month <em>Dsl When Date Case Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl When Date Case Month</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenDateCase#getDsl_WhenDate_Case_Month()
   * @see #getWhenDateCase()
   * @generated
   */
  EAttribute getWhenDateCase_Dsl_WhenDate_Case_Month();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenDateCase#getDsl_WhenDateCase_Days <em>Dsl When Date Case Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl When Date Case Days</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenDateCase#getDsl_WhenDateCase_Days()
   * @see #getWhenDateCase()
   * @generated
   */
  EReference getWhenDateCase_Dsl_WhenDateCase_Days();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenDateCase#getDsl_WhenDateCase_True_actions <em>Dsl When Date Case True actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Date Case True actions</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenDateCase#getDsl_WhenDateCase_True_actions()
   * @see #getWhenDateCase()
   * @generated
   */
  EReference getWhenDateCase_Dsl_WhenDateCase_True_actions();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.AbstractDateCase <em>Abstract Date Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Date Case</em>'.
   * @see net.ages.workbench.templates.dsl.atem.AbstractDateCase
   * @generated
   */
  EClass getAbstractDateCase();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.DateRange <em>Date Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Range</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DateRange
   * @generated
   */
  EClass getDateRange();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.DateRange#getDsl_DateRange_from <em>Dsl Date Range from</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Date Range from</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DateRange#getDsl_DateRange_from()
   * @see #getDateRange()
   * @generated
   */
  EAttribute getDateRange_Dsl_DateRange_from();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.DateRange#getDsl_DateRange_To <em>Dsl Date Range To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Date Range To</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DateRange#getDsl_DateRange_To()
   * @see #getDateRange()
   * @generated
   */
  EAttribute getDateRange_Dsl_DateRange_To();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.DateSet <em>Date Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Set</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DateSet
   * @generated
   */
  EClass getDateSet();

  /**
   * Returns the meta object for the attribute list '{@link net.ages.workbench.templates.dsl.atem.DateSet#getDslDateSet_Values <em>Dsl Date Set Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dsl Date Set Values</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DateSet#getDslDateSet_Values()
   * @see #getDateSet()
   * @generated
   */
  EAttribute getDateSet_DslDateSet_Values();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenDayName <em>When Day Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Day Name</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenDayName
   * @generated
   */
  EClass getWhenDayName();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenDayName#getDsl_WhenDayName_Cases <em>Dsl When Day Name Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Day Name Cases</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenDayName#getDsl_WhenDayName_Cases()
   * @see #getWhenDayName()
   * @generated
   */
  EReference getWhenDayName_Dsl_WhenDayName_Cases();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenDayName#getDsl_WhenDayName_Other <em>Dsl When Day Name Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl When Day Name Other</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenDayName#getDsl_WhenDayName_Other()
   * @see #getWhenDayName()
   * @generated
   */
  EReference getWhenDayName_Dsl_WhenDayName_Other();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenDayNameCase <em>When Day Name Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Day Name Case</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenDayNameCase
   * @generated
   */
  EClass getWhenDayNameCase();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenDayNameCase#getDsl_WhenDayNameCase_Days <em>Dsl When Day Name Case Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl When Day Name Case Days</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenDayNameCase#getDsl_WhenDayNameCase_Days()
   * @see #getWhenDayNameCase()
   * @generated
   */
  EReference getWhenDayNameCase_Dsl_WhenDayNameCase_Days();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenDayNameCase#getDsl_WhenDayNameCase_True_actions <em>Dsl When Day Name Case True actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Day Name Case True actions</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenDayNameCase#getDsl_WhenDayNameCase_True_actions()
   * @see #getWhenDayNameCase()
   * @generated
   */
  EReference getWhenDayNameCase_Dsl_WhenDayNameCase_True_actions();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.AbstractDayNameCase <em>Abstract Day Name Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Day Name Case</em>'.
   * @see net.ages.workbench.templates.dsl.atem.AbstractDayNameCase
   * @generated
   */
  EClass getAbstractDayNameCase();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.DayNameRange <em>Day Name Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Day Name Range</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DayNameRange
   * @generated
   */
  EClass getDayNameRange();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.DayNameRange#getDsl_DayNameRange_from <em>Dsl Day Name Range from</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Day Name Range from</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DayNameRange#getDsl_DayNameRange_from()
   * @see #getDayNameRange()
   * @generated
   */
  EAttribute getDayNameRange_Dsl_DayNameRange_from();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.DayNameRange#getDsl_DayNameRange_To <em>Dsl Day Name Range To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Day Name Range To</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DayNameRange#getDsl_DayNameRange_To()
   * @see #getDayNameRange()
   * @generated
   */
  EAttribute getDayNameRange_Dsl_DayNameRange_To();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.DayNameSet <em>Day Name Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Day Name Set</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DayNameSet
   * @generated
   */
  EClass getDayNameSet();

  /**
   * Returns the meta object for the attribute list '{@link net.ages.workbench.templates.dsl.atem.DayNameSet#getDslDayNameSet_Values <em>Dsl Day Name Set Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dsl Day Name Set Values</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DayNameSet#getDslDayNameSet_Values()
   * @see #getDayNameSet()
   * @generated
   */
  EAttribute getDayNameSet_DslDayNameSet_Values();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay <em>When Pentecostarion Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Pentecostarion Day</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay
   * @generated
   */
  EClass getWhenPentecostarionDay();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay#getDsl_WhenPentecostarionDay_Cases <em>Dsl When Pentecostarion Day Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Pentecostarion Day Cases</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay#getDsl_WhenPentecostarionDay_Cases()
   * @see #getWhenPentecostarionDay()
   * @generated
   */
  EReference getWhenPentecostarionDay_Dsl_WhenPentecostarionDay_Cases();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay#getDsl_WhenPentecostarionDay_Other <em>Dsl When Pentecostarion Day Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl When Pentecostarion Day Other</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay#getDsl_WhenPentecostarionDay_Other()
   * @see #getWhenPentecostarionDay()
   * @generated
   */
  EReference getWhenPentecostarionDay_Dsl_WhenPentecostarionDay_Other();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenTriodionDay <em>When Triodion Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Triodion Day</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenTriodionDay
   * @generated
   */
  EClass getWhenTriodionDay();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenTriodionDay#getDsl_WhenTriodionDay_Cases <em>Dsl When Triodion Day Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Triodion Day Cases</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenTriodionDay#getDsl_WhenTriodionDay_Cases()
   * @see #getWhenTriodionDay()
   * @generated
   */
  EReference getWhenTriodionDay_Dsl_WhenTriodionDay_Cases();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenTriodionDay#getDsl_WhenTriodionDay_Other <em>Dsl When Triodion Day Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl When Triodion Day Other</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenTriodionDay#getDsl_WhenTriodionDay_Other()
   * @see #getWhenTriodionDay()
   * @generated
   */
  EReference getWhenTriodionDay_Dsl_WhenTriodionDay_Other();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenMovableCycleDay <em>When Movable Cycle Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Movable Cycle Day</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenMovableCycleDay
   * @generated
   */
  EClass getWhenMovableCycleDay();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenMovableCycleDay#getDsl_WhenMovableCycleDay_Cases <em>Dsl When Movable Cycle Day Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Movable Cycle Day Cases</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenMovableCycleDay#getDsl_WhenMovableCycleDay_Cases()
   * @see #getWhenMovableCycleDay()
   * @generated
   */
  EReference getWhenMovableCycleDay_Dsl_WhenMovableCycleDay_Cases();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenMovableCycleDay#getDsl_WhenMovableCycleDay_Other <em>Dsl When Movable Cycle Day Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl When Movable Cycle Day Other</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenMovableCycleDay#getDsl_WhenMovableCycleDay_Other()
   * @see #getWhenMovableCycleDay()
   * @generated
   */
  EReference getWhenMovableCycleDay_Dsl_WhenMovableCycleDay_Other();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay <em>When Sunday After Elevation Of Cross Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Sunday After Elevation Of Cross Day</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay
   * @generated
   */
  EClass getWhenSundayAfterElevationOfCrossDay();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay#getDsl_WhenSundayAfterElevationOfCrossDay_Cases <em>Dsl When Sunday After Elevation Of Cross Day Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Sunday After Elevation Of Cross Day Cases</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay#getDsl_WhenSundayAfterElevationOfCrossDay_Cases()
   * @see #getWhenSundayAfterElevationOfCrossDay()
   * @generated
   */
  EReference getWhenSundayAfterElevationOfCrossDay_Dsl_WhenSundayAfterElevationOfCrossDay_Cases();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay#getDsl_WhenSundayAfterElevationOfCrossDay_Other <em>Dsl When Sunday After Elevation Of Cross Day Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl When Sunday After Elevation Of Cross Day Other</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay#getDsl_WhenSundayAfterElevationOfCrossDay_Other()
   * @see #getWhenSundayAfterElevationOfCrossDay()
   * @generated
   */
  EReference getWhenSundayAfterElevationOfCrossDay_Dsl_WhenSundayAfterElevationOfCrossDay_Other();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay <em>When Lukan Cycle Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Lukan Cycle Day</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay
   * @generated
   */
  EClass getWhenLukanCycleDay();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay#getDsl_WhenLukanCycleDay_Cases <em>Dsl When Lukan Cycle Day Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Lukan Cycle Day Cases</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay#getDsl_WhenLukanCycleDay_Cases()
   * @see #getWhenLukanCycleDay()
   * @generated
   */
  EReference getWhenLukanCycleDay_Dsl_WhenLukanCycleDay_Cases();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay#getDsl_WhenLukanCycleDay_Other <em>Dsl When Lukan Cycle Day Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl When Lukan Cycle Day Other</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay#getDsl_WhenLukanCycleDay_Other()
   * @see #getWhenLukanCycleDay()
   * @generated
   */
  EReference getWhenLukanCycleDay_Dsl_WhenLukanCycleDay_Other();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenPascha <em>When Pascha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Pascha</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenPascha
   * @generated
   */
  EClass getWhenPascha();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenPascha#getDsl_WhenPascha_true_actions <em>Dsl When Pascha true actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Pascha true actions</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenPascha#getDsl_WhenPascha_true_actions()
   * @see #getWhenPascha()
   * @generated
   */
  EReference getWhenPascha_Dsl_WhenPascha_true_actions();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenPascha#getDsl_WhenPascha_Other_actions <em>Dsl When Pascha Other actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Pascha Other actions</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenPascha#getDsl_WhenPascha_Other_actions()
   * @see #getWhenPascha()
   * @generated
   */
  EReference getWhenPascha_Dsl_WhenPascha_Other_actions();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenOther <em>When Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Other</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenOther
   * @generated
   */
  EClass getWhenOther();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenOther#getDsl_WhenCase_Other_actions <em>Dsl When Case Other actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Case Other actions</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenOther#getDsl_WhenCase_Other_actions()
   * @see #getWhenOther()
   * @generated
   */
  EReference getWhenOther_Dsl_WhenCase_Other_actions();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenPeriodCase <em>When Period Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Period Case</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenPeriodCase
   * @generated
   */
  EClass getWhenPeriodCase();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenPeriodCase#getDsl_WhenPeriodCase_Days <em>Dsl When Period Case Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl When Period Case Days</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenPeriodCase#getDsl_WhenPeriodCase_Days()
   * @see #getWhenPeriodCase()
   * @generated
   */
  EReference getWhenPeriodCase_Dsl_WhenPeriodCase_Days();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenPeriodCase#getDsl_WhenPeriodCase_True_actions <em>Dsl When Period Case True actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Period Case True actions</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenPeriodCase#getDsl_WhenPeriodCase_True_actions()
   * @see #getWhenPeriodCase()
   * @generated
   */
  EReference getWhenPeriodCase_Dsl_WhenPeriodCase_True_actions();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.AbstractDayCase <em>Abstract Day Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Day Case</em>'.
   * @see net.ages.workbench.templates.dsl.atem.AbstractDayCase
   * @generated
   */
  EClass getAbstractDayCase();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.DayRange <em>Day Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Day Range</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DayRange
   * @generated
   */
  EClass getDayRange();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.DayRange#getDsl_DayRange_from <em>Dsl Day Range from</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Day Range from</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DayRange#getDsl_DayRange_from()
   * @see #getDayRange()
   * @generated
   */
  EAttribute getDayRange_Dsl_DayRange_from();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.DayRange#getDsl_Range_To <em>Dsl Range To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Range To</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DayRange#getDsl_Range_To()
   * @see #getDayRange()
   * @generated
   */
  EAttribute getDayRange_Dsl_Range_To();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.DaySet <em>Day Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Day Set</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DaySet
   * @generated
   */
  EClass getDaySet();

  /**
   * Returns the meta object for the attribute list '{@link net.ages.workbench.templates.dsl.atem.DaySet#getDslSetValue_Days <em>Dsl Set Value Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dsl Set Value Days</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DaySet#getDslSetValue_Days()
   * @see #getDaySet()
   * @generated
   */
  EAttribute getDaySet_DslSetValue_Days();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeek <em>When Mode Of Week</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Mode Of Week</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenModeOfWeek
   * @generated
   */
  EClass getWhenModeOfWeek();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeek#getDsl_WhenModeOfWeek_Cases <em>Dsl When Mode Of Week Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Mode Of Week Cases</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenModeOfWeek#getDsl_WhenModeOfWeek_Cases()
   * @see #getWhenModeOfWeek()
   * @generated
   */
  EReference getWhenModeOfWeek_Dsl_WhenModeOfWeek_Cases();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeek#getDsl_WhenModeOfWeek_Other <em>Dsl When Mode Of Week Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl When Mode Of Week Other</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenModeOfWeek#getDsl_WhenModeOfWeek_Other()
   * @see #getWhenModeOfWeek()
   * @generated
   */
  EReference getWhenModeOfWeek_Dsl_WhenModeOfWeek_Other();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase <em>When Mode Of Week Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Mode Of Week Case</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase
   * @generated
   */
  EClass getWhenModeOfWeekCase();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase#getDsl_WhenModeOfWeekCase_Days <em>Dsl When Mode Of Week Case Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl When Mode Of Week Case Days</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase#getDsl_WhenModeOfWeekCase_Days()
   * @see #getWhenModeOfWeekCase()
   * @generated
   */
  EReference getWhenModeOfWeekCase_Dsl_WhenModeOfWeekCase_Days();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase#getDsl_WhenModeOfWeekCase_True_actions <em>Dsl When Mode Of Week Case True actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Mode Of Week Case True actions</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase#getDsl_WhenModeOfWeekCase_True_actions()
   * @see #getWhenModeOfWeekCase()
   * @generated
   */
  EReference getWhenModeOfWeekCase_Dsl_WhenModeOfWeekCase_True_actions();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.ModeOfWeekSet <em>Mode Of Week Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mode Of Week Set</em>'.
   * @see net.ages.workbench.templates.dsl.atem.ModeOfWeekSet
   * @generated
   */
  EClass getModeOfWeekSet();

  /**
   * Returns the meta object for the attribute list '{@link net.ages.workbench.templates.dsl.atem.ModeOfWeekSet#getDsl_ModeOfWeekSet_MOWs <em>Dsl Mode Of Week Set MO Ws</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dsl Mode Of Week Set MO Ws</em>'.
   * @see net.ages.workbench.templates.dsl.atem.ModeOfWeekSet#getDsl_ModeOfWeekSet_MOWs()
   * @see #getModeOfWeekSet()
   * @generated
   */
  EAttribute getModeOfWeekSet_Dsl_ModeOfWeekSet_MOWs();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion <em>When Sundays Before Triodion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Sundays Before Triodion</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion
   * @generated
   */
  EClass getWhenSundaysBeforeTriodion();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion#getDsl_WhenSundaysBeforeTriodion_Cases <em>Dsl When Sundays Before Triodion Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Sundays Before Triodion Cases</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion#getDsl_WhenSundaysBeforeTriodion_Cases()
   * @see #getWhenSundaysBeforeTriodion()
   * @generated
   */
  EReference getWhenSundaysBeforeTriodion_Dsl_WhenSundaysBeforeTriodion_Cases();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion#getDsl_SundaysBeforeTriodion_Other <em>Dsl Sundays Before Triodion Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl Sundays Before Triodion Other</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion#getDsl_SundaysBeforeTriodion_Other()
   * @see #getWhenSundaysBeforeTriodion()
   * @generated
   */
  EReference getWhenSundaysBeforeTriodion_Dsl_SundaysBeforeTriodion_Other();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase <em>Sundays Before Triodion Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sundays Before Triodion Case</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase
   * @generated
   */
  EClass getSundaysBeforeTriodionCase();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase#getDsl_SundaysBeforeTriodionCase_Days <em>Dsl Sundays Before Triodion Case Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Sundays Before Triodion Case Days</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase#getDsl_SundaysBeforeTriodionCase_Days()
   * @see #getSundaysBeforeTriodionCase()
   * @generated
   */
  EAttribute getSundaysBeforeTriodionCase_Dsl_SundaysBeforeTriodionCase_Days();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase#getDsl_SundaysBeforeTriodionCase_True_actions <em>Dsl Sundays Before Triodion Case True actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Sundays Before Triodion Case True actions</em>'.
   * @see net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase#getDsl_SundaysBeforeTriodionCase_True_actions()
   * @see #getSundaysBeforeTriodionCase()
   * @generated
   */
  EReference getSundaysBeforeTriodionCase_Dsl_SundaysBeforeTriodionCase_True_actions();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenExists <em>When Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Exists</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenExists
   * @generated
   */
  EClass getWhenExists();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenExists#getDsl_WhenExists_Cases <em>Dsl When Exists Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Exists Cases</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenExists#getDsl_WhenExists_Cases()
   * @see #getWhenExists()
   * @generated
   */
  EReference getWhenExists_Dsl_WhenExists_Cases();

  /**
   * Returns the meta object for the containment reference '{@link net.ages.workbench.templates.dsl.atem.WhenExists#getDsl_WhenExists_Other <em>Dsl When Exists Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dsl When Exists Other</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenExists#getDsl_WhenExists_Other()
   * @see #getWhenExists()
   * @generated
   */
  EReference getWhenExists_Dsl_WhenExists_Other();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.templates.dsl.atem.WhenExistsCase <em>When Exists Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Exists Case</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenExistsCase
   * @generated
   */
  EClass getWhenExistsCase();

  /**
   * Returns the meta object for the reference '{@link net.ages.workbench.templates.dsl.atem.WhenExistsCase#getDsl_WhenExistsCase_Ref <em>Dsl When Exists Case Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl When Exists Case Ref</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenExistsCase#getDsl_WhenExistsCase_Ref()
   * @see #getWhenExistsCase()
   * @generated
   */
  EReference getWhenExistsCase_Dsl_WhenExistsCase_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.templates.dsl.atem.WhenExistsCase#getDsl_WhenExistsCase_True_actions <em>Dsl When Exists Case True actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl When Exists Case True actions</em>'.
   * @see net.ages.workbench.templates.dsl.atem.WhenExistsCase#getDsl_WhenExistsCase_True_actions()
   * @see #getWhenExistsCase()
   * @generated
   */
  EReference getWhenExistsCase_Dsl_WhenExistsCase_True_actions();

  /**
   * Returns the meta object for enum '{@link net.ages.workbench.templates.dsl.atem.VersionSwitchType <em>Version Switch Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Version Switch Type</em>'.
   * @see net.ages.workbench.templates.dsl.atem.VersionSwitchType
   * @generated
   */
  EEnum getVersionSwitchType();

  /**
   * Returns the meta object for enum '{@link net.ages.workbench.templates.dsl.atem.Language <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Language</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Language
   * @generated
   */
  EEnum getLanguage();

  /**
   * Returns the meta object for enum '{@link net.ages.workbench.templates.dsl.atem.BreakType <em>Break Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Break Type</em>'.
   * @see net.ages.workbench.templates.dsl.atem.BreakType
   * @generated
   */
  EEnum getBreakType();

  /**
   * Returns the meta object for enum '{@link net.ages.workbench.templates.dsl.atem.TemplateStatuses <em>Template Statuses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Template Statuses</em>'.
   * @see net.ages.workbench.templates.dsl.atem.TemplateStatuses
   * @generated
   */
  EEnum getTemplateStatuses();

  /**
   * Returns the meta object for enum '{@link net.ages.workbench.templates.dsl.atem.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Null</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Null
   * @generated
   */
  EEnum getNull();

  /**
   * Returns the meta object for enum '{@link net.ages.workbench.templates.dsl.atem.ModeTypes <em>Mode Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Mode Types</em>'.
   * @see net.ages.workbench.templates.dsl.atem.ModeTypes
   * @generated
   */
  EEnum getModeTypes();

  /**
   * Returns the meta object for enum '{@link net.ages.workbench.templates.dsl.atem.DowTypes <em>Dow Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dow Types</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DowTypes
   * @generated
   */
  EEnum getDowTypes();

  /**
   * Returns the meta object for enum '{@link net.ages.workbench.templates.dsl.atem.BookTypes <em>Book Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Book Types</em>'.
   * @see net.ages.workbench.templates.dsl.atem.BookTypes
   * @generated
   */
  EEnum getBookTypes();

  /**
   * Returns the meta object for enum '{@link net.ages.workbench.templates.dsl.atem.Seasons <em>Seasons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Seasons</em>'.
   * @see net.ages.workbench.templates.dsl.atem.Seasons
   * @generated
   */
  EEnum getSeasons();

  /**
   * Returns the meta object for enum '{@link net.ages.workbench.templates.dsl.atem.DayOfMonthTypes <em>Day Of Month Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Day Of Month Types</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DayOfMonthTypes
   * @generated
   */
  EEnum getDayOfMonthTypes();

  /**
   * Returns the meta object for enum '{@link net.ages.workbench.templates.dsl.atem.PeriodType <em>Period Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Period Type</em>'.
   * @see net.ages.workbench.templates.dsl.atem.PeriodType
   * @generated
   */
  EEnum getPeriodType();

  /**
   * Returns the meta object for enum '{@link net.ages.workbench.templates.dsl.atem.DayOfWeek <em>Day Of Week</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Day Of Week</em>'.
   * @see net.ages.workbench.templates.dsl.atem.DayOfWeek
   * @generated
   */
  EEnum getDayOfWeek();

  /**
   * Returns the meta object for enum '{@link net.ages.workbench.templates.dsl.atem.MonthName <em>Month Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Month Name</em>'.
   * @see net.ages.workbench.templates.dsl.atem.MonthName
   * @generated
   */
  EEnum getMonthName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AtemFactory getAtemFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.AtemModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemModelImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAtemModel()
     * @generated
     */
    EClass ATEM_MODEL = eINSTANCE.getAtemModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATEM_MODEL__NAME = eINSTANCE.getAtemModel_Name();

    /**
     * The meta object literal for the '<em><b>Dsl Template Status</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATEM_MODEL__DSL_TEMPLATE_STATUS = eINSTANCE.getAtemModel_Dsl_Template_Status();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATEM_MODEL__IMPORTS = eINSTANCE.getAtemModel_Imports();

    /**
     * The meta object literal for the '<em><b>Dsl Template Driver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATEM_MODEL__DSL_TEMPLATE_DRIVER = eINSTANCE.getAtemModel_Dsl_Template_Driver();

    /**
     * The meta object literal for the '<em><b>Dsl Template head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATEM_MODEL__DSL_TEMPLATE_HEAD = eINSTANCE.getAtemModel_Dsl_Template_head();

    /**
     * The meta object literal for the '<em><b>Dsl Template preface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATEM_MODEL__DSL_TEMPLATE_PREFACE = eINSTANCE.getAtemModel_Dsl_Template_preface();

    /**
     * The meta object literal for the '<em><b>Dsl Template components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATEM_MODEL__DSL_TEMPLATE_COMPONENTS = eINSTANCE.getAtemModel_Dsl_Template_components();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeadImpl <em>Head</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HeadImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHead()
     * @generated
     */
    EClass HEAD = eINSTANCE.getHead();

    /**
     * The meta object literal for the '<em><b>Dsl Head components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEAD__DSL_HEAD_COMPONENTS = eINSTANCE.getHead_Dsl_Head_components();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeadComponentImpl <em>Head Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HeadComponentImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeadComponent()
     * @generated
     */
    EClass HEAD_COMPONENT = eINSTANCE.getHeadComponent();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DriverImpl <em>Driver</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DriverImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDriver()
     * @generated
     */
    EClass DRIVER = eINSTANCE.getDriver();

    /**
     * The meta object literal for the '<em><b>Dsl Driver Reg Ex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DRIVER__DSL_DRIVER_REG_EX = eINSTANCE.getDriver_Dsl_Driver_RegEx();

    /**
     * The meta object literal for the '<em><b>Dsl Driver Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DRIVER__DSL_DRIVER_STATUS = eINSTANCE.getDriver_Dsl_Driver_Status();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.TemplateTitleImpl <em>Template Title</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.TemplateTitleImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getTemplateTitle()
     * @generated
     */
    EClass TEMPLATE_TITLE = eINSTANCE.getTemplateTitle();

    /**
     * The meta object literal for the '<em><b>Dsl Template Title Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_TITLE__DSL_TEMPLATE_TITLE_ELEMENTS = eINSTANCE.getTemplateTitle_Dsl_TemplateTitle_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.PageKeepWithNextImpl <em>Page Keep With Next</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.PageKeepWithNextImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPageKeepWithNext()
     * @generated
     */
    EClass PAGE_KEEP_WITH_NEXT = eINSTANCE.getPageKeepWithNext();

    /**
     * The meta object literal for the '<em><b>Dsl Page Keep With Next value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE_KEEP_WITH_NEXT__DSL_PAGE_KEEP_WITH_NEXT_VALUE = eINSTANCE.getPageKeepWithNext_Dsl_PageKeepWithNext_value();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.PageHeaderEvenImpl <em>Page Header Even</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.PageHeaderEvenImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPageHeaderEven()
     * @generated
     */
    EClass PAGE_HEADER_EVEN = eINSTANCE.getPageHeaderEven();

    /**
     * The meta object literal for the '<em><b>Dsl Page Header columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE_HEADER_EVEN__DSL_PAGE_HEADER_COLUMNS = eINSTANCE.getPageHeaderEven_Dsl_PageHeader_columns();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.PageHeaderOddImpl <em>Page Header Odd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.PageHeaderOddImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPageHeaderOdd()
     * @generated
     */
    EClass PAGE_HEADER_ODD = eINSTANCE.getPageHeaderOdd();

    /**
     * The meta object literal for the '<em><b>Dsl Page Header columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE_HEADER_ODD__DSL_PAGE_HEADER_COLUMNS = eINSTANCE.getPageHeaderOdd_Dsl_PageHeader_columns();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.PageFooterEvenImpl <em>Page Footer Even</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.PageFooterEvenImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPageFooterEven()
     * @generated
     */
    EClass PAGE_FOOTER_EVEN = eINSTANCE.getPageFooterEven();

    /**
     * The meta object literal for the '<em><b>Dsl Page Header columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE_FOOTER_EVEN__DSL_PAGE_HEADER_COLUMNS = eINSTANCE.getPageFooterEven_Dsl_PageHeader_columns();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.PageFooterOddImpl <em>Page Footer Odd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.PageFooterOddImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPageFooterOdd()
     * @generated
     */
    EClass PAGE_FOOTER_ODD = eINSTANCE.getPageFooterOdd();

    /**
     * The meta object literal for the '<em><b>Dsl Page Header columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE_FOOTER_ODD__DSL_PAGE_HEADER_COLUMNS = eINSTANCE.getPageFooterOdd_Dsl_PageHeader_columns();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnImpl <em>Header Footer Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterColumn()
     * @generated
     */
    EClass HEADER_FOOTER_COLUMN = eINSTANCE.getHeaderFooterColumn();

    /**
     * The meta object literal for the '<em><b>Dsl Header Footer Column fragments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADER_FOOTER_COLUMN__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS = eINSTANCE.getHeaderFooterColumn_Dsl_HeaderFooterColumn_fragments();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnLeftImpl <em>Header Footer Column Left</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnLeftImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterColumnLeft()
     * @generated
     */
    EClass HEADER_FOOTER_COLUMN_LEFT = eINSTANCE.getHeaderFooterColumnLeft();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnCenterImpl <em>Header Footer Column Center</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnCenterImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterColumnCenter()
     * @generated
     */
    EClass HEADER_FOOTER_COLUMN_CENTER = eINSTANCE.getHeaderFooterColumnCenter();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnRightImpl <em>Header Footer Column Right</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnRightImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterColumnRight()
     * @generated
     */
    EClass HEADER_FOOTER_COLUMN_RIGHT = eINSTANCE.getHeaderFooterColumnRight();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterFragmentImpl <em>Header Footer Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterFragmentImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterFragment()
     * @generated
     */
    EClass HEADER_FOOTER_FRAGMENT = eINSTANCE.getHeaderFooterFragment();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterTextImpl <em>Header Footer Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterTextImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterText()
     * @generated
     */
    EClass HEADER_FOOTER_TEXT = eINSTANCE.getHeaderFooterText();

    /**
     * The meta object literal for the '<em><b>Dsl Header Footer Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER_FOOTER_TEXT__DSL_HEADER_FOOTER_TEXT = eINSTANCE.getHeaderFooterText_Dsl_HeaderFooterText();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterDateImpl <em>Header Footer Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterDateImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterDate()
     * @generated
     */
    EClass HEADER_FOOTER_DATE = eINSTANCE.getHeaderFooterDate();

    /**
     * The meta object literal for the '<em><b>Dsl Header Footer Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE = eINSTANCE.getHeaderFooterDate_Dsl_HeaderFooterDate();

    /**
     * The meta object literal for the '<em><b>Dsl Header Footer Date Language</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE_LANGUAGE = eINSTANCE.getHeaderFooterDate_Dsl_HeaderFooterDate_Language();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterPageNumberImpl <em>Header Footer Page Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterPageNumberImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterPageNumber()
     * @generated
     */
    EClass HEADER_FOOTER_PAGE_NUMBER = eINSTANCE.getHeaderFooterPageNumber();

    /**
     * The meta object literal for the '<em><b>Dsl Header Footer Page Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER_FOOTER_PAGE_NUMBER__DSL_HEADER_FOOTER_PAGE_NUMBER = eINSTANCE.getHeaderFooterPageNumber_Dsl_HeaderFooterPageNumber();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterLookupImpl <em>Header Footer Lookup</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterLookupImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterLookup()
     * @generated
     */
    EClass HEADER_FOOTER_LOOKUP = eINSTANCE.getHeaderFooterLookup();

    /**
     * The meta object literal for the '<em><b>Dsl Header Footer Lookup Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_ELEMENTS = eINSTANCE.getHeaderFooterLookup_Dsl_HeaderFooterLookup_Elements();

    /**
     * The meta object literal for the '<em><b>Dsl Header Footer Lookup Language</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_LANGUAGE = eINSTANCE.getHeaderFooterLookup_Dsl_HeaderFooterLookup_Language();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterTitleImpl <em>Header Footer Title</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterTitleImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterTitle()
     * @generated
     */
    EClass HEADER_FOOTER_TITLE = eINSTANCE.getHeaderFooterTitle();

    /**
     * The meta object literal for the '<em><b>Dsl Header Footer Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER_FOOTER_TITLE__DSL_HEADER_FOOTER_TITLE = eINSTANCE.getHeaderFooterTitle_Dsl_HeaderFooterTitle();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterCommemorationImpl <em>Header Footer Commemoration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HeaderFooterCommemorationImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeaderFooterCommemoration()
     * @generated
     */
    EClass HEADER_FOOTER_COMMEMORATION = eINSTANCE.getHeaderFooterCommemoration();

    /**
     * The meta object literal for the '<em><b>Dsl Header Footer Commemoration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER_FOOTER_COMMEMORATION__DSL_HEADER_FOOTER_COMMEMORATION = eINSTANCE.getHeaderFooterCommemoration_Dsl_HeaderFooterCommemoration();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.CommemorationImpl <em>Commemoration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.CommemorationImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getCommemoration()
     * @generated
     */
    EClass COMMEMORATION = eINSTANCE.getCommemoration();

    /**
     * The meta object literal for the '<em><b>Dsl Commemoration Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMEMORATION__DSL_COMMEMORATION_ELEMENTS = eINSTANCE.getCommemoration_Dsl_Commemoration_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.TemplateStatusImpl <em>Template Status</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.TemplateStatusImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getTemplateStatus()
     * @generated
     */
    EClass TEMPLATE_STATUS = eINSTANCE.getTemplateStatus();

    /**
     * The meta object literal for the '<em><b>Dsl Template Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE_STATUS__DSL_TEMPLATE_STATUS = eINSTANCE.getTemplateStatus_Dsl_TemplateStatus();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.AbstractComponentImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAbstractComponent()
     * @generated
     */
    EClass ABSTRACT_COMPONENT = eINSTANCE.getAbstractComponent();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.ImportImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.VersionSwitchImpl <em>Version Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.VersionSwitchImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getVersionSwitch()
     * @generated
     */
    EClass VERSION_SWITCH = eINSTANCE.getVersionSwitch();

    /**
     * The meta object literal for the '<em><b>Dsl Version Switch flag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION_SWITCH__DSL_VERSION_SWITCH_FLAG = eINSTANCE.getVersionSwitch_Dsl_VersionSwitch_flag();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.ResourceTextImpl <em>Resource Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.ResourceTextImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getResourceText()
     * @generated
     */
    EClass RESOURCE_TEXT = eINSTANCE.getResourceText();

    /**
     * The meta object literal for the '<em><b>Dsl Resource Text Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_TEXT__DSL_RESOURCE_TEXT_REF = eINSTANCE.getResourceText_Dsl_ResourceTextRef();

    /**
     * The meta object literal for the '<em><b>Dsl Resource Text Media Off</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_TEXT__DSL_RESOURCE_TEXT_MEDIA_OFF = eINSTANCE.getResourceText_Dsl_ResourceText_Media_Off();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.LookupImpl <em>Lookup</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.LookupImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getLookup()
     * @generated
     */
    EClass LOOKUP = eINSTANCE.getLookup();

    /**
     * The meta object literal for the '<em><b>Dsl Resource Text Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOKUP__DSL_RESOURCE_TEXT_REF = eINSTANCE.getLookup_Dsl_ResourceTextRef();

    /**
     * The meta object literal for the '<em><b>Dsl Lookup Media Off</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOKUP__DSL_LOOKUP_MEDIA_OFF = eINSTANCE.getLookup_Dsl_Lookup_Media_Off();

    /**
     * The meta object literal for the '<em><b>Dsl Lookup Override Mode Set</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOKUP__DSL_LOOKUP_OVERRIDE_MODE_SET = eINSTANCE.getLookup_Dsl_Lookup_Override_Mode_Set();

    /**
     * The meta object literal for the '<em><b>Dsl Lookup Override Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOKUP__DSL_LOOKUP_OVERRIDE_MODE = eINSTANCE.getLookup_Dsl_Lookup_OverrideMode();

    /**
     * The meta object literal for the '<em><b>Dsl Lookup Override Day Set</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOKUP__DSL_LOOKUP_OVERRIDE_DAY_SET = eINSTANCE.getLookup_Dsl_Lookup_Override__Day_Set();

    /**
     * The meta object literal for the '<em><b>Dsl Lookup Override Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOKUP__DSL_LOOKUP_OVERRIDE_DAY = eINSTANCE.getLookup_Dsl_Lookup_OverrideDay();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.LDPImpl <em>LDP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.LDPImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getLDP()
     * @generated
     */
    EClass LDP = eINSTANCE.getLDP();

    /**
     * The meta object literal for the '<em><b>Dsl LDP</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LDP__DSL_LDP = eINSTANCE.getLDP_Dsl_LDP();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.TaggedTextImpl <em>Tagged Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.TaggedTextImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getTaggedText()
     * @generated
     */
    EClass TAGGED_TEXT = eINSTANCE.getTaggedText();

    /**
     * The meta object literal for the '<em><b>Dsl Tagged Text tag</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAGGED_TEXT__DSL_TAGGED_TEXT_TAG = eINSTANCE.getTaggedText_Dsl_TaggedText_tag();

    /**
     * The meta object literal for the '<em><b>Dsl Tagged Text</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAGGED_TEXT__DSL_TAGGED_TEXT = eINSTANCE.getTaggedText_Dsl_TaggedText();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.InfoImpl <em>Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.InfoImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getInfo()
     * @generated
     */
    EClass INFO = eINSTANCE.getInfo();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFO__NAME = eINSTANCE.getInfo_Name();

    /**
     * The meta object literal for the '<em><b>Dsl Info Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFO__DSL_INFO_ELEMENTS = eINSTANCE.getInfo_Dsl_Info_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.InfoElementTypeImpl <em>Info Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.InfoElementTypeImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getInfoElementType()
     * @generated
     */
    EClass INFO_ELEMENT_TYPE = eINSTANCE.getInfoElementType();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DateImpl <em>Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DateImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDate()
     * @generated
     */
    EClass DATE = eINSTANCE.getDate();

    /**
     * The meta object literal for the '<em><b>Dsl Date month</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__DSL_DATE_MONTH = eINSTANCE.getDate_Dsl_Date_month();

    /**
     * The meta object literal for the '<em><b>Dsl Date day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__DSL_DATE_DAY = eINSTANCE.getDate_Dsl_Date_day();

    /**
     * The meta object literal for the '<em><b>Dsl Date year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__DSL_DATE_YEAR = eINSTANCE.getDate_Dsl_Date_year();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.PrefaceImpl <em>Preface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.PrefaceImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPreface()
     * @generated
     */
    EClass PREFACE = eINSTANCE.getPreface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFACE__NAME = eINSTANCE.getPreface_Name();

    /**
     * The meta object literal for the '<em><b>Dsl Preface Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFACE__DSL_PREFACE_ELEMENTS = eINSTANCE.getPreface_Dsl_Preface_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.PrefaceElementTypeImpl <em>Preface Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.PrefaceElementTypeImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPrefaceElementType()
     * @generated
     */
    EClass PREFACE_ELEMENT_TYPE = eINSTANCE.getPrefaceElementType();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.SectionImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSection()
     * @generated
     */
    EClass SECTION = eINSTANCE.getSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__NAME = eINSTANCE.getSection_Name();

    /**
     * The meta object literal for the '<em><b>Dsl Section Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION__DSL_SECTION_ROLE = eINSTANCE.getSection_Dsl_Section_Role();

    /**
     * The meta object literal for the '<em><b>Dsl Section Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION__DSL_SECTION_ELEMENTS = eINSTANCE.getSection_Dsl_Section_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.SectionElementTypeImpl <em>Section Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.SectionElementTypeImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSectionElementType()
     * @generated
     */
    EClass SECTION_ELEMENT_TYPE = eINSTANCE.getSectionElementType();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.LdpTypeImpl <em>Ldp Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.LdpTypeImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getLdpType()
     * @generated
     */
    EClass LDP_TYPE = eINSTANCE.getLdpType();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.AllImpl <em>All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.AllImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAll()
     * @generated
     */
    EClass ALL = eINSTANCE.getAll();

    /**
     * The meta object literal for the '<em><b>Dsl Display Liturgical Day Properties</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALL__DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES = eINSTANCE.getAll_Dsl_Display_LiturgicalDayProperties();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.GenDateImpl <em>Gen Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.GenDateImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getGenDate()
     * @generated
     */
    EClass GEN_DATE = eINSTANCE.getGenDate();

    /**
     * The meta object literal for the '<em><b>Dsl Display Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEN_DATE__DSL_DISPLAY_DATE = eINSTANCE.getGenDate_Dsl_Display_Date();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.GenYearImpl <em>Gen Year</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.GenYearImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getGenYear()
     * @generated
     */
    EClass GEN_YEAR = eINSTANCE.getGenYear();

    /**
     * The meta object literal for the '<em><b>Dsl Display Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEN_YEAR__DSL_DISPLAY_YEAR = eINSTANCE.getGenYear_Dsl_Display_Year();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.MCDImpl <em>MCD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.MCDImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getMCD()
     * @generated
     */
    EClass MCD = eINSTANCE.getMCD();

    /**
     * The meta object literal for the '<em><b>Dsl MCD value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCD__DSL_MCD_VALUE = eINSTANCE.getMCD_Dsl_MCD_value();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.MOWImpl <em>MOW</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.MOWImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getMOW()
     * @generated
     */
    EClass MOW = eINSTANCE.getMOW();

    /**
     * The meta object literal for the '<em><b>Dsl Display Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOW__DSL_DISPLAY_MODE = eINSTANCE.getMOW_Dsl_Display_Mode();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.NOPImpl <em>NOP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.NOPImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getNOP()
     * @generated
     */
    EClass NOP = eINSTANCE.getNOP();

    /**
     * The meta object literal for the '<em><b>Dsl Display Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOP__DSL_DISPLAY_MODE = eINSTANCE.getNOP_Dsl_Display_Mode();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DOMImpl <em>DOM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DOMImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDOM()
     * @generated
     */
    EClass DOM = eINSTANCE.getDOM();

    /**
     * The meta object literal for the '<em><b>Dsl Display Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM__DSL_DISPLAY_MODE = eINSTANCE.getDOM_Dsl_Display_Mode();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DOPImpl <em>DOP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DOPImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDOP()
     * @generated
     */
    EClass DOP = eINSTANCE.getDOP();

    /**
     * The meta object literal for the '<em><b>Dsl Display Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOP__DSL_DISPLAY_MODE = eINSTANCE.getDOP_Dsl_Display_Mode();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DOWNImpl <em>DOWN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DOWNImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDOWN()
     * @generated
     */
    EClass DOWN = eINSTANCE.getDOWN();

    /**
     * The meta object literal for the '<em><b>Dsl Display Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOWN__DSL_DISPLAY_MODE = eINSTANCE.getDOWN_Dsl_Display_Mode();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DOWTImpl <em>DOWT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DOWTImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDOWT()
     * @generated
     */
    EClass DOWT = eINSTANCE.getDOWT();

    /**
     * The meta object literal for the '<em><b>Dsl Display Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOWT__DSL_DISPLAY_MODE = eINSTANCE.getDOWT_Dsl_Display_Mode();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.EOWImpl <em>EOW</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.EOWImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getEOW()
     * @generated
     */
    EClass EOW = eINSTANCE.getEOW();

    /**
     * The meta object literal for the '<em><b>Dsl Display Eothinon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EOW__DSL_DISPLAY_EOTHINON = eINSTANCE.getEOW_Dsl_Display_Eothinon();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.SAECImpl <em>SAEC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.SAECImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSAEC()
     * @generated
     */
    EClass SAEC = eINSTANCE.getSAEC();

    /**
     * The meta object literal for the '<em><b>Dsl Display Sunday After Elevation Cross</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SAEC__DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS = eINSTANCE.getSAEC_Dsl_Display_SundayAfterElevationCross();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.SOLImpl <em>SOL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.SOLImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSOL()
     * @generated
     */
    EClass SOL = eINSTANCE.getSOL();

    /**
     * The meta object literal for the '<em><b>Dsl Display Start Lukan</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOL__DSL_DISPLAY_START_LUKAN = eINSTANCE.getSOL_Dsl_Display_StartLukan();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DOLImpl <em>DOL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DOLImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDOL()
     * @generated
     */
    EClass DOL = eINSTANCE.getDOL();

    /**
     * The meta object literal for the '<em><b>Dsl Display Day Lukan</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOL__DSL_DISPLAY_DAY_LUKAN = eINSTANCE.getDOL_Dsl_Display_DayLukan();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WOLCImpl <em>WOLC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WOLCImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWOLC()
     * @generated
     */
    EClass WOLC = eINSTANCE.getWOLC();

    /**
     * The meta object literal for the '<em><b>Dsl Display Day Lukan</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WOLC__DSL_DISPLAY_DAY_LUKAN = eINSTANCE.getWOLC_Dsl_Display_DayLukan();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WDOLCImpl <em>WDOLC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WDOLCImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWDOLC()
     * @generated
     */
    EClass WDOLC = eINSTANCE.getWDOLC();

    /**
     * The meta object literal for the '<em><b>Dsl Display Day Lukan</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WDOLC__DSL_DISPLAY_DAY_LUKAN = eINSTANCE.getWDOLC_Dsl_Display_DayLukan();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.SBTImpl <em>SBT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.SBTImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSBT()
     * @generated
     */
    EClass SBT = eINSTANCE.getSBT();

    /**
     * The meta object literal for the '<em><b>Dsl Display Sundays Before Triodion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SBT__DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION = eINSTANCE.getSBT_Dsl_Display_SundaysBeforeTriodion();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.TemplateFragmentImpl <em>Template Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.TemplateFragmentImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getTemplateFragment()
     * @generated
     */
    EClass TEMPLATE_FRAGMENT = eINSTANCE.getTemplateFragment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_FRAGMENT__NAME = eINSTANCE.getTemplateFragment_Name();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.PrefaceFragmentImpl <em>Preface Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.PrefaceFragmentImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPrefaceFragment()
     * @generated
     */
    EClass PREFACE_FRAGMENT = eINSTANCE.getPrefaceFragment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFACE_FRAGMENT__NAME = eINSTANCE.getPrefaceFragment_Name();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.SectionFragmentImpl <em>Section Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.SectionFragmentImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSectionFragment()
     * @generated
     */
    EClass SECTION_FRAGMENT = eINSTANCE.getSectionFragment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_FRAGMENT__NAME = eINSTANCE.getSectionFragment_Name();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.BreakImpl <em>Break</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.BreakImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getBreak()
     * @generated
     */
    EClass BREAK = eINSTANCE.getBreak();

    /**
     * The meta object literal for the '<em><b>Dsl break type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BREAK__DSL_BREAK_TYPE = eINSTANCE.getBreak_Dsl_break_type();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.PageNumberImpl <em>Page Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.PageNumberImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPageNumber()
     * @generated
     */
    EClass PAGE_NUMBER = eINSTANCE.getPageNumber();

    /**
     * The meta object literal for the '<em><b>Dsl Page Number value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE_NUMBER__DSL_PAGE_NUMBER_VALUE = eINSTANCE.getPageNumber_Dsl_PageNumber_value();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.PassThroughHtmlImpl <em>Pass Through Html</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.PassThroughHtmlImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPassThroughHtml()
     * @generated
     */
    EClass PASS_THROUGH_HTML = eINSTANCE.getPassThroughHtml();

    /**
     * The meta object literal for the '<em><b>Dsl Passthrough html text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PASS_THROUGH_HTML__DSL_PASSTHROUGH_HTML_TEXT = eINSTANCE.getPassThroughHtml_Dsl_Passthrough_html_text();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.PassThroughPdfImpl <em>Pass Through Pdf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.PassThroughPdfImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPassThroughPdf()
     * @generated
     */
    EClass PASS_THROUGH_PDF = eINSTANCE.getPassThroughPdf();

    /**
     * The meta object literal for the '<em><b>Dsl Passthrough pdf text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PASS_THROUGH_PDF__DSL_PASSTHROUGH_PDF_TEXT = eINSTANCE.getPassThroughPdf_Dsl_Passthrough_pdf_text();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.TitleImpl <em>Title</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.TitleImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getTitle()
     * @generated
     */
    EClass TITLE = eINSTANCE.getTitle();

    /**
     * The meta object literal for the '<em><b>Dsl Title Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TITLE__DSL_TITLE_ROLE = eINSTANCE.getTitle_Dsl_Title_Role();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TITLE__DSL_ELEMENTS = eINSTANCE.getTitle_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.SubTitleImpl <em>Sub Title</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.SubTitleImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSubTitle()
     * @generated
     */
    EClass SUB_TITLE = eINSTANCE.getSubTitle();

    /**
     * The meta object literal for the '<em><b>Dsl Sub Title Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_TITLE__DSL_SUB_TITLE_ROLE = eINSTANCE.getSubTitle_Dsl_SubTitle_Role();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_TITLE__DSL_ELEMENTS = eINSTANCE.getSubTitle_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.ParagraphImpl <em>Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.ParagraphImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getParagraph()
     * @generated
     */
    EClass PARAGRAPH = eINSTANCE.getParagraph();

    /**
     * The meta object literal for the '<em><b>Dsl Para Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAGRAPH__DSL_PARA_ROLE = eINSTANCE.getParagraph_Dsl_Para_Role();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAGRAPH__DSL_ELEMENTS = eINSTANCE.getParagraph_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.BlockImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Dsl Block Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__DSL_BLOCK_ROLE = eINSTANCE.getBlock_Dsl_Block_Role();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__DSL_ELEMENTS = eINSTANCE.getBlock_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.HymnImpl <em>Hymn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.HymnImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHymn()
     * @generated
     */
    EClass HYMN = eINSTANCE.getHymn();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYMN__DSL_ELEMENTS = eINSTANCE.getHymn_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.MediaImpl <em>Media</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.MediaImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getMedia()
     * @generated
     */
    EClass MEDIA = eINSTANCE.getMedia();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEDIA__DSL_ELEMENTS = eINSTANCE.getMedia_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.VerseImpl <em>Verse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.VerseImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getVerse()
     * @generated
     */
    EClass VERSE = eINSTANCE.getVerse();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERSE__DSL_ELEMENTS = eINSTANCE.getVerse_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.ActorImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getActor()
     * @generated
     */
    EClass ACTOR = eINSTANCE.getActor();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__DSL_ELEMENTS = eINSTANCE.getActor_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.RubricImpl <em>Rubric</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.RubricImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getRubric()
     * @generated
     */
    EClass RUBRIC = eINSTANCE.getRubric();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUBRIC__DSL_ELEMENTS = eINSTANCE.getRubric_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DialogImpl <em>Dialog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DialogImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDialog()
     * @generated
     */
    EClass DIALOG = eINSTANCE.getDialog();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIALOG__DSL_ELEMENTS = eINSTANCE.getDialog_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.ReadingImpl <em>Reading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.ReadingImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getReading()
     * @generated
     */
    EClass READING = eINSTANCE.getReading();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference READING__DSL_ELEMENTS = eINSTANCE.getReading_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.Heading1Impl <em>Heading1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.Heading1Impl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeading1()
     * @generated
     */
    EClass HEADING1 = eINSTANCE.getHeading1();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADING1__DSL_ELEMENTS = eINSTANCE.getHeading1_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.Heading2Impl <em>Heading2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.Heading2Impl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeading2()
     * @generated
     */
    EClass HEADING2 = eINSTANCE.getHeading2();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADING2__DSL_ELEMENTS = eINSTANCE.getHeading2_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.Heading3Impl <em>Heading3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.Heading3Impl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getHeading3()
     * @generated
     */
    EClass HEADING3 = eINSTANCE.getHeading3();

    /**
     * The meta object literal for the '<em><b>Dsl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADING3__DSL_ELEMENTS = eINSTANCE.getHeading3_Dsl_Elements();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.ElementTypeImpl <em>Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.ElementTypeImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getElementType()
     * @generated
     */
    EClass ELEMENT_TYPE = eINSTANCE.getElementType();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.AidImpl <em>Aid</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.AidImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAid()
     * @generated
     */
    EClass AID = eINSTANCE.getAid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AID__NAME = eINSTANCE.getAid_Name();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.VersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.VersionImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getVersion()
     * @generated
     */
    EClass VERSION = eINSTANCE.getVersion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__NAME = eINSTANCE.getVersion_Name();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.LitBookImpl <em>Lit Book</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.LitBookImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getLitBook()
     * @generated
     */
    EClass LIT_BOOK = eINSTANCE.getLitBook();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIT_BOOK__NAME = eINSTANCE.getLitBook_Name();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.SetLocaleImpl <em>Set Locale</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.SetLocaleImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSetLocale()
     * @generated
     */
    EClass SET_LOCALE = eINSTANCE.getSetLocale();

    /**
     * The meta object literal for the '<em><b>Dsl Set Locale V1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_LOCALE__DSL_SET_LOCALE_V1 = eINSTANCE.getSetLocale_Dsl_SetLocale_V1();

    /**
     * The meta object literal for the '<em><b>Dsl Set Locale V2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_LOCALE__DSL_SET_LOCALE_V2 = eINSTANCE.getSetLocale_Dsl_SetLocale_V2();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.RestoreLocaleImpl <em>Restore Locale</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.RestoreLocaleImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getRestoreLocale()
     * @generated
     */
    EClass RESTORE_LOCALE = eINSTANCE.getRestoreLocale();

    /**
     * The meta object literal for the '<em><b>Dsl Restore Locale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTORE_LOCALE__DSL_RESTORE_LOCALE = eINSTANCE.getRestoreLocale_Dsl_RestoreLocale();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenDateImpl <em>When Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenDateImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenDate()
     * @generated
     */
    EClass WHEN_DATE = eINSTANCE.getWhenDate();

    /**
     * The meta object literal for the '<em><b>Dsl When Date Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_DATE__DSL_WHEN_DATE_CASES = eINSTANCE.getWhenDate_Dsl_WhenDate_Cases();

    /**
     * The meta object literal for the '<em><b>Dsl When Date Other</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_DATE__DSL_WHEN_DATE_OTHER = eINSTANCE.getWhenDate_Dsl_WhenDate_Other();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenDateCaseImpl <em>When Date Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenDateCaseImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenDateCase()
     * @generated
     */
    EClass WHEN_DATE_CASE = eINSTANCE.getWhenDateCase();

    /**
     * The meta object literal for the '<em><b>Dsl When Date Case Month</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_MONTH = eINSTANCE.getWhenDateCase_Dsl_WhenDate_Case_Month();

    /**
     * The meta object literal for the '<em><b>Dsl When Date Case Days</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_DAYS = eINSTANCE.getWhenDateCase_Dsl_WhenDateCase_Days();

    /**
     * The meta object literal for the '<em><b>Dsl When Date Case True actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_TRUE_ACTIONS = eINSTANCE.getWhenDateCase_Dsl_WhenDateCase_True_actions();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.AbstractDateCaseImpl <em>Abstract Date Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.AbstractDateCaseImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAbstractDateCase()
     * @generated
     */
    EClass ABSTRACT_DATE_CASE = eINSTANCE.getAbstractDateCase();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DateRangeImpl <em>Date Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DateRangeImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDateRange()
     * @generated
     */
    EClass DATE_RANGE = eINSTANCE.getDateRange();

    /**
     * The meta object literal for the '<em><b>Dsl Date Range from</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE_RANGE__DSL_DATE_RANGE_FROM = eINSTANCE.getDateRange_Dsl_DateRange_from();

    /**
     * The meta object literal for the '<em><b>Dsl Date Range To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE_RANGE__DSL_DATE_RANGE_TO = eINSTANCE.getDateRange_Dsl_DateRange_To();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DateSetImpl <em>Date Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DateSetImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDateSet()
     * @generated
     */
    EClass DATE_SET = eINSTANCE.getDateSet();

    /**
     * The meta object literal for the '<em><b>Dsl Date Set Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE_SET__DSL_DATE_SET_VALUES = eINSTANCE.getDateSet_DslDateSet_Values();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenDayNameImpl <em>When Day Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenDayNameImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenDayName()
     * @generated
     */
    EClass WHEN_DAY_NAME = eINSTANCE.getWhenDayName();

    /**
     * The meta object literal for the '<em><b>Dsl When Day Name Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_CASES = eINSTANCE.getWhenDayName_Dsl_WhenDayName_Cases();

    /**
     * The meta object literal for the '<em><b>Dsl When Day Name Other</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_OTHER = eINSTANCE.getWhenDayName_Dsl_WhenDayName_Other();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenDayNameCaseImpl <em>When Day Name Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenDayNameCaseImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenDayNameCase()
     * @generated
     */
    EClass WHEN_DAY_NAME_CASE = eINSTANCE.getWhenDayNameCase();

    /**
     * The meta object literal for the '<em><b>Dsl When Day Name Case Days</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_DAYS = eINSTANCE.getWhenDayNameCase_Dsl_WhenDayNameCase_Days();

    /**
     * The meta object literal for the '<em><b>Dsl When Day Name Case True actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_TRUE_ACTIONS = eINSTANCE.getWhenDayNameCase_Dsl_WhenDayNameCase_True_actions();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.AbstractDayNameCaseImpl <em>Abstract Day Name Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.AbstractDayNameCaseImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAbstractDayNameCase()
     * @generated
     */
    EClass ABSTRACT_DAY_NAME_CASE = eINSTANCE.getAbstractDayNameCase();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DayNameRangeImpl <em>Day Name Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DayNameRangeImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDayNameRange()
     * @generated
     */
    EClass DAY_NAME_RANGE = eINSTANCE.getDayNameRange();

    /**
     * The meta object literal for the '<em><b>Dsl Day Name Range from</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_FROM = eINSTANCE.getDayNameRange_Dsl_DayNameRange_from();

    /**
     * The meta object literal for the '<em><b>Dsl Day Name Range To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_TO = eINSTANCE.getDayNameRange_Dsl_DayNameRange_To();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DayNameSetImpl <em>Day Name Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DayNameSetImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDayNameSet()
     * @generated
     */
    EClass DAY_NAME_SET = eINSTANCE.getDayNameSet();

    /**
     * The meta object literal for the '<em><b>Dsl Day Name Set Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAY_NAME_SET__DSL_DAY_NAME_SET_VALUES = eINSTANCE.getDayNameSet_DslDayNameSet_Values();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenPentecostarionDayImpl <em>When Pentecostarion Day</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenPentecostarionDayImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenPentecostarionDay()
     * @generated
     */
    EClass WHEN_PENTECOSTARION_DAY = eINSTANCE.getWhenPentecostarionDay();

    /**
     * The meta object literal for the '<em><b>Dsl When Pentecostarion Day Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_CASES = eINSTANCE.getWhenPentecostarionDay_Dsl_WhenPentecostarionDay_Cases();

    /**
     * The meta object literal for the '<em><b>Dsl When Pentecostarion Day Other</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_OTHER = eINSTANCE.getWhenPentecostarionDay_Dsl_WhenPentecostarionDay_Other();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenTriodionDayImpl <em>When Triodion Day</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenTriodionDayImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenTriodionDay()
     * @generated
     */
    EClass WHEN_TRIODION_DAY = eINSTANCE.getWhenTriodionDay();

    /**
     * The meta object literal for the '<em><b>Dsl When Triodion Day Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_TRIODION_DAY__DSL_WHEN_TRIODION_DAY_CASES = eINSTANCE.getWhenTriodionDay_Dsl_WhenTriodionDay_Cases();

    /**
     * The meta object literal for the '<em><b>Dsl When Triodion Day Other</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_TRIODION_DAY__DSL_WHEN_TRIODION_DAY_OTHER = eINSTANCE.getWhenTriodionDay_Dsl_WhenTriodionDay_Other();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenMovableCycleDayImpl <em>When Movable Cycle Day</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenMovableCycleDayImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenMovableCycleDay()
     * @generated
     */
    EClass WHEN_MOVABLE_CYCLE_DAY = eINSTANCE.getWhenMovableCycleDay();

    /**
     * The meta object literal for the '<em><b>Dsl When Movable Cycle Day Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_MOVABLE_CYCLE_DAY__DSL_WHEN_MOVABLE_CYCLE_DAY_CASES = eINSTANCE.getWhenMovableCycleDay_Dsl_WhenMovableCycleDay_Cases();

    /**
     * The meta object literal for the '<em><b>Dsl When Movable Cycle Day Other</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_MOVABLE_CYCLE_DAY__DSL_WHEN_MOVABLE_CYCLE_DAY_OTHER = eINSTANCE.getWhenMovableCycleDay_Dsl_WhenMovableCycleDay_Other();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenSundayAfterElevationOfCrossDayImpl <em>When Sunday After Elevation Of Cross Day</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenSundayAfterElevationOfCrossDayImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenSundayAfterElevationOfCrossDay()
     * @generated
     */
    EClass WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY = eINSTANCE.getWhenSundayAfterElevationOfCrossDay();

    /**
     * The meta object literal for the '<em><b>Dsl When Sunday After Elevation Of Cross Day Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_CASES = eINSTANCE.getWhenSundayAfterElevationOfCrossDay_Dsl_WhenSundayAfterElevationOfCrossDay_Cases();

    /**
     * The meta object literal for the '<em><b>Dsl When Sunday After Elevation Of Cross Day Other</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_OTHER = eINSTANCE.getWhenSundayAfterElevationOfCrossDay_Dsl_WhenSundayAfterElevationOfCrossDay_Other();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenLukanCycleDayImpl <em>When Lukan Cycle Day</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenLukanCycleDayImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenLukanCycleDay()
     * @generated
     */
    EClass WHEN_LUKAN_CYCLE_DAY = eINSTANCE.getWhenLukanCycleDay();

    /**
     * The meta object literal for the '<em><b>Dsl When Lukan Cycle Day Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_CASES = eINSTANCE.getWhenLukanCycleDay_Dsl_WhenLukanCycleDay_Cases();

    /**
     * The meta object literal for the '<em><b>Dsl When Lukan Cycle Day Other</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_OTHER = eINSTANCE.getWhenLukanCycleDay_Dsl_WhenLukanCycleDay_Other();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenPaschaImpl <em>When Pascha</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenPaschaImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenPascha()
     * @generated
     */
    EClass WHEN_PASCHA = eINSTANCE.getWhenPascha();

    /**
     * The meta object literal for the '<em><b>Dsl When Pascha true actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_PASCHA__DSL_WHEN_PASCHA_TRUE_ACTIONS = eINSTANCE.getWhenPascha_Dsl_WhenPascha_true_actions();

    /**
     * The meta object literal for the '<em><b>Dsl When Pascha Other actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_PASCHA__DSL_WHEN_PASCHA_OTHER_ACTIONS = eINSTANCE.getWhenPascha_Dsl_WhenPascha_Other_actions();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenOtherImpl <em>When Other</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenOtherImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenOther()
     * @generated
     */
    EClass WHEN_OTHER = eINSTANCE.getWhenOther();

    /**
     * The meta object literal for the '<em><b>Dsl When Case Other actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_OTHER__DSL_WHEN_CASE_OTHER_ACTIONS = eINSTANCE.getWhenOther_Dsl_WhenCase_Other_actions();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenPeriodCaseImpl <em>When Period Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenPeriodCaseImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenPeriodCase()
     * @generated
     */
    EClass WHEN_PERIOD_CASE = eINSTANCE.getWhenPeriodCase();

    /**
     * The meta object literal for the '<em><b>Dsl When Period Case Days</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_DAYS = eINSTANCE.getWhenPeriodCase_Dsl_WhenPeriodCase_Days();

    /**
     * The meta object literal for the '<em><b>Dsl When Period Case True actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_TRUE_ACTIONS = eINSTANCE.getWhenPeriodCase_Dsl_WhenPeriodCase_True_actions();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.AbstractDayCaseImpl <em>Abstract Day Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.AbstractDayCaseImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getAbstractDayCase()
     * @generated
     */
    EClass ABSTRACT_DAY_CASE = eINSTANCE.getAbstractDayCase();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DayRangeImpl <em>Day Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DayRangeImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDayRange()
     * @generated
     */
    EClass DAY_RANGE = eINSTANCE.getDayRange();

    /**
     * The meta object literal for the '<em><b>Dsl Day Range from</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAY_RANGE__DSL_DAY_RANGE_FROM = eINSTANCE.getDayRange_Dsl_DayRange_from();

    /**
     * The meta object literal for the '<em><b>Dsl Range To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAY_RANGE__DSL_RANGE_TO = eINSTANCE.getDayRange_Dsl_Range_To();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.DaySetImpl <em>Day Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.DaySetImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDaySet()
     * @generated
     */
    EClass DAY_SET = eINSTANCE.getDaySet();

    /**
     * The meta object literal for the '<em><b>Dsl Set Value Days</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAY_SET__DSL_SET_VALUE_DAYS = eINSTANCE.getDaySet_DslSetValue_Days();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenModeOfWeekImpl <em>When Mode Of Week</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenModeOfWeekImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenModeOfWeek()
     * @generated
     */
    EClass WHEN_MODE_OF_WEEK = eINSTANCE.getWhenModeOfWeek();

    /**
     * The meta object literal for the '<em><b>Dsl When Mode Of Week Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_CASES = eINSTANCE.getWhenModeOfWeek_Dsl_WhenModeOfWeek_Cases();

    /**
     * The meta object literal for the '<em><b>Dsl When Mode Of Week Other</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_OTHER = eINSTANCE.getWhenModeOfWeek_Dsl_WhenModeOfWeek_Other();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenModeOfWeekCaseImpl <em>When Mode Of Week Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenModeOfWeekCaseImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenModeOfWeekCase()
     * @generated
     */
    EClass WHEN_MODE_OF_WEEK_CASE = eINSTANCE.getWhenModeOfWeekCase();

    /**
     * The meta object literal for the '<em><b>Dsl When Mode Of Week Case Days</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_MODE_OF_WEEK_CASE__DSL_WHEN_MODE_OF_WEEK_CASE_DAYS = eINSTANCE.getWhenModeOfWeekCase_Dsl_WhenModeOfWeekCase_Days();

    /**
     * The meta object literal for the '<em><b>Dsl When Mode Of Week Case True actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_MODE_OF_WEEK_CASE__DSL_WHEN_MODE_OF_WEEK_CASE_TRUE_ACTIONS = eINSTANCE.getWhenModeOfWeekCase_Dsl_WhenModeOfWeekCase_True_actions();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.ModeOfWeekSetImpl <em>Mode Of Week Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.ModeOfWeekSetImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getModeOfWeekSet()
     * @generated
     */
    EClass MODE_OF_WEEK_SET = eINSTANCE.getModeOfWeekSet();

    /**
     * The meta object literal for the '<em><b>Dsl Mode Of Week Set MO Ws</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE_OF_WEEK_SET__DSL_MODE_OF_WEEK_SET_MO_WS = eINSTANCE.getModeOfWeekSet_Dsl_ModeOfWeekSet_MOWs();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenSundaysBeforeTriodionImpl <em>When Sundays Before Triodion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenSundaysBeforeTriodionImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenSundaysBeforeTriodion()
     * @generated
     */
    EClass WHEN_SUNDAYS_BEFORE_TRIODION = eINSTANCE.getWhenSundaysBeforeTriodion();

    /**
     * The meta object literal for the '<em><b>Dsl When Sundays Before Triodion Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_SUNDAYS_BEFORE_TRIODION__DSL_WHEN_SUNDAYS_BEFORE_TRIODION_CASES = eINSTANCE.getWhenSundaysBeforeTriodion_Dsl_WhenSundaysBeforeTriodion_Cases();

    /**
     * The meta object literal for the '<em><b>Dsl Sundays Before Triodion Other</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_SUNDAYS_BEFORE_TRIODION__DSL_SUNDAYS_BEFORE_TRIODION_OTHER = eINSTANCE.getWhenSundaysBeforeTriodion_Dsl_SundaysBeforeTriodion_Other();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.SundaysBeforeTriodionCaseImpl <em>Sundays Before Triodion Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.SundaysBeforeTriodionCaseImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSundaysBeforeTriodionCase()
     * @generated
     */
    EClass SUNDAYS_BEFORE_TRIODION_CASE = eINSTANCE.getSundaysBeforeTriodionCase();

    /**
     * The meta object literal for the '<em><b>Dsl Sundays Before Triodion Case Days</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_DAYS = eINSTANCE.getSundaysBeforeTriodionCase_Dsl_SundaysBeforeTriodionCase_Days();

    /**
     * The meta object literal for the '<em><b>Dsl Sundays Before Triodion Case True actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_TRUE_ACTIONS = eINSTANCE.getSundaysBeforeTriodionCase_Dsl_SundaysBeforeTriodionCase_True_actions();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenExistsImpl <em>When Exists</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenExistsImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenExists()
     * @generated
     */
    EClass WHEN_EXISTS = eINSTANCE.getWhenExists();

    /**
     * The meta object literal for the '<em><b>Dsl When Exists Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_EXISTS__DSL_WHEN_EXISTS_CASES = eINSTANCE.getWhenExists_Dsl_WhenExists_Cases();

    /**
     * The meta object literal for the '<em><b>Dsl When Exists Other</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_EXISTS__DSL_WHEN_EXISTS_OTHER = eINSTANCE.getWhenExists_Dsl_WhenExists_Other();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.impl.WhenExistsCaseImpl <em>When Exists Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.impl.WhenExistsCaseImpl
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getWhenExistsCase()
     * @generated
     */
    EClass WHEN_EXISTS_CASE = eINSTANCE.getWhenExistsCase();

    /**
     * The meta object literal for the '<em><b>Dsl When Exists Case Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_REF = eINSTANCE.getWhenExistsCase_Dsl_WhenExistsCase_Ref();

    /**
     * The meta object literal for the '<em><b>Dsl When Exists Case True actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_TRUE_ACTIONS = eINSTANCE.getWhenExistsCase_Dsl_WhenExistsCase_True_actions();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.VersionSwitchType <em>Version Switch Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.VersionSwitchType
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getVersionSwitchType()
     * @generated
     */
    EEnum VERSION_SWITCH_TYPE = eINSTANCE.getVersionSwitchType();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.Language <em>Language</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.Language
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getLanguage()
     * @generated
     */
    EEnum LANGUAGE = eINSTANCE.getLanguage();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.BreakType <em>Break Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.BreakType
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getBreakType()
     * @generated
     */
    EEnum BREAK_TYPE = eINSTANCE.getBreakType();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.TemplateStatuses <em>Template Statuses</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.TemplateStatuses
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getTemplateStatuses()
     * @generated
     */
    EEnum TEMPLATE_STATUSES = eINSTANCE.getTemplateStatuses();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.Null <em>Null</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.Null
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getNull()
     * @generated
     */
    EEnum NULL = eINSTANCE.getNull();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.ModeTypes <em>Mode Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.ModeTypes
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getModeTypes()
     * @generated
     */
    EEnum MODE_TYPES = eINSTANCE.getModeTypes();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.DowTypes <em>Dow Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.DowTypes
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDowTypes()
     * @generated
     */
    EEnum DOW_TYPES = eINSTANCE.getDowTypes();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.BookTypes <em>Book Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.BookTypes
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getBookTypes()
     * @generated
     */
    EEnum BOOK_TYPES = eINSTANCE.getBookTypes();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.Seasons <em>Seasons</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.Seasons
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getSeasons()
     * @generated
     */
    EEnum SEASONS = eINSTANCE.getSeasons();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.DayOfMonthTypes <em>Day Of Month Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.DayOfMonthTypes
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDayOfMonthTypes()
     * @generated
     */
    EEnum DAY_OF_MONTH_TYPES = eINSTANCE.getDayOfMonthTypes();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.PeriodType <em>Period Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.PeriodType
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getPeriodType()
     * @generated
     */
    EEnum PERIOD_TYPE = eINSTANCE.getPeriodType();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.DayOfWeek <em>Day Of Week</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.DayOfWeek
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getDayOfWeek()
     * @generated
     */
    EEnum DAY_OF_WEEK = eINSTANCE.getDayOfWeek();

    /**
     * The meta object literal for the '{@link net.ages.workbench.templates.dsl.atem.MonthName <em>Month Name</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.templates.dsl.atem.MonthName
     * @see net.ages.workbench.templates.dsl.atem.impl.AtemPackageImpl#getMonthName()
     * @generated
     */
    EEnum MONTH_NAME = eINSTANCE.getMonthName();

  }

} //AtemPackage
