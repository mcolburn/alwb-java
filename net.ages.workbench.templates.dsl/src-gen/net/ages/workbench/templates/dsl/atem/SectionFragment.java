/**
 */
package net.ages.workbench.templates.dsl.atem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.SectionFragment#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getSectionFragment()
 * @model
 * @generated
 */
public interface SectionFragment extends AbstractComponent, PrefaceElementType, SectionElementType
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
   * @see #setName(Section)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getSectionFragment_Name()
   * @model
   * @generated
   */
  Section getName();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.SectionFragment#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Section value);

} // SectionFragment
