package com.msandcloud.application.springbootstarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootStarterController {
	
	@GetMapping(path="/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}

}
