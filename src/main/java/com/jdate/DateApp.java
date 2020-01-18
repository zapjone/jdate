package com.jdate;

import com.jdate.listener.DateParseListener;
import com.jdate.parse.DateBaseListener;
import com.jdate.parse.DateLexer;
import com.jdate.parse.DateParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * 解析date时间
 *
 * @author zap
 * @version 1.0, 2020/01/18
 */
public class DateApp {

    public static void main(String[] args) {

        String sentence = "date -d '10 day ago' +%Y-%m-%d";

        DateLexer dateLexer = new DateLexer(CharStreams.fromString(sentence));

        CommonTokenStream tokenStream = new CommonTokenStream(dateLexer);

        DateParser parser = new DateParser(tokenStream);
        DateParser.JdateContext tree = parser.jdate();

        // 添加监听器
        ParseTreeWalker walker = new ParseTreeWalker();
        DateParseListener listener = new DateParseListener();
        walker.walk(listener, tree);

        System.out.println(listener.display());

    }

}
