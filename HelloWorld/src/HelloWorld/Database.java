package HelloWorld;

import java.sql.*;



public class Database {
	

	
	private String userName = "root";
	private String password = "";
	private String url = "jdbc:mysql://localhost:3306/okul";
	private static String driver = "com.mysql.cj.jdbc.Driver";

	
	static {
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	protected Connection getConnection() {
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	
}
