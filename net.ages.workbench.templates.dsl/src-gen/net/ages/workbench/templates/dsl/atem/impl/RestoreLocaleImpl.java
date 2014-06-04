/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.RestoreLocale;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restore Locale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.RestoreLocaleImpl#isDsl_RestoreLocale <em>Dsl Restore Locale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestoreLocaleImpl extends AbstractComponentImpl implements RestoreLocale
{
  /**
   * The default value of the '{@link #isDsl_RestoreLocale() <em>Dsl Restore Locale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_RestoreLocale()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_RESTORE_LOCALE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_RestoreLocale() <em>Dsl Restore Locale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_RestoreLocale()
   * @generated
   * @ordered
   */
  protected boolean dsl_RestoreLocale = DSL_RESTORE_LOCALE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RestoreLocaleImpl()
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
    return AtemPackage.Literals.RESTORE_LOCALE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_RestoreLocale()
  {
    return dsl_RestoreLocale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_RestoreLocale(boolean newDsl_RestoreLocale)
  {
    boolean oldDsl_RestoreLocale = dsl_RestoreLocale;
    dsl_RestoreLocale = newDsl_RestoreLocale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.RESTORE_LOCALE__DSL_RESTORE_LOCALE, oldDsl_RestoreLocale, dsl_RestoreLocale));
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
      case AtemPackage.RESTORE_LOCALE__DSL_RESTORE_LOCALE:
        return isDsl_RestoreLocale();
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
      case AtemPackage.RESTORE_LOCALE__DSL_RESTORE_LOCALE:
        setDsl_RestoreLocale((Boolean)newValue);
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
      case AtemPackage.RESTORE_LOCALE__DSL_RESTORE_LOCALE:
        setDsl_RestoreLocale(DSL_RESTORE_LOCALE_EDEFAULT);
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
      case AtemPackage.RESTORE_LOCALE__DSL_RESTORE_LOCALE:
        return dsl_RestoreLocale != DSL_RESTORE_LOCALE_EDEFAULT;
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
    result.append(" (dsl_RestoreLocale: ");
    result.append(dsl_RestoreLocale);
    result.append(')');
    return result.toString();
  }

} //RestoreLocaleImpl
