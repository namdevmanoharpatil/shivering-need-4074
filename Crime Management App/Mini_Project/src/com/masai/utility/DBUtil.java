package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection provideConnection() {

		Connection conn = null;
		// database connection initialization
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // lib name
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/Crime_management_System";

		try {
			conn = DriverManager.getConnection(url, "root", "8275"); // dbname , mysqlaccname, mysqlpass
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return conn;

	}

}