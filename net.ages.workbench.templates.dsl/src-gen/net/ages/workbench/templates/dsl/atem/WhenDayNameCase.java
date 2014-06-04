/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Day Name Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenDayNameCase#getDsl_WhenDayNameCase_Days <em>Dsl When Day Name Case Days</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenDayNameCase#getDsl_WhenDayNameCase_True_actions <em>Dsl When Day Name Case True actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenDayNameCase()
 * @model
 * @generated
 */
public interface WhenDayNameCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl When Day Name Case Days</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Day Name Case Days</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Day Name Case Days</em>' containment reference.
   * @see #setDsl_WhenDayNameCase_Days(AbstractDayNameCase)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenDayNameCase_Dsl_WhenDayNameCase_Days()
   * @model containment="true"
   * @generated
   */
  AbstractDayNameCase getDsl_WhenDayNameCase_Days();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenDayNameCase#getDsl_WhenDayNameCase_Days <em>Dsl When Day Name Case Days</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Day Name Case Days</em>' containment reference.
   * @see #getDsl_WhenDayNameCase_Days()
   * @generated
   */
  void setDsl_WhenDayNameCase_Days(AbstractDayNameCase value);

  /**
   * Returns the value of the '<em><b>Dsl When Day Name Case True actions</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.AbstractComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Day Name Case True actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Day Name Case True actions</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenDayNameCase_Dsl_WhenDayNameCase_True_actions()
   * @model containment="true"
   * @generated
   */
  EList<AbstractComponent> getDsl_WhenDayNameCase_True_actions();

} // WhenDayNameCase
