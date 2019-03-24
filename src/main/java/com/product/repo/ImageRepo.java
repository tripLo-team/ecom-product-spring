package com.product.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.product.model.Image;

public interface ImageRepo extends JpaRepository<Image,Integer>{

	
	@Query("Select u from Image u WHERE u.product_id = ?1")
	List<Image> findAllByProduct_id(Integer Product_id);

}
