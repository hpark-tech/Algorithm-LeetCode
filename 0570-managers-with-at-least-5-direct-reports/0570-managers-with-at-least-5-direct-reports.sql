select name from Employee where id in (select managerId from (select managerId, count(managerId) from Employee group by managerId having count(managerId)>=5) as t1)
-- select name from Employee e1 join (select managerId, count(managerId) from Employee group by managerId having count(managerId)>=5) e2 on e1.id=e2.managerId
