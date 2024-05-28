SELECT DISTINCT num AS ConsecutiveNums
FROM (
    SELECT 
        num,
        LEAD(num, 1) OVER (ORDER BY id) AS nextnum,
        LEAD(num, 2) OVER (ORDER BY id) AS nextnextnum
    FROM Logs
) AS s1
WHERE num = nextnum AND num = nextnextnum;