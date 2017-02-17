/**
 */
package net.ages.workbench.templates.dsl.atem;

import net.ages.workbench.resources.dsl.ares.Definition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Exists Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenExistsCase#getDsl_WhenExistsCase_Ref <em>Dsl When Exists Case Ref</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenExistsCase#getDsl_WhenExistsCase_True_actions <em>Dsl When Exists Case True actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenExistsCase()
 * @model
 * @generated
 */
public interface WhenExistsCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl When Exists Case Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Exists Case Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Exists Case Ref</em>' reference.
   * @see #setDsl_WhenExistsCase_Ref(Definition)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenExistsCase_Dsl_WhenExistsCase_Ref()
   * @model
   * @generated
   */
  Definition getDsl_WhenExistsCase_Ref();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenExistsCase#getDsl_WhenExistsCase_Ref <em>Dsl When Exists Case Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Exists Case Ref</em>' reference.
   * @see #getDsl_WhenExistsCase_Ref()
   * @generated
   */
  void setDsl_WhenExistsCase_Ref(Definition value);

  /**
   * Returns the value of the '<em><b>Dsl When Exists Case True actions</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.AbstractComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Exists Case True actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Exists Case True actions</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenExistsCase_Dsl_WhenExistsCase_True_actions()
   * @model containment="true"
   * @generated
   */
  EList<AbstractComponent> getDsl_WhenExistsCase_True_actions();

} // WhenExistsCase
