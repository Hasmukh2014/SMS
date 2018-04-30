package com.hp.SpringBootDemo.login;

import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<User, String>{

}
