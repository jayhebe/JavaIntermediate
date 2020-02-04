package com.exercises.multithreading;

public class SaveMoneyExer
{
    public static void main(String[] args)
    {
        SaveMoney sm = new SaveMoney();

        Thread t1 = new Thread(sm);
        Thread t2 = new Thread(sm);

        t1.setName("甲");
        t2.setName("乙");

        t1.start();
        t2.start();
    }
}

class SaveMoney implements Runnable
{
    private double balance = 0;

    @Override
    public void run()
    {
        for (int i = 0; i < 3; i++)
        {
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            synchronized (this)
            {
                balance += 1000;
                System.out.println("线程" + Thread.currentThread().getName() + "存入1000元，当前余额为：" + balance);
            }
        }
    }
}