package com.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "employee")
//@NamedQuery(name = "User.findByName", query = "select u from User u where u.name = ?1")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL")
	private String eMail;

	@Column(name = "SALARY")
	private double salary;

	@Column(name = "ADDRESS")
	private String address;

//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ROLE_ID")
//	private Role role;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID")
	@JsonBackReference
	private Role role;

//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employee") // fetch = FetchType.EAGER,
//	@JsonManagedReference
//	// @JoinColumn(name = "ROLE_ID")
//	private Role role;

//	@OneToOne(targetEntity = Role.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
//	@JoinColumn(name = "ROLE_ID")
//	private Role role;

	public Employee() {

	}

	/*
	 * public Employee(String name, String eMail, float salary, String address) {
	 * this.name = name; this.eMail = eMail; this.salary = salary; this.address =
	 * address; }
	 */

	/*
	 * public Employee(long id, String name, String eMail, double salary, String
	 * address, Role role) {
	 * 
	 * this.id = id; this.name = name; this.eMail = eMail; this.salary = salary;
	 * this.address = address; this.role = role; }
	 */

	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRoleId(Role role) {
		this.role = role;
	}

}