/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AbstractComponent;
import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.WhenOther;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Other</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenOtherImpl#getDsl_WhenCase_Other_actions <em>Dsl When Case Other actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenOtherImpl extends MinimalEObjectImpl.Container implements WhenOther
{
  /**
   * The cached value of the '{@link #getDsl_WhenCase_Other_actions() <em>Dsl When Case Other actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenCase_Other_actions()
   * @generated
   * @ordered
   */
  protected EList<AbstractComponent> dsl_WhenCase_Other_actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenOtherImpl()
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
    return AtemPackage.Literals.WHEN_OTHER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractComponent> getDsl_WhenCase_Other_actions()
  {
    if (dsl_WhenCase_Other_actions == null)
    {
      dsl_WhenCase_Other_actions = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, AtemPackage.WHEN_OTHER__DSL_WHEN_CASE_OTHER_ACTIONS);
    }
    return dsl_WhenCase_Other_actions;
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
      case AtemPackage.WHEN_OTHER__DSL_WHEN_CASE_OTHER_ACTIONS:
        return ((InternalEList<?>)getDsl_WhenCase_Other_actions()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.WHEN_OTHER__DSL_WHEN_CASE_OTHER_ACTIONS:
        return getDsl_WhenCase_Other_actions();
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
      case AtemPackage.WHEN_OTHER__DSL_WHEN_CASE_OTHER_ACTIONS:
        getDsl_WhenCase_Other_actions().clear();
        getDsl_WhenCase_Other_actions().addAll((Collection<? extends AbstractComponent>)newValue);
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
      case AtemPackage.WHEN_OTHER__DSL_WHEN_CASE_OTHER_ACTIONS:
        getDsl_WhenCase_Other_actions().clear();
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
      case AtemPackage.WHEN_OTHER__DSL_WHEN_CASE_OTHER_ACTIONS:
        return dsl_WhenCase_Other_actions != null && !dsl_WhenCase_Other_actions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WhenOtherImpl
