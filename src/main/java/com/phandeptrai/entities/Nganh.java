package com.phandeptrai.entities;

public class Nganh {
	private String MaNganh;
	private String TenNganh;
	private String LoaiNganh;
	
	
	
	
	public Nganh() {
		super();
	}
	public Nganh(String maNganh, String tenNganh, String loaiNganh) {
		super();
		MaNganh = maNganh;
		TenNganh = tenNganh;
		LoaiNganh = loaiNganh;
	}
	public String getMaNganh() {
		return MaNganh;
	}
	public void setMaNganh(String maNganh) {
		MaNganh = maNganh;
	}
	public String getTenNganh() {
		return TenNganh;
	}
	public void setTenNganh(String tenNganh) {
		TenNganh = tenNganh;
	}
	public String getLoaiNganh() {
		return LoaiNganh;
	}
	public void setLoaiNganh(String loaiNganh) {
		LoaiNganh = loaiNganh;
	}
	
	
	
}
