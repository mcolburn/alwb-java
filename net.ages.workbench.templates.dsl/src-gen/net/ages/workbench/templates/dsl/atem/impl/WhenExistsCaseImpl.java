/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.resources.dsl.ares.Definition;

import net.ages.workbench.templates.dsl.atem.AbstractComponent;
import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.WhenExistsCase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Exists Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenExistsCaseImpl#getDsl_WhenExistsCase_Ref <em>Dsl When Exists Case Ref</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenExistsCaseImpl#getDsl_WhenExistsCase_True_actions <em>Dsl When Exists Case True actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenExistsCaseImpl extends MinimalEObjectImpl.Container implements WhenExistsCase
{
  /**
   * The cached value of the '{@link #getDsl_WhenExistsCase_Ref() <em>Dsl When Exists Case Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenExistsCase_Ref()
   * @generated
   * @ordered
   */
  protected Definition dsl_WhenExistsCase_Ref;

  /**
   * The cached value of the '{@link #getDsl_WhenExistsCase_True_actions() <em>Dsl When Exists Case True actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenExistsCase_True_actions()
   * @generated
   * @ordered
   */
  protected EList<AbstractComponent> dsl_WhenExistsCase_True_actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenExistsCaseImpl()
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
    return AtemPackage.Literals.WHEN_EXISTS_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition getDsl_WhenExistsCase_Ref()
  {
    if (dsl_WhenExistsCase_Ref != null && dsl_WhenExistsCase_Ref.eIsProxy())
    {
      InternalEObject oldDsl_WhenExistsCase_Ref = (InternalEObject)dsl_WhenExistsCase_Ref;
      dsl_WhenExistsCase_Ref = (Definition)eResolveProxy(oldDsl_WhenExistsCase_Ref);
      if (dsl_WhenExistsCase_Ref != oldDsl_WhenExistsCase_Ref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtemPackage.WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_REF, oldDsl_WhenExistsCase_Ref, dsl_WhenExistsCase_Ref));
      }
    }
    return dsl_WhenExistsCase_Ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition basicGetDsl_WhenExistsCase_Ref()
  {
    return dsl_WhenExistsCase_Ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_WhenExistsCase_Ref(Definition newDsl_WhenExistsCase_Ref)
  {
    Definition oldDsl_WhenExistsCase_Ref = dsl_WhenExistsCase_Ref;
    dsl_WhenExistsCase_Ref = newDsl_WhenExistsCase_Ref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_REF, oldDsl_WhenExistsCase_Ref, dsl_WhenExistsCase_Ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractComponent> getDsl_WhenExistsCase_True_actions()
  {
    if (dsl_WhenExistsCase_True_actions == null)
    {
      dsl_WhenExistsCase_True_actions = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, AtemPackage.WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_TRUE_ACTIONS);
    }
    return dsl_WhenExistsCase_True_actions;
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
      case AtemPackage.WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_TRUE_ACTIONS:
        return ((InternalEList<?>)getDsl_WhenExistsCase_True_actions()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_REF:
        if (resolve) return getDsl_WhenExistsCase_Ref();
        return basicGetDsl_WhenExistsCase_Ref();
      case AtemPackage.WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_TRUE_ACTIONS:
        return getDsl_WhenExistsCase_True_actions();
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
      case AtemPackage.WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_REF:
        setDsl_WhenExistsCase_Ref((Definition)newValue);
        return;
      case AtemPackage.WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_TRUE_ACTIONS:
        getDsl_WhenExistsCase_True_actions().clear();
        getDsl_WhenExistsCase_True_actions().addAll((Collection<? extends AbstractComponent>)newValue);
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
      case AtemPackage.WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_REF:
        setDsl_WhenExistsCase_Ref((Definition)null);
        return;
      case AtemPackage.WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_TRUE_ACTIONS:
        getDsl_WhenExistsCase_True_actions().clear();
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
      case AtemPackage.WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_REF:
        return dsl_WhenExistsCase_Ref != null;
      case AtemPackage.WHEN_EXISTS_CASE__DSL_WHEN_EXISTS_CASE_TRUE_ACTIONS:
        return dsl_WhenExistsCase_True_actions != null && !dsl_WhenExistsCase_True_actions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WhenExistsCaseImpl
