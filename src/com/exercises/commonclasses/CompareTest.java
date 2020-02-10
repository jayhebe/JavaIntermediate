package com.exercises.commonclasses;


import java.util.Arrays;
import java.util.Comparator;

public class CompareTest
{
    public static void main(String[] args)
    {
//        String[] arr = new String[]{"AA", "CC", "KK", "MM", "GG", "JJ", "DD"};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        Goods[] arr = new Goods[5];
        arr[0] = new Goods("lenovo", 34);
        arr[1] = new Goods("dell", 43);
        arr[2] = new Goods("xiaomi", 12);
        arr[3] = new Goods("huawei", 65);
        arr[4] = new Goods("microsoft", 65);

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator()
        {
            @Override
            public int compare(Object o1, Object o2)
            {
                if (o1 instanceof Goods && o2 instanceof Goods)
                {
                    Goods g1 = (Goods)o1;
                    Goods g2 = (Goods)o2;
                    if (g1.getName().equals(g2.getName()))
                    {
                        return -Double.compare(g1.getPrice(), g2.getPrice());
                    }
                    else
                    {
                        return g1.getName().compareTo(g2.getName());
                    }
                }

                throw new RuntimeException("Wrong data type.");
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------------------");

        String[] arr2 = new String[]{"AA", "CC", "KK", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr2, new Comparator()
        {
            @Override
            public int compare(Object o1, Object o2)
            {
                if (o1 instanceof String && o2 instanceof String)
                {
                    String s1 = (String)o1;
                    String s2 = (String)o2;

                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("Wrong data type.");
            }
        });
        System.out.println(Arrays.toString(arr2));
    }
}
