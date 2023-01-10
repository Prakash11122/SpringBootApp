package com.example.prakash.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.prakash.runner.Product;
@Component

public class TestData implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Product p=new Product(20);
		System.out.println(p);
		

	}

}
