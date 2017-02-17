/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.TemplateStatus;
import net.ages.workbench.templates.dsl.atem.TemplateStatuses;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.TemplateStatusImpl#getDsl_TemplateStatus <em>Dsl Template Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateStatusImpl extends MinimalEObjectImpl.Container implements TemplateStatus
{
  /**
   * The default value of the '{@link #getDsl_TemplateStatus() <em>Dsl Template Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_TemplateStatus()
   * @generated
   * @ordered
   */
  protected static final TemplateStatuses DSL_TEMPLATE_STATUS_EDEFAULT = TemplateStatuses.NA;

  /**
   * The cached value of the '{@link #getDsl_TemplateStatus() <em>Dsl Template Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_TemplateStatus()
   * @generated
   * @ordered
   */
  protected TemplateStatuses dsl_TemplateStatus = DSL_TEMPLATE_STATUS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateStatusImpl()
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
    return AtemPackage.Literals.TEMPLATE_STATUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateStatuses getDsl_TemplateStatus()
  {
    return dsl_TemplateStatus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_TemplateStatus(TemplateStatuses newDsl_TemplateStatus)
  {
    TemplateStatuses oldDsl_TemplateStatus = dsl_TemplateStatus;
    dsl_TemplateStatus = newDsl_TemplateStatus == null ? DSL_TEMPLATE_STATUS_EDEFAULT : newDsl_TemplateStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.TEMPLATE_STATUS__DSL_TEMPLATE_STATUS, oldDsl_TemplateStatus, dsl_TemplateStatus));
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
      case AtemPackage.TEMPLATE_STATUS__DSL_TEMPLATE_STATUS:
        return getDsl_TemplateStatus();
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
      case AtemPackage.TEMPLATE_STATUS__DSL_TEMPLATE_STATUS:
        setDsl_TemplateStatus((TemplateStatuses)newValue);
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
      case AtemPackage.TEMPLATE_STATUS__DSL_TEMPLATE_STATUS:
        setDsl_TemplateStatus(DSL_TEMPLATE_STATUS_EDEFAULT);
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
      case AtemPackage.TEMPLATE_STATUS__DSL_TEMPLATE_STATUS:
        return dsl_TemplateStatus != DSL_TEMPLATE_STATUS_EDEFAULT;
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
    result.append(" (dsl_TemplateStatus: ");
    result.append(dsl_TemplateStatus);
    result.append(')');
    return result.toString();
  }

} //TemplateStatusImpl
