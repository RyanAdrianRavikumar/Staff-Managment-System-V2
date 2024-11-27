package model;
import java.sql.*;
import java.util.*;

public class MViewAssignedTasks {
   public List<MAssignedTasks> getAllAssignedTasks(){
       
       //List to hold MStaff objects
        List<MAssignedTasks> taskList = new ArrayList<>();
        try {
            //Establish the database connection
            Statement st = DBConnection.createDBConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM assignedtasks");

            //The result set will add each row as an MAssignedTasks object
            while (rs.next()){
                MAssignedTasks task = new MAssignedTasks(
                    rs.getInt("task_id"),
                    rs.getInt("staff_id"),
                    rs.getString("task_description"),
                    rs.getString("task_status")
                );
                taskList.add(task);
            }
        } catch (SQLException e) {
            System.err.println("Database Error: " + e.getMessage());
        }
        return taskList; // Return list of AssignedTask objects
    }
}
