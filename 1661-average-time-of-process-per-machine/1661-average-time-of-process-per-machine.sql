select machine_id, round(avg(end_time-start_time), 3) as processing_time from(SELECT 
        machine_id, process_id,
        min(CASE WHEN activity_type = 'start' THEN timestamp END) AS start_time,
        min(CASE WHEN activity_type = 'end' THEN timestamp END) AS end_time    FROM
        Activity
    GROUP BY machine_id, process_id) as table2 group by machine_id