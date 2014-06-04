/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.SetLocale;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Locale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.SetLocaleImpl#getDsl_SetLocale_V1 <em>Dsl Set Locale V1</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.SetLocaleImpl#getDsl_SetLocale_V2 <em>Dsl Set Locale V2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetLocaleImpl extends AbstractComponentImpl implements SetLocale
{
  /**
   * The default value of the '{@link #getDsl_SetLocale_V1() <em>Dsl Set Locale V1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_SetLocale_V1()
   * @generated
   * @ordered
   */
  protected static final String DSL_SET_LOCALE_V1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDsl_SetLocale_V1() <em>Dsl Set Locale V1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_SetLocale_V1()
   * @generated
   * @ordered
   */
  protected String dsl_SetLocale_V1 = DSL_SET_LOCALE_V1_EDEFAULT;

  /**
   * The default value of the '{@link #getDsl_SetLocale_V2() <em>Dsl Set Locale V2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_SetLocale_V2()
   * @generated
   * @ordered
   */
  protected static final String DSL_SET_LOCALE_V2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDsl_SetLocale_V2() <em>Dsl Set Locale V2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_SetLocale_V2()
   * @generated
   * @ordered
   */
  protected String dsl_SetLocale_V2 = DSL_SET_LOCALE_V2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetLocaleImpl()
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
    return AtemPackage.Literals.SET_LOCALE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDsl_SetLocale_V1()
  {
    return dsl_SetLocale_V1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_SetLocale_V1(String newDsl_SetLocale_V1)
  {
    String oldDsl_SetLocale_V1 = dsl_SetLocale_V1;
    dsl_SetLocale_V1 = newDsl_SetLocale_V1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.SET_LOCALE__DSL_SET_LOCALE_V1, oldDsl_SetLocale_V1, dsl_SetLocale_V1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDsl_SetLocale_V2()
  {
    return dsl_SetLocale_V2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_SetLocale_V2(String newDsl_SetLocale_V2)
  {
    String oldDsl_SetLocale_V2 = dsl_SetLocale_V2;
    dsl_SetLocale_V2 = newDsl_SetLocale_V2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.SET_LOCALE__DSL_SET_LOCALE_V2, oldDsl_SetLocale_V2, dsl_SetLocale_V2));
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
      case AtemPackage.SET_LOCALE__DSL_SET_LOCALE_V1:
        return getDsl_SetLocale_V1();
      case AtemPackage.SET_LOCALE__DSL_SET_LOCALE_V2:
        return getDsl_SetLocale_V2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AtemPackage.SET_LOCALE__DSL_SET_LOCALE_V1:
        setDsl_SetLocale_V1((String)newValue);
        return;
      case AtemPackage.SET_LOCALE__DSL_SET_LOCALE_V2:
        setDsl_SetLocale_V2((String)newValue);
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
      case AtemPackage.SET_LOCALE__DSL_SET_LOCALE_V1:
        setDsl_SetLocale_V1(DSL_SET_LOCALE_V1_EDEFAULT);
        return;
      case AtemPackage.SET_LOCALE__DSL_SET_LOCALE_V2:
        setDsl_SetLocale_V2(DSL_SET_LOCALE_V2_EDEFAULT);
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
      case AtemPackage.SET_LOCALE__DSL_SET_LOCALE_V1:
        return DSL_SET_LOCALE_V1_EDEFAULT == null ? dsl_SetLocale_V1 != null : !DSL_SET_LOCALE_V1_EDEFAULT.equals(dsl_SetLocale_V1);
      case AtemPackage.SET_LOCALE__DSL_SET_LOCALE_V2:
        return DSL_SET_LOCALE_V2_EDEFAULT == null ? dsl_SetLocale_V2 != null : !DSL_SET_LOCALE_V2_EDEFAULT.equals(dsl_SetLocale_V2);
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
    result.append(" (dsl_SetLocale_V1: ");
    result.append(dsl_SetLocale_V1);
    result.append(", dsl_SetLocale_V2: ");
    result.append(dsl_SetLocale_V2);
    result.append(')');
    return result.toString();
  }

} //SetLocaleImpl
