package com.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/")
	public String toString(){
		return "Hello world！";
	}
	/*@Autowired
	private TestInfo test;
	
	@RequestMapping("/test")
	public String hello(){
		System.out.println(test.toString());
		return "Hello world！";
	}*/
}
