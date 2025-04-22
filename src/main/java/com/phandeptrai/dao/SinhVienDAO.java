package com.phandeptrai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import com.phandeptrai.dao.mysql.MySqlCmd;
import com.phandeptrai.dtos.ThongTinTNRequest;
import com.phandeptrai.utils.DatabaseConnection;

@Repository
public class SinhVienDAO {

	public boolean saveThongTinTN(ThongTinTNRequest request) {
		Connection conn = null;
		try {
			conn = DatabaseConnection.getConnection();

			conn.setAutoCommit(false);
			try (PreparedStatement stmt = conn.prepareStatement(MySqlCmd.INSERT_SINHVIEN)) {
				stmt.setString(1, request.getSoCMND());
				stmt.setString(2, request.getHoTen());
				stmt.setString(3, request.getEmail());
				stmt.setString(4, request.getSoDt());
				stmt.setString(5, request.getDiaChi());

				stmt.executeUpdate();
			}
			try (PreparedStatement stmt2 = conn.prepareStatement(MySqlCmd.INSERT_TOTNGHIEP)) {
				stmt2.setString(1, request.getSoCMND());
				stmt2.setString(2, request.getMaTruong());
				stmt2.setString(3, request.getMaNganh());
				stmt2.setString(4, request.getHeTN());
				stmt2.setString(5, request.getNgayTN().toString());
				stmt2.setString(6, request.getLoaiTN());

				stmt2.executeUpdate();
			}
			conn.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			try {
				if (conn != null)
					conn.rollback(); // Rollback nếu có lỗi
			} catch (Exception rollbackEx) {
				rollbackEx.printStackTrace();
			}
			return false;
		} finally {
			try {
				if (conn != null)
					conn.setAutoCommit(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
