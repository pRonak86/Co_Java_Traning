package com.example.microservices.FacultyInformation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.microservices.FacultyInformation.Bean.Faculty;

@Service
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
	
}
