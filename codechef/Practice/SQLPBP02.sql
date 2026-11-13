// Problem: SQLPBP02
// Platform: codechef
// Language: SQL​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/sql-case-studies-topic-wise/SQLBP01/problems/SQLPBP02
// Solved on: 2026-11-13T06:29:06.770Z

SELECT COUNT(*) AS fiction_count
FROM Books
WHERE genre = 'Fiction';
