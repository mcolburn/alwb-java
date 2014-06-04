/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.HeaderFooterCommemoration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Footer Commemoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterCommemorationImpl#isDsl_HeaderFooterCommemoration <em>Dsl Header Footer Commemoration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderFooterCommemorationImpl extends HeaderFooterFragmentImpl implements HeaderFooterCommemoration
{
  /**
   * The default value of the '{@link #isDsl_HeaderFooterCommemoration() <em>Dsl Header Footer Commemoration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_HeaderFooterCommemoration()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_HEADER_FOOTER_COMMEMORATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_HeaderFooterCommemoration() <em>Dsl Header Footer Commemoration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_HeaderFooterCommemoration()
   * @generated
   * @ordered
   */
  protected boolean dsl_HeaderFooterCommemoration = DSL_HEADER_FOOTER_COMMEMORATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeaderFooterCommemorationImpl()
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
    return AtemPackage.Literals.HEADER_FOOTER_COMMEMORATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_HeaderFooterCommemoration()
  {
    return dsl_HeaderFooterCommemoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_HeaderFooterCommemoration(boolean newDsl_HeaderFooterCommemoration)
  {
    boolean oldDsl_HeaderFooterCommemoration = dsl_HeaderFooterCommemoration;
    dsl_HeaderFooterCommemoration = newDsl_HeaderFooterCommemoration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.HEADER_FOOTER_COMMEMORATION__DSL_HEADER_FOOTER_COMMEMORATION, oldDsl_HeaderFooterCommemoration, dsl_HeaderFooterCommemoration));
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
      case AtemPackage.HEADER_FOOTER_COMMEMORATION__DSL_HEADER_FOOTER_COMMEMORATION:
        return isDsl_HeaderFooterCommemoration();
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
      case AtemPackage.HEADER_FOOTER_COMMEMORATION__DSL_HEADER_FOOTER_COMMEMORATION:
        setDsl_HeaderFooterCommemoration((Boolean)newValue);
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
      case AtemPackage.HEADER_FOOTER_COMMEMORATION__DSL_HEADER_FOOTER_COMMEMORATION:
        setDsl_HeaderFooterCommemoration(DSL_HEADER_FOOTER_COMMEMORATION_EDEFAULT);
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
      case AtemPackage.HEADER_FOOTER_COMMEMORATION__DSL_HEADER_FOOTER_COMMEMORATION:
        return dsl_HeaderFooterCommemoration != DSL_HEADER_FOOTER_COMMEMORATION_EDEFAULT;
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
    result.append(" (dsl_HeaderFooterCommemoration: ");
    result.append(dsl_HeaderFooterCommemoration);
    result.append(')');
    return result.toString();
  }

} //HeaderFooterCommemorationImpl
