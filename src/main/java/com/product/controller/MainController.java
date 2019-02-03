package com.product.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.service.ProductService;


@RestController
@RequestMapping("/products")
public class MainController {

	@Autowired
	@Qualifier("productService")
	ProductService ps;
	
	@RequestMapping("/value")
	public int insertProduct() {
		Product p1 = new Product();
		p1.setProductName("Nivea Deo");
		p1.setProductDescription("The odour stays for hours");
		p1.setUnitPrice(200);
		return ps.insertProduct(p1);
	}
	
	@RequestMapping("/all")
	public Hashtable<String,Product> getAll () {
		return ps.getAllProduct();
	}
	
	@RequestMapping("{id}")
	public Product getProduct(@PathVariable("id") int id) {
		return ps.getProduct(id);
	}
}
