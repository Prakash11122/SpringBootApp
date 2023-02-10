 package com.example.prakash.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.prakash.model.Product;
import com.example.prakash.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		repo.saveAll(
				Arrays.asList(
				new Product(101, "S-TV", 4500.0, "DELL", "A"),
				new Product(102, "S-LAP", 5500.0, "DELL", "B"),
				new Product(103, "M-TV", 6700.0, "NIM", "A"),
				new Product(104, "M-LAP", 3500.0, "NIM", "B"),
				new Product(105, "R-INVRT", 2500.0, "RIT", "B"),
				new Product(106, "M-KEB", 4500.0, "NIM", "C"),
				new Product(107, "M-LAP", 4500.0, "RIT", "C")
				
	)	);
	
		
		
	}

}
