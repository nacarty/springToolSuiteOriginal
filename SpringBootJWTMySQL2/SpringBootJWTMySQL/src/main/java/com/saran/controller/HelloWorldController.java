package com.saran.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping({ "/jwtdatabase" })
	public String firstPage() {
		return "User Name and Pasword validated from the MySQL DB";
	}

}