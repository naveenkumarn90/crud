package com.npci.crudproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.crudproject.dao.UserDao; 
import com.npci.crudproject.entity.Users;
import com.npci.crudproject.repository.UserRepository;
import com.npci.crudproject.response.UserDepartmentResponse;
import com.npci.crudproject.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<Users>) userRepository.findAll();
	}

	public Users getById(int c_id) {
		// TODO Auto-generated method stub
		return userRepository.findById(c_id).orElse(null);
	}

	@Override
	public Users addOrUpdateUser(Users user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public Users deleteUser(int userId) throws Exception {
		// TODO Auto-generated method stub
		
		Users deletedUser = null;
		try {
			deletedUser = userRepository.findById(userId).orElse(null);
			
			if(deletedUser == null) {
				throw new Exception("User is not available in database");
			}else {
				userRepository.deleteById(userId);
			}
		}catch(Exception ex) {
			throw ex;
		}
		
		return null;
	}

	@Override
	public List<Users> getuserBySalary(float salary) {
		// TODO Auto-generated method stub
		return userRepository.getuserBySalary(salary);
	}

	@Override
	public List<UserDepartmentResponse> getUserDepartMent() {
		
		return userDao.getUserDepartment();
	}

	@Override
	public Users getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}