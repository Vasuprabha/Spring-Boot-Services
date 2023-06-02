package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//	public Employee findByName(String name);

//	@Query("select u from User u order by name ")
//	public List<Employee> findByEmployeeName();

}
