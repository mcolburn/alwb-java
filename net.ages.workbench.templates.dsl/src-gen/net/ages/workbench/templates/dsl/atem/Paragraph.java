/**
 */
package net.ages.workbench.templates.dsl.atem;

import net.ages.workbench.resources.dsl.ares.Definition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Paragraph#getDsl_Para_Role <em>Dsl Para Role</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Paragraph#getDsl_Elements <em>Dsl Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends AbstractComponent, InfoElementType, PrefaceElementType, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Dsl Para Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Para Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Para Role</em>' reference.
   * @see #setDsl_Para_Role(Definition)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getParagraph_Dsl_Para_Role()
   * @model
   * @generated
   */
  Definition getDsl_Para_Role();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.Paragraph#getDsl_Para_Role <em>Dsl Para Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Para Role</em>' reference.
   * @see #getDsl_Para_Role()
   * @generated
   */
  void setDsl_Para_Role(Definition value);

  /**
   * Returns the value of the '<em><b>Dsl Elements</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.ElementType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Elements</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getParagraph_Dsl_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ElementType> getDsl_Elements();

} // Paragraph
