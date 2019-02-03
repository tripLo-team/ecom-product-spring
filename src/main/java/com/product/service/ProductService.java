package com.product.service;

import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repo.ProductRepo;

@Service
public class ProductService {
	

	@Autowired
	@Qualifier("productRepo")
	ProductRepo pr;

Hashtable<String,Product> mp = new Hashtable<>();

public int insertProduct(Product p) {
	pr.save(p);
	return p.getProductID();
}

public List<Product> findAll() {
	return pr.findAll();
}

public Product findProduct(int id) {
	return pr.getOne(id);
}

public ProductService() {
	Product p1 = new Product();
	p1.setProductID(1);
	p1.setProductName("Nivea Deo");
	p1.setProductDescription("The odour stays for hours");
	p1.setUnitPrice(200);
	
	mp.put("1", p1);
	
	Product p2 = new Product();
	p2.setProductID(2);
	p2.setProductName("Foundation");
	p2.setProductDescription("For a flawless skin color");
	p2.setUnitPrice(1000);
	
	mp.put("2", p2);
	
}

public Product getProduct(int id) {
	if (mp.contains(id)) {
		return mp.get(id);
	} else {
		return null;
	}
}

public Hashtable<String,Product> getAllProduct() {
	return mp;
}
}
