package com.example.prakash.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prakash.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	interface Myview	{
		//DataType get<variable>();
		 String getprodName();
		Double getprodCost();
		
	}
	//select prodName ,prodcost from product where prodgrade=?
	List<Myview>findByprodGrade(String prodGrade);
	
	
	interface myproduct{
		
		String getempName();
		Double getSal();
		
	}
	 
	
	
	//SELECT * FROM PRODUCT WHERE PROD_VENDER=?
	List<Product> findByprodVender(String prodVender);
	
	//SELECT * FROM PRODUCT WHERE PROD_GRADE=?
//	List<Product> findByprodGrade(String prodGrade);
	
	//SELECT * FROM PRODUCT WHERE PROD_COST<?
	List<Product> findByprodCostLessThan(Double prodCost);
	
	//SELECT * FROM PRODUCT WHERE PROD_COST>=?
	List<Product> findByprodCostGreaterThan(Double prodCost);
	
	//SELECT * FROM PRODUCT WHERE PROD_NAME   LIKE '?'(ANY EXPRESSION)
	List<Product>findByProdNameLike(String prodNameExpression);
	
	//SELECT * FROM PRODUCT WHERE PROD_NAME  NOT LIKE '?'(ANY EXPRESSION)
	List<Product>findByProdNameNotLike(String prodNameExpression);
	
	//---startingwith is equals to <inpute> [ generated by data jpa]
	List<Product>findByProdNameStartingWith(String prodName);
	
	//---endingwith is equals to % <inpute> [ generated by data jpa]
		List<Product>findByProdNameEndingWith(String prodName);
	
	//---containing with is equals to % <inpute> %[ generated by data jpa]
			List<Product>findByProdNameContaining(String prodName);
			
			//-----------------3.and/or--------------------------
			
			//SELECT * FROM PRODUCT WHERE PROD_NAME=? AND PROD_COST> =?
			
			List<Product>findByProdNameLikeAndProdCostGreaterThanEqual(String prodName,Double prodCost);
			
			//SELECT * FROM PRODUCT WHERE PROD_NAME=? or PROD_COST> =?
			
			List<Product>findByProdNameLikeOrProdCostGreaterThanEqual(String prodName,Double prodCost);
			
			//SELECT *FROM PRODUCT WHERE PROD_COST =? ORDER BY PROD_VENDER ASC
			List<Product>findByProdCostOrderByProdVender(Double prodCost);
			

}
