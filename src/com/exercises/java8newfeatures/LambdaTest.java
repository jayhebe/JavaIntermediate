package com.exercises.java8newfeatures;

import java.util.Comparator;

public class LambdaTest {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I love Java");
            }
        };
        r1.run();

        Runnable r2 = () -> System.out.println("I love Python");
        r2.run();
    }

    public static void test2() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        int compare1 = com1.compare(12, 21);
        System.out.println(compare1);

        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);
        int compare2 = com2.compare(32, 21);
        System.out.println(compare2);

        Comparator<Integer> com3 = Integer::compare;
        int compare3 = com3.compare(55, 81);
        System.out.println(compare3);
    }
}
