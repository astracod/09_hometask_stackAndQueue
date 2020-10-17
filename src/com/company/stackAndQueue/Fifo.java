package com.company.stackAndQueue;

public class Fifo<T> implements DataStructure<T> {


    private MyLinkedList<T> list;

    public Fifo() {
        this.list = new MyLinkedList<>();
    }

    public T getList() {
        return list.getElem(0);
    }

    public int size() {
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
        buf.addElem((T) list.getElem(0));
        list.removeList(0);
        return (T) buf.getElem(0);
    }


}
