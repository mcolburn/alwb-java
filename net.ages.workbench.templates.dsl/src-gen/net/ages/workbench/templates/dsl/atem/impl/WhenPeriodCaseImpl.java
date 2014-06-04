/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AbstractComponent;
import net.ages.workbench.templates.dsl.atem.AbstractDayCase;
import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.WhenPeriodCase;

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
 * An implementation of the model object '<em><b>When Period Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenPeriodCaseImpl#getDsl_WhenPeriodCase_Days <em>Dsl When Period Case Days</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenPeriodCaseImpl#getDsl_WhenPeriodCase_True_actions <em>Dsl When Period Case True actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenPeriodCaseImpl extends MinimalEObjectImpl.Container implements WhenPeriodCase
{
  /**
   * The cached value of the '{@link #getDsl_WhenPeriodCase_Days() <em>Dsl When Period Case Days</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenPeriodCase_Days()
   * @generated
   * @ordered
   */
  protected AbstractDayCase dsl_WhenPeriodCase_Days;

  /**
   * The cached value of the '{@link #getDsl_WhenPeriodCase_True_actions() <em>Dsl When Period Case True actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenPeriodCase_True_actions()
   * @generated
   * @ordered
   */
  protected EList<AbstractComponent> dsl_WhenPeriodCase_True_actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenPeriodCaseImpl()
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
    return AtemPackage.Literals.WHEN_PERIOD_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDayCase getDsl_WhenPeriodCase_Days()
  {
    return dsl_WhenPeriodCase_Days;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_WhenPeriodCase_Days(AbstractDayCase newDsl_WhenPeriodCase_Days, NotificationChain msgs)
  {
    AbstractDayCase oldDsl_WhenPeriodCase_Days = dsl_WhenPeriodCase_Days;
    dsl_WhenPeriodCase_Days = newDsl_WhenPeriodCase_Days;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_DAYS, oldDsl_WhenPeriodCase_Days, newDsl_WhenPeriodCase_Days);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_WhenPeriodCase_Days(AbstractDayCase newDsl_WhenPeriodCase_Days)
  {
    if (newDsl_WhenPeriodCase_Days != dsl_WhenPeriodCase_Days)
    {
      NotificationChain msgs = null;
      if (dsl_WhenPeriodCase_Days != null)
        msgs = ((InternalEObject)dsl_WhenPeriodCase_Days).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_DAYS, null, msgs);
      if (newDsl_WhenPeriodCase_Days != null)
        msgs = ((InternalEObject)newDsl_WhenPeriodCase_Days).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_DAYS, null, msgs);
      msgs = basicSetDsl_WhenPeriodCase_Days(newDsl_WhenPeriodCase_Days, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_DAYS, newDsl_WhenPeriodCase_Days, newDsl_WhenPeriodCase_Days));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractComponent> getDsl_WhenPeriodCase_True_actions()
  {
    if (dsl_WhenPeriodCase_True_actions == null)
    {
      dsl_WhenPeriodCase_True_actions = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_TRUE_ACTIONS);
    }
    return dsl_WhenPeriodCase_True_actions;
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
      case AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_DAYS:
        return basicSetDsl_WhenPeriodCase_Days(null, msgs);
      case AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_TRUE_ACTIONS:
        return ((InternalEList<?>)getDsl_WhenPeriodCase_True_actions()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_DAYS:
        return getDsl_WhenPeriodCase_Days();
      case AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_TRUE_ACTIONS:
        return getDsl_WhenPeriodCase_True_actions();
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
      case AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_DAYS:
        setDsl_WhenPeriodCase_Days((AbstractDayCase)newValue);
        return;
      case AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_TRUE_ACTIONS:
        getDsl_WhenPeriodCase_True_actions().clear();
        getDsl_WhenPeriodCase_True_actions().addAll((Collection<? extends AbstractComponent>)newValue);
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
      case AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_DAYS:
        setDsl_WhenPeriodCase_Days((AbstractDayCase)null);
        return;
      case AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_TRUE_ACTIONS:
        getDsl_WhenPeriodCase_True_actions().clear();
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
      case AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_DAYS:
        return dsl_WhenPeriodCase_Days != null;
      case AtemPackage.WHEN_PERIOD_CASE__DSL_WHEN_PERIOD_CASE_TRUE_ACTIONS:
        return dsl_WhenPeriodCase_True_actions != null && !dsl_WhenPeriodCase_True_actions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WhenPeriodCaseImpl
