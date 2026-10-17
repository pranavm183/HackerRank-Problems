// Problem: WNDHVZ43
// Platform: codechef
// Language: You are eligible to take the exam.  
Eligibility check completed.
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/PKAKHY/problems/WNDHVZ43
// Solved on: 2026-10-17T18:13:21.965Z

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Variables representing eligibility conditions
        boolean hasRegistered = true;
        int attendancePercentage = 80;
        int requiredAttendance = 75;

        // Check if student is registered and meets attendance requirement
        if (hasRegistered && (attendancePercentage >= requiredAttendance)) {
            System.out.println("You are eligible to take the exam.");
        } else {
            System.out.println("You are not eligible to take the exam.");
        }

        System.out.println("Eligibility check completed.");
    }
}
