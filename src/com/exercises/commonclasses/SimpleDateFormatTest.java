package com.exercises.commonclasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
//        test1();
//        System.out.println(getCurrentTime());
        System.out.println(convertToSqlDate("2020-02-10"));
    }

    public static void test1() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        System.out.println(date);

        System.out.println(sdf.format(date));

        String str = "2/11/20, 12:45 PM";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(date));
    }

    public static String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        return simpleDateFormat.format(date);
    }

    public static java.sql.Date convertToSqlDate(String str) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(str);

        return new java.sql.Date(date.getTime());
    }
}
