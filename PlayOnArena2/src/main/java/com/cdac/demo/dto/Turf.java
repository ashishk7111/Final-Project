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
	private String turfType;
	private String turfPic;
	public Turf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Turf(int turfId, String turfName, String turfAdd, String turfType, String turfPic) {
		super();
		this.turfId = turfId;
		this.turfName = turfName;
		this.turfAdd = turfAdd;
		this.turfType = turfType;
		this.turfPic = turfPic;
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
	public String getTurfPic() {
		return turfPic;
	}
	public void setTurfPic(String turfPic) {
		this.turfPic = turfPic;
	}
	
	

}
