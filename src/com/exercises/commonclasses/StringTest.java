package com.exercises.commonclasses;

public class StringTest
{
    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };

    public static void main(String[] args)
    {
//        String s1 = "abc";
//        String s2 = "abc";
//        s1 = "hello";
//
//        System.out.println("-------------test1---------------");
//
//        System.out.println(s1 == s2);
//
//        System.out.println(s1);
//        System.out.println(s2);
//
//        String s3 = "abc";
//        s3 += "def";
//        System.out.println(s3);
//
//        System.out.println("-------------test2---------------");
//
//        String s4 = new String("abc");
//        String s5 = new String("abc");
//
//        System.out.println(s4 == s5);
//
//        Person p1 = new Person("Jay", 22);
//        Person p2 = new Person("Jay", 22);
//
//        System.out.println(p1.name.equals(p2.name));
//        System.out.println(p1.name == p2.name);

//        System.out.println("-------------test3---------------");
//
//        String s1 = "javaEE";
//        String s2 = "hadoop";
//        String s3 = "javaEEhadoop";
//        String s4 = "javaEE" + "hadoop";
//        String s5 = s1 + "hadoop";
//        String s6 = "javaEE" + s2;
//        String s7 = s1 + s2;
//
//        System.out.println(s3 == s4);
//        System.out.println(s3 == s5);
//        System.out.println(s3 == s6);
//        System.out.println(s3 == s7);
//        System.out.println(s5 == s6);
//        System.out.println(s5 == s7);
//
//        String s8 = s5.intern();
//        System.out.println(s3 == s8);

        System.out.println("-------------test4---------------");

        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
    }

    public void change(String str, char ch[])
    {
        str = "test ok";
        ch[0] = 'b';
    }
}
