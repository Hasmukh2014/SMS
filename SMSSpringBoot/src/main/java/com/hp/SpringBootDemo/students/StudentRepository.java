package com.hp.SpringBootDemo.students;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

interface StudentRepositoryCustom
{
	List<Student> getEmailById(String id);
}

public interface StudentRepository extends CrudRepository<Student, String>{

	

}
