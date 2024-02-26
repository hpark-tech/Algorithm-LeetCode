/* Write your PL/SQL query statement below */
select * from Cinema having mod(id, 2)!=0 and description != 'boring' group by id, movie, description, rating order by rating desc