package com.example.prakash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vob")
public class Vender {
	@Value("9")
	private int vid;
	@Value("RA")
	private String vcode;
	@Autowired
	private Contact cnt;
	@Override
	public String toString() {
		return "Vender [vid=" + vid + ", vcode=" + vcode + ", cnt=" + cnt + "]";
	}
	
	
	
	

}
