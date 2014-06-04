/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AbstractComponent;
import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.WhenPascha;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Pascha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenPaschaImpl#getDsl_WhenPascha_true_actions <em>Dsl When Pascha true actions</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.WhenPaschaImpl#getDsl_WhenPascha_Other_actions <em>Dsl When Pascha Other actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenPaschaImpl extends AbstractComponentImpl implements WhenPascha
{
  /**
   * The cached value of the '{@link #getDsl_WhenPascha_true_actions() <em>Dsl When Pascha true actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenPascha_true_actions()
   * @generated
   * @ordered
   */
  protected EList<AbstractComponent> dsl_WhenPascha_true_actions;

  /**
   * The cached value of the '{@link #getDsl_WhenPascha_Other_actions() <em>Dsl When Pascha Other actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_WhenPascha_Other_actions()
   * @generated
   * @ordered
   */
  protected EList<AbstractComponent> dsl_WhenPascha_Other_actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenPaschaImpl()
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
    return AtemPackage.Literals.WHEN_PASCHA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractComponent> getDsl_WhenPascha_true_actions()
  {
    if (dsl_WhenPascha_true_actions == null)
    {
      dsl_WhenPascha_true_actions = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, AtemPackage.WHEN_PASCHA__DSL_WHEN_PASCHA_TRUE_ACTIONS);
    }
    return dsl_WhenPascha_true_actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractComponent> getDsl_WhenPascha_Other_actions()
  {
    if (dsl_WhenPascha_Other_actions == null)
    {
      dsl_WhenPascha_Other_actions = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, AtemPackage.WHEN_PASCHA__DSL_WHEN_PASCHA_OTHER_ACTIONS);
    }
    return dsl_WhenPascha_Other_actions;
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
      case AtemPackage.WHEN_PASCHA__DSL_WHEN_PASCHA_TRUE_ACTIONS:
        return ((InternalEList<?>)getDsl_WhenPascha_true_actions()).basicRemove(otherEnd, msgs);
      case AtemPackage.WHEN_PASCHA__DSL_WHEN_PASCHA_OTHER_ACTIONS:
        return ((InternalEList<?>)getDsl_WhenPascha_Other_actions()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.WHEN_PASCHA__DSL_WHEN_PASCHA_TRUE_ACTIONS:
        return getDsl_WhenPascha_true_actions();
      case AtemPackage.WHEN_PASCHA__DSL_WHEN_PASCHA_OTHER_ACTIONS:
        return getDsl_WhenPascha_Other_actions();
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
      case AtemPackage.WHEN_PASCHA__DSL_WHEN_PASCHA_TRUE_ACTIONS:
        getDsl_WhenPascha_true_actions().clear();
        getDsl_WhenPascha_true_actions().addAll((Collection<? extends AbstractComponent>)newValue);
        return;
      case AtemPackage.WHEN_PASCHA__DSL_WHEN_PASCHA_OTHER_ACTIONS:
        getDsl_WhenPascha_Other_actions().clear();
        getDsl_WhenPascha_Other_actions().addAll((Collection<? extends AbstractComponent>)newValue);
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
      case AtemPackage.WHEN_PASCHA__DSL_WHEN_PASCHA_TRUE_ACTIONS:
        getDsl_WhenPascha_true_actions().clear();
        return;
      case AtemPackage.WHEN_PASCHA__DSL_WHEN_PASCHA_OTHER_ACTIONS:
        getDsl_WhenPascha_Other_actions().clear();
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
      case AtemPackage.WHEN_PASCHA__DSL_WHEN_PASCHA_TRUE_ACTIONS:
        return dsl_WhenPascha_true_actions != null && !dsl_WhenPascha_true_actions.isEmpty();
      case AtemPackage.WHEN_PASCHA__DSL_WHEN_PASCHA_OTHER_ACTIONS:
        return dsl_WhenPascha_Other_actions != null && !dsl_WhenPascha_Other_actions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WhenPaschaImpl
