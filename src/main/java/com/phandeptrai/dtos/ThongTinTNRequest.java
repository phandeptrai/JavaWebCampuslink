package com.phandeptrai.dtos;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;



public class ThongTinTNRequest {
	private String soCMND;
	private String hoTen;
	@Email(message = "Email lỗi")
	private String email;
	private String soDt;
	private String diaChi;
	private String maTruong;
	private String maNganh;
	private String heTN;
	private LocalDate ngayTN;
	private String loaiTN;

	public ThongTinTNRequest() {
		super();
	}

	public ThongTinTNRequest(String soCMND, String hoTen, String email, String soDt, String diaChi, String maTruong,
			String maNganh, String heTN, LocalDate ngayTN, String loaiTN) {
		super();
		this.soCMND = soCMND;
		this.hoTen = hoTen;
		this.email = email;
		this.soDt = soDt;
		this.diaChi = diaChi;
		this.maTruong = maTruong;
		this.maNganh = maNganh;
		this.heTN = heTN;
		this.ngayTN = ngayTN;
		this.loaiTN = loaiTN;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDt() {
		return soDt;
	}

	public void setSoDt(String soDt) {
		this.soDt = soDt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMaTruong() {
		return maTruong;
	}

	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}

	public String getHeTN() {
		return heTN;
	}

	public void setHeTN(String heTN) {
		this.heTN = heTN;
	}

	public LocalDate getNgayTN() {
		return ngayTN;
	}

	public void setNgayTN(LocalDate ngayTN) {
		this.ngayTN = ngayTN;
	}

	public String getLoaiTN() {
		return loaiTN;
	}

	public void setLoaiTN(String loaiTN) {
		this.loaiTN = loaiTN;
	}

}
