package com.jpa.relations.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

public class Trainer {
	
	@Id
	private Integer id;
	private String name;
	
	@OneToMany(mappedBy="trainer",cascade=CascadeType.ALL)
	List <Trainee> trainee=new ArrayList<>();
	

}
