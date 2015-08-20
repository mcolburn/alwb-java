/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.resources.dsl.ares.Definition;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.ResourceText;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.ResourceTextImpl#getDsl_ResourceTextRef <em>Dsl Resource Text Ref</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.ResourceTextImpl#isDsl_ResourceText_Version <em>Dsl Resource Text Version</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.ResourceTextImpl#isDsl_ResourceText_Media_Off <em>Dsl Resource Text Media Off</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceTextImpl extends ElementTypeImpl implements ResourceText
{
  /**
   * The cached value of the '{@link #getDsl_ResourceTextRef() <em>Dsl Resource Text Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_ResourceTextRef()
   * @generated
   * @ordered
   */
  protected Definition dsl_ResourceTextRef;

  /**
   * The default value of the '{@link #isDsl_ResourceText_Version() <em>Dsl Resource Text Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_ResourceText_Version()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_RESOURCE_TEXT_VERSION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_ResourceText_Version() <em>Dsl Resource Text Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_ResourceText_Version()
   * @generated
   * @ordered
   */
  protected boolean dsl_ResourceText_Version = DSL_RESOURCE_TEXT_VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #isDsl_ResourceText_Media_Off() <em>Dsl Resource Text Media Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_ResourceText_Media_Off()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_RESOURCE_TEXT_MEDIA_OFF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_ResourceText_Media_Off() <em>Dsl Resource Text Media Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_ResourceText_Media_Off()
   * @generated
   * @ordered
   */
  protected boolean dsl_ResourceText_Media_Off = DSL_RESOURCE_TEXT_MEDIA_OFF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceTextImpl()
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
    return AtemPackage.Literals.RESOURCE_TEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition getDsl_ResourceTextRef()
  {
    if (dsl_ResourceTextRef != null && dsl_ResourceTextRef.eIsProxy())
    {
      InternalEObject oldDsl_ResourceTextRef = (InternalEObject)dsl_ResourceTextRef;
      dsl_ResourceTextRef = (Definition)eResolveProxy(oldDsl_ResourceTextRef);
      if (dsl_ResourceTextRef != oldDsl_ResourceTextRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_REF, oldDsl_ResourceTextRef, dsl_ResourceTextRef));
      }
    }
    return dsl_ResourceTextRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition basicGetDsl_ResourceTextRef()
  {
    return dsl_ResourceTextRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_ResourceTextRef(Definition newDsl_ResourceTextRef)
  {
    Definition oldDsl_ResourceTextRef = dsl_ResourceTextRef;
    dsl_ResourceTextRef = newDsl_ResourceTextRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_REF, oldDsl_ResourceTextRef, dsl_ResourceTextRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_ResourceText_Version()
  {
    return dsl_ResourceText_Version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_ResourceText_Version(boolean newDsl_ResourceText_Version)
  {
    boolean oldDsl_ResourceText_Version = dsl_ResourceText_Version;
    dsl_ResourceText_Version = newDsl_ResourceText_Version;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_VERSION, oldDsl_ResourceText_Version, dsl_ResourceText_Version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_ResourceText_Media_Off()
  {
    return dsl_ResourceText_Media_Off;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_ResourceText_Media_Off(boolean newDsl_ResourceText_Media_Off)
  {
    boolean oldDsl_ResourceText_Media_Off = dsl_ResourceText_Media_Off;
    dsl_ResourceText_Media_Off = newDsl_ResourceText_Media_Off;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_MEDIA_OFF, oldDsl_ResourceText_Media_Off, dsl_ResourceText_Media_Off));
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
      case AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_REF:
        if (resolve) return getDsl_ResourceTextRef();
        return basicGetDsl_ResourceTextRef();
      case AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_VERSION:
        return isDsl_ResourceText_Version();
      case AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_MEDIA_OFF:
        return isDsl_ResourceText_Media_Off();
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
      case AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_REF:
        setDsl_ResourceTextRef((Definition)newValue);
        return;
      case AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_VERSION:
        setDsl_ResourceText_Version((Boolean)newValue);
        return;
      case AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_MEDIA_OFF:
        setDsl_ResourceText_Media_Off((Boolean)newValue);
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
      case AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_REF:
        setDsl_ResourceTextRef((Definition)null);
        return;
      case AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_VERSION:
        setDsl_ResourceText_Version(DSL_RESOURCE_TEXT_VERSION_EDEFAULT);
        return;
      case AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_MEDIA_OFF:
        setDsl_ResourceText_Media_Off(DSL_RESOURCE_TEXT_MEDIA_OFF_EDEFAULT);
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
      case AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_REF:
        return dsl_ResourceTextRef != null;
      case AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_VERSION:
        return dsl_ResourceText_Version != DSL_RESOURCE_TEXT_VERSION_EDEFAULT;
      case AtemPackage.RESOURCE_TEXT__DSL_RESOURCE_TEXT_MEDIA_OFF:
        return dsl_ResourceText_Media_Off != DSL_RESOURCE_TEXT_MEDIA_OFF_EDEFAULT;
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
    result.append(" (dsl_ResourceText_Version: ");
    result.append(dsl_ResourceText_Version);
    result.append(", dsl_ResourceText_Media_Off: ");
    result.append(dsl_ResourceText_Media_Off);
    result.append(')');
    return result.toString();
  }

} //ResourceTextImpl
