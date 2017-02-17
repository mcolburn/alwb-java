/**
 */
package net.ages.workbench.templates.dsl.atem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Footer Lookup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.HeaderFooterLookup#getDsl_HeaderFooterLookup_Elements <em>Dsl Header Footer Lookup Elements</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.HeaderFooterLookup#getDsl_HeaderFooterLookup_Language <em>Dsl Header Footer Lookup Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getHeaderFooterLookup()
 * @model
 * @generated
 */
public interface HeaderFooterLookup extends HeaderFooterFragment
{
  /**
   * Returns the value of the '<em><b>Dsl Header Footer Lookup Elements</b></em>' containment reference list.
   * The list contents are of type {@link net.ages.workbench.templates.dsl.atem.ElementType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Header Footer Lookup Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Header Footer Lookup Elements</em>' containment reference list.
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getHeaderFooterLookup_Dsl_HeaderFooterLookup_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ElementType> getDsl_HeaderFooterLookup_Elements();

  /**
   * Returns the value of the '<em><b>Dsl Header Footer Lookup Language</b></em>' attribute.
   * The literals are from the enumeration {@link net.ages.workbench.templates.dsl.atem.Language}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Header Footer Lookup Language</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Header Footer Lookup Language</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.Language
   * @see #setDsl_HeaderFooterLookup_Language(Language)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getHeaderFooterLookup_Dsl_HeaderFooterLookup_Language()
   * @model
   * @generated
   */
  Language getDsl_HeaderFooterLookup_Language();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.HeaderFooterLookup#getDsl_HeaderFooterLookup_Language <em>Dsl Header Footer Lookup Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Header Footer Lookup Language</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.Language
   * @see #getDsl_HeaderFooterLookup_Language()
   * @generated
   */
  void setDsl_HeaderFooterLookup_Language(Language value);

} // HeaderFooterLookup
