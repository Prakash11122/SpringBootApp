package com.example.prakash.runner;

import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="my.app")
public class MyDataReader implements CommandLineRunner {
	
	private Properties pdata;

	@Override
	public void run(String... args) throws Exception {
     System.out.println(pdata);
	}

	public final Properties getPdata() {
		return pdata;
	}

	public final void setPdata(Properties pdata) {
		this.pdata = pdata;
	}
	

}
