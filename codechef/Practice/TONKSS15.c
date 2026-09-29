// Problem: TONKSS15
// Platform: codechef
// Language: Student Roll Number (Int): 12345  
Converted Roll Number (Short): 12345  
Has Passed: true
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/QMDQQC/problems/TONKSS15
// Solved on: 2026-09-29T17:54:58.635Z

class Codechef {
    public static void main(String[] args) {
        // Declare and assign student roll number as int
        int rollNumber = 12_345;  // Roll number within short range

        // Explicitly convert int to short
        short convertedRollNumber =(short) rollNumber;

        // Declare and assign student pass status
        boolean hasPassed = true;  // True if the student has passed, false otherwise

        // Print all values
        System.out.println("Student Roll Number (Int): "+rollNumber);
        System.out.println("Converted Roll Number (Short): "+convertedRollNumber);
        System.out.println("Has Passed: "+hasPassed);
    }
}