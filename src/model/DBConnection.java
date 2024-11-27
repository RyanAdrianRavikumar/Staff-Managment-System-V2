package model;
import java.sql.*;

public class DBConnection {
    private static Connection con;
    
    public static Connection createDBConnection(){
        try{
            String url = "jdbc:mysql://localhost/staffmanagementsystem";
            con = DriverManager.getConnection(url, "root", "Zxcv@7890");
            
        } catch(SQLException e){
            System.err.println("Database error: " + e.getMessage());
        }
        return con;
    }
}
