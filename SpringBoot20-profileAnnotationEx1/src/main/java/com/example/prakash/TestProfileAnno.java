package com.example.prakash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.prakash.service.AlertSystem;

@Component
public class TestProfileAnno implements CommandLineRunner {
	@Autowired
	private  AlertSystem als;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		als.sendMessage();

	}

}
