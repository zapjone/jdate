package com.jdate.util;

import org.joda.time.DateTime;

/**
 * @author zhangap
 * @version 1.0, 2020/1/19
 */
public class NormalDateFormat {

    public static String format(DateTime dateTime, String pattern){
        return dateTime.toString(pattern);
    }

}
