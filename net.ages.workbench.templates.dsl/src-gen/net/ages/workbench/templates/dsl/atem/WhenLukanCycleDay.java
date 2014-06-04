/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Lukan Cycle Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay#getDsl_WhenLukanCycleDay_Cases <em>Dsl When Lukan Cycle Day Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay#getDsl_WhenLukanCycleDay_Other <em>Dsl When Lukan Cycle Day Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenLukanCycleDay()
 * @model
 * @generated
 */
public interface WhenLukanCycleDay extends AbstractComponent, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Dsl When Lukan Cycle Day Cases</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.WhenPeriodCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Lukan Cycle Day Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Lukan Cycle Day Cases</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenLukanCycleDay_Dsl_WhenLukanCycleDay_Cases()
   * @model containment="true"
   * @generated
   */
  EList<WhenPeriodCase> getDsl_WhenLukanCycleDay_Cases();

  /**
   * Returns the value of the '<em><b>Dsl When Lukan Cycle Day Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Lukan Cycle Day Other</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Lukan Cycle Day Other</em>' containment reference.
   * @see #setDsl_WhenLukanCycleDay_Other(WhenOther)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenLukanCycleDay_Dsl_WhenLukanCycleDay_Other()
   * @model containment="true"
   * @generated
   */
  WhenOther getDsl_WhenLukanCycleDay_Other();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay#getDsl_WhenLukanCycleDay_Other <em>Dsl When Lukan Cycle Day Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Lukan Cycle Day Other</em>' containment reference.
   * @see #getDsl_WhenLukanCycleDay_Other()
   * @generated
   */
  void setDsl_WhenLukanCycleDay_Other(WhenOther value);

} // WhenLukanCycleDay
