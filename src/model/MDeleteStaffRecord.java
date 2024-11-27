package model;
import java.sql.*;

public class MDeleteStaffRecord {
    public int deleteStaffById(int staffId) {
        int rowCount = 0;
        try {
            // Create the database connection and statement
            Statement st = DBConnection.createDBConnection().createStatement();

            // Construct the DELETE SQL query
            String query = "DELETE FROM staff WHERE staff_id = " + staffId;

            // Execute the delete query
            rowCount = st.executeUpdate(query);

            // Log the number of records deleted
            if (rowCount > 0) {
                System.out.println("Number of records deleted: " + rowCount);
            }

        } catch (SQLException e) {
            System.err.println("Database Error: " + e.getMessage());
        }
        return rowCount;
    }
}
