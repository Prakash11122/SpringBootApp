package com.nt.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime idt;
	//b.method
	public String generateWishMessage(String user) {
		//get current hous
		System.out.println(idt);//24 hour format
		
		int hour=idt.getHour();
		//write b.logic
		if(hour<12)
			return "good moring Dere::"+user;
		else if(hour<16)
			return "good afternoon::"+user;
		else if(hour<20)
			return "Good evening darling::"+user;
		else
			return "Godd night::"+user;
		
		
	}
	

}
