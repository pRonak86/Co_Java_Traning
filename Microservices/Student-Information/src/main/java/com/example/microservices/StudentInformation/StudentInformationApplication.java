package com.example.microservices.StudentInformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentInformationApplication.class, args);
	}

}
