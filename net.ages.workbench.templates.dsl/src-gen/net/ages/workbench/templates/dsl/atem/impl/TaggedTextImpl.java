/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.resources.dsl.ares.Definition;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.ElementType;
import net.ages.workbench.templates.dsl.atem.TaggedText;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tagged Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.TaggedTextImpl#getDsl_TaggedText_tag <em>Dsl Tagged Text tag</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.TaggedTextImpl#getDsl_TaggedText <em>Dsl Tagged Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaggedTextImpl extends ElementTypeImpl implements TaggedText
{
  /**
   * The cached value of the '{@link #getDsl_TaggedText_tag() <em>Dsl Tagged Text tag</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_TaggedText_tag()
   * @generated
   * @ordered
   */
  protected Definition dsl_TaggedText_tag;

  /**
   * The cached value of the '{@link #getDsl_TaggedText() <em>Dsl Tagged Text</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_TaggedText()
   * @generated
   * @ordered
   */
  protected EList<ElementType> dsl_TaggedText;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaggedTextImpl()
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
    return AtemPackage.Literals.TAGGED_TEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition getDsl_TaggedText_tag()
  {
    if (dsl_TaggedText_tag != null && dsl_TaggedText_tag.eIsProxy())
    {
      InternalEObject oldDsl_TaggedText_tag = (InternalEObject)dsl_TaggedText_tag;
      dsl_TaggedText_tag = (Definition)eResolveProxy(oldDsl_TaggedText_tag);
      if (dsl_TaggedText_tag != oldDsl_TaggedText_tag)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtemPackage.TAGGED_TEXT__DSL_TAGGED_TEXT_TAG, oldDsl_TaggedText_tag, dsl_TaggedText_tag));
      }
    }
    return dsl_TaggedText_tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition basicGetDsl_TaggedText_tag()
  {
    return dsl_TaggedText_tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_TaggedText_tag(Definition newDsl_TaggedText_tag)
  {
    Definition oldDsl_TaggedText_tag = dsl_TaggedText_tag;
    dsl_TaggedText_tag = newDsl_TaggedText_tag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.TAGGED_TEXT__DSL_TAGGED_TEXT_TAG, oldDsl_TaggedText_tag, dsl_TaggedText_tag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementType> getDsl_TaggedText()
  {
    if (dsl_TaggedText == null)
    {
      dsl_TaggedText = new EObjectContainmentEList<ElementType>(ElementType.class, this, AtemPackage.TAGGED_TEXT__DSL_TAGGED_TEXT);
    }
    return dsl_TaggedText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AtemPackage.TAGGED_TEXT__DSL_TAGGED_TEXT:
        return ((InternalEList<?>)getDsl_TaggedText()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AtemPackage.TAGGED_TEXT__DSL_TAGGED_TEXT_TAG:
        if (resolve) return getDsl_TaggedText_tag();
        return basicGetDsl_TaggedText_tag();
      case AtemPackage.TAGGED_TEXT__DSL_TAGGED_TEXT:
        return getDsl_TaggedText();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AtemPackage.TAGGED_TEXT__DSL_TAGGED_TEXT_TAG:
        setDsl_TaggedText_tag((Definition)newValue);
        return;
      case AtemPackage.TAGGED_TEXT__DSL_TAGGED_TEXT:
        getDsl_TaggedText().clear();
        getDsl_TaggedText().addAll((Collection<? extends ElementType>)newValue);
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
      case AtemPackage.TAGGED_TEXT__DSL_TAGGED_TEXT_TAG:
        setDsl_TaggedText_tag((Definition)null);
        return;
      case AtemPackage.TAGGED_TEXT__DSL_TAGGED_TEXT:
        getDsl_TaggedText().clear();
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
      case AtemPackage.TAGGED_TEXT__DSL_TAGGED_TEXT_TAG:
        return dsl_TaggedText_tag != null;
      case AtemPackage.TAGGED_TEXT__DSL_TAGGED_TEXT:
        return dsl_TaggedText != null && !dsl_TaggedText.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TaggedTextImpl
