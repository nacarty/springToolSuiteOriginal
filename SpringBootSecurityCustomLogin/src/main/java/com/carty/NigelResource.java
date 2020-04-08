package com.carty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NigelResource {

	@GetMapping("/user")
	public String userApi() {
		return "USer has two roles(USer and Admin) with authentication";
	}
	
	@GetMapping("/admin")
	public String adminApi() {
		return "Admin API with authentication";
	}
}
