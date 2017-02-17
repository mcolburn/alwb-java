/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Pentecostarion Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay#getDsl_WhenPentecostarionDay_Cases <em>Dsl When Pentecostarion Day Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay#getDsl_WhenPentecostarionDay_Other <em>Dsl When Pentecostarion Day Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenPentecostarionDay()
 * @model
 * @generated
 */
public interface WhenPentecostarionDay extends AbstractComponent, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Dsl When Pentecostarion Day Cases</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.WhenPeriodCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Pentecostarion Day Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Pentecostarion Day Cases</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenPentecostarionDay_Dsl_WhenPentecostarionDay_Cases()
   * @model containment="true"
   * @generated
   */
  EList<WhenPeriodCase> getDsl_WhenPentecostarionDay_Cases();

  /**
   * Returns the value of the '<em><b>Dsl When Pentecostarion Day Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Pentecostarion Day Other</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Pentecostarion Day Other</em>' containment reference.
   * @see #setDsl_WhenPentecostarionDay_Other(WhenOther)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenPentecostarionDay_Dsl_WhenPentecostarionDay_Other()
   * @model containment="true"
   * @generated
   */
  WhenOther getDsl_WhenPentecostarionDay_Other();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay#getDsl_WhenPentecostarionDay_Other <em>Dsl When Pentecostarion Day Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Pentecostarion Day Other</em>' containment reference.
   * @see #getDsl_WhenPentecostarionDay_Other()
   * @generated
   */
  void setDsl_WhenPentecostarionDay_Other(WhenOther value);

} // WhenPentecostarionDay
