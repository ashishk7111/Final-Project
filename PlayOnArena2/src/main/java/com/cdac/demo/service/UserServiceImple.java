package com.cdac.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.demo.dto.User;
import com.cdac.demo.repository.UserRepository;


@Service("userService")
public class UserServiceImple implements UserService {

	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public User saveUser(User user) {
            return userRepository.save(user);		
	}

	

	@Override
	public User findById(int Id) {
		return userRepository.findById(Id);
	}



	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	
}
