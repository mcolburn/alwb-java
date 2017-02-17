/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.DaySet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Day Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.DaySetImpl#getDslSetValue_Days <em>Dsl Set Value Days</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaySetImpl extends AbstractDayCaseImpl implements DaySet
{
  /**
   * The cached value of the '{@link #getDslSetValue_Days() <em>Dsl Set Value Days</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDslSetValue_Days()
   * @generated
   * @ordered
   */
  protected EList<Integer> dslSetValue_Days;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DaySetImpl()
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
    return AtemPackage.Literals.DAY_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getDslSetValue_Days()
  {
    if (dslSetValue_Days == null)
    {
      dslSetValue_Days = new EDataTypeEList<Integer>(Integer.class, this, AtemPackage.DAY_SET__DSL_SET_VALUE_DAYS);
    }
    return dslSetValue_Days;
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
      case AtemPackage.DAY_SET__DSL_SET_VALUE_DAYS:
        return getDslSetValue_Days();
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
      case AtemPackage.DAY_SET__DSL_SET_VALUE_DAYS:
        getDslSetValue_Days().clear();
        getDslSetValue_Days().addAll((Collection<? extends Integer>)newValue);
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
      case AtemPackage.DAY_SET__DSL_SET_VALUE_DAYS:
        getDslSetValue_Days().clear();
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
      case AtemPackage.DAY_SET__DSL_SET_VALUE_DAYS:
        return dslSetValue_Days != null && !dslSetValue_Days.isEmpty();
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
    result.append(" (dslSetValue_Days: ");
    result.append(dslSetValue_Days);
    result.append(')');
    return result.toString();
  }

} //DaySetImpl
