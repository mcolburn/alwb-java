/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DateImpl#getDsl_Date_month <em>Dsl Date month</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DateImpl#getDsl_Date_day <em>Dsl Date day</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DateImpl#getDsl_Date_year <em>Dsl Date year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateImpl extends HeadComponentImpl implements Date
{
  /**
   * The default value of the '{@link #getDsl_Date_month() <em>Dsl Date month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Date_month()
   * @generated
   * @ordered
   */
  protected static final int DSL_DATE_MONTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDsl_Date_month() <em>Dsl Date month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Date_month()
   * @generated
   * @ordered
   */
  protected int dsl_Date_month = DSL_DATE_MONTH_EDEFAULT;

  /**
   * The default value of the '{@link #getDsl_Date_day() <em>Dsl Date day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Date_day()
   * @generated
   * @ordered
   */
  protected static final int DSL_DATE_DAY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDsl_Date_day() <em>Dsl Date day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Date_day()
   * @generated
   * @ordered
   */
  protected int dsl_Date_day = DSL_DATE_DAY_EDEFAULT;

  /**
   * The default value of the '{@link #getDsl_Date_year() <em>Dsl Date year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Date_year()
   * @generated
   * @ordered
   */
  protected static final int DSL_DATE_YEAR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDsl_Date_year() <em>Dsl Date year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Date_year()
   * @generated
   * @ordered
   */
  protected int dsl_Date_year = DSL_DATE_YEAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DateImpl()
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
    return AtemPackage.Literals.DATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDsl_Date_month()
  {
    return dsl_Date_month;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Date_month(int newDsl_Date_month)
  {
    int oldDsl_Date_month = dsl_Date_month;
    dsl_Date_month = newDsl_Date_month;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.DATE__DSL_DATE_MONTH, oldDsl_Date_month, dsl_Date_month));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDsl_Date_day()
  {
    return dsl_Date_day;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Date_day(int newDsl_Date_day)
  {
    int oldDsl_Date_day = dsl_Date_day;
    dsl_Date_day = newDsl_Date_day;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.DATE__DSL_DATE_DAY, oldDsl_Date_day, dsl_Date_day));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDsl_Date_year()
  {
    return dsl_Date_year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Date_year(int newDsl_Date_year)
  {
    int oldDsl_Date_year = dsl_Date_year;
    dsl_Date_year = newDsl_Date_year;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.DATE__DSL_DATE_YEAR, oldDsl_Date_year, dsl_Date_year));
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
      case AtemPackage.DATE__DSL_DATE_MONTH:
        return getDsl_Date_month();
      case AtemPackage.DATE__DSL_DATE_DAY:
        return getDsl_Date_day();
      case AtemPackage.DATE__DSL_DATE_YEAR:
        return getDsl_Date_year();
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
      case AtemPackage.DATE__DSL_DATE_MONTH:
        setDsl_Date_month((Integer)newValue);
        return;
      case AtemPackage.DATE__DSL_DATE_DAY:
        setDsl_Date_day((Integer)newValue);
        return;
      case AtemPackage.DATE__DSL_DATE_YEAR:
        setDsl_Date_year((Integer)newValue);
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
      case AtemPackage.DATE__DSL_DATE_MONTH:
        setDsl_Date_month(DSL_DATE_MONTH_EDEFAULT);
        return;
      case AtemPackage.DATE__DSL_DATE_DAY:
        setDsl_Date_day(DSL_DATE_DAY_EDEFAULT);
        return;
      case AtemPackage.DATE__DSL_DATE_YEAR:
        setDsl_Date_year(DSL_DATE_YEAR_EDEFAULT);
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
      case AtemPackage.DATE__DSL_DATE_MONTH:
        return dsl_Date_month != DSL_DATE_MONTH_EDEFAULT;
      case AtemPackage.DATE__DSL_DATE_DAY:
        return dsl_Date_day != DSL_DATE_DAY_EDEFAULT;
      case AtemPackage.DATE__DSL_DATE_YEAR:
        return dsl_Date_year != DSL_DATE_YEAR_EDEFAULT;
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
    result.append(" (dsl_Date_month: ");
    result.append(dsl_Date_month);
    result.append(", dsl_Date_day: ");
    result.append(dsl_Date_day);
    result.append(", dsl_Date_year: ");
    result.append(dsl_Date_year);
    result.append(')');
    return result.toString();
  }

} //DateImpl
