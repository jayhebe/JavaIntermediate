package com.exercises.collections;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest
{
    public static void main(String[] args) throws Exception
    {
        Properties properties = new Properties();
        properties.load(new FileInputStream("jdbc.properties"));

        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("password"));
    }
}
