package org.eclipselabs.emf.ceson.parser.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipselabs.emf.ceson.CArrayValue;
import org.eclipselabs.emf.ceson.CBooleanValue;
import org.eclipselabs.emf.ceson.CEnumValue;
import org.eclipselabs.emf.ceson.CFeature;
import org.eclipselabs.emf.ceson.CIntValue;
import org.eclipselabs.emf.ceson.CObjectValue;
import org.eclipselabs.emf.ceson.CRealValue;
import org.eclipselabs.emf.ceson.CReference;
import org.eclipselabs.emf.ceson.CSpecification;
import org.eclipselabs.emf.ceson.CStringValue;
import org.eclipselabs.emf.ceson.CesonBuilder;
import org.eclipselabs.emf.ceson.CesonPackage;
import org.eclipselabs.emf.ceson.EcoreGenerator;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class EcoreGeneratorTest {

	SortedMap<String, EPackage> ePackages = new TreeMap<String, EPackage>();
	ResourceSet resourceSet;
	Resource resource;

	@Before
	public void setup() {
		ePackages.put("ceson", CesonPackage.eINSTANCE);
		ePackages.put("ecore", EcorePackage.eINSTANCE);
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ceson", new XMIResourceFactoryImpl());
		resource = resourceSet.createResource(URI.createURI("test.ceson"));
	}

	public EcoreGeneratorTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testEEnumCompleteLookup() {
		EcoreGenerator generator = new EcoreGenerator(ePackages, resource,
				Collections.EMPTY_MAP);
		CEnumValue value = (CEnumValue) EcoreUtil
				.create(CesonPackage.Literals.CENUM_VALUE);
		value.setPackageName("other");
		value.setEnumTypeName("Type");
		value.setLiteralName("INT");
		EPackage pack = (EPackage) EcoreUtil
				.create(EcorePackage.Literals.EPACKAGE);
		pack.setName("other");
		EEnum eenum = (EEnum) EcoreUtil.create(EcorePackage.Literals.EENUM);
		eenum.setName("Type");
		EEnumLiteral literal = (EEnumLiteral) EcoreUtil
				.create(EcorePackage.Literals.EENUM_LITERAL);
		literal.setName("INT");
		eenum.getELiterals().add(literal);
		pack.getEClassifiers().add(eenum);
		ePackages.put("other", pack);
		Object result = generator.doSwitch(value);
		assertEquals(literal.getInstance(), result);
	}

	@Test
	public void testEEnumSemiCompleteLookup() {
		EcoreGenerator generator = new EcoreGenerator(ePackages, resource,
				Collections.EMPTY_MAP);
		CEnumValue value = (CEnumValue) EcoreUtil
				.create(CesonPackage.Literals.CENUM_VALUE);
		value.setEnumTypeName("Type");
		value.setLiteralName("INT");
		EPackage pack = (EPackage) EcoreUtil
				.create(EcorePackage.Literals.EPACKAGE);
		pack.setName("other");
		EEnum eenum = (EEnum) EcoreUtil.create(EcorePackage.Literals.EENUM);
		eenum.setName("Type");
		EEnumLiteral literal = (EEnumLiteral) EcoreUtil
				.create(EcorePackage.Literals.EENUM_LITERAL);
		literal.setName("INT");
		eenum.getELiterals().add(literal);
		pack.getEClassifiers().add(eenum);
		ePackages.put("other", pack);
		Object result = generator.doSwitch(value);
		assertEquals(literal.getInstance(), result);
	}

	@Test
	public void eEnuminompleteLookupTest() {
		EcoreGenerator generator = new EcoreGenerator(ePackages, resource,
				Collections.EMPTY_MAP);
		CEnumValue value = (CEnumValue) EcoreUtil
				.create(CesonPackage.Literals.CENUM_VALUE);
		value.setLiteralName("INT");
		EPackage pack = (EPackage) EcoreUtil
				.create(EcorePackage.Literals.EPACKAGE);
		pack.setName("other");
		EEnum eenum = (EEnum) EcoreUtil.create(EcorePackage.Literals.EENUM);
		eenum.setName("Type");
		EEnumLiteral literal = (EEnumLiteral) EcoreUtil
				.create(EcorePackage.Literals.EENUM_LITERAL);
		literal.setName("INT");
		eenum.getELiterals().add(literal);
		pack.getEClassifiers().add(eenum);
		ePackages.put("other", pack);
		Object result = generator.doSwitch(value);
		assertEquals(CesonPackage.Literals.CTYPE.getEEnumLiteral("INT"), result);
	}

	@Test
	public void stringValueTest() {
		CStringValue value = (CStringValue) EcoreUtil
				.create(CesonPackage.Literals.CSTRING_VALUE);
		value.setValue("string");
		assertEquals("string", new EcoreGenerator(ePackages, resource,
				Collections.EMPTY_MAP).doSwitch(value));
	}

	@Test
	public void intValueTest() {
		CIntValue value = (CIntValue) EcoreUtil
				.create(CesonPackage.Literals.CINT_VALUE);
		value.setValue(10);
		assertEquals(10, new EcoreGenerator(ePackages, resource,
				Collections.EMPTY_MAP).doSwitch(value));
	}

	@Test
	public void realValueTest() {
		CRealValue value = (CRealValue) EcoreUtil
				.create(CesonPackage.Literals.CREAL_VALUE);
		value.setValue(new BigDecimal("10.10"));
		assertEquals(new BigDecimal("10.10"), new EcoreGenerator(ePackages,
				resource, Collections.EMPTY_MAP).doSwitch(value));
	}

	@Test
	public void booleanValueTest() {
		CBooleanValue value = (CBooleanValue) EcoreUtil
				.create(CesonPackage.Literals.CBOOLEAN_VALUE);
		value.setValue(true);
		assertEquals(new Boolean(true), new EcoreGenerator(ePackages, resource,
				Collections.EMPTY_MAP).doSwitch(value));
		value.setValue(false);
		assertEquals(new Boolean(false), new EcoreGenerator(ePackages,
				resource, Collections.EMPTY_MAP).doSwitch(value));
	}

	@Test
	public void arrayValueTest() {
		CArrayValue arrayValue = (CArrayValue) EcoreUtil
				.create(CesonPackage.Literals.CARRAY_VALUE);
		CStringValue value1 = (CStringValue) EcoreUtil
				.create(CesonPackage.Literals.CSTRING_VALUE);
		value1.setValue("value1");
		CStringValue value2 = (CStringValue) EcoreUtil
				.create(CesonPackage.Literals.CSTRING_VALUE);
		value2.setValue("value2");
		arrayValue.getValues().add(value1);
		arrayValue.getValues().add(value2);
		List<Object> result = (List<Object>) new EcoreGenerator(ePackages,
				resource, Collections.EMPTY_MAP).doSwitch(arrayValue);
		assertEquals(2, result.size());
		assertEquals("value1", result.get(0));
		assertEquals("value2", result.get(1));
	}

	@Test
	public void referenceTest() {
		Map<String, Object> definitions = Maps.newHashMap();
		definitions.put("var", "value");
		CReference ref = (CReference) EcoreUtil
				.create(CesonPackage.Literals.CREFERENCE);
		ref.setVarName("var");
		assertEquals("value", new EcoreGenerator(ePackages, resource,
				definitions).doSwitch(ref));
	}

	/**
	 * Tests that an object specification without a class name results in the
	 * right eClass.
	 */
	@Test
	public void objectTest1() {
		CesonBuilder builder = new CesonBuilder();
		List<CFeature> features = new ArrayList<CFeature>();
		features.add(builder.feature("varName", builder.stringValue("var")));
		CObjectValue obj = builder.objectValue(null, features);
		EcoreGenerator gen = new EcoreGenerator(ePackages, resource,
				Collections.EMPTY_MAP);
		EObject result = (EObject) gen.doSwitch(obj);
		assertEquals(CesonPackage.Literals.CREFERENCE, result.eClass());
		assertEquals("var", ((CReference) result).getVarName());
	}

	/**
	 * Tests that an object specification without feature specification but a
	 * fully qualified class name results in the right class Name.
	 */
	@Test
	public void objectTest2() {
		CesonBuilder builder = new CesonBuilder();
		CObjectValue obj = builder.objectValue("ceson.CReference",
				Collections.EMPTY_LIST);
		EcoreGenerator gen = new EcoreGenerator(ePackages, resource,
				Collections.EMPTY_MAP);
		EObject result = (EObject) gen.doSwitch(obj);
		assertEquals(CesonPackage.Literals.CREFERENCE, result.eClass());
	}

	/**
	 * Tests that an object specification without feature specification but a
	 * class name results in the right class Name.
	 */
	@Test
	public void objectTest3() {
		CesonBuilder builder = new CesonBuilder();
		CObjectValue obj = builder.objectValue("CReference",
				Collections.EMPTY_LIST);
		EcoreGenerator gen = new EcoreGenerator(ePackages, resource,
				Collections.EMPTY_MAP);
		EObject result = (EObject) gen.doSwitch(obj);
		assertEquals(CesonPackage.Literals.CREFERENCE, result.eClass());
	}

	/**
	 * Tests an object creation with class name and setting a multi-valued
	 * feature.
	 */
	@Test
	public void objectTest4() {
		CesonBuilder builder = new CesonBuilder();
		List<CFeature> features1 = new ArrayList<CFeature>();
		features1.add(builder.feature("name", builder.stringValue("feature1")));
		CObjectValue f1 = builder.objectValue("CFeature", features1);
		List<CFeature> features2 = new ArrayList<CFeature>();
		features2.add(builder.feature("name", builder.stringValue("feature2")));
		CObjectValue f2 = builder.objectValue("CFeature", features2);
		List<CFeature> features = Lists.newArrayList(builder.feature(
				"features", builder.arrayValue(f1, f2)));
		CObjectValue obj = builder.objectValue("CObjectValue", features);

		EcoreGenerator gen = new EcoreGenerator(ePackages, resource,
				Collections.EMPTY_MAP);

		EObject result = (EObject) gen.doSwitch(obj);
		assertEquals(CesonPackage.Literals.COBJECT_VALUE, result.eClass());
		CObjectValue objResult = (CObjectValue) result;
		assertEquals(2, objResult.getFeatures().size());
		assertEquals("feature1", objResult.getFeatures().get(0).getName());
		assertEquals("feature2", objResult.getFeatures().get(1).getName());
	}

	/**
	 * Tests an object creation without class name setting a multi-valued
	 * feature.
	 */
	@Test
	public void objectTest5() {
		CesonBuilder builder = new CesonBuilder();
		List<CFeature> features1 = new ArrayList<CFeature>();
		features1.add(builder.feature("name", builder.stringValue("feature1")));
		CObjectValue f1 = builder.objectValue("CFeature", features1);
		List<CFeature> features2 = new ArrayList<CFeature>();
		features2.add(builder.feature("name", builder.stringValue("feature2")));
		CObjectValue f2 = builder.objectValue("CFeature", features2);
		List<CFeature> features = Lists.newArrayList(builder.feature(
				"features", builder.arrayValue(f1, f2)));
		CObjectValue obj = builder.objectValue(null, features);

		EcoreGenerator gen = new EcoreGenerator(ePackages, resource,
				Collections.EMPTY_MAP);

		EObject result = (EObject) gen.doSwitch(obj);
		assertNotNull(result);
		assertEquals(CesonPackage.Literals.COBJECT_VALUE, result.eClass());
		CObjectValue objResult = (CObjectValue) result;
		assertEquals(2, objResult.getFeatures().size());
		assertEquals("feature1", objResult.getFeatures().get(0).getName());
		assertEquals("feature2", objResult.getFeatures().get(1).getName());
	}

	@Test
	public void testCSpecification() {
		CSpecification spec = (CSpecification) EcoreUtil
				.create(CesonPackage.Literals.CSPECIFICATION);
		CesonBuilder builder = new CesonBuilder();
		spec.getDefinitions().put("var1", builder.intValue(10));
		spec.getDefinitions().put("var2", builder.intValue(20));
		EcoreGenerator gen = new EcoreGenerator(ePackages, resource,
				new HashMap<String, Object>());
		EObject result = (EObject) gen.doSwitch(spec);
		assertEquals(10, gen.getVar("var1"));
		assertEquals(20, gen.getVar("var2"));
	}
}
