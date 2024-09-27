package com.example.EventPlatform.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EventPlatform.Model.Subscription;
import com.example.EventPlatform.Repository.SubscriptionRepository;
import com.example.EventPlatform.Service.SubscriptionService;

@Service
public class SubscriptionServiceImpl implements SubscriptionService{
	
	@Autowired
	private SubscriptionRepository subscriptionRepo;

	@Override
	public String addSubscription(Subscription subscription) {		
		try {		
			subscriptionRepo.save(subscription);
			return "Success";
		}
		catch(Exception e){
			return "Error - " +e;
		}	
		
		
	}

}
