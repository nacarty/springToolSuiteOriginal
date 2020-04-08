package com.carty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carty.model.User;
import com.carty.model.UserDto;
import com.carty.service.UserService;

@CrossOrigin(origins="*", maxAge = 3600)
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/users", method=RequestMethod.GET)
	public List<User> listUser(){
		return userService.findAll();
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(value = "/users/{id}", method=RequestMethod.GET)
	public User getOne(@PathVariable(value = "id") Long id) {
		return userService.findById(id);
	}
	
	@RequestMapping(value = "/signup", method=RequestMethod.POST)
	public User saveUser(@RequestBody UserDto user) {
		return userService.save(user);
	}
	
	//This end point does not work. We need to use the format shown above
	@PostMapping("/signupp")
	public User saveUser2(@RequestBody UserDto user) {
		return userService.save(user);
	}
	
	public UserController() {
		
	}
}
