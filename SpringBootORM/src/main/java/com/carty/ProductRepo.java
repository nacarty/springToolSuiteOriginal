package com.carty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
	//This interface is used to setup a repository framework for the Product Entity.
	//The JpaRepository requires two arguments (the class to be stored in the Entity, Id Type) 
}
