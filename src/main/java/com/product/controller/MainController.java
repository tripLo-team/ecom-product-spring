package com.product.controller;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Image;
import com.product.model.Product;
import com.product.service.ProductService;


@RestController
@RequestMapping("/ecom")
public class MainController {

	@Autowired
	@Qualifier("productService")
	ProductService ps;
	
	HashMap<String , List<Product>> mp = new HashMap<>();
	@RequestMapping("/products")
	public HashMap<String,List<Product>> getAll() {
	List<Product> productList =  ps.findAll();
	mp.put("products",productList);
	return mp;	
	}
	
	@RequestMapping("/image")
	public List<Image> getAllImage() {
		List<Image> images = ps.findAllImage(1);
		for (int i=0; i<images.size();i++) {
			Image im = images.get(i);
			System.out.println(im.path);
		}
	return ps.findAllImage(1);	
	}
	
	@RequestMapping("/products/{id}")
	public HashMap<String,List<Product>> getOneProduct(@PathVariable("id") Integer id) {
		List<Product> productList =  ps.findOneProduct(id);
		mp.put("products",productList);
		return mp;	
	}
	
    @RequestMapping(value="/update/{id}/{stock}" , method = RequestMethod.PATCH)
	public HashMap<String,List<Product>> updateProduct(@PathVariable("id") Integer id ,
			                                           @PathVariable("stock") Integer stock) {
		List<Product> prList =  ps.updateProductStock(id,stock);
		mp.put("products",prList);
		return mp;	
	}
    
    @RequestMapping(value="/updateOrder/{id}/{stock}" , method = RequestMethod.PATCH)
	public HashMap<String,List<Product>> updateProductOrder(@PathVariable("id") Integer id ,
			                                           @PathVariable("stock") Integer stock) {
		List<Product> prList =  ps.updateProductStockOrder(id,stock);
		mp.put("products",prList);
		return mp;	
	}
	
	
}
