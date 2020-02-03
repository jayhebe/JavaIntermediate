package com.exercises.multithreading;

public class RunnableTest
{
    public static void main(String[] args)
    {
        Tickets t1 = new Tickets();
//        Tickets t2 = new Tickets();
//        Tickets t3 = new Tickets();

        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();
    }
}

class Tickets implements Runnable
{
    private int ticketNum = 100;

    @Override
    public void run()
    {
        while (ticketNum > 0)
        {
            System.out.println(Thread.currentThread().getName() + ":" + ticketNum);
            ticketNum--;
        }
    }
}