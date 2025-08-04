package com.jpa.relations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	
	@Id
	private  Integer id;
	private String name;
	
	@OneToOne// one person has one relation or(by deleting every row,column,database from sql) we will use these as
	                                     //OneToOne(cascade=CasCadeType.ALL) then run 
	
	@JoinColumn(name="passId")// to create a foreign key in person tablee
	private Passport passport;//has a relation
	

}
