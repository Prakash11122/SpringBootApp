package com.example.prakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot07ConfigEx2Application {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(SpringBoot07ConfigEx2Application.class, args);
		JsonJob job=ap.getBean("jobj",JsonJob.class);
		System.out.println(job);
	}

}
