package com.cdac.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cdac.demo.dto.Manager;
import com.cdac.demo.dto.User;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByEmailId(String email);
	

	public User findByUserId(int userId);
	
	public User findUserByEmailIdAndPassword(String email,String password);
	
	public List<User> findAll();
	
//	public User findUserByUserNameAndPassword(String userName,String password);
	
	public User findByToken(String token);

}
