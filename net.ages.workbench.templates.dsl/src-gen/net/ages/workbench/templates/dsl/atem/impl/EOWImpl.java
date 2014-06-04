/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.EOW;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOW</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.EOWImpl#isDsl_Display_Eothinon <em>Dsl Display Eothinon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EOWImpl extends LdpTypeImpl implements EOW
{
  /**
   * The default value of the '{@link #isDsl_Display_Eothinon() <em>Dsl Display Eothinon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_Eothinon()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_DISPLAY_EOTHINON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_Display_Eothinon() <em>Dsl Display Eothinon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_Eothinon()
   * @generated
   * @ordered
   */
  protected boolean dsl_Display_Eothinon = DSL_DISPLAY_EOTHINON_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EOWImpl()
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
    return AtemPackage.Literals.EOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_Display_Eothinon()
  {
    return dsl_Display_Eothinon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Display_Eothinon(boolean newDsl_Display_Eothinon)
  {
    boolean oldDsl_Display_Eothinon = dsl_Display_Eothinon;
    dsl_Display_Eothinon = newDsl_Display_Eothinon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.EOW__DSL_DISPLAY_EOTHINON, oldDsl_Display_Eothinon, dsl_Display_Eothinon));
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
      case AtemPackage.EOW__DSL_DISPLAY_EOTHINON:
        return isDsl_Display_Eothinon();
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
      case AtemPackage.EOW__DSL_DISPLAY_EOTHINON:
        setDsl_Display_Eothinon((Boolean)newValue);
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
      case AtemPackage.EOW__DSL_DISPLAY_EOTHINON:
        setDsl_Display_Eothinon(DSL_DISPLAY_EOTHINON_EDEFAULT);
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
      case AtemPackage.EOW__DSL_DISPLAY_EOTHINON:
        return dsl_Display_Eothinon != DSL_DISPLAY_EOTHINON_EDEFAULT;
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
    result.append(" (dsl_Display_Eothinon: ");
    result.append(dsl_Display_Eothinon);
    result.append(')');
    return result.toString();
  }

} //EOWImpl
