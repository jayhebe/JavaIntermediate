package com.exercises.multithreading;

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("Producer1: ");

        Consumer c1 = new Consumer(clerk);
        c1.setName("Consumer1: ");

        p1.start();
        c1.start();
    }
}
