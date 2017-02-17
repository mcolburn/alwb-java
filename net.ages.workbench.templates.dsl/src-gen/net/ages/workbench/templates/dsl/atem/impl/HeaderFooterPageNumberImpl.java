/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.HeaderFooterPageNumber;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Footer Page Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterPageNumberImpl#isDsl_HeaderFooterPageNumber <em>Dsl Header Footer Page Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderFooterPageNumberImpl extends HeaderFooterFragmentImpl implements HeaderFooterPageNumber
{
  /**
   * The default value of the '{@link #isDsl_HeaderFooterPageNumber() <em>Dsl Header Footer Page Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_HeaderFooterPageNumber()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_HEADER_FOOTER_PAGE_NUMBER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_HeaderFooterPageNumber() <em>Dsl Header Footer Page Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_HeaderFooterPageNumber()
   * @generated
   * @ordered
   */
  protected boolean dsl_HeaderFooterPageNumber = DSL_HEADER_FOOTER_PAGE_NUMBER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeaderFooterPageNumberImpl()
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
    return AtemPackage.Literals.HEADER_FOOTER_PAGE_NUMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_HeaderFooterPageNumber()
  {
    return dsl_HeaderFooterPageNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_HeaderFooterPageNumber(boolean newDsl_HeaderFooterPageNumber)
  {
    boolean oldDsl_HeaderFooterPageNumber = dsl_HeaderFooterPageNumber;
    dsl_HeaderFooterPageNumber = newDsl_HeaderFooterPageNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.HEADER_FOOTER_PAGE_NUMBER__DSL_HEADER_FOOTER_PAGE_NUMBER, oldDsl_HeaderFooterPageNumber, dsl_HeaderFooterPageNumber));
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
      case AtemPackage.HEADER_FOOTER_PAGE_NUMBER__DSL_HEADER_FOOTER_PAGE_NUMBER:
        return isDsl_HeaderFooterPageNumber();
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
      case AtemPackage.HEADER_FOOTER_PAGE_NUMBER__DSL_HEADER_FOOTER_PAGE_NUMBER:
        setDsl_HeaderFooterPageNumber((Boolean)newValue);
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
      case AtemPackage.HEADER_FOOTER_PAGE_NUMBER__DSL_HEADER_FOOTER_PAGE_NUMBER:
        setDsl_HeaderFooterPageNumber(DSL_HEADER_FOOTER_PAGE_NUMBER_EDEFAULT);
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
      case AtemPackage.HEADER_FOOTER_PAGE_NUMBER__DSL_HEADER_FOOTER_PAGE_NUMBER:
        return dsl_HeaderFooterPageNumber != DSL_HEADER_FOOTER_PAGE_NUMBER_EDEFAULT;
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
    result.append(" (dsl_HeaderFooterPageNumber: ");
    result.append(dsl_HeaderFooterPageNumber);
    result.append(')');
    return result.toString();
  }

} //HeaderFooterPageNumberImpl
