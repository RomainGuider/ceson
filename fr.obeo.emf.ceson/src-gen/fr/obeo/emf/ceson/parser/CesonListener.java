// Generated from Ceson.g4 by ANTLR 4.3
package fr.obeo.emf.ceson.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CesonParser}.
 */
public interface CesonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(@NotNull CesonParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(@NotNull CesonParser.ObjectLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(@NotNull CesonParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(@NotNull CesonParser.DateLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull CesonParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull CesonParser.BooleanLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Reference}
	 * labeled alternative in {@link CesonParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterReference(@NotNull CesonParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Reference}
	 * labeled alternative in {@link CesonParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitReference(@NotNull CesonParser.ReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link CesonParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(@NotNull CesonParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(@NotNull CesonParser.ClassNameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(@NotNull CesonParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(@NotNull CesonParser.ArrayLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link CesonParser#featureList}.
	 * @param ctx the parse tree
	 */
	void enterFeatureList(@NotNull CesonParser.FeatureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#featureList}.
	 * @param ctx the parse tree
	 */
	void exitFeatureList(@NotNull CesonParser.FeatureListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code RealLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterRealLiteral(@NotNull CesonParser.RealLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitRealLiteral(@NotNull CesonParser.RealLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Ref}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterRef(@NotNull CesonParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ref}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitRef(@NotNull CesonParser.RefContext ctx);

	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(@NotNull CesonParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(@NotNull CesonParser.StringLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link CesonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull CesonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull CesonParser.ArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link CesonParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(@NotNull CesonParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(@NotNull CesonParser.ModelContext ctx);

	/**
	 * Enter a parse tree produced by {@link CesonParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(@NotNull CesonParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(@NotNull CesonParser.DefinitionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(@NotNull CesonParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(@NotNull CesonParser.IntLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code EnumLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterEnumLiteral(@NotNull CesonParser.EnumLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitEnumLiteral(@NotNull CesonParser.EnumLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link CesonParser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(@NotNull CesonParser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(@NotNull CesonParser.EnumNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CesonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull CesonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull CesonParser.ObjectContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Containment}
	 * labeled alternative in {@link CesonParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterContainment(@NotNull CesonParser.ContainmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Containment}
	 * labeled alternative in {@link CesonParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitContainment(@NotNull CesonParser.ContainmentContext ctx);
}