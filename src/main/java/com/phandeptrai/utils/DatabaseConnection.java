package com.phandeptrai.utils;


import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DatabaseConnection {
	private static HikariDataSource dataSource;

    static {
        try {
            HikariConfig config = new HikariConfig("/dbConfig.properties");
            dataSource = new HikariDataSource(config);
        } catch (Exception ex) {
            throw new RuntimeException("Error while initial HikariCP: " + ex.getMessage(), ex);
        }
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection(); 
    }

    public static void main(String[] args) throws SQLException {
		System.out.println(getConnection());
	}
}
