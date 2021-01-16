package com.cdac.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cdac.demo.dto.Manager;

@Repository("managerRepository")
public interface ManagerRepository extends JpaRepository<Manager, Integer>{

	Manager findByEmail(String email);
	
	
	Manager findByManagerId(int managerId);
	
	
}
