package com.practice;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.entity.Book;
import com.practice.repository.BookRepo;

@SpringBootApplication
public class CurdExample2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(CurdExample2Application.class, args);
		BookRepo br=context.getBean(BookRepo.class);
		
		Book b1=new Book(1, "Java","James Gosling", 500);
		Book b2=new Book(2,"python","Roseum",600);
		Book b3=new Book(3,"C","dennies",200);
		Book b4=new Book(4,"C++","Stepen",300);
		
//	br.saveAll(Arrays.asList(b1,b2,b3,b4));
//		  
// 		List<Book> l1=br.findByPriceGreaterThanEqual(300);
//		
//		for(Book bk:l1) {
//			System.out.println(bk);
//		}
		
//	  List <Book>l1=br.findByName("java");
//       System.out.println(l1);		
//		
 		
		List<Book>l2=br.getAllBooks();
		l2.forEach(System.out::println);
		
		
	}

}
