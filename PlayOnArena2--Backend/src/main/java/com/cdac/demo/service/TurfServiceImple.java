package com.cdac.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.demo.dto.Turf;
import com.cdac.demo.dto.User;
import com.cdac.demo.repository.TurfRepository;

@Service("turfService")
public class TurfServiceImple implements TurfService {
	
	@Autowired
	private TurfRepository turfRepository;
	
	@Override
	public Turf saveTurf(Turf turf) {
		
		return turfRepository.save(turf);
	}
	
	

	@Override
	public Turf findByTurfId(int turfId) {
		// TODO Auto-generated method stub
		return turfRepository.findByTurfId(turfId);
	}



	public List<Turf> findAll() {
		// TODO Auto-generated method stub
		return turfRepository.findAll();
	}
	
	
	
	
	

}
