package com.example.prakash.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class DataReadRunner implements CommandLineRunner{
	@Value("${app.db}")
	private String db;
	@Value("${app.pwd}")
	private String pwd;
	
	

	@Override
	public void run(String... args) throws Exception {
	System.out.println(this);
		
	}

}
