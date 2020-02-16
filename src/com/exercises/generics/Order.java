package com.exercises.generics;

public class Order<T>
{
    String orderName;
    int orderID;
    T orderT;

    public Order()
    {
    }

    public Order(String orderName, int orderID, T orderT)
    {
        this.orderName = orderName;
        this.orderID = orderID;
        this.orderT = orderT;
    }

    public String getOrderName()
    {
        return orderName;
    }

    public void setOrderName(String orderName)
    {
        this.orderName = orderName;
    }

    public int getOrderID()
    {
        return orderID;
    }

    public void setOrderID(int orderID)
    {
        this.orderID = orderID;
    }

    public T getOrderT()
    {
        return orderT;
    }

    public void setOrderT(T orderT)
    {
        this.orderT = orderT;
    }

    @Override
    public String toString()
    {
        return getClass() +
                "{orderName='" + orderName + '\'' +
                ", orderID=" + orderID +
                ", orderT=" + orderT +
                '}';
    }
}
