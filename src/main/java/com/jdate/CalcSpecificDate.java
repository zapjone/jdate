package com.jdate;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * 基于给定时间来计算相对时间
 *
 * @author zhangap
 * @version 1.0, 2020/1/19
 */
public class CalcSpecificDate {

    /**
     * 计算日期
     *
     * @param date     基本时间
     * @param dateNum  时间数量，正负都行
     * @param cycle    DAY/WEEK/MONTH/YEAR
     * @param sequence 向前还是向后
     * @return 计算后的时间
     */
    public DateTime calc(DateTime date, Integer dateNum, String cycle, boolean sequence) {
        return seqDate(date, dateNum, cycle, sequence);
    }

    private DateTime seqDate(DateTime dateTime, Integer dateNum, String cycle, boolean sequence) {
        switch (cycle) {
            case "millis":
            case "MILLIS":
                dateTime = calcMillis(dateTime, dateNum, sequence);
                break;
            case "second":
            case "SECOND":
                dateTime = calcSecond(dateTime, dateNum, sequence);
                break;
            case "minute":
            case "MINUTE":
                dateTime = calcMinute(dateTime, dateNum, sequence);
                break;
            case "hour":
            case "HOUR":
                dateTime = calcHour(dateTime, dateNum, sequence);
                break;
            case "DAY":
            case "day":
                dateTime = calcDay(dateTime, dateNum, sequence);
                break;
            case "WEEK":
            case "week":
                dateTime = calcWeek(dateTime, dateNum, sequence);
                break;
            case "MONTH":
            case "month":
                dateTime = calcMonth(dateTime, dateNum, sequence);
                break;
            case "YEAR":
            case "year":
                dateTime = calcYear(dateTime, dateNum, sequence);
                break;
            default:
                break;
        }
        return dateTime;
    }

    private DateTime calcMillis(DateTime dateTime, Integer dateNum, boolean sequence) {
        if (sequence) {
            return dateTime.plusMillis(dateNum);
        }
        return dateTime.minusMillis(dateNum);
    }


    private DateTime calcSecond(DateTime dateTime, Integer dateNum, boolean sequence) {
        if (sequence) {
            return dateTime.plusSeconds(dateNum);
        }
        return dateTime.minusSeconds(dateNum);
    }

    private DateTime calcMinute(DateTime dateTime, Integer dateNum, boolean sequence) {
        if (sequence) {
            return dateTime.plusMinutes(dateNum);
        }
        return dateTime.minusMinutes(dateNum);
    }


    private DateTime calcHour(DateTime dateTime, Integer dateNum, boolean sequence) {
        if (sequence) {
            return dateTime.plusHours(dateNum);
        }
        return dateTime.minusHours(dateNum);
    }

    private DateTime calcDay(DateTime dateTime, Integer dateNum, boolean sequence) {
        if (sequence) {
            return dateTime.plusDays(dateNum);
        }
        return dateTime.minusDays(dateNum);
    }

    private DateTime calcWeek(DateTime dateTime, Integer dateNum, boolean sequence) {
        if (sequence) {
            return dateTime.plusWeeks(dateNum);
        }
        return dateTime.minusWeeks(dateNum);
    }

    private DateTime calcMonth(DateTime dateTime, Integer dateNum, boolean sequence) {
        if (sequence) {
            return dateTime.plusMonths(dateNum);
        }
        return dateTime.minusMonths(dateNum);
    }

    private DateTime calcYear(DateTime dateTime, Integer dateNum, boolean sequence) {
        if (sequence) {
            return dateTime.plusYears(dateNum);
        }
        return dateTime.minusYears(dateNum);
    }

}
