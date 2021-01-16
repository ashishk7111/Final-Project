package com.cdac.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.demo.dto.Turf;
import com.cdac.demo.service.TurfServiceImple;

@RestController
public class TurfController {
	
	@Autowired
	private TurfServiceImple tservice;
	
	@RequestMapping(value="/addturf", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, 
			  produces = MediaType.APPLICATION_JSON_VALUE)
	
	@PostMapping("/turf")
	public Turf createTurf(@RequestBody Turf turf) {
		return tservice.saveTurf(turf);
	}
	
	@GetMapping("/turf/{turfId}")
	public Turf getTurfById(@PathVariable(value="turfId") int turfId)
	{
		return tservice.findByTurfId(turfId);
	}
	
	
	
	
	
	
	
	
	

}
