package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.entity.Product;

@Repository   // to connect with the data base and what are the operations perfomed on it 
//<entity class name ,primary key datatype>
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
