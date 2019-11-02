package com.microideation.app.samples.mongodbdemo.repository;

import com.microideation.app.samples.mongodbdemo.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer,String>{
}
