package com.exercises.multithreading;

public class RunnableTest
{
    public static void main(String[] args)
    {
        Tickets tickets = new Tickets();
//        Tickets t2 = new Tickets();
//        Tickets t3 = new Tickets();

        Thread th1 = new Thread(tickets);
        Thread th2 = new Thread(tickets);
        Thread th3 = new Thread(tickets);

        th1.setName("Window01: ");
        th2.setName("Window02: ");
        th3.setName("Window03: ");

        th1.start();
        th2.start();
        th3.start();
    }
}

class Tickets implements Runnable
{
    private int ticketNum = 100;

    @Override
    public void run()
    {
        while (true)
        {
            synchronized(this)
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
                else
                {
                    break;
                }
            }
        }
    }
}