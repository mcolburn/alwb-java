/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Exists</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenExists#getDsl_WhenExists_Cases <em>Dsl When Exists Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenExists#getDsl_WhenExists_Other <em>Dsl When Exists Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenExists()
 * @model
 * @generated
 */
public interface WhenExists extends AbstractComponent, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Dsl When Exists Cases</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.WhenExistsCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Exists Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Exists Cases</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenExists_Dsl_WhenExists_Cases()
   * @model containment="true"
   * @generated
   */
  EList<WhenExistsCase> getDsl_WhenExists_Cases();

  /**
   * Returns the value of the '<em><b>Dsl When Exists Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Exists Other</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Exists Other</em>' containment reference.
   * @see #setDsl_WhenExists_Other(WhenOther)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenExists_Dsl_WhenExists_Other()
   * @model containment="true"
   * @generated
   */
  WhenOther getDsl_WhenExists_Other();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenExists#getDsl_WhenExists_Other <em>Dsl When Exists Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Exists Other</em>' containment reference.
   * @see #getDsl_WhenExists_Other()
   * @generated
   */
  void setDsl_WhenExists_Other(WhenOther value);

} // WhenExists
