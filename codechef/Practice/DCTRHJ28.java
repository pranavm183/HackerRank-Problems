// Problem: DCTRHJ28
// Platform: codechef
// Language: Is str1 equal to str2? true
Is str1 equal to str3? false
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/KQKACU/problems/DCTRHJ28
// Solved on: 2026-10-11T15:29:47.755Z

class Codechef {
    public static void main(String[] args) {
        // Declaring and initializing strings
        String str1 = "Good Morning";
        String str2 = "Good Morning";
        String str3 = "Good Evening";

        // Comparing strings using equals()
        boolean isEqual1 = str1.equals(str2); // Comparing str1 and str2
        boolean isEqual2 = str1.equals(str3); // Comparing str1 and str3

        // Printing the results
        System.out.println("Is str1 equal to str2? " + isEqual1); // Output: true
        System.out.println("Is str1 equal to str3? " + isEqual2); // Output: false
    }
}