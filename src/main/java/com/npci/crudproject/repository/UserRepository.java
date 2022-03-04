package com.npci.crudproject.repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.npci.crudproject.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
	
	// Custom Query
	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.named-parameters
	@Query(value = "select * from users where salary > :salary", nativeQuery = true)
	public List<Users> getuserBySalary(@Param("salary") float salary);

}