/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Mode Of Week</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeek#getDsl_WhenModeOfWeek_Cases <em>Dsl When Mode Of Week Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeek#getDsl_WhenModeOfWeek_Other <em>Dsl When Mode Of Week Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenModeOfWeek()
 * @model
 * @generated
 */
public interface WhenModeOfWeek extends AbstractComponent, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Dsl When Mode Of Week Cases</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Mode Of Week Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Mode Of Week Cases</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenModeOfWeek_Dsl_WhenModeOfWeek_Cases()
   * @model containment="true"
   * @generated
   */
  EList<WhenModeOfWeekCase> getDsl_WhenModeOfWeek_Cases();

  /**
   * Returns the value of the '<em><b>Dsl When Mode Of Week Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Mode Of Week Other</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Mode Of Week Other</em>' containment reference.
   * @see #setDsl_WhenModeOfWeek_Other(WhenOther)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenModeOfWeek_Dsl_WhenModeOfWeek_Other()
   * @model containment="true"
   * @generated
   */
  WhenOther getDsl_WhenModeOfWeek_Other();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenModeOfWeek#getDsl_WhenModeOfWeek_Other <em>Dsl When Mode Of Week Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Mode Of Week Other</em>' containment reference.
   * @see #getDsl_WhenModeOfWeek_Other()
   * @generated
   */
  void setDsl_WhenModeOfWeek_Other(WhenOther value);

} // WhenModeOfWeek
