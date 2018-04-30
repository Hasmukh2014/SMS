package com.hp.SpringBootDemo.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	LoginRepository loginRepository;

	public void authenticate(User user) {
		
		loginRepository.count();
	}
	
}
