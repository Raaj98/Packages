package com.reservation;
import java.util.Scanner;
public class Billing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bookings u1 = new Bookings("jrs",10,10,30,"name");
        System.out.println("enter your name");
        u1.passengerName= scan.nextLine();
        System.out.println("select no of seats");
        u1.noOfSeats= scan.nextInt();
        int user = 1;
        while (user == 1) {
            System.out.println("Enter 1 to book and 2 to exist");
            user = scan.nextInt();
            if (user == 1) {
                System.out.println("Booking...");
                System.out.println(u1.passengerName);
                System.out.println("having ac"+ " " +u1.have_ac);
                System.out.println(u1.busName+ " " +u1.busNo+ " " +u1.busTime+ " " +u1.noOfSeats);
                System.out.println("bookings completed");
            }
            else {
                System.out.println("Thank you");
            }
        }
    }
}
