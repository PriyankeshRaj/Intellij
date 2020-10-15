package com.codewithmosh;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.remove(2);
        list.indexOf(20);
        list.lastIndexOf(20);
        list.contains(20);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.toArray());
    }
}
