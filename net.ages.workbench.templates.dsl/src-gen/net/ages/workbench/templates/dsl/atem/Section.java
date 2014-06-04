/**
 */
package net.ages.workbench.templates.dsl.atem;

import net.ages.workbench.resources.dsl.ares.Definition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Section#getName <em>Name</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Section#getDsl_Section_Role <em>Dsl Section Role</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Section#getDsl_Section_Elements <em>Dsl Section Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends AbstractComponent, PrefaceElementType, SectionElementType
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
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getSection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.Section#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dsl Section Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Section Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Section Role</em>' reference.
   * @see #setDsl_Section_Role(Definition)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getSection_Dsl_Section_Role()
   * @model
   * @generated
   */
  Definition getDsl_Section_Role();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.Section#getDsl_Section_Role <em>Dsl Section Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Section Role</em>' reference.
   * @see #getDsl_Section_Role()
   * @generated
   */
  void setDsl_Section_Role(Definition value);

  /**
   * Returns the value of the '<em><b>Dsl Section Elements</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.SectionElementType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Section Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Section Elements</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getSection_Dsl_Section_Elements()
   * @model containment="true"
   * @generated
   */
  EList<SectionElementType> getDsl_Section_Elements();

} // Section
