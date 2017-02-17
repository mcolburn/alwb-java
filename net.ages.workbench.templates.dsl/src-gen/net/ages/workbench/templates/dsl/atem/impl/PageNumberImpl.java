/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.PageNumber;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.PageNumberImpl#getDsl_PageNumber_value <em>Dsl Page Number value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageNumberImpl extends HeadComponentImpl implements PageNumber
{
  /**
   * The default value of the '{@link #getDsl_PageNumber_value() <em>Dsl Page Number value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_PageNumber_value()
   * @generated
   * @ordered
   */
  protected static final int DSL_PAGE_NUMBER_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDsl_PageNumber_value() <em>Dsl Page Number value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_PageNumber_value()
   * @generated
   * @ordered
   */
  protected int dsl_PageNumber_value = DSL_PAGE_NUMBER_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PageNumberImpl()
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
    return AtemPackage.Literals.PAGE_NUMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDsl_PageNumber_value()
  {
    return dsl_PageNumber_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_PageNumber_value(int newDsl_PageNumber_value)
  {
    int oldDsl_PageNumber_value = dsl_PageNumber_value;
    dsl_PageNumber_value = newDsl_PageNumber_value;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.PAGE_NUMBER__DSL_PAGE_NUMBER_VALUE, oldDsl_PageNumber_value, dsl_PageNumber_value));
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
      case AtemPackage.PAGE_NUMBER__DSL_PAGE_NUMBER_VALUE:
        return getDsl_PageNumber_value();
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
      case AtemPackage.PAGE_NUMBER__DSL_PAGE_NUMBER_VALUE:
        setDsl_PageNumber_value((Integer)newValue);
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
      case AtemPackage.PAGE_NUMBER__DSL_PAGE_NUMBER_VALUE:
        setDsl_PageNumber_value(DSL_PAGE_NUMBER_VALUE_EDEFAULT);
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
      case AtemPackage.PAGE_NUMBER__DSL_PAGE_NUMBER_VALUE:
        return dsl_PageNumber_value != DSL_PAGE_NUMBER_VALUE_EDEFAULT;
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
    result.append(" (dsl_PageNumber_value: ");
    result.append(dsl_PageNumber_value);
    result.append(')');
    return result.toString();
  }

} //PageNumberImpl
