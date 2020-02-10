package com.exercises.commonclasses;

public class IDEADebug
{
    public static void main(String[] args)
    {
        testStringDebug();
    }

    public static void testStringDebug()
    {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }
}
