package com.phandeptrai.dtos;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;



public class ThongTinTNRequest {
	@NotBlank(message = "Số CMND không được để trống")
	private String soCMND;

	@NotBlank(message = "Họ tên không được để trống")
	private String hoTen;

	@Email(message = "Email không hợp lệ")
	@NotBlank(message = "Email không được để trống")
	private String email;

	@Pattern(regexp = "^0\\d{9}", message = "Số điện thoại không hợp lệ")
	private String soDt;

	@NotBlank(message = "Địa chỉ không được để trống")
	private String diaChi;

	@NotBlank(message = "Vui lòng chọn trường")
	private String maTruong;

	@NotBlank(message = "Vui lòng chọn ngành")
	private String maNganh;

	@NotBlank(message = "Hệ tốt nghiệp không được để trống")
	private String heTN;

	@NotNull(message = "Ngày tốt nghiệp không được để trống")
	private LocalDate ngayTN;

	@NotBlank(message = "Loại tốt nghiệp không được để trống")
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
