/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.HeaderFooterFragment;
import net.ages.workbench.templates.dsl.atem.TemplateTitle;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Title</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.TemplateTitleImpl#getDsl_TemplateTitle_Elements <em>Dsl Template Title Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateTitleImpl extends HeadComponentImpl implements TemplateTitle
{
  /**
   * The cached value of the '{@link #getDsl_TemplateTitle_Elements() <em>Dsl Template Title Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_TemplateTitle_Elements()
   * @generated
   * @ordered
   */
  protected EList<HeaderFooterFragment> dsl_TemplateTitle_Elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateTitleImpl()
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
    return AtemPackage.Literals.TEMPLATE_TITLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HeaderFooterFragment> getDsl_TemplateTitle_Elements()
  {
    if (dsl_TemplateTitle_Elements == null)
    {
      dsl_TemplateTitle_Elements = new EObjectContainmentEList<HeaderFooterFragment>(HeaderFooterFragment.class, this, AtemPackage.TEMPLATE_TITLE__DSL_TEMPLATE_TITLE_ELEMENTS);
    }
    return dsl_TemplateTitle_Elements;
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
      case AtemPackage.TEMPLATE_TITLE__DSL_TEMPLATE_TITLE_ELEMENTS:
        return ((InternalEList<?>)getDsl_TemplateTitle_Elements()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.TEMPLATE_TITLE__DSL_TEMPLATE_TITLE_ELEMENTS:
        return getDsl_TemplateTitle_Elements();
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
      case AtemPackage.TEMPLATE_TITLE__DSL_TEMPLATE_TITLE_ELEMENTS:
        getDsl_TemplateTitle_Elements().clear();
        getDsl_TemplateTitle_Elements().addAll((Collection<? extends HeaderFooterFragment>)newValue);
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
      case AtemPackage.TEMPLATE_TITLE__DSL_TEMPLATE_TITLE_ELEMENTS:
        getDsl_TemplateTitle_Elements().clear();
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
      case AtemPackage.TEMPLATE_TITLE__DSL_TEMPLATE_TITLE_ELEMENTS:
        return dsl_TemplateTitle_Elements != null && !dsl_TemplateTitle_Elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TemplateTitleImpl
