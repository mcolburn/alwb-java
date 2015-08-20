/**
 */
package net.ages.workbench.templates.dsl.atem;

import net.ages.workbench.resources.dsl.ares.Definition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lookup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Lookup#getDsl_ResourceTextRef <em>Dsl Resource Text Ref</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Version <em>Dsl Lookup Version</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Media_Off <em>Dsl Lookup Media Off</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Override_Mode_Set <em>Dsl Lookup Override Mode Set</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Lookup#getDsl_Lookup_OverrideMode <em>Dsl Lookup Override Mode</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Override__Day_Set <em>Dsl Lookup Override Day Set</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.Lookup#getDsl_Lookup_OverrideDay <em>Dsl Lookup Override Day</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getLookup()
 * @model
 * @generated
 */
public interface Lookup extends ElementType
{
  /**
   * Returns the value of the '<em><b>Dsl Resource Text Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Resource Text Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Resource Text Ref</em>' reference.
   * @see #setDsl_ResourceTextRef(Definition)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getLookup_Dsl_ResourceTextRef()
   * @model
   * @generated
   */
  Definition getDsl_ResourceTextRef();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.Lookup#getDsl_ResourceTextRef <em>Dsl Resource Text Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Resource Text Ref</em>' reference.
   * @see #getDsl_ResourceTextRef()
   * @generated
   */
  void setDsl_ResourceTextRef(Definition value);

  /**
   * Returns the value of the '<em><b>Dsl Lookup Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Lookup Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Lookup Version</em>' attribute.
   * @see #setDsl_Lookup_Version(boolean)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getLookup_Dsl_Lookup_Version()
   * @model
   * @generated
   */
  boolean isDsl_Lookup_Version();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Version <em>Dsl Lookup Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Lookup Version</em>' attribute.
   * @see #isDsl_Lookup_Version()
   * @generated
   */
  void setDsl_Lookup_Version(boolean value);

  /**
   * Returns the value of the '<em><b>Dsl Lookup Media Off</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Lookup Media Off</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Lookup Media Off</em>' attribute.
   * @see #setDsl_Lookup_Media_Off(boolean)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getLookup_Dsl_Lookup_Media_Off()
   * @model
   * @generated
   */
  boolean isDsl_Lookup_Media_Off();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Media_Off <em>Dsl Lookup Media Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Lookup Media Off</em>' attribute.
   * @see #isDsl_Lookup_Media_Off()
   * @generated
   */
  void setDsl_Lookup_Media_Off(boolean value);

  /**
   * Returns the value of the '<em><b>Dsl Lookup Override Mode Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Lookup Override Mode Set</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Lookup Override Mode Set</em>' attribute.
   * @see #setDsl_Lookup_Override_Mode_Set(boolean)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getLookup_Dsl_Lookup_Override_Mode_Set()
   * @model
   * @generated
   */
  boolean isDsl_Lookup_Override_Mode_Set();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Override_Mode_Set <em>Dsl Lookup Override Mode Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Lookup Override Mode Set</em>' attribute.
   * @see #isDsl_Lookup_Override_Mode_Set()
   * @generated
   */
  void setDsl_Lookup_Override_Mode_Set(boolean value);

  /**
   * Returns the value of the '<em><b>Dsl Lookup Override Mode</b></em>' attribute.
   * The literals are from the enumeration {@link net.ages.workbench.templates.dsl.atem.ModeTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Lookup Override Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Lookup Override Mode</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.ModeTypes
   * @see #setDsl_Lookup_OverrideMode(ModeTypes)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getLookup_Dsl_Lookup_OverrideMode()
   * @model
   * @generated
   */
  ModeTypes getDsl_Lookup_OverrideMode();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.Lookup#getDsl_Lookup_OverrideMode <em>Dsl Lookup Override Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Lookup Override Mode</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.ModeTypes
   * @see #getDsl_Lookup_OverrideMode()
   * @generated
   */
  void setDsl_Lookup_OverrideMode(ModeTypes value);

  /**
   * Returns the value of the '<em><b>Dsl Lookup Override Day Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Lookup Override Day Set</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Lookup Override Day Set</em>' attribute.
   * @see #setDsl_Lookup_Override__Day_Set(boolean)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getLookup_Dsl_Lookup_Override__Day_Set()
   * @model
   * @generated
   */
  boolean isDsl_Lookup_Override__Day_Set();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.Lookup#isDsl_Lookup_Override__Day_Set <em>Dsl Lookup Override Day Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Lookup Override Day Set</em>' attribute.
   * @see #isDsl_Lookup_Override__Day_Set()
   * @generated
   */
  void setDsl_Lookup_Override__Day_Set(boolean value);

  /**
   * Returns the value of the '<em><b>Dsl Lookup Override Day</b></em>' attribute.
   * The literals are from the enumeration {@link net.ages.workbench.templates.dsl.atem.DowTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Lookup Override Day</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Lookup Override Day</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.DowTypes
   * @see #setDsl_Lookup_OverrideDay(DowTypes)
   * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getLookup_Dsl_Lookup_OverrideDay()
   * @model
   * @generated
   */
  DowTypes getDsl_Lookup_OverrideDay();

  /**
   * Sets the value of the '{@link net.ages.workbench.templates.dsl.atem.Lookup#getDsl_Lookup_OverrideDay <em>Dsl Lookup Override Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Lookup Override Day</em>' attribute.
   * @see net.ages.workbench.templates.dsl.atem.DowTypes
   * @see #getDsl_Lookup_OverrideDay()
   * @generated
   */
  void setDsl_Lookup_OverrideDay(DowTypes value);

} // Lookup
