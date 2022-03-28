package com.overideexample;

public class Icci extends Bank{
     int getRateOfInterest(){
        return 9;
    }void display(){
         System.out.println(this.getRateOfInterest());
    }
}
