package com.phandeptrai.entities;

public class CongViec {
	private String SoCMND;
	private String NgayVaoCongTy;
	private String MaNganh;
	private String TenCongViec;
	private String TenCongTy;
	private String DiaChiCongTy;
	private String ThoiGianLamViec;
	
	
	
	
	public CongViec() {
		super();
	}
	public CongViec(String soCMND, String ngayVaoCongTy, String maNganh, String tenCongViec, String tenCongTy,
			String diaChiCongTy, String thoiGianLamViec) {
		super();
		SoCMND = soCMND;
		NgayVaoCongTy = ngayVaoCongTy;
		MaNganh = maNganh;
		TenCongViec = tenCongViec;
		TenCongTy = tenCongTy;
		DiaChiCongTy = diaChiCongTy;
		ThoiGianLamViec = thoiGianLamViec;
	}
	public String getSoCMND() {
		return SoCMND;
	}
	public void setSoCMND(String soCMND) {
		SoCMND = soCMND;
	}
	public String getNgayVaoCongTy() {
		return NgayVaoCongTy;
	}
	public void setNgayVaoCongTy(String ngayVaoCongTy) {
		NgayVaoCongTy = ngayVaoCongTy;
	}
	public String getMaNganh() {
		return MaNganh;
	}
	public void setMaNganh(String maNganh) {
		MaNganh = maNganh;
	}
	public String getTenCongViec() {
		return TenCongViec;
	}
	public void setTenCongViec(String tenCongViec) {
		TenCongViec = tenCongViec;
	}
	public String getTenCongTy() {
		return TenCongTy;
	}
	public void setTenCongTy(String tenCongTy) {
		TenCongTy = tenCongTy;
	}
	public String getDiaChiCongTy() {
		return DiaChiCongTy;
	}
	public void setDiaChiCongTy(String diaChiCongTy) {
		DiaChiCongTy = diaChiCongTy;
	}
	public String getThoiGianLamViec() {
		return ThoiGianLamViec;
	}
	public void setThoiGianLamViec(String thoiGianLamViec) {
		ThoiGianLamViec = thoiGianLamViec;
	}
	
	
	
}
