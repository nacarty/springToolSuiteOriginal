package com.carty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMyBusinessLogic {

	@GetMapping("/")
	public String myBusinessLogic() {
		return "Welcome to my world!"+"..successful login";
		
		//pwd:e7749c08-67be-4aa8-bfa0-d392a2b83b8e
	}
}
