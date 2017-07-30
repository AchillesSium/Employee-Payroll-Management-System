package employee.payroll.management.system;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.*;
import javax.swing.JOptionPane;


public class Database {
    
    //Connection myConn=null;
    
    public static Connection java_db(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost/mydatabase","root","1234");
            return myConn;
            
                 /*String url="jdbc:mysql://localhost:3306/mydatabase?zeroDateTimeBehavior=convertToNull";
            String username="root";
            String password="1234";
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
           Connection conn= DriverManager.getConnection(url,username,password);
            System.out.println("database created");
            return conn;*/
        } catch (ClassNotFoundException|SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
	
}