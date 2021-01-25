package com.cdac.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Turf {
	@Id
	@GeneratedValue
	private int turfId;
	private String turfName;
	private String turfAdd;
	private String turfFullAdd;
	private String turfType;
	private String managerName;
	//private String turfPic;
	public Turf() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public String getTurfFullAdd() {
		return turfFullAdd;
	}




	public void setTurfFullAdd(String turfFullAdd) {
		this.turfFullAdd = turfFullAdd;
	}




	public String getManagerName() {
		return managerName;
	}




	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}




	public Turf(int turfId, String turfName, String turfAdd, String turfFullAdd, String turfType, String managerName) {
		super();
		this.turfId = turfId;
		this.turfName = turfName;
		this.turfAdd = turfAdd;
		this.turfFullAdd = turfFullAdd;
		this.turfType = turfType;
		this.managerName = managerName;
	}




	public int getTurfId() {
		return turfId;
	}
	public void setTurfId(int turfId) {
		this.turfId = turfId;
	}
	public String getTurfName() {
		return turfName;
	}
	public void setTurfName(String turfName) {
		this.turfName = turfName;
	}
	public String getTurfAdd() {
		return turfAdd;
	}
	public void setTurfAdd(String turfAdd) {
		this.turfAdd = turfAdd;
	}
	public String getTurfType() {
		return turfType;
	}
	public void setTurfType(String turfType) {
		this.turfType = turfType;
	}
	
	

}
