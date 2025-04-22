package com.phandeptrai.entities;

public class SinhVien {
	private String SoCMND;
	private String HoTen;
	private String Email;
	private String SoDt;
	private String DiaChi;
	
	public SinhVien() {
	}
	
	public SinhVien(String soCMND, String hoTen, String email, String soDt, String diaChi) {
		super();
		SoCMND = soCMND;
		HoTen = hoTen;
		Email = email;
		SoDt = soDt;
		DiaChi = diaChi;
	}
	public String getSoCMND() {
		return SoCMND;
	}
	public void setSoCMND(String soCMND) {
		SoCMND = soCMND;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSoDt() {
		return SoDt;
	}
	public void setSoDt(String soDt) {
		SoDt = soDt;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	
	
}
