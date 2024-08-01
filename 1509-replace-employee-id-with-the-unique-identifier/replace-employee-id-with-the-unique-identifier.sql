# Write your MySQL query statement below
select EmployeeUNI.unique_id as unique_id, Employees.name as name
from Employees LEFT JOIN EmployeeUNI ON Employees.id=EmployeeUNI.id 


/*
# Write your MySQL query statement below
select 
eu.unique_id as unique_id, e.name as name
from Employees e left join EmployeeUNI eu on e.id = eu.id
*/