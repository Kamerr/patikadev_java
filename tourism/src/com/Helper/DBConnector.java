package com.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    private  Connection connect = null;


    public Connection connectDB(){
        try {
            this.connect = DriverManager.getConnection(Config.DB_URL,Config.DB_UNAME,Config.DB_PASS);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return this.connect;
    }

    public static  Connection getIstance(){
        DBConnector db = new DBConnector();
        return db.connectDB();
    }
}