/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.All;
import net.ages.workbench.templates.dsl.atem.AtemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.AllImpl#isDsl_Display_LiturgicalDayProperties <em>Dsl Display Liturgical Day Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllImpl extends LdpTypeImpl implements All
{
  /**
   * The default value of the '{@link #isDsl_Display_LiturgicalDayProperties() <em>Dsl Display Liturgical Day Properties</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_LiturgicalDayProperties()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_Display_LiturgicalDayProperties() <em>Dsl Display Liturgical Day Properties</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_LiturgicalDayProperties()
   * @generated
   * @ordered
   */
  protected boolean dsl_Display_LiturgicalDayProperties = DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AllImpl()
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
    return AtemPackage.Literals.ALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_Display_LiturgicalDayProperties()
  {
    return dsl_Display_LiturgicalDayProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Display_LiturgicalDayProperties(boolean newDsl_Display_LiturgicalDayProperties)
  {
    boolean oldDsl_Display_LiturgicalDayProperties = dsl_Display_LiturgicalDayProperties;
    dsl_Display_LiturgicalDayProperties = newDsl_Display_LiturgicalDayProperties;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.ALL__DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES, oldDsl_Display_LiturgicalDayProperties, dsl_Display_LiturgicalDayProperties));
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
      case AtemPackage.ALL__DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES:
        return isDsl_Display_LiturgicalDayProperties();
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
      case AtemPackage.ALL__DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES:
        setDsl_Display_LiturgicalDayProperties((Boolean)newValue);
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
      case AtemPackage.ALL__DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES:
        setDsl_Display_LiturgicalDayProperties(DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES_EDEFAULT);
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
      case AtemPackage.ALL__DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES:
        return dsl_Display_LiturgicalDayProperties != DSL_DISPLAY_LITURGICAL_DAY_PROPERTIES_EDEFAULT;
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
    result.append(" (dsl_Display_LiturgicalDayProperties: ");
    result.append(dsl_Display_LiturgicalDayProperties);
    result.append(')');
    return result.toString();
  }

} //AllImpl
