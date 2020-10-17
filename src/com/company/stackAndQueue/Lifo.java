package com.company.stackAndQueue;


public class Lifo<T> implements DataStructure<T> {

    private MyLinkedList<T> list;

    public Lifo() {
        this.list = new MyLinkedList<>();
    }

    private int len() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public void push(T value) {
        list.addElem(value);
    }

    @Override
    public T pop() {
        MyLinkedList<T> buf = new MyLinkedList<>();
        buf.addElem((T) list.getElem(len()-1));
        list.removeList(len()-1);
        return (T) buf.getElem(len());
    }
}
