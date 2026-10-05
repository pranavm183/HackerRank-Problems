// Problem: CRQDWE20
// Platform: codechef
// Language: 42  
4
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/NREETQ/problems/CRQDWE26
// Solved on: 2026-10-05T17:40:47.420Z

class Codechef {
    public static void main(String[] args) {
        // Write your code here
        int students = 10, packsOfCandies = 5, candiesPerPack = 8, extraCandies = 2;
        
        int totalCandies=(packsOfCandies*candiesPerPack)+extraCandies;
        
        int averageCandies=totalCandies/students;
        
        System.out.println(totalCandies);
        System.out.println(averageCandies);
        
        
        
    }
}
