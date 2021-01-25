package com.cdac.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.demo.dto.Manager;
import com.cdac.demo.dto.User;
import com.cdac.demo.repository.ManagerRepository;
import com.cdac.demo.service.ManagerServiceImple;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ManagerController {

	@Autowired
	private ManagerServiceImple mservice;
	
	@PostMapping("/managerregister")
	public Manager registerManager(@RequestBody Manager manager) throws Exception
	{
		String tempEmail = manager.getEmailId();
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
	
	@PostMapping("/managerlogin")
	public Manager loginManager(@RequestBody Manager manager) throws Exception {
		
		String tempEmail=manager.getEmailId();
		String tempPass = manager.getPassword();
		Manager managerObjj=null;
		
		if(tempEmail !=null && tempPass != null) {
			managerObjj = mservice.fetchManagerByEmailIdAndPassword(tempEmail, tempPass);
		}
		
		
		if(managerObjj == null){
			throw new Exception("manager does not exist");
		}
		
		return managerObjj;
	}
	
	@GetMapping("/managerlist")
	public List<Manager> findAll() {
		return mservice.findAll();

	}
	
	
	
	@GetMapping("/manager/{Id}")
	public Manager getManagerById(@PathVariable(value="managerId") int managerId)
	{
		
		return mservice.findByManagerId(managerId);
		
	}
	
	
}
