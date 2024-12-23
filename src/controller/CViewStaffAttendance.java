package controller;

import model.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class CViewStaffAttendance {
    private final MViewStaffAttendance viewAttendance;

    public CViewStaffAttendance() {
        this.viewAttendance = new MViewStaffAttendance();
    }

    public DefaultTableModel getAttendanceTableModel() {
        List<MStaffAttendance> attendanceList = viewAttendance.getAttendanceDetails();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Attendance ID");
        model.addColumn("Staff Name");
        model.addColumn("Checkin Time");
        model.addColumn("Checkout Time");
        model.addColumn("Total Hours Worked");
        model.addColumn("Overtime Hours");
        model.addColumn("Date");

        for (MStaffAttendance attendance : attendanceList) {
            model.addRow(new Object[]{
                attendance.getAttendanceId(),
                attendance.getStaffName(),
                attendance.getCheckinTime(),
                attendance.getCheckoutTime(),
                attendance.getTotalHoursWorked(),
                attendance.getOvertimeHours(),
                attendance.getDate()
            });
        }

        return model;
    }
}
