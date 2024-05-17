package com.nit.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product_tab")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pId;
	private String pName;
	private Double price;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime createDateTime;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDateTime updateDateTome;
	
	public Product(Integer pId, String pName, Double price, LocalDateTime createDateTime,
			LocalDateTime updateDateTome) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.createDateTime = createDateTime;
		this.updateDateTome = updateDateTome;
	}
	
	public Product() {
		System.out.println("0-param");
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price + ", createDateTime=" + createDateTime
				+ ", updateDateTome=" + updateDateTome + "]";
	}
	
	
	
	

}
