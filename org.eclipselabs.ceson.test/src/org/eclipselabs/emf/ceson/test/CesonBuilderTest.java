/*******************************************************************************
 * Copyright (c) 2008, 2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.emf.ceson.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

// CHECKSTYLE:OFF
import java.math.BigDecimal;
// CHECKSTYLE:ON
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emf.ceson.CArrayValue;
import org.eclipselabs.emf.ceson.CEnumValue;
import org.eclipselabs.emf.ceson.CFeature;
import org.eclipselabs.emf.ceson.CIntValue;
import org.eclipselabs.emf.ceson.CObjectValue;
import org.eclipselabs.emf.ceson.CRealValue;
import org.eclipselabs.emf.ceson.CStringValue;
import org.eclipselabs.emf.ceson.CesonBuilder;
import org.eclipselabs.emf.ceson.CesonPackage;
import org.junit.Test;

/**
 * Unit tests of the {@link CesonBuilder} class.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 */
public class CesonBuilderTest {
	// CHECKSTYLE:OFF
	@Test
	public void intValueBuilderTest() {
		CesonBuilder builder = new CesonBuilder();
		CIntValue value = builder.intValue(10);
		assertNotNull(value);
		assertEquals(10, ((CIntValue)value).getValue());
	}

	@Test
	public void realValueBuilderTest() {
		CesonBuilder builder = new CesonBuilder();
		CRealValue value = builder.realValue(new BigDecimal(10.0));
		assertNotNull(value);
		assertEquals(new BigDecimal(10.0), ((CRealValue)value).getValue());
	}

	@Test
	public void stringValueBuilderTest() {
		CesonBuilder builder = new CesonBuilder();
		CStringValue value = builder.stringValue("string");
		assertNotNull(value);
		assertEquals("string", ((CStringValue)value).getValue());
	}

	@Test
	public void arrayValueBuilderTest() {
		CesonBuilder builder = new CesonBuilder();
		CArrayValue value = builder.arrayValue();
		assertNotNull(value);
		assertEquals(0, ((CArrayValue)value).getValues().size());
	}

	@Test
	public void arrayValueWithValuesBuilderTest() {
		CesonBuilder builder = new CesonBuilder();
		CArrayValue value = builder.arrayValue(builder.intValue(1), builder.intValue(2));
		assertNotNull(value);
		assertEquals(2, ((CArrayValue)value).getValues().size());
		assertTrue(EcoreUtil.equals(builder.intValue(1), ((CArrayValue)value).getValues().get(0)));
		assertTrue(EcoreUtil.equals(builder.intValue(2), ((CArrayValue)value).getValues().get(1)));
	}

	@Test
	public void enumValueBuilderTest() {
		CEnumValue value = new CesonBuilder().enumValue("package", "ValueKind", "INT");
		assertNotNull(value);
		assertEquals("package", value.getPackageName());
		assertEquals("ValueKind", value.getEnumTypeName());
		assertEquals("INT", value.getLiteralName());
	}

	@Test
	public void objectValueTest() {
		List<CFeature> features = new ArrayList<CFeature>();
		CFeature feature = (CFeature)EcoreUtil.create(CesonPackage.Literals.CFEATURE);
		feature.setName("feature1");
		feature.setValue(new CesonBuilder().intValue(10));
		features.add(feature);
		feature = (CFeature)EcoreUtil.create(CesonPackage.Literals.CFEATURE);
		feature.setName("feature2");
		feature.setValue(new CesonBuilder().intValue(20));
		features.add(feature);
		feature = (CFeature)EcoreUtil.create(CesonPackage.Literals.CFEATURE);
		feature.setName("feature3");
		feature.setValue(new CesonBuilder().intValue(30));
		features.add(feature);
		CObjectValue value = new CesonBuilder().objectValue("mypackage.MyClass", features);
		assertNotNull(value);
		assertEquals("mypackage.MyClass", value.getClassName());
		features = value.getFeatures();
		assertEquals(3, features.size());
		assertEquals("feature1", features.get(0).getName());
		assertEquals("feature2", features.get(1).getName());
		assertEquals("feature3", features.get(2).getName());
	}
	// CHECKSTYLE:OFF
}
