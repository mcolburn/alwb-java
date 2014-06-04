/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumn;
import net.ages.workbench.templates.dsl.atem.PageFooterOdd;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Footer Odd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.PageFooterOddImpl#getDsl_PageHeader_columns <em>Dsl Page Header columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageFooterOddImpl extends HeadComponentImpl implements PageFooterOdd
{
  /**
   * The cached value of the '{@link #getDsl_PageHeader_columns() <em>Dsl Page Header columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_PageHeader_columns()
   * @generated
   * @ordered
   */
  protected EList<HeaderFooterColumn> dsl_PageHeader_columns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PageFooterOddImpl()
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
    return AtemPackage.Literals.PAGE_FOOTER_ODD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HeaderFooterColumn> getDsl_PageHeader_columns()
  {
    if (dsl_PageHeader_columns == null)
    {
      dsl_PageHeader_columns = new EObjectContainmentEList<HeaderFooterColumn>(HeaderFooterColumn.class, this, AtemPackage.PAGE_FOOTER_ODD__DSL_PAGE_HEADER_COLUMNS);
    }
    return dsl_PageHeader_columns;
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
      case AtemPackage.PAGE_FOOTER_ODD__DSL_PAGE_HEADER_COLUMNS:
        return ((InternalEList<?>)getDsl_PageHeader_columns()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.PAGE_FOOTER_ODD__DSL_PAGE_HEADER_COLUMNS:
        return getDsl_PageHeader_columns();
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
      case AtemPackage.PAGE_FOOTER_ODD__DSL_PAGE_HEADER_COLUMNS:
        getDsl_PageHeader_columns().clear();
        getDsl_PageHeader_columns().addAll((Collection<? extends HeaderFooterColumn>)newValue);
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
      case AtemPackage.PAGE_FOOTER_ODD__DSL_PAGE_HEADER_COLUMNS:
        getDsl_PageHeader_columns().clear();
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
      case AtemPackage.PAGE_FOOTER_ODD__DSL_PAGE_HEADER_COLUMNS:
        return dsl_PageHeader_columns != null && !dsl_PageHeader_columns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PageFooterOddImpl
