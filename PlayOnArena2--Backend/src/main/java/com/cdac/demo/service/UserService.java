package com.cdac.demo.service;

import java.util.List;


import com.cdac.demo.dto.User;

public interface UserService {
	
	public User findByUserId(int userId);
	
	public User saveUser(User user);
	
	public User findByEmailId(String email);
	
	public User fetchUserByEmailIdAndPassword(String email,String password);

	public List<User> findAll();
//	public User fetchUserByUserNameAndPassword(String userName,String password);
}
