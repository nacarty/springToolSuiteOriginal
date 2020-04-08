package com.carty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
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
	private UserService cartyUService;  //private UserService userService;
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/users", method=RequestMethod.GET)
	public List<User> listUser(){
		return cartyUService.findAll();
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(value = "/users/{id}", method=RequestMethod.GET)
	public User getOne(@PathVariable(value = "id") Long id) {
		return cartyUService.findById(id);
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(value = "/userbyname/{name}", method=RequestMethod.GET)
	public User getUserByName(@PathVariable(value = "name") String name) {
		return cartyUService.findByName(name);
	}
	
	
	@RequestMapping(value = "/signup", method=RequestMethod.POST)
	public User saveUser(@RequestBody UserDto user) {
		System.out.println(user);
		return cartyUService.save(user);
	}
	
	@PostMapping("/signupp")
	public User saveUser2(@RequestBody UserDto user) {
		System.out.println(user);
		return cartyUService.save(user);
	}
	
	public UserController() {
		
	}
}
