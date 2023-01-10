package com.example.prakash.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class ClasTestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println(args[0]);
		System.out.println("prakash");
		

	}

}
