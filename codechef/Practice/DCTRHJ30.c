// Problem: DCTRHJ30
// Platform: codechef
// Language: Flight Number: 1023  
Flight Duration: 2.5 hours  
Flight status match: false
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/KQKACU/problems/DCTRHJ30
// Solved on: 2026-10-11T15:37:56.227Z

// This class demonstrates the use of statements and semicolons in Java.
class Codechef {

    // The main method serves as the entry point for the program.
    public static void main(String[] args) {
        
        // Flight details
        String flightStatus1 = "On Time";
        String flightStatus2 = "Delayed";
        int flightNumber = 1023;
        double flightDuration = 2.5;

        // Complete the below code
        boolean statusMatch = flightStatus1.equals(flightStatus2);
        
        System.out.println("Flight Number: "+flightNumber);
        System.out.println("Flight Duration: "+flightDuration+" hours");
        System.out.println("Flight status match: "+statusMatch);
    }
}