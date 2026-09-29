// Problem: TONKSS18
// Platform: codechef
// Language: Employee Details - ID: 101, Salary: 50000
Outside the block - Employee ID: 101
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/QMDQQC/problems/TONKSS18
// Solved on: 2026-09-29T18:12:35.246Z

class Codechef {
    public static void main(String[] args) {
        int employeeId = 101; // Employee ID is accessible throughout the method

        {
            int salary = 50000; // Salary is only accessible inside this block
            System.out.println("Employee Details - ID: " + employeeId + ", Salary: " + salary);
        }

        System.out.println("Outside the block - Employee ID: " + employeeId);
        // System.out.println("Salary: " + salary); // Uncommenting this line will cause a compilation error
    }
}
