package PriorityQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62852
 */
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class koneksi {
    //instance variabel 
    String host;
    String user;
    String pass;
    String dbname;
    
    java.sql.Connection conn;
    Statement stm;
    java.sql.Connection con;
    
    //constuctor 
    public koneksi ()throws SQLException{ 
        this.dbname = "cobak";
        this.host = "jdbc:mysql://localhost:3306/"+this.dbname;
        this.user = "root";
        this.pass = "";
        
        this.makeConnection();
         }
    private void makeConnection() throws SQLException{
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = (java.sql.Connection) DriverManager.getConnection(this.host,this.user,this.pass);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public java.sql.Connection getConnection(){
        return this.conn;
    }



}