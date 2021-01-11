package com.cdac.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.User;
import com.cdac.repo.UserRepo;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/")
public class UserCntr {

	@Autowired
	private UserRepo userRepo;
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userRepo.save(user);
	}
	
	@GetMapping("/user/{userId}")
	public Optional<User> getUserById(@PathVariable(value="userId") int userId) {
		return userRepo.findById(userId);
	}
	
}
