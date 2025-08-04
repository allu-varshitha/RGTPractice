package com.jpa.relations.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.relations.entity.Passport;
import com.jpa.relations.entity.Person;
import com.jpa.relations.repository.Personrepo;
import com.jpa.relations.repository.passportrepo;

// @Component
public class OneToOneRunner implements CommandLineRunner {
	//unable to store duplicates fk from one to one relations 

	
	@Autowired
	private Personrepo pr;
	
	@Autowired
	private passportrepo  passr;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Passport pass1=new Passport(1,"IND123");
//		Passport pass2=new Passport(2,"IND456");
		
		
		passr.save(pass1);// savinng passport object
		Person p1=new Person(1, "Varshitha", pass1);
//		Person p2=new Person(2, "Uday kiran", pass2);

		
		
		pr.save(p1);// savingonly person object will also save passport objects
		List<Person> p=pr.findAll();
		p.forEach(System.out::println);
	}

}
