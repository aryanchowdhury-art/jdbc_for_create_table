package com.jdbc;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class inset {
    public static void main(String[] args) {
        try {
            // Load the driver to JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating a connection
            String url = "jdbc:mysql://localhost:3306/aryan";
            String username = "root";
            String password = "(use password of sql)";
            Connection con = DriverManager.getConnection(url, username, password);

            //create a query
            String q = "INSERT INTO table1(tName,tCity) value (?,?)";

            //prepared statement
            PreparedStatement pstmt = con.prepareStatement(q);

            BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
            System.out.print("enter name:");

            String name = br.readLine();

            System.out.print("enter city:");
            String city = br.readLine();

            //set values
            pstmt.setString(1,name);
            pstmt.setString(2,city);

            pstmt.executeUpdate();

            System.out.println("inserted ");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
