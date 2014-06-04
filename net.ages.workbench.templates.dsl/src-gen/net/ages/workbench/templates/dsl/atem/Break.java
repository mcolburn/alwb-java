/**
 */
package net.ages.workbench.templates.dsl.atem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Break</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Break#getDsl_break_type <em>Dsl break type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getBreak()
 * @model
 * @generated
 */
public interface Break extends AbstractComponent, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Dsl break type</b></em>' attribute.
   * The literals are from the enumeration {@link net.ages.workbench.templates.dsl.atem.BreakType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl break type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl break type</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.BreakType
   * @see #setDsl_break_type(BreakType)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getBreak_Dsl_break_type()
   * @model
   * @generated
   */
  BreakType getDsl_break_type();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.Break#getDsl_break_type <em>Dsl break type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl break type</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.BreakType
   * @see #getDsl_break_type()
   * @generated
   */
  void setDsl_break_type(BreakType value);

} // Break
