package com.example.prakash.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.prakash.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	//--------------------------------Multiple rows outpu--------------------------------
	@Query("SELECT e FROM Employee e")
	List<Employee> getAllEmployee();
	@Query("SELECT e.empName FROM Employee  e")
	List<String> getAllEmployeeNames();
	
	@Query("SELECT e.empName,e.empSal  FROM Employee  e")
	List<Object[]>  getAllEmployeeNameAndSal();
    //---------------one row out put------------------------------------------
	@Query("SELECT  e From Employee e WHERE  e.empId=:empId")
	Employee getEmployeeById(Integer empId);
	
	@Query("SELECT  e.empName  FROM  Employee e WHERE  e.empId=:empId")
	String getEmployeeNameById(Integer empId);  
	
	
}
