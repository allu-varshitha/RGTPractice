package com.spring.rest.service;

import java.util.List;

import com.spring.rest.entity.Product;

public interface ProductService {
	
	Product saveProduct(Product p);
	List<Product>getAllProducts();
	Product getProductById(Integer id);
	String deleteProduct(Integer id);
	Product editProductById(Product p,Integer id);

}
