// Problem: SGQHPG23
// Platform: codechef
// Language: Discount Percentage: 8%
Remaining Purchases: 3
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/GAAKHM/problems/SGQHPG23
// Solved on: 2026-10-07T17:19:45.017Z

class Codechef {
    public static void main(String[] args) {
        int purchases = 3; // Initial number of purchases

        // Calculating discount with pre-increment
        int discount = ++purchases * 2;

        // Printing discount and remaining purchases
        System.out.println("Discount Percentage: " + discount + "%");
        System.out.println("Remaining Purchases: " + --purchases);
    }
}