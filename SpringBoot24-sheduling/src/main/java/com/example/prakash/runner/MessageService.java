package com.example.prakash.runner;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
	
	
	@Scheduled(fixedDelay = 5000)
	public void printMsga() {
		System.out.println("prakash" + new Date());
		
	}
		@Scheduled(fixedDelay = 2000)
		public void printMsgb() {
			System.out.println("hi" + new Date());
	}

}
