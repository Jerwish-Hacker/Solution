package com.example.EventPlatform.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EventPlatform.Model.Subscription;


@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {

}
