// Problem: WNDHVZ35
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/PKAKHY/problems/WNDHVZ35
// Solved on: 2026-10-16T15:35:11.836Z

import java.util.*;
// This class demonstrates the use of statements and semicolons in Java.
class Codechef {

    // The main method serves as the entry point for the program.
    public static void main(String[] args) {
        
        // write your code here
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        
        
        
        if(age<60){
            int diff=60-age;
            System.out.println("You are not eligible for a senior citizen discount.");
            System.out.println("You need to wait "+diff+" more years to qualify.");
        }
        else{
            
            System.out.println("You are eligible for a senior citizen discount!");
            System.out.println("Enjoy your discounted movie ticket.");
        }
    }
}