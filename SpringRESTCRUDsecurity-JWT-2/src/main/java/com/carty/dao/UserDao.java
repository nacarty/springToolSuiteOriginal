package com.carty.dao;

import org.springframework.data.repository.CrudRepository;

import com.carty.model.User;


public interface UserDao extends CrudRepository<User, Long> { //see about this

	User findByUsername(String username); 
	//apart from the default methods associated with the CRUD repository
	//which find objects based on the Id specified in the User class definition,
	//you can define what other fields you would like to find users by such as username
}
