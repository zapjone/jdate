package com.jdate.format;

import org.joda.time.DateTime;

/**
 * @author zhangap
 * @version 1.0, 2020/1/19
 */
public interface DateFormat {

    /**
     * 格式化日期
     */
    String format(DateTime date);

}
