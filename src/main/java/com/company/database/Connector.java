package com.company.database;

import com.company.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Connector {
    static private Connection CONNECTION;

    public static void connect() throws SQLException{
        Properties props = new Properties();
        props.setProperty("user", Configuration.USER);
        props.setProperty("password", Configuration.PASS);
        CONNECTION = DriverManager.getConnection(Configuration.DB_URL, props);
        System.out.println("connected");
    }

    public static Statement getStatement() throws SQLException{
        return CONNECTION.createStatement();
    }

    public static void executeSQL(String sql) throws SQLException{
        CONNECTION.createStatement().execute(sql);
    }
}
