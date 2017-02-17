/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Date Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenDateCase#getDsl_WhenDate_Case_Month <em>Dsl When Date Case Month</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenDateCase#getDsl_WhenDateCase_Days <em>Dsl When Date Case Days</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenDateCase#getDsl_WhenDateCase_True_actions <em>Dsl When Date Case True actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenDateCase()
 * @model
 * @generated
 */
public interface WhenDateCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl When Date Case Month</b></em>' attribute.
   * The literals are from the enumeration {@link net.ages.workbench.templates.dsl.atem.MonthName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Date Case Month</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Date Case Month</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.MonthName
   * @see #setDsl_WhenDate_Case_Month(MonthName)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenDateCase_Dsl_WhenDate_Case_Month()
   * @model
   * @generated
   */
  MonthName getDsl_WhenDate_Case_Month();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenDateCase#getDsl_WhenDate_Case_Month <em>Dsl When Date Case Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Date Case Month</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.MonthName
   * @see #getDsl_WhenDate_Case_Month()
   * @generated
   */
  void setDsl_WhenDate_Case_Month(MonthName value);

  /**
   * Returns the value of the '<em><b>Dsl When Date Case Days</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Date Case Days</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Date Case Days</em>' containment reference.
   * @see #setDsl_WhenDateCase_Days(AbstractDateCase)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenDateCase_Dsl_WhenDateCase_Days()
   * @model containment="true"
   * @generated
   */
  AbstractDateCase getDsl_WhenDateCase_Days();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenDateCase#getDsl_WhenDateCase_Days <em>Dsl When Date Case Days</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Date Case Days</em>' containment reference.
   * @see #getDsl_WhenDateCase_Days()
   * @generated
   */
  void setDsl_WhenDateCase_Days(AbstractDateCase value);

  /**
   * Returns the value of the '<em><b>Dsl When Date Case True actions</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.AbstractComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Date Case True actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Date Case True actions</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenDateCase_Dsl_WhenDateCase_True_actions()
   * @model containment="true"
   * @generated
   */
  EList<AbstractComponent> getDsl_WhenDateCase_True_actions();

} // WhenDateCase
