package com.hp.SpringBootDemo.students;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String>{

}
