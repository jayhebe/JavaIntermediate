package com.exercises.multithreading;

public class CommunicationTest
{
    public static void main(String[] args)
    {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("Thread1: ");
        t2.setName("Thread2: ");

        t1.start();
        t2.start();
    }
}

class Number implements Runnable
{
    private int number = 1;

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (this)
            {
                if (number <= 100)
                {
                    try
                    {
                        Thread.sleep(10);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try
                    {
                        wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                else
                {
                    break;
                }
            }
        }
    }
}
