select id from (select id, temperature, recordDate,  lag(recordDate) over(order by recordDate) as lagday, lag(temperature) over(order by recordDate) as lagTemperature, date_sub(recordDate, interval 1 day) as yesterday from Weather) as newTable where temperature > lagTemperature and lagday = yesterday