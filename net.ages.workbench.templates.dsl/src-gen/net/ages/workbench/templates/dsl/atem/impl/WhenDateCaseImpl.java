/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AbstractComponent;
import net.ages.workbench.templates.dsl.atem.AbstractDateCase;
import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.MonthName;
import net.ages.workbench.templates.dsl.atem.WhenDateCase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Date Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenDateCaseImpl#getDsl_WhenDate_Case_Month <em>Dsl When Date Case Month</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenDateCaseImpl#getDsl_WhenDateCase_Days <em>Dsl When Date Case Days</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenDateCaseImpl#getDsl_WhenDateCase_True_actions <em>Dsl When Date Case True actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenDateCaseImpl extends MinimalEObjectImpl.Container implements WhenDateCase
{
  /**
   * The default value of the '{@link #getDsl_WhenDate_Case_Month() <em>Dsl When Date Case Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenDate_Case_Month()
   * @generated
   * @ordered
   */
  protected static final MonthName DSL_WHEN_DATE_CASE_MONTH_EDEFAULT = MonthName.JAN;

  /**
   * The cached value of the '{@link #getDsl_WhenDate_Case_Month() <em>Dsl When Date Case Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenDate_Case_Month()
   * @generated
   * @ordered
   */
  protected MonthName dsl_WhenDate_Case_Month = DSL_WHEN_DATE_CASE_MONTH_EDEFAULT;

  /**
   * The cached value of the '{@link #getDsl_WhenDateCase_Days() <em>Dsl When Date Case Days</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenDateCase_Days()
   * @generated
   * @ordered
   */
  protected AbstractDateCase dsl_WhenDateCase_Days;

  /**
   * The cached value of the '{@link #getDsl_WhenDateCase_True_actions() <em>Dsl When Date Case True actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenDateCase_True_actions()
   * @generated
   * @ordered
   */
  protected EList<AbstractComponent> dsl_WhenDateCase_True_actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenDateCaseImpl()
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
    return AtemPackage.Literals.WHEN_DATE_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonthName getDsl_WhenDate_Case_Month()
  {
    return dsl_WhenDate_Case_Month;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_WhenDate_Case_Month(MonthName newDsl_WhenDate_Case_Month)
  {
    MonthName oldDsl_WhenDate_Case_Month = dsl_WhenDate_Case_Month;
    dsl_WhenDate_Case_Month = newDsl_WhenDate_Case_Month == null ? DSL_WHEN_DATE_CASE_MONTH_EDEFAULT : newDsl_WhenDate_Case_Month;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_MONTH, oldDsl_WhenDate_Case_Month, dsl_WhenDate_Case_Month));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDateCase getDsl_WhenDateCase_Days()
  {
    return dsl_WhenDateCase_Days;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_WhenDateCase_Days(AbstractDateCase newDsl_WhenDateCase_Days, NotificationChain msgs)
  {
    AbstractDateCase oldDsl_WhenDateCase_Days = dsl_WhenDateCase_Days;
    dsl_WhenDateCase_Days = newDsl_WhenDateCase_Days;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_DAYS, oldDsl_WhenDateCase_Days, newDsl_WhenDateCase_Days);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_WhenDateCase_Days(AbstractDateCase newDsl_WhenDateCase_Days)
  {
    if (newDsl_WhenDateCase_Days != dsl_WhenDateCase_Days)
    {
      NotificationChain msgs = null;
      if (dsl_WhenDateCase_Days != null)
        msgs = ((InternalEObject)dsl_WhenDateCase_Days).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_DAYS, null, msgs);
      if (newDsl_WhenDateCase_Days != null)
        msgs = ((InternalEObject)newDsl_WhenDateCase_Days).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_DAYS, null, msgs);
      msgs = basicSetDsl_WhenDateCase_Days(newDsl_WhenDateCase_Days, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_DAYS, newDsl_WhenDateCase_Days, newDsl_WhenDateCase_Days));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractComponent> getDsl_WhenDateCase_True_actions()
  {
    if (dsl_WhenDateCase_True_actions == null)
    {
      dsl_WhenDateCase_True_actions = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_TRUE_ACTIONS);
    }
    return dsl_WhenDateCase_True_actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_DAYS:
        return basicSetDsl_WhenDateCase_Days(null, msgs);
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_TRUE_ACTIONS:
        return ((InternalEList<?>)getDsl_WhenDateCase_True_actions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_MONTH:
        return getDsl_WhenDate_Case_Month();
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_DAYS:
        return getDsl_WhenDateCase_Days();
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_TRUE_ACTIONS:
        return getDsl_WhenDateCase_True_actions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_MONTH:
        setDsl_WhenDate_Case_Month((MonthName)newValue);
        return;
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_DAYS:
        setDsl_WhenDateCase_Days((AbstractDateCase)newValue);
        return;
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_TRUE_ACTIONS:
        getDsl_WhenDateCase_True_actions().clear();
        getDsl_WhenDateCase_True_actions().addAll((Collection<? extends AbstractComponent>)newValue);
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
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_MONTH:
        setDsl_WhenDate_Case_Month(DSL_WHEN_DATE_CASE_MONTH_EDEFAULT);
        return;
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_DAYS:
        setDsl_WhenDateCase_Days((AbstractDateCase)null);
        return;
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_TRUE_ACTIONS:
        getDsl_WhenDateCase_True_actions().clear();
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
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_MONTH:
        return dsl_WhenDate_Case_Month != DSL_WHEN_DATE_CASE_MONTH_EDEFAULT;
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_DAYS:
        return dsl_WhenDateCase_Days != null;
      case AtemPackage.WHEN_DATE_CASE__DSL_WHEN_DATE_CASE_TRUE_ACTIONS:
        return dsl_WhenDateCase_True_actions != null && !dsl_WhenDateCase_True_actions.isEmpty();
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
    result.append(" (dsl_WhenDate_Case_Month: ");
    result.append(dsl_WhenDate_Case_Month);
    result.append(')');
    return result.toString();
  }

} //WhenDateCaseImpl
