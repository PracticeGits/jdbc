package org.mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {

	public static void main(String[] args) throws SQLException {

		// create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "root");

		// create a statement or query
		Statement statement = con.createStatement();

		String s = "SELECT * FROM customers";

		// execute statement

	
		ResultSet executeQuery = statement.executeQuery(s);
		
		while(executeQuery.next()) {
			int cNo = executeQuery.getInt("customerNumber");
			String cName = executeQuery.getString("customerName");

			
			System.out.println(cNo);
			System.out.println(cName);
			
		}

		// close the connection

		con.close();
		
		System.out.println("query executed");
	}
}
