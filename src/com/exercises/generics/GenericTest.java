package com.exercises.generics;

import java.util.ArrayList;

public class GenericTest
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(78);
        list.add(76);
        list.add(89);
        list.add(98);

//        System.out.println(list);

        for (int score : list)
        {
            System.out.println(score);
        }
    }
}
