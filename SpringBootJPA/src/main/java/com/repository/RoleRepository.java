package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

//	public User findByName(String name);
//
//	@Query("select u from User u order by name ")
//	public List<User> findByUserName();

}