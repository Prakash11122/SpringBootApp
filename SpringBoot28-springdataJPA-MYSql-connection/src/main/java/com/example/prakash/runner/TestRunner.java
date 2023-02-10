package com.example.prakash.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.prakash.repository.TestRepo;
import com.example.prakash.test.Testclass;

@Component
public class TestRunner implements CommandLineRunner{
	@Autowired
	private TestRepo tRepo;

	@Override
	public void run(String... args) throws Exception {
		
		tRepo.saveAll(Arrays.asList (
				new Testclass(101,"prakash",400.0),
				new Testclass(102,"nigam",3400.0),
				new Testclass(101,"sudhir",450.0)
					
				
				
				));
	}

}
