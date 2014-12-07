package org.eclipselabs.emf.ceson;

import java.math.BigDecimal;
import java.util.Stack;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emf.ceson.parser.CesonBaseListener;
import org.eclipselabs.emf.ceson.parser.CesonParser.ArrayContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.ContainmentContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.DefinitionContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.EnumLiteralContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.IntLiteralContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.ObjectLiteralContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.RealLiteralContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.RefContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.ReferenceContext;
import org.eclipselabs.emf.ceson.parser.CesonParser.StringLiteralContext;

public class CesonModelBuilder extends CesonBaseListener {

	private CesonSpecification specification;
	private CesonBuilder builder = new CesonBuilder();
	private Stack<Object> stack = new Stack<Object>();

	private final Object arrayStart = new Object();

	public CesonModelBuilder(String specificationName) {
		specification = (CesonSpecification) EcoreUtil
				.create(CesonPackage.Literals.CESON_SPECIFICATION);
		specification.setName(specificationName);
	}

	public CesonSpecification getSpecification() {
		return specification;
	}

	public Object getResult() {
		if (!stack.isEmpty()) {
			return stack.peek();
		} else {
			throw new IllegalStateException(
					"The stack is empty and no result can be provided");
		}
	}

	@Override
	public void exitIntLiteral(IntLiteralContext ctx) {
		int value = Integer.parseInt(ctx.getText());
		stack.push(builder.intValue(value));
	}

	@Override
	public void exitStringLiteral(StringLiteralContext ctx) {
		String text = ctx.getText();
		text = text.substring(1, text.length() - 1);
		stack.push(builder.stringValue(text));
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
		while (!stack.isEmpty() && stack.peek() != arrayStart) {
			Object element = stack.pop();
			if (element instanceof CesonValue) {
				value.getValue().add(((CesonValue) element));
			} else {
				throw new IllegalStateException(
						"Value expected on the stack. Got "
								+ element.getClass().getName() + " instead");
			}
		}
		if (stack.peek() == arrayStart) {
			stack.pop();
			stack.push(value);
		} else {
			throw new IllegalStateException("Unmatched array start marker.");
		}
	}

	@Override
	public void exitEnumLiteral(EnumLiteralContext ctx) {
		// TODO Auto-generated method stub
		super.exitEnumLiteral(ctx);
		int slot = ctx.getChild(0).getChildCount() - 1;
		String literalName = slot >= 0 ? ctx.getChild(0).getChild(slot--)
				.getText() : null;
		String enumTypeName = slot >= 0 ? ctx.getChild(0).getChild(slot--)
				.getText() : null;
		String packageName = slot >= 0 ? ctx.getChild(0).getChild(slot)
				.getText() : null;
		stack.push(builder.enumValue(packageName, enumTypeName, literalName));
	}

	@Override
	public void exitDefinition(DefinitionContext ctx) {
		String varName = ctx.getChild(0).getText();
		if (!stack.isEmpty()) {
			specification.getDefinitions().put(varName,
					(CesonValue) stack.pop());
		} else {
			throw new IllegalStateException(
					"stack should contain a value to map to the definition's name.");
		}
	}

	@Override
	public void exitRef(RefContext ctx) {
		stack.push(builder.ref(ctx.getText()));
	}

	@Override
	public void exitContainment(ContainmentContext ctx) {
		if (!stack.isEmpty() && stack.peek() instanceof CesonValue) {
			stack.push(createFeature(ctx.getChild(0).getText(),
					(CesonValue) stack.pop(), true));
		} else {
			throw new IllegalStateException("value expected on the stack.");
		}
	}

	@Override
	public void exitReference(ReferenceContext ctx) {
		if (!stack.isEmpty() && stack.peek() instanceof CesonValue) {
			stack.push(createFeature(ctx.getChild(0).getText(),
					(CesonValue) stack.pop(), false));
		} else {
			throw new IllegalStateException("value expected on the stack.");
		}
	}

	CFeature createFeature(String featureName, CesonValue value,
			boolean containment) {
		CFeature feature = (CFeature) EcoreUtil
				.create(CesonPackage.Literals.CFEATURE);
		feature.setName(featureName);
		feature.setValue(value);
		feature.setContainment(containment);
		return feature;
	}

	@Override
	public void exitObjectLiteral(ObjectLiteralContext ctx) {
		String className = null;
		int featureChildRank = 1;
		if (ctx.getChildCount() == 4) {
			className = ctx.getChild(0).getText();
			featureChildRank = 2;
		}
		int featureNumber = ctx.getChild(featureChildRank).getChildCount();
		for (int i = 0; i < featureNumber; i++) {

		}
	}
}
