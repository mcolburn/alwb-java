/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.DayRange;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Day Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DayRangeImpl#getDsl_DayRange_from <em>Dsl Day Range from</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DayRangeImpl#getDsl_Range_To <em>Dsl Range To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DayRangeImpl extends AbstractDayCaseImpl implements DayRange
{
  /**
   * The default value of the '{@link #getDsl_DayRange_from() <em>Dsl Day Range from</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_DayRange_from()
   * @generated
   * @ordered
   */
  protected static final int DSL_DAY_RANGE_FROM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDsl_DayRange_from() <em>Dsl Day Range from</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_DayRange_from()
   * @generated
   * @ordered
   */
  protected int dsl_DayRange_from = DSL_DAY_RANGE_FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getDsl_Range_To() <em>Dsl Range To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Range_To()
   * @generated
   * @ordered
   */
  protected static final int DSL_RANGE_TO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDsl_Range_To() <em>Dsl Range To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Range_To()
   * @generated
   * @ordered
   */
  protected int dsl_Range_To = DSL_RANGE_TO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DayRangeImpl()
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
    return AtemPackage.Literals.DAY_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDsl_DayRange_from()
  {
    return dsl_DayRange_from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_DayRange_from(int newDsl_DayRange_from)
  {
    int oldDsl_DayRange_from = dsl_DayRange_from;
    dsl_DayRange_from = newDsl_DayRange_from;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.DAY_RANGE__DSL_DAY_RANGE_FROM, oldDsl_DayRange_from, dsl_DayRange_from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDsl_Range_To()
  {
    return dsl_Range_To;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Range_To(int newDsl_Range_To)
  {
    int oldDsl_Range_To = dsl_Range_To;
    dsl_Range_To = newDsl_Range_To;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.DAY_RANGE__DSL_RANGE_TO, oldDsl_Range_To, dsl_Range_To));
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
      case AtemPackage.DAY_RANGE__DSL_DAY_RANGE_FROM:
        return getDsl_DayRange_from();
      case AtemPackage.DAY_RANGE__DSL_RANGE_TO:
        return getDsl_Range_To();
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
      case AtemPackage.DAY_RANGE__DSL_DAY_RANGE_FROM:
        setDsl_DayRange_from((Integer)newValue);
        return;
      case AtemPackage.DAY_RANGE__DSL_RANGE_TO:
        setDsl_Range_To((Integer)newValue);
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
      case AtemPackage.DAY_RANGE__DSL_DAY_RANGE_FROM:
        setDsl_DayRange_from(DSL_DAY_RANGE_FROM_EDEFAULT);
        return;
      case AtemPackage.DAY_RANGE__DSL_RANGE_TO:
        setDsl_Range_To(DSL_RANGE_TO_EDEFAULT);
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
      case AtemPackage.DAY_RANGE__DSL_DAY_RANGE_FROM:
        return dsl_DayRange_from != DSL_DAY_RANGE_FROM_EDEFAULT;
      case AtemPackage.DAY_RANGE__DSL_RANGE_TO:
        return dsl_Range_To != DSL_RANGE_TO_EDEFAULT;
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
    result.append(" (dsl_DayRange_from: ");
    result.append(dsl_DayRange_from);
    result.append(", dsl_Range_To: ");
    result.append(dsl_Range_To);
    result.append(')');
    return result.toString();
  }

} //DayRangeImpl
