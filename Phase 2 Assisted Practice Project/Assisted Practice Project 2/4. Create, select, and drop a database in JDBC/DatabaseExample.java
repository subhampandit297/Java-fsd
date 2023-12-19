package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseExample {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/";

    static final String USER = "root";
    static final String PASS = "1234";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a database
            System.out.println("Creating database...");
            stmt = conn.createStatement();
            String sqlCreateDB = "CREATE DATABASE IF NOT EXISTS mydatabase";
            stmt.executeUpdate(sqlCreateDB);
            System.out.println("Database created successfully.");

            // Select the database
            System.out.println("Selecting the database...");
            String sqlUseDB = "USE mydatabase";
            stmt.executeUpdate(sqlUseDB);
            System.out.println("Using database: mydatabase");

            // Perform database operations here...

            // Drop the database
            System.out.println("Dropping the database...");
            String sqlDropDB = "DROP DATABASE IF EXISTS mydatabase";
            stmt.executeUpdate(sqlDropDB);
            System.out.println("Database dropped successfully.");

        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
                // Nothing we can do
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}

