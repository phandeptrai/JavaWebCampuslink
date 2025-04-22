package com.phandeptrai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.phandeptrai.dao.mysql.MySqlCmd;
import com.phandeptrai.dtos.TruongResponse;
import com.phandeptrai.utils.DatabaseConnection;
@Repository
public class TruongDAO {
	
	public List<TruongResponse> layTatCaTruong() {
		List<TruongResponse> truongResponses = new ArrayList<>();
		try(Connection conn = DatabaseConnection.getConnection()){
			PreparedStatement stmt = conn.prepareStatement(MySqlCmd.ALL_Truong);
			
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					TruongResponse truongResponse = new TruongResponse(
							rs.getString("MaTruong"),
							rs.getString("TenTruong")
							);
					truongResponses.add(truongResponse);
				}
				
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}

		return truongResponses;
	}
}
