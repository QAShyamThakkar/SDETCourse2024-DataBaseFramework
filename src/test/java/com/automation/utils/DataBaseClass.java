package com.automation.utils;

import org.apache.commons.collections4.functors.WhileClosure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseClass {
    public static void main(String[] args) throws Exception {

    //1. Steup -  Getting the connection
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Special@0");

    // 2. Creating statement
    Statement stmt = con.createStatement();

   //3. Executing query and processing result
    ResultSet rs   = stmt.executeQuery("SELECT * FROM employees;");

        while (rs.next()) {
            System.out.print(rs.getString("first_name")+" ");
            System.out.println(rs.getString("last_name"));
        }

    //4. Closing the connection
        stmt.close();
        con.close();

    }

}
