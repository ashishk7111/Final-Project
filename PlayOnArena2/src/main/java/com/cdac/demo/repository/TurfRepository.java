package com.cdac.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cdac.demo.dto.Turf;

@Repository("turfRepository")
public interface TurfRepository extends JpaRepository<Turf, Integer>{

	
	Turf findByTurfId(int turfId);
	
}
