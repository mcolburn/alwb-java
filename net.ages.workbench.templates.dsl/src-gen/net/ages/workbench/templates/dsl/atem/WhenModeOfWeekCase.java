/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Mode Of Week Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase#getDsl_WhenModeOfWeekCase_Days <em>Dsl When Mode Of Week Case Days</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase#getDsl_WhenModeOfWeekCase_True_actions <em>Dsl When Mode Of Week Case True actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenModeOfWeekCase()
 * @model
 * @generated
 */
public interface WhenModeOfWeekCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl When Mode Of Week Case Days</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Mode Of Week Case Days</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Mode Of Week Case Days</em>' containment reference.
   * @see #setDsl_WhenModeOfWeekCase_Days(ModeOfWeekSet)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenModeOfWeekCase_Dsl_WhenModeOfWeekCase_Days()
   * @model containment="true"
   * @generated
   */
  ModeOfWeekSet getDsl_WhenModeOfWeekCase_Days();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase#getDsl_WhenModeOfWeekCase_Days <em>Dsl When Mode Of Week Case Days</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Mode Of Week Case Days</em>' containment reference.
   * @see #getDsl_WhenModeOfWeekCase_Days()
   * @generated
   */
  void setDsl_WhenModeOfWeekCase_Days(ModeOfWeekSet value);

  /**
   * Returns the value of the '<em><b>Dsl When Mode Of Week Case True actions</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.AbstractComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Mode Of Week Case True actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Mode Of Week Case True actions</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenModeOfWeekCase_Dsl_WhenModeOfWeekCase_True_actions()
   * @model containment="true"
   * @generated
   */
  EList<AbstractComponent> getDsl_WhenModeOfWeekCase_True_actions();

} // WhenModeOfWeekCase
