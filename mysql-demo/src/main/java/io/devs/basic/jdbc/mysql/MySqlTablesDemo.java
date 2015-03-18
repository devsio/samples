package io.devs.basic.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlTablesDemo {
	public static String dbUrl = "jdbc:mysql://db4free.net:3306/demo";
	public static String dbClass = "com.mysql.jdbc.Driver";
	public static String query = "Select distinct(table_name) from INFORMATION_SCHEMA.TABLES";
	public static String username = "demo";
	public static String password = "demo";
	
	public static void main(String[] args) {
		
		try {

			Class.forName(dbClass);
			Connection connection = DriverManager.getConnection(dbUrl,
					username, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				String tableName = resultSet.getString(1);
				System.out.println("Table name : " + tableName);
			}
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
