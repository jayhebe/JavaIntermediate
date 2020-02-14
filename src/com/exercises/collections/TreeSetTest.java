package com.exercises.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest
{
    public static void main(String[] args)
    {
        TreeSet ts1 = new TreeSet();
        ts1.add(new Employee("Jay", 22, new MyDate(1998, 3, 27)));
        ts1.add(new Employee("Sherry", 20, new MyDate(2000, 2, 18)));
        ts1.add(new Employee("Alex", 25, new MyDate(1995, 5, 30)));
        ts1.add(new Employee("Kitty", 24, new MyDate(1996, 8, 12)));
        ts1.add(new Employee("Tracy", 21, new MyDate(1999, 6, 20)));

        for (Object o : ts1)
        {
            System.out.println(o);
        }

        System.out.println("--------------------------------------------------------------");

        Comparator comparator = new Comparator()
        {
            @Override
            public int compare(Object o1, Object o2)
            {
                if (o1 instanceof Employee && o2 instanceof Employee)
                {
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    if (e1.getBirthday().getYear() - e2.getBirthday().getYear() != 0)
                    {
                        return e1.getBirthday().getYear() - e2.getBirthday().getYear();
                    }

                    if (e1.getBirthday().getMonth() - e2.getBirthday().getMonth() != 0)
                    {
                        return e1.getBirthday().getMonth() - e2.getBirthday().getMonth();
                    }

                    return e1.getBirthday().getDay() - e2.getBirthday().getDay();
                }

                throw new RuntimeException("Wrong data type");
            }
        };

        TreeSet ts2 = new TreeSet(comparator);
        ts2.add(new Employee("Jay", 22, new MyDate(1998, 3, 27)));
        ts2.add(new Employee("Sherry", 20, new MyDate(2000, 2, 18)));
        ts2.add(new Employee("Alex", 25, new MyDate(1995, 5, 30)));
        ts2.add(new Employee("Kitty", 24, new MyDate(1996, 8, 12)));
        ts2.add(new Employee("Tracy", 21, new MyDate(1999, 6, 20)));

        for (Object o : ts2)
        {
            System.out.println(o);
        }
    }
}
