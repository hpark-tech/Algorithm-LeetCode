select director_id, actor_id from ActorDirector group by director_id, actor_id having count(actor_id)>=3
