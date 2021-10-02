package com.euro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static Connection connection;
    private static DbConnection dbConnection;

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/euro2020";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Amir1995";

    private DbConnection() {
    }

    public static Connection setConfig() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Program connected to database");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;

    }

    public static DbConnection getDbConnection() {
        if (dbConnection == null) {
            synchronized (DbConnection.class) {
                dbConnection = new DbConnection();
            }
        }
        return dbConnection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
