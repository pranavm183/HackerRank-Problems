// Problem: SKDNBU05
// Platform: codechef
// Language: Total Price is : 80
Final Price after the discount is : 70
Average Price is : 35
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/TCXDPZ/problems/SKDNBU05
// Solved on: 2026-10-06T17:54:00.885Z

class Codechef {
    public static void main(String[] args) {
        // Given variables: Prices of two items and a discount amount
        int itemPrice1 = 50, itemPrice2 = 30, discount = 10;

        // Calculate total price before discount
        int totalPrice=0;
        totalPrice=itemPrice1+itemPrice2;

        // Apply discount to get the final price
        int finalPrice=0;
        finalPrice=totalPrice-discount;

        // Calculate average price per item after discount
        int averagePrice=0;
        averagePrice=finalPrice/2;

        // Print the final bill details
        System.out.println("Total Price is : "+totalPrice);    // Prints total price before discount
        System.out.println("Final Price after the discount is : "+finalPrice);    // Prints final price after discount
        System.out.println("Average Price is : "+averagePrice);  // Prints average price per item
    }
}
