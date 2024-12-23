
package controller;

import model.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CViewStaffTable {
    private final MViewStaffTable staffModel;

    public CViewStaffTable() {
        this.staffModel = new MViewStaffTable();
    }

    public DefaultTableModel getStaffTableModel() {
        List<MStaff> staffList = staffModel.getAllStaffDetails();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Staff ID");
        model.addColumn("First Name");
        model.addColumn("Last Name");
        model.addColumn("Address");
        model.addColumn("Phone");
        model.addColumn("Job Position");
        model.addColumn("Monthly Salary");
        model.addColumn("Username");
        model.addColumn("Password");

        for (MStaff staff : staffList) {
            model.addRow(new Object[]{
                staff.getStaffId(),
                staff.getFirstName(),
                staff.getLastName(),
                staff.getAddress(),
                staff.getPhone(),
                staff.getJobPosition(),
                staff.getMonthlySalary(),
                staff.getUsername(),
                staff.getPassword()
            });
        }

        return model;
    }
}
