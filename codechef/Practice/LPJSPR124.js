// Problem: LPJSPR124
// Platform: codechef
// Language: JavaScript​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/javascript/LPJAS11/problems/LPJSPR124
// Solved on: 2026-10-29T16:13:10.415Z

let N = parseInt(inputChar);

let sum = 0;
let product = 1;
let temp = N;

while (temp > 0) {
    let digit = temp % 10; // Get the last digit
    sum += digit;          // Add to sum
    product *= digit;      // Multiply to product
    temp = Math.floor(temp / 10); // Remove the last digit
}

console.log(sum + " " + product);