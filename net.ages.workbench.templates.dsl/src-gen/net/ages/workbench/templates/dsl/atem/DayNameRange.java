/**
 */
package net.ages.workbench.templates.dsl.atem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day Name Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.DayNameRange#getDsl_DayNameRange_from <em>Dsl Day Name Range from</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.DayNameRange#getDsl_DayNameRange_To <em>Dsl Day Name Range To</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDayNameRange()
 * @model
 * @generated
 */
public interface DayNameRange extends AbstractDayNameCase
{
  /**
   * Returns the value of the '<em><b>Dsl Day Name Range from</b></em>' attribute.
   * The literals are from the enumeration {@link net.ages.workbench.templates.dsl.atem.DayOfWeek}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Day Name Range from</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Day Name Range from</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.DayOfWeek
   * @see #setDsl_DayNameRange_from(DayOfWeek)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDayNameRange_Dsl_DayNameRange_from()
   * @model
   * @generated
   */
  DayOfWeek getDsl_DayNameRange_from();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.DayNameRange#getDsl_DayNameRange_from <em>Dsl Day Name Range from</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Day Name Range from</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.DayOfWeek
   * @see #getDsl_DayNameRange_from()
   * @generated
   */
  void setDsl_DayNameRange_from(DayOfWeek value);

  /**
   * Returns the value of the '<em><b>Dsl Day Name Range To</b></em>' attribute.
   * The literals are from the enumeration {@link net.ages.workbench.templates.dsl.atem.DayOfWeek}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Day Name Range To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Day Name Range To</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.DayOfWeek
   * @see #setDsl_DayNameRange_To(DayOfWeek)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDayNameRange_Dsl_DayNameRange_To()
   * @model
   * @generated
   */
  DayOfWeek getDsl_DayNameRange_To();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.DayNameRange#getDsl_DayNameRange_To <em>Dsl Day Name Range To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Day Name Range To</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.DayOfWeek
   * @see #getDsl_DayNameRange_To()
   * @generated
   */
  void setDsl_DayNameRange_To(DayOfWeek value);

} // DayNameRange
