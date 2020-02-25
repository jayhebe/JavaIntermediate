package com.exercises.multithreading;

public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("MyTestThread: ");

//        h1.setName("MyTestThread: ");
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();

        Thread.currentThread().setName("MainThread: ");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + Thread.currentThread().getPriority() + ":" + i);
            }

            if (i == 20) {
                try {
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class HelloThread extends Thread {
    public HelloThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
//                try
//                {
//                    sleep(500);
//                } catch (InterruptedException e)
//                {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + Thread.currentThread().getPriority() + ":" + i);
            }

//            if (i % 20 == 0)
//            {
//                this.yield();
//            }
        }
    }
}