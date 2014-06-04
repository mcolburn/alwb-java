/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.TemplateTitle#getDsl_TemplateTitle_Elements <em>Dsl Template Title Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getTemplateTitle()
 * @model
 * @generated
 */
public interface TemplateTitle extends HeadComponent
{
  /**
   * Returns the value of the '<em><b>Dsl Template Title Elements</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.HeaderFooterFragment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Template Title Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Template Title Elements</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getTemplateTitle_Dsl_TemplateTitle_Elements()
   * @model containment="true"
   * @generated
   */
  EList<HeaderFooterFragment> getDsl_TemplateTitle_Elements();

} // TemplateTitle
