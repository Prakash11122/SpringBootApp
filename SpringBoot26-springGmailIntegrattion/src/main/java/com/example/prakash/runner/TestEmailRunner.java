package com.example.prakash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.example.prakash.util.EmailUtil;

@Component
public class TestEmailRunner implements CommandLineRunner {
	@Autowired
	private EmailUtil emailUtil;

	@Override
	public void run(String... args) throws Exception {
		 
		FileSystemResource file = new FileSystemResource("C:\\JRTP\\typeScrite note.txt");
		
	boolean flag = 	emailUtil.send(
				"javabyraghu@gmail.com",
				null,
				null,
				"SAMPLE",
				"HELLL DATA",
				file);
		if(flag)  {  
			System.out.println("SUCCESS");
		}else {
			System.out.println("FAILS");
		}
		
	}

}
