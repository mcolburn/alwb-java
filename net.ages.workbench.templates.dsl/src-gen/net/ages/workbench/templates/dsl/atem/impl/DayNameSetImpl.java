/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.DayNameSet;
import net.ages.workbench.templates.dsl.atem.DayOfWeek;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Day Name Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DayNameSetImpl#getDslDayNameSet_Values <em>Dsl Day Name Set Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DayNameSetImpl extends AbstractDayNameCaseImpl implements DayNameSet
{
  /**
   * The cached value of the '{@link #getDslDayNameSet_Values() <em>Dsl Day Name Set Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDslDayNameSet_Values()
   * @generated
   * @ordered
   */
  protected EList<DayOfWeek> dslDayNameSet_Values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DayNameSetImpl()
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
    return AtemPackage.Literals.DAY_NAME_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DayOfWeek> getDslDayNameSet_Values()
  {
    if (dslDayNameSet_Values == null)
    {
      dslDayNameSet_Values = new EDataTypeEList<DayOfWeek>(DayOfWeek.class, this, AtemPackage.DAY_NAME_SET__DSL_DAY_NAME_SET_VALUES);
    }
    return dslDayNameSet_Values;
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
      case AtemPackage.DAY_NAME_SET__DSL_DAY_NAME_SET_VALUES:
        return getDslDayNameSet_Values();
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
      case AtemPackage.DAY_NAME_SET__DSL_DAY_NAME_SET_VALUES:
        getDslDayNameSet_Values().clear();
        getDslDayNameSet_Values().addAll((Collection<? extends DayOfWeek>)newValue);
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
      case AtemPackage.DAY_NAME_SET__DSL_DAY_NAME_SET_VALUES:
        getDslDayNameSet_Values().clear();
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
      case AtemPackage.DAY_NAME_SET__DSL_DAY_NAME_SET_VALUES:
        return dslDayNameSet_Values != null && !dslDayNameSet_Values.isEmpty();
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
    result.append(" (dslDayNameSet_Values: ");
    result.append(dslDayNameSet_Values);
    result.append(')');
    return result.toString();
  }

} //DayNameSetImpl
