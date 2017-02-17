/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Sundays Before Triodion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion#getDsl_WhenSundaysBeforeTriodion_Cases <em>Dsl When Sundays Before Triodion Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion#getDsl_SundaysBeforeTriodion_Other <em>Dsl Sundays Before Triodion Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenSundaysBeforeTriodion()
 * @model
 * @generated
 */
public interface WhenSundaysBeforeTriodion extends AbstractComponent, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Dsl When Sundays Before Triodion Cases</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.SundaysBeforeTriodionCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Sundays Before Triodion Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Sundays Before Triodion Cases</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenSundaysBeforeTriodion_Dsl_WhenSundaysBeforeTriodion_Cases()
   * @model containment="true"
   * @generated
   */
  EList<SundaysBeforeTriodionCase> getDsl_WhenSundaysBeforeTriodion_Cases();

  /**
   * Returns the value of the '<em><b>Dsl Sundays Before Triodion Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Sundays Before Triodion Other</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Sundays Before Triodion Other</em>' containment reference.
   * @see #setDsl_SundaysBeforeTriodion_Other(WhenOther)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenSundaysBeforeTriodion_Dsl_SundaysBeforeTriodion_Other()
   * @model containment="true"
   * @generated
   */
  WhenOther getDsl_SundaysBeforeTriodion_Other();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenSundaysBeforeTriodion#getDsl_SundaysBeforeTriodion_Other <em>Dsl Sundays Before Triodion Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Sundays Before Triodion Other</em>' containment reference.
   * @see #getDsl_SundaysBeforeTriodion_Other()
   * @generated
   */
  void setDsl_SundaysBeforeTriodion_Other(WhenOther value);

} // WhenSundaysBeforeTriodion
