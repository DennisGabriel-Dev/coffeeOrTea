package com.coffeortea.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.coffeortea.domain.Client;

public interface ClientRepository extends MongoRepository<Client, String>{

}
