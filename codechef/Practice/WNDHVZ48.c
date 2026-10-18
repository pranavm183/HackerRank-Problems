// Problem: WNDHVZ48
// Platform: codechef
// Language: Your late fee is waived.  
Library fee check completed.
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/PKAKHY/problems/WNDHVZ48
// Solved on: 2026-10-18T12:11:52.993Z

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Variables representing waiver conditions
        boolean isSeniorCitizen = false;
        boolean hasMembership = true;

        // Check if the user qualifies for a late fee waiver
        if (isSeniorCitizen || hasMembership) {
            System.out.println("Your late fee is waived.");
        } else {
            System.out.println("You need to pay the late fee.");
        }

        System.out.println("Library fee check completed.");
    }
}
