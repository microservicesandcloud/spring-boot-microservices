package com.msandcloud.application.springbootstarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msandcloud.application.springbootstarter.domain.HelloWorldBean;

@RestController
public class SpringBootStarterController {
	
	@GetMapping(path="/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/helloWorldBean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

}
