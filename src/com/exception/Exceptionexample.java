package com.exception;

public class Exceptionexample {
    public static void main(String[] args) {
        try {
            int[] num = {1, 2, 3, 4, 5};
            System.out.println(num[2]);
            System.out.println(num[7]);
            System.out.println(num[4]);
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("hello world");
    }
}
