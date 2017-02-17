/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.DaySet#getDslSetValue_Days <em>Dsl Set Value Days</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDaySet()
 * @model
 * @generated
 */
public interface DaySet extends AbstractDayCase
{
  /**
   * Returns the value of the '<em><b>Dsl Set Value Days</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Set Value Days</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Set Value Days</em>' attribute list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDaySet_DslSetValue_Days()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getDslSetValue_Days();

} // DaySet
