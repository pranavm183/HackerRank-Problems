// Problem: Java Stdin and Stdout II
// Platform: hackerrank
// Language: Java
// Verdict: Accepted
// URL: https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
// Solved on: 2026-09-26T17:40:21.737Z

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        
        // Clear the buffer newline character left behind by nextDouble()
        scan.nextLine(); 
        
        String s = scan.nextLine();

        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}