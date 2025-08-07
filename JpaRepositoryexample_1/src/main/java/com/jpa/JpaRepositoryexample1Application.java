package com.jpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.jpa.entity.Employee;
import com.jpa.repository.EmpRepo;

@SpringBootApplication
public class JpaRepositoryexample1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(JpaRepositoryexample1Application.class, args);
	
	EmpRepo repo=context.getBean(EmpRepo.class);
	
	Employee e1=new Employee(1,"varshitha", 21);
	Employee e2=new Employee(2,"Uday", 19);
	Employee e3=new Employee(3,"Janu", 25);
	Employee e4=new Employee(4,"maha", 22);
	Employee e5=new Employee(5,"lakshmi", 23);
	Employee e6=new Employee(6,"Uday", 24);
	Employee e7=new Employee(7,"bheem", 35);
	Employee e8=new Employee(8,"ram", 45);
	Employee e9=new Employee(9,"Janaki", 22);
	Employee e10=new Employee(10,"dev", 18);

	
//	repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10));
	
//	List<Employee>emp=null;
//		emp=repo.findAll();
//	
//	emp.forEach(System.out::println);
//	
   
//emp = repo.findAll();
//
//emp.forEach(System.out::println);
	
	
	
//	<-------   pagination--------->
	
//	int pageno=3;//page no
//	int pagesize=3;// no of records 
//	PageRequest page=PageRequest.of(pageno-1, pagesize);
//	
//	Page<Employee>pageemp=repo.findAll(PageRequest.of(pageno-1, pagesize));
//	pageemp.forEach(System.out::println);
//	
	
	
	//<----- Query by Example------->
	//fetch the data from the table whose name is uday
	Employee emp=new Employee();//dummy object
	
    emp.setName("Uday");
//	emp.setAge(22);
	Example<Employee>e=Example.of(emp);
	List<Employee>emp1=repo.findAll(e);
	System.out.println(emp);
	emp1.forEach(System.out::println);

	
	
	

	}
}
