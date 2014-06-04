/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Period Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenPeriodCase#getDsl_WhenPeriodCase_Days <em>Dsl When Period Case Days</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenPeriodCase#getDsl_WhenPeriodCase_True_actions <em>Dsl When Period Case True actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenPeriodCase()
 * @model
 * @generated
 */
public interface WhenPeriodCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl When Period Case Days</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Period Case Days</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Period Case Days</em>' containment reference.
   * @see #setDsl_WhenPeriodCase_Days(AbstractDayCase)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenPeriodCase_Dsl_WhenPeriodCase_Days()
   * @model containment="true"
   * @generated
   */
  AbstractDayCase getDsl_WhenPeriodCase_Days();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenPeriodCase#getDsl_WhenPeriodCase_Days <em>Dsl When Period Case Days</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Period Case Days</em>' containment reference.
   * @see #getDsl_WhenPeriodCase_Days()
   * @generated
   */
  void setDsl_WhenPeriodCase_Days(AbstractDayCase value);

  /**
   * Returns the value of the '<em><b>Dsl When Period Case True actions</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.AbstractComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Period Case True actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Period Case True actions</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenPeriodCase_Dsl_WhenPeriodCase_True_actions()
   * @model containment="true"
   * @generated
   */
  EList<AbstractComponent> getDsl_WhenPeriodCase_True_actions();

} // WhenPeriodCase
