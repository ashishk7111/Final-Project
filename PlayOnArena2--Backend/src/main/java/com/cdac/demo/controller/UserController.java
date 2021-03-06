package com.cdac.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.demo.dto.Manager;
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
		String tempEmail = user.getEmailId();
		if(tempEmail != null && !"".equals(tempEmail)) {
			User userobj = service.findByEmailId(tempEmail);
			
			if(userobj != null)
			{
				throw new Exception("user with"+tempEmail+"is allready exit");
				
			}
		}
		User userObj = null;
		userObj = service.saveUser(user);
		
		
		return userObj;
		
	}
	
	@GetMapping("/userlist")
	public List<User> findAll() {
		return service.findAll();

	}
	
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		
		String tempEmail=user.getEmailId();
		String tempPass = user.getPassword();
		User userObjj=null;
		
		if(tempEmail !=null && tempPass != null) {
			userObjj = service.fetchUserByEmailIdAndPassword(tempEmail, tempPass);
		}
		
		
		if(userObjj == null){
			throw new Exception("user does not exist");
		}
		
		return userObjj;
	}

	
//	@PostMapping("/login")
//	public User loginUser(@RequestBody User user) throws Exception {
//		
//		String tempUserName=user.getUserName();
//		String tempPass = user.getPassword();
//		User userObjj=null;
//		
//		if(tempUserName !=null && tempPass != null) {
//			userObjj = service.fetchUserByUserNameAndPassword(tempUserName, tempPass);
//		}
//		
//		
//		if(userObjj == null){
//			throw new Exception("user does not exist");
//		}
//		
//		return userObjj;
//	}
	
	
	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable(value="userId") int userId)
	{
		
		return service.findByUserId(userId);
	}	
	
	
	@GetMapping("/forgot-password")
	public String forgotPassword(@RequestParam String emailId) {

		String response = service.forgotPassword(emailId);

		if (!response.startsWith("Invalid")) {
			response = "http://localhost:8081/api/reset-password?token=" + response;
		}
		return response;
	}

	@PutMapping("/reset-password")
	public String resetPassword(@RequestParam String token,
			@RequestParam String password) {

		return service.resetPassword(token, password);
	}

}
	
	

