// Problem: SQLPBP15
// Platform: codechef
// Language: SQL​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/sql-case-studies-topic-wise/SQLBP01/problems/SQLPBP15
// Solved on: 2026-11-12T16:54:34.932Z

-- your code goes here
SELECT department_name, location 
FROM departments 
WHERE location LIKE 'S%';
