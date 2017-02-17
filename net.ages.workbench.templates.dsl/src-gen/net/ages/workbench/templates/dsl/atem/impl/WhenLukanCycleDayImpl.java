/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.WhenLukanCycleDay;
import net.ages.workbench.templates.dsl.atem.WhenOther;
import net.ages.workbench.templates.dsl.atem.WhenPeriodCase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Lukan Cycle Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenLukanCycleDayImpl#getDsl_WhenLukanCycleDay_Cases <em>Dsl When Lukan Cycle Day Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenLukanCycleDayImpl#getDsl_WhenLukanCycleDay_Other <em>Dsl When Lukan Cycle Day Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenLukanCycleDayImpl extends AbstractComponentImpl implements WhenLukanCycleDay
{
  /**
   * The cached value of the '{@link #getDsl_WhenLukanCycleDay_Cases() <em>Dsl When Lukan Cycle Day Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenLukanCycleDay_Cases()
   * @generated
   * @ordered
   */
  protected EList<WhenPeriodCase> dsl_WhenLukanCycleDay_Cases;

  /**
   * The cached value of the '{@link #getDsl_WhenLukanCycleDay_Other() <em>Dsl When Lukan Cycle Day Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenLukanCycleDay_Other()
   * @generated
   * @ordered
   */
  protected WhenOther dsl_WhenLukanCycleDay_Other;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenLukanCycleDayImpl()
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
    return AtemPackage.Literals.WHEN_LUKAN_CYCLE_DAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WhenPeriodCase> getDsl_WhenLukanCycleDay_Cases()
  {
    if (dsl_WhenLukanCycleDay_Cases == null)
    {
      dsl_WhenLukanCycleDay_Cases = new EObjectContainmentEList<WhenPeriodCase>(WhenPeriodCase.class, this, AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_CASES);
    }
    return dsl_WhenLukanCycleDay_Cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenOther getDsl_WhenLukanCycleDay_Other()
  {
    return dsl_WhenLukanCycleDay_Other;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_WhenLukanCycleDay_Other(WhenOther newDsl_WhenLukanCycleDay_Other, NotificationChain msgs)
  {
    WhenOther oldDsl_WhenLukanCycleDay_Other = dsl_WhenLukanCycleDay_Other;
    dsl_WhenLukanCycleDay_Other = newDsl_WhenLukanCycleDay_Other;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_OTHER, oldDsl_WhenLukanCycleDay_Other, newDsl_WhenLukanCycleDay_Other);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_WhenLukanCycleDay_Other(WhenOther newDsl_WhenLukanCycleDay_Other)
  {
    if (newDsl_WhenLukanCycleDay_Other != dsl_WhenLukanCycleDay_Other)
    {
      NotificationChain msgs = null;
      if (dsl_WhenLukanCycleDay_Other != null)
        msgs = ((InternalEObject)dsl_WhenLukanCycleDay_Other).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_OTHER, null, msgs);
      if (newDsl_WhenLukanCycleDay_Other != null)
        msgs = ((InternalEObject)newDsl_WhenLukanCycleDay_Other).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_OTHER, null, msgs);
      msgs = basicSetDsl_WhenLukanCycleDay_Other(newDsl_WhenLukanCycleDay_Other, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_OTHER, newDsl_WhenLukanCycleDay_Other, newDsl_WhenLukanCycleDay_Other));
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
      case AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_CASES:
        return ((InternalEList<?>)getDsl_WhenLukanCycleDay_Cases()).basicRemove(otherEnd, msgs);
      case AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_OTHER:
        return basicSetDsl_WhenLukanCycleDay_Other(null, msgs);
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
      case AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_CASES:
        return getDsl_WhenLukanCycleDay_Cases();
      case AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_OTHER:
        return getDsl_WhenLukanCycleDay_Other();
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
      case AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_CASES:
        getDsl_WhenLukanCycleDay_Cases().clear();
        getDsl_WhenLukanCycleDay_Cases().addAll((Collection<? extends WhenPeriodCase>)newValue);
        return;
      case AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_OTHER:
        setDsl_WhenLukanCycleDay_Other((WhenOther)newValue);
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
      case AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_CASES:
        getDsl_WhenLukanCycleDay_Cases().clear();
        return;
      case AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_OTHER:
        setDsl_WhenLukanCycleDay_Other((WhenOther)null);
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
      case AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_CASES:
        return dsl_WhenLukanCycleDay_Cases != null && !dsl_WhenLukanCycleDay_Cases.isEmpty();
      case AtemPackage.WHEN_LUKAN_CYCLE_DAY__DSL_WHEN_LUKAN_CYCLE_DAY_OTHER:
        return dsl_WhenLukanCycleDay_Other != null;
    }
    return super.eIsSet(featureID);
  }

} //WhenLukanCycleDayImpl
