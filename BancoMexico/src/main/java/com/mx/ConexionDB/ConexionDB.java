package com.mx.ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {

	private static Connection conn = null;

	private ConexionDB() {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String usuario = "System";
		String password = "12345";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, password);

		} catch (Exception e) {
			System.out.println("Error de conexión DB" + e.getMessage());
		}
	}

	public static Connection getConnection() {

		if (conn == null) {
			new ConexionDB();
		}
		return conn;
	}

}
