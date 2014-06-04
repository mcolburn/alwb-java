/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.WhenModeOfWeek;
import net.ages.workbench.templates.dsl.atem.WhenModeOfWeekCase;
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
 * An implementation of the model object '<em><b>When Mode Of Week</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenModeOfWeekImpl#getDsl_WhenModeOfWeek_Cases <em>Dsl When Mode Of Week Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenModeOfWeekImpl#getDsl_WhenModeOfWeek_Other <em>Dsl When Mode Of Week Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenModeOfWeekImpl extends AbstractComponentImpl implements WhenModeOfWeek
{
  /**
   * The cached value of the '{@link #getDsl_WhenModeOfWeek_Cases() <em>Dsl When Mode Of Week Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenModeOfWeek_Cases()
   * @generated
   * @ordered
   */
  protected EList<WhenModeOfWeekCase> dsl_WhenModeOfWeek_Cases;

  /**
   * The cached value of the '{@link #getDsl_WhenModeOfWeek_Other() <em>Dsl When Mode Of Week Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenModeOfWeek_Other()
   * @generated
   * @ordered
   */
  protected WhenOther dsl_WhenModeOfWeek_Other;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenModeOfWeekImpl()
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
    return AtemPackage.Literals.WHEN_MODE_OF_WEEK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WhenModeOfWeekCase> getDsl_WhenModeOfWeek_Cases()
  {
    if (dsl_WhenModeOfWeek_Cases == null)
    {
      dsl_WhenModeOfWeek_Cases = new EObjectContainmentEList<WhenModeOfWeekCase>(WhenModeOfWeekCase.class, this, AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_CASES);
    }
    return dsl_WhenModeOfWeek_Cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenOther getDsl_WhenModeOfWeek_Other()
  {
    return dsl_WhenModeOfWeek_Other;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_WhenModeOfWeek_Other(WhenOther newDsl_WhenModeOfWeek_Other, NotificationChain msgs)
  {
    WhenOther oldDsl_WhenModeOfWeek_Other = dsl_WhenModeOfWeek_Other;
    dsl_WhenModeOfWeek_Other = newDsl_WhenModeOfWeek_Other;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_OTHER, oldDsl_WhenModeOfWeek_Other, newDsl_WhenModeOfWeek_Other);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_WhenModeOfWeek_Other(WhenOther newDsl_WhenModeOfWeek_Other)
  {
    if (newDsl_WhenModeOfWeek_Other != dsl_WhenModeOfWeek_Other)
    {
      NotificationChain msgs = null;
      if (dsl_WhenModeOfWeek_Other != null)
        msgs = ((InternalEObject)dsl_WhenModeOfWeek_Other).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_OTHER, null, msgs);
      if (newDsl_WhenModeOfWeek_Other != null)
        msgs = ((InternalEObject)newDsl_WhenModeOfWeek_Other).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_OTHER, null, msgs);
      msgs = basicSetDsl_WhenModeOfWeek_Other(newDsl_WhenModeOfWeek_Other, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_OTHER, newDsl_WhenModeOfWeek_Other, newDsl_WhenModeOfWeek_Other));
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
      case AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_CASES:
        return ((InternalEList<?>)getDsl_WhenModeOfWeek_Cases()).basicRemove(otherEnd, msgs);
      case AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_OTHER:
        return basicSetDsl_WhenModeOfWeek_Other(null, msgs);
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
      case AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_CASES:
        return getDsl_WhenModeOfWeek_Cases();
      case AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_OTHER:
        return getDsl_WhenModeOfWeek_Other();
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
      case AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_CASES:
        getDsl_WhenModeOfWeek_Cases().clear();
        getDsl_WhenModeOfWeek_Cases().addAll((Collection<? extends WhenModeOfWeekCase>)newValue);
        return;
      case AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_OTHER:
        setDsl_WhenModeOfWeek_Other((WhenOther)newValue);
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
      case AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_CASES:
        getDsl_WhenModeOfWeek_Cases().clear();
        return;
      case AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_OTHER:
        setDsl_WhenModeOfWeek_Other((WhenOther)null);
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
      case AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_CASES:
        return dsl_WhenModeOfWeek_Cases != null && !dsl_WhenModeOfWeek_Cases.isEmpty();
      case AtemPackage.WHEN_MODE_OF_WEEK__DSL_WHEN_MODE_OF_WEEK_OTHER:
        return dsl_WhenModeOfWeek_Other != null;
    }
    return super.eIsSet(featureID);
  }

} //WhenModeOfWeekImpl
