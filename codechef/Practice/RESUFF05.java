// Problem: RESUFF05
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/WPGGQR/problems/RESUFF05
// Solved on: 2026-10-20T18:29:14.008Z

import java.util.Scanner; // Import Scanner class to take input from the user

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        
        // Read user input and store it in the 'temperature' variable
        int temp=scanner.nextInt();

        // Check if the temperature is above 30
        if(temp>30){
            System.out.println("It's hot outside! Stay hydrated.");
        }


        // Use one 'else if' to check if the temperature is between 10 and 30 (inclusive)
        else if(temp<30 && temp>10){
            System.out.println("The weather is moderate. Enjoy your day!");
        }


        // Use 'else' for all other conditions (temperature below 10)
        else{
            System.out.println("It's cold outside! Wear warm clothes.");
        }



        scanner.close(); // Close the Scanner object to free up resources
    }
}
