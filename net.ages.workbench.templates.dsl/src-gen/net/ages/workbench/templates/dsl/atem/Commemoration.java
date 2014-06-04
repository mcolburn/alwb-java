/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commemoration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Commemoration#getDsl_Commemoration_Elements <em>Dsl Commemoration Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getCommemoration()
 * @model
 * @generated
 */
public interface Commemoration extends HeadComponent
{
  /**
   * Returns the value of the '<em><b>Dsl Commemoration Elements</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.HeaderFooterFragment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Commemoration Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Commemoration Elements</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getCommemoration_Dsl_Commemoration_Elements()
   * @model containment="true"
   * @generated
   */
  EList<HeaderFooterFragment> getDsl_Commemoration_Elements();

} // Commemoration
