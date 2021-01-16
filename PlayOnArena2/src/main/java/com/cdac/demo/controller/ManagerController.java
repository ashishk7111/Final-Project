package com.cdac.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.demo.dto.Manager;

import com.cdac.demo.service.ManagerServiceImple;

@RestController
public class ManagerController {

	@Autowired
	private ManagerServiceImple mservice;
	
	@RequestMapping(value="/managerregistration",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, 
			  produces = MediaType.APPLICATION_JSON_VALUE)
	
	public Manager registerManager(@RequestBody Manager manager) throws Exception
	{
		String tempEmail = manager.getEmail();
		if(tempEmail != null && !"".equals(tempEmail)) {
			Manager managerobj = mservice.findByEmail(tempEmail);
			
			if(managerobj != null)
			{
				throw new Exception("manager with"+tempEmail+"is allready exist");
				
			}
		}
		Manager managerObj = null;
		managerObj = mservice.saveManager(manager);
		
		
		return managerObj;
	}
	@GetMapping("/manager/{Id}")
	public Manager getManagerById(@PathVariable(value="managerId") int managerId)
	{
		
		return mservice.findByManagerId(managerId);
		
	}
	
	
}
