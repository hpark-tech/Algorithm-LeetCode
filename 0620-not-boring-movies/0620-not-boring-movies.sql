/* Write your PL/SQL query statement below */
select * from Cinema having mod(id, 2)!=0 and description != 'boring' group by id, movie, description, rating order by rating desc

/*집계함수는 group by 필수 (select절에 집계함수만 있을 시에만 생략가능. 이 경우엔 전체 row가 하나의 그룹*/
