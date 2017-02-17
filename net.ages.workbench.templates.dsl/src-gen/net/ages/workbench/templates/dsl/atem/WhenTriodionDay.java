/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Triodion Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenTriodionDay#getDsl_WhenTriodionDay_Cases <em>Dsl When Triodion Day Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenTriodionDay#getDsl_WhenTriodionDay_Other <em>Dsl When Triodion Day Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenTriodionDay()
 * @model
 * @generated
 */
public interface WhenTriodionDay extends AbstractComponent, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Dsl When Triodion Day Cases</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.WhenPeriodCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Triodion Day Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Triodion Day Cases</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenTriodionDay_Dsl_WhenTriodionDay_Cases()
   * @model containment="true"
   * @generated
   */
  EList<WhenPeriodCase> getDsl_WhenTriodionDay_Cases();

  /**
   * Returns the value of the '<em><b>Dsl When Triodion Day Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Triodion Day Other</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Triodion Day Other</em>' containment reference.
   * @see #setDsl_WhenTriodionDay_Other(WhenOther)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenTriodionDay_Dsl_WhenTriodionDay_Other()
   * @model containment="true"
   * @generated
   */
  WhenOther getDsl_WhenTriodionDay_Other();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenTriodionDay#getDsl_WhenTriodionDay_Other <em>Dsl When Triodion Day Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Triodion Day Other</em>' containment reference.
   * @see #getDsl_WhenTriodionDay_Other()
   * @generated
   */
  void setDsl_WhenTriodionDay_Other(WhenOther value);

} // WhenTriodionDay
