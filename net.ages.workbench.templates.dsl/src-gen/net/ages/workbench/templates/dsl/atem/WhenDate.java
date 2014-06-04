/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenDate#getDsl_WhenDate_Cases <em>Dsl When Date Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenDate#getDsl_WhenDate_Other <em>Dsl When Date Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenDate()
 * @model
 * @generated
 */
public interface WhenDate extends AbstractComponent, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Dsl When Date Cases</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.WhenDateCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Date Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Date Cases</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenDate_Dsl_WhenDate_Cases()
   * @model containment="true"
   * @generated
   */
  EList<WhenDateCase> getDsl_WhenDate_Cases();

  /**
   * Returns the value of the '<em><b>Dsl When Date Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Date Other</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Date Other</em>' containment reference.
   * @see #setDsl_WhenDate_Other(WhenOther)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenDate_Dsl_WhenDate_Other()
   * @model containment="true"
   * @generated
   */
  WhenOther getDsl_WhenDate_Other();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenDate#getDsl_WhenDate_Other <em>Dsl When Date Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Date Other</em>' containment reference.
   * @see #getDsl_WhenDate_Other()
   * @generated
   */
  void setDsl_WhenDate_Other(WhenOther value);

} // WhenDate
