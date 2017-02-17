/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.SBT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SBT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.SBTImpl#isDsl_Display_SundaysBeforeTriodion <em>Dsl Display Sundays Before Triodion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SBTImpl extends LdpTypeImpl implements SBT
{
  /**
   * The default value of the '{@link #isDsl_Display_SundaysBeforeTriodion() <em>Dsl Display Sundays Before Triodion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_SundaysBeforeTriodion()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_Display_SundaysBeforeTriodion() <em>Dsl Display Sundays Before Triodion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_SundaysBeforeTriodion()
   * @generated
   * @ordered
   */
  protected boolean dsl_Display_SundaysBeforeTriodion = DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SBTImpl()
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
    return AtemPackage.Literals.SBT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_Display_SundaysBeforeTriodion()
  {
    return dsl_Display_SundaysBeforeTriodion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Display_SundaysBeforeTriodion(boolean newDsl_Display_SundaysBeforeTriodion)
  {
    boolean oldDsl_Display_SundaysBeforeTriodion = dsl_Display_SundaysBeforeTriodion;
    dsl_Display_SundaysBeforeTriodion = newDsl_Display_SundaysBeforeTriodion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.SBT__DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION, oldDsl_Display_SundaysBeforeTriodion, dsl_Display_SundaysBeforeTriodion));
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
      case AtemPackage.SBT__DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION:
        return isDsl_Display_SundaysBeforeTriodion();
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
      case AtemPackage.SBT__DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION:
        setDsl_Display_SundaysBeforeTriodion((Boolean)newValue);
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
      case AtemPackage.SBT__DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION:
        setDsl_Display_SundaysBeforeTriodion(DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION_EDEFAULT);
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
      case AtemPackage.SBT__DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION:
        return dsl_Display_SundaysBeforeTriodion != DSL_DISPLAY_SUNDAYS_BEFORE_TRIODION_EDEFAULT;
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
    result.append(" (dsl_Display_SundaysBeforeTriodion: ");
    result.append(dsl_Display_SundaysBeforeTriodion);
    result.append(')');
    return result.toString();
  }

} //SBTImpl
