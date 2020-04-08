package com.carty.repo;

import org.springframework.data.mongodb.repository.MongoRepository; //some implementations have org.springframework.data."mongo".repository.MongoRepository;
import com.carty.model.Product;

public interface ProductRepo extends MongoRepository<Product, Integer>{ //an interface extends another interface; not implements it
	
}
