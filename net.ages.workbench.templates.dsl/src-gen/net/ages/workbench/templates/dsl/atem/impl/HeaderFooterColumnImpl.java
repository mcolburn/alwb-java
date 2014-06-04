/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumn;
import net.ages.workbench.templates.dsl.atem.HeaderFooterFragment;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Footer Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.HeaderFooterColumnImpl#getDsl_HeaderFooterColumn_fragments <em>Dsl Header Footer Column fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderFooterColumnImpl extends MinimalEObjectImpl.Container implements HeaderFooterColumn
{
  /**
   * The cached value of the '{@link #getDsl_HeaderFooterColumn_fragments() <em>Dsl Header Footer Column fragments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_HeaderFooterColumn_fragments()
   * @generated
   * @ordered
   */
  protected EList<HeaderFooterFragment> dsl_HeaderFooterColumn_fragments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeaderFooterColumnImpl()
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
    return AtemPackage.Literals.HEADER_FOOTER_COLUMN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HeaderFooterFragment> getDsl_HeaderFooterColumn_fragments()
  {
    if (dsl_HeaderFooterColumn_fragments == null)
    {
      dsl_HeaderFooterColumn_fragments = new EObjectContainmentEList<HeaderFooterFragment>(HeaderFooterFragment.class, this, AtemPackage.HEADER_FOOTER_COLUMN__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS);
    }
    return dsl_HeaderFooterColumn_fragments;
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
      case AtemPackage.HEADER_FOOTER_COLUMN__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS:
        return ((InternalEList<?>)getDsl_HeaderFooterColumn_fragments()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.HEADER_FOOTER_COLUMN__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS:
        return getDsl_HeaderFooterColumn_fragments();
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
      case AtemPackage.HEADER_FOOTER_COLUMN__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS:
        getDsl_HeaderFooterColumn_fragments().clear();
        getDsl_HeaderFooterColumn_fragments().addAll((Collection<? extends HeaderFooterFragment>)newValue);
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
      case AtemPackage.HEADER_FOOTER_COLUMN__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS:
        getDsl_HeaderFooterColumn_fragments().clear();
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
      case AtemPackage.HEADER_FOOTER_COLUMN__DSL_HEADER_FOOTER_COLUMN_FRAGMENTS:
        return dsl_HeaderFooterColumn_fragments != null && !dsl_HeaderFooterColumn_fragments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HeaderFooterColumnImpl
