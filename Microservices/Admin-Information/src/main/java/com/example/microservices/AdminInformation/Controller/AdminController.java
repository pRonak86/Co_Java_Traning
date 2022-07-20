package com.example.microservices.AdminInformation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.AdminInformation.Repository.AdminRepository;
import com.example.microservices.AdminInformation.bean.Admin;

@RestController
public class AdminController {
	
	@Autowired
	private AdminRepository repository;
	
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin )
	{
		return repository.save(admin);
	}
	@GetMapping("/fetchAdminAll")
	public List<Admin> getAllAdmin()
	{
		return repository.findAll();
	}
}
