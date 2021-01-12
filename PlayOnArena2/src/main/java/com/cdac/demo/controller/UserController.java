package com.cdac.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.demo.dto.User;
import com.cdac.demo.service.UserServiceImple;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImple service;
	
	@RequestMapping(value ="/registration", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, 
			  produces = MediaType.APPLICATION_JSON_VALUE)
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

	@GetMapping("/user/{Id}")
	public User getUserById(@PathVariable(value="Id") int Id)
	{
		
		return service.findById(Id);
		
	}
	
}
