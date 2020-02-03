package com.exercises.multithreading;

public class TicketWindows
{
    public static void main(String[] args)
    {
        SendTickets s1 = new SendTickets();
        SendTickets s2 = new SendTickets();
        SendTickets s3 = new SendTickets();

        s1.setName("Window 1");
        s2.setName("Window 2");
        s3.setName("Window 3");

        s1.start();
        s2.start();
        s3.start();
    }
}

class SendTickets extends Thread
{
    private static int ticketNum = 100;

    @Override
    public void run()
    {
        while (true)
        {
            synchronized(SendTickets.class)
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
                } else
                {
                    break;
                }
            }
        }
    }
}