package com.exercises.commonclasses;

public class StringExer
{
    public static void main(String[] args)
    {

    }

    public static void test1()
    {
        String s1 = "abcwerthelloyuiodef";
        String s2 = "cvhellobnm";
        String temp = "";

        for (int i = s2.length() - 1; i > 0; i--)
        {
            temp = s2.substring(0, i);
            if (s1.contains(temp))
            {
                break;
            }
        }
        System.out.println(temp);
    }
}
