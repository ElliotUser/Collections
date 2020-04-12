package ru.rickSanchez.company.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Paul");
        list.add("Jef");
        list.add("Andy");
        //при добавлении в коллекцию ArrayList уже существующего значения выводится true
        // и оно добавляется
//        System.out.println(list.add("Alex"));
//        System.out.println(list.size());

        //метод addAll добовляет элементы из одной коллекции в другую
        Collection<String> list_2 = new ArrayList<>();
        System.out.println(list_2.size());
        list_2.addAll(list);
        System.out.println(list_2 + " " + list_2.size());

//        //очистить коллекцию
//        list_2.clear();
//        System.out.println(list_2 + " " + list_2.size());
//
//        //пуста ли коллекция? true/false
//        System.out.println(list_2.isEmpty());

        Object[] arr = list_2.toArray();
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.println(arr.length);

    }
}
