/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Of Week Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.ModeOfWeekSet#getDsl_ModeOfWeekSet_MOWs <em>Dsl Mode Of Week Set MO Ws</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getModeOfWeekSet()
 * @model
 * @generated
 */
public interface ModeOfWeekSet extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl Mode Of Week Set MO Ws</b></em>' attribute list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.ModeTypes}.
   * The literals are from the enumeration {@link net.ages.workbench.templates.dsl.atem.ModeTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Mode Of Week Set MO Ws</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Mode Of Week Set MO Ws</em>' attribute list.
   * @see net.ages.workbench.templates.dsl.atem.ModeTypes
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getModeOfWeekSet_Dsl_ModeOfWeekSet_MOWs()
   * @model unique="false"
   * @generated
   */
  EList<ModeTypes> getDsl_ModeOfWeekSet_MOWs();

} // ModeOfWeekSet
