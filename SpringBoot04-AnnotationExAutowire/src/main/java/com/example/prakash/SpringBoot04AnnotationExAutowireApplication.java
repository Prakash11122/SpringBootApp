package com.example.prakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot04AnnotationExAutowireApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBoot04AnnotationExAutowireApplication.class, args);
		Employee emp=ac.getBean("eob",Employee.class);
		System.out.println(emp);
	}

}
