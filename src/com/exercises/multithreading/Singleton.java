package com.exercises.multithreading;

public class Singleton
{
}

class Bank
{
    private Bank(){}

    private static Bank instance = null;

    //Way 1:
//    public static synchronized Bank getInstance()
//    {
//        if (instance == null)
//        {
//            instance = new Bank();
//        }
//
//        return instance;
//    }

    //Way 2: inefficient
//    public static Bank getInstance()
//    {
//        synchronized (Bank.class)
//        {
//            if (instance == null)
//            {
//                instance = new Bank();
//            }
//
//            return instance;
//        }
//    }

    //Way 3: more efficient
    public static Bank getInstance()
    {
        if (instance == null)
        {
            synchronized (Bank.class)
            {
                if (instance == null)
                {
                    instance = new Bank();
                }
            }
        }

        return instance;
    }
}