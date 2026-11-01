// Problem: PWTIEX29
// Platform: codechef
// Language: class Calculator {
    public int add(int a, int b) {
        return a + b;  // Adding two integers and returning the result
    }

    public String add(String a, String b) {
        return a + b;  // Concatenating two strings and returning the result
    }
}

public class Codechef {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));      // Method with integer parameters
        System.out.println(calc.add("Hello", "World"));  // Method with string parameters
    }
}
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/BGDCIA/problems/PWTIEX29
// Solved on: 2026-11-01T17:32:04.704Z

// source not captured automatically - copy it from the editor and use Manual Push