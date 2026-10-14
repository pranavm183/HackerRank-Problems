// Problem: WNDHVZ14
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/PKAKHY/problems/WNDHVZ14
// Solved on: 2026-10-14T16:35:45.591Z

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Declaring a variable to store the secret code
        int secretCode = 7890;
        
        Scanner sc = new Scanner(System.in);
        int enteredCode=sc.nextInt();
        
        // Checking if the enteredCode code matches the predefined secretCode
        if ( enteredCode==7890) {  // Fill in the blank
            System.out.println("Access Granted: Vault Unlocked."); // Fill in the blank
        } else {
            System.out.println("Access Denied"); // Fill in the blank
        }

        // Indicating that the verification process is complete
        System.out.println("Verification completed.");
    }
}
