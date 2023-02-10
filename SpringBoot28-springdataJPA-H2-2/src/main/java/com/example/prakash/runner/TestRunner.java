package com.example.prakash.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.prakash.model.Employee;
import com.example.prakash.repo.EmpRepository;
@Component
public class TestRunner  implements CommandLineRunner {
	@Autowired
	private EmpRepository emprepo;
	@Override
	public void run(String... args) throws Exception {
		//to find impl className using reference variable
		System.out.println(emprepo.getClass().getName());
		
		//insert data into table
		
		emprepo.save(new Employee(101 ,"prakash",2500.0 ))	;
		emprepo.save(new Employee(102 ,"ravi",3400.0 ))	;
		emprepo.save(new Employee(103 ,"sankar",4500.0 ))	;
		
		
		
		Iterable<Employee> data = emprepo.findAll();
		
		for(Employee e:data) {
			System.out.println(e);
		}
		
	}

}
