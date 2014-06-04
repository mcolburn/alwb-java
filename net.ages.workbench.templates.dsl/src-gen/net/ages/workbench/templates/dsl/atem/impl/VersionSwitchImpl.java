/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.VersionSwitch;
import net.ages.workbench.templates.dsl.atem.VersionSwitchType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.VersionSwitchImpl#getDsl_VersionSwitch_flag <em>Dsl Version Switch flag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionSwitchImpl extends AbstractComponentImpl implements VersionSwitch
{
  /**
   * The default value of the '{@link #getDsl_VersionSwitch_flag() <em>Dsl Version Switch flag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_VersionSwitch_flag()
   * @generated
   * @ordered
   */
  protected static final VersionSwitchType DSL_VERSION_SWITCH_FLAG_EDEFAULT = VersionSwitchType.L1;

  /**
   * The cached value of the '{@link #getDsl_VersionSwitch_flag() <em>Dsl Version Switch flag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_VersionSwitch_flag()
   * @generated
   * @ordered
   */
  protected VersionSwitchType dsl_VersionSwitch_flag = DSL_VERSION_SWITCH_FLAG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VersionSwitchImpl()
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
    return AtemPackage.Literals.VERSION_SWITCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersionSwitchType getDsl_VersionSwitch_flag()
  {
    return dsl_VersionSwitch_flag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_VersionSwitch_flag(VersionSwitchType newDsl_VersionSwitch_flag)
  {
    VersionSwitchType oldDsl_VersionSwitch_flag = dsl_VersionSwitch_flag;
    dsl_VersionSwitch_flag = newDsl_VersionSwitch_flag == null ? DSL_VERSION_SWITCH_FLAG_EDEFAULT : newDsl_VersionSwitch_flag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.VERSION_SWITCH__DSL_VERSION_SWITCH_FLAG, oldDsl_VersionSwitch_flag, dsl_VersionSwitch_flag));
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
      case AtemPackage.VERSION_SWITCH__DSL_VERSION_SWITCH_FLAG:
        return getDsl_VersionSwitch_flag();
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
      case AtemPackage.VERSION_SWITCH__DSL_VERSION_SWITCH_FLAG:
        setDsl_VersionSwitch_flag((VersionSwitchType)newValue);
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
      case AtemPackage.VERSION_SWITCH__DSL_VERSION_SWITCH_FLAG:
        setDsl_VersionSwitch_flag(DSL_VERSION_SWITCH_FLAG_EDEFAULT);
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
      case AtemPackage.VERSION_SWITCH__DSL_VERSION_SWITCH_FLAG:
        return dsl_VersionSwitch_flag != DSL_VERSION_SWITCH_FLAG_EDEFAULT;
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
    result.append(" (dsl_VersionSwitch_flag: ");
    result.append(dsl_VersionSwitch_flag);
    result.append(')');
    return result.toString();
  }

} //VersionSwitchImpl
