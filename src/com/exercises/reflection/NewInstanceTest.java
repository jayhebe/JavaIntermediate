package com.exercises.reflection;

import java.util.Random;

public class NewInstanceTest {
    public static void main(String[] args) {
//        Class<Person> clazz = Person.class;
//        Person person = clazz.newInstance();
//        System.out.println(person);
        test();
    }

    public static void test() {
        for (int i = 0; i < 100; i++) {
            int num = new Random().nextInt(3);
            String classPath = "";
            switch (num) {
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "java.lang.Object";
                    break;
                case 2:
                    classPath = "com.exercises.reflection.Person";
                    break;
            }

            try {
                Object obj = getInstance(classPath);
                System.out.println(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Object getInstance(String classPath) throws Exception {
        Class<?> clazz = Class.forName(classPath);
        return clazz.newInstance();
    }
}
