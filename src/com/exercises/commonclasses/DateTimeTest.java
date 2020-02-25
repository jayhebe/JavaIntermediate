package com.exercises.commonclasses;

import java.util.Date;

public class DateTimeTest {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    public static void test2() {
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());

        Date date2 = new Date(1581177234347L);
        System.out.println(date2.toString());

        java.sql.Date date3 = new java.sql.Date(1581177234347L);
        System.out.println(date3);
    }
}
