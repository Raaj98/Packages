package com.exception;

public class ExceptionExample2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int c ;
        try {
            c = a/b;
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(a/(b+2));
    }
}
