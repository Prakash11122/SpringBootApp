package com.example.prakash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.prakash.entity.Dept;
import com.example.prakash.entity.Employee;
import com.example.prakash.repo.DeptRepository;
import com.example.prakash.repo.EmployeeRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository erepo;
	@Autowired
	private DeptRepository drepo;

	@Override
	public void run(String... args) throws Exception {
		
		Dept d1 = new Dept(100, "DEV");
		
		
		Employee e1 = new Employee(10, "A", 2500.0, d1);
		Employee e2 = new Employee(20, "B", 3500.0, d1);
		Employee e3 = new Employee(30, "c", 4500.0, d1);
	
		
		drepo.save(d1);
		
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		
		

	}

}
