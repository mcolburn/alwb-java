/**
 */
package net.ages.workbench.resources.dsl.ares.impl;

import net.ages.workbench.resources.dsl.ares.AresPackage;
import net.ages.workbench.resources.dsl.ares.Definition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.resources.dsl.ares.impl.DefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.ages.workbench.resources.dsl.ares.impl.DefinitionImpl#getDsl_Definition_Text <em>Dsl Definition Text</em>}</li>
 *   <li>{@link net.ages.workbench.resources.dsl.ares.impl.DefinitionImpl#getDsl_Definition_Ref <em>Dsl Definition Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionImpl extends MinimalEObjectImpl.Container implements Definition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDsl_Definition_Text() <em>Dsl Definition Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Definition_Text()
   * @generated
   * @ordered
   */
  protected static final String DSL_DEFINITION_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDsl_Definition_Text() <em>Dsl Definition Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Definition_Text()
   * @generated
   * @ordered
   */
  protected String dsl_Definition_Text = DSL_DEFINITION_TEXT_EDEFAULT;

  /**
   * The cached value of the '{@link #getDsl_Definition_Ref() <em>Dsl Definition Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Definition_Ref()
   * @generated
   * @ordered
   */
  protected Definition dsl_Definition_Ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AresPackage.Literals.DEFINITION;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDsl_Definition_Text()
  {
    return dsl_Definition_Text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Definition_Text(String newDsl_Definition_Text)
  {
    String oldDsl_Definition_Text = dsl_Definition_Text;
    dsl_Definition_Text = newDsl_Definition_Text;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.DEFINITION__DSL_DEFINITION_TEXT, oldDsl_Definition_Text, dsl_Definition_Text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition getDsl_Definition_Ref()
  {
    if (dsl_Definition_Ref != null && dsl_Definition_Ref.eIsProxy())
    {
      InternalEObject oldDsl_Definition_Ref = (InternalEObject)dsl_Definition_Ref;
      dsl_Definition_Ref = (Definition)eResolveProxy(oldDsl_Definition_Ref);
      if (dsl_Definition_Ref != oldDsl_Definition_Ref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AresPackage.DEFINITION__DSL_DEFINITION_REF, oldDsl_Definition_Ref, dsl_Definition_Ref));
      }
    }
    return dsl_Definition_Ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition basicGetDsl_Definition_Ref()
  {
    return dsl_Definition_Ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Definition_Ref(Definition newDsl_Definition_Ref)
  {
    Definition oldDsl_Definition_Ref = dsl_Definition_Ref;
    dsl_Definition_Ref = newDsl_Definition_Ref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.DEFINITION__DSL_DEFINITION_REF, oldDsl_Definition_Ref, dsl_Definition_Ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AresPackage.DEFINITION__NAME:
        return getName();
      case AresPackage.DEFINITION__DSL_DEFINITION_TEXT:
        return getDsl_Definition_Text();
      case AresPackage.DEFINITION__DSL_DEFINITION_REF:
        if (resolve) return getDsl_Definition_Ref();
        return basicGetDsl_Definition_Ref();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AresPackage.DEFINITION__NAME:
        setName((String)newValue);
        return;
      case AresPackage.DEFINITION__DSL_DEFINITION_TEXT:
        setDsl_Definition_Text((String)newValue);
        return;
      case AresPackage.DEFINITION__DSL_DEFINITION_REF:
        setDsl_Definition_Ref((Definition)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AresPackage.DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AresPackage.DEFINITION__DSL_DEFINITION_TEXT:
        setDsl_Definition_Text(DSL_DEFINITION_TEXT_EDEFAULT);
        return;
      case AresPackage.DEFINITION__DSL_DEFINITION_REF:
        setDsl_Definition_Ref((Definition)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AresPackage.DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AresPackage.DEFINITION__DSL_DEFINITION_TEXT:
        return DSL_DEFINITION_TEXT_EDEFAULT == null ? dsl_Definition_Text != null : !DSL_DEFINITION_TEXT_EDEFAULT.equals(dsl_Definition_Text);
      case AresPackage.DEFINITION__DSL_DEFINITION_REF:
        return dsl_Definition_Ref != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", dsl_Definition_Text: ");
    result.append(dsl_Definition_Text);
    result.append(')');
    return result.toString();
  }

} //DefinitionImpl
