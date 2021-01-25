package com.cdac.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cdac.demo.dto.Turf;

@Repository("turfRepository")
public interface TurfRepository extends JpaRepository<Turf, Integer>{

	
	Turf findByTurfId(int turfId);
	
	List<Turf> findByTurfAddAndTurfType(String turfAdd, String turfType);
	
}
