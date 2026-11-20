// Problem: SQLPBP07
// Platform: codechef
// Language: SQL​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/sql-case-studies-topic-wise/SQLBP01/problems/SQLPBP07
// Solved on: 2026-11-20T08:25:00.796Z

-- your code goes here
select book_id,title,author,published_year from Library
where rating is NULL;