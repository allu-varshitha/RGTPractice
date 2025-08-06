package com.spring.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.entity.Product;
import com.spring.rest.repository.ProductRepo;

@Service  // to impleement service layer we use @service annotation
public class ProductServiceImpl  implements ProductService{

	@Autowired
	private ProductRepo prepo;// service layer depends on the repository layer
	
	// we implemented all unimplemented methods from service interface 
	// we create all custom methods i.e save(),findById(),FindByAll(),delete()
	@Override
	public Product saveProduct(Product p) { // to  save the products 
		return prepo.save(p);
	}
	@Override
	public List<Product> getAllProducts() { // to fetch all products 
		return prepo.findAll();
	}
	@Override
	public Product getProductById(Integer id) { // fetch the products by id	
		return prepo.findById(id).orElse(null) ;
	}
	@Override
	public String deleteProduct(Integer id) {
	    Optional<Product> optionalProduct = prepo.findById(id);
	    if (optionalProduct.isPresent()) {
	        Product p = optionalProduct.get();
	        prepo.delete(p);
	        return "Product deleted successfully";
	    } else {
	        return "No product found with ID: " + id;
	    }
	}
	@Override
	public Product editProductById(Product p, Integer id) { // edit the product based on id 
		Product ep=prepo.findById(id).orElse(null);
		if(ep!=null) {
			ep.setId(id);
			ep.setName(p.getName());
	        ep.setDescription(p.getDescription());
	        ep.setPrice(p.getPrice());
			return prepo.save(ep);
		}
		else {
			return null;
		}	
	}

}
