package com.carty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carty.model.Product;
import com.carty.repo.ProductRepo;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductRepo repo;
	
	@PostMapping("/createProduct")
	public Product createProduct(@RequestBody Product product){
		repo.save(product);
		return product;
	}
	
	@PutMapping("/updateProduct/{id}")
	public Product updateProduct(@RequestBody Product product, @PathVariable("prdId") Integer prdId){
		product.setPrdId(prdId);
		repo.save(product);
		return product;
	}
	
	@DeleteMapping("/deleteProduct")
	public Integer deleteProduct(@PathVariable("prdId") Integer prdId){
		repo.deleteById(prdId);
		return prdId;
	}
	
	@GetMapping("/allProducts")
	public void getAllProducts() {
		repo.findAll();
	}
}
