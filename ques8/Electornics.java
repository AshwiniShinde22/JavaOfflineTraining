package com.yash.assign2.ques8;

public class Electornics {

	private int id;
	private String semiconductorType;
	private String dateOfManufacturing;
	
	
	public Electornics(int id, String semiconductorType, String dateOfManufacturing) {
		super();
		this.id = id;
		this.semiconductorType = semiconductorType;
		this.dateOfManufacturing = dateOfManufacturing;
	}
	@Override
	public String toString() {
		return "Electornics [id=" + id + ", semiconductorType=" + semiconductorType + ", dateOfManufacturing="
				+ dateOfManufacturing + "]";
	}
	
	
		
	
}
