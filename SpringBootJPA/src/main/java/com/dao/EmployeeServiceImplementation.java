package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	EmployeeRepository EmployeeRepository;

	public Employee addEmployee(Employee detail) {
		try {
			Employee Employee = EmployeeRepository.save(detail);
			return Employee;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	public List<Employee> findAllEmployee() {
		try {
			List<Employee> details;
			// details = EmployeeRepository.findAll();

			// System.out.println("details"+details);
			CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
			CriteriaQuery<Employee> cq = criteriaBuilder.createQuery(Employee.class);
			Root<Employee> root = cq.from(Employee.class);
			cq.multiselect(root);
			List<Employee> resultList = entityManager.createQuery(cq).getResultList();
			return resultList;

//			CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//			CriteriaQuery<Employee> criteriaQueryEmployee = criteriaBuilder.createQuery(Employee.class);
//			Root<Employee> Employee = criteriaQueryEmployee.from(Employee.class);
//			criteriaQueryEmployee.where(criteriaBuilder.equal(Employee, Employee));
//			criteriaQueryEmployee.select(Employee);
//			details = entityManager.createQuery(criteriaQueryEmployee).getResultList();
//			return details;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	public Employee findEmployee(String name) {
		Employee EmployeeDetails = new Employee();
		try {

//			CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//			CriteriaQuery<Employee> cq = criteriaBuilder.createQuery(Employee.class);
//			Root<Employee> root = cq.from(Employee.class);
//			cq.multiselect(root);
//			Employee resultList = entityManager.createQuery(cq).getSingleResult();
//			return resultList;

			CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
			CriteriaQuery<Employee> criteriaQueryEmployee = criteriaBuilder.createQuery(Employee.class);
			Root<Employee> Employee = criteriaQueryEmployee.from(Employee.class);
			criteriaQueryEmployee.where(criteriaBuilder.equal(Employee.get("name"), name));
			criteriaQueryEmployee.select(Employee);
			EmployeeDetails = entityManager.createQuery(criteriaQueryEmployee).getSingleResult();
			return EmployeeDetails;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

//	public List<Employee> findEmployeeByName() {
//		try {
//			List<Employee> Employee = EmployeeRepository.findByEmployeeName();
//			return Employee;
//		} catch (Exception e) {
//			System.err.println(e);
//			return null;
//		}
//	}
}
