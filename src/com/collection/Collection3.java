package com.collection;
import java.lang.reflect.Array;
import java.util.*;
public class Collection3 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("swift");
        cars.add("bmw");
        cars.add("mg");
        cars.add("volvo");
        cars.add("swift");
        System.out.println(cars.subList(0, cars.size()));
        System.out.println(cars.subList(0,3));

        String[] cars2 = new String[cars.size()];
        cars.toArray(cars2);
        for (String i:cars2){
            System.out.println(i);
        }
         String s = cars.toString();
         System.out.println(s);

         int p1 = cars.lastIndexOf("swift");
         System.out.println(p1);
    }
}
