/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.HeaderFooterColumn;
import net.ages.workbench.templates.dsl.atem.PageHeaderEven;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Header Even</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.PageHeaderEvenImpl#getDsl_PageHeader_columns <em>Dsl Page Header columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageHeaderEvenImpl extends HeadComponentImpl implements PageHeaderEven
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
  protected PageHeaderEvenImpl()
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
    return AtemPackage.Literals.PAGE_HEADER_EVEN;
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
      dsl_PageHeader_columns = new EObjectContainmentEList<HeaderFooterColumn>(HeaderFooterColumn.class, this, AtemPackage.PAGE_HEADER_EVEN__DSL_PAGE_HEADER_COLUMNS);
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
      case AtemPackage.PAGE_HEADER_EVEN__DSL_PAGE_HEADER_COLUMNS:
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
      case AtemPackage.PAGE_HEADER_EVEN__DSL_PAGE_HEADER_COLUMNS:
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
      case AtemPackage.PAGE_HEADER_EVEN__DSL_PAGE_HEADER_COLUMNS:
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
      case AtemPackage.PAGE_HEADER_EVEN__DSL_PAGE_HEADER_COLUMNS:
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
      case AtemPackage.PAGE_HEADER_EVEN__DSL_PAGE_HEADER_COLUMNS:
        return dsl_PageHeader_columns != null && !dsl_PageHeader_columns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PageHeaderEvenImpl
