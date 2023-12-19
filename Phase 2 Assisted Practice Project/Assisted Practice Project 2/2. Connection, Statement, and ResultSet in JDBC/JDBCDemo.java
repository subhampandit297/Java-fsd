package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            System.out.println("Connected to the database!");

            try (Statement statement = connection.createStatement()) {
                String sqlQuery = "SELECT * FROM Employee";
                try (ResultSet resultSet = statement.executeQuery(sqlQuery)) {
                    while (resultSet.next()) {
                        int column1Value = resultSet.getInt("column1");
                        String column2Value = resultSet.getString("column2");
                        System.out.println("Column1: " + column1Value + ", Column2: " + column2Value);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

