/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.WhenDateCase;
import net.ages.workbench.templates.dsl.atem.WhenOther;
import net.ages.workbench.templates.dsl.atem.WhenSundayAfterElevationOfCrossDay;

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
 * An implementation of the model object '<em><b>When Sunday After Elevation Of Cross Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenSundayAfterElevationOfCrossDayImpl#getDsl_WhenSundayAfterElevationOfCrossDay_Cases <em>Dsl When Sunday After Elevation Of Cross Day Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenSundayAfterElevationOfCrossDayImpl#getDsl_WhenSundayAfterElevationOfCrossDay_Other <em>Dsl When Sunday After Elevation Of Cross Day Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenSundayAfterElevationOfCrossDayImpl extends AbstractComponentImpl implements WhenSundayAfterElevationOfCrossDay
{
  /**
   * The cached value of the '{@link #getDsl_WhenSundayAfterElevationOfCrossDay_Cases() <em>Dsl When Sunday After Elevation Of Cross Day Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenSundayAfterElevationOfCrossDay_Cases()
   * @generated
   * @ordered
   */
  protected EList<WhenDateCase> dsl_WhenSundayAfterElevationOfCrossDay_Cases;

  /**
   * The cached value of the '{@link #getDsl_WhenSundayAfterElevationOfCrossDay_Other() <em>Dsl When Sunday After Elevation Of Cross Day Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenSundayAfterElevationOfCrossDay_Other()
   * @generated
   * @ordered
   */
  protected WhenOther dsl_WhenSundayAfterElevationOfCrossDay_Other;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenSundayAfterElevationOfCrossDayImpl()
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
    return AtemPackage.Literals.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WhenDateCase> getDsl_WhenSundayAfterElevationOfCrossDay_Cases()
  {
    if (dsl_WhenSundayAfterElevationOfCrossDay_Cases == null)
    {
      dsl_WhenSundayAfterElevationOfCrossDay_Cases = new EObjectContainmentEList<WhenDateCase>(WhenDateCase.class, this, AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_CASES);
    }
    return dsl_WhenSundayAfterElevationOfCrossDay_Cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenOther getDsl_WhenSundayAfterElevationOfCrossDay_Other()
  {
    return dsl_WhenSundayAfterElevationOfCrossDay_Other;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_WhenSundayAfterElevationOfCrossDay_Other(WhenOther newDsl_WhenSundayAfterElevationOfCrossDay_Other, NotificationChain msgs)
  {
    WhenOther oldDsl_WhenSundayAfterElevationOfCrossDay_Other = dsl_WhenSundayAfterElevationOfCrossDay_Other;
    dsl_WhenSundayAfterElevationOfCrossDay_Other = newDsl_WhenSundayAfterElevationOfCrossDay_Other;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_OTHER, oldDsl_WhenSundayAfterElevationOfCrossDay_Other, newDsl_WhenSundayAfterElevationOfCrossDay_Other);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_WhenSundayAfterElevationOfCrossDay_Other(WhenOther newDsl_WhenSundayAfterElevationOfCrossDay_Other)
  {
    if (newDsl_WhenSundayAfterElevationOfCrossDay_Other != dsl_WhenSundayAfterElevationOfCrossDay_Other)
    {
      NotificationChain msgs = null;
      if (dsl_WhenSundayAfterElevationOfCrossDay_Other != null)
        msgs = ((InternalEObject)dsl_WhenSundayAfterElevationOfCrossDay_Other).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_OTHER, null, msgs);
      if (newDsl_WhenSundayAfterElevationOfCrossDay_Other != null)
        msgs = ((InternalEObject)newDsl_WhenSundayAfterElevationOfCrossDay_Other).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_OTHER, null, msgs);
      msgs = basicSetDsl_WhenSundayAfterElevationOfCrossDay_Other(newDsl_WhenSundayAfterElevationOfCrossDay_Other, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_OTHER, newDsl_WhenSundayAfterElevationOfCrossDay_Other, newDsl_WhenSundayAfterElevationOfCrossDay_Other));
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
      case AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_CASES:
        return ((InternalEList<?>)getDsl_WhenSundayAfterElevationOfCrossDay_Cases()).basicRemove(otherEnd, msgs);
      case AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_OTHER:
        return basicSetDsl_WhenSundayAfterElevationOfCrossDay_Other(null, msgs);
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
      case AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_CASES:
        return getDsl_WhenSundayAfterElevationOfCrossDay_Cases();
      case AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_OTHER:
        return getDsl_WhenSundayAfterElevationOfCrossDay_Other();
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
      case AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_CASES:
        getDsl_WhenSundayAfterElevationOfCrossDay_Cases().clear();
        getDsl_WhenSundayAfterElevationOfCrossDay_Cases().addAll((Collection<? extends WhenDateCase>)newValue);
        return;
      case AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_OTHER:
        setDsl_WhenSundayAfterElevationOfCrossDay_Other((WhenOther)newValue);
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
      case AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_CASES:
        getDsl_WhenSundayAfterElevationOfCrossDay_Cases().clear();
        return;
      case AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_OTHER:
        setDsl_WhenSundayAfterElevationOfCrossDay_Other((WhenOther)null);
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
      case AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_CASES:
        return dsl_WhenSundayAfterElevationOfCrossDay_Cases != null && !dsl_WhenSundayAfterElevationOfCrossDay_Cases.isEmpty();
      case AtemPackage.WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY__DSL_WHEN_SUNDAY_AFTER_ELEVATION_OF_CROSS_DAY_OTHER:
        return dsl_WhenSundayAfterElevationOfCrossDay_Other != null;
    }
    return super.eIsSet(featureID);
  }

} //WhenSundayAfterElevationOfCrossDayImpl
