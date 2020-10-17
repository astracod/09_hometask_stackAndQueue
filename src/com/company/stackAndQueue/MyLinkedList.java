package com.company.stackAndQueue;

import java.util.Iterator;


public class MyLinkedList<T> implements Iterable {

    private ListItem<T> head;
    private ListItem<T> tail;
    private int len = 0;



    public int size() {
        return len;
    }

    public void addElem(T value) {
        ListItem<T> elem = new ListItem<>(value);
        len++;
        if (head == null) {
            head = tail = elem;
        }
        tail.setNext(elem);
        tail = elem;
    }

    public T getElem(int index) {
        ListItem<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
            if (current == null) throw new IndexOutOfBoundsException();
        }
        return current.getValue();
    }

    public void removeList(int index) {
        ListItem<T> current = head;
        for (int i = 0; i <= index && current != null; i++, current = current.getNext()) {
            if (index == 0) head = current.getNext();
            if (i == index - 1) {
                current.setNext(current.getNext().getNext());
                if (current.getNext() == null) {
                    tail = current;
                }
            }
        }
        len--;
    }

    /**
     * метод и класс реализующий очередь и принцип First In First Out
     *
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        return new QueueIterator(head);
    }



    private static class QueueIterator<T> implements Iterator<T> {
        private ListItem<T> current;

        public QueueIterator(ListItem<T> current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            ListItem<T> elem = current;
            current = current.getNext();
            return elem.getValue();
        }
    }

    /**
     *  класс реализующий лист - объект
     * @param <T>
     */
    private static class ListItem<T> {
        private T value;
        private ListItem<T> next;

        public ListItem(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public ListItem<T> getNext() {
            return next;
        }

        public void setNext(ListItem<T> next) {
            this.next = next;
        }
    }

}
