package com.exercises.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderTest {
    public static void main(String[] args) throws IOException {
//        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
//        System.out.println(classLoader);
//        System.out.println(classLoader.getParent());
//        System.out.println(classLoader.getParent().getParent());
//        System.out.println(String.class.getClassLoader());
        test1();
    }

    public static void test1() throws IOException {
        Properties properties = new Properties();

        //method 1
        properties.load(new FileInputStream("jdbc.properties"));

        //method 2
//        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
//        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
//        properties.load(is);

        String user = properties.getProperty("name");
        String password = properties.getProperty("password");
        System.out.println("name = " + user + ", password = " + password);
    }
}
