package com.example.prakash;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cob")
public class Contact {
	@Value("55")
	private int cid;
	@Value("NIT")
	private String code;
	@Value("500.0")
	private double amt;
	
	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", code=" + code + ", amt=" + amt + "]";
	}
	
}
