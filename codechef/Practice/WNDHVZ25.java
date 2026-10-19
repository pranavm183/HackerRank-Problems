// Problem: WNDHVZ25
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/PKAKHY/problems/WNDHVZ25
// Solved on: 2026-10-19T16:56:17.232Z

import java.util.*;
// This class demonstrates the use of statements and semicolons in Java.
class Codechef {

    // The main method serves as the entry point for the program.
    public static void main(String[] args) {
        
        // write your code here
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        
        if(input>60){
            System.out.println("You are eligible for the advanced course!");
        }else{
            System.out.println("You need to score higher to enroll in the advanced course.");
        }
    }
}