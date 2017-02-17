/**
 */
package net.ages.workbench.templates.dsl.atem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Footer Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.HeaderFooterDate#isDsl_HeaderFooterDate <em>Dsl Header Footer Date</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.HeaderFooterDate#getDsl_HeaderFooterDate_Language <em>Dsl Header Footer Date Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getHeaderFooterDate()
 * @model
 * @generated
 */
public interface HeaderFooterDate extends HeaderFooterFragment
{
  /**
   * Returns the value of the '<em><b>Dsl Header Footer Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Header Footer Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Header Footer Date</em>' attribute.
   * @see #setDsl_HeaderFooterDate(boolean)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getHeaderFooterDate_Dsl_HeaderFooterDate()
   * @model
   * @generated
   */
  boolean isDsl_HeaderFooterDate();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterDate#isDsl_HeaderFooterDate <em>Dsl Header Footer Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Header Footer Date</em>' attribute.
   * @see #isDsl_HeaderFooterDate()
   * @generated
   */
  void setDsl_HeaderFooterDate(boolean value);

  /**
   * Returns the value of the '<em><b>Dsl Header Footer Date Language</b></em>' attribute.
   * The literals are from the enumeration {@link net.ages.workbench.templates.dsl.atem.Language}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Header Footer Date Language</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Header Footer Date Language</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.Language
   * @see #setDsl_HeaderFooterDate_Language(Language)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getHeaderFooterDate_Dsl_HeaderFooterDate_Language()
   * @model
   * @generated
   */
  Language getDsl_HeaderFooterDate_Language();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterDate#getDsl_HeaderFooterDate_Language <em>Dsl Header Footer Date Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Header Footer Date Language</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.Language
   * @see #getDsl_HeaderFooterDate_Language()
   * @generated
   */
  void setDsl_HeaderFooterDate_Language(Language value);

} // HeaderFooterDate
