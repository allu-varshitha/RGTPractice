package com.jpa.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.relations.entity.Person;


@Repository
public interface Personrepo extends JpaRepository<Person, Integer> {

}
