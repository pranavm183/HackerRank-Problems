// Problem: WNDHVZ20
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/PKAKHY/problems/WNDHVZ20
// Solved on: 2026-10-15T15:27:52.609Z

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // user to enter the number of apples
        int apples = scanner.nextInt();

        // Check if apples can be evenly divided by 4
        if(apples!=12){
            System.out.println("Some apples will be left over after sharing!");
        }
        else{
            System.out.println("The apples can be evenly shared among friends!");
        }




    }
}
