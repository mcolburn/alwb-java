/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.DOL;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DOL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DOLImpl#isDsl_Display_DayLukan <em>Dsl Display Day Lukan</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DOLImpl extends LdpTypeImpl implements DOL
{
  /**
   * The default value of the '{@link #isDsl_Display_DayLukan() <em>Dsl Display Day Lukan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_DayLukan()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_DISPLAY_DAY_LUKAN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_Display_DayLukan() <em>Dsl Display Day Lukan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_DayLukan()
   * @generated
   * @ordered
   */
  protected boolean dsl_Display_DayLukan = DSL_DISPLAY_DAY_LUKAN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DOLImpl()
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
    return AtemPackage.Literals.DOL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_Display_DayLukan()
  {
    return dsl_Display_DayLukan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Display_DayLukan(boolean newDsl_Display_DayLukan)
  {
    boolean oldDsl_Display_DayLukan = dsl_Display_DayLukan;
    dsl_Display_DayLukan = newDsl_Display_DayLukan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.DOL__DSL_DISPLAY_DAY_LUKAN, oldDsl_Display_DayLukan, dsl_Display_DayLukan));
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
      case AtemPackage.DOL__DSL_DISPLAY_DAY_LUKAN:
        return isDsl_Display_DayLukan();
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
      case AtemPackage.DOL__DSL_DISPLAY_DAY_LUKAN:
        setDsl_Display_DayLukan((Boolean)newValue);
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
      case AtemPackage.DOL__DSL_DISPLAY_DAY_LUKAN:
        setDsl_Display_DayLukan(DSL_DISPLAY_DAY_LUKAN_EDEFAULT);
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
      case AtemPackage.DOL__DSL_DISPLAY_DAY_LUKAN:
        return dsl_Display_DayLukan != DSL_DISPLAY_DAY_LUKAN_EDEFAULT;
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
    result.append(" (dsl_Display_DayLukan: ");
    result.append(dsl_Display_DayLukan);
    result.append(')');
    return result.toString();
  }

} //DOLImpl
