package com.auditing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.auditing.model.User;

import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends MongoRepository<User, Integer>{

}
