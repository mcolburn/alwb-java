/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.resources.dsl.ares.Definition;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.ElementType;
import net.ages.workbench.templates.dsl.atem.SubTitle;

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
 * An implementation of the model object '<em><b>Sub Title</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.SubTitleImpl#getDsl_SubTitle_Role <em>Dsl Sub Title Role</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.SubTitleImpl#getDsl_Elements <em>Dsl Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubTitleImpl extends AbstractComponentImpl implements SubTitle
{
  /**
   * The cached value of the '{@link #getDsl_SubTitle_Role() <em>Dsl Sub Title Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_SubTitle_Role()
   * @generated
   * @ordered
   */
  protected Definition dsl_SubTitle_Role;

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
  protected SubTitleImpl()
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
    return AtemPackage.Literals.SUB_TITLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition getDsl_SubTitle_Role()
  {
    if (dsl_SubTitle_Role != null && dsl_SubTitle_Role.eIsProxy())
    {
      InternalEObject oldDsl_SubTitle_Role = (InternalEObject)dsl_SubTitle_Role;
      dsl_SubTitle_Role = (Definition)eResolveProxy(oldDsl_SubTitle_Role);
      if (dsl_SubTitle_Role != oldDsl_SubTitle_Role)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtemPackage.SUB_TITLE__DSL_SUB_TITLE_ROLE, oldDsl_SubTitle_Role, dsl_SubTitle_Role));
      }
    }
    return dsl_SubTitle_Role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition basicGetDsl_SubTitle_Role()
  {
    return dsl_SubTitle_Role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_SubTitle_Role(Definition newDsl_SubTitle_Role)
  {
    Definition oldDsl_SubTitle_Role = dsl_SubTitle_Role;
    dsl_SubTitle_Role = newDsl_SubTitle_Role;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.SUB_TITLE__DSL_SUB_TITLE_ROLE, oldDsl_SubTitle_Role, dsl_SubTitle_Role));
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
      dsl_Elements = new EObjectContainmentEList<ElementType>(ElementType.class, this, AtemPackage.SUB_TITLE__DSL_ELEMENTS);
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
      case AtemPackage.SUB_TITLE__DSL_ELEMENTS:
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
      case AtemPackage.SUB_TITLE__DSL_SUB_TITLE_ROLE:
        if (resolve) return getDsl_SubTitle_Role();
        return basicGetDsl_SubTitle_Role();
      case AtemPackage.SUB_TITLE__DSL_ELEMENTS:
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
      case AtemPackage.SUB_TITLE__DSL_SUB_TITLE_ROLE:
        setDsl_SubTitle_Role((Definition)newValue);
        return;
      case AtemPackage.SUB_TITLE__DSL_ELEMENTS:
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
      case AtemPackage.SUB_TITLE__DSL_SUB_TITLE_ROLE:
        setDsl_SubTitle_Role((Definition)null);
        return;
      case AtemPackage.SUB_TITLE__DSL_ELEMENTS:
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
      case AtemPackage.SUB_TITLE__DSL_SUB_TITLE_ROLE:
        return dsl_SubTitle_Role != null;
      case AtemPackage.SUB_TITLE__DSL_ELEMENTS:
        return dsl_Elements != null && !dsl_Elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SubTitleImpl
