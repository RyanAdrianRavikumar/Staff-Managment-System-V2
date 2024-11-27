package model;
import java.sql.*;

public class MUpdateStaffRecord {
    public int updateStaffById(int staffId, String firstName, String lastName, String address, String phone, String jobPosition, double monthlySalary, String username, String password) {
        int rowCount = 0;

        try {
            Statement st = DBConnection.createDBConnection().createStatement();

            //Sql query to be executed 
            String sql = "UPDATE staff SET " +
                "first_name = '"+firstName+"', " +
                "last_name = '"+lastName+"', " +
                "address = '"+address+"', " +
                "phone = '"+phone+"', " +
                "job_position = '"+jobPosition+"', " +
                "monthly_salary = '"+monthlySalary+"', " +
                "username = '"+username+"', " +
                "password = '"+password+"' " +
                "WHERE staff_id = '"+staffId+"'";

            // Execute the update query
            rowCount = st.executeUpdate(sql);

            // Log the number of records updated
            if (rowCount > 0) {
                System.out.println("Number of records updated: " + rowCount);
            }

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
        return rowCount;
    }
}
