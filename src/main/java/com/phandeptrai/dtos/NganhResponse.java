package com.phandeptrai.dtos;

public class NganhResponse {
    private String maNganh;
    private String tenNganh;
    
    
	public NganhResponse() {
		super();
	}


	public NganhResponse(String maNganh, String tenNganh) {
		super();
		this.maNganh = maNganh;
		this.tenNganh = tenNganh;
	}


	public String getMaNganh() {
		return maNganh;
	}


	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}


	public String getTenNganh() {
		return tenNganh;
	}


	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}
    
    
}
