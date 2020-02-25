package com.exercises.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1() {
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add("AA");
        set.add(new Person("Jay", 22));
        set.add("CC");
        set.add("AA");

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("--------------------------------------");

        for (Object obj : set) {
            System.out.println(obj);
        }
    }

    public static void test2() {
        Set set = new LinkedHashSet();
        set.add(123);
        set.add(456);
        set.add("AA");
        set.add(new Person("Jay", 22));
        set.add("CC");
        set.add("AA");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
