package com.exception;
import java.util.*;
public class ExceptionThrowExample {
    public static void main(String[] args) throws Exception{
        try {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter age");
        int age = scan.nextInt();
        if (age<18){
            throw new Exception("person is not eligible to vote");
            }
            else {
                System.out.println("person is eligible to vote");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
