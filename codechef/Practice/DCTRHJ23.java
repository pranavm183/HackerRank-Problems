// Problem: DCTRHJ23
// Platform: codechef
// Language: Original Message: Java Programming  
New Message: Java Programming is fun!
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/KQKACU/problems/DCTRHJ23
// Solved on: 2026-10-10T17:35:33.163Z

class Codechef {
    public static void main(String[] args) {
        // Declaring a String
        String originalMessage = "Java Programming";
        
        // try to update original string
        originalMessage.concat(" is fun!");
        
        // Concatenating a new string (creates a new string object)
        String newMessage = originalMessage.concat(" is fun!");
        
        // Printing both the original and new string
        System.out.println("Original Message: " + originalMessage); // Output: Java Programming
        System.out.println("New Message: " + newMessage); // Output: Java Programming is fun!
    }
}
