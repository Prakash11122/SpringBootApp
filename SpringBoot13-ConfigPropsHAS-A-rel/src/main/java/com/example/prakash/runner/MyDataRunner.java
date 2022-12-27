package com.example.prakash.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.example.prakash.model.DnConnection;

@Component
@ConfigurationProperties(prefix="my.app")
public class MyDataRunner implements CommandLineRunner {
	
	private DnConnection  con;

	@Override
	public void run(String... args) throws Exception {
	System.out.println(con);

	}

	public final DnConnection getCon() {
		return con;
	}

	public final void setCon(DnConnection con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "MyDataRunner [con=" + con + "]";
	}
	 

}
