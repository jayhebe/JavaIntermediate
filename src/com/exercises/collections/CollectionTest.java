package com.exercises.collections;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
        test6();
    }

    public static void test1() {
        Collection collection = new ArrayList();

        collection.add("AA");
        collection.add("BB");
        collection.add(123);
        collection.add(new Date());
        System.out.println(collection.size());

        Collection collection1 = new ArrayList();
        collection1.add("CC");
        collection1.add(345);

        collection.addAll(collection1);
        System.out.println(collection.size());
        System.out.println(collection);

        System.out.println(collection.isEmpty());
    }

    public static void test2() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jay", 22));

        //contains()
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));
        System.out.println(coll.contains(new Person("Jay", 22)));

        //containsAll(Collection coll)
        Collection coll1 = Arrays.asList(123, 456);
        System.out.println(coll.containsAll(coll1));
    }

    public static void test3() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jay", 22));
        coll.add(new String("Tom"));
        coll.add(false);

        //remove(Object obj)
        System.out.println(coll);
        coll.remove(123);
        System.out.println(coll);
        coll.remove(1234);

        //removeAll(Collection coll)
        Collection coll1 = Arrays.asList(456, false);
        coll.removeAll(coll1);
        System.out.println(coll);
    }

    public static void test4() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jay", 22));
        coll.add(new String("Tom"));
        coll.add(false);

        //retainAll(Collection coll)
        Collection coll1 = Arrays.asList(123, 456);
        coll.retainAll(coll1);
        System.out.println(coll);
    }

    public static void test5() {
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new Person("Jay", 22));
        coll1.add(new String("Tom"));
        coll1.add(false);

        Collection coll2 = new ArrayList();
        coll2.add(123);
        coll2.add(456);
        coll2.add(new Person("Jay", 22));
        coll2.add(new String("Tom"));
        coll2.add(false);

        //equals(Object obj)
        System.out.println(coll1.equals(coll2));
    }

    public static void test6() {
        List<String> list = Arrays.asList("AA", "BB", "CC");
        System.out.println(list.toString());

        List arr1 = Arrays.asList(new int[]{123, 456});
        List arr2 = Arrays.asList(new Integer[]{123, 456});

        System.out.println(arr1.size());
        System.out.println(arr1.toString());
        System.out.println(arr2.size());
        System.out.println(arr2.toString());
    }
}
