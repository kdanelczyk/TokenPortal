package com.tokenportal.tokenportal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tokenportal.tokenportal.model.Token;

public interface TokenRepository extends MongoRepository<Token, String> {

}
