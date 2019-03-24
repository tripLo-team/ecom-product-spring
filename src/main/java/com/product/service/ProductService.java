package com.product.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.product.model.Image;
import com.product.model.Product;
import com.product.repo.ImageRepo;
import com.product.repo.ProductRepo;

@Service
public class ProductService {
	

	@Autowired
	@Qualifier("productRepo")
	ProductRepo pr;

	@Autowired
	@Qualifier("imageRepo")
	ImageRepo im;

public List<Product> findAll() {
	List<Product> productList = pr.findAll();
	for(int i=0;i<productList.size();i++) {
		Product pr = productList.get(i);
		System.out.println(pr.getProduct_id());
		List<Image> imageList = im.findAllByProduct_id(pr.getProduct_id());
		pr.setImageList(imageList);
	}
	return productList;
}

public List<Product> findOneProduct(Integer id) {
	Product product = pr.findByProduct_id(id);
	if (product == null) {
		return null;
	}
	List<Image> imageList = im.findAllByProduct_id(id);
	product.setImageList(imageList);
	List<Product> prList = new ArrayList<>();
	prList.add(product);
	return prList;
}

public List<Image> findAllImage(int id) {
	return im.findAllByProduct_id(id);
}

public List<Product> updateProductStock(int productId, int stock) {
	int state = pr.setProductStock(productId,stock);
	return findOneProduct(productId);
}

}
