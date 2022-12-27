package com.example.prakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot02AnnotationExOneApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBoot02AnnotationExOneApplication.class, args);
		Product p = ac.getBean("pob",Product.class);
		p.dicplay();
		}

}
