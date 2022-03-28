package com.overideexample;

public class Sbi extends Bank{
     int getRateOfInterest(){
        return 10;
    }void display(){
         System.out.println(this.getRateOfInterest());
    }
}
