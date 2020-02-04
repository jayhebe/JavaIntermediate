package com.exercises.multithreading;

public class SyncMethodTest
{
    public static void main(String[] args)
    {
//        Windows w = new Windows();
//
//        Thread t1 = new Thread(w);
//        Thread t2 = new Thread(w);
//        Thread t3 = new Thread(w);
//
//        t1.setName("Window 1: ");
//        t2.setName("Window 2: ");
//        t3.setName("Window 3: ");
//
//        t1.start();
//        t2.start();
//        t3.start();
        AnotherWindow w1 = new AnotherWindow();
        AnotherWindow w2 = new AnotherWindow();
        AnotherWindow w3 = new AnotherWindow();

        w1.setName("Window 1: ");
        w2.setName("Window 2: ");
        w3.setName("Window 3: ");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Windows implements Runnable
{
    private int ticketNum = 100;

    @Override
    public void run()
    {
        while (true)
        {
            show();
        }
    }

    private synchronized void show()
    {
        if (ticketNum > 0)
        {
            try
            {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + ticketNum);
            ticketNum--;
        }
    }
}

class AnotherWindow extends Thread
{
    private static int ticketNum = 100;

    @Override
    public void run()
    {
        while (true)
        {
            show();
        }
    }

    private static synchronized void show()
    {
        if (ticketNum > 0)
        {
            try
            {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + ticketNum);
            ticketNum--;
        }
    }
}
