package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class CollectionExam {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        System.out.println(list.size());
        list.add(10);
        list.add(20);
        list.add(25);
        list.add(16);
        System.out.println(list.size());

        System.out.println(list);

        System.out.println(list.get(0));

        list.set(0,50);
        System.out.println(list.get(0));

        list.remove(3);

        Collections.sort(list);

        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
