package com.exercises.collections;

import java.util.HashSet;

public class HashSetInterView {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        People p1 = new People(1001, "AA");
        People p2 = new People(1002, "BB");

        set.add(p1);
        set.add(p2);
        System.out.println(set);

        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);
        set.add(new People(1001, "CC"));
        System.out.println(set);
        set.add(new People(1001, "AA"));
        System.out.println(set);
    }
}
