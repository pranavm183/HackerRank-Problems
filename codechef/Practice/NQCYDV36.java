// Problem: NQCYDV36
// Platform: codechef
// Language: Average = (num1 + num2 + num3) / 3
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/SZPQQMA/problems/NQCYDV36
// Solved on: 2026-10-27T16:48:37.697Z

class CodeChef {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;
        double average = (num1 + num2 + num3) / 3;  // Logical error: Wrong precedence

        System.out.println("The calculated average is: " + average); // it will print 40.0, which is wrong
    }
}