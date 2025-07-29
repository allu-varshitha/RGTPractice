package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootDemoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
		
		System.out.println("These is the 1st project");
	}

}
