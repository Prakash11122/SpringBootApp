package com.example.prakash.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.prakash.model.Employee;

public interface EmpRepository  extends CrudRepository<Employee, Integer>{

}
