package com.example.prakash.runner;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimeSheduling {
	
	@Scheduled(cron = "0 0 1 * * *")
	public void execute() {
		System.out.println("prakash today is " +  new Date());
	}

}
