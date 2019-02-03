package com.product.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name ="Products")
@EntityListeners(AuditingEntityListener.class)
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  int ProductID;
  String ProductName;
  String ProductDescription;
  int UnitPrice;
  public int getProductID() {
	return ProductID;
}

public void setProductID(int productID) {
	ProductID = productID;
}

public String getProductName() {
	return ProductName;
}

public void setProductName(String productName) {
	ProductName = productName;
}

public String getProductDescription() {
	return ProductDescription;
}

public void setProductDescription(String productDescription) {
	ProductDescription = productDescription;
}

public int getUnitPrice() {
	return UnitPrice;
}

public void setUnitPrice(int unitPrice) {
	UnitPrice = unitPrice;
}

public int getUnitsInStock() {
	return UnitsInStock;
}

public void setUnitsInStock(int unitsInStock) {
	UnitsInStock = unitsInStock;
}

public int getUnitsOnOrder() {
	return UnitsOnOrder;
}

public void setUnitsOnOrder(int unitsOnOrder) {
	UnitsOnOrder = unitsOnOrder;
}

int UnitsInStock;
  int UnitsOnOrder;
  
  public Product() {
	  
  }
}
