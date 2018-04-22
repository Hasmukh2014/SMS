package com.hp.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("hello")
	public String Hi()
	{
		return "Hi";
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "Home Page";
	}
}
