package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Value(value = "${welcome.message}")
	private String message;
	
	@RequestMapping("/hello")
	public String hello() {
		return message;
	}

}
