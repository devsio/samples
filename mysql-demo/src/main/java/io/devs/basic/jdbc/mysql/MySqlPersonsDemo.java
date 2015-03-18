package io.devs.basic.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlPersonsDemo {
	public static String dbUrl = MySqlTablesDemo.dbUrl;
	public static String dbClass = MySqlTablesDemo.dbClass;
	public static String query = "SELECT * FROM Persons";
	public static String username = MySqlTablesDemo.username;
	public static String password = MySqlTablesDemo.password;
	
	public static void main(String[] args) {
		try {

			Class.forName(dbClass);
			Connection connection = DriverManager.getConnection(dbUrl,
					username, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			int index=0;
			while (resultSet.next()) {
				System.out.println("RECORD "+ ++index);
				
				String id = resultSet.getString("PersonID");
				System.out.println("Person ID: " + id);

				String lastName = resultSet.getString("LastName");
				String firstName = resultSet.getString("FirstName");
				System.out.println("Name: " + firstName + " " + lastName);
				
				String address = resultSet.getString("Address");
				String city = resultSet.getString("City");
				System.out.println("Address: " + address+ ", " + city);
				

			}
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
