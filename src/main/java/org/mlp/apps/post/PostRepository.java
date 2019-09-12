package org.mlp.apps.post;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostRepository extends JpaRepository<Post, Integer> {
	
	@Query(
		value = "select m.* from (select me.\"id\", max(ms.\"id\") as "
	  		+ "lastResponse, case when max(ms.\"id\") is null then me.\"id\" "
	  		+ "else max(ms.\"id\") end as rang from message as me "
	  		+ "left join message as ms on me.\"id\" = ms.\"parent_id\" "
	  		+ "where me.\"parent_id\" is null "
	  		+ "group by me.\"id\" order by rang DESC) as s join message as m "
	  		+ "on s.\"id\" = m.\"id\" "
	  		+ "where (m.deleted = false or m.deleted is null) "
	  		+ "and (m.censored = false or m.censored is null) "
	  		+ "order by rang desc",
  		countQuery = "SELECT count(*) FROM (select me.\"id\", max(ms.\"id\") as "
	  		+ "lastResponse, case when max(ms.\"id\") is null then me.\"id\" "
	  		+ "else max(ms.\"id\") end as rang from message as me "
	  		+ "left join message as ms on me.\"id\" = ms.\"parent_id\" "
	  		+ "where me.\"parent_id\" is null"
	  		+ "group by me.\"id\" order by rang DESC) as s join message as m "
	  		+ "on s.\"id\" = m.\"id\" "
	  		+ "where (m.deleted = false or m.deleted is null) "
	  		+ "and (m.censored = false or m.censored is null) ",
	  nativeQuery = true)
	public Page<Post> findTopPublication(Pageable pageable);
}
