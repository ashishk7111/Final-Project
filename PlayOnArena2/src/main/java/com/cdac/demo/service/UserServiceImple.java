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
    public User fetchUserByEmailAndPassword(String email,String password) { 
		
		return userRepository.findUserByEmailAndPassword(email,password);
	}
	

	



	@Override
	public User findByEmail(String email) {
	
		return userRepository.findByEmail(email);
	}



	@Override
	public User findByUserId(int userId) {
		// TODO Auto-generated method stub
		return userRepository.findByUserId(userId);
	}
	
	
}
