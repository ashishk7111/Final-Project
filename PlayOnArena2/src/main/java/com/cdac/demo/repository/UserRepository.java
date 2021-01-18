package com.cdac.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cdac.demo.dto.User;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);
	

	User findByUserId(int userId);
	
	User findUserByEmailAndPassword(String email,String password);
	
}
