package com.tokenportal.tokenportal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tokenportal.tokenportal.model.Sale;

public interface SaleRepository extends MongoRepository<Sale, String> {
    
}
