/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.HeaderFooterText;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Footer Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterTextImpl#getDsl_HeaderFooterText <em>Dsl Header Footer Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderFooterTextImpl extends HeaderFooterFragmentImpl implements HeaderFooterText
{
  /**
   * The default value of the '{@link #getDsl_HeaderFooterText() <em>Dsl Header Footer Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_HeaderFooterText()
   * @generated
   * @ordered
   */
  protected static final String DSL_HEADER_FOOTER_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDsl_HeaderFooterText() <em>Dsl Header Footer Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_HeaderFooterText()
   * @generated
   * @ordered
   */
  protected String dsl_HeaderFooterText = DSL_HEADER_FOOTER_TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeaderFooterTextImpl()
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
    return AtemPackage.Literals.HEADER_FOOTER_TEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDsl_HeaderFooterText()
  {
    return dsl_HeaderFooterText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_HeaderFooterText(String newDsl_HeaderFooterText)
  {
    String oldDsl_HeaderFooterText = dsl_HeaderFooterText;
    dsl_HeaderFooterText = newDsl_HeaderFooterText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.HEADER_FOOTER_TEXT__DSL_HEADER_FOOTER_TEXT, oldDsl_HeaderFooterText, dsl_HeaderFooterText));
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
      case AtemPackage.HEADER_FOOTER_TEXT__DSL_HEADER_FOOTER_TEXT:
        return getDsl_HeaderFooterText();
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
      case AtemPackage.HEADER_FOOTER_TEXT__DSL_HEADER_FOOTER_TEXT:
        setDsl_HeaderFooterText((String)newValue);
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
      case AtemPackage.HEADER_FOOTER_TEXT__DSL_HEADER_FOOTER_TEXT:
        setDsl_HeaderFooterText(DSL_HEADER_FOOTER_TEXT_EDEFAULT);
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
      case AtemPackage.HEADER_FOOTER_TEXT__DSL_HEADER_FOOTER_TEXT:
        return DSL_HEADER_FOOTER_TEXT_EDEFAULT == null ? dsl_HeaderFooterText != null : !DSL_HEADER_FOOTER_TEXT_EDEFAULT.equals(dsl_HeaderFooterText);
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
    result.append(" (dsl_HeaderFooterText: ");
    result.append(dsl_HeaderFooterText);
    result.append(')');
    return result.toString();
  }

} //HeaderFooterTextImpl
