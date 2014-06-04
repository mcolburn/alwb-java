/**
 */
package net.ages.workbench.templates.dsl.atem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Seasons</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getSeasons()
 * @model
 * @generated
 */
public enum Seasons implements Enumerator
{
  /**
   * The '<em><b>Triodion</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRIODION_VALUE
   * @generated
   * @ordered
   */
  TRIODION(0, "Triodion", "Triodion"),

  /**
   * The '<em><b>Pentecostarion</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PENTECOSTARION_VALUE
   * @generated
   * @ordered
   */
  PENTECOSTARION(1, "Pentecostarion", "Pentecostarion"),

  /**
   * The '<em><b>Nativity Fast</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NATIVITY_FAST_VALUE
   * @generated
   * @ordered
   */
  NATIVITY_FAST(2, "Nativity_Fast", "Nativity_Fast"),

  /**
   * The '<em><b>Apostles Fast</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #APOSTLES_FAST_VALUE
   * @generated
   * @ordered
   */
  APOSTLES_FAST(3, "Apostles_Fast", "Apostles_Fast"),

  /**
   * The '<em><b>Dormition Fast</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DORMITION_FAST_VALUE
   * @generated
   * @ordered
   */
  DORMITION_FAST(4, "Dormition_Fast", "Dormition_Fast");

  /**
   * The '<em><b>Triodion</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Triodion</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRIODION
   * @model name="Triodion"
   * @generated
   * @ordered
   */
  public static final int TRIODION_VALUE = 0;

  /**
   * The '<em><b>Pentecostarion</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pentecostarion</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PENTECOSTARION
   * @model name="Pentecostarion"
   * @generated
   * @ordered
   */
  public static final int PENTECOSTARION_VALUE = 1;

  /**
   * The '<em><b>Nativity Fast</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Nativity Fast</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NATIVITY_FAST
   * @model name="Nativity_Fast"
   * @generated
   * @ordered
   */
  public static final int NATIVITY_FAST_VALUE = 2;

  /**
   * The '<em><b>Apostles Fast</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Apostles Fast</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #APOSTLES_FAST
   * @model name="Apostles_Fast"
   * @generated
   * @ordered
   */
  public static final int APOSTLES_FAST_VALUE = 3;

  /**
   * The '<em><b>Dormition Fast</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Dormition Fast</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DORMITION_FAST
   * @model name="Dormition_Fast"
   * @generated
   * @ordered
   */
  public static final int DORMITION_FAST_VALUE = 4;

  /**
   * An array of all the '<em><b>Seasons</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Seasons[] VALUES_ARRAY =
    new Seasons[]
    {
      TRIODION,
      PENTECOSTARION,
      NATIVITY_FAST,
      APOSTLES_FAST,
      DORMITION_FAST,
    };

  /**
   * A public read-only list of all the '<em><b>Seasons</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Seasons> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Seasons</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Seasons get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Seasons result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Seasons</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Seasons getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Seasons result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Seasons</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Seasons get(int value)
  {
    switch (value)
    {
      case TRIODION_VALUE: return TRIODION;
      case PENTECOSTARION_VALUE: return PENTECOSTARION;
      case NATIVITY_FAST_VALUE: return NATIVITY_FAST;
      case APOSTLES_FAST_VALUE: return APOSTLES_FAST;
      case DORMITION_FAST_VALUE: return DORMITION_FAST;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Seasons(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Seasons
