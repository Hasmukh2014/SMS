package com.hp.SpringBootDemo.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	private List<Student> students; /*= new ArrayList<Student>(Arrays.asList(
			new Student("1","Hasmukh","Patel","h@gmail.com","444444"),
			new Student("2","Pinky","Patel","p@gmail.com","444444"),
			new Student("3","Darsh","Patel","d@gmail.com","444444"),
			new Student("4","Bhrugu","Patel","b@gmail.com","444444")));*/
	
	public List<Student> getAllStudents()
	{
		//return students;
		students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}

	public Optional<Student> getStudent(String id) {
		//return students.stream().filter(t->t.getEnrollmentNumber().equals(id)).findFirst().get();
		return studentRepository.findById(id);
	}

	public void addStudent(Student student) {
		//students.add(student);
		studentRepository.save(student);
	}

	public void updateStudent(String id, Student student) {
		/*for(int i=0;i<students.size();i++) {
			if(students.get(i).getEnrollmentNumber().equals(id)) {
				students.set(i, student);
			}
		}*/
		studentRepository.save(student);
	}

	public void deleteStudent(String id) {
		//students.removeIf(t->t.getEnrollmentNumber().equals(id));
		studentRepository.deleteById(id);
	}
	
	

	
}
