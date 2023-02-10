package com.example.prakash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.prakash.model.Employee;
import com.example.prakash.repo.EmployeeRepo;
@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		repo.save(new Employee(101, "A" ,  2.2 ,  "DEV"));
		repo.save(new Employee(102, "B" ,  3.3 ,  "DEV"));
		repo.save(new Employee(103, "C" ,  4.4 ,  "DEV"));
		repo.save(new Employee(104, "D" ,  5.5 ,  "DEV"));
		repo.save(new Employee(105, "E" ,  6.6 ,  "DEV"));
		

	}

}
