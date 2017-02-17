/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.Head;
import net.ages.workbench.templates.dsl.atem.HeadComponent;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.HeadImpl#getDsl_Head_components <em>Dsl Head components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeadImpl extends MinimalEObjectImpl.Container implements Head
{
  /**
   * The cached value of the '{@link #getDsl_Head_components() <em>Dsl Head components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Head_components()
   * @generated
   * @ordered
   */
  protected EList<HeadComponent> dsl_Head_components;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeadImpl()
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
    return AtemPackage.Literals.HEAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HeadComponent> getDsl_Head_components()
  {
    if (dsl_Head_components == null)
    {
      dsl_Head_components = new EObjectContainmentEList<HeadComponent>(HeadComponent.class, this, AtemPackage.HEAD__DSL_HEAD_COMPONENTS);
    }
    return dsl_Head_components;
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
      case AtemPackage.HEAD__DSL_HEAD_COMPONENTS:
        return ((InternalEList<?>)getDsl_Head_components()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.HEAD__DSL_HEAD_COMPONENTS:
        return getDsl_Head_components();
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
      case AtemPackage.HEAD__DSL_HEAD_COMPONENTS:
        getDsl_Head_components().clear();
        getDsl_Head_components().addAll((Collection<? extends HeadComponent>)newValue);
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
      case AtemPackage.HEAD__DSL_HEAD_COMPONENTS:
        getDsl_Head_components().clear();
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
      case AtemPackage.HEAD__DSL_HEAD_COMPONENTS:
        return dsl_Head_components != null && !dsl_Head_components.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HeadImpl
