/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.WhenDayName;
import net.ages.workbench.templates.dsl.atem.WhenDayNameCase;
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
 * An implementation of the model object '<em><b>When Day Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenDayNameImpl#getDsl_WhenDayName_Cases <em>Dsl When Day Name Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenDayNameImpl#getDsl_WhenDayName_Other <em>Dsl When Day Name Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenDayNameImpl extends AbstractComponentImpl implements WhenDayName
{
  /**
   * The cached value of the '{@link #getDsl_WhenDayName_Cases() <em>Dsl When Day Name Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenDayName_Cases()
   * @generated
   * @ordered
   */
  protected EList<WhenDayNameCase> dsl_WhenDayName_Cases;

  /**
   * The cached value of the '{@link #getDsl_WhenDayName_Other() <em>Dsl When Day Name Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenDayName_Other()
   * @generated
   * @ordered
   */
  protected WhenOther dsl_WhenDayName_Other;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenDayNameImpl()
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
    return AtemPackage.Literals.WHEN_DAY_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WhenDayNameCase> getDsl_WhenDayName_Cases()
  {
    if (dsl_WhenDayName_Cases == null)
    {
      dsl_WhenDayName_Cases = new EObjectContainmentEList<WhenDayNameCase>(WhenDayNameCase.class, this, AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_CASES);
    }
    return dsl_WhenDayName_Cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenOther getDsl_WhenDayName_Other()
  {
    return dsl_WhenDayName_Other;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_WhenDayName_Other(WhenOther newDsl_WhenDayName_Other, NotificationChain msgs)
  {
    WhenOther oldDsl_WhenDayName_Other = dsl_WhenDayName_Other;
    dsl_WhenDayName_Other = newDsl_WhenDayName_Other;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_OTHER, oldDsl_WhenDayName_Other, newDsl_WhenDayName_Other);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_WhenDayName_Other(WhenOther newDsl_WhenDayName_Other)
  {
    if (newDsl_WhenDayName_Other != dsl_WhenDayName_Other)
    {
      NotificationChain msgs = null;
      if (dsl_WhenDayName_Other != null)
        msgs = ((InternalEObject)dsl_WhenDayName_Other).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_OTHER, null, msgs);
      if (newDsl_WhenDayName_Other != null)
        msgs = ((InternalEObject)newDsl_WhenDayName_Other).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_OTHER, null, msgs);
      msgs = basicSetDsl_WhenDayName_Other(newDsl_WhenDayName_Other, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_OTHER, newDsl_WhenDayName_Other, newDsl_WhenDayName_Other));
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
      case AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_CASES:
        return ((InternalEList<?>)getDsl_WhenDayName_Cases()).basicRemove(otherEnd, msgs);
      case AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_OTHER:
        return basicSetDsl_WhenDayName_Other(null, msgs);
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
      case AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_CASES:
        return getDsl_WhenDayName_Cases();
      case AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_OTHER:
        return getDsl_WhenDayName_Other();
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
      case AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_CASES:
        getDsl_WhenDayName_Cases().clear();
        getDsl_WhenDayName_Cases().addAll((Collection<? extends WhenDayNameCase>)newValue);
        return;
      case AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_OTHER:
        setDsl_WhenDayName_Other((WhenOther)newValue);
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
      case AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_CASES:
        getDsl_WhenDayName_Cases().clear();
        return;
      case AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_OTHER:
        setDsl_WhenDayName_Other((WhenOther)null);
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
      case AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_CASES:
        return dsl_WhenDayName_Cases != null && !dsl_WhenDayName_Cases.isEmpty();
      case AtemPackage.WHEN_DAY_NAME__DSL_WHEN_DAY_NAME_OTHER:
        return dsl_WhenDayName_Other != null;
    }
    return super.eIsSet(featureID);
  }

} //WhenDayNameImpl
