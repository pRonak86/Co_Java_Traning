package com.example.SampleWebProject.AWSEC2webAPP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Awsec2WebAppApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Awsec2WebAppApplication.class, args);
	}
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(Awsec2WebAppApplication.class);
	}

}
