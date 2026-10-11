// Problem: DCTRHJ35
// Platform: codechef
// Language: Product ID: 1024  
Product Price: $249.99  
Review Match: true
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/KQKACU/problems/DCTRHJ35
// Solved on: 2026-10-11T15:43:36.990Z

class Codechef {
    public static void main(String[] args) {
        // Given Variables
        String review1 = "Excellent Product";
        String review2 = "excellent product";
        double productPrice = 249.99;
        int productId = 1024;

        // Complete the below code
        boolean isMatch = review1.equalsIgnoreCase(review2);
        
        System.out.println("Product ID: "+productId);
        System.out.println("Product Price: $"+productPrice);
        System.out.println("Review Match: "+isMatch);
    }
}
