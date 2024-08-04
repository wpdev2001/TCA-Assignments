package com.wp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

    private static final String URL = "jdbc:mysql://192.168.120.5:3306/hfbdb";
    private static final String USER = "rmsadmin";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish the connection
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
