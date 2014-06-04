/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.TemplateStatus#getDsl_TemplateStatus <em>Dsl Template Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getTemplateStatus()
 * @model
 * @generated
 */
public interface TemplateStatus extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl Template Status</b></em>' attribute.
   * The literals are from the enumeration {@link net.ages.workbench.templates.dsl.atem.TemplateStatuses}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Template Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Template Status</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.TemplateStatuses
   * @see #setDsl_TemplateStatus(TemplateStatuses)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getTemplateStatus_Dsl_TemplateStatus()
   * @model
   * @generated
   */
  TemplateStatuses getDsl_TemplateStatus();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.TemplateStatus#getDsl_TemplateStatus <em>Dsl Template Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Template Status</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.TemplateStatuses
   * @see #getDsl_TemplateStatus()
   * @generated
   */
  void setDsl_TemplateStatus(TemplateStatuses value);

} // TemplateStatus
