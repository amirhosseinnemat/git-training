package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
this is a program just for testing database connectivity
 */

public class ConnectionToDb {

    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker";
    private static final String user = "root";
    private static final String password = "Amir1995";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password)) {
            System.out.println("successful");
        } catch (SQLException throwables) {
            System.out.println("unsuccessful");
            throwables.printStackTrace();
        }

    }
}
