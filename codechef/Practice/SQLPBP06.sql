// Problem: SQLPBP06
// Platform: codechef
// Language: SQL​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/sql-case-studies-topic-wise/SQLBP01/problems/SQLPBP06
// Solved on: 2026-11-17T14:11:43.023Z

-- your code goes here
select author_id,author_name,publication_name from Views
where view_count = 0
order by author_id asc;