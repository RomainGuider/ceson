package org.eclipselabs.ceson.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emf.ceson.CArrayValue;
import org.eclipselabs.emf.ceson.CEnumValue;
import org.eclipselabs.emf.ceson.CFeature;
import org.eclipselabs.emf.ceson.CesonBuilder;
import org.eclipselabs.emf.ceson.CesonIntValue;
import org.eclipselabs.emf.ceson.CesonObjectValue;
import org.eclipselabs.emf.ceson.CesonPackage;
import org.eclipselabs.emf.ceson.CesonRealValue;
import org.eclipselabs.emf.ceson.CesonStringValue;
import org.junit.Test;

public class CesonBuilderTest {

	public CesonBuilderTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void intValueBuilderTest() {
		CesonBuilder builder = new CesonBuilder();
		CesonIntValue value = builder.intValue(10);
		assertNotNull(value);
		assertEquals(10, ((CesonIntValue) value).getValue());
	}

	@Test
	public void realValueBuilderTest() {
		CesonBuilder builder = new CesonBuilder();
		CesonRealValue value = builder.realValue(new BigDecimal(10.0));
		assertNotNull(value);
		assertEquals(new BigDecimal(10.0), ((CesonRealValue) value).getValue());
	}

	@Test
	public void stringValueBuilderTest() {
		CesonBuilder builder = new CesonBuilder();
		CesonStringValue value = builder.stringValue("string");
		assertNotNull(value);
		assertEquals("string", ((CesonStringValue) value).getValue());
	}

	@Test
	public void arrayValueBuilderTest() {
		CesonBuilder builder = new CesonBuilder();
		CArrayValue value = builder.arrayValue();
		assertNotNull(value);
		assertEquals(0, ((CArrayValue) value).getValue().size());
	}

	@Test
	public void enumValueBuilderTest() {
		CEnumValue value = new CesonBuilder().enumValue("package", "ValueKind",
				"INT");
		assertNotNull(value);
		assertEquals("package", value.getPackageName());
		assertEquals("ValueKind", value.getEnumTypeName());
		assertEquals("INT", value.getLiteralName());
	}

	@Test
	public void objectValueTest() {
		List<CFeature> features = new ArrayList<CFeature>();
		CFeature feature = (CFeature) EcoreUtil
				.create(CesonPackage.Literals.CFEATURE);
		feature.setName("feature1");
		feature.setValue(new CesonBuilder().intValue(10));
		features.add(feature);
		feature = (CFeature) EcoreUtil.create(CesonPackage.Literals.CFEATURE);
		feature.setName("feature2");
		feature.setValue(new CesonBuilder().intValue(20));
		features.add(feature);
		feature = (CFeature) EcoreUtil.create(CesonPackage.Literals.CFEATURE);
		feature.setName("feature3");
		feature.setValue(new CesonBuilder().intValue(30));
		features.add(feature);
		CesonObjectValue value = new CesonBuilder().objectValue(
				"mypackage.MyClass", features);
		assertNotNull(value);
		assertEquals("mypackage.MyClass", value.getClassName());
		features = value.getFeatures();
		assertEquals(3, features.size());
		assertEquals("feature1", features.get(0).getName());
		assertEquals("feature2", features.get(1).getName());
		assertEquals("feature3", features.get(2).getName());
	}
}
