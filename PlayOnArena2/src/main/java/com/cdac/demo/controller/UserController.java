package com.cdac.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cdac.demo.dto.User;
import com.cdac.demo.service.UserServiceImple;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserServiceImple service;
	
	@PostMapping("/user")
	public User registerUser(@RequestBody User user) throws Exception
	{
		String tempEmail = user.getEmail();
		if(tempEmail != null && !"".equals(tempEmail)) {
			User userobj = service.findByEmail(tempEmail);
			
			if(userobj != null)
			{
				throw new Exception("user with"+tempEmail+"is allready exit");
				
			}
		}
		User userObj = null;
		userObj = service.saveUser(user);
		
		
		return userObj;
		
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		
		String tempEmail=user.getEmail();
		String tempPass = user.getPassword();
		User userObjj=null;
		
		if(tempEmail !=null && tempPass != null) {
			userObjj = service.fetchUserByEmailAndPassword(tempEmail, tempPass);
		}
		
		
		if(userObjj == null){
			throw new Exception("user does not exist");
		}
		
		return userObjj;
	}

	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable(value="userId") int userId)
	{
		
		return service.findByUserId(userId);
	}	
}
	
	

