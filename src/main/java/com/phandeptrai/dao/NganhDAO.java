package com.phandeptrai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.phandeptrai.dao.mysql.MySqlCmd;
import com.phandeptrai.dtos.NganhResponse;
import com.phandeptrai.utils.DatabaseConnection;


@Repository
public class NganhDAO {
	
	public List<NganhResponse> layTatCaTruong() {
		List<NganhResponse> nganhResponses = new ArrayList<>();
		try(Connection conn = DatabaseConnection.getConnection()){
			PreparedStatement stmt = conn.prepareStatement(MySqlCmd.ALL_Nganh);
			
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					NganhResponse nganhResponse = new NganhResponse(
							rs.getString("MaNganh"),
							rs.getString("TenNganh")
							);
					nganhResponses.add(nganhResponse);
				}
				
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}

		return nganhResponses;
	}
}
