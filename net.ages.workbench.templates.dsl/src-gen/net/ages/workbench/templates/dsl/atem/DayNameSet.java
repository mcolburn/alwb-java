/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day Name Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.DayNameSet#getDslDayNameSet_Values <em>Dsl Day Name Set Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDayNameSet()
 * @model
 * @generated
 */
public interface DayNameSet extends AbstractDayNameCase
{
  /**
   * Returns the value of the '<em><b>Dsl Day Name Set Values</b></em>' attribute list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.DayOfWeek}.
   * The literals are from the enumeration {@link net.ages.workbench.templates.dsl.atem.DayOfWeek}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Day Name Set Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Day Name Set Values</em>' attribute list.
   * @see net.ages.workbench.templates.dsl.atem.DayOfWeek
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDayNameSet_DslDayNameSet_Values()
   * @model unique="false"
   * @generated
   */
  EList<DayOfWeek> getDslDayNameSet_Values();

} // DayNameSet
