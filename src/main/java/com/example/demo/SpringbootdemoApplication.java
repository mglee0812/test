package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootdemoApplication {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) { 
		return application.sources(SpringApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}
