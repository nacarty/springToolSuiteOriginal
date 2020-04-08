package com.carty.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.carty.Product;
import com.carty.ProductRepo;


@Controller
public class ProductController {

	@Autowired
	private ProductRepo repo;
	
	@PostMapping("/addProduct")  //This is the url that you will use in the browser
	public String saveProduct(Product product) {
		repo.save(product);
		return ("redirect:/allProducts");
	}
	
	@GetMapping("/addProduct")  //This is the url that you will use in the browser
	public ModelAndView addNewProduct(Product product) {
		Product p = new Product();
		
		return new ModelAndView("newProduct", "form", p);  //(jspFile, typeOfData, variablePassed)
	} 
	
	@GetMapping("/allProducts") //This is the url that you will use in the browser
	public ModelAndView listAllProducts() {
		List<Product> allProducts = repo.findAll();
		Optional<Product> p = repo.findById(3);
		repo.deleteById(2);
		System.out.println(p);
		return new ModelAndView("allProducts", "products", allProducts);  ////(jspFile, typeOfData, variablePassed)
	}
}
