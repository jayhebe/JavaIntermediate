package com.exercises.multithreading;

public class Consumer extends Thread
{
    private Clerk clerk;

    public Consumer(Clerk clerk)
    {
        this.clerk = clerk;
    }

    @Override
    public void run()
    {
        System.out.println(getName() + "开始消费产品......");

        while (true)
        {
            try
            {
                Thread.sleep(2000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}
