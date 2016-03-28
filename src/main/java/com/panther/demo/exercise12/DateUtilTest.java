package com.panther.demo.exercise12;

import org.apache.commons.lang.time.DateUtils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期相关操作demo
 * Created by panther.dongdong on 2016/3/21.
 */
public class DateUtilTest {
    public static void main(String[] args) throws ParseException {
        String[] patterns = new String[]{"yyyy-MM", "yyyy-MM-dd"};
        Date date = DateUtils.parseDate("2016-01-03", patterns);
        date = DateUtils.truncate(date, Calendar.MONTH);
        System.out.println(date);
    }
}
