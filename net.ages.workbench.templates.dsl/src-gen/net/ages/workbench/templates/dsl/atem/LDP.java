/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LDP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.LDP#getDsl_LDP <em>Dsl LDP</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getLDP()
 * @model
 * @generated
 */
public interface LDP extends ElementType
{
  /**
   * Returns the value of the '<em><b>Dsl LDP</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.LdpType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl LDP</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl LDP</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getLDP_Dsl_LDP()
   * @model containment="true"
   * @generated
   */
  EList<LdpType> getDsl_LDP();

} // LDP
