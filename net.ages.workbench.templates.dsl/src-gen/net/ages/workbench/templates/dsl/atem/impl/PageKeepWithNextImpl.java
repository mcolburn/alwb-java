/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.PageKeepWithNext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Keep With Next</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.PageKeepWithNextImpl#getDsl_PageKeepWithNext_value <em>Dsl Page Keep With Next value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageKeepWithNextImpl extends HeadComponentImpl implements PageKeepWithNext
{
  /**
   * The default value of the '{@link #getDsl_PageKeepWithNext_value() <em>Dsl Page Keep With Next value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_PageKeepWithNext_value()
   * @generated
   * @ordered
   */
  protected static final String DSL_PAGE_KEEP_WITH_NEXT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDsl_PageKeepWithNext_value() <em>Dsl Page Keep With Next value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_PageKeepWithNext_value()
   * @generated
   * @ordered
   */
  protected String dsl_PageKeepWithNext_value = DSL_PAGE_KEEP_WITH_NEXT_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PageKeepWithNextImpl()
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
    return AtemPackage.Literals.PAGE_KEEP_WITH_NEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDsl_PageKeepWithNext_value()
  {
    return dsl_PageKeepWithNext_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_PageKeepWithNext_value(String newDsl_PageKeepWithNext_value)
  {
    String oldDsl_PageKeepWithNext_value = dsl_PageKeepWithNext_value;
    dsl_PageKeepWithNext_value = newDsl_PageKeepWithNext_value;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.PAGE_KEEP_WITH_NEXT__DSL_PAGE_KEEP_WITH_NEXT_VALUE, oldDsl_PageKeepWithNext_value, dsl_PageKeepWithNext_value));
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
      case AtemPackage.PAGE_KEEP_WITH_NEXT__DSL_PAGE_KEEP_WITH_NEXT_VALUE:
        return getDsl_PageKeepWithNext_value();
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
      case AtemPackage.PAGE_KEEP_WITH_NEXT__DSL_PAGE_KEEP_WITH_NEXT_VALUE:
        setDsl_PageKeepWithNext_value((String)newValue);
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
      case AtemPackage.PAGE_KEEP_WITH_NEXT__DSL_PAGE_KEEP_WITH_NEXT_VALUE:
        setDsl_PageKeepWithNext_value(DSL_PAGE_KEEP_WITH_NEXT_VALUE_EDEFAULT);
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
      case AtemPackage.PAGE_KEEP_WITH_NEXT__DSL_PAGE_KEEP_WITH_NEXT_VALUE:
        return DSL_PAGE_KEEP_WITH_NEXT_VALUE_EDEFAULT == null ? dsl_PageKeepWithNext_value != null : !DSL_PAGE_KEEP_WITH_NEXT_VALUE_EDEFAULT.equals(dsl_PageKeepWithNext_value);
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
    result.append(" (dsl_PageKeepWithNext_value: ");
    result.append(dsl_PageKeepWithNext_value);
    result.append(')');
    return result.toString();
  }

} //PageKeepWithNextImpl
