// Problem: SQLPBP09
// Platform: codechef
// Language: SQL​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/sql-case-studies-topic-wise/SQLBP01/problems/SQLPBP09
// Solved on: 2026-11-18T10:28:02.355Z

-- your code goes here
select department,count(*) as total_employees
from Employees 
group by department;