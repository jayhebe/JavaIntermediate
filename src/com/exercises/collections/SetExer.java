package com.exercises.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetExer {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(6);
        list.add(6);

        list = duplicateList(list);

        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static List duplicateList(List list) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        return new ArrayList(hashSet);
    }
}
