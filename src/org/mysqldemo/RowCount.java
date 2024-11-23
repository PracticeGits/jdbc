package org.mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RowCount {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root",
				"root");

		// create a statement or query
		Statement statement = connection.createStatement();
		// Assume connection is established

		String query = "SELECT * FROM payments";
		ResultSet resultSet = statement.executeQuery(query);

		// Count rows
		int rowCount = 0;
		while (resultSet.next()) {
			rowCount++;
		}

		System.out.println("Number of rows: " + rowCount);

	}

}
