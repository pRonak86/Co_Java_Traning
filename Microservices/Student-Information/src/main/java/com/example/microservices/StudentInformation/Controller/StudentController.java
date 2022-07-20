package com.example.microservices.StudentInformation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.StudentInformation.Repository.StudentRepository;
import com.example.microservices.StudentInformation.bean.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository repository;

	@PostMapping(value = "/stu", consumes = {"application/json"})
	public Student createStudent(@RequestBody Student stu) {
		Student student = repository.save(stu);
		return student;
	}

	@GetMapping(value = "/all", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Student> getAll() {
		return repository.findAll();
	}
}
