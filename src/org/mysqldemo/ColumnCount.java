package org.mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class ColumnCount {
	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root",
				"root");

		// create a statement or query
		Statement statement = connection.createStatement();

		String query = "SELECT * FROM payments";
		ResultSet resultSet = statement.executeQuery(query);

		// Get metadata from ResultSet
		java.sql.ResultSetMetaData metaData = resultSet.getMetaData();

		// Get the column count
		int columnCount = metaData.getColumnCount();

		System.out.println("Number of columns: " + columnCount);

	}
}
