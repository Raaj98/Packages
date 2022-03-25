package com.reservation;
public class Bookings extends Bus{
    public String passengerName;
    public Bookings(String busName,int busNo,double bustime,int noOfSeats,String passengerName){
        this.busName=busName;
        this.busNo=busNo;
        this.busTime=bustime;
        this.noOfSeats=noOfSeats;
        this.passengerName=passengerName;
    }
}

