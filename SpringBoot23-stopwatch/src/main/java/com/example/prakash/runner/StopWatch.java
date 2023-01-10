package com.example.prakash.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component

public class StopWatch implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		
		StopWatch watch=new org.springframework.util.StopWatch();
		
		for(int i=0; i<10000;i++) {
			double result=Math.pow(i+1, i) + Math.pow(3, i);
		}
	//	watch.stop();
		 

	}

}
