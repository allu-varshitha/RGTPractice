package com.jpa.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.relations.entity.Trainee;
@Repository

public interface Traineerepo extends JpaRepository<Trainee, Integer> {

}
