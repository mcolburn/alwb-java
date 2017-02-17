/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.MCD;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MCD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.MCDImpl#isDsl_MCD_value <em>Dsl MCD value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MCDImpl extends LdpTypeImpl implements MCD
{
  /**
   * The default value of the '{@link #isDsl_MCD_value() <em>Dsl MCD value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_MCD_value()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_MCD_VALUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_MCD_value() <em>Dsl MCD value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_MCD_value()
   * @generated
   * @ordered
   */
  protected boolean dsl_MCD_value = DSL_MCD_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MCDImpl()
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
    return AtemPackage.Literals.MCD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_MCD_value()
  {
    return dsl_MCD_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_MCD_value(boolean newDsl_MCD_value)
  {
    boolean oldDsl_MCD_value = dsl_MCD_value;
    dsl_MCD_value = newDsl_MCD_value;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.MCD__DSL_MCD_VALUE, oldDsl_MCD_value, dsl_MCD_value));
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
      case AtemPackage.MCD__DSL_MCD_VALUE:
        return isDsl_MCD_value();
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
      case AtemPackage.MCD__DSL_MCD_VALUE:
        setDsl_MCD_value((Boolean)newValue);
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
      case AtemPackage.MCD__DSL_MCD_VALUE:
        setDsl_MCD_value(DSL_MCD_VALUE_EDEFAULT);
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
      case AtemPackage.MCD__DSL_MCD_VALUE:
        return dsl_MCD_value != DSL_MCD_VALUE_EDEFAULT;
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
    result.append(" (dsl_MCD_value: ");
    result.append(dsl_MCD_value);
    result.append(')');
    return result.toString();
  }

} //MCDImpl
