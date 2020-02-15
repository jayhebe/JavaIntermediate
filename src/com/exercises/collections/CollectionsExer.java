package com.exercises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionsExer
{
    public static void main(String[] args)
    {
        exer1();
    }

    public static void exer1()
    {
        List list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Please input the " + (i + 1) + " number: ");
            int input = scanner.nextInt();
            list.add(input);
        }

        Collections.sort(list);
        Collections.reverse(list);
        for (Object o : list)
        {
            System.out.println(o);
        }
    }
}
