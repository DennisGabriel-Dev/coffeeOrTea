package com.coffeortea.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.coffeortea.domain.Order;

public interface OrderRepository extends MongoRepository<Order, String>{

}
