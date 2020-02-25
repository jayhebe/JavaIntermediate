package com.exercises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(666);
        list.add(888);
        list.add(666);
        list.add(666);
        list.add(798);

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.swap(list, 1, 2);
        System.out.println(list);
        System.out.println(Collections.frequency(list, 666));
    }
}
