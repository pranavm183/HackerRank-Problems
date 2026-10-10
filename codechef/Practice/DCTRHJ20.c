// Problem: DCTRHJ20
// Platform: codechef
// Language: customerName = "Alice"
orderedDish = "Pasta"
totalPrice = 12.99
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/KQKACU/problems/DCTRHJ20
// Solved on: 2026-10-10T17:33:10.365Z

class Codechef {
    public static void main(String[] args) {
        // Given Variables
        String customerName = "Alice";
        String orderedDish = "Pasta";
        double totalPrice = 12.99;

        // Correctly chaining concat() and converting the double to a String
        String orderSummary = "Customer: ".concat(customerName)
                            .concat("\nOrdered Dish: ")
                            .concat(orderedDish)
                            .concat("\nTotal Price: $")
                            .concat(String.valueOf(totalPrice))
                            .concat("\nOrder Summary: ")
                            .concat(customerName)
                            .concat(" ordered ")
                            .concat(orderedDish)
                            .concat(". The total price is $")
                            .concat(String.valueOf(totalPrice))
                            .concat(".");

                                
        // Print the final order summary
        System.out.println(orderSummary);
    }
}
