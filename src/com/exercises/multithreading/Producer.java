package com.exercises.multithreading;

public class Producer extends Thread
{
    private Clerk clerk;

    public Producer(Clerk clerk)
    {
        this.clerk = clerk;
    }

    @Override
    public void run()
    {
        System.out.println(getName() + "开始生产产品......");

        while (true)
        {
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}
