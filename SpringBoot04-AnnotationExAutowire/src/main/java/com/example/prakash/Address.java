package com.example.prakash;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aob")
public class Address {
	@Value("5-A")
	private String hno;
	@Value("Odisha")
	private String loc;
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", loc=" + loc + "]";
	}
	
	
	

}
