package com.exercises.generics;

public class DAOTest
{
    public static void main(String[] args)
    {
        CustomerDAO customerDAO = new CustomerDAO();

        customerDAO.add(new Customer());
        customerDAO.getIndex(10);

        StudentDAO studentDAO = new StudentDAO();
        studentDAO.add(new Student());
    }
}
