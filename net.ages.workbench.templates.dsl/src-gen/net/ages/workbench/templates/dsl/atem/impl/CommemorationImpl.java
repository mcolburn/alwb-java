/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.Commemoration;
import net.ages.workbench.templates.dsl.atem.HeaderFooterFragment;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commemoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.CommemorationImpl#getDsl_Commemoration_Elements <em>Dsl Commemoration Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommemorationImpl extends HeadComponentImpl implements Commemoration
{
  /**
   * The cached value of the '{@link #getDsl_Commemoration_Elements() <em>Dsl Commemoration Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Commemoration_Elements()
   * @generated
   * @ordered
   */
  protected EList<HeaderFooterFragment> dsl_Commemoration_Elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommemorationImpl()
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
    return AtemPackage.Literals.COMMEMORATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HeaderFooterFragment> getDsl_Commemoration_Elements()
  {
    if (dsl_Commemoration_Elements == null)
    {
      dsl_Commemoration_Elements = new EObjectContainmentEList<HeaderFooterFragment>(HeaderFooterFragment.class, this, AtemPackage.COMMEMORATION__DSL_COMMEMORATION_ELEMENTS);
    }
    return dsl_Commemoration_Elements;
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
      case AtemPackage.COMMEMORATION__DSL_COMMEMORATION_ELEMENTS:
        return ((InternalEList<?>)getDsl_Commemoration_Elements()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.COMMEMORATION__DSL_COMMEMORATION_ELEMENTS:
        return getDsl_Commemoration_Elements();
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
      case AtemPackage.COMMEMORATION__DSL_COMMEMORATION_ELEMENTS:
        getDsl_Commemoration_Elements().clear();
        getDsl_Commemoration_Elements().addAll((Collection<? extends HeaderFooterFragment>)newValue);
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
      case AtemPackage.COMMEMORATION__DSL_COMMEMORATION_ELEMENTS:
        getDsl_Commemoration_Elements().clear();
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
      case AtemPackage.COMMEMORATION__DSL_COMMEMORATION_ELEMENTS:
        return dsl_Commemoration_Elements != null && !dsl_Commemoration_Elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CommemorationImpl
