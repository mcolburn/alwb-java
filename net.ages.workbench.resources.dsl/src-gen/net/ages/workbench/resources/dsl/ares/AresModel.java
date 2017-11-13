/**
 */
package net.ages.workbench.resources.dsl.ares;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.resources.dsl.ares.AresModel#getName <em>Name</em>}</li>
 *   <li>{@link net.ages.workbench.resources.dsl.ares.AresModel#getDsl_Model_definitions <em>Dsl Model definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.resources.dsl.ares.AresPackage#getAresModel()
 * @model
 * @generated
 */
public interface AresModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.ages.workbench.resources.dsl.ares.AresPackage#getAresModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.ages.workbench.resources.dsl.ares.AresModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dsl Model definitions</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.resources.dsl.ares.Definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Model definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Model definitions</em>' containment reference list.
   * @see net.ages.workbench.resources.dsl.ares.AresPackage#getAresModel_Dsl_Model_definitions()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getDsl_Model_definitions();

} // AresModel
