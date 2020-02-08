package com.exercises.commonclasses;

public class StringMethodTest
{
    public static void main(String[] args)
    {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
        test8();
    }

    public static void test1()
    {
        String s1 = "helloworld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));
        System.out.println(s1.isEmpty());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
    }

    public static void test2()
    {
        String s1 = "     he  llo  w or  ld   ";
        System.out.println(s1);
        System.out.println(s1.trim());

        String s2 = "Helloworld";
        String s3 = "helloworld";
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
    }

    public static void test3()
    {
        String s1 = "abc";
        String s2 = new String("abe");
        System.out.println(s1.concat("def"));
        System.out.println(s1.compareTo(s2));
    }

    public static void test4()
    {
        String s1 = "Avengers";
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2, 5));

        String s2 = "helloworld";
        System.out.println(s2.startsWith("hel"));
        System.out.println(s2.endsWith("rld"));
        System.out.println(s2.endsWith("123"));
        System.out.println(s2.startsWith("ll", 2));
    }

    public static void test5()
    {
        String s1 = "helloworld";
        System.out.println(s1.indexOf("lo"));
        System.out.println(s1.indexOf("lol"));
        System.out.println(s1.lastIndexOf("lol"));
    }

    public static void test6()
    {
        String s1 = "helloworldll";
        System.out.println(s1.replace('l', 'm'));
        System.out.println(s1.replace("ll", "jj"));

        String s2 = "123hello456worldjava7890mysql888888";
        System.out.println(s2.replaceAll("\\d+", ",").replaceAll("^,|,$", ""));
    }

    public static void test7()
    {
        String s1 = "abc123";
        char[] charArray = s1.toCharArray();

        for (char c : charArray)
        {
            System.out.println(c);
        }

        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(new String(arr));
    }

    public static void test8()
    {
        String s1 = "abc123";
        char[] charArr = s1.toCharArray();

        String s2 = Character.toString(charArr[0]);
        for (int i = charArr.length - 2; i > 0; i--)
        {
            s2 += Character.toString(charArr[i]);
        }
        s2 += Character.toString(charArr[charArr.length - 1]);

        System.out.println(s1);
        System.out.println(s2);
    }
}
