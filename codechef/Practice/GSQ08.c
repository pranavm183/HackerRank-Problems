// Problem: GSQ08
// Platform: codechef
// Language: ALTER TABLE student
    ADD COLUMN Department TEXT default NULL;
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/sql/SQ00LS02/problems/GSQ08?tab=statement
// Solved on: 2026-11-25T08:50:07.877Z

/* Write a query to add a column 'Designation' to the table and set 'Null' as the default value. Output the entire table.*/
alter table employee 
add column Designation text default Null;

select * from employee;