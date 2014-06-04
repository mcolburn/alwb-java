/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Head#getDsl_Head_components <em>Dsl Head components</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getHead()
 * @model
 * @generated
 */
public interface Head extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl Head components</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.HeadComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Head components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Head components</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getHead_Dsl_Head_components()
   * @model containment="true"
   * @generated
   */
  EList<HeadComponent> getDsl_Head_components();

} // Head
