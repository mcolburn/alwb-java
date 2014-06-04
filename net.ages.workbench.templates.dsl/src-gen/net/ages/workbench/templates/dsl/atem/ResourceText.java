/**
 */
package net.ages.workbench.templates.dsl.atem;

import net.ages.workbench.resources.dsl.ares.Definition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.ResourceText#getDsl_ResourceTextRef <em>Dsl Resource Text Ref</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.ResourceText#isDsl_ResourceText_Media_Off <em>Dsl Resource Text Media Off</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getResourceText()
 * @model
 * @generated
 */
public interface ResourceText extends ElementType
{
  /**
   * Returns the value of the '<em><b>Dsl Resource Text Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Resource Text Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Resource Text Ref</em>' reference.
   * @see #setDsl_ResourceTextRef(Definition)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getResourceText_Dsl_ResourceTextRef()
   * @model
   * @generated
   */
  Definition getDsl_ResourceTextRef();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.ResourceText#getDsl_ResourceTextRef <em>Dsl Resource Text Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Resource Text Ref</em>' reference.
   * @see #getDsl_ResourceTextRef()
   * @generated
   */
  void setDsl_ResourceTextRef(Definition value);

  /**
   * Returns the value of the '<em><b>Dsl Resource Text Media Off</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Resource Text Media Off</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Resource Text Media Off</em>' attribute.
   * @see #setDsl_ResourceText_Media_Off(boolean)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getResourceText_Dsl_ResourceText_Media_Off()
   * @model
   * @generated
   */
  boolean isDsl_ResourceText_Media_Off();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.ResourceText#isDsl_ResourceText_Media_Off <em>Dsl Resource Text Media Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Resource Text Media Off</em>' attribute.
   * @see #isDsl_ResourceText_Media_Off()
   * @generated
   */
  void setDsl_ResourceText_Media_Off(boolean value);

} // ResourceText
