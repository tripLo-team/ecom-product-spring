package com.product.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.model.Product;

public interface ProductRepo extends JpaRepository<Product , Integer> {

}
