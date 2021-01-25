package com.cdac.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
    public User fetchUserByEmailIdAndPassword(String email,String password) { 
		
		return userRepository.findUserByEmailIdAndPassword(email,password);
	}
	

//	public User fetchUserByUserNameAndPassword(String userName,String password) {
//		
//		return userRepository.findUserByUserNameAndPassword(userName, password);
//	}
	
	


	@Override
	public User findByEmailId(String email) {
	
		return userRepository.findByEmailId(email);
	}



	@Override
	public User findByUserId(int userId) {
		// TODO Auto-generated method stub
		return userRepository.findByUserId(userId);
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	
public String forgotPassword(String email) {
		
		Optional<User> userOptional = Optional.ofNullable(userRepository.findByEmailId(email));
		
		if(!userOptional.isPresent()) {
			return "Invalied email id";
		}
		
		User user = userOptional.get();
		user.setToken(generateToken());
		
		user = userRepository.save(user);
		
		return user.getToken();
		
	}

public String resetPassword(String token,String password) {
	
	Optional<User> userOptional = Optional.ofNullable(userRepository.findByToken(token));

	if(!userOptional.isPresent()) {
		return "Invalied token";
	}
	
	User user = userOptional.get();
	
	user.setPassword(password);
	user.setToken(token);
	
	userRepository.save(user);
	
	return "Your password successfully update";
}


private String generateToken() {
	StringBuilder token = new StringBuilder();
	
	return token.append(UUID.randomUUID().toString()).append(UUID.randomUUID().toString()).toString();
}


}
