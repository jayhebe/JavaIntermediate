package com.exercises.multithreading;

public class Clerk
{
    private int productCount = 0;

    public synchronized void produceProduct()
    {
        if (productCount < 20)
        {
            productCount++;
            System.out.println(Thread.currentThread().getName() + "开始生产第" + productCount + "个产品");

            notify();
        }
        else
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeProduct()
    {
        if (productCount > 0)
        {
            System.out.println(Thread.currentThread().getName() + "开始消费第" + productCount + "个产品");
            productCount--;

            notify();
        }
        else
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
