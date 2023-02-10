package com.in.prakash.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	private String prodVender;

}
