/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.DateSet#getDslDateSet_Values <em>Dsl Date Set Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDateSet()
 * @model
 * @generated
 */
public interface DateSet extends AbstractDateCase
{
  /**
   * Returns the value of the '<em><b>Dsl Date Set Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Date Set Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Date Set Values</em>' attribute list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDateSet_DslDateSet_Values()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getDslDateSet_Values();

} // DateSet
