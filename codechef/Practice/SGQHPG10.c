// Problem: SGQHPG10
// Platform: codechef
// Language: Stocks after Pre-increment 51
Leftover packs are 3
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/GAAKHM/problems/SGQHPG10
// Solved on: 2026-10-07T17:08:45.044Z

class Codechef {
    public static void main(String[] args) {
        int stockCount = 50, itemsPerPack = 6;

        int updatedStock = ++stockCount;  // Pre-increment stock count when new stock arrives
        int remainingItems = updatedStock%itemsPerPack; // Find leftover items after full packing

        System.out.println("Stocks after Pre-increment "+updatedStock);
        System.out.println("Leftover packs are "+remainingItems);
    }
}
