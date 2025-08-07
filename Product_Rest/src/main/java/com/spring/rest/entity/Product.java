package com.spring.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity  // to map with the database table we use,fancy name of java class
@Data    // it is equal to getters,setters,tostring --->lombok[=
public class Product {
	
	@Id //  It marks field as primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) // to auto-increment the id values
	private Integer id;
	private String name;
	private String description;
	private Double price;
	
	

}
