package com.cdac.demo.service;

import java.util.List;

import com.cdac.demo.dto.Turf;

public interface TurfService {
	
	public Turf findByTurfId(int turfId);
	
	public Turf saveTurf(Turf turf);
	
	public List<Turf> findAll();

}
