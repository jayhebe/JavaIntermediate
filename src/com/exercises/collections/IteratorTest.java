package com.exercises.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest
{
    public static void main(String[] args)
    {
        test1();
    }

    public static void test1()
    {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jay", 22));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();
//        System.out.println(iterator.getClass());
        while (iterator.hasNext())
        {
            Object obj = iterator.next();
            if ("Tom".equals(obj))
            {
                iterator.remove();
            }
        }

        iterator = coll.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("--------------------------------");

        for (Object o : coll)
        {
            System.out.println(o);
        }
    }
}
