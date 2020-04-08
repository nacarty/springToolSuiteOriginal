package com.carty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carty.service.NigelSender;

@RestController
@RequestMapping("/root")
public class NigelController {

	@Autowired
	NigelSender sender;
	
	@GetMapping("/producer")
	public String producer(@RequestParam("msg") String message) {
		sender.sendMessage(message);
		
		return "Message sent springbootkafka successfully";
	}
}
