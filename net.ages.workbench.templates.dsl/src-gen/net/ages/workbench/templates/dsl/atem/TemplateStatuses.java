/**
 */
package net.ages.workbench.templates.dsl.atem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Template Statuses</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.ages.workbench.templates.dsl.atem.AtemPackage#getTemplateStatuses()
 * @model
 * @generated
 */
public enum TemplateStatuses implements Enumerator
{
  /**
   * The '<em><b>NA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NA_VALUE
   * @generated
   * @ordered
   */
  NA(0, "NA", "NA"),

  /**
   * The '<em><b>Draft</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DRAFT_VALUE
   * @generated
   * @ordered
   */
  DRAFT(1, "Draft", "Draft"),

  /**
   * The '<em><b>Review</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REVIEW_VALUE
   * @generated
   * @ordered
   */
  REVIEW(2, "Review", "Review"),

  /**
   * The '<em><b>Final</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINAL_VALUE
   * @generated
   * @ordered
   */
  FINAL(3, "Final", "Final");

  /**
   * The '<em><b>NA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NA
   * @model
   * @generated
   * @ordered
   */
  public static final int NA_VALUE = 0;

  /**
   * The '<em><b>Draft</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Draft</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DRAFT
   * @model name="Draft"
   * @generated
   * @ordered
   */
  public static final int DRAFT_VALUE = 1;

  /**
   * The '<em><b>Review</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Review</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REVIEW
   * @model name="Review"
   * @generated
   * @ordered
   */
  public static final int REVIEW_VALUE = 2;

  /**
   * The '<em><b>Final</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Final</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FINAL
   * @model name="Final"
   * @generated
   * @ordered
   */
  public static final int FINAL_VALUE = 3;

  /**
   * An array of all the '<em><b>Template Statuses</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TemplateStatuses[] VALUES_ARRAY =
    new TemplateStatuses[]
    {
      NA,
      DRAFT,
      REVIEW,
      FINAL,
    };

  /**
   * A public read-only list of all the '<em><b>Template Statuses</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TemplateStatuses> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Template Statuses</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TemplateStatuses get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TemplateStatuses result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Template Statuses</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TemplateStatuses getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TemplateStatuses result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Template Statuses</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TemplateStatuses get(int value)
  {
    switch (value)
    {
      case NA_VALUE: return NA;
      case DRAFT_VALUE: return DRAFT;
      case REVIEW_VALUE: return REVIEW;
      case FINAL_VALUE: return FINAL;
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
  private TemplateStatuses(int value, String name, String literal)
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
  
} //TemplateStatuses
