select round(count(customer_id) / (select count(distinct customer_id) from Delivery) * 100, 2) as immediate_percentage  from (select d1.customer_id from Delivery d1 join (select customer_id,  min(order_date) as first_order from Delivery group by customer_id) d2 on d1.customer_id=d2.customer_id where first_order=customer_pref_delivery_date) d3 