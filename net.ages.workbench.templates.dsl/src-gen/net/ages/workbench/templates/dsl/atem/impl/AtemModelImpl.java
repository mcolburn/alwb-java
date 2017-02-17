/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import java.util.Collection;

import net.ages.workbench.templates.dsl.atem.AbstractComponent;
import net.ages.workbench.templates.dsl.atem.AtemModel;
import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.Driver;
import net.ages.workbench.templates.dsl.atem.Head;
import net.ages.workbench.templates.dsl.atem.Import;
import net.ages.workbench.templates.dsl.atem.Preface;
import net.ages.workbench.templates.dsl.atem.TemplateStatus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.AtemModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.AtemModelImpl#getDsl_Template_Status <em>Dsl Template Status</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.AtemModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.AtemModelImpl#getDsl_Template_Driver <em>Dsl Template Driver</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.AtemModelImpl#getDsl_Template_head <em>Dsl Template head</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.AtemModelImpl#getDsl_Template_preface <em>Dsl Template preface</em>}</li>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.AtemModelImpl#getDsl_Template_components <em>Dsl Template components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtemModelImpl extends MinimalEObjectImpl.Container implements AtemModel
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
   * The cached value of the '{@link #getDsl_Template_Status() <em>Dsl Template Status</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Template_Status()
   * @generated
   * @ordered
   */
  protected TemplateStatus dsl_Template_Status;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getDsl_Template_Driver() <em>Dsl Template Driver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Template_Driver()
   * @generated
   * @ordered
   */
  protected Driver dsl_Template_Driver;

  /**
   * The cached value of the '{@link #getDsl_Template_head() <em>Dsl Template head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Template_head()
   * @generated
   * @ordered
   */
  protected Head dsl_Template_head;

  /**
   * The cached value of the '{@link #getDsl_Template_preface() <em>Dsl Template preface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Template_preface()
   * @generated
   * @ordered
   */
  protected Preface dsl_Template_preface;

  /**
   * The cached value of the '{@link #getDsl_Template_components() <em>Dsl Template components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Template_components()
   * @generated
   * @ordered
   */
  protected EList<AbstractComponent> dsl_Template_components;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtemModelImpl()
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
    return AtemPackage.Literals.ATEM_MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.ATEM_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateStatus getDsl_Template_Status()
  {
    return dsl_Template_Status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_Template_Status(TemplateStatus newDsl_Template_Status, NotificationChain msgs)
  {
    TemplateStatus oldDsl_Template_Status = dsl_Template_Status;
    dsl_Template_Status = newDsl_Template_Status;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.ATEM_MODEL__DSL_TEMPLATE_STATUS, oldDsl_Template_Status, newDsl_Template_Status);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Template_Status(TemplateStatus newDsl_Template_Status)
  {
    if (newDsl_Template_Status != dsl_Template_Status)
    {
      NotificationChain msgs = null;
      if (dsl_Template_Status != null)
        msgs = ((InternalEObject)dsl_Template_Status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.ATEM_MODEL__DSL_TEMPLATE_STATUS, null, msgs);
      if (newDsl_Template_Status != null)
        msgs = ((InternalEObject)newDsl_Template_Status).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.ATEM_MODEL__DSL_TEMPLATE_STATUS, null, msgs);
      msgs = basicSetDsl_Template_Status(newDsl_Template_Status, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.ATEM_MODEL__DSL_TEMPLATE_STATUS, newDsl_Template_Status, newDsl_Template_Status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, AtemPackage.ATEM_MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Driver getDsl_Template_Driver()
  {
    return dsl_Template_Driver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_Template_Driver(Driver newDsl_Template_Driver, NotificationChain msgs)
  {
    Driver oldDsl_Template_Driver = dsl_Template_Driver;
    dsl_Template_Driver = newDsl_Template_Driver;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.ATEM_MODEL__DSL_TEMPLATE_DRIVER, oldDsl_Template_Driver, newDsl_Template_Driver);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Template_Driver(Driver newDsl_Template_Driver)
  {
    if (newDsl_Template_Driver != dsl_Template_Driver)
    {
      NotificationChain msgs = null;
      if (dsl_Template_Driver != null)
        msgs = ((InternalEObject)dsl_Template_Driver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.ATEM_MODEL__DSL_TEMPLATE_DRIVER, null, msgs);
      if (newDsl_Template_Driver != null)
        msgs = ((InternalEObject)newDsl_Template_Driver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.ATEM_MODEL__DSL_TEMPLATE_DRIVER, null, msgs);
      msgs = basicSetDsl_Template_Driver(newDsl_Template_Driver, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.ATEM_MODEL__DSL_TEMPLATE_DRIVER, newDsl_Template_Driver, newDsl_Template_Driver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Head getDsl_Template_head()
  {
    return dsl_Template_head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_Template_head(Head newDsl_Template_head, NotificationChain msgs)
  {
    Head oldDsl_Template_head = dsl_Template_head;
    dsl_Template_head = newDsl_Template_head;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.ATEM_MODEL__DSL_TEMPLATE_HEAD, oldDsl_Template_head, newDsl_Template_head);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Template_head(Head newDsl_Template_head)
  {
    if (newDsl_Template_head != dsl_Template_head)
    {
      NotificationChain msgs = null;
      if (dsl_Template_head != null)
        msgs = ((InternalEObject)dsl_Template_head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.ATEM_MODEL__DSL_TEMPLATE_HEAD, null, msgs);
      if (newDsl_Template_head != null)
        msgs = ((InternalEObject)newDsl_Template_head).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.ATEM_MODEL__DSL_TEMPLATE_HEAD, null, msgs);
      msgs = basicSetDsl_Template_head(newDsl_Template_head, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.ATEM_MODEL__DSL_TEMPLATE_HEAD, newDsl_Template_head, newDsl_Template_head));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preface getDsl_Template_preface()
  {
    return dsl_Template_preface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDsl_Template_preface(Preface newDsl_Template_preface, NotificationChain msgs)
  {
    Preface oldDsl_Template_preface = dsl_Template_preface;
    dsl_Template_preface = newDsl_Template_preface;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtemPackage.ATEM_MODEL__DSL_TEMPLATE_PREFACE, oldDsl_Template_preface, newDsl_Template_preface);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Template_preface(Preface newDsl_Template_preface)
  {
    if (newDsl_Template_preface != dsl_Template_preface)
    {
      NotificationChain msgs = null;
      if (dsl_Template_preface != null)
        msgs = ((InternalEObject)dsl_Template_preface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtemPackage.ATEM_MODEL__DSL_TEMPLATE_PREFACE, null, msgs);
      if (newDsl_Template_preface != null)
        msgs = ((InternalEObject)newDsl_Template_preface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtemPackage.ATEM_MODEL__DSL_TEMPLATE_PREFACE, null, msgs);
      msgs = basicSetDsl_Template_preface(newDsl_Template_preface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.ATEM_MODEL__DSL_TEMPLATE_PREFACE, newDsl_Template_preface, newDsl_Template_preface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractComponent> getDsl_Template_components()
  {
    if (dsl_Template_components == null)
    {
      dsl_Template_components = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, AtemPackage.ATEM_MODEL__DSL_TEMPLATE_COMPONENTS);
    }
    return dsl_Template_components;
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
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_STATUS:
        return basicSetDsl_Template_Status(null, msgs);
      case AtemPackage.ATEM_MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_DRIVER:
        return basicSetDsl_Template_Driver(null, msgs);
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_HEAD:
        return basicSetDsl_Template_head(null, msgs);
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_PREFACE:
        return basicSetDsl_Template_preface(null, msgs);
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_COMPONENTS:
        return ((InternalEList<?>)getDsl_Template_components()).basicRemove(otherEnd, msgs);
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
      case AtemPackage.ATEM_MODEL__NAME:
        return getName();
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_STATUS:
        return getDsl_Template_Status();
      case AtemPackage.ATEM_MODEL__IMPORTS:
        return getImports();
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_DRIVER:
        return getDsl_Template_Driver();
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_HEAD:
        return getDsl_Template_head();
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_PREFACE:
        return getDsl_Template_preface();
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_COMPONENTS:
        return getDsl_Template_components();
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
      case AtemPackage.ATEM_MODEL__NAME:
        setName((String)newValue);
        return;
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_STATUS:
        setDsl_Template_Status((TemplateStatus)newValue);
        return;
      case AtemPackage.ATEM_MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_DRIVER:
        setDsl_Template_Driver((Driver)newValue);
        return;
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_HEAD:
        setDsl_Template_head((Head)newValue);
        return;
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_PREFACE:
        setDsl_Template_preface((Preface)newValue);
        return;
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_COMPONENTS:
        getDsl_Template_components().clear();
        getDsl_Template_components().addAll((Collection<? extends AbstractComponent>)newValue);
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
      case AtemPackage.ATEM_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_STATUS:
        setDsl_Template_Status((TemplateStatus)null);
        return;
      case AtemPackage.ATEM_MODEL__IMPORTS:
        getImports().clear();
        return;
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_DRIVER:
        setDsl_Template_Driver((Driver)null);
        return;
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_HEAD:
        setDsl_Template_head((Head)null);
        return;
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_PREFACE:
        setDsl_Template_preface((Preface)null);
        return;
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_COMPONENTS:
        getDsl_Template_components().clear();
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
      case AtemPackage.ATEM_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_STATUS:
        return dsl_Template_Status != null;
      case AtemPackage.ATEM_MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_DRIVER:
        return dsl_Template_Driver != null;
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_HEAD:
        return dsl_Template_head != null;
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_PREFACE:
        return dsl_Template_preface != null;
      case AtemPackage.ATEM_MODEL__DSL_TEMPLATE_COMPONENTS:
        return dsl_Template_components != null && !dsl_Template_components.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //AtemModelImpl
