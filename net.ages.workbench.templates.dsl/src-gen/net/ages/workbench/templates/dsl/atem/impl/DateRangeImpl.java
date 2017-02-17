/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.DateRange;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DateRangeImpl#getDsl_DateRange_from <em>Dsl Date Range from</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DateRangeImpl#getDsl_DateRange_To <em>Dsl Date Range To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateRangeImpl extends AbstractDateCaseImpl implements DateRange
{
  /**
   * The default value of the '{@link #getDsl_DateRange_from() <em>Dsl Date Range from</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_DateRange_from()
   * @generated
   * @ordered
   */
  protected static final int DSL_DATE_RANGE_FROM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDsl_DateRange_from() <em>Dsl Date Range from</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_DateRange_from()
   * @generated
   * @ordered
   */
  protected int dsl_DateRange_from = DSL_DATE_RANGE_FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getDsl_DateRange_To() <em>Dsl Date Range To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_DateRange_To()
   * @generated
   * @ordered
   */
  protected static final int DSL_DATE_RANGE_TO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDsl_DateRange_To() <em>Dsl Date Range To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_DateRange_To()
   * @generated
   * @ordered
   */
  protected int dsl_DateRange_To = DSL_DATE_RANGE_TO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DateRangeImpl()
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
    return AtemPackage.Literals.DATE_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDsl_DateRange_from()
  {
    return dsl_DateRange_from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_DateRange_from(int newDsl_DateRange_from)
  {
    int oldDsl_DateRange_from = dsl_DateRange_from;
    dsl_DateRange_from = newDsl_DateRange_from;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.DATE_RANGE__DSL_DATE_RANGE_FROM, oldDsl_DateRange_from, dsl_DateRange_from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDsl_DateRange_To()
  {
    return dsl_DateRange_To;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_DateRange_To(int newDsl_DateRange_To)
  {
    int oldDsl_DateRange_To = dsl_DateRange_To;
    dsl_DateRange_To = newDsl_DateRange_To;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.DATE_RANGE__DSL_DATE_RANGE_TO, oldDsl_DateRange_To, dsl_DateRange_To));
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
      case AtemPackage.DATE_RANGE__DSL_DATE_RANGE_FROM:
        return getDsl_DateRange_from();
      case AtemPackage.DATE_RANGE__DSL_DATE_RANGE_TO:
        return getDsl_DateRange_To();
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
      case AtemPackage.DATE_RANGE__DSL_DATE_RANGE_FROM:
        setDsl_DateRange_from((Integer)newValue);
        return;
      case AtemPackage.DATE_RANGE__DSL_DATE_RANGE_TO:
        setDsl_DateRange_To((Integer)newValue);
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
      case AtemPackage.DATE_RANGE__DSL_DATE_RANGE_FROM:
        setDsl_DateRange_from(DSL_DATE_RANGE_FROM_EDEFAULT);
        return;
      case AtemPackage.DATE_RANGE__DSL_DATE_RANGE_TO:
        setDsl_DateRange_To(DSL_DATE_RANGE_TO_EDEFAULT);
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
      case AtemPackage.DATE_RANGE__DSL_DATE_RANGE_FROM:
        return dsl_DateRange_from != DSL_DATE_RANGE_FROM_EDEFAULT;
      case AtemPackage.DATE_RANGE__DSL_DATE_RANGE_TO:
        return dsl_DateRange_To != DSL_DATE_RANGE_TO_EDEFAULT;
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
    result.append(" (dsl_DateRange_from: ");
    result.append(dsl_DateRange_from);
    result.append(", dsl_DateRange_To: ");
    result.append(dsl_DateRange_To);
    result.append(')');
    return result.toString();
  }

} //DateRangeImpl
