/**
 */
package net.ages.workbench.resources.dsl.ares;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.ages.workbench.resources.dsl.ares.AresFactory
 * @model kind="package"
 * @generated
 */
public interface AresPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ares";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ages.net/workbench/resources/dsl/Ares";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ares";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AresPackage eINSTANCE = net.ages.workbench.resources.dsl.ares.impl.AresPackageImpl.init();

  /**
   * The meta object id for the '{@link net.ages.workbench.resources.dsl.ares.impl.AresModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.resources.dsl.ares.impl.AresModelImpl
   * @see net.ages.workbench.resources.dsl.ares.impl.AresPackageImpl#getAresModel()
   * @generated
   */
  int ARES_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARES_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Dsl Model definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARES_MODEL__DSL_MODEL_DEFINITIONS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARES_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.ages.workbench.resources.dsl.ares.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ages.workbench.resources.dsl.ares.impl.DefinitionImpl
   * @see net.ages.workbench.resources.dsl.ares.impl.AresPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Dsl Definition Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__DSL_DEFINITION_TEXT = 1;

  /**
   * The feature id for the '<em><b>Dsl Definition Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__DSL_DEFINITION_REF = 2;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link net.ages.workbench.resources.dsl.ares.AresModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see net.ages.workbench.resources.dsl.ares.AresModel
   * @generated
   */
  EClass getAresModel();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.resources.dsl.ares.AresModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.ages.workbench.resources.dsl.ares.AresModel#getName()
   * @see #getAresModel()
   * @generated
   */
  EAttribute getAresModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.ages.workbench.resources.dsl.ares.AresModel#getDsl_Model_definitions <em>Dsl Model definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl Model definitions</em>'.
   * @see net.ages.workbench.resources.dsl.ares.AresModel#getDsl_Model_definitions()
   * @see #getAresModel()
   * @generated
   */
  EReference getAresModel_Dsl_Model_definitions();

  /**
   * Returns the meta object for class '{@link net.ages.workbench.resources.dsl.ares.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see net.ages.workbench.resources.dsl.ares.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.resources.dsl.ares.Definition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.ages.workbench.resources.dsl.ares.Definition#getName()
   * @see #getDefinition()
   * @generated
   */
  EAttribute getDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link net.ages.workbench.resources.dsl.ares.Definition#getDsl_Definition_Text <em>Dsl Definition Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Definition Text</em>'.
   * @see net.ages.workbench.resources.dsl.ares.Definition#getDsl_Definition_Text()
   * @see #getDefinition()
   * @generated
   */
  EAttribute getDefinition_Dsl_Definition_Text();

  /**
   * Returns the meta object for the reference '{@link net.ages.workbench.resources.dsl.ares.Definition#getDsl_Definition_Ref <em>Dsl Definition Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl Definition Ref</em>'.
   * @see net.ages.workbench.resources.dsl.ares.Definition#getDsl_Definition_Ref()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Dsl_Definition_Ref();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AresFactory getAresFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.ages.workbench.resources.dsl.ares.impl.AresModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.resources.dsl.ares.impl.AresModelImpl
     * @see net.ages.workbench.resources.dsl.ares.impl.AresPackageImpl#getAresModel()
     * @generated
     */
    EClass ARES_MODEL = eINSTANCE.getAresModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARES_MODEL__NAME = eINSTANCE.getAresModel_Name();

    /**
     * The meta object literal for the '<em><b>Dsl Model definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARES_MODEL__DSL_MODEL_DEFINITIONS = eINSTANCE.getAresModel_Dsl_Model_definitions();

    /**
     * The meta object literal for the '{@link net.ages.workbench.resources.dsl.ares.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ages.workbench.resources.dsl.ares.impl.DefinitionImpl
     * @see net.ages.workbench.resources.dsl.ares.impl.AresPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__NAME = eINSTANCE.getDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Dsl Definition Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__DSL_DEFINITION_TEXT = eINSTANCE.getDefinition_Dsl_Definition_Text();

    /**
     * The meta object literal for the '<em><b>Dsl Definition Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__DSL_DEFINITION_REF = eINSTANCE.getDefinition_Dsl_Definition_Ref();

  }

} //AresPackage
