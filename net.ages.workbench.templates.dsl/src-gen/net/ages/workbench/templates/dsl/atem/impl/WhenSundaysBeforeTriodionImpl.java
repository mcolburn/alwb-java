/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase;
import net.ages.workbench.templates.dsl.atem.WhenOther;
import net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion;

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
 * An implementation of the model object '<em><b>When Sundays Before Triodion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenSundaysBeforeTriodionImpl#getDsl_WhenSundaysBeforeTriodion_Cases <em>Dsl When Sundays Before Triodion Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenSundaysBeforeTriodionImpl#getDsl_SundaysBeforeTriodion_Other <em>Dsl Sundays Before Triodion Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenSundaysBeforeTriodionImpl extends AbstractComponentImpl implements WhenSundaysBeforeTriodion
{
  /**
   * The cached value of the '{@link #getDsl_WhenSundaysBeforeTriodion_Cases() <em>Dsl When Sundays Before Triodion Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenSundaysBeforeTriodion_Cases()
   * @generated
   * @ordered
   */
  protected EList<SundaysBeforeTriodionCase> dsl_WhenSundaysBeforeTriodion_Cases;

  /**
   * The cached value of the '{@link #getDsl_SundaysBeforeTriodion_Other() <em>Dsl Sundays Before Triodion Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_SundaysBeforeTriodion_Other()
   * @generated
   * @ordered
   */
  protected WhenOther dsl_SundaysBeforeTriodion_Other;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenSundaysBeforeTriodionImpl()
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
    return AtemPackage.Literals.WHEN_SUNDAYS_BEFORE_TRIODION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SundaysBeforeTriodionCase> getDsl_WhenSundaysBeforeTriodion_Cases()
  {
    if (dsl_WhenSundaysBeforeTriodion_Cases == null)
    {
      dsl_WhenSundaysBeforeTriodion_Cases = new EObjectContainmentEList<SundaysBeforeTriodionCase>(SundaysBeforeTriodionCase.class, this, AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_WHEN_SUNDAYS_BEFORE_TRIODION_CASES);
    }
    return dsl_WhenSundaysBeforeTriodion_Cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenOther getDsl_SundaysBeforeTriodion_Other()
  {
    return dsl_SundaysBeforeTriodion_Other;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_SundaysBeforeTriodion_Other(WhenOther newDsl_SundaysBeforeTriodion_Other, NotificationChain msgs)
  {
    WhenOther oldDsl_SundaysBeforeTriodion_Other = dsl_SundaysBeforeTriodion_Other;
    dsl_SundaysBeforeTriodion_Other = newDsl_SundaysBeforeTriodion_Other;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_SUNDAYS_BEFORE_TRIODION_OTHER, oldDsl_SundaysBeforeTriodion_Other, newDsl_SundaysBeforeTriodion_Other);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_SundaysBeforeTriodion_Other(WhenOther newDsl_SundaysBeforeTriodion_Other)
  {
    if (newDsl_SundaysBeforeTriodion_Other != dsl_SundaysBeforeTriodion_Other)
    {
      NotificationChain msgs = null;
      if (dsl_SundaysBeforeTriodion_Other != null)
        msgs = ((InternalEObject)dsl_SundaysBeforeTriodion_Other).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_SUNDAYS_BEFORE_TRIODION_OTHER, null, msgs);
      if (newDsl_SundaysBeforeTriodion_Other != null)
        msgs = ((InternalEObject)newDsl_SundaysBeforeTriodion_Other).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_SUNDAYS_BEFORE_TRIODION_OTHER, null, msgs);
      msgs = basicSetDsl_SundaysBeforeTriodion_Other(newDsl_SundaysBeforeTriodion_Other, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_SUNDAYS_BEFORE_TRIODION_OTHER, newDsl_SundaysBeforeTriodion_Other, newDsl_SundaysBeforeTriodion_Other));
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
      case AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_WHEN_SUNDAYS_BEFORE_TRIODION_CASES:
        return ((InternalEList<?>)getDsl_WhenSundaysBeforeTriodion_Cases()).basicRemove(otherEnd, msgs);
      case AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_SUNDAYS_BEFORE_TRIODION_OTHER:
        return basicSetDsl_SundaysBeforeTriodion_Other(null, msgs);
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
      case AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_WHEN_SUNDAYS_BEFORE_TRIODION_CASES:
        return getDsl_WhenSundaysBeforeTriodion_Cases();
      case AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_SUNDAYS_BEFORE_TRIODION_OTHER:
        return getDsl_SundaysBeforeTriodion_Other();
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
      case AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_WHEN_SUNDAYS_BEFORE_TRIODION_CASES:
        getDsl_WhenSundaysBeforeTriodion_Cases().clear();
        getDsl_WhenSundaysBeforeTriodion_Cases().addAll((Collection<? extends SundaysBeforeTriodionCase>)newValue);
        return;
      case AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_SUNDAYS_BEFORE_TRIODION_OTHER:
        setDsl_SundaysBeforeTriodion_Other((WhenOther)newValue);
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
      case AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_WHEN_SUNDAYS_BEFORE_TRIODION_CASES:
        getDsl_WhenSundaysBeforeTriodion_Cases().clear();
        return;
      case AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_SUNDAYS_BEFORE_TRIODION_OTHER:
        setDsl_SundaysBeforeTriodion_Other((WhenOther)null);
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
      case AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_WHEN_SUNDAYS_BEFORE_TRIODION_CASES:
        return dsl_WhenSundaysBeforeTriodion_Cases != null && !dsl_WhenSundaysBeforeTriodion_Cases.isEmpty();
      case AtemPackage.WHEN_SUNDAYS_BEFORE_TRIODION__DSL_SUNDAYS_BEFORE_TRIODION_OTHER:
        return dsl_SundaysBeforeTriodion_Other != null;
    }
    return super.eIsSet(featureID);
  }

} //WhenSundaysBeforeTriodionImpl
