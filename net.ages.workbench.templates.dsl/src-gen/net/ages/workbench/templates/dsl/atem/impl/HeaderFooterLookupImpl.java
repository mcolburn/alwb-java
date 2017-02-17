/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.ElementType;
import net.ages.workbench.templates.dsl.atem.HeaderFooterLookup;
import net.ages.workbench.templates.dsl.atem.Language;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Footer Lookup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterLookupImpl#getDsl_HeaderFooterLookup_Elements <em>Dsl Header Footer Lookup Elements</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterLookupImpl#getDsl_HeaderFooterLookup_Language <em>Dsl Header Footer Lookup Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderFooterLookupImpl extends HeaderFooterFragmentImpl implements HeaderFooterLookup
{
  /**
   * The cached value of the '{@link #getDsl_HeaderFooterLookup_Elements() <em>Dsl Header Footer Lookup Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_HeaderFooterLookup_Elements()
   * @generated
   * @ordered
   */
  protected EList<ElementType> dsl_HeaderFooterLookup_Elements;

  /**
   * The default value of the '{@link #getDsl_HeaderFooterLookup_Language() <em>Dsl Header Footer Lookup Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_HeaderFooterLookup_Language()
   * @generated
   * @ordered
   */
  protected static final Language DSL_HEADER_FOOTER_LOOKUP_LANGUAGE_EDEFAULT = Language.L1;

  /**
   * The cached value of the '{@link #getDsl_HeaderFooterLookup_Language() <em>Dsl Header Footer Lookup Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_HeaderFooterLookup_Language()
   * @generated
   * @ordered
   */
  protected Language dsl_HeaderFooterLookup_Language = DSL_HEADER_FOOTER_LOOKUP_LANGUAGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeaderFooterLookupImpl()
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
    return AtemPackage.Literals.HEADER_FOOTER_LOOKUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementType> getDsl_HeaderFooterLookup_Elements()
  {
    if (dsl_HeaderFooterLookup_Elements == null)
    {
      dsl_HeaderFooterLookup_Elements = new EObjectContainmentEList<ElementType>(ElementType.class, this, AtemPackage.HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_ELEMENTS);
    }
    return dsl_HeaderFooterLookup_Elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Language getDsl_HeaderFooterLookup_Language()
  {
    return dsl_HeaderFooterLookup_Language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_HeaderFooterLookup_Language(Language newDsl_HeaderFooterLookup_Language)
  {
    Language oldDsl_HeaderFooterLookup_Language = dsl_HeaderFooterLookup_Language;
    dsl_HeaderFooterLookup_Language = newDsl_HeaderFooterLookup_Language == null ? DSL_HEADER_FOOTER_LOOKUP_LANGUAGE_EDEFAULT : newDsl_HeaderFooterLookup_Language;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_LANGUAGE, oldDsl_HeaderFooterLookup_Language, dsl_HeaderFooterLookup_Language));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AtemPackage.HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_ELEMENTS:
        return ((InternalEList<?>)getDsl_HeaderFooterLookup_Elements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AtemPackage.HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_ELEMENTS:
        return getDsl_HeaderFooterLookup_Elements();
      case AtemPackage.HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_LANGUAGE:
        return getDsl_HeaderFooterLookup_Language();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AtemPackage.HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_ELEMENTS:
        getDsl_HeaderFooterLookup_Elements().clear();
        getDsl_HeaderFooterLookup_Elements().addAll((Collection<? extends ElementType>)newValue);
        return;
      case AtemPackage.HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_LANGUAGE:
        setDsl_HeaderFooterLookup_Language((Language)newValue);
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
      case AtemPackage.HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_ELEMENTS:
        getDsl_HeaderFooterLookup_Elements().clear();
        return;
      case AtemPackage.HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_LANGUAGE:
        setDsl_HeaderFooterLookup_Language(DSL_HEADER_FOOTER_LOOKUP_LANGUAGE_EDEFAULT);
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
      case AtemPackage.HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_ELEMENTS:
        return dsl_HeaderFooterLookup_Elements != null && !dsl_HeaderFooterLookup_Elements.isEmpty();
      case AtemPackage.HEADER_FOOTER_LOOKUP__DSL_HEADER_FOOTER_LOOKUP_LANGUAGE:
        return dsl_HeaderFooterLookup_Language != DSL_HEADER_FOOTER_LOOKUP_LANGUAGE_EDEFAULT;
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
    result.append(" (dsl_HeaderFooterLookup_Language: ");
    result.append(dsl_HeaderFooterLookup_Language);
    result.append(')');
    return result.toString();
  }

} //HeaderFooterLookupImpl
