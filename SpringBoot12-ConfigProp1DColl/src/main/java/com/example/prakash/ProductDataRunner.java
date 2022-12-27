package com.example.prakash;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my.app")
public class ProductDataRunner implements CommandLineRunner{
	
	private List<String> colors;
	//private Set<String> codes;
	//private String[] models;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}

	public final List<String> getColors() {
		return colors;
	}

	public final void setColors(List<String> colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "ProductDataRunner [colors=" + colors + "]";
	}

	  
 
}
