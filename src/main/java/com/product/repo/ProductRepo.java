package com.product.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.product.model.Image;
import com.product.model.Product;

public interface ProductRepo extends JpaRepository<Product , Integer> {

	@Query("Select u from Product u WHERE u.product_id = ?1")
	Product findByProduct_id(int Product_id);
	
	@Modifying
	@Transactional
	@Query("update Product p set p.units_in_Stock = ?2 where p.product_id = ?1")
	int setProductStock(int Product_id , int stock);
}
