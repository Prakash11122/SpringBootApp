package com.example.prakash.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Product {
	
	@Id
	private Integer prodId;
	private String prodName;
	private Double prodCost;
	private String prodVender;
	private String prodGrade;
	

}
