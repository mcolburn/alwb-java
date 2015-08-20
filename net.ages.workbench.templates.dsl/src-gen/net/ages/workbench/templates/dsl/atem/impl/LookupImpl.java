/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.resources.dsl.ares.Definition;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.DowTypes;
import net.ages.workbench.templates.dsl.atem.Lookup;
import net.ages.workbench.templates.dsl.atem.ModeTypes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lookup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.LookupImpl#getDsl_ResourceTextRef <em>Dsl Resource Text Ref</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.LookupImpl#isDsl_Lookup_Version <em>Dsl Lookup Version</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.LookupImpl#isDsl_Lookup_Media_Off <em>Dsl Lookup Media Off</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.LookupImpl#isDsl_Lookup_Override_Mode_Set <em>Dsl Lookup Override Mode Set</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.LookupImpl#getDsl_Lookup_OverrideMode <em>Dsl Lookup Override Mode</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.LookupImpl#isDsl_Lookup_Override__Day_Set <em>Dsl Lookup Override Day Set</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.LookupImpl#getDsl_Lookup_OverrideDay <em>Dsl Lookup Override Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LookupImpl extends ElementTypeImpl implements Lookup
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
   * The default value of the '{@link #isDsl_Lookup_Version() <em>Dsl Lookup Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Lookup_Version()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_LOOKUP_VERSION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_Lookup_Version() <em>Dsl Lookup Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Lookup_Version()
   * @generated
   * @ordered
   */
  protected boolean dsl_Lookup_Version = DSL_LOOKUP_VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #isDsl_Lookup_Media_Off() <em>Dsl Lookup Media Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Lookup_Media_Off()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_LOOKUP_MEDIA_OFF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_Lookup_Media_Off() <em>Dsl Lookup Media Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Lookup_Media_Off()
   * @generated
   * @ordered
   */
  protected boolean dsl_Lookup_Media_Off = DSL_LOOKUP_MEDIA_OFF_EDEFAULT;

  /**
   * The default value of the '{@link #isDsl_Lookup_Override_Mode_Set() <em>Dsl Lookup Override Mode Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Lookup_Override_Mode_Set()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_LOOKUP_OVERRIDE_MODE_SET_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_Lookup_Override_Mode_Set() <em>Dsl Lookup Override Mode Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Lookup_Override_Mode_Set()
   * @generated
   * @ordered
   */
  protected boolean dsl_Lookup_Override_Mode_Set = DSL_LOOKUP_OVERRIDE_MODE_SET_EDEFAULT;

  /**
   * The default value of the '{@link #getDsl_Lookup_OverrideMode() <em>Dsl Lookup Override Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Lookup_OverrideMode()
   * @generated
   * @ordered
   */
  protected static final ModeTypes DSL_LOOKUP_OVERRIDE_MODE_EDEFAULT = ModeTypes.M1;

  /**
   * The cached value of the '{@link #getDsl_Lookup_OverrideMode() <em>Dsl Lookup Override Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Lookup_OverrideMode()
   * @generated
   * @ordered
   */
  protected ModeTypes dsl_Lookup_OverrideMode = DSL_LOOKUP_OVERRIDE_MODE_EDEFAULT;

  /**
   * The default value of the '{@link #isDsl_Lookup_Override__Day_Set() <em>Dsl Lookup Override Day Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Lookup_Override__Day_Set()
   * @generated
   * @ordered
   */
  protected static final boolean DSL_LOOKUP_OVERRIDE_DAY_SET_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDsl_Lookup_Override__Day_Set() <em>Dsl Lookup Override Day Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDsl_Lookup_Override__Day_Set()
   * @generated
   * @ordered
   */
  protected boolean dsl_Lookup_Override__Day_Set = DSL_LOOKUP_OVERRIDE_DAY_SET_EDEFAULT;

  /**
   * The default value of the '{@link #getDsl_Lookup_OverrideDay() <em>Dsl Lookup Override Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Lookup_OverrideDay()
   * @generated
   * @ordered
   */
  protected static final DowTypes DSL_LOOKUP_OVERRIDE_DAY_EDEFAULT = DowTypes.D1;

  /**
   * The cached value of the '{@link #getDsl_Lookup_OverrideDay() <em>Dsl Lookup Override Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Lookup_OverrideDay()
   * @generated
   * @ordered
   */
  protected DowTypes dsl_Lookup_OverrideDay = DSL_LOOKUP_OVERRIDE_DAY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LookupImpl()
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
    return AtemPackage.Literals.LOOKUP;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtemPackage.LOOKUP__DSL_RESOURCE_TEXT_REF, oldDsl_ResourceTextRef, dsl_ResourceTextRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.LOOKUP__DSL_RESOURCE_TEXT_REF, oldDsl_ResourceTextRef, dsl_ResourceTextRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_Lookup_Version()
  {
    return dsl_Lookup_Version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Lookup_Version(boolean newDsl_Lookup_Version)
  {
    boolean oldDsl_Lookup_Version = dsl_Lookup_Version;
    dsl_Lookup_Version = newDsl_Lookup_Version;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.LOOKUP__DSL_LOOKUP_VERSION, oldDsl_Lookup_Version, dsl_Lookup_Version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_Lookup_Media_Off()
  {
    return dsl_Lookup_Media_Off;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Lookup_Media_Off(boolean newDsl_Lookup_Media_Off)
  {
    boolean oldDsl_Lookup_Media_Off = dsl_Lookup_Media_Off;
    dsl_Lookup_Media_Off = newDsl_Lookup_Media_Off;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.LOOKUP__DSL_LOOKUP_MEDIA_OFF, oldDsl_Lookup_Media_Off, dsl_Lookup_Media_Off));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_Lookup_Override_Mode_Set()
  {
    return dsl_Lookup_Override_Mode_Set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Lookup_Override_Mode_Set(boolean newDsl_Lookup_Override_Mode_Set)
  {
    boolean oldDsl_Lookup_Override_Mode_Set = dsl_Lookup_Override_Mode_Set;
    dsl_Lookup_Override_Mode_Set = newDsl_Lookup_Override_Mode_Set;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_MODE_SET, oldDsl_Lookup_Override_Mode_Set, dsl_Lookup_Override_Mode_Set));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModeTypes getDsl_Lookup_OverrideMode()
  {
    return dsl_Lookup_OverrideMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Lookup_OverrideMode(ModeTypes newDsl_Lookup_OverrideMode)
  {
    ModeTypes oldDsl_Lookup_OverrideMode = dsl_Lookup_OverrideMode;
    dsl_Lookup_OverrideMode = newDsl_Lookup_OverrideMode == null ? DSL_LOOKUP_OVERRIDE_MODE_EDEFAULT : newDsl_Lookup_OverrideMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_MODE, oldDsl_Lookup_OverrideMode, dsl_Lookup_OverrideMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDsl_Lookup_Override__Day_Set()
  {
    return dsl_Lookup_Override__Day_Set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Lookup_Override__Day_Set(boolean newDsl_Lookup_Override__Day_Set)
  {
    boolean oldDsl_Lookup_Override__Day_Set = dsl_Lookup_Override__Day_Set;
    dsl_Lookup_Override__Day_Set = newDsl_Lookup_Override__Day_Set;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_DAY_SET, oldDsl_Lookup_Override__Day_Set, dsl_Lookup_Override__Day_Set));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DowTypes getDsl_Lookup_OverrideDay()
  {
    return dsl_Lookup_OverrideDay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Lookup_OverrideDay(DowTypes newDsl_Lookup_OverrideDay)
  {
    DowTypes oldDsl_Lookup_OverrideDay = dsl_Lookup_OverrideDay;
    dsl_Lookup_OverrideDay = newDsl_Lookup_OverrideDay == null ? DSL_LOOKUP_OVERRIDE_DAY_EDEFAULT : newDsl_Lookup_OverrideDay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_DAY, oldDsl_Lookup_OverrideDay, dsl_Lookup_OverrideDay));
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
      case AtemPackage.LOOKUP__DSL_RESOURCE_TEXT_REF:
        if (resolve) return getDsl_ResourceTextRef();
        return basicGetDsl_ResourceTextRef();
      case AtemPackage.LOOKUP__DSL_LOOKUP_VERSION:
        return isDsl_Lookup_Version();
      case AtemPackage.LOOKUP__DSL_LOOKUP_MEDIA_OFF:
        return isDsl_Lookup_Media_Off();
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_MODE_SET:
        return isDsl_Lookup_Override_Mode_Set();
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_MODE:
        return getDsl_Lookup_OverrideMode();
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_DAY_SET:
        return isDsl_Lookup_Override__Day_Set();
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_DAY:
        return getDsl_Lookup_OverrideDay();
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
      case AtemPackage.LOOKUP__DSL_RESOURCE_TEXT_REF:
        setDsl_ResourceTextRef((Definition)newValue);
        return;
      case AtemPackage.LOOKUP__DSL_LOOKUP_VERSION:
        setDsl_Lookup_Version((Boolean)newValue);
        return;
      case AtemPackage.LOOKUP__DSL_LOOKUP_MEDIA_OFF:
        setDsl_Lookup_Media_Off((Boolean)newValue);
        return;
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_MODE_SET:
        setDsl_Lookup_Override_Mode_Set((Boolean)newValue);
        return;
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_MODE:
        setDsl_Lookup_OverrideMode((ModeTypes)newValue);
        return;
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_DAY_SET:
        setDsl_Lookup_Override__Day_Set((Boolean)newValue);
        return;
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_DAY:
        setDsl_Lookup_OverrideDay((DowTypes)newValue);
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
      case AtemPackage.LOOKUP__DSL_RESOURCE_TEXT_REF:
        setDsl_ResourceTextRef((Definition)null);
        return;
      case AtemPackage.LOOKUP__DSL_LOOKUP_VERSION:
        setDsl_Lookup_Version(DSL_LOOKUP_VERSION_EDEFAULT);
        return;
      case AtemPackage.LOOKUP__DSL_LOOKUP_MEDIA_OFF:
        setDsl_Lookup_Media_Off(DSL_LOOKUP_MEDIA_OFF_EDEFAULT);
        return;
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_MODE_SET:
        setDsl_Lookup_Override_Mode_Set(DSL_LOOKUP_OVERRIDE_MODE_SET_EDEFAULT);
        return;
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_MODE:
        setDsl_Lookup_OverrideMode(DSL_LOOKUP_OVERRIDE_MODE_EDEFAULT);
        return;
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_DAY_SET:
        setDsl_Lookup_Override__Day_Set(DSL_LOOKUP_OVERRIDE_DAY_SET_EDEFAULT);
        return;
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_DAY:
        setDsl_Lookup_OverrideDay(DSL_LOOKUP_OVERRIDE_DAY_EDEFAULT);
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
      case AtemPackage.LOOKUP__DSL_RESOURCE_TEXT_REF:
        return dsl_ResourceTextRef != null;
      case AtemPackage.LOOKUP__DSL_LOOKUP_VERSION:
        return dsl_Lookup_Version != DSL_LOOKUP_VERSION_EDEFAULT;
      case AtemPackage.LOOKUP__DSL_LOOKUP_MEDIA_OFF:
        return dsl_Lookup_Media_Off != DSL_LOOKUP_MEDIA_OFF_EDEFAULT;
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_MODE_SET:
        return dsl_Lookup_Override_Mode_Set != DSL_LOOKUP_OVERRIDE_MODE_SET_EDEFAULT;
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_MODE:
        return dsl_Lookup_OverrideMode != DSL_LOOKUP_OVERRIDE_MODE_EDEFAULT;
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_DAY_SET:
        return dsl_Lookup_Override__Day_Set != DSL_LOOKUP_OVERRIDE_DAY_SET_EDEFAULT;
      case AtemPackage.LOOKUP__DSL_LOOKUP_OVERRIDE_DAY:
        return dsl_Lookup_OverrideDay != DSL_LOOKUP_OVERRIDE_DAY_EDEFAULT;
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
    result.append(" (dsl_Lookup_Version: ");
    result.append(dsl_Lookup_Version);
    result.append(", dsl_Lookup_Media_Off: ");
    result.append(dsl_Lookup_Media_Off);
    result.append(", dsl_Lookup_Override_Mode_Set: ");
    result.append(dsl_Lookup_Override_Mode_Set);
    result.append(", dsl_Lookup_OverrideMode: ");
    result.append(dsl_Lookup_OverrideMode);
    result.append(", dsl_Lookup_Override__Day_Set: ");
    result.append(dsl_Lookup_Override__Day_Set);
    result.append(", dsl_Lookup_OverrideDay: ");
    result.append(dsl_Lookup_OverrideDay);
    result.append(')');
    return result.toString();
  }

} //LookupImpl
