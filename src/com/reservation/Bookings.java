package com.reservation;
import java.util.Scanner;
public class Bookings extends Bus{
    public String passengerName;
    public Bookings(String busName,int busNo,double bustime,int noOfSeats){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        this.passengerName=scan.nextLine();
        this.busName=busName;
        this.busNo=busNo;
        this.busTime=bustime;
        this.noOfSeats=noOfSeats;
    }
    }

