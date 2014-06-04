/**
 */
package net.ages.workbench.templates.dsl.atem;

import net.ages.workbench.resources.dsl.ares.Definition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagged Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.TaggedText#getDsl_TaggedText_tag <em>Dsl Tagged Text tag</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.TaggedText#getDsl_TaggedText <em>Dsl Tagged Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getTaggedText()
 * @model
 * @generated
 */
public interface TaggedText extends ElementType
{
  /**
   * Returns the value of the '<em><b>Dsl Tagged Text tag</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Tagged Text tag</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Tagged Text tag</em>' reference.
   * @see #setDsl_TaggedText_tag(Definition)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getTaggedText_Dsl_TaggedText_tag()
   * @model
   * @generated
   */
  Definition getDsl_TaggedText_tag();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.TaggedText#getDsl_TaggedText_tag <em>Dsl Tagged Text tag</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Tagged Text tag</em>' reference.
   * @see #getDsl_TaggedText_tag()
   * @generated
   */
  void setDsl_TaggedText_tag(Definition value);

  /**
   * Returns the value of the '<em><b>Dsl Tagged Text</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.ElementType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Tagged Text</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Tagged Text</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getTaggedText_Dsl_TaggedText()
   * @model containment="true"
   * @generated
   */
  EList<ElementType> getDsl_TaggedText();

} // TaggedText
