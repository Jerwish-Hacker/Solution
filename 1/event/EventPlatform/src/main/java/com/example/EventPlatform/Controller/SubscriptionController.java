package com.example.EventPlatform.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EventPlatform.Model.Subscription;
import com.example.EventPlatform.ServiceImpl.SubscriptionServiceImpl;

@RestController
@RequestMapping("/api")
public class SubscriptionController {
	
	@Autowired
	private SubscriptionServiceImpl subscriptionServiceImpl;
		
	@PostMapping("/subscriptions")
	public String addSubscription(Subscription subscription) {
		return subscriptionServiceImpl.addSubscription(subscription);		 
	} 
	
}
