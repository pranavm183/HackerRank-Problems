// Problem: Player Score Datatype
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/skill-test/PHQSMO/problems/CBNFLQ10
// Solved on: 2026-10-07T17:38:29.524Z

class RecipeAdjuster {
    public static void main(String[] args) {
        int originalServings = 24; // Original recipe makes 24 cookies
        double flourCups = 2.5;
        double chocoChipsOunces = 8.0;

        //Triple the recipe quantities.
        flourCups *= 3;
        chocoChipsOunces *= 3;
        
        

        //Adjust chocolate chips. The baker only has enough for half of the tripled amount.
        chocoChipsOunces /= 2;
        

    
        System.out.println(flourCups);
        System.out.println(chocoChipsOunces);
    }
}