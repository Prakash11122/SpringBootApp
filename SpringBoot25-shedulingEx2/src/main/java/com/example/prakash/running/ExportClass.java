package com.example.prakash.running;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ExportClass {
	
	@Scheduled(fixedRate = 2000)
	public void exicute() {
		System.out.println("Done "  +  new  Date() );
	}

}
