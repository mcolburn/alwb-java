/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Footer Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.HeaderFooterColumn#getDsl_HeaderFooterColumn_fragments <em>Dsl Header Footer Column fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getHeaderFooterColumn()
 * @model
 * @generated
 */
public interface HeaderFooterColumn extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl Header Footer Column fragments</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.HeaderFooterFragment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Header Footer Column fragments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Header Footer Column fragments</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getHeaderFooterColumn_Dsl_HeaderFooterColumn_fragments()
   * @model containment="true"
   * @generated
   */
  EList<HeaderFooterFragment> getDsl_HeaderFooterColumn_fragments();

} // HeaderFooterColumn
