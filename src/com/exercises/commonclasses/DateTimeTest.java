package com.exercises.commonclasses;

import java.util.Date;

public class DateTimeTest
{
    public static void main(String[] args)
    {
//        test1();
        test2();
    }

    public static void test1()
    {
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    public static void test2()
    {
        Date date1 = new Date();
        System.out.println(date1.toString());
    }
}
