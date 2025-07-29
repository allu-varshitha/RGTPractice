package com.practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
 
@Entity // This annotation defines that a class can be mapped to a table
@Data   // which is equals to getters,setters,tostring,constructor

@Table(name="Student")
public class StudentEntity {// table
	
	@Id
	
	private int id;// represents primary key  for the column
	private String name;//columns
	private long phnno;
	private String email;
	private int rollno;

}
