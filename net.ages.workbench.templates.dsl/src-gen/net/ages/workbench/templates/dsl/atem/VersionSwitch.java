/**
 */
package net.ages.workbench.templates.dsl.atem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.VersionSwitch#getDsl_VersionSwitch_flag <em>Dsl Version Switch flag</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getVersionSwitch()
 * @model
 * @generated
 */
public interface VersionSwitch extends AbstractComponent, InfoElementType, PrefaceElementType
{
  /**
   * Returns the value of the '<em><b>Dsl Version Switch flag</b></em>' attribute.
   * The literals are from the enumeration {@link net.ages.workbench.templates.dsl.atem.VersionSwitchType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Version Switch flag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Version Switch flag</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.VersionSwitchType
   * @see #setDsl_VersionSwitch_flag(VersionSwitchType)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getVersionSwitch_Dsl_VersionSwitch_flag()
   * @model
   * @generated
   */
  VersionSwitchType getDsl_VersionSwitch_flag();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.VersionSwitch#getDsl_VersionSwitch_flag <em>Dsl Version Switch flag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Version Switch flag</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.VersionSwitchType
   * @see #getDsl_VersionSwitch_flag()
   * @generated
   */
  void setDsl_VersionSwitch_flag(VersionSwitchType value);

} // VersionSwitch
