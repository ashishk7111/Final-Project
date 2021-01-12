package com.cdac.demo.service;

import com.cdac.demo.dto.User;

public interface UserService {
	
	public User findById(int Id);
	
	public User saveUser(User user);
	
	public User findByEmail(String email);

}
