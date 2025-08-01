package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer>{



}
