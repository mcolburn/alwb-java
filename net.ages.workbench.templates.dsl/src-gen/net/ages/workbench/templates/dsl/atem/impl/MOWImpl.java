/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.MOW;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MOW</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.MOWImpl#isDsl_Display_Mode <em>Dsl Display Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MOWImpl extends LdpTypeImpl implements MOW
{
  /**
   * The default value of the '{@link #isDsl_Display_Mode() <em>Dsl Display Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_Mode()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_DISPLAY_MODE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_Display_Mode() <em>Dsl Display Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_Mode()
   * @generated
   * @ordered
   */
  protected boolean dsl_Display_Mode = DSL_DISPLAY_MODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MOWImpl()
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
    return AtemPackage.Literals.MOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_Display_Mode()
  {
    return dsl_Display_Mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Display_Mode(boolean newDsl_Display_Mode)
  {
    boolean oldDsl_Display_Mode = dsl_Display_Mode;
    dsl_Display_Mode = newDsl_Display_Mode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.MOW__DSL_DISPLAY_MODE, oldDsl_Display_Mode, dsl_Display_Mode));
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
      case AtemPackage.MOW__DSL_DISPLAY_MODE:
        return isDsl_Display_Mode();
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
      case AtemPackage.MOW__DSL_DISPLAY_MODE:
        setDsl_Display_Mode((Boolean)newValue);
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
      case AtemPackage.MOW__DSL_DISPLAY_MODE:
        setDsl_Display_Mode(DSL_DISPLAY_MODE_EDEFAULT);
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
      case AtemPackage.MOW__DSL_DISPLAY_MODE:
        return dsl_Display_Mode != DSL_DISPLAY_MODE_EDEFAULT;
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
    result.append(" (dsl_Display_Mode: ");
    result.append(dsl_Display_Mode);
    result.append(')');
    return result.toString();
  }

} //MOWImpl
