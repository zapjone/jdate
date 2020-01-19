package com.jdate.listener;

import com.jdate.CalcSpecificDate;
import com.jdate.format.DateFormat;
import com.jdate.format.DayFormat;
import com.jdate.format.HourFormat;
import com.jdate.format.MinuteFormat;
import com.jdate.format.MonthFormat;
import com.jdate.format.SecondFormat;
import com.jdate.format.YearFormat;
import com.jdate.parse.DateBaseListener;
import com.jdate.parse.DateParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 解析date字符串
 *
 * @author zap
 * @version 1.0, 2020/01/18
 */
public class DateParseListener extends DateBaseListener {

    private static final String AGO = "ago";

    private boolean formated = false;

    private DateTime date;
    private String dateStr;

    private final Map<String, DateFormat> formatMap = new HashMap<>();

    {
        formatMap.put("Y", new YearFormat());
        formatMap.put("m", new MonthFormat());
        formatMap.put("d", new DayFormat());
        formatMap.put("H", new HourFormat());
        formatMap.put("M", new MinuteFormat());
        formatMap.put("S", new SecondFormat());
    }

    @Override
    public void enterJdate(DateParser.JdateContext ctx) {
        this.date = new DateTime();
    }


    /**
     * 输入指定日期
     */
    @Override
    public void enterSpecdate(DateParser.SpecdateContext ctx) {
        String inputDate = ctx.getText();
        if (StringUtils.isNotBlank(inputDate)) {
            date = DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime(inputDate);
        }
    }

    /**
     * 时间基数来算相对时间
     */
    @Override
    public void enterOpdate(DateParser.OpdateContext ctx) {
        Integer dateNum = Integer.parseInt(ctx.NUMBER().getText());
        String cycle = ctx.cycle().getText();
        // 时间推前还是延后
        boolean sequence = true;
        TerminalNode ago = ctx.AGO();
        if (null != ago && AGO.equalsIgnoreCase(ago.getText())) {
            sequence = false;
        }
        CalcSpecificDate specific = new CalcSpecificDate();
        date = specific.calc(date, dateNum, cycle, sequence);
    }


    @Override
    public void enterFormat(DateParser.FormatContext ctx) {
        List<DateParser.SpectorContext> spectors = ctx.spector();

        StringBuilder dateBuilder = new StringBuilder();
        List<DateParser.FormatvalContext> vals = ctx.formatval();
        for (int i = 0; i < vals.size(); i++) {
            DateParser.FormatvalContext fvc = vals.get(i);
            List<DateParser.FormatinfoContext> formatinfos = fvc.formatinfo();
            for (DateParser.FormatinfoContext formatinfo : formatinfos) {
                DateFormat df = formatMap.get(formatinfo.getText());
                if (null != df) {
                    dateBuilder.append(df.format(date));
                    if (null != spectors && i < spectors.size()) {
                        dateBuilder.append(spectors.get(i).getText());
                    }
                } else {
                    throw new IllegalArgumentException("输入格式化参数无效[" + fvc.getText() + "]");
                }
            }
        }
        formated = true;
        this.dateStr = dateBuilder.toString();
    }

    public String display() {
        if (formated) {
            return this.dateStr;
        }
        return this.date.toString();
    }


}
