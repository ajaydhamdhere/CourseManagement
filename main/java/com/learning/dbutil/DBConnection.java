package com.learning.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection conn;
   static
   {
       try
       {
           Class.forName("oracle.jdbc.OracleDriver");
           conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost/XE", "elearning","learning123");
       }
       catch(ClassNotFoundException ex)
       {
                   ex.printStackTrace();
       }        
       catch(SQLException ex)
       {
           ex.printStackTrace();
       }
  
}
   public static Connection getConnection() {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return conn;
   }
   public static void closeConnection()
   {
       try
       {
           conn.close();
       }
       catch(SQLException ex)
       {
             ex.printStackTrace();
       }
   }
}

