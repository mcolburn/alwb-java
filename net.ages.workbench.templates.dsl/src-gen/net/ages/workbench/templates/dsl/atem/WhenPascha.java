/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Pascha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenPascha#getDsl_WhenPascha_true_actions <em>Dsl When Pascha true actions</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenPascha#getDsl_WhenPascha_Other_actions <em>Dsl When Pascha Other actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenPascha()
 * @model
 * @generated
 */
public interface WhenPascha extends AbstractComponent, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Dsl When Pascha true actions</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.AbstractComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Pascha true actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Pascha true actions</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenPascha_Dsl_WhenPascha_true_actions()
   * @model containment="true"
   * @generated
   */
  EList<AbstractComponent> getDsl_WhenPascha_true_actions();

  /**
   * Returns the value of the '<em><b>Dsl When Pascha Other actions</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.AbstractComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Pascha Other actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Pascha Other actions</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenPascha_Dsl_WhenPascha_Other_actions()
   * @model containment="true"
   * @generated
   */
  EList<AbstractComponent> getDsl_WhenPascha_Other_actions();

} // WhenPascha
