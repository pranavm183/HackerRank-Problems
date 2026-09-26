// Problem: Java Stdin and Stdout I
// Platform: hackerrank
// Language: C
// Verdict: Accepted
// URL: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
// Solved on: 2026-09-26T17:36:03.717Z

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}