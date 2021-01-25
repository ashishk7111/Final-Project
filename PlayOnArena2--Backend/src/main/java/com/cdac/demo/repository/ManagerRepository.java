package com.cdac.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cdac.demo.dto.Manager;


@Repository("managerRepository")
public interface ManagerRepository extends JpaRepository<Manager, Integer>{

	public Manager findByEmailId(String email);
	
	
	public Manager findByManagerId(int managerId);
	
	public Manager findManagerByEmailIdAndPassword(String email,String password);
	
	
	public List<Manager> findAll();
	
	
	
}
