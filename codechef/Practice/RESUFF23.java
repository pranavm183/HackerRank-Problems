// Problem: RESUFF23
// Platform: codechef
// Language: Eligible for admission.
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/WPGGQR/problems/RESUFF23
// Solved on: 2026-10-24T17:54:24.036Z

class Codechef {
    public static void main(String[] args) {
        
        double percentage = 85.5; 
        int entranceScore = 75;
        boolean extracurricular = true;

        // Use an 'if-else' statement to check the eligibility criteria for admission
        // Check if all conditions are met: percentage >= 85, entranceScore >= 70, and extracurricular participation is true
        if (percentage >= 85 && entranceScore >= 70 && extracurricular) {
            System.out.println("Eligible for admission."); // Print this message if all conditions are satisfied
        } else {
            System.out.println("Not eligible for admission."); // Print this message if any condition is not satisfied
        }
    }
}
