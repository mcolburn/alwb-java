/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.SAEC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.SAECImpl#isDsl_Display_SundayAfterElevationCross <em>Dsl Display Sunday After Elevation Cross</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAECImpl extends LdpTypeImpl implements SAEC
{
  /**
   * The default value of the '{@link #isDsl_Display_SundayAfterElevationCross() <em>Dsl Display Sunday After Elevation Cross</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_SundayAfterElevationCross()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_Display_SundayAfterElevationCross() <em>Dsl Display Sunday After Elevation Cross</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_SundayAfterElevationCross()
   * @generated
   * @ordered
   */
  protected boolean dsl_Display_SundayAfterElevationCross = DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SAECImpl()
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
    return AtemPackage.Literals.SAEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_Display_SundayAfterElevationCross()
  {
    return dsl_Display_SundayAfterElevationCross;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Display_SundayAfterElevationCross(boolean newDsl_Display_SundayAfterElevationCross)
  {
    boolean oldDsl_Display_SundayAfterElevationCross = dsl_Display_SundayAfterElevationCross;
    dsl_Display_SundayAfterElevationCross = newDsl_Display_SundayAfterElevationCross;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.SAEC__DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS, oldDsl_Display_SundayAfterElevationCross, dsl_Display_SundayAfterElevationCross));
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
      case AtemPackage.SAEC__DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS:
        return isDsl_Display_SundayAfterElevationCross();
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
      case AtemPackage.SAEC__DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS:
        setDsl_Display_SundayAfterElevationCross((Boolean)newValue);
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
      case AtemPackage.SAEC__DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS:
        setDsl_Display_SundayAfterElevationCross(DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS_EDEFAULT);
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
      case AtemPackage.SAEC__DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS:
        return dsl_Display_SundayAfterElevationCross != DSL_DISPLAY_SUNDAY_AFTER_ELEVATION_CROSS_EDEFAULT;
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
    result.append(" (dsl_Display_SundayAfterElevationCross: ");
    result.append(dsl_Display_SundayAfterElevationCross);
    result.append(')');
    return result.toString();
  }

} //SAECImpl
