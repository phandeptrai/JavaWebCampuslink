package com.phandeptrai.dtos;

import java.time.LocalDate;

public class ThongTinTNCVResponse {
	private String soCMND;
	private String hoTen;
	private String maNganhTN;
	private String maTruong;
	private String maNganhCV;
	private String tenCongTy;
	private String thoiGianLamViec;
	
	
	public ThongTinTNCVResponse() {
		super();
	}


	public ThongTinTNCVResponse(String soCMND, String hoTen, String maNganhTN, String maTruong,
			String maNganhCV, String tenCongTy, String thoiGianLamViec) {
		super();
		this.soCMND = soCMND;
		this.hoTen = hoTen;
		this.maNganhTN = maNganhTN;
		this.maTruong = maTruong;
		this.maNganhCV = maNganhCV;
		this.tenCongTy = tenCongTy;
		this.thoiGianLamViec = thoiGianLamViec;
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




	public String getMaNganhTN() {
		return maNganhTN;
	}


	public void setMaNganhTN(String maNganhTN) {
		this.maNganhTN = maNganhTN;
	}


	public String getMaTruong() {
		return maTruong;
	}


	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}


	public String getMaNganhCV() {
		return maNganhCV;
	}


	public void setMaNganhCV(String maNganhCV) {
		this.maNganhCV = maNganhCV;
	}


	public String getTenCongTy() {
		return tenCongTy;
	}


	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}


	public String getThoiGianLamViec() {
		return thoiGianLamViec;
	}


	public void setThoiGianLamViec(String thoiGianLamViec) {
		this.thoiGianLamViec = thoiGianLamViec;
	}
	
	
}
