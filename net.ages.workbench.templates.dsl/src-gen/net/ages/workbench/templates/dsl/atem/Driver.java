/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Driver#getDsl_Driver_RegEx <em>Dsl Driver Reg Ex</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Driver#getDsl_Driver_Status <em>Dsl Driver Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDriver()
 * @model
 * @generated
 */
public interface Driver extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl Driver Reg Ex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Driver Reg Ex</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Driver Reg Ex</em>' attribute.
   * @see #setDsl_Driver_RegEx(String)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDriver_Dsl_Driver_RegEx()
   * @model
   * @generated
   */
  String getDsl_Driver_RegEx();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.Driver#getDsl_Driver_RegEx <em>Dsl Driver Reg Ex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Driver Reg Ex</em>' attribute.
   * @see #getDsl_Driver_RegEx()
   * @generated
   */
  void setDsl_Driver_RegEx(String value);

  /**
   * Returns the value of the '<em><b>Dsl Driver Status</b></em>' attribute.
   * The literals are from the enumeration {@link net.ages.workbench.templates.dsl.atem.TemplateStatuses}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Driver Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Driver Status</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.TemplateStatuses
   * @see #setDsl_Driver_Status(TemplateStatuses)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDriver_Dsl_Driver_Status()
   * @model
   * @generated
   */
  TemplateStatuses getDsl_Driver_Status();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.Driver#getDsl_Driver_Status <em>Dsl Driver Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Driver Status</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.TemplateStatuses
   * @see #getDsl_Driver_Status()
   * @generated
   */
  void setDsl_Driver_Status(TemplateStatuses value);

} // Driver
