package com.reservation;
import com.reservation.Bookings;
import java.util.Scanner;
public class Billing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bus b1 = new Bus();
        Bookings u1 = new Bookings("jrs",10,05,5);
        int user = 1;
        while (user == 1) {
            System.out.println("Enter 1 to book and 2 to exist");
            user = scan.nextInt();
            if (user == 1) {
                System.out.println("Booking...");
                System.out.println(u1.passengerName);
                System.out.println("having ac"  +  u1.have_ac);
                System.out.println(u1.busName  + u1.busNo  + u1.busTime  + u1.noOfSeats);
                System.out.println("bookings completed");
                break;
            }
        }
    }
}