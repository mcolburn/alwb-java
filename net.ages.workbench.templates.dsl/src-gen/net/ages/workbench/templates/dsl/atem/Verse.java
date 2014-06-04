/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Verse#getDsl_Elements <em>Dsl Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getVerse()
 * @model
 * @generated
 */
public interface Verse extends AbstractComponent, SectionElementType
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
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getVerse_Dsl_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ElementType> getDsl_Elements();

} // Verse
