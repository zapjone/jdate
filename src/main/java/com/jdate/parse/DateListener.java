// Generated from /opt/yarzlz/program/jdate/src/main/resources/Date.g4 by ANTLR 4.7.2
package com.jdate.parse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DateParser}.
 */
public interface DateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DateParser#jdate}.
	 * @param ctx the parse tree
	 */
	void enterJdate(DateParser.JdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#jdate}.
	 * @param ctx the parse tree
	 */
	void exitJdate(DateParser.JdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#pname}.
	 * @param ctx the parse tree
	 */
	void enterPname(DateParser.PnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#pname}.
	 * @param ctx the parse tree
	 */
	void exitPname(DateParser.PnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#indate}.
	 * @param ctx the parse tree
	 */
	void enterIndate(DateParser.IndateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#indate}.
	 * @param ctx the parse tree
	 */
	void exitIndate(DateParser.IndateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(DateParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(DateParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#opdate}.
	 * @param ctx the parse tree
	 */
	void enterOpdate(DateParser.OpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#opdate}.
	 * @param ctx the parse tree
	 */
	void exitOpdate(DateParser.OpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#cycle}.
	 * @param ctx the parse tree
	 */
	void enterCycle(DateParser.CycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#cycle}.
	 * @param ctx the parse tree
	 */
	void exitCycle(DateParser.CycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(DateParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(DateParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#spector}.
	 * @param ctx the parse tree
	 */
	void enterSpector(DateParser.SpectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#spector}.
	 * @param ctx the parse tree
	 */
	void exitSpector(DateParser.SpectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#formatval}.
	 * @param ctx the parse tree
	 */
	void enterFormatval(DateParser.FormatvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#formatval}.
	 * @param ctx the parse tree
	 */
	void exitFormatval(DateParser.FormatvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#yearformat}.
	 * @param ctx the parse tree
	 */
	void enterYearformat(DateParser.YearformatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#yearformat}.
	 * @param ctx the parse tree
	 */
	void exitYearformat(DateParser.YearformatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#monthformat}.
	 * @param ctx the parse tree
	 */
	void enterMonthformat(DateParser.MonthformatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#monthformat}.
	 * @param ctx the parse tree
	 */
	void exitMonthformat(DateParser.MonthformatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#dayformat}.
	 * @param ctx the parse tree
	 */
	void enterDayformat(DateParser.DayformatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#dayformat}.
	 * @param ctx the parse tree
	 */
	void exitDayformat(DateParser.DayformatContext ctx);
}