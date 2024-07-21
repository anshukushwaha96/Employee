/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anshu.utility;

/**
 *
 * @author HOME
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectionPool {
    static Connection conn;
    public static Connection connectDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/product";
            String un="root";
            String ps="Anshu";
            conn=DriverManager.getConnection(url, un, ps);
            System.out.println("Database connectivity success");
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    } 
    public static void main(String[] args) {
        connectDB();
    }
}
