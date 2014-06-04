/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.GenDate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.GenDateImpl#isDsl_Display_Date <em>Dsl Display Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenDateImpl extends LdpTypeImpl implements GenDate
{
  /**
   * The default value of the '{@link #isDsl_Display_Date() <em>Dsl Display Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_Date()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_DISPLAY_DATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_Display_Date() <em>Dsl Display Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_Date()
   * @generated
   * @ordered
   */
  protected boolean dsl_Display_Date = DSL_DISPLAY_DATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenDateImpl()
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
    return AtemPackage.Literals.GEN_DATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_Display_Date()
  {
    return dsl_Display_Date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Display_Date(boolean newDsl_Display_Date)
  {
    boolean oldDsl_Display_Date = dsl_Display_Date;
    dsl_Display_Date = newDsl_Display_Date;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.GEN_DATE__DSL_DISPLAY_DATE, oldDsl_Display_Date, dsl_Display_Date));
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
      case AtemPackage.GEN_DATE__DSL_DISPLAY_DATE:
        return isDsl_Display_Date();
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
      case AtemPackage.GEN_DATE__DSL_DISPLAY_DATE:
        setDsl_Display_Date((Boolean)newValue);
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
      case AtemPackage.GEN_DATE__DSL_DISPLAY_DATE:
        setDsl_Display_Date(DSL_DISPLAY_DATE_EDEFAULT);
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
      case AtemPackage.GEN_DATE__DSL_DISPLAY_DATE:
        return dsl_Display_Date != DSL_DISPLAY_DATE_EDEFAULT;
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
    result.append(" (dsl_Display_Date: ");
    result.append(dsl_Display_Date);
    result.append(')');
    return result.toString();
  }

} //GenDateImpl
