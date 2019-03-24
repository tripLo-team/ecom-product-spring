package com.product.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name ="image")
@EntityListeners(AuditingEntityListener.class)
public class Image {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
public int id;
	
	public String Path;
	
	public int Product_id;

}
