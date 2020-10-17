package com.company.stackAndQueue;

public interface DataStructure<T> {
    boolean isEmpty();

    void push(T value);

    T pop();
}
