package com.phandeptrai.dtos;

public class TruongResponse {
	private String maTruong;
	private String tenTruong;
	
	
	public TruongResponse() {
		super();
	}


	public TruongResponse(String maTruong, String tenTruong) {
		super();
		this.maTruong = maTruong;
		this.tenTruong = tenTruong;
	}


	public String getMaTruong() {
		return maTruong;
	}


	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}


	public String getTenTruong() {
		return tenTruong;
	}


	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}



	
	
	
	
}
