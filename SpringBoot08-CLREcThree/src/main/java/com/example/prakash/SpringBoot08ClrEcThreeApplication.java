package com.example.prakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.app","com.example"})
public class SpringBoot08ClrEcThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot08ClrEcThreeApplication.class, args);
	}

}
