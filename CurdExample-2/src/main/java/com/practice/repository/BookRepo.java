package com.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.entity.Book;

@Repository
public interface BookRepo extends CrudRepository<Book,Integer> {
	
	public List<Book>findByPriceGreaterThanEqual(Integer p);
	public List<Book>findByName(String s);
		
//    @Query("from Book ") ---.JPQL Queries
//	@Query(value="select * from Book order by price" ,nativeQuery=true)//--used 
//	for defining queries in spring data jpa
	
	@Query(value="select * from Book where price>200" ,nativeQuery=true)//--used 

    public List<Book>getAllBooks();
}
