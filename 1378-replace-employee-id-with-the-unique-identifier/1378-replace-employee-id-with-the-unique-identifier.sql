/* Write your PL/SQL query statement below */
select EmployeeUNI.unique_id, Employees.name from EmployeeUNI right outer join Employees on Employees.id = EmployeeUNI.id