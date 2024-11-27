package model;
import java.sql.*;

public class MAddAssignedTask {
    public int assignTask(int staffId, String taskDescription) {
        int rowCount = 0;
        try {
            // Create connection and statement
            Statement st = DBConnection.createDBConnection().createStatement();

            // Insert into the database
            rowCount = st.executeUpdate("INSERT INTO assignedtasks(staff_id, task_description, task_status)" +
                    " VALUES ('"+staffId+"', '"+taskDescription+"', 'Pending')");
            if (rowCount > 0) {
                System.out.println("Task assigned successfully. Rows affected: " + rowCount);
            }
        } catch (SQLException e) {
            System.err.println("Database Error: " + e.getMessage());
        }
        return rowCount;
    }
}
