package com.prj.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	/*
	 * Create database connection
	 */
	/*private static String url = "jdbc:mysql://localhost:3306/med_orderingdb?autoReconnect=true&useSSL=false";
	private static String user = "root";
	private static String pass = "kdkc2000";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			
		}
		catch(Exception e) {
			
			System.out.println("Database connection is not success");
		}
	
		return con;*/
	
	private static String url = "jdbc:mysql://localhost:3306/med_orderingdb?autoReconnect=true&useSSL=false"; // Database url
	private static String user = "root"; // Database Name
	private static String pass = "kdkc2000"; // Database password
	private static Connection con;

	public static Connection getConnection() throws SQLException {
		// used singleton pattern for connection
		if (con == null || con.isClosed()) {
			// database connection
			// validate database connection
			/* Exception handling */
			try {
				Class.forName("com.mysql.jdbc.Driver");

				// call database
				con = DriverManager.getConnection(url, user, pass);

			} catch (Exception e) {
				System.out.println("Database connection is not successful"); // Displays if database connection fails
			}
		}
		return con;
	}
}
