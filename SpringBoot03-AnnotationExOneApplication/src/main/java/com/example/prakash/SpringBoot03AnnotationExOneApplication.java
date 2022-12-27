package com.example.prakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot03AnnotationExOneApplication {

	public static void main(String[] args) {
		ApplicationContext ac =  SpringApplication.run(SpringBoot03AnnotationExOneApplication.class, args);
		Customer c=ac.getBean("cob",Customer.class);
		c.printData();
	}

}
