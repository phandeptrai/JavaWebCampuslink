package com.phandeptrai.entities;

import java.time.LocalDate;

public class TotNghiep {
	private String SoCMND;
	private String MaTruong;
	private String MaNganh;
	private String HeTN;
	private LocalDate ngayTN;
	private String LoaiTN;
	
	
	
	public TotNghiep() {
		super();
	}
	public TotNghiep(String soCMND, String maTruong, String maNganh, String heTN, LocalDate ngayTN, String loaiTN) {
		super();
		SoCMND = soCMND;
		MaTruong = maTruong;
		MaNganh = maNganh;
		HeTN = heTN;
		this.ngayTN = ngayTN;
		LoaiTN = loaiTN;
	}
	public String getSoCMND() {
		return SoCMND;
	}
	public void setSoCMND(String soCMND) {
		SoCMND = soCMND;
	}
	public String getMaTruong() {
		return MaTruong;
	}
	public void setMaTruong(String maTruong) {
		MaTruong = maTruong;
	}
	public String getMaNganh() {
		return MaNganh;
	}
	public void setMaNganh(String maNganh) {
		MaNganh = maNganh;
	}
	public String getHeTN() {
		return HeTN;
	}
	public void setHeTN(String heTN) {
		HeTN = heTN;
	}
	public LocalDate getNgayTN() {
		return ngayTN;
	}
	public void setNgayTN(LocalDate ngayTN) {
		this.ngayTN = ngayTN;
	}
	public String getLoaiTN() {
		return LoaiTN;
	}
	public void setLoaiTN(String loaiTN) {
		LoaiTN = loaiTN;
	}
	
	
	
}
