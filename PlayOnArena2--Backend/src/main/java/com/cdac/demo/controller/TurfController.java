package com.cdac.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
import com.cdac.demo.dto.Turf;
import com.cdac.demo.dto.User;
import com.cdac.demo.repository.TurfRepository;
import com.cdac.demo.service.TurfServiceImple;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class TurfController {
	
	@Autowired
	private TurfServiceImple tservice;
	
	@Autowired
	private TurfRepository turfRepository;
	
	
	
	@PostMapping("/turf")
	public Turf createTurf(@RequestBody Turf turf) {
		return tservice.saveTurf(turf);
	}
	
	@GetMapping("/turf/{turfId}")
	public Turf getTurfById(@PathVariable(value="turfId") int turfId)
	{
		return tservice.findByTurfId(turfId);
	}
	
	@GetMapping("/turflist")
	public List<Turf> findAll() {
		return tservice.findAll();

	}
	
	@GetMapping("/turflist1")
	public List<Turf> getData(@Param("turfAdd")String turfAdd,@Param("turfType")String turfType){
		
		return turfRepository.findByTurfAddAndTurfType(turfAdd,turfType);
	}
	
	@PostMapping("/addturf")
	public Turf registerTurf(@RequestBody Turf turf) throws Exception
	{
		
		Turf turfObj = null;
		turfObj = tservice.saveTurf(turf);
		
		
		return turfObj;
	}
	
	
	
	
	
	

}
