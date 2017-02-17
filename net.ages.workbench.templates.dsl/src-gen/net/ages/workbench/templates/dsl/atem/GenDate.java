/**
 */
package net.ages.workbench.templates.dsl.atem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.GenDate#isDsl_Display_Date <em>Dsl Display Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getGenDate()
 * @model
 * @generated
 */
public interface GenDate extends LdpType
{
  /**
   * Returns the value of the '<em><b>Dsl Display Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Display Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Display Date</em>' attribute.
   * @see #setDsl_Display_Date(boolean)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getGenDate_Dsl_Display_Date()
   * @model
   * @generated
   */
  boolean isDsl_Display_Date();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.GenDate#isDsl_Display_Date <em>Dsl Display Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Display Date</em>' attribute.
   * @see #isDsl_Display_Date()
   * @generated
   */
  void setDsl_Display_Date(boolean value);

} // GenDate
