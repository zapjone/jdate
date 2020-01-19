package com.jdate.format;

import com.jdate.util.NormalDateFormat;
import org.joda.time.DateTime;

/**
 * 格式化年
 *
 * @author zhangap
 * @version 1.0, 2020/1/19
 */
public class YearFormat implements DateFormat {

    @Override
    public String format(DateTime date) {
        return NormalDateFormat.format(date, "yyyy");
    }
}
