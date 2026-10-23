// Problem: RESUFF14
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/WPGGQR/problems/RESUFF14
// Solved on: 2026-10-23T15:54:12.864Z

import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        boolean bookingStatus = sc.nextBoolean();
        String roomType = sc.next();

        // Outer if condition checks if the booking is valid
        if(bookingStatus==true){
            // Nested if condition checks the type of room
            if(roomType.equals("Luxury")){
                System.out.println("Welcome to your Luxury Suite!");
            } else {
                System.out.println("Welcome to your Standard Room!");
            }
        } else {
            System.out.println("Booking not found. Please check your details.");
        }

        // Indicating that the reservation check is completed
        System.out.println("Reservation check completed.");
    }
}
