// Problem: WNDHVZ34
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/PKAKHY/problems/WNDHVZ34
// Solved on: 2026-10-16T15:28:05.819Z

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Take user input
        Scanner sc = new Scanner(System.in);
        int studentScore = sc.nextInt();
        int passingScore = sc.nextInt();

        // Checking if the student meets the scholarship criteria
        if (studentScore >= passingScore) {
            System.out.println("Scholarship Granted!");
        } else {
            System.out.println("Scholarship Denied!");
        }

        // Indicating that the evaluation process is complete
        System.out.println("Evaluation completed.");
    }
}