/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sundays Before Triodion Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase#getDsl_SundaysBeforeTriodionCase_Days <em>Dsl Sundays Before Triodion Case Days</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase#getDsl_SundaysBeforeTriodionCase_True_actions <em>Dsl Sundays Before Triodion Case True actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getSundaysBeforeTriodionCase()
 * @model
 * @generated
 */
public interface SundaysBeforeTriodionCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl Sundays Before Triodion Case Days</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Sundays Before Triodion Case Days</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Sundays Before Triodion Case Days</em>' attribute.
   * @see #setDsl_SundaysBeforeTriodionCase_Days(int)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getSundaysBeforeTriodionCase_Dsl_SundaysBeforeTriodionCase_Days()
   * @model
   * @generated
   */
  int getDsl_SundaysBeforeTriodionCase_Days();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase#getDsl_SundaysBeforeTriodionCase_Days <em>Dsl Sundays Before Triodion Case Days</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Sundays Before Triodion Case Days</em>' attribute.
   * @see #getDsl_SundaysBeforeTriodionCase_Days()
   * @generated
   */
  void setDsl_SundaysBeforeTriodionCase_Days(int value);

  /**
   * Returns the value of the '<em><b>Dsl Sundays Before Triodion Case True actions</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.AbstractComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Sundays Before Triodion Case True actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Sundays Before Triodion Case True actions</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getSundaysBeforeTriodionCase_Dsl_SundaysBeforeTriodionCase_True_actions()
   * @model containment="true"
   * @generated
   */
  EList<AbstractComponent> getDsl_SundaysBeforeTriodionCase_True_actions();

} // SundaysBeforeTriodionCase
