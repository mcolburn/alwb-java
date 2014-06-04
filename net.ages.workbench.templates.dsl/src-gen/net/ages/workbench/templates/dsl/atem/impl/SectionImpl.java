/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.resources.dsl.ares.Definition;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.Section;
import net.ages.workbench.templates.dsl.atem.SectionElementType;

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
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.SectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.SectionImpl#getDsl_Section_Role <em>Dsl Section Role</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.SectionImpl#getDsl_Section_Elements <em>Dsl Section Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionImpl extends AbstractComponentImpl implements Section
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDsl_Section_Role() <em>Dsl Section Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Section_Role()
   * @generated
   * @ordered
   */
  protected Definition dsl_Section_Role;

  /**
   * The cached value of the '{@link #getDsl_Section_Elements() <em>Dsl Section Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Section_Elements()
   * @generated
   * @ordered
   */
  protected EList<SectionElementType> dsl_Section_Elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SectionImpl()
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
    return AtemPackage.Literals.SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.SECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition getDsl_Section_Role()
  {
    if (dsl_Section_Role != null && dsl_Section_Role.eIsProxy())
    {
      InternalEObject oldDsl_Section_Role = (InternalEObject)dsl_Section_Role;
      dsl_Section_Role = (Definition)eResolveProxy(oldDsl_Section_Role);
      if (dsl_Section_Role != oldDsl_Section_Role)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtemPackage.SECTION__DSL_SECTION_ROLE, oldDsl_Section_Role, dsl_Section_Role));
      }
    }
    return dsl_Section_Role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition basicGetDsl_Section_Role()
  {
    return dsl_Section_Role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Section_Role(Definition newDsl_Section_Role)
  {
    Definition oldDsl_Section_Role = dsl_Section_Role;
    dsl_Section_Role = newDsl_Section_Role;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.SECTION__DSL_SECTION_ROLE, oldDsl_Section_Role, dsl_Section_Role));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SectionElementType> getDsl_Section_Elements()
  {
    if (dsl_Section_Elements == null)
    {
      dsl_Section_Elements = new EObjectContainmentEList<SectionElementType>(SectionElementType.class, this, AtemPackage.SECTION__DSL_SECTION_ELEMENTS);
    }
    return dsl_Section_Elements;
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
      case AtemPackage.SECTION__DSL_SECTION_ELEMENTS:
        return ((InternalEList<?>)getDsl_Section_Elements()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.SECTION__NAME:
        return getName();
      case AtemPackage.SECTION__DSL_SECTION_ROLE:
        if (resolve) return getDsl_Section_Role();
        return basicGetDsl_Section_Role();
      case AtemPackage.SECTION__DSL_SECTION_ELEMENTS:
        return getDsl_Section_Elements();
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
      case AtemPackage.SECTION__NAME:
        setName((String)newValue);
        return;
      case AtemPackage.SECTION__DSL_SECTION_ROLE:
        setDsl_Section_Role((Definition)newValue);
        return;
      case AtemPackage.SECTION__DSL_SECTION_ELEMENTS:
        getDsl_Section_Elements().clear();
        getDsl_Section_Elements().addAll((Collection<? extends SectionElementType>)newValue);
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
      case AtemPackage.SECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AtemPackage.SECTION__DSL_SECTION_ROLE:
        setDsl_Section_Role((Definition)null);
        return;
      case AtemPackage.SECTION__DSL_SECTION_ELEMENTS:
        getDsl_Section_Elements().clear();
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
      case AtemPackage.SECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AtemPackage.SECTION__DSL_SECTION_ROLE:
        return dsl_Section_Role != null;
      case AtemPackage.SECTION__DSL_SECTION_ELEMENTS:
        return dsl_Section_Elements != null && !dsl_Section_Elements.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SectionImpl
