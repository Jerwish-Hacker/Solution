package com.example.EventPlatform.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EventPlatform.Model.Event;
import com.example.EventPlatform.Repository.EventRepository;
import com.example.EventPlatform.Service.EventService;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private static EventRepository eventRepo;
	
		
	@Override
	public String addEvent(Event event) {	
		try {		
			eventRepo.save(event);
			return "Success";
		}
		catch(Exception e){
			return "Error - " +e;
		}		
	}

	@Override
	public Optional<Event> getEventById(long userId) {		
		Optional<Event> result=eventRepo.findById(userId);	
		//Normally we use JDBC for custom query so I didn't aware of JPA custom query 
		return result;
	}
}
