package com.example.myapplicationpf.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionDB {
    private static final String JDBC_URL = "jdbc:sqlite:/data/data/com.example.myapplicationpf/databases/PF.sqlite";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL);
    }

}
