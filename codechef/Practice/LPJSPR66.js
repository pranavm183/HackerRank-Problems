// Problem: LPJSPR66
// Platform: codechef
// Language: JavaScript​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/javascript/LPJAS06/problems/LPJSPR66
// Solved on: 2026-11-05T14:21:50.826Z

let x = 2;
let y = 3;
let z = 1;

if (x < y) {
    if (x < z) {
        console.log(x);
    } else {
        if (y < z) {
            console.log(y);
        } else {
            console.log(z);
        }
    }
} else {
    if (y < z) {
        console.log(y);
    } else {
        if (x < z) {
            console.log(x);
        } else {
            console.log(z);
        }
    }
}
