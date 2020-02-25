package com.exercises.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Jay", 22));
        list.add(456);

        System.out.println(list);
        list.add(1, "BB");
        System.out.println(list);

        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
//        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(2));
//        System.out.println(list.indexOf(456));
        System.out.println(list.indexOf(888));
        System.out.println(list.lastIndexOf(456));

//        Object obj = list.remove(0);
//        System.out.println(obj);
//        System.out.println(list);
        list.set(0, 111);
        System.out.println(list.subList(2, 6));
        System.out.println(list);
    }
}
