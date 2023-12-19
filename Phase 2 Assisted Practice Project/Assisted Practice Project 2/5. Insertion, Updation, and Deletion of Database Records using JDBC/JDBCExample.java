package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample {

    
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/users";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;

    public static void main(String[] args) {
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Insert a record
            insertRecord("John Doe", "john@example.com", "123456");

            // Update a record
            updateRecord(1, "Updated John Doe", "updated.john@example.com", "654321");

            // Delete a record
            deleteRecord(1);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void insertRecord(String name, String email, String phone) throws SQLException {
        String sql = "INSERT INTO users_table (name, email, phone) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, phone);
            preparedStatement.executeUpdate();
            System.out.println("Record inserted successfully.");
        }
    }

    private static void updateRecord(int id, String name, String email, String phone) throws SQLException {
        String sql = "UPDATE users_table SET name=?, email=?, phone=? WHERE id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, phone);
            preparedStatement.setInt(4, id);
            preparedStatement.executeUpdate();
            System.out.println("Record updated successfully.");
        }
    }

    private static void deleteRecord(int id) throws SQLException {
        String sql = "DELETE FROM users_table WHERE id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Record deleted successfully.");
        }
    }
}

