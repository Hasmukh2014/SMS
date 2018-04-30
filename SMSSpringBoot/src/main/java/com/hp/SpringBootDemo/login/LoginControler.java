package com.hp.SpringBootDemo.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginControler {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping
	public String getLoginPage()
	{
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public void authenticateUser(@RequestBody User user)
	{
		loginService.authenticate(user);
	}
	

}
