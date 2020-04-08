package com.carty;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
@RequestMapping("/secondservice")
public class SecondController {
	
	@GetMapping("/message")
	public String test() {
		return "Welcome to the world of Second Service";
	}
	
}
