/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Movable Cycle Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenMovableCycleDay#getDsl_WhenMovableCycleDay_Cases <em>Dsl When Movable Cycle Day Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenMovableCycleDay#getDsl_WhenMovableCycleDay_Other <em>Dsl When Movable Cycle Day Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenMovableCycleDay()
 * @model
 * @generated
 */
public interface WhenMovableCycleDay extends AbstractComponent, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Dsl When Movable Cycle Day Cases</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.WhenPeriodCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Movable Cycle Day Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Movable Cycle Day Cases</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenMovableCycleDay_Dsl_WhenMovableCycleDay_Cases()
   * @model containment="true"
   * @generated
   */
  EList<WhenPeriodCase> getDsl_WhenMovableCycleDay_Cases();

  /**
   * Returns the value of the '<em><b>Dsl When Movable Cycle Day Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Movable Cycle Day Other</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Movable Cycle Day Other</em>' containment reference.
   * @see #setDsl_WhenMovableCycleDay_Other(WhenOther)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenMovableCycleDay_Dsl_WhenMovableCycleDay_Other()
   * @model containment="true"
   * @generated
   */
  WhenOther getDsl_WhenMovableCycleDay_Other();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenMovableCycleDay#getDsl_WhenMovableCycleDay_Other <em>Dsl When Movable Cycle Day Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Movable Cycle Day Other</em>' containment reference.
   * @see #getDsl_WhenMovableCycleDay_Other()
   * @generated
   */
  void setDsl_WhenMovableCycleDay_Other(WhenOther value);

} // WhenMovableCycleDay
