package com.gupt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	public String getTest2() {
		return "test2";
	}
	
	public String getHello() {
		return "getHello";
	}
}
