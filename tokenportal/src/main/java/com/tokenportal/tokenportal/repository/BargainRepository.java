package com.tokenportal.tokenportal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tokenportal.tokenportal.model.Bargain;

public interface BargainRepository extends MongoRepository<Bargain, String> {
    
}

