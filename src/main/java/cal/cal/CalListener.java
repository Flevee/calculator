// Generated from D:/Te/AnCal/src/main/java/cal\Cal.g4 by ANTLR 4.12.0
package cal.cal;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalParser}.
 */
public interface CalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CalParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CalParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(CalParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(CalParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CalParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CalParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMuldiv(CalParser.MuldivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMuldiv(CalParser.MuldivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link CalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CalParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link CalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CalParser.PrintContext ctx);
}