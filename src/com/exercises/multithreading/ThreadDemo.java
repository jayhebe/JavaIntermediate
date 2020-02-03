package com.exercises.multithreading;

public class ThreadDemo
{
    public static void main(String[] args)
    {
//        CountEven c1 = new CountEven();
//        CountOdd c2 = new CountOdd();
//
//        c1.start();
//        c2.start();
        //通过创建Thread类的匿名子类的方式
        new Thread(() -> {
            for (int i = 0; i < 100; i++)
            {
                if (i % 2 == 0)
                {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++)
            {
                if (i % 2 != 0)
                {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();
    }
}

//class CountEven extends Thread
//{
//    @Override
//    public void run()
//    {
//        for (int i = 0; i < 100; i++)
//        {
//            if (i % 2 == 0)
//            {
//                System.out.println(Thread.currentThread().getName() + ":" + i);
//            }
//        }
//    }
//}
//
//class CountOdd extends Thread
//{
//    @Override
//    public void run()
//    {
//        for (int i = 0; i < 100; i++)
//        {
//            if (i % 2 != 0)
//            {
//                System.out.println(Thread.currentThread().getName() + ":" + i);
//            }
//        }
//    }
//}