    package model;
import java.sql.*;

public class MRegisterStaff {
    public int staffRegistration(String firstName, String LastName, String Address, String phone, String jobPosition, double monthlySalary, String username, String password){
        int rowCount = 0;
        try{
            //Create Statment
            Statement st = DBConnection.createDBConnection().createStatement();
            
            //Create sql query and get row count of affected rows    
            rowCount = st.executeUpdate("INSERT INTO staff" +
                "(first_name, last_name, address, phone, job_position, monthly_salary, username, password)" +
                " VALUES ('"+firstName+"', '"+LastName+"', '"+Address+"', '"+phone+"', '"+jobPosition+"'," +
                " '"+monthlySalary+"', '"+username+"', '"+password+"')");
            
            //Check if rows have been affected
            if(rowCount > 0){
                System.out.println("Number of records inserted: " + rowCount);
            }
            
        } catch (SQLException e) {
            System.err.println("Database Error: " + e.getMessage());
        }
        
        //Send rowCount to controller
        return rowCount;
    }
}
