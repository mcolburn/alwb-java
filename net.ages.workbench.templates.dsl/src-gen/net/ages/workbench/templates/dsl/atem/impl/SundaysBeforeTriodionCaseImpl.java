/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AbstractComponent;
import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase;

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
 * An implementation of the model object '<em><b>Sundays Before Triodion Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.SundaysBeforeTriodionCaseImpl#getDsl_SundaysBeforeTriodionCase_Days <em>Dsl Sundays Before Triodion Case Days</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.SundaysBeforeTriodionCaseImpl#getDsl_SundaysBeforeTriodionCase_True_actions <em>Dsl Sundays Before Triodion Case True actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SundaysBeforeTriodionCaseImpl extends MinimalEObjectImpl.Container implements SundaysBeforeTriodionCase
{
  /**
   * The default value of the '{@link #getDsl_SundaysBeforeTriodionCase_Days() <em>Dsl Sundays Before Triodion Case Days</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_SundaysBeforeTriodionCase_Days()
   * @generated
   * @ordered
   */
  protected static final int DSL_SUNDAYS_BEFORE_TRIODION_CASE_DAYS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDsl_SundaysBeforeTriodionCase_Days() <em>Dsl Sundays Before Triodion Case Days</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_SundaysBeforeTriodionCase_Days()
   * @generated
   * @ordered
   */
  protected int dsl_SundaysBeforeTriodionCase_Days = DSL_SUNDAYS_BEFORE_TRIODION_CASE_DAYS_EDEFAULT;

  /**
   * The cached value of the '{@link #getDsl_SundaysBeforeTriodionCase_True_actions() <em>Dsl Sundays Before Triodion Case True actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_SundaysBeforeTriodionCase_True_actions()
   * @generated
   * @ordered
   */
  protected EList<AbstractComponent> dsl_SundaysBeforeTriodionCase_True_actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SundaysBeforeTriodionCaseImpl()
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
    return AtemPackage.Literals.SUNDAYS_BEFORE_TRIODION_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDsl_SundaysBeforeTriodionCase_Days()
  {
    return dsl_SundaysBeforeTriodionCase_Days;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_SundaysBeforeTriodionCase_Days(int newDsl_SundaysBeforeTriodionCase_Days)
  {
    int oldDsl_SundaysBeforeTriodionCase_Days = dsl_SundaysBeforeTriodionCase_Days;
    dsl_SundaysBeforeTriodionCase_Days = newDsl_SundaysBeforeTriodionCase_Days;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_DAYS, oldDsl_SundaysBeforeTriodionCase_Days, dsl_SundaysBeforeTriodionCase_Days));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractComponent> getDsl_SundaysBeforeTriodionCase_True_actions()
  {
    if (dsl_SundaysBeforeTriodionCase_True_actions == null)
    {
      dsl_SundaysBeforeTriodionCase_True_actions = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_TRUE_ACTIONS);
    }
    return dsl_SundaysBeforeTriodionCase_True_actions;
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
      case AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_TRUE_ACTIONS:
        return ((InternalEList<?>)getDsl_SundaysBeforeTriodionCase_True_actions()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_DAYS:
        return getDsl_SundaysBeforeTriodionCase_Days();
      case AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_TRUE_ACTIONS:
        return getDsl_SundaysBeforeTriodionCase_True_actions();
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
      case AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_DAYS:
        setDsl_SundaysBeforeTriodionCase_Days((Integer)newValue);
        return;
      case AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_TRUE_ACTIONS:
        getDsl_SundaysBeforeTriodionCase_True_actions().clear();
        getDsl_SundaysBeforeTriodionCase_True_actions().addAll((Collection<? extends AbstractComponent>)newValue);
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
      case AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_DAYS:
        setDsl_SundaysBeforeTriodionCase_Days(DSL_SUNDAYS_BEFORE_TRIODION_CASE_DAYS_EDEFAULT);
        return;
      case AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_TRUE_ACTIONS:
        getDsl_SundaysBeforeTriodionCase_True_actions().clear();
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
      case AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_DAYS:
        return dsl_SundaysBeforeTriodionCase_Days != DSL_SUNDAYS_BEFORE_TRIODION_CASE_DAYS_EDEFAULT;
      case AtemPackage.SUNDAYS_BEFORE_TRIODION_CASE__DSL_SUNDAYS_BEFORE_TRIODION_CASE_TRUE_ACTIONS:
        return dsl_SundaysBeforeTriodionCase_True_actions != null && !dsl_SundaysBeforeTriodionCase_True_actions.isEmpty();
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
    result.append(" (dsl_SundaysBeforeTriodionCase_Days: ");
    result.append(dsl_SundaysBeforeTriodionCase_Days);
    result.append(')');
    return result.toString();
  }

} //SundaysBeforeTriodionCaseImpl
