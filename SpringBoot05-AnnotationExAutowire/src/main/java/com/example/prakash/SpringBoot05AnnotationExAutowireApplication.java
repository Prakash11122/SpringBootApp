package com.example.prakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot05AnnotationExAutowireApplication {

	public static void main(String[] args) {
		ApplicationContext ac =  SpringApplication.run(SpringBoot05AnnotationExAutowireApplication.class, args);
		Vender emp=ac.getBean("vob",Vender.class);
		System.out.println(emp);
		
	}

}
