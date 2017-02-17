/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.ModeOfWeekSet;
import net.ages.workbench.templates.dsl.atem.ModeTypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Of Week Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.ModeOfWeekSetImpl#getDsl_ModeOfWeekSet_MOWs <em>Dsl Mode Of Week Set MO Ws</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeOfWeekSetImpl extends MinimalEObjectImpl.Container implements ModeOfWeekSet
{
  /**
   * The cached value of the '{@link #getDsl_ModeOfWeekSet_MOWs() <em>Dsl Mode Of Week Set MO Ws</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_ModeOfWeekSet_MOWs()
   * @generated
   * @ordered
   */
  protected EList<ModeTypes> dsl_ModeOfWeekSet_MOWs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModeOfWeekSetImpl()
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
    return AtemPackage.Literals.MODE_OF_WEEK_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModeTypes> getDsl_ModeOfWeekSet_MOWs()
  {
    if (dsl_ModeOfWeekSet_MOWs == null)
    {
      dsl_ModeOfWeekSet_MOWs = new EDataTypeEList<ModeTypes>(ModeTypes.class, this, AtemPackage.MODE_OF_WEEK_SET__DSL_MODE_OF_WEEK_SET_MO_WS);
    }
    return dsl_ModeOfWeekSet_MOWs;
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
      case AtemPackage.MODE_OF_WEEK_SET__DSL_MODE_OF_WEEK_SET_MO_WS:
        return getDsl_ModeOfWeekSet_MOWs();
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
      case AtemPackage.MODE_OF_WEEK_SET__DSL_MODE_OF_WEEK_SET_MO_WS:
        getDsl_ModeOfWeekSet_MOWs().clear();
        getDsl_ModeOfWeekSet_MOWs().addAll((Collection<? extends ModeTypes>)newValue);
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
      case AtemPackage.MODE_OF_WEEK_SET__DSL_MODE_OF_WEEK_SET_MO_WS:
        getDsl_ModeOfWeekSet_MOWs().clear();
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
      case AtemPackage.MODE_OF_WEEK_SET__DSL_MODE_OF_WEEK_SET_MO_WS:
        return dsl_ModeOfWeekSet_MOWs != null && !dsl_ModeOfWeekSet_MOWs.isEmpty();
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
    result.append(" (dsl_ModeOfWeekSet_MOWs: ");
    result.append(dsl_ModeOfWeekSet_MOWs);
    result.append(')');
    return result.toString();
  }

} //ModeOfWeekSetImpl
