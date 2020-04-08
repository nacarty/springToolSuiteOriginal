package com.carty.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

	@RequestMapping("/message")
	public String fallBack() {
		return "Fallback service is called..";
	}
}
