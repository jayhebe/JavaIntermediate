package com.exercises.generics;

import java.util.List;

public class DAO<T> {
    public void add(T t) {

    }

    public boolean delete(int index) {
        return false;
    }

    public void update(int index, T t) {

    }

    public T getIndex(int index) {
        return null;
    }

    public List<T> getForList(int index) {
        return null;
    }
}
