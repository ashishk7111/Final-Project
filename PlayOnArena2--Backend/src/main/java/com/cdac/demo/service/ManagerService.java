package com.cdac.demo.service;

import java.util.List;

import com.cdac.demo.dto.Manager;


public interface ManagerService {
	
	public Manager findByManagerId(int managerId);
	
	public Manager findByEmail(String email);
	
	public Manager saveManager(Manager manager);
	
	public Manager fetchManagerByEmailIdAndPassword(String email,String password);
	
	public List<Manager> findAll();
}
