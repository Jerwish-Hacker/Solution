package com.example.EventPlatform.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.EventPlatform.Model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{
			
	//Normally we use JDBC for custom query so I didn't aware of JPA custom query 
	
	@Query(" SELECT e.* FROM Event e LEFT JOIN Subscription s ON s.userId=e.id "
			+ "WHERE userId = ? ORDER BY e.timestamp DESC ")
	public static List<Event> findAllByOneId(long id) {
		return null;
	}
 
}
