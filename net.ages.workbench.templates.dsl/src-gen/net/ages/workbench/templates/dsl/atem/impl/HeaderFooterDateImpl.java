/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.HeaderFooterDate;
import net.ages.workbench.templates.dsl.atem.Language;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Footer Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterDateImpl#isDsl_HeaderFooterDate <em>Dsl Header Footer Date</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterDateImpl#getDsl_HeaderFooterDate_Language <em>Dsl Header Footer Date Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderFooterDateImpl extends HeaderFooterFragmentImpl implements HeaderFooterDate
{
  /**
   * The default value of the '{@link #isDsl_HeaderFooterDate() <em>Dsl Header Footer Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_HeaderFooterDate()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_HEADER_FOOTER_DATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_HeaderFooterDate() <em>Dsl Header Footer Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_HeaderFooterDate()
   * @generated
   * @ordered
   */
  protected boolean dsl_HeaderFooterDate = DSL_HEADER_FOOTER_DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getDsl_HeaderFooterDate_Language() <em>Dsl Header Footer Date Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_HeaderFooterDate_Language()
   * @generated
   * @ordered
   */
  protected static final Language DSL_HEADER_FOOTER_DATE_LANGUAGE_EDEFAULT = Language.L1;

  /**
   * The cached value of the '{@link #getDsl_HeaderFooterDate_Language() <em>Dsl Header Footer Date Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_HeaderFooterDate_Language()
   * @generated
   * @ordered
   */
  protected Language dsl_HeaderFooterDate_Language = DSL_HEADER_FOOTER_DATE_LANGUAGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeaderFooterDateImpl()
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
    return AtemPackage.Literals.HEADER_FOOTER_DATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_HeaderFooterDate()
  {
    return dsl_HeaderFooterDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_HeaderFooterDate(boolean newDsl_HeaderFooterDate)
  {
    boolean oldDsl_HeaderFooterDate = dsl_HeaderFooterDate;
    dsl_HeaderFooterDate = newDsl_HeaderFooterDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE, oldDsl_HeaderFooterDate, dsl_HeaderFooterDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Language getDsl_HeaderFooterDate_Language()
  {
    return dsl_HeaderFooterDate_Language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_HeaderFooterDate_Language(Language newDsl_HeaderFooterDate_Language)
  {
    Language oldDsl_HeaderFooterDate_Language = dsl_HeaderFooterDate_Language;
    dsl_HeaderFooterDate_Language = newDsl_HeaderFooterDate_Language == null ? DSL_HEADER_FOOTER_DATE_LANGUAGE_EDEFAULT : newDsl_HeaderFooterDate_Language;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE_LANGUAGE, oldDsl_HeaderFooterDate_Language, dsl_HeaderFooterDate_Language));
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
      case AtemPackage.HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE:
        return isDsl_HeaderFooterDate();
      case AtemPackage.HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE_LANGUAGE:
        return getDsl_HeaderFooterDate_Language();
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
      case AtemPackage.HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE:
        setDsl_HeaderFooterDate((Boolean)newValue);
        return;
      case AtemPackage.HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE_LANGUAGE:
        setDsl_HeaderFooterDate_Language((Language)newValue);
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
      case AtemPackage.HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE:
        setDsl_HeaderFooterDate(DSL_HEADER_FOOTER_DATE_EDEFAULT);
        return;
      case AtemPackage.HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE_LANGUAGE:
        setDsl_HeaderFooterDate_Language(DSL_HEADER_FOOTER_DATE_LANGUAGE_EDEFAULT);
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
      case AtemPackage.HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE:
        return dsl_HeaderFooterDate != DSL_HEADER_FOOTER_DATE_EDEFAULT;
      case AtemPackage.HEADER_FOOTER_DATE__DSL_HEADER_FOOTER_DATE_LANGUAGE:
        return dsl_HeaderFooterDate_Language != DSL_HEADER_FOOTER_DATE_LANGUAGE_EDEFAULT;
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
    result.append(" (dsl_HeaderFooterDate: ");
    result.append(dsl_HeaderFooterDate);
    result.append(", dsl_HeaderFooterDate_Language: ");
    result.append(dsl_HeaderFooterDate_Language);
    result.append(')');
    return result.toString();
  }

} //HeaderFooterDateImpl
