/**
 */
package net.ages.workbench.templates.dsl.atem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.DateRange#getDsl_DateRange_from <em>Dsl Date Range from</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.DateRange#getDsl_DateRange_To <em>Dsl Date Range To</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDateRange()
 * @model
 * @generated
 */
public interface DateRange extends AbstractDateCase
{
  /**
   * Returns the value of the '<em><b>Dsl Date Range from</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Date Range from</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Date Range from</em>' attribute.
   * @see #setDsl_DateRange_from(int)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDateRange_Dsl_DateRange_from()
   * @model
   * @generated
   */
  int getDsl_DateRange_from();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.DateRange#getDsl_DateRange_from <em>Dsl Date Range from</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Date Range from</em>' attribute.
   * @see #getDsl_DateRange_from()
   * @generated
   */
  void setDsl_DateRange_from(int value);

  /**
   * Returns the value of the '<em><b>Dsl Date Range To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Date Range To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Date Range To</em>' attribute.
   * @see #setDsl_DateRange_To(int)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDateRange_Dsl_DateRange_To()
   * @model
   * @generated
   */
  int getDsl_DateRange_To();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.DateRange#getDsl_DateRange_To <em>Dsl Date Range To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Date Range To</em>' attribute.
   * @see #getDsl_DateRange_To()
   * @generated
   */
  void setDsl_DateRange_To(int value);

} // DateRange
