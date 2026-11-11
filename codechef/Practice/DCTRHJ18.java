// Problem: DCTRHJ18
// Platform: codechef
// Language: Full Address: 123 Main St, Springfield, USA
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/java-development/KQKACU/problems/DCTRHJ18
// Solved on: 2026-11-11T11:32:48.745Z

class Codechef {
    public static void main(String[] args) {
        // Declaring strings for street, city, and country
        String street = "123 Main St";
        String city = "Springfield";
        String country = "USA";

        // Concatenating strings using concat() method
        String fullAddress = street.concat(", ").concat(city).concat(", ").concat(country);

        // Printing the concatenated address
        System.out.println("Full Address: " + fullAddress);
    }
}