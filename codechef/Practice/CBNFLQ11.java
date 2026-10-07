// Problem: Player Score Datatype
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/skill-test/PHQSMO/problems/CBNFLQ11
// Solved on: 2026-10-07T17:42:11.467Z

class BookstoreInventory {
    public static void main(String[] args) {
        int initialStock=150;
        int receivedStock=75;
        int soldStock=45;
        
        int currentStock=initialStock;
        
        currentStock=currentStock+receivedStock-soldStock;
        
        System.out.println("Final stock: "+currentStock);
        
        
        
    }
}