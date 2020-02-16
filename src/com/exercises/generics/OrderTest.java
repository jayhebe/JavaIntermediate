package com.exercises.generics;

public class OrderTest
{
    public static void main(String[] args)
    {
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");

        Order<String> order1 = new Order<>("orderAA", 1001, "hehehe");
        order1.setOrderT("hahaha");

        System.out.println(order1);

        SubOrder subOrder = new SubOrder();
        subOrder.setOrderT(123);

        System.out.println(subOrder);
    }
}
