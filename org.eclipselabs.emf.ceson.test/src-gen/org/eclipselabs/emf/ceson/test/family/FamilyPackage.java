/**
 */
package org.eclipselabs.emf.ceson.test.family;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.emf.ceson.test.family.FamilyFactory
 * @model kind="package"
 * @generated
 */
public interface FamilyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "family";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://family/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "family";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FamilyPackage eINSTANCE = org.eclipselabs.emf.ceson.test.family.impl.FamilyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.test.family.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.test.family.impl.PersonImpl
	 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LASTNAME = 1;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTHDATE = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.test.family.impl.ParentImpl <em>Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.test.family.impl.ParentImpl
	 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyPackageImpl#getParent()
	 * @generated
	 */
	int PARENT = 1;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__FIRSTNAME = PERSON__FIRSTNAME;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__LASTNAME = PERSON__LASTNAME;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__BIRTHDATE = PERSON__BIRTHDATE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__CHILDREN = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.test.family.impl.MotherImpl <em>Mother</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.test.family.impl.MotherImpl
	 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyPackageImpl#getMother()
	 * @generated
	 */
	int MOTHER = 2;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER__FIRSTNAME = PARENT__FIRSTNAME;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER__LASTNAME = PARENT__LASTNAME;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER__BIRTHDATE = PARENT__BIRTHDATE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER__CHILDREN = PARENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Husband</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER__HUSBAND = PARENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mother</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_FEATURE_COUNT = PARENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mother</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OPERATION_COUNT = PARENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.test.family.impl.FatherImpl <em>Father</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.test.family.impl.FatherImpl
	 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyPackageImpl#getFather()
	 * @generated
	 */
	int FATHER = 3;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER__FIRSTNAME = PARENT__FIRSTNAME;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER__LASTNAME = PARENT__LASTNAME;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER__BIRTHDATE = PARENT__BIRTHDATE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER__CHILDREN = PARENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Wife</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER__WIFE = PARENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Father</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_FEATURE_COUNT = PARENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Father</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OPERATION_COUNT = PARENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.test.family.impl.ChildImpl <em>Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.test.family.impl.ChildImpl
	 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyPackageImpl#getChild()
	 * @generated
	 */
	int CHILD = 4;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__FIRSTNAME = PERSON__FIRSTNAME;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__LASTNAME = PERSON__LASTNAME;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__BIRTHDATE = PERSON__BIRTHDATE;

	/**
	 * The feature id for the '<em><b>Mother</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__MOTHER = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__FATHER = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.test.family.impl.FamilyImpl <em>Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyImpl
	 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyPackageImpl#getFamily()
	 * @generated
	 */
	int FAMILY = 5;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__MEMBERS = 0;

	/**
	 * The number of structural features of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.test.family.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.test.family.Person#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Person#getFirstname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.test.family.Person#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Person#getLastname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.test.family.Person#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Person#getBirthdate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Birthdate();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.test.family.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Parent
	 * @generated
	 */
	EClass getParent();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.emf.ceson.test.family.Parent#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Parent#getChildren()
	 * @see #getParent()
	 * @generated
	 */
	EReference getParent_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.test.family.Mother <em>Mother</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mother</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Mother
	 * @generated
	 */
	EClass getMother();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emf.ceson.test.family.Mother#getHusband <em>Husband</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Husband</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Mother#getHusband()
	 * @see #getMother()
	 * @generated
	 */
	EReference getMother_Husband();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.test.family.Father <em>Father</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Father</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Father
	 * @generated
	 */
	EClass getFather();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emf.ceson.test.family.Father#getWife <em>Wife</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wife</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Father#getWife()
	 * @see #getFather()
	 * @generated
	 */
	EReference getFather_Wife();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.test.family.Child <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Child
	 * @generated
	 */
	EClass getChild();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emf.ceson.test.family.Child#getMother <em>Mother</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mother</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Child#getMother()
	 * @see #getChild()
	 * @generated
	 */
	EReference getChild_Mother();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emf.ceson.test.family.Child#getFather <em>Father</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Father</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Child#getFather()
	 * @see #getChild()
	 * @generated
	 */
	EReference getChild_Father();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.test.family.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Family
	 * @generated
	 */
	EClass getFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.ceson.test.family.Family#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.eclipselabs.emf.ceson.test.family.Family#getMembers()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Members();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FamilyFactory getFamilyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.test.family.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.test.family.impl.PersonImpl
		 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRSTNAME = eINSTANCE.getPerson_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LASTNAME = eINSTANCE.getPerson_Lastname();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTHDATE = eINSTANCE.getPerson_Birthdate();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.test.family.impl.ParentImpl <em>Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.test.family.impl.ParentImpl
		 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyPackageImpl#getParent()
		 * @generated
		 */
		EClass PARENT = eINSTANCE.getParent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT__CHILDREN = eINSTANCE.getParent_Children();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.test.family.impl.MotherImpl <em>Mother</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.test.family.impl.MotherImpl
		 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyPackageImpl#getMother()
		 * @generated
		 */
		EClass MOTHER = eINSTANCE.getMother();

		/**
		 * The meta object literal for the '<em><b>Husband</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTHER__HUSBAND = eINSTANCE.getMother_Husband();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.test.family.impl.FatherImpl <em>Father</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.test.family.impl.FatherImpl
		 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyPackageImpl#getFather()
		 * @generated
		 */
		EClass FATHER = eINSTANCE.getFather();

		/**
		 * The meta object literal for the '<em><b>Wife</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FATHER__WIFE = eINSTANCE.getFather_Wife();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.test.family.impl.ChildImpl <em>Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.test.family.impl.ChildImpl
		 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyPackageImpl#getChild()
		 * @generated
		 */
		EClass CHILD = eINSTANCE.getChild();

		/**
		 * The meta object literal for the '<em><b>Mother</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD__MOTHER = eINSTANCE.getChild_Mother();

		/**
		 * The meta object literal for the '<em><b>Father</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD__FATHER = eINSTANCE.getChild_Father();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.test.family.impl.FamilyImpl <em>Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyImpl
		 * @see org.eclipselabs.emf.ceson.test.family.impl.FamilyPackageImpl#getFamily()
		 * @generated
		 */
		EClass FAMILY = eINSTANCE.getFamily();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__MEMBERS = eINSTANCE.getFamily_Members();

	}

} //FamilyPackage
