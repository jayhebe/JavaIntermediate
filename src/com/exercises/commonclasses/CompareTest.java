package com.exercises.commonclasses;


import java.util.Arrays;

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

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
