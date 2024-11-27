package controller;
import model.*;

public class CUpdateStaffRecord {
   private final MUpdateStaffRecord model;

    public CUpdateStaffRecord() {
        model = new MUpdateStaffRecord();
    }

    public int updateStaffById(int staffId, String firstName, String lastName, String address, String phone, String jobPosition, double monthlySalary, String username, String password) {
        return model.updateStaffById(staffId, firstName, lastName, address, phone, jobPosition, monthlySalary, username, password);
    } 
}
