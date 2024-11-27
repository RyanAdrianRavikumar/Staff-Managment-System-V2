
package model;
import java.sql.*;
import java.util.*;


public class MViewStaffTable {
    public List<MStaff> getAllStaffDetails() {
        
        //List to hold MStaff objects
        List<MStaff> staffList = new ArrayList<>();  
        
        try {
            //Establish the database connection
            Statement st = DBConnection.createDBConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM staff");

            //The result set will add each row as an MStaff object
            while (rs.next()) {
                MStaff staff = new MStaff(
                    rs.getInt("staff_id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("address"),
                    rs.getString("phone"),
                    rs.getString("job_position"),
                    rs.getInt("monthly_salary"),
                    rs.getString("username"),
                    rs.getString("password")
                );
                
                //This adds the staff object to the staffList
                staffList.add(staff);  
            }
            
            rs.close();
            st.close();
            
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
        return staffList; 
    }
}
