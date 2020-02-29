package com.exercises.java8newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * 消费型接口 Consumer<T>    void accept(T t)
 * 供给型接口 Supplier<T>    T get()
 * 函数型接口 Function<T, R> R apply(T t)
 * 断定型接口 Predicate<T>   boolean test(T t)
 *
 */

public class LambdaExer {
    public static void main(String[] args) {
        happyTime(500, money -> System.out.println("The price is " + money));
        List<String> testList = new ArrayList<>();
        testList.add("JavaEE");
        testList.add("JavaScript");
        testList.add("JavaSE");
        testList.add("Python");
        testList.add("Go");
        testList.add("JavaME");
        List<String> resultList = filterString(testList, testString -> testString.startsWith("Java"));
        System.out.println(resultList);
    }

    public static void happyTime(double money, Consumer<Double>con) {
        con.accept(money);
    }

    public static List<String> filterString(List<String>list, Predicate<String> pre) {
        List<String> filterList = new ArrayList<>();
        for (String s : list) {
            if (pre.test(s)) {
                filterList.add(s);
            }
        }

        return filterList;
    }
}
