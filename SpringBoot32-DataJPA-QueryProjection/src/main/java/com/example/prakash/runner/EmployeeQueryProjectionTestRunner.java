package com.example.prakash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.prakash.model.Employee;
import com.example.prakash.repo.EmployeeRepo;

@Component
public class EmployeeQueryProjectionTestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {
		//List<Employee> list= repo.getAllEmployee();
		//List<String> list = repo.getAllEmployeeNames();
	//	list.forEach(System.out::println);
		
	
	//	List<Object[]> list =  repo.getAllEmployeeNameAndSal();
	//	for(Object[] ob:list) {
	//		System.out.println(ob[0]+"-"+ob[1]); }
	
		
	//	Employee e = repo.getEmployeeById(101);
		
		 String name = repo.getEmployeeNameById(102);
		System.out.println(name);


	}

}
