package com.example.prakash;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	@Bean
	public EmpExport  eob() {
		EmpExport e=new EmpExport();
		e.setCode(555);
		e.setName("ABC");
		return e; 
	}
	

}
