// Problem: SGQHPG05
// Platform: codechef
// Language: rewardPoints = 120, bonusPoints = 30, expiredPoints = 10;
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/GAAKHM/problems/SGQHPG05
// Solved on: 2026-10-07T17:02:57.072Z

class Codechef {
    public static void main(String[] args) {
        // Given variables: Initial reward points, bonus points, and expired points
        int rewardPoints = 120, bonusPoints = 30, expiredPoints = 10;

        // Adjust reward points by adding bonus and subtracting expired points
        rewardPoints=rewardPoints+bonusPoints-expiredPoints;


        // Print reward points before post-increment
        System.out.println("Reward Points before post-increment "+rewardPoints);  // Prints updated reward points before increment

        // Apply post-increment to update the total points
        rewardPoints++;

        // Print updated reward points after incrementing
        System.out.println("Reward Points after post-increment "+rewardPoints);
    }
}
