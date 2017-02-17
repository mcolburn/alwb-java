/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Footer Odd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.PageFooterOdd#getDsl_PageHeader_columns <em>Dsl Page Header columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getPageFooterOdd()
 * @model
 * @generated
 */
public interface PageFooterOdd extends HeadComponent
{
  /**
   * Returns the value of the '<em><b>Dsl Page Header columns</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.HeaderFooterColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Page Header columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Page Header columns</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getPageFooterOdd_Dsl_PageHeader_columns()
   * @model containment="true"
   * @generated
   */
  EList<HeaderFooterColumn> getDsl_PageHeader_columns();

} // PageFooterOdd
