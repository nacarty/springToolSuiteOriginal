package com.carty;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NigelController {

	@RequestMapping({ "/jwt" })
	public String display() {
		return "Welcome to JWT after passing JWT in the header";
	}

}
