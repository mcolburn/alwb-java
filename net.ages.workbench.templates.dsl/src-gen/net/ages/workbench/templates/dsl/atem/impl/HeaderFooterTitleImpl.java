/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.HeaderFooterTitle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Footer Title</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterTitleImpl#isDsl_HeaderFooterTitle <em>Dsl Header Footer Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderFooterTitleImpl extends HeaderFooterFragmentImpl implements HeaderFooterTitle
{
  /**
   * The default value of the '{@link #isDsl_HeaderFooterTitle() <em>Dsl Header Footer Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_HeaderFooterTitle()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_HEADER_FOOTER_TITLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_HeaderFooterTitle() <em>Dsl Header Footer Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_HeaderFooterTitle()
   * @generated
   * @ordered
   */
  protected boolean dsl_HeaderFooterTitle = DSL_HEADER_FOOTER_TITLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeaderFooterTitleImpl()
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
    return AtemPackage.Literals.HEADER_FOOTER_TITLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_HeaderFooterTitle()
  {
    return dsl_HeaderFooterTitle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_HeaderFooterTitle(boolean newDsl_HeaderFooterTitle)
  {
    boolean oldDsl_HeaderFooterTitle = dsl_HeaderFooterTitle;
    dsl_HeaderFooterTitle = newDsl_HeaderFooterTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.HEADER_FOOTER_TITLE__DSL_HEADER_FOOTER_TITLE, oldDsl_HeaderFooterTitle, dsl_HeaderFooterTitle));
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
      case AtemPackage.HEADER_FOOTER_TITLE__DSL_HEADER_FOOTER_TITLE:
        return isDsl_HeaderFooterTitle();
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
      case AtemPackage.HEADER_FOOTER_TITLE__DSL_HEADER_FOOTER_TITLE:
        setDsl_HeaderFooterTitle((Boolean)newValue);
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
      case AtemPackage.HEADER_FOOTER_TITLE__DSL_HEADER_FOOTER_TITLE:
        setDsl_HeaderFooterTitle(DSL_HEADER_FOOTER_TITLE_EDEFAULT);
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
      case AtemPackage.HEADER_FOOTER_TITLE__DSL_HEADER_FOOTER_TITLE:
        return dsl_HeaderFooterTitle != DSL_HEADER_FOOTER_TITLE_EDEFAULT;
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
    result.append(" (dsl_HeaderFooterTitle: ");
    result.append(dsl_HeaderFooterTitle);
    result.append(')');
    return result.toString();
  }

} //HeaderFooterTitleImpl
