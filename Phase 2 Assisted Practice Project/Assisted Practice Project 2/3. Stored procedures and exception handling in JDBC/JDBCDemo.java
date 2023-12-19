package com;

import java.sql.*;

public class JDBCDemo {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            // Create a CallableStatement for executing stored procedures
            CallableStatement callableStatement = connection.prepareCall("{call my_stored_procedure(?, ?)}");

            // Set input parameters
            callableStatement.setInt(1, 5); // Example input value

            // Register output parameters
            callableStatement.registerOutParameter("@2", Types.VARCHAR);

            // Execute the stored procedure
            callableStatement.execute();

            // Retrieve the output parameter value
            String result = callableStatement.getString("@2");
            System.out.println(result);

        } catch (SQLException e) {
            handleSQLException(e);
        }
    }

    private static void handleSQLException(SQLException e) {
        System.err.println("SQL Exception:");
        while (e != null) {
            System.err.println("Message: " + e.getMessage());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            e = e.getNextException();
        }
    }
}

