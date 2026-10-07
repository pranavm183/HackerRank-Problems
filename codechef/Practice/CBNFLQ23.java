// Problem: Player Score Datatype
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/skill-test/PHQSMO/problems/CBNFLQ23
// Solved on: 2026-10-07T17:48:46.281Z

class MysticOrbEnergy {
    public static void main(String[] args) {
        int alpha = 20;
        int beta = 6;
        int gamma = 4;
        int orbEnergy;

        // Calculate orbEnergy using the formula
        orbEnergy=alpha+beta*gamma-alpha/2+beta%gamma;

        System.out.println(orbEnergy);
    }
}