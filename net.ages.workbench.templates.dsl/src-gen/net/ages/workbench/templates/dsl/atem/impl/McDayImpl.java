/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.McDay;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mc Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.McDayImpl#getDsl_McDay_val <em>Dsl Mc Day val</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class McDayImpl extends HeadComponentImpl implements McDay
{
  /**
   * The default value of the '{@link #getDsl_McDay_val() <em>Dsl Mc Day val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_McDay_val()
   * @generated
   * @ordered
   */
  protected static final int DSL_MC_DAY_VAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDsl_McDay_val() <em>Dsl Mc Day val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_McDay_val()
   * @generated
   * @ordered
   */
  protected int dsl_McDay_val = DSL_MC_DAY_VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected McDayImpl()
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
    return AtemPackage.Literals.MC_DAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDsl_McDay_val()
  {
    return dsl_McDay_val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_McDay_val(int newDsl_McDay_val)
  {
    int oldDsl_McDay_val = dsl_McDay_val;
    dsl_McDay_val = newDsl_McDay_val;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.MC_DAY__DSL_MC_DAY_VAL, oldDsl_McDay_val, dsl_McDay_val));
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
      case AtemPackage.MC_DAY__DSL_MC_DAY_VAL:
        return getDsl_McDay_val();
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
      case AtemPackage.MC_DAY__DSL_MC_DAY_VAL:
        setDsl_McDay_val((Integer)newValue);
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
      case AtemPackage.MC_DAY__DSL_MC_DAY_VAL:
        setDsl_McDay_val(DSL_MC_DAY_VAL_EDEFAULT);
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
      case AtemPackage.MC_DAY__DSL_MC_DAY_VAL:
        return dsl_McDay_val != DSL_MC_DAY_VAL_EDEFAULT;
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
    result.append(" (dsl_McDay_val: ");
    result.append(dsl_McDay_val);
    result.append(')');
    return result.toString();
  }

} //McDayImpl
