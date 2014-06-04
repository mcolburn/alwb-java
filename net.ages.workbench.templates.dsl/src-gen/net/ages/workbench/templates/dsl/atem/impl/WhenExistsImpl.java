/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.WhenExists;
import net.ages.workbench.templates.dsl.atem.WhenExistsCase;
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
 * An implementation of the model object '<em><b>When Exists</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenExistsImpl#getDsl_WhenExists_Cases <em>Dsl When Exists Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenExistsImpl#getDsl_WhenExists_Other <em>Dsl When Exists Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenExistsImpl extends AbstractComponentImpl implements WhenExists
{
  /**
   * The cached value of the '{@link #getDsl_WhenExists_Cases() <em>Dsl When Exists Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenExists_Cases()
   * @generated
   * @ordered
   */
  protected EList<WhenExistsCase> dsl_WhenExists_Cases;

  /**
   * The cached value of the '{@link #getDsl_WhenExists_Other() <em>Dsl When Exists Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenExists_Other()
   * @generated
   * @ordered
   */
  protected WhenOther dsl_WhenExists_Other;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenExistsImpl()
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
    return AtemPackage.Literals.WHEN_EXISTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WhenExistsCase> getDsl_WhenExists_Cases()
  {
    if (dsl_WhenExists_Cases == null)
    {
      dsl_WhenExists_Cases = new EObjectContainmentEList<WhenExistsCase>(WhenExistsCase.class, this, AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_CASES);
    }
    return dsl_WhenExists_Cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenOther getDsl_WhenExists_Other()
  {
    return dsl_WhenExists_Other;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_WhenExists_Other(WhenOther newDsl_WhenExists_Other, NotificationChain msgs)
  {
    WhenOther oldDsl_WhenExists_Other = dsl_WhenExists_Other;
    dsl_WhenExists_Other = newDsl_WhenExists_Other;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_OTHER, oldDsl_WhenExists_Other, newDsl_WhenExists_Other);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_WhenExists_Other(WhenOther newDsl_WhenExists_Other)
  {
    if (newDsl_WhenExists_Other != dsl_WhenExists_Other)
    {
      NotificationChain msgs = null;
      if (dsl_WhenExists_Other != null)
        msgs = ((InternalEObject)dsl_WhenExists_Other).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_OTHER, null, msgs);
      if (newDsl_WhenExists_Other != null)
        msgs = ((InternalEObject)newDsl_WhenExists_Other).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_OTHER, null, msgs);
      msgs = basicSetDsl_WhenExists_Other(newDsl_WhenExists_Other, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_OTHER, newDsl_WhenExists_Other, newDsl_WhenExists_Other));
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
      case AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_CASES:
        return ((InternalEList<?>)getDsl_WhenExists_Cases()).basicRemove(otherEnd, msgs);
      case AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_OTHER:
        return basicSetDsl_WhenExists_Other(null, msgs);
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
      case AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_CASES:
        return getDsl_WhenExists_Cases();
      case AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_OTHER:
        return getDsl_WhenExists_Other();
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
      case AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_CASES:
        getDsl_WhenExists_Cases().clear();
        getDsl_WhenExists_Cases().addAll((Collection<? extends WhenExistsCase>)newValue);
        return;
      case AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_OTHER:
        setDsl_WhenExists_Other((WhenOther)newValue);
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
      case AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_CASES:
        getDsl_WhenExists_Cases().clear();
        return;
      case AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_OTHER:
        setDsl_WhenExists_Other((WhenOther)null);
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
      case AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_CASES:
        return dsl_WhenExists_Cases != null && !dsl_WhenExists_Cases.isEmpty();
      case AtemPackage.WHEN_EXISTS__DSL_WHEN_EXISTS_OTHER:
        return dsl_WhenExists_Other != null;
    }
    return super.eIsSet(featureID);
  }

} //WhenExistsImpl
