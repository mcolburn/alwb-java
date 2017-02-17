/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rubric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Rubric#getDsl_Elements <em>Dsl Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getRubric()
 * @model
 * @generated
 */
public interface Rubric extends AbstractComponent, SectionElementType
{
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
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getRubric_Dsl_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ElementType> getDsl_Elements();

} // Rubric
