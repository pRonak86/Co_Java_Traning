package com.example.microservices.FacultyInformation.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.FacultyInformation.Bean.Faculty;
import com.example.microservices.FacultyInformation.Repository.FacultyRepository;

@RestController
public class FacultyController {
	@Autowired
	private FacultyRepository facultyRepository;
	
//	@Autowired
//	private FacultyGetdetailsProxy proxy;
	
	@PostMapping(path = "/addFaculty")
	public Faculty addFaculty(@RequestBody Faculty faculty)
	{
		return facultyRepository.save(faculty); 
	}
	
	@GetMapping(path="/fetchAll")
	public List<Faculty> fetchAll()
	{
		return facultyRepository.findAll();
	}
	
	@GetMapping(path="/fetch/id/{id}")
	public Optional<Faculty> fetchbyId(@PathVariable Long id)
	{
		
		return facultyRepository.findById(id);
	}

//		
//	@GetMapping(path="/fetch-feign/id/{id}")
//	public Optional<Faculty> fetchbyIdfeign(@PathVariable Long id)
//	{
//		Optional<Faculty> f = proxy.fetchbyId(id);
//		return f;
//	}
}
