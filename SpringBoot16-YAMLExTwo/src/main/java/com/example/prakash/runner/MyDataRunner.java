package com.example.prakash.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
//@ConfigurationProperties("my.app")
public class MyDataRunner implements CommandLineRunner {
	@Value("${my.app.id}")
	private Integer id;
	@Value("${my.app.code}")
	private String code;
	

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		

	}

}
