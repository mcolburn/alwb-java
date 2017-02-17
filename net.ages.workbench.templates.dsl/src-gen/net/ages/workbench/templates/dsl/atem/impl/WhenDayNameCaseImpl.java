/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AbstractComponent;
import net.ages.workbench.templates.dsl.atem.AbstractDayNameCase;
import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.WhenDayNameCase;

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
 * An implementation of the model object '<em><b>When Day Name Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenDayNameCaseImpl#getDsl_WhenDayNameCase_Days <em>Dsl When Day Name Case Days</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenDayNameCaseImpl#getDsl_WhenDayNameCase_True_actions <em>Dsl When Day Name Case True actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenDayNameCaseImpl extends MinimalEObjectImpl.Container implements WhenDayNameCase
{
  /**
   * The cached value of the '{@link #getDsl_WhenDayNameCase_Days() <em>Dsl When Day Name Case Days</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenDayNameCase_Days()
   * @generated
   * @ordered
   */
  protected AbstractDayNameCase dsl_WhenDayNameCase_Days;

  /**
   * The cached value of the '{@link #getDsl_WhenDayNameCase_True_actions() <em>Dsl When Day Name Case True actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenDayNameCase_True_actions()
   * @generated
   * @ordered
   */
  protected EList<AbstractComponent> dsl_WhenDayNameCase_True_actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenDayNameCaseImpl()
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
    return AtemPackage.Literals.WHEN_DAY_NAME_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDayNameCase getDsl_WhenDayNameCase_Days()
  {
    return dsl_WhenDayNameCase_Days;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_WhenDayNameCase_Days(AbstractDayNameCase newDsl_WhenDayNameCase_Days, NotificationChain msgs)
  {
    AbstractDayNameCase oldDsl_WhenDayNameCase_Days = dsl_WhenDayNameCase_Days;
    dsl_WhenDayNameCase_Days = newDsl_WhenDayNameCase_Days;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_DAYS, oldDsl_WhenDayNameCase_Days, newDsl_WhenDayNameCase_Days);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_WhenDayNameCase_Days(AbstractDayNameCase newDsl_WhenDayNameCase_Days)
  {
    if (newDsl_WhenDayNameCase_Days != dsl_WhenDayNameCase_Days)
    {
      NotificationChain msgs = null;
      if (dsl_WhenDayNameCase_Days != null)
        msgs = ((InternalEObject)dsl_WhenDayNameCase_Days).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_DAYS, null, msgs);
      if (newDsl_WhenDayNameCase_Days != null)
        msgs = ((InternalEObject)newDsl_WhenDayNameCase_Days).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_DAYS, null, msgs);
      msgs = basicSetDsl_WhenDayNameCase_Days(newDsl_WhenDayNameCase_Days, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_DAYS, newDsl_WhenDayNameCase_Days, newDsl_WhenDayNameCase_Days));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractComponent> getDsl_WhenDayNameCase_True_actions()
  {
    if (dsl_WhenDayNameCase_True_actions == null)
    {
      dsl_WhenDayNameCase_True_actions = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_TRUE_ACTIONS);
    }
    return dsl_WhenDayNameCase_True_actions;
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
      case AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_DAYS:
        return basicSetDsl_WhenDayNameCase_Days(null, msgs);
      case AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_TRUE_ACTIONS:
        return ((InternalEList<?>)getDsl_WhenDayNameCase_True_actions()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_DAYS:
        return getDsl_WhenDayNameCase_Days();
      case AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_TRUE_ACTIONS:
        return getDsl_WhenDayNameCase_True_actions();
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
      case AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_DAYS:
        setDsl_WhenDayNameCase_Days((AbstractDayNameCase)newValue);
        return;
      case AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_TRUE_ACTIONS:
        getDsl_WhenDayNameCase_True_actions().clear();
        getDsl_WhenDayNameCase_True_actions().addAll((Collection<? extends AbstractComponent>)newValue);
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
      case AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_DAYS:
        setDsl_WhenDayNameCase_Days((AbstractDayNameCase)null);
        return;
      case AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_TRUE_ACTIONS:
        getDsl_WhenDayNameCase_True_actions().clear();
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
      case AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_DAYS:
        return dsl_WhenDayNameCase_Days != null;
      case AtemPackage.WHEN_DAY_NAME_CASE__DSL_WHEN_DAY_NAME_CASE_TRUE_ACTIONS:
        return dsl_WhenDayNameCase_True_actions != null && !dsl_WhenDayNameCase_True_actions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WhenDayNameCaseImpl
