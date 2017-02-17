/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Day Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenDayName#getDsl_WhenDayName_Cases <em>Dsl When Day Name Cases</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.WhenDayName#getDsl_WhenDayName_Other <em>Dsl When Day Name Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenDayName()
 * @model
 * @generated
 */
public interface WhenDayName extends AbstractComponent, SectionElementType
{
  /**
   * Returns the value of the '<em><b>Dsl When Day Name Cases</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.WhenDayNameCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Day Name Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Day Name Cases</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenDayName_Dsl_WhenDayName_Cases()
   * @model containment="true"
   * @generated
   */
  EList<WhenDayNameCase> getDsl_WhenDayName_Cases();

  /**
   * Returns the value of the '<em><b>Dsl When Day Name Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl When Day Name Other</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl When Day Name Other</em>' containment reference.
   * @see #setDsl_WhenDayName_Other(WhenOther)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getWhenDayName_Dsl_WhenDayName_Other()
   * @model containment="true"
   * @generated
   */
  WhenOther getDsl_WhenDayName_Other();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.WhenDayName#getDsl_WhenDayName_Other <em>Dsl When Day Name Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl When Day Name Other</em>' containment reference.
   * @see #getDsl_WhenDayName_Other()
   * @generated
   */
  void setDsl_WhenDayName_Other(WhenOther value);

} // WhenDayName
