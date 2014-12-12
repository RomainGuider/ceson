package org.eclipselabs.emf.ceson;

import java.math.BigDecimal;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

public class CesonBuilder {

	public CesonBuilder() {
		// TODO Auto-generated constructor stub
	}

	public CIntValue intValue(int value) {
		CIntValue result = (CIntValue) EcoreUtil
				.create(CesonPackage.Literals.CINT_VALUE);
		result.setValue(value);
		return result;
	}

	public CRealValue realValue(BigDecimal value) {
		CRealValue result = (CRealValue) EcoreUtil
				.create(CesonPackage.Literals.CREAL_VALUE);
		result.setValue(value);
		return result;
	}

	public CStringValue stringValue(String value) {
		CStringValue result = (CStringValue) EcoreUtil
				.create(CesonPackage.Literals.CSTRING_VALUE);
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

	public CObjectValue objectValue(String className, List<CFeature> features) {
		CObjectValue result = (CObjectValue) EcoreUtil
				.create(CesonPackage.Literals.COBJECT_VALUE);
		result.setClassName(className);
		result.getFeatures().addAll(features);
		return result;
	}
}
