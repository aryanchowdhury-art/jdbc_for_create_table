package com.jdbc;

import java.sql.*;

public class jdbcapp {
    public static void main(String[] args) {
        // This is our first JDBC project
        try {
            // Load the driver to JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating a connection
            //can apply string url as "jdbc:mysql://localhost:3306/(sql_user_name)"
            String url = "";
            //string user name "sql_user_name"
            String username = "";
            String password = "(use password of sql)";
            Connection con = DriverManager.getConnection(url, username, password);

            // Create a query
            String q = "create table table1 (tId int(20) NOT NULL AUTO_INCREMENT PRIMARY KEY, tName varchar(200) NOT NULL, tCity varchar(400))";

            // Create statement
            Statement stmt = con.createStatement();

            // Execute the query
            stmt.executeUpdate(q);
            System.out.println("Table created...");
            System.out.println("hell...fuckin yeah it is created yeeessss...!!!");

            // Close the connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
