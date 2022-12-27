package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootFirstAppApplication.class, args);
		//read obj (bean) using getBean (objName, className.class)
		MessageService ms=ac.getBean("messageService",MessageService.class);
				ms.getMsg();
		
	}

}
