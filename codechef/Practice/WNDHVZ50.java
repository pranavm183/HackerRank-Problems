// Problem: WNDHVZ50
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/PKAKHY/problems/WNDHVZ50
// Solved on: 2026-10-18T12:19:09.771Z

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for delivery conditions
        boolean isWithinCity = scanner.nextBoolean();
        int orderTime = scanner.nextInt();
        
        // Checking eligibility for same-day delivery (Destination in city OR order time before 14:00)
        if (isWithinCity || orderTime < 14) {
            System.out.println("Package qualifies for same-day delivery.");
        } else {
            System.out.println("Package does not qualify for same-day delivery.");
        }
        
        scanner.close();
    }
}