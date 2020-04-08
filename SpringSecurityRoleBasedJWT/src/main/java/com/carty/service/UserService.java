package com.carty.service;

import java.util.List;


import com.carty.model.User;
import com.carty.model.UserDto;



public interface UserService{

	    User save(UserDto user); //UserDto
		List<User> findAll();
		void delete(long id);
		User findOne(String username);
		User findById(Long id); //could be long instead of Long
	
}
