package model;
import java.sql.*;

public class MStaffLogin {
    public boolean verifyCredentials(String username, String password, String jobPosition) {
        //Boolean to forward as return value
        boolean isValidUser = false;
        
        try {
            Statement st = DBConnection.createDBConnection().createStatement();

            //Sql query to authenticate user
            String query = "SELECT * FROM staff WHERE LOWER(username) = '"+username.toLowerCase()+"' " +
                           "AND password = '"+password+"' AND LOWER(job_position) = '"+jobPosition.toLowerCase()+"'";

            ResultSet rs = st.executeQuery(query);

            //Check if user credentials are valid
            if (rs.next()){
                
                //If user credentials are valid
                isValidUser = true; 
                System.out.println("Login Successful: " + username);
            } else {
                System.out.println("Invalid Failed: " + username);
            }

            rs.close();
            st.close();
            
        } catch (SQLException ex) {
            System.err.println("Database Error: " + ex.getMessage());
        }

        return isValidUser; 
    }
}
