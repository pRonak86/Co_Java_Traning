package com.example.microservices.FacultyInformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
public class FacultyInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacultyInformationApplication.class, args);
	}

}
