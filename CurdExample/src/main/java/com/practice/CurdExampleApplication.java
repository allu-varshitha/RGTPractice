package com.practice;

import java.util.Arrays;
import java.util.Optional;

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
//		st.save(s1);
//		System.out.println("data inserted successfully");
		StudentEntity s2=new StudentEntity();
		s2.setId(2);
		s2.setName("Kiran reddy");
		s2.setPhnno(664999);
		s2.setRollno(609);
		s2.setEmail("xetr@123");
		//save() is used to insert data into database
//		st.save(s2);
//		<------- saveAll()------->
		
		StudentEntity s3=new StudentEntity(3, "janu",23345 ,"ade@123",522);
		StudentEntity s4=new StudentEntity(4, "maha", 4321, "ser@123", 567);
//		st.saveAll(Arrays.asList(s3,s4));
		
		
		//<----- findById()------> to fetch one record  based on primary key id
//		int id=2;
//		Optional<StudentEntity>se=st.findById(id);
//		if(se.isPresent()) {
//			System.out.println(se.get());
//		}else {
//			System.out.println("Student with"+" "+id+" "+"not available");
//		}
		
		
		//-------findAllById------->to fetch multiple records  by a list of ids
		
		
//		Iterable<StudentEntity>stid=st.findAllById(Arrays.asList(3));	
//		for(StudentEntity ste:stid) {
//			System.out.println(ste);
//		}
//		System.out.println("all feteched ");
//		
//		
		
		//count()
		
//		System.out.println(st.count());
		
	
		//deletebyid()---deletes the record based on id
//		
//		int id=4;
//		if(st.existsById(id)) {
//			st.deleteById(id);
//			System.out.println("Record deleted");
//		}else {
//			System.out.println("no stdent with these id: "+id);
//		}
		
		
	// delete() --delete a record based on its object
		
//		st.delete(s3);
//		System.out.println("deleted student based on entity");
//		
		
		
		
		//deleteAllbyId()----delete multiple records
		
		st.deleteAllById(Arrays.asList(3,4));
	}

}
