/**
 */
package net.ages.workbench.templates.dsl.atem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dow Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getDowTypes()
 * @model
 * @generated
 */
public enum DowTypes implements Enumerator
{
  /**
   * The '<em><b>D1</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #D1_VALUE
   * @generated
   * @ordered
   */
  D1(0, "D1", "D1"),

  /**
   * The '<em><b>D2</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #D2_VALUE
   * @generated
   * @ordered
   */
  D2(1, "D2", "D2"),

  /**
   * The '<em><b>D3</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #D3_VALUE
   * @generated
   * @ordered
   */
  D3(2, "D3", "D3"),

  /**
   * The '<em><b>D4</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #D4_VALUE
   * @generated
   * @ordered
   */
  D4(3, "D4", "D4"),

  /**
   * The '<em><b>D5</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #D5_VALUE
   * @generated
   * @ordered
   */
  D5(4, "D5", "D5"),

  /**
   * The '<em><b>D6</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #D6_VALUE
   * @generated
   * @ordered
   */
  D6(5, "D6", "D6"),

  /**
   * The '<em><b>D7</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #D7_VALUE
   * @generated
   * @ordered
   */
  D7(6, "D7", "D7");

  /**
   * The '<em><b>D1</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>D1</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #D1
   * @model
   * @generated
   * @ordered
   */
  public static final int D1_VALUE = 0;

  /**
   * The '<em><b>D2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>D2</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #D2
   * @model
   * @generated
   * @ordered
   */
  public static final int D2_VALUE = 1;

  /**
   * The '<em><b>D3</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>D3</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #D3
   * @model
   * @generated
   * @ordered
   */
  public static final int D3_VALUE = 2;

  /**
   * The '<em><b>D4</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>D4</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #D4
   * @model
   * @generated
   * @ordered
   */
  public static final int D4_VALUE = 3;

  /**
   * The '<em><b>D5</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>D5</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #D5
   * @model
   * @generated
   * @ordered
   */
  public static final int D5_VALUE = 4;

  /**
   * The '<em><b>D6</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>D6</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #D6
   * @model
   * @generated
   * @ordered
   */
  public static final int D6_VALUE = 5;

  /**
   * The '<em><b>D7</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>D7</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #D7
   * @model
   * @generated
   * @ordered
   */
  public static final int D7_VALUE = 6;

  /**
   * An array of all the '<em><b>Dow Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DowTypes[] VALUES_ARRAY =
    new DowTypes[]
    {
      D1,
      D2,
      D3,
      D4,
      D5,
      D6,
      D7,
    };

  /**
   * A public read-only list of all the '<em><b>Dow Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DowTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Dow Types</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DowTypes get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DowTypes result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dow Types</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DowTypes getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DowTypes result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dow Types</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DowTypes get(int value)
  {
    switch (value)
    {
      case D1_VALUE: return D1;
      case D2_VALUE: return D2;
      case D3_VALUE: return D3;
      case D4_VALUE: return D4;
      case D5_VALUE: return D5;
      case D6_VALUE: return D6;
      case D7_VALUE: return D7;
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
  private DowTypes(int value, String name, String literal)
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
  
} //DowTypes
