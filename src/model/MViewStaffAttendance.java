package model;
import java.util.*;
import java.sql.*;

public class MViewStaffAttendance {
      public List<MStaffAttendance> getAttendanceDetails() {

        // List to hold MStaffAttendance objects
        List<MStaffAttendance> attendanceList = new ArrayList<>();

        try {
            //Establish the database connection
            Statement st = DBConnection.createDBConnection().createStatement();

            /*
            Create the sql query:
            TIMESTAMPDIFF is for getting hour difference between checkin and checkout times. 
            GREATEST is used to prevent minus values when calculating overtimes hours. 
            */
            ResultSet rs = st.executeQuery("""
                SELECT a.attendance_id, s.first_name, s.last_name, a.checkin_time, a.checkout_time,
                TIMESTAMPDIFF(HOUR, a.checkin_time, a.checkout_time) AS total_hours_worked, 
                GREATEST(0, TIMESTAMPDIFF(HOUR, a.checkin_time, a.checkout_time) - 8) AS overtime_hours, 
                a.date 
                FROM attendance a 
                JOIN staff s ON a.staff_id = s.staff_id
            """);

            // Iterate through the result set and populate MStaffAttendance objects
            while (rs.next()) {
                MStaffAttendance attendance = new MStaffAttendance(
                    rs.getInt("attendance_id"),
                    rs.getString("first_name") + " " + rs.getString("last_name"),
                    rs.getTimestamp("checkin_time").toLocalDateTime().toString(),
                    rs.getTimestamp("checkout_time").toLocalDateTime().toString(),
                    rs.getInt("total_hours_worked"),
                    rs.getInt("overtime_hours"),
                    rs.getDate("date").toLocalDate().toString()
                );

                // Add the object to the attendance list
                attendanceList.add(attendance);
            }

            // Close resources
            rs.close();
            st.close();

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }

        return attendanceList;
    }
}
