package com.collection;
import java.util.*;
public class Collection2 {
    public static void main(String[] args) {
        List<Integer>primeNumbers = new ArrayList<>();
        primeNumbers.add(10);
        primeNumbers.add(33);
        primeNumbers.add(22);
        System.out.println(primeNumbers);

        List<Integer>numbers = new ArrayList<>();
        numbers.add(20);
        numbers.addAll(primeNumbers);

        Collections.sort(numbers);
        System.out.println(numbers);
        primeNumbers.retainAll(numbers);
        System.out.println(primeNumbers);

        numbers.clear();
        System.out.println(numbers);

        System.out.println(primeNumbers.contains(10));

        int p1 = primeNumbers.indexOf(10);
        System.out.println(p1);

        System.out.println(primeNumbers.removeAll(primeNumbers));
        System.out.println(primeNumbers);
        System.out.println(primeNumbers.isEmpty());
    }
}
