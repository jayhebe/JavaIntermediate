package com.exercises.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

public class CollectionTest
{
    public static void main(String[] args)
    {
//        test1();
        test2();
    }

    public static void test1()
    {
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

    public static void test2()
    {
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

        //containsAll()
        Collection coll1 = Arrays.asList(123, 456);
        System.out.println(coll.containsAll(coll1));
    }
}
