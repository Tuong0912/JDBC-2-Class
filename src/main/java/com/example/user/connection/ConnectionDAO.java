package com.example.user.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {
    Connection connection = null;
    private static String jdbcURL = "jdbc:mysql://localhost:3306/dao";
    private static String acc = "root";
    private static String pass = "tuong2001";
    private static String className = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName(className);
            connection = DriverManager.getConnection(jdbcURL, acc, pass);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }


}
