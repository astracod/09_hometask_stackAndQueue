package com.company.stackAndQueue;



public class Main {

    /*
        Создать 2 класса, реализующие структуры данных FIFO и LIFO (стек и очередь)
        оба содержат по 2 метода
        void push(T value)
        T pop()
        метод push добавляет элемент в стек/очередь
        метод pop удаляет и возвращает его значение
        очередь подчиняется принципу First In First Out (первым вошел - первым вышел)
        стек подчиняется принципу Last In First Out (последним вошел - первым вышел)
        по сути внутренняя структура - односвязный список
*/
    public static void main(String[] args) {

        Fifo<Integer> list2 = new Fifo<>();
        list2.push(1);
        list2.push(2);
        list2.push(3);
        list2.push(4);

        System.out.println("|-------------------| Очередь / First In First Out : |---------------------|");
        while (!(list2.isEmpty())) {
            System.out.println(list2.pop());
        }
        System.out.println("|--------------------------------------------------------------------------|");

        Lifo<Integer> list3 = new Lifo<>();
        list3.push(6);
        list3.push(7);
        list3.push(8);
        list3.push(9);

        System.out.println("|-------------------| Стек / Last In First Out : |-------------------------|");
        while (!(list3.isEmpty())) {
            System.out.println(list3.pop());
        }
        System.out.println("|--------------------------------------------------------------------------|");
    }
}
