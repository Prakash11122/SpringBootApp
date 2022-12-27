package com.example.prakash.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class MyDataRunner implements CommandLineRunner {
	
	private Integer id;
	private String code;
	private Double version;
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("From Runner");
		System.out.println(this);
		
	}


	public final Integer getId() {
		return id;
	}


	public final void setId(Integer id) {
		this.id = id;
	}


	public final String getCode() {
		return code;
	}


	public final void setCode(String code) {
		this.code = code;
	}


	public final Double getVersion() {
		return version;
	}


	public final void setVersion(Double version) {
		this.version = version;
	}


	@Override
	public String toString() {
		return "MyDataRunner [id=" + id + ", code=" + code + ", version=" + version + "]";
	}
	
	

}
