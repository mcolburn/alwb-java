/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.AtemModel#getName <em>Name</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_Status <em>Dsl Template Status</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.AtemModel#getImports <em>Imports</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_Driver <em>Dsl Template Driver</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_head <em>Dsl Template head</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_preface <em>Dsl Template preface</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_components <em>Dsl Template components</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getAtemModel()
 * @model
 * @generated
 */
public interface AtemModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getAtemModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.AtemModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dsl Template Status</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Template Status</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Template Status</em>' containment reference.
   * @see #setDsl_Template_Status(TemplateStatus)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getAtemModel_Dsl_Template_Status()
   * @model containment="true"
   * @generated
   */
  TemplateStatus getDsl_Template_Status();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_Status <em>Dsl Template Status</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Template Status</em>' containment reference.
   * @see #getDsl_Template_Status()
   * @generated
   */
  void setDsl_Template_Status(TemplateStatus value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getAtemModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Dsl Template Driver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Template Driver</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Template Driver</em>' containment reference.
   * @see #setDsl_Template_Driver(Driver)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getAtemModel_Dsl_Template_Driver()
   * @model containment="true"
   * @generated
   */
  Driver getDsl_Template_Driver();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_Driver <em>Dsl Template Driver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Template Driver</em>' containment reference.
   * @see #getDsl_Template_Driver()
   * @generated
   */
  void setDsl_Template_Driver(Driver value);

  /**
   * Returns the value of the '<em><b>Dsl Template head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Template head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Template head</em>' containment reference.
   * @see #setDsl_Template_head(Head)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getAtemModel_Dsl_Template_head()
   * @model containment="true"
   * @generated
   */
  Head getDsl_Template_head();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_head <em>Dsl Template head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Template head</em>' containment reference.
   * @see #getDsl_Template_head()
   * @generated
   */
  void setDsl_Template_head(Head value);

  /**
   * Returns the value of the '<em><b>Dsl Template preface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Template preface</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Template preface</em>' containment reference.
   * @see #setDsl_Template_preface(Preface)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getAtemModel_Dsl_Template_preface()
   * @model containment="true"
   * @generated
   */
  Preface getDsl_Template_preface();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.AtemModel#getDsl_Template_preface <em>Dsl Template preface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Template preface</em>' containment reference.
   * @see #getDsl_Template_preface()
   * @generated
   */
  void setDsl_Template_preface(Preface value);

  /**
   * Returns the value of the '<em><b>Dsl Template components</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.AbstractComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Template components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Template components</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getAtemModel_Dsl_Template_components()
   * @model containment="true"
   * @generated
   */
  EList<AbstractComponent> getDsl_Template_components();

} // AtemModel
