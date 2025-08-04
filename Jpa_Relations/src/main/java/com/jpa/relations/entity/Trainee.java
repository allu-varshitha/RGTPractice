package com.jpa.relations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Trainee {

	@Id
	private Integer id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="trainer_id")
	private Trainer trainer;
	
	
	
	
}
