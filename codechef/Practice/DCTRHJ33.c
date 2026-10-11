// Problem: DCTRHJ33
// Platform: codechef
// Language: Is the password correct? true
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/KQKACU/problems/DCTRHJ33
// Solved on: 2026-10-11T15:39:35.760Z

class Codechef {
    public static void main(String[] args) {
        // Declaring the correct password and the user input
        String correctPassword = "SecurePass";  // Stored password
        String userInput = "securepass";        // User input

        // Using equalsIgnoreCase to compare both strings ignoring case
        boolean isPasswordCorrect = correctPassword.equalsIgnoreCase(userInput);

        // Printing the result
        System.out.println("Is the password correct? " + isPasswordCorrect);  // Output: true
    }
}