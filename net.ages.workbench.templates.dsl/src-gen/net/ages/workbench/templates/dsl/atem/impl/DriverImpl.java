/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.Driver;
import net.ages.workbench.templates.dsl.atem.TemplateStatuses;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DriverImpl#getDsl_Driver_RegEx <em>Dsl Driver Reg Ex</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DriverImpl#getDsl_Driver_Status <em>Dsl Driver Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DriverImpl extends MinimalEObjectImpl.Container implements Driver
{
  /**
   * The default value of the '{@link #getDsl_Driver_RegEx() <em>Dsl Driver Reg Ex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Driver_RegEx()
   * @generated
   * @ordered
   */
  protected static final String DSL_DRIVER_REG_EX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDsl_Driver_RegEx() <em>Dsl Driver Reg Ex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Driver_RegEx()
   * @generated
   * @ordered
   */
  protected String dsl_Driver_RegEx = DSL_DRIVER_REG_EX_EDEFAULT;

  /**
   * The default value of the '{@link #getDsl_Driver_Status() <em>Dsl Driver Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Driver_Status()
   * @generated
   * @ordered
   */
  protected static final TemplateStatuses DSL_DRIVER_STATUS_EDEFAULT = TemplateStatuses.NA;

  /**
   * The cached value of the '{@link #getDsl_Driver_Status() <em>Dsl Driver Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Driver_Status()
   * @generated
   * @ordered
   */
  protected TemplateStatuses dsl_Driver_Status = DSL_DRIVER_STATUS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DriverImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AtemPackage.Literals.DRIVER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDsl_Driver_RegEx()
  {
    return dsl_Driver_RegEx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Driver_RegEx(String newDsl_Driver_RegEx)
  {
    String oldDsl_Driver_RegEx = dsl_Driver_RegEx;
    dsl_Driver_RegEx = newDsl_Driver_RegEx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.DRIVER__DSL_DRIVER_REG_EX, oldDsl_Driver_RegEx, dsl_Driver_RegEx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateStatuses getDsl_Driver_Status()
  {
    return dsl_Driver_Status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Driver_Status(TemplateStatuses newDsl_Driver_Status)
  {
    TemplateStatuses oldDsl_Driver_Status = dsl_Driver_Status;
    dsl_Driver_Status = newDsl_Driver_Status == null ? DSL_DRIVER_STATUS_EDEFAULT : newDsl_Driver_Status;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.DRIVER__DSL_DRIVER_STATUS, oldDsl_Driver_Status, dsl_Driver_Status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AtemPackage.DRIVER__DSL_DRIVER_REG_EX:
        return getDsl_Driver_RegEx();
      case AtemPackage.DRIVER__DSL_DRIVER_STATUS:
        return getDsl_Driver_Status();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AtemPackage.DRIVER__DSL_DRIVER_REG_EX:
        setDsl_Driver_RegEx((String)newValue);
        return;
      case AtemPackage.DRIVER__DSL_DRIVER_STATUS:
        setDsl_Driver_Status((TemplateStatuses)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AtemPackage.DRIVER__DSL_DRIVER_REG_EX:
        setDsl_Driver_RegEx(DSL_DRIVER_REG_EX_EDEFAULT);
        return;
      case AtemPackage.DRIVER__DSL_DRIVER_STATUS:
        setDsl_Driver_Status(DSL_DRIVER_STATUS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AtemPackage.DRIVER__DSL_DRIVER_REG_EX:
        return DSL_DRIVER_REG_EX_EDEFAULT == null ? dsl_Driver_RegEx != null : !DSL_DRIVER_REG_EX_EDEFAULT.equals(dsl_Driver_RegEx);
      case AtemPackage.DRIVER__DSL_DRIVER_STATUS:
        return dsl_Driver_Status != DSL_DRIVER_STATUS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (dsl_Driver_RegEx: ");
    result.append(dsl_Driver_RegEx);
    result.append(", dsl_Driver_Status: ");
    result.append(dsl_Driver_Status);
    result.append(')');
    return result.toString();
  }

} //DriverImpl
