package com.carty;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstservice")
public class FirstController {
	
	@GetMapping("/message")
	public String test() {
		return "<div style='color:blue'>Welcome to the world of First Service</div>";
	}
	
}
