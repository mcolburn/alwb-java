/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.Break;
import net.ages.workbench.templates.dsl.atem.BreakType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Break</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.BreakImpl#getDsl_break_type <em>Dsl break type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreakImpl extends AbstractComponentImpl implements Break
{
  /**
   * The default value of the '{@link #getDsl_break_type() <em>Dsl break type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_break_type()
   * @generated
   * @ordered
   */
  protected static final BreakType DSL_BREAK_TYPE_EDEFAULT = BreakType.LINE;

  /**
   * The cached value of the '{@link #getDsl_break_type() <em>Dsl break type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_break_type()
   * @generated
   * @ordered
   */
  protected BreakType dsl_break_type = DSL_BREAK_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BreakImpl()
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
    return AtemPackage.Literals.BREAK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakType getDsl_break_type()
  {
    return dsl_break_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_break_type(BreakType newDsl_break_type)
  {
    BreakType oldDsl_break_type = dsl_break_type;
    dsl_break_type = newDsl_break_type == null ? DSL_BREAK_TYPE_EDEFAULT : newDsl_break_type;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.BREAK__DSL_BREAK_TYPE, oldDsl_break_type, dsl_break_type));
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
      case AtemPackage.BREAK__DSL_BREAK_TYPE:
        return getDsl_break_type();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AtemPackage.BREAK__DSL_BREAK_TYPE:
        setDsl_break_type((BreakType)newValue);
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
      case AtemPackage.BREAK__DSL_BREAK_TYPE:
        setDsl_break_type(DSL_BREAK_TYPE_EDEFAULT);
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
      case AtemPackage.BREAK__DSL_BREAK_TYPE:
        return dsl_break_type != DSL_BREAK_TYPE_EDEFAULT;
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
    result.append(" (dsl_break_type: ");
    result.append(dsl_break_type);
    result.append(')');
    return result.toString();
  }

} //BreakImpl
