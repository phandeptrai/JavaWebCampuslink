package com.phandeptrai.entities;

public class Truong {
	private String MaTruong;
	private String TenTruong;
	private String DiaChi;
	private String SoDT;
	
	
	
	
	public Truong() {
		super();
	}
	public Truong(String maTruong, String tenTruong, String diaChi, String soDT) {
		super();
		MaTruong = maTruong;
		TenTruong = tenTruong;
		DiaChi = diaChi;
		SoDT = soDT;
	}
	public String getMaTruong() {
		return MaTruong;
	}
	public void setMaTruong(String maTruong) {
		MaTruong = maTruong;
	}
	public String getTenTruong() {
		return TenTruong;
	}
	public void setTenTruong(String tenTruong) {
		TenTruong = tenTruong;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getSoDT() {
		return SoDT;
	}
	public void setSoDT(String soDT) {
		SoDT = soDT;
	}
	
}
