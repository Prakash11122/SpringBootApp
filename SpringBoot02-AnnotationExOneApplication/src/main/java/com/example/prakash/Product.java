package com.example.prakash;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pob")
public class Product {
	@Value("5")
	private int pid;
	@Value("pencil")
	private String pcode;
	
	public void dicplay() {
		System.out.println(pid+"-"+pcode);
	}
	

}
