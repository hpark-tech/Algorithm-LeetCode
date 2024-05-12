# Write your MySQL query statement below
select employee_id from Employees where manager_id not in(select distinct employee_id from Employees) and salary<30000