/**
 */
package net.ages.workbench.templates.dsl.atem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.DayRange#getDsl_DayRange_from <em>Dsl Day Range from</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.DayRange#getDsl_Range_To <em>Dsl Range To</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDayRange()
 * @model
 * @generated
 */
public interface DayRange extends AbstractDayCase
{
  /**
   * Returns the value of the '<em><b>Dsl Day Range from</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Day Range from</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Day Range from</em>' attribute.
   * @see #setDsl_DayRange_from(int)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDayRange_Dsl_DayRange_from()
   * @model
   * @generated
   */
  int getDsl_DayRange_from();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.DayRange#getDsl_DayRange_from <em>Dsl Day Range from</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Day Range from</em>' attribute.
   * @see #getDsl_DayRange_from()
   * @generated
   */
  void setDsl_DayRange_from(int value);

  /**
   * Returns the value of the '<em><b>Dsl Range To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Range To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Range To</em>' attribute.
   * @see #setDsl_Range_To(int)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDayRange_Dsl_Range_To()
   * @model
   * @generated
   */
  int getDsl_Range_To();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.DayRange#getDsl_Range_To <em>Dsl Range To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Range To</em>' attribute.
   * @see #getDsl_Range_To()
   * @generated
   */
  void setDsl_Range_To(int value);

} // DayRange
