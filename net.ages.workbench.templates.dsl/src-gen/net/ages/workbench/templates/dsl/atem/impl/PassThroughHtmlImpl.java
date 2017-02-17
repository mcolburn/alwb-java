/**
 */
package net.ages.workbench.templates.dsl.atem.impl;

import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.PassThroughHtml;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pass Through Html</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ages.workbench.templates.dsl.atem.impl.PassThroughHtmlImpl#getDsl_Passthrough_html_text <em>Dsl Passthrough html text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassThroughHtmlImpl extends AbstractComponentImpl implements PassThroughHtml
{
  /**
   * The default value of the '{@link #getDsl_Passthrough_html_text() <em>Dsl Passthrough html text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Passthrough_html_text()
   * @generated
   * @ordered
   */
  protected static final String DSL_PASSTHROUGH_HTML_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDsl_Passthrough_html_text() <em>Dsl Passthrough html text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsl_Passthrough_html_text()
   * @generated
   * @ordered
   */
  protected String dsl_Passthrough_html_text = DSL_PASSTHROUGH_HTML_TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PassThroughHtmlImpl()
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
    return AtemPackage.Literals.PASS_THROUGH_HTML;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDsl_Passthrough_html_text()
  {
    return dsl_Passthrough_html_text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDsl_Passthrough_html_text(String newDsl_Passthrough_html_text)
  {
    String oldDsl_Passthrough_html_text = dsl_Passthrough_html_text;
    dsl_Passthrough_html_text = newDsl_Passthrough_html_text;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtemPackage.PASS_THROUGH_HTML__DSL_PASSTHROUGH_HTML_TEXT, oldDsl_Passthrough_html_text, dsl_Passthrough_html_text));
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
      case AtemPackage.PASS_THROUGH_HTML__DSL_PASSTHROUGH_HTML_TEXT:
        return getDsl_Passthrough_html_text();
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
      case AtemPackage.PASS_THROUGH_HTML__DSL_PASSTHROUGH_HTML_TEXT:
        setDsl_Passthrough_html_text((String)newValue);
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
      case AtemPackage.PASS_THROUGH_HTML__DSL_PASSTHROUGH_HTML_TEXT:
        setDsl_Passthrough_html_text(DSL_PASSTHROUGH_HTML_TEXT_EDEFAULT);
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
      case AtemPackage.PASS_THROUGH_HTML__DSL_PASSTHROUGH_HTML_TEXT:
        return DSL_PASSTHROUGH_HTML_TEXT_EDEFAULT == null ? dsl_Passthrough_html_text != null : !DSL_PASSTHROUGH_HTML_TEXT_EDEFAULT.equals(dsl_Passthrough_html_text);
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
    result.append(" (dsl_Passthrough_html_text: ");
    result.append(dsl_Passthrough_html_text);
    result.append(')');
    return result.toString();
  }

} //PassThroughHtmlImpl
