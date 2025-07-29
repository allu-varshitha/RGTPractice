package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.entity.StudentEntity;
import com.practice.repository.StudentRepo;

@SpringBootApplication
public class CurdExampleApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(CurdExampleApplication.class, args);
		
		StudentRepo st=context.getBean(StudentRepo.class);
		
		StudentEntity s1=new StudentEntity();
		s1.setId(1);
		s1.setName("varshitha");
		s1.setPhnno(12345);
		s1.setRollno(513);
		s1.setEmail("abc@123");
		
		//save() is used to insert data into database
		st.save(s1);
		System.out.println("data inserted successfully");
		
	}

}
