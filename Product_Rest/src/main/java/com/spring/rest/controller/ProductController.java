package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.entity.Product;
import com.spring.rest.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService ps;
	//create a new productwww
//	@PostMapping("/create")
//	Product saveProduct(@RequestBody Product p) {
//		return ps.saveProduct(p);
//	}
	@PostMapping("/creats")
	ResponseEntity<?> saveProduct(@RequestBody Product p) {
		return new ResponseEntity<>(ps.saveProduct(p),HttpStatus.CREATED)	;	
	}
	@GetMapping("/getall")
	List<Product>getAll(){
	return ps.getAllProducts();
	}
	@DeleteMapping("/delete/{id}")
	String delete (@PathVariable Integer id) {
		return ps.deleteProduct(id);
	}
	@PutMapping("update/{id}")
	Product updateById(@RequestBody Product p,@PathVariable Integer id ) {
		return ps.editProductById(p, id);
	}
	@PutMapping("/update")
	public Product putMethodName(@RequestBody Product p) {
		
		return ps.saveProduct(p);
	}
}
