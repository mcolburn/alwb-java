/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.WhenDate;
import net.ages.workbench.templates.dsl.atem.WhenDateCase;
import net.ages.workbench.templates.dsl.atem.WhenOther;

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
 * An implementation of the model object '<em><b>When Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenDateImpl#getDsl_WhenDate_Cases <em>Dsl When Date Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenDateImpl#getDsl_WhenDate_Other <em>Dsl When Date Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenDateImpl extends AbstractComponentImpl implements WhenDate
{
  /**
   * The cached value of the '{@link #getDsl_WhenDate_Cases() <em>Dsl When Date Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenDate_Cases()
   * @generated
   * @ordered
   */
  protected EList<WhenDateCase> dsl_WhenDate_Cases;

  /**
   * The cached value of the '{@link #getDsl_WhenDate_Other() <em>Dsl When Date Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenDate_Other()
   * @generated
   * @ordered
   */
  protected WhenOther dsl_WhenDate_Other;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenDateImpl()
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
    return AtemPackage.Literals.WHEN_DATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WhenDateCase> getDsl_WhenDate_Cases()
  {
    if (dsl_WhenDate_Cases == null)
    {
      dsl_WhenDate_Cases = new EObjectContainmentEList<WhenDateCase>(WhenDateCase.class, this, AtemPackage.WHEN_DATE__DSL_WHEN_DATE_CASES);
    }
    return dsl_WhenDate_Cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenOther getDsl_WhenDate_Other()
  {
    return dsl_WhenDate_Other;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_WhenDate_Other(WhenOther newDsl_WhenDate_Other, NotificationChain msgs)
  {
    WhenOther oldDsl_WhenDate_Other = dsl_WhenDate_Other;
    dsl_WhenDate_Other = newDsl_WhenDate_Other;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_DATE__DSL_WHEN_DATE_OTHER, oldDsl_WhenDate_Other, newDsl_WhenDate_Other);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_WhenDate_Other(WhenOther newDsl_WhenDate_Other)
  {
    if (newDsl_WhenDate_Other != dsl_WhenDate_Other)
    {
      NotificationChain msgs = null;
      if (dsl_WhenDate_Other != null)
        msgs = ((InternalEObject)dsl_WhenDate_Other).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_DATE__DSL_WHEN_DATE_OTHER, null, msgs);
      if (newDsl_WhenDate_Other != null)
        msgs = ((InternalEObject)newDsl_WhenDate_Other).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_DATE__DSL_WHEN_DATE_OTHER, null, msgs);
      msgs = basicSetDsl_WhenDate_Other(newDsl_WhenDate_Other, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_DATE__DSL_WHEN_DATE_OTHER, newDsl_WhenDate_Other, newDsl_WhenDate_Other));
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
      case AtemPackage.WHEN_DATE__DSL_WHEN_DATE_CASES:
        return ((InternalEList<?>)getDsl_WhenDate_Cases()).basicRemove(otherEnd, msgs);
      case AtemPackage.WHEN_DATE__DSL_WHEN_DATE_OTHER:
        return basicSetDsl_WhenDate_Other(null, msgs);
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
      case AtemPackage.WHEN_DATE__DSL_WHEN_DATE_CASES:
        return getDsl_WhenDate_Cases();
      case AtemPackage.WHEN_DATE__DSL_WHEN_DATE_OTHER:
        return getDsl_WhenDate_Other();
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
      case AtemPackage.WHEN_DATE__DSL_WHEN_DATE_CASES:
        getDsl_WhenDate_Cases().clear();
        getDsl_WhenDate_Cases().addAll((Collection<? extends WhenDateCase>)newValue);
        return;
      case AtemPackage.WHEN_DATE__DSL_WHEN_DATE_OTHER:
        setDsl_WhenDate_Other((WhenOther)newValue);
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
      case AtemPackage.WHEN_DATE__DSL_WHEN_DATE_CASES:
        getDsl_WhenDate_Cases().clear();
        return;
      case AtemPackage.WHEN_DATE__DSL_WHEN_DATE_OTHER:
        setDsl_WhenDate_Other((WhenOther)null);
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
      case AtemPackage.WHEN_DATE__DSL_WHEN_DATE_CASES:
        return dsl_WhenDate_Cases != null && !dsl_WhenDate_Cases.isEmpty();
      case AtemPackage.WHEN_DATE__DSL_WHEN_DATE_OTHER:
        return dsl_WhenDate_Other != null;
    }
    return super.eIsSet(featureID);
  }

} //WhenDateImpl
