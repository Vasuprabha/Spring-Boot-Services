package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeServiceImplementation;
import com.model.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeServiceImplementation EmployeeServiceImplementation;

	@PostMapping("/saveEmployee")
	public Employee saveEmployeeWithRole(@RequestBody Employee Employee) {
		try {
			Employee EmployeeDetails = EmployeeServiceImplementation.addEmployee(Employee);
			return EmployeeDetails;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@GetMapping("/viewAllEmployee")
	public List<Employee> findAllEmployee() {
		try {
			List<Employee> employee = new ArrayList<>();
			employee = EmployeeServiceImplementation.findAllEmployee();
			 System.err.println("1");
			if (employee != null) {
				 System.err.println("2");
				return employee;
			} else {
				System.err.println("Value not found");
				 System.err.println("3");
				return null;
			}
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@GetMapping("/viewEmployeeByName/{name}")
	public Employee findEmployee(@PathVariable(value = "name") String name) {
		try {
			Employee Employee = EmployeeServiceImplementation.findEmployee(name);
			if (Employee != null) {
				return Employee;
			} else {
				System.err.println("Value not found");
				return null;
			}
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

//	@GetMapping("/findEmployeeByName")
//	public List<Employee> findEmployeeByName() {
//		try {
//			List<Employee> Employee = EmployeeServiceImplementation.findEmployeeByName();
//			if (Employee != null) {
//				return Employee;
//			} else {
//				System.err.println("Value not found");
//				return null;
//			}
//		} catch (Exception e) {
//			System.err.println(e);
//			return null;
//		}
//	}
}
