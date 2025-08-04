package com.jpa.relations.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.relations.entity.Trainee;
import com.jpa.relations.entity.Trainer;
import com.jpa.relations.repository.Traineerepo;
import com.jpa.relations.repository.Trainerrepo;


@Component
public class OneToManyAndManyToOne  implements CommandLineRunner{
	
	@Autowired
	private Trainerrepo tr;
	


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Trainer trainer1=new Trainer();
		
		trainer1.setId(1);
		trainer1.setName("varshitha");
		
		Trainee tr1=new Trainee();
		tr1.setId(1);
		tr1.setName("Dinga");
		tr1.setTrainer(trainer1);
		
		Trainee tr2=new Trainee();
		tr2.setId(2);
		tr2.setName("kiran");
		tr2.setTrainer(trainer1);
		
		Trainee tr3=new Trainee();
		tr3.setId(3);
		tr3.setName("uday");
		tr3.setTrainer(trainer1);
		
		trainer1.setTrainee(Arrays.asList(tr1,tr2,tr3));
		
		
		tr.save(trainer1);
		
		
		
		
		
	}

}
