/**
 */
package net.ages.workbench.resources.dsl.ares;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.resources.dsl.ares.Definition#getName <em>Name</em>}</li>
 *   <li>{@link net.ages.workbench.resources.dsl.ares.Definition#getDsl_Definition_Text <em>Dsl Definition Text</em>}</li>
 *   <li>{@link net.ages.workbench.resources.dsl.ares.Definition#getDsl_Definition_Ref <em>Dsl Definition Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.resources.dsl.ares.AresPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject
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
   * @see net.ages.workbench.resources.dsl.ares.AresPackage#getDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.ages.workbench.resources.dsl.ares.Definition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dsl Definition Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Definition Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Definition Text</em>' attribute.
   * @see #setDsl_Definition_Text(String)
   * @see net.ages.workbench.resources.dsl.ares.AresPackage#getDefinition_Dsl_Definition_Text()
   * @model
   * @generated
   */
  String getDsl_Definition_Text();

  /**
   * Sets the value of the '{@link net.ages.workbench.resources.dsl.ares.Definition#getDsl_Definition_Text <em>Dsl Definition Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Definition Text</em>' attribute.
   * @see #getDsl_Definition_Text()
   * @generated
   */
  void setDsl_Definition_Text(String value);

  /**
   * Returns the value of the '<em><b>Dsl Definition Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Definition Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Definition Ref</em>' reference.
   * @see #setDsl_Definition_Ref(Definition)
   * @see net.ages.workbench.resources.dsl.ares.AresPackage#getDefinition_Dsl_Definition_Ref()
   * @model
   * @generated
   */
  Definition getDsl_Definition_Ref();

  /**
   * Sets the value of the '{@link net.ages.workbench.resources.dsl.ares.Definition#getDsl_Definition_Ref <em>Dsl Definition Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Definition Ref</em>' reference.
   * @see #getDsl_Definition_Ref()
   * @generated
   */
  void setDsl_Definition_Ref(Definition value);

} // Definition
