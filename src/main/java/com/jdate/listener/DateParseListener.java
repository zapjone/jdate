package com.jdate.listener;

import com.jdate.parse.DateBaseListener;
import com.jdate.parse.DateParser;

import java.util.Date;

/**
 * 解析date字符串
 *
 * @author zap
 * @version 1.0, 2020/01/18
 */
public class DateParseListener extends DateBaseListener {

    private Date date;

    @Override
    public void enterJdate(DateParser.JdateContext ctx) {
        this.date = new Date();
    }

    @Override
    public void enterOpdate(DateParser.OpdateContext ctx) {
        // 基于当前时间进行修改，或者直接进行设置
        System.out.println(ctx.NUMBER());
        System.out.println(ctx.cycle().getText());
        System.out.println(ctx.AGO());
    }


    @Override
    public void enterFormat(DateParser.FormatContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void enterYearformat(DateParser.YearformatContext ctx) {
        System.out.println(ctx.getText());
    }

    public String display() {
        return this.date.toString();
    }


}
