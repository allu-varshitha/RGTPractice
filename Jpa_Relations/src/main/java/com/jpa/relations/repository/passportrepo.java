package com.jpa.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.relations.entity.Passport;

@Repository
public interface passportrepo extends JpaRepository<Passport, Integer> {

}
