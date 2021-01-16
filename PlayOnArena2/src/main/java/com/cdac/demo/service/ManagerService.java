package com.cdac.demo.service;

import com.cdac.demo.dto.Manager;

public interface ManagerService {
	
	public Manager findByManagerId(int managerId);
	
	public Manager findByEmail(String email);
	
	public Manager saveManager(Manager manager);
	
	
}
