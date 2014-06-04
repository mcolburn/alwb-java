/**
 */
package net.ages.workbench.templates.dsl.atem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.TemplateFragment#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getTemplateFragment()
 * @model
 * @generated
 */
public interface TemplateFragment extends AbstractComponent, PrefaceElementType, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(AtemModel)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getTemplateFragment_Name()
   * @model
   * @generated
   */
  AtemModel getName();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.TemplateFragment#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(AtemModel value);

} // TemplateFragment
