package com.tokenportal.tokenportal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tokenportal.tokenportal.model.Purchase;

public interface PurchaseRepository extends MongoRepository<Purchase, String> {
    
}
