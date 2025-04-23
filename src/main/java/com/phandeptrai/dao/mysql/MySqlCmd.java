package com.phandeptrai.dao.mysql;

public class MySqlCmd {
	public static final String ALL_Truong = "SELECT * FROM truong";
	public static final String ALL_Nganh = "SELECT * FROM nganh";
	public static final String INSERT_SINHVIEN = "INSERT INTO sinhvien VALUES(?, ?, ?, ?, ?)";
	public static final String INSERT_TOTNGHIEP = "INSERT INTO tot_nghiep VALUES(?, ?, ?, ?, ?, ?)";
	public static final String SELECT_SINHVIENBYTEN = "SELECT * FROM sinhvien WHERE "
	        + "HoTen LIKE CONCAT('%', ?, '%') OR "
	        + "Email LIKE CONCAT('%', ?, '%') OR "
	        + "SoCMND LIKE CONCAT('%', ?, '%') OR "
	        + "SoDt LIKE CONCAT('%', ?, '%')";
	public static final String SELECT_TTTN_VIECLAM = "SELECT sv.SoCMND, sv.HoTen, sv.Email, tn.MaNganh, tn.MaTruong, cv.MaNganh AS MaNganhCV, cv.TenCongTy, cv.ThoiGianLamViec "
			+ "FROM sinhvien as sv JOIN tot_nghiep as tn ON sv.SoCMND = tn.SoCMND LEFT JOIN nganh ON "
			+ "tn.MaNganh = nganh.MaNganh LEFT JOIN truong ON tn.MaTruong = truong.MaTruong JOIN cong_viec as cv ON "
			+ "sv.SoCMND = cv.SoCMND WHERE sv.SoCMND LIKE ?";


}



