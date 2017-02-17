/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.SOL;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SOL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.SOLImpl#isDsl_Display_StartLukan <em>Dsl Display Start Lukan</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SOLImpl extends LdpTypeImpl implements SOL
{
  /**
   * The default value of the '{@link #isDsl_Display_StartLukan() <em>Dsl Display Start Lukan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_StartLukan()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_DISPLAY_START_LUKAN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_Display_StartLukan() <em>Dsl Display Start Lukan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_StartLukan()
   * @generated
   * @ordered
   */
  protected boolean dsl_Display_StartLukan = DSL_DISPLAY_START_LUKAN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SOLImpl()
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
    return AtemPackage.Literals.SOL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_Display_StartLukan()
  {
    return dsl_Display_StartLukan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Display_StartLukan(boolean newDsl_Display_StartLukan)
  {
    boolean oldDsl_Display_StartLukan = dsl_Display_StartLukan;
    dsl_Display_StartLukan = newDsl_Display_StartLukan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.SOL__DSL_DISPLAY_START_LUKAN, oldDsl_Display_StartLukan, dsl_Display_StartLukan));
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
      case AtemPackage.SOL__DSL_DISPLAY_START_LUKAN:
        return isDsl_Display_StartLukan();
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
      case AtemPackage.SOL__DSL_DISPLAY_START_LUKAN:
        setDsl_Display_StartLukan((Boolean)newValue);
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
      case AtemPackage.SOL__DSL_DISPLAY_START_LUKAN:
        setDsl_Display_StartLukan(DSL_DISPLAY_START_LUKAN_EDEFAULT);
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
      case AtemPackage.SOL__DSL_DISPLAY_START_LUKAN:
        return dsl_Display_StartLukan != DSL_DISPLAY_START_LUKAN_EDEFAULT;
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
    result.append(" (dsl_Display_StartLukan: ");
    result.append(dsl_Display_StartLukan);
    result.append(')');
    return result.toString();
  }

} //SOLImpl
