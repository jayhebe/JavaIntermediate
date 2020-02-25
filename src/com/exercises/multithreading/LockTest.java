package com.exercises.multithreading;

import java.util.concurrent.locks.ReentrantLock;

class NewWindow implements Runnable {
    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();

                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": sells ticket, ticket number is " + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        NewWindow w = new NewWindow();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("Window 1");
        t2.setName("Window 2");
        t3.setName("Window 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
