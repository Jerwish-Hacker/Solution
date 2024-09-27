package com.example.EventPlatform.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EventPlatform.Model.Event;
import com.example.EventPlatform.ServiceImpl.EventServiceImpl;

@RestController
@RequestMapping("/api")
public class EventController {

	@Autowired
	private EventServiceImpl eventService;
		
	
	@PostMapping("/events")
	public String addEvent(@RequestBody Event event) {
		return eventService.addEvent(event);		
	}
	
	@GetMapping("/events/{userId}")
	public Optional<Event> getEventById(@PathVariable long userId) {
		return eventService.getEventById(userId);
	}
}
