package com.cdac.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.demo.dto.Manager;
import com.cdac.demo.repository.ManagerRepository;

@Service("managerService")
public class ManagerServiceImple implements ManagerService {

	@Autowired
	private ManagerRepository managerRepository;
	

	@Override
	public Manager findByEmail(String email) {
		
		return managerRepository.findByEmail(email);
	}

	@Override
	public Manager saveManager(Manager manager) {
		
		 return managerRepository.save(manager);
	}

	@Override
	public Manager findByManagerId(int managerId) {
		// TODO Auto-generated method stub
		return managerRepository.findByManagerId(managerId);
	}
	
	

}
