// Problem: CRQDWE25
// Platform: codechef
// Language: Last digit of vehicle number: 8  
Even/Odd check (0 = Even, 1 = Odd): 0
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/NREETQ/problems/CRQDWE25
// Solved on: 2026-10-02T16:35:59.961Z

// Declare class Codechef 
class Codechef {
    
    //  Define the main method
    public static void main(String[] args) {
        
        //  Declare an integer variable for the vehicle number
        int vehicleNumber = 278; 
        
        //  Declare variables lastDigit and evenOdd to store the output.
        int lastDigit;
        int evenOdd;

        //  Extract the last digit using modulus
        lastDigit=vehicleNumber%10;

        //  Check if the number is even or odd using modulus
        if(lastDigit%2==0)
          evenOdd=0;
        else
            evenOdd=1;
          
        //  Print the results
        System.out.println("Last digit of vehicle number: " + lastDigit);
        System.out.println("Even/Odd check (0 = Even, 1 = Odd): " + evenOdd);
    }
}
