package com.example.EventPlatform.Service;

import java.util.Optional;

import com.example.EventPlatform.Model.Event;

public interface EventService {
	
	public String addEvent(Event event);
	
	public Optional<Event> getEventById(long userId);

}
