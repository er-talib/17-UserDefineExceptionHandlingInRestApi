package com.user.define.exception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.define.exception.entities.Product;
import com.user.define.exception.service.ProductService;

@RestController
public class HomeController {
	@Autowired
	private ProductService productService ;
	
	@GetMapping( value = "/product" , produces = {"application/json"})
	public Product getProductDetails(@RequestParam long id) {
		return this.productService.findProductById(id);
	}
	

}
