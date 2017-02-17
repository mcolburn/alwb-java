/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.GenYear;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.GenYearImpl#isDsl_Display_Year <em>Dsl Display Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenYearImpl extends LdpTypeImpl implements GenYear
{
  /**
   * The default value of the '{@link #isDsl_Display_Year() <em>Dsl Display Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_Year()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_DISPLAY_YEAR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_Display_Year() <em>Dsl Display Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Display_Year()
   * @generated
   * @ordered
   */
  protected boolean dsl_Display_Year = DSL_DISPLAY_YEAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenYearImpl()
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
    return AtemPackage.Literals.GEN_YEAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_Display_Year()
  {
    return dsl_Display_Year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Display_Year(boolean newDsl_Display_Year)
  {
    boolean oldDsl_Display_Year = dsl_Display_Year;
    dsl_Display_Year = newDsl_Display_Year;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.GEN_YEAR__DSL_DISPLAY_YEAR, oldDsl_Display_Year, dsl_Display_Year));
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
      case AtemPackage.GEN_YEAR__DSL_DISPLAY_YEAR:
        return isDsl_Display_Year();
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
      case AtemPackage.GEN_YEAR__DSL_DISPLAY_YEAR:
        setDsl_Display_Year((Boolean)newValue);
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
      case AtemPackage.GEN_YEAR__DSL_DISPLAY_YEAR:
        setDsl_Display_Year(DSL_DISPLAY_YEAR_EDEFAULT);
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
      case AtemPackage.GEN_YEAR__DSL_DISPLAY_YEAR:
        return dsl_Display_Year != DSL_DISPLAY_YEAR_EDEFAULT;
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
    result.append(" (dsl_Display_Year: ");
    result.append(dsl_Display_Year);
    result.append(')');
    return result.toString();
  }

} //GenYearImpl
