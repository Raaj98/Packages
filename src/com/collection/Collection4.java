package com.collection;
import java.util.*;
public class Collection4 {
    public static void main(String[] args) {
        ArrayList<String> lang1 = new ArrayList<>();
        lang1.add("English");
        lang1.add("Tamil");
        lang1.add("java");
        lang1.add("python");
        lang1.add("c");
        System.out.println(lang1);

        lang1.trimToSize();
        System.out.println(lang1.size());
        System.out.println(lang1);

        ArrayList<String> lang2 = new ArrayList<>();
        lang2.add("c");
        lang2.add("c++");
        lang2.add("java");
        lang2.add("python");
        System.out.println(lang2);
    //    lang2.removeAll(lang1);
    //    System.out.println(lang2);

        lang1.retainAll(lang2);
        System.out.println(lang1);

        System.out.println(lang1.containsAll(lang2));
    }
}
