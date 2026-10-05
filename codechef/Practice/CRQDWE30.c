// Problem: CRQDWE30
// Platform: codechef
// Language: Total Amount in INR: 100.0  
Exchange Rate (1 USD to INR): 82.5  
Converted Amount in USD: 1.2121212121212122
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/NREETQ/problems/CRQDWE21
// Solved on: 2026-10-05T17:42:05.425Z

class Codechef {
    public static void main(String[] args) {
        // Declare a double variable for total amount in USD
        double totalAmountUSD = 100.0; 

        // Declare a double variable for the exchange rate
        double exchangeRate = 82.5; 

        double convertedAmount=totalAmountUSD/exchangeRate;
        
        System.out.println("Total Amount in INR: "+totalAmountUSD);
        System.out.println("Exchange Rate (1 USD to INR): "+exchangeRate);
        System.out.println("Converted Amount in USD: "+convertedAmount);
    }
}