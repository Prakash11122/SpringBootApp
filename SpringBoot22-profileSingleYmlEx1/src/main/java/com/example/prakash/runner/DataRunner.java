package com.example.prakash.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.app")
public class DataRunner implements CommandLineRunner{
	
	private String Driver;
	private String Url;
	

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}

}
