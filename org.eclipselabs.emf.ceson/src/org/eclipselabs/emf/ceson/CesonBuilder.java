package org.eclipselabs.emf.ceson;

import java.math.BigDecimal;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

public class CesonBuilder {

	public CesonBuilder() {
		// TODO Auto-generated constructor stub
	}

	public CesonIntValue intValue(int value) {
		CesonIntValue result = (CesonIntValue) EcoreUtil
				.create(CesonPackage.Literals.CESON_INT_VALUE);
		result.setValue(value);
		return result;
	}

	public CesonRealValue realValue(BigDecimal value) {
		CesonRealValue result = (CesonRealValue) EcoreUtil
				.create(CesonPackage.Literals.CESON_REAL_VALUE);
		result.setValue(value);
		return result;
	}

	public CesonStringValue stringValue(String value) {
		CesonStringValue result = (CesonStringValue) EcoreUtil
				.create(CesonPackage.Literals.CESON_STRING_VALUE);
		result.setValue(value);
		return result;
	}

	public CArrayValue arrayValue() {
		return (CArrayValue) EcoreUtil
				.create(CesonPackage.Literals.CARRAY_VALUE);
	}

	public CEnumValue enumValue(String packageName, String enumName,
			String literalName) {
		CEnumValue result = (CEnumValue) EcoreUtil
				.create(CesonPackage.Literals.CENUM_VALUE);
		if (packageName != null) {
			result.setPackageName(packageName);
		}
		if (enumName != null) {
			result.setEnumTypeName(enumName);
		}
		if (literalName != null) {
			result.setLiteralName(literalName);
		}
		return result;
	}

	public Object ref(String varName) {
		CReference ref = (CReference) EcoreUtil
				.create(CesonPackage.Literals.CREFERENCE);
		ref.setVarName(varName);
		return ref;
	}

	public CesonObjectValue objectValue(String className,
			List<CFeature> features) {
		CesonObjectValue result = (CesonObjectValue) EcoreUtil
				.create(CesonPackage.Literals.CESON_OBJECT_VALUE);
		result.setClassName(className);
		result.getFeatures().addAll(features);
		return result;
	}
}
