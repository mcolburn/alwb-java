/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.resources.dsl.ares.Definition;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.ElementType;
import net.ages.workbench.templates.dsl.atem.Title;

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
 * An implementation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.TitleImpl#getDsl_Title_Role <em>Dsl Title Role</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.TitleImpl#getDsl_Elements <em>Dsl Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TitleImpl extends AbstractComponentImpl implements Title
{
  /**
   * The cached value of the '{@link #getDsl_Title_Role() <em>Dsl Title Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Title_Role()
   * @generated
   * @ordered
   */
  protected Definition dsl_Title_Role;

  /**
   * The cached value of the '{@link #getDsl_Elements() <em>Dsl Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Elements()
   * @generated
   * @ordered
   */
  protected EList<ElementType> dsl_Elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TitleImpl()
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
    return AtemPackage.Literals.TITLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition getDsl_Title_Role()
  {
    if (dsl_Title_Role != null && dsl_Title_Role.eIsProxy())
    {
      InternalEObject oldDsl_Title_Role = (InternalEObject)dsl_Title_Role;
      dsl_Title_Role = (Definition)eResolveProxy(oldDsl_Title_Role);
      if (dsl_Title_Role != oldDsl_Title_Role)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtemPackage.TITLE__DSL_TITLE_ROLE, oldDsl_Title_Role, dsl_Title_Role));
      }
    }
    return dsl_Title_Role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition basicGetDsl_Title_Role()
  {
    return dsl_Title_Role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Title_Role(Definition newDsl_Title_Role)
  {
    Definition oldDsl_Title_Role = dsl_Title_Role;
    dsl_Title_Role = newDsl_Title_Role;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.TITLE__DSL_TITLE_ROLE, oldDsl_Title_Role, dsl_Title_Role));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementType> getDsl_Elements()
  {
    if (dsl_Elements == null)
    {
      dsl_Elements = new EObjectContainmentEList<ElementType>(ElementType.class, this, AtemPackage.TITLE__DSL_ELEMENTS);
    }
    return dsl_Elements;
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
      case AtemPackage.TITLE__DSL_ELEMENTS:
        return ((InternalEList<?>)getDsl_Elements()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.TITLE__DSL_TITLE_ROLE:
        if (resolve) return getDsl_Title_Role();
        return basicGetDsl_Title_Role();
      case AtemPackage.TITLE__DSL_ELEMENTS:
        return getDsl_Elements();
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
      case AtemPackage.TITLE__DSL_TITLE_ROLE:
        setDsl_Title_Role((Definition)newValue);
        return;
      case AtemPackage.TITLE__DSL_ELEMENTS:
        getDsl_Elements().clear();
        getDsl_Elements().addAll((Collection<? extends ElementType>)newValue);
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
      case AtemPackage.TITLE__DSL_TITLE_ROLE:
        setDsl_Title_Role((Definition)null);
        return;
      case AtemPackage.TITLE__DSL_ELEMENTS:
        getDsl_Elements().clear();
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
      case AtemPackage.TITLE__DSL_TITLE_ROLE:
        return dsl_Title_Role != null;
      case AtemPackage.TITLE__DSL_ELEMENTS:
        return dsl_Elements != null && !dsl_Elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TitleImpl
