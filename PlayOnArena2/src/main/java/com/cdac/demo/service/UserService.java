package com.cdac.demo.service;

import com.cdac.demo.dto.User;

public interface UserService {
	
	public User findByUserId(int userId);
	
	public User saveUser(User user);
	
	public User findByEmail(String email);

}
