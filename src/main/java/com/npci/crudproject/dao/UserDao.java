package com.npci.crudproject.dao;

import java.util.List;

import com.npci.crudproject.response.UserDepartmentResponse;

public interface UserDao {
	
	public List<UserDepartmentResponse> getUserDepartment();
	
}