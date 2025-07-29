package com.practice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.entity.StudentEntity;

@Repository
public interface StudentRepo extends CrudRepository<StudentEntity,Integer>{



}
