package com.microideation.app.samples.mongodbdemo.repository;

import com.microideation.app.samples.mongodbdemo.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order,String>{
}
