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
package org.eclipselabs.emf.ceson;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emf.ceson.parser.CesonBaseListener;
import org.eclipselabs.emf.ceson.parser.CesonParser.ArrayContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.BooleanLiteralContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.ContainmentContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.DateLiteralContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.DefinitionContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.EnumLiteralContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.IntLiteralContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.ObjectContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.RealLiteralContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.RefContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.ReferenceContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.StringLiteralContext;

/**
 * Parser listener that builds the actual Ceson model from the strings.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 */
public class CesonModelBuilder extends CesonBaseListener {
	/**
	 * start index of year in dates literals.
	 */
	public static final int YEAR_START = 0;
	/**
	 * end index of year in dates literals.
	 */
	public static final int YEAR_END = 3;
	/**
	 * start index of month in dates literals.
	 */
	public static final int MONTH_START = 5;
	/**
	 * end index of month in dates literals.
	 */
	public static final int MONTH_END = 6;
	/**
	 * start index of day in dates literals.
	 */
	public static final int DAY_START = 8;
	/**
	 * end index of day in dates literals.
	 */
	public static final int DAY_END = 9;

	/**
	 * The produced {@link CSpecification} instance.
	 */
	private CSpecification specification;
	/**
	 * The model builder.
	 */
	private CesonBuilder builder = new CesonBuilder();
	/**
	 * The stack used to store temporary objects.
	 */
	private Stack<Object> stack = new Stack<Object>();
	/**
	 * The object used to mark start of array values in the stack.
	 */
	private final Object arrayStart = new Object();

	/**
	 * Creates a new {@link CesonModelBuilder} instance.
	 * 
	 * @param specificationName
	 *            the created specification name.
	 */
	public CesonModelBuilder(String specificationName) {
		specification = (CSpecification) EcoreUtil
				.create(CesonPackage.Literals.CSPECIFICATION);
		specification.setName(specificationName);
	}

	/**
	 * Returns the created {@link CSpecification} instance.
	 * 
	 * @return the created {@link CSpecification} instance.
	 */
	public CSpecification getSpecification() {
		return specification;
	}

	/**
	 * Return the last created object on the stack.
	 * 
	 * @return the last created object on the stack.
	 */
	public Object getResult() {
		if (!stack.isEmpty()) {
			return stack.peek();
		} else {
			return null;
		}
	}

	@Override
	public void exitIntLiteral(IntLiteralContext ctx) {
		int value = Integer.parseInt(ctx.getText());
		stack.push(builder.intValue(value));
	}

	@Override
	public void exitDateLiteral(DateLiteralContext ctx) {
		// Dates are like yyyy-MM-dd
		String dateStr = ctx.getText();
		// CHECKSTYLE:OFF
		int year = Integer
				.parseInt(dateStr.substring(YEAR_START, YEAR_END + 1));
		int month = Integer.parseInt(dateStr.substring(MONTH_START,
				MONTH_END + 1));
		int day = Integer.parseInt(dateStr.substring(DAY_START, DAY_END + 1));
		// CHECKSTYLE:ON
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);
		stack.push(builder.dateValue(calendar.getTime()));
	}

	@Override
	public void exitStringLiteral(StringLiteralContext ctx) {
		String text = ctx.getText();
		text = text.substring(1, text.length() - 1);
		stack.push(builder.stringValue(text));
	}

	@Override
	public void exitBooleanLiteral(BooleanLiteralContext ctx) {
		String text = ctx.getText();
		if ("true".equals(text)) {
			stack.push(builder.booleanValue(true));
		} else {
			stack.push(builder.booleanValue(false));
		}
	}

	@Override
	public void exitRealLiteral(RealLiteralContext ctx) {
		stack.push(builder.realValue(new BigDecimal(ctx.getText())));
	}

	// Array creation
	@Override
	public void enterArray(ArrayContext ctx) {
		stack.push(arrayStart);
	}

	@Override
	public void exitArray(ArrayContext ctx) {
		CArrayValue value = builder.arrayValue();
		List<CValue> values = new ArrayList<CValue>();
		while (!stack.isEmpty() && stack.peek() != arrayStart) {
			Object element = stack.pop();
			if (element instanceof CValue) {
				values.add((CValue) element);
			} else {
				throw new IllegalStateException(
						"Value expected on the stack. Got "
								+ element.getClass().getName() + " instead");
			}
		}
		if (stack.peek() == arrayStart) {
			stack.pop();
			for (int i = values.size() - 1; i >= 0; i--) {
				value.getValues().add(values.get(i));
			}
			stack.push(value);
		} else {
			throw new IllegalStateException("Unmatched array start marker.");
		}
	}

	@Override
	public void exitEnumLiteral(EnumLiteralContext ctx) {
		int slot = ctx.getChild(0).getChildCount() - 1;
		String literalName = slot >= 0 ? ctx.getChild(0).getChild(slot)
				.getText() : null;
		slot -= 2;
		String enumTypeName = slot >= 0 ? ctx.getChild(0).getChild(slot)
				.getText() : null;
		slot -= 2;
		String packageName = slot >= 0 ? ctx.getChild(0).getChild(slot)
				.getText() : null;
		stack.push(builder.enumValue(packageName, enumTypeName, literalName));
	}

	@Override
	public void exitDefinition(DefinitionContext ctx) {
		String varName = ctx.getChild(0).getText();
		if (!stack.isEmpty()) {
			specification.getDefinitions().put(varName, (CValue) stack.pop());
		} else {
			throw new IllegalStateException(
					"stack should contain a value to map to the definition's name.");
		}
		stack.push(varName);
	}

	@Override
	public void exitRef(RefContext ctx) {
		stack.push(builder.ref(ctx.getText()));
	}

	@Override
	public void exitContainment(ContainmentContext ctx) {
		if (!stack.isEmpty() && stack.peek() instanceof CValue) {
			stack.push(createFeature(ctx.getChild(0).getText(),
					(CValue) stack.pop(), true));
		} else {
			throw new IllegalStateException("value expected on the stack.");
		}
	}

	@Override
	public void exitReference(ReferenceContext ctx) {
		if (!stack.isEmpty() && stack.peek() instanceof CValue) {
			stack.push(createFeature(ctx.getChild(0).getText(),
					(CValue) stack.pop(), false));
		} else {
			throw new IllegalStateException("value expected on the stack.");
		}
	}

	/**
	 * Creates a new {@link CFeature} instance.
	 * 
	 * @param featureName
	 *            the feature's name
	 * @param value
	 *            the value
	 * @param containment
	 *            whether this is a containment feature
	 * @return the new {@link CFeature} instance.
	 */
	CFeature createFeature(String featureName, CValue value, boolean containment) {
		CFeature feature = (CFeature) EcoreUtil
				.create(CesonPackage.Literals.CFEATURE);
		feature.setName(featureName);
		feature.setValue(value);
		feature.setContainment(containment);
		return feature;
	}

	@Override
	public void enterObject(ObjectContext ctx) {
		CObjectValue result = builder.objectValue(null, Collections.EMPTY_LIST);
		stack.push(result);
	}

	@Override
	public void exitObject(ObjectContext ctx) {
		// pop all the features.
		Stack<CFeature> features = new Stack<CFeature>();
		while (!stack.isEmpty() && stack.peek() instanceof CFeature) {
			features.push((CFeature) stack.pop());
		}
		if (stack.peek() instanceof CObjectValue) {
			CObjectValue object = (CObjectValue) stack.peek();
			while (!features.isEmpty()) {
				object.getFeatures().add(features.pop());
			}
			if (ctx.getChildCount() == 4) {
				object.setClassName(ctx.getChild(0).getText());
			}
		} else {
			throw new IllegalStateException(
					"An object value should be present on the stack at this point.");
		}
	}

}
