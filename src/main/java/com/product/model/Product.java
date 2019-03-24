package com.product.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name ="products")
@EntityListeners(AuditingEntityListener.class)
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Product_id")
  int product_id;
	@Column(name = "Prouct_name")
	private String Product_name; 
	@Column(name = "Product_description")
	private String product_description ;
	@Column(name = "Unit_Price")
	int unit_price ;
	@Column(name = "Units_In_Stock")
	int units_in_Stock ;
	@Column(name = "Units_On_Order")
	int units_on_order;
	@Column(name = "Category_id")
	int category_id;
	@Transient
	@JsonSerialize
	@JsonDeserialize
	List<Image> images;
	



public int getProduct_id() {
		return product_id;
	}




	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}




	public String getProduct_name() {
		return Product_name;
	}




	public void setProduct_name(String prouct_name) {
		Product_name = prouct_name;
	}




	public String getProduct_description() {
		return product_description;
	}




	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}




	public int getUnit_price() {
		return unit_price;
	}




	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}




	public int getUnits_in_Stock() {
		return units_in_Stock;
	}




	public void setUnits_in_Stock(int units_in_Stock) {
		this.units_in_Stock = units_in_Stock;
	}




	public int getUnits_on_order() {
		return units_on_order;
	}




	public void setUnits_on_order(int units_on_order) {
		this.units_on_order = units_on_order;
	}




	public int getCategory_id() {
		return category_id;
	}




	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}




	public List<Image> getImageList() {
		return images;
	}




	public void setImageList(List<Image> imageList) {
		this.images = imageList;
	}




public Product() {
	  
  }
}
