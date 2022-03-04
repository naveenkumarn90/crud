package com.npci.crudproject.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.npci.crudproject.dao.UserDao;
import com.npci.crudproject.response.UserDepartmentResponse;
import com.npci.crudproject.support.NameParametersJdbcDaoSupportClass;

@Repository
public class UserDaoImpl extends NameParametersJdbcDaoSupportClass implements UserDao {

	@Override
	public List<UserDepartmentResponse> getUserDepartment() {
		
		List<UserDepartmentResponse> users = null;
		
		try {
			String query = "select name,department_name as departmentName from users join department on users.department_id = department.department_id";
			users = getNamedParameterJdbcTemplate()
					.getJdbcOperations()
					.query(
							query, 
							new BeanPropertyRowMapper<UserDepartmentResponse>(
									UserDepartmentResponse.class
									));
		} catch (Exception ex) {
			ex.getStackTrace();
		}
		
		return users;
	}

}
