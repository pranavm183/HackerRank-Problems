// Problem: GSQ07
// Platform: codechef
// Language: ┌─────────────┬────────────────┬────────────┐
│ Employee_id │ Employee_Name  │ Department │
├─────────────┼────────────────┼────────────┤
│ 1           │ Kayla Thompson │ Sales      │
│ 2           │ Ethan Chen     │ Operations │
│ 3           │ Julia Lee      │ Hr         │
│ 4           │ Marcus Garcia  │ Product    │
│ 5           │ Samantha Park  │ Operations │
└─────────────┴────────────────┴────────────┘
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/sql/SQ00LS01/problems/GSQ07
// Solved on: 2026-11-24T16:26:06.997Z

/* Write a query to add the below mentioned employee details to the EMPLOYEE table.
Employee id: 06, Employee Name: Brandon Kim, Department: Operations
*/
insert into employee (Employee_id,Employee_Name,Department)
values(6,'Brandon kim','Operations');