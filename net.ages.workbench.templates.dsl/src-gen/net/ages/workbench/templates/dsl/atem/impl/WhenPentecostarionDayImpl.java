/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.WhenOther;
import net.ages.workbench.templates.dsl.atem.WhenPentecostarionDay;
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
 * An implementation of the model object '<em><b>When Pentecostarion Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenPentecostarionDayImpl#getDsl_WhenPentecostarionDay_Cases <em>Dsl When Pentecostarion Day Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenPentecostarionDayImpl#getDsl_WhenPentecostarionDay_Other <em>Dsl When Pentecostarion Day Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenPentecostarionDayImpl extends AbstractComponentImpl implements WhenPentecostarionDay
{
  /**
   * The cached value of the '{@link #getDsl_WhenPentecostarionDay_Cases() <em>Dsl When Pentecostarion Day Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenPentecostarionDay_Cases()
   * @generated
   * @ordered
   */
  protected EList<WhenPeriodCase> dsl_WhenPentecostarionDay_Cases;

  /**
   * The cached value of the '{@link #getDsl_WhenPentecostarionDay_Other() <em>Dsl When Pentecostarion Day Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenPentecostarionDay_Other()
   * @generated
   * @ordered
   */
  protected WhenOther dsl_WhenPentecostarionDay_Other;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenPentecostarionDayImpl()
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
    return AtemPackage.Literals.WHEN_PENTECOSTARION_DAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WhenPeriodCase> getDsl_WhenPentecostarionDay_Cases()
  {
    if (dsl_WhenPentecostarionDay_Cases == null)
    {
      dsl_WhenPentecostarionDay_Cases = new EObjectContainmentEList<WhenPeriodCase>(WhenPeriodCase.class, this, AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_CASES);
    }
    return dsl_WhenPentecostarionDay_Cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenOther getDsl_WhenPentecostarionDay_Other()
  {
    return dsl_WhenPentecostarionDay_Other;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_WhenPentecostarionDay_Other(WhenOther newDsl_WhenPentecostarionDay_Other, NotificationChain msgs)
  {
    WhenOther oldDsl_WhenPentecostarionDay_Other = dsl_WhenPentecostarionDay_Other;
    dsl_WhenPentecostarionDay_Other = newDsl_WhenPentecostarionDay_Other;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_OTHER, oldDsl_WhenPentecostarionDay_Other, newDsl_WhenPentecostarionDay_Other);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_WhenPentecostarionDay_Other(WhenOther newDsl_WhenPentecostarionDay_Other)
  {
    if (newDsl_WhenPentecostarionDay_Other != dsl_WhenPentecostarionDay_Other)
    {
      NotificationChain msgs = null;
      if (dsl_WhenPentecostarionDay_Other != null)
        msgs = ((InternalEObject)dsl_WhenPentecostarionDay_Other).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_OTHER, null, msgs);
      if (newDsl_WhenPentecostarionDay_Other != null)
        msgs = ((InternalEObject)newDsl_WhenPentecostarionDay_Other).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_OTHER, null, msgs);
      msgs = basicSetDsl_WhenPentecostarionDay_Other(newDsl_WhenPentecostarionDay_Other, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_OTHER, newDsl_WhenPentecostarionDay_Other, newDsl_WhenPentecostarionDay_Other));
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
      case AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_CASES:
        return ((InternalEList<?>)getDsl_WhenPentecostarionDay_Cases()).basicRemove(otherEnd, msgs);
      case AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_OTHER:
        return basicSetDsl_WhenPentecostarionDay_Other(null, msgs);
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
      case AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_CASES:
        return getDsl_WhenPentecostarionDay_Cases();
      case AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_OTHER:
        return getDsl_WhenPentecostarionDay_Other();
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
      case AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_CASES:
        getDsl_WhenPentecostarionDay_Cases().clear();
        getDsl_WhenPentecostarionDay_Cases().addAll((Collection<? extends WhenPeriodCase>)newValue);
        return;
      case AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_OTHER:
        setDsl_WhenPentecostarionDay_Other((WhenOther)newValue);
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
      case AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_CASES:
        getDsl_WhenPentecostarionDay_Cases().clear();
        return;
      case AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_OTHER:
        setDsl_WhenPentecostarionDay_Other((WhenOther)null);
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
      case AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_CASES:
        return dsl_WhenPentecostarionDay_Cases != null && !dsl_WhenPentecostarionDay_Cases.isEmpty();
      case AtemPackage.WHEN_PENTECOSTARION_DAY__DSL_WHEN_PENTECOSTARION_DAY_OTHER:
        return dsl_WhenPentecostarionDay_Other != null;
    }
    return super.eIsSet(featureID);
  }

} //WhenPentecostarionDayImpl
