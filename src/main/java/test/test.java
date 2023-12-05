package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
	static String url = "jdbc:mysql://localhost:3306/clothers_shop";
	static String userName = "root";
	static String password = "123456";

	public static Connection getConnection() {
		Connection c = null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			c = DriverManager.getConnection(url, userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;

	}
	public static void main(String[] args) {
		Connection con = test.getConnection();
		System.out.println(con);
	}

}
