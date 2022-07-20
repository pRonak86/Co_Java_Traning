package com.example.microservices.StudentInformation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.microservices.StudentInformation.bean.Student;

@Service
public interface StudentRepository extends JpaRepository<Student, Long> {

}
