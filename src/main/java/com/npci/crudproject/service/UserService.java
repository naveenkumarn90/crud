package com.npci.crudproject.service;

import java.util.List;

import com.npci.crudproject.entity.Users;
import com.npci.crudproject.response.UserDepartmentResponse;

public interface UserService {
	
	public List<Users> getAllUsers();
	public Users getUserById(int userId);
	public Users addOrUpdateUser(Users user);
	public Users deleteUser(int userId) throws Exception;
	
	//this method is calling from crud repository user @Query Annotaion
	public List<Users> getuserBySalary(float salary);
	
	//this method is calling from dao class
	public List<UserDepartmentResponse> getUserDepartMent();
	
}