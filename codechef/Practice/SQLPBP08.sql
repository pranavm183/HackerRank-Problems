// Problem: SQLPBP08
// Platform: codechef
// Language: SQL​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/sql-case-studies-topic-wise/SQLBP01/problems/SQLPBP08
// Solved on: 2026-11-13T06:45:10.383Z

--your code goes here
select employee_name,company,salary 
from Employees
where category = 'Full-Time'
order by salary DESC;