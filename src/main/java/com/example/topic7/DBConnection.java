package com.example.topic7;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection connect() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/studentdb",
                    "postgres",
                    "vanst1126"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

