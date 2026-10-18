// Problem: WNDHVZ49
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/PKAKHY/problems/WNDHVZ49
// Solved on: 2026-10-18T12:15:39.797Z

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Predefined emergency access codes
        int emergencyKeycode = 4321;
        int overrideCode = 9999;

        // Take user input
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();

        // Checking if the entered code matches either emergencyKeycode or overrideCode
        if ( num==emergencyKeycode || num==overrideCode  ) {  // Fill in the blanks
            System.out.println("Access Granted: Emergency Entry Allowed."); // Fill in the blank
        } else {
            System.out.println("Access Denied: Invalid Code."); // Fill in the blank
        }


    }
}
