// Problem: LPJSPR122
// Platform: codechef
// Language: JavaScript​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/javascript/LPJAS11/problems/LPJSPR122
// Solved on: 2026-10-29T15:59:46.392Z

  let N = parseInt(inputChar);
  let i=1;
  let fact=1;
  // Write your code here
  while(i<=N){
      fact=fact*i;
      
      i++;
  }
  console.log(fact);