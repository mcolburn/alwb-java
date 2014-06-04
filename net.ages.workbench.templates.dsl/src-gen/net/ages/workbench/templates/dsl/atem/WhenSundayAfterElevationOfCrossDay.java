/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Sunday After Elevation Of Cross Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay#getDsl_WhenSundayAfterElevationOfCrossDay_Cases <em>Dsl When Sunday After Elevation Of Cross Day Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay#getDsl_WhenSundayAfterElevationOfCrossDay_Other <em>Dsl When Sunday After Elevation Of Cross Day Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenSundayAfterElevationOfCrossDay()
 * @model
 * @generated
 */
public interface WhenSundayAfterElevationOfCrossDay extends AbstractComponent, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Dsl When Sunday After Elevation Of Cross Day Cases</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.WhenDateCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Sunday After Elevation Of Cross Day Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Sunday After Elevation Of Cross Day Cases</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenSundayAfterElevationOfCrossDay_Dsl_WhenSundayAfterElevationOfCrossDay_Cases()
   * @model containment="true"
   * @generated
   */
  EList<WhenDateCase> getDsl_WhenSundayAfterElevationOfCrossDay_Cases();

  /**
   * Returns the value of the '<em><b>Dsl When Sunday After Elevation Of Cross Day Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Sunday After Elevation Of Cross Day Other</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Sunday After Elevation Of Cross Day Other</em>' containment reference.
   * @see #setDsl_WhenSundayAfterElevationOfCrossDay_Other(WhenOther)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenSundayAfterElevationOfCrossDay_Dsl_WhenSundayAfterElevationOfCrossDay_Other()
   * @model containment="true"
   * @generated
   */
  WhenOther getDsl_WhenSundayAfterElevationOfCrossDay_Other();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay#getDsl_WhenSundayAfterElevationOfCrossDay_Other <em>Dsl When Sunday After Elevation Of Cross Day Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Sunday After Elevation Of Cross Day Other</em>' containment reference.
   * @see #getDsl_WhenSundayAfterElevationOfCrossDay_Other()
   * @generated
   */
  void setDsl_WhenSundayAfterElevationOfCrossDay_Other(WhenOther value);

} // WhenSundayAfterElevationOfCrossDay
