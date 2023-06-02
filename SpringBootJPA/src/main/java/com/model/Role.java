package com.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "roles")

public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ROLE_ID")
	private long roleId;

	@Column(name = "ROLE_NAME")
	private long roleName;

	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Collection<Employee> employee = new ArrayList<>();

	public Role() {

	}

	/*
	 * public Role(long roleName) {
	 * 
	 * this.roleName = roleName; }
	 */

	public long getRoleId() {
		return roleId;
	}

	public Role(long roleName, Collection<Employee> employee) {
		super();
		this.roleName = roleName;
		this.employee = employee;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public long getRoleName() {
		return roleName;
	}

	public void setRoleName(long roleName) {
		this.roleName = roleName;
	}

	public Collection<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Collection<Employee> employee) {
		this.employee = employee;
	}

//	@Override
//	public String toString() {
//		return "Role [roleId=" + roleId + ", roleName=" + roleName + "]";
//	}

}
