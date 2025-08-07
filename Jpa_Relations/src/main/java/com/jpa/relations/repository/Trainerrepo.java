package com.jpa.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.relations.entity.Trainer;

@Repository

public interface Trainerrepo extends JpaRepository<Trainer, Integer>{

}
