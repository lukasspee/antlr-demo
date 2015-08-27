// Generated from /vagrant/antlr/antlr-demo/src/antlr/Business.g4 by ANTLR 4.5

package parsers;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BusinessParser}.
 */
public interface BusinessListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BusinessParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(BusinessParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link BusinessParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(BusinessParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link BusinessParser#context}.
	 * @param ctx the parse tree
	 */
	void enterContext(BusinessParser.ContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BusinessParser#context}.
	 * @param ctx the parse tree
	 */
	void exitContext(BusinessParser.ContextContext ctx);
}
