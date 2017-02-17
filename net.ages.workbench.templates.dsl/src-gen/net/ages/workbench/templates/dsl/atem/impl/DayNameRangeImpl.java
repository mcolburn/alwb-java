/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.DayNameRange;
import net.ages.workbench.templates.dsl.atem.DayOfWeek;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Day Name Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DayNameRangeImpl#getDsl_DayNameRange_from <em>Dsl Day Name Range from</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DayNameRangeImpl#getDsl_DayNameRange_To <em>Dsl Day Name Range To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DayNameRangeImpl extends AbstractDayNameCaseImpl implements DayNameRange
{
  /**
   * The default value of the '{@link #getDsl_DayNameRange_from() <em>Dsl Day Name Range from</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_DayNameRange_from()
   * @generated
   * @ordered
   */
  protected static final DayOfWeek DSL_DAY_NAME_RANGE_FROM_EDEFAULT = DayOfWeek.SUNDAY;

  /**
   * The cached value of the '{@link #getDsl_DayNameRange_from() <em>Dsl Day Name Range from</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_DayNameRange_from()
   * @generated
   * @ordered
   */
  protected DayOfWeek dsl_DayNameRange_from = DSL_DAY_NAME_RANGE_FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getDsl_DayNameRange_To() <em>Dsl Day Name Range To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_DayNameRange_To()
   * @generated
   * @ordered
   */
  protected static final DayOfWeek DSL_DAY_NAME_RANGE_TO_EDEFAULT = DayOfWeek.SUNDAY;

  /**
   * The cached value of the '{@link #getDsl_DayNameRange_To() <em>Dsl Day Name Range To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_DayNameRange_To()
   * @generated
   * @ordered
   */
  protected DayOfWeek dsl_DayNameRange_To = DSL_DAY_NAME_RANGE_TO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DayNameRangeImpl()
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
    return AtemPackage.Literals.DAY_NAME_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DayOfWeek getDsl_DayNameRange_from()
  {
    return dsl_DayNameRange_from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_DayNameRange_from(DayOfWeek newDsl_DayNameRange_from)
  {
    DayOfWeek oldDsl_DayNameRange_from = dsl_DayNameRange_from;
    dsl_DayNameRange_from = newDsl_DayNameRange_from == null ? DSL_DAY_NAME_RANGE_FROM_EDEFAULT : newDsl_DayNameRange_from;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_FROM, oldDsl_DayNameRange_from, dsl_DayNameRange_from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DayOfWeek getDsl_DayNameRange_To()
  {
    return dsl_DayNameRange_To;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_DayNameRange_To(DayOfWeek newDsl_DayNameRange_To)
  {
    DayOfWeek oldDsl_DayNameRange_To = dsl_DayNameRange_To;
    dsl_DayNameRange_To = newDsl_DayNameRange_To == null ? DSL_DAY_NAME_RANGE_TO_EDEFAULT : newDsl_DayNameRange_To;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_TO, oldDsl_DayNameRange_To, dsl_DayNameRange_To));
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
      case AtemPackage.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_FROM:
        return getDsl_DayNameRange_from();
      case AtemPackage.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_TO:
        return getDsl_DayNameRange_To();
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
      case AtemPackage.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_FROM:
        setDsl_DayNameRange_from((DayOfWeek)newValue);
        return;
      case AtemPackage.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_TO:
        setDsl_DayNameRange_To((DayOfWeek)newValue);
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
      case AtemPackage.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_FROM:
        setDsl_DayNameRange_from(DSL_DAY_NAME_RANGE_FROM_EDEFAULT);
        return;
      case AtemPackage.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_TO:
        setDsl_DayNameRange_To(DSL_DAY_NAME_RANGE_TO_EDEFAULT);
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
      case AtemPackage.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_FROM:
        return dsl_DayNameRange_from != DSL_DAY_NAME_RANGE_FROM_EDEFAULT;
      case AtemPackage.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_TO:
        return dsl_DayNameRange_To != DSL_DAY_NAME_RANGE_TO_EDEFAULT;
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
    result.append(" (dsl_DayNameRange_from: ");
    result.append(dsl_DayNameRange_from);
    result.append(", dsl_DayNameRange_To: ");
    result.append(dsl_DayNameRange_To);
    result.append(')');
    return result.toString();
  }

} //DayNameRangeImpl
