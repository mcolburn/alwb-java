/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.DateSet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DateSetImpl#getDslDateSet_Values <em>Dsl Date Set Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateSetImpl extends AbstractDateCaseImpl implements DateSet
{
  /**
   * The cached value of the '{@link #getDslDateSet_Values() <em>Dsl Date Set Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDslDateSet_Values()
   * @generated
   * @ordered
   */
  protected EList<Integer> dslDateSet_Values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DateSetImpl()
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
    return AtemPackage.Literals.DATE_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getDslDateSet_Values()
  {
    if (dslDateSet_Values == null)
    {
      dslDateSet_Values = new EDataTypeEList<Integer>(Integer.class, this, AtemPackage.DATE_SET__DSL_DATE_SET_VALUES);
    }
    return dslDateSet_Values;
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
      case AtemPackage.DATE_SET__DSL_DATE_SET_VALUES:
        return getDslDateSet_Values();
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
      case AtemPackage.DATE_SET__DSL_DATE_SET_VALUES:
        getDslDateSet_Values().clear();
        getDslDateSet_Values().addAll((Collection<? extends Integer>)newValue);
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
      case AtemPackage.DATE_SET__DSL_DATE_SET_VALUES:
        getDslDateSet_Values().clear();
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
      case AtemPackage.DATE_SET__DSL_DATE_SET_VALUES:
        return dslDateSet_Values != null && !dslDateSet_Values.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (dslDateSet_Values: ");
    result.append(dslDateSet_Values);
    result.append(')');
    return result.toString();
  }

} //DateSetImpl
